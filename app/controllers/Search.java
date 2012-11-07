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
		
		Map<String, String[]> id = request().queryString();
		String urlcall = "";
		Iterator iterator=id.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry mapEntry=(Map.Entry)iterator.next();
            System.out.println("The key is: "+mapEntry.getKey()
            		+ ",value is :"+mapEntry.getValue());
            urlcall = mapEntry.getKey().toString();
       
        }
	
        
		System.out.println("call --: " + urlcall);
	   String urltest = urlcall.toString();
		System.out.println("\n size of: " + urltest.length() );
		
		File file = new File("/tmp/test.txt");
		FileUtils.writeStringToFile(file, urltest);
		
		
		
		/*
		String fromurl = structure;
		String decode = URLDecoder.decode(fromurl, "UTF-8");
		System.out.println("from url: " + fromurl);
		*/
		try {
		String text = Files.toString(new File("/tmp/test.txt"), Charsets.UTF_8);
		System.out.println("test: " + text);
		 text= text.replaceAll(" ", "+");
		 System.out.println("test: " + text);
		 
		 
		translation = Translation.searchTranslation(text);
			
		for (Translation trans : translation) {
			Long gsId = trans.gs;
			findStructure = Structure.find.byId(gsId);
			
		}
		}catch (IOException e) {
			
		}
		 
		return ok (saySearch.render(translation, findStructure) );
	}
}

		/*SugarImporterGlycoCTCondensed cond = new SugarImporterGlycoCTCondensed();
	    cond.parse(text);
	    
	    org.eurocarbdb.MolecularFramework.sugar.Sugar t_objSugar = cond.parse(text);
	    
	    SugarExporterGlycoCT t_objExporter = new SugarExporterGlycoCT();
	    t_objExporter.start(t_objSugar);
	    System.out.print("here " + t_objExporter.toString());
	    
	    //org.eurocarbdb.dataaccess.core.seq.SubstructureQuery(t_objSugar);
	    SugarSequence sug = new SugarSequence(text);
	    System.out.println("\n this is the translation " + sug.toString() );
	    
	    try {
	    	//org.eurocarbdb.dataaccess.core.GlycanSequence gs = new org.eurocarbdb.dataaccess.core.GlycanSequence();
	    	//gs = null;
	    	//GlycanSequence.lookupByExactSequence(sug);
	    }catch (Throwable t) {
	    	Logger.info("Failure during static initialization", t);
	      }
		
		} catch (IOException e) {
			
		}
		try{
			String result = URLDecoder.decode(structure, "UTF-8");
			System.out.println("string test; " + result);
		} catch (UnsupportedEncodingException e) {
	        e.printStackTrace();
	    }
		
			Search.searchStructure();
		//return ok (saysearch.render() );
		return ok ( saySearch.render() );
	    }
	
	@SuppressWarnings("static-access")
	public static void searchStructure() {
		String ct = "RES 1b:b-dglc-HEX-1:5 2s:n-acetyl 3b:b-dglc-HEX-1:5 4s:n-acetyl 5b:b-dman-HEX-1:5 6b:a-dman-HEX-1:5 7b:a-dman-HEX-1:5 8b:a-dman-HEX-1:5 9b:a-dman-HEX-1:5 10b:a-lgal-HEX-1:5|6:d LIN 1:1d(2+1)2n 2:1o(4+1)3d 3:3d(2+1)4n 4:3o(4+1)5d 5:5o(3+1)6d 6:5o(6+1)7d 7:7o(3+1)8d 8:7o(6+1)9d 9:1o(6+1)10d";
		
		
		SugarImporter t_objParser = new SugarImporter().toString(ct);
		
		
		
		
		String sequenceGWS = "redEnd--?b1D-GlcNAc,p(--4b1D-GlcNAc,p--4b1D-Man,p(--3a1D-Man,p)--6a1D-Man,p(--3a1D-Man,p)--6a1D-Man,p)--6a1L-Fuc,p$MONO,perMe,Na,0,redEnd";
		Glycan glycan = null;
		
		Residue r = new Residue();
         ResidueDictionary dict = null;
         ResidueType residueType = new ResidueType();
         residueType = dict.findResidueType("redEnd");
         r.isReducingEnd();
         
         residueType = residueType.createFreeReducingEnd();
         residueType.canBeReducingEnd();
         residueType.isReducingEndMarker();
		
		Glycan s = Glycan.fromString(sequenceGWS);
		 
	
} 
		return ok (saySearch.render(translation) ); }
}*/
