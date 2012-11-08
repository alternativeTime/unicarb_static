package controllers;

import java.util.*;

import play.mvc.*;
import play.data.*;
import play.*;

import views.html.*;

import models.*;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import javax.xml.parsers.ParserConfigurationException;

import org.hibernate.criterion.Order;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Subqueries;
import org.xml.sax.SAXException;

import org.eurocarbdb.MolecularFramework.io.SugarImporterException;
import org.eurocarbdb.MolecularFramework.io.GlycoCT.SugarExporterGlycoCT;
import org.eurocarbdb.MolecularFramework.io.GlycoCT.SugarImporterGlycoCTCondensed;
import org.eurocarbdb.MolecularFramework.util.visitor.GlycoVisitorException;
import org.eurocarbdb.action.core.SearchUnicarbGlycanSequence;

//  eurocarb imports
import org.eurocarbdb.dataaccess.core.*;
import org.eurocarbdb.dataaccess.core.seq.*;
import org.eurocarbdb.action.EurocarbAction;
import org.eurocarbdb.action.BrowseAction;
import org.eurocarbdb.dataaccess.EntityManager;
import org.eurocarbdb.dataaccess.HibernateEntityManager;
import org.eurocarbdb.dataaccess.indexes.*;

import org.eurocarbdb.sugar.Sugar;
import org.eurocarbdb.sugar.SugarSequence;

import org.eurocarbdb.application.glycanbuilder.*;

import org.eurocarbdb.dataaccess.SavedGlycanSequenceSearch;
import org.apache.commons.io.FileUtils;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

// import org.eurocarbdb.dataaccess.core.seq.SavedGlycanSubstructureSearch;


import com.google.common.base.Charsets;
import com.google.common.io.Files;

public class Search extends Controller {

	
	public static Result saySearch(String structure) throws SugarImporterException, GlycoVisitorException, IOException, ParserConfigurationException, SAXException {
		
	
		List<Translation> translation = null;
		Structure findStructure = null;
		List<Structure> strDisplay = null;
		List<Strtaxonomy> stToTax = null;
		HashSet taxNamesUnique = new HashSet();
		HashSet taxIdsUnique = new HashSet();
		HashSet taxDivsUnique = new HashSet();
		ArrayList taxDivs = new ArrayList();
		
		Map<String, String[]> id = request().queryString();
		String urlcall = "";
		Iterator iterator=id.entrySet().iterator();
        	while(iterator.hasNext()){
            	Map.Entry mapEntry=(Map.Entry)iterator.next();
            	urlcall = mapEntry.getKey().toString();
        	}
	
	   	String urltest = urlcall.toString();
		
		File file = new File("/tmp/test.txt");
		FileUtils.writeStringToFile(file, urltest);
		
		try {
		String text = Files.toString(new File("/tmp/test.txt"), Charsets.UTF_8);
		System.out.println("test: " + text);
		 text= text.replaceAll(" ", "+");
		 System.out.println("test: " + text);
		 
		 
		translation = Translation.searchTranslation(text);
			
		for (Translation trans : translation) {
			Long gsId = trans.gs;
			findStructure = Structure.find.byId(gsId);
                        strDisplay = Structure.findStructureRef(gsId);
			for (Structure entries : strDisplay) {
				stToTax = entries.strtaxonomy;
				if (!stToTax.isEmpty()){
                        	for (Strtaxonomy stTaxEntry : stToTax){
                                	String taxName = stTaxEntry.taxonomy.species;
                                	Long taxId = stTaxEntry.taxonomy.id;
                                	taxNamesUnique.add(taxName);
                                	taxIdsUnique.add(taxId);
                                	String divtax = taxName;
                                	taxDivsUnique.add(divtax);
                        	}
				taxDivs.addAll(taxDivsUnique);

				}	
				
			}
		}
		}catch (IOException e) {
			
		}
		 
		return ok (saySearch.render(translation, strDisplay, taxDivs, findStructure));
	}
}

