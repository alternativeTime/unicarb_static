package controllers;

import java.util.*;

import play.mvc.*;
import play.*;
import views.html.*;
import models.*;
import play.cache.Cache;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

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
import org.eurocarbdb.action.core.*;
import org.eurocarbdb.dataaccess.core.seq.*;
import org.eurocarbdb.sugar.Sugar;
import org.eurocarbdb.sugar.SugarSequence;
import org.eurocarbdb.application.glycanbuilder.Glycan;
import static org.eurocarbdb.dataaccess.core.seq.SubstructureQuery.Option.Must_Include_Reducing_Terminus;
import static org.eurocarbdb.dataaccess.core.seq.SubstructureQuery.Option.Must_Include_All_Non_Reducing_Terminii;

import org.apache.commons.io.FileUtils;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

// import org.eurocarbdb.dataaccess.core.seq.SavedGlycanSubstructureSearch;


import com.google.common.base.Charsets;
import com.google.common.io.Files;

public class Search extends Controller {


	public static Result saySearch(String structure) throws IOException{   // SugarImporterException, GlycoVisitorException,  ParserConfigurationException, SAXException {


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
			text= text.replaceAll(" ", "+");
			Logger.info("&&&&&&&&&&&&&&&&&&&&&&&&"); 
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

	public static Result builderDigestSearch(String str) throws IOException {

		Map<String, String[]> id = request().queryString();
		String urlcall = "";
		Iterator iterator=id.entrySet().iterator();
		while(iterator.hasNext()){
			Map.Entry mapEntry=(Map.Entry)iterator.next();
			urlcall = mapEntry.getKey().toString();
		}

		File file = new File("/tmp/testdigest.txt");
		FileUtils.writeStringToFile(file, urlcall.toString() );

		String urltest = urlcall.toString();

		Logger.info("####################### " + urltest  );		
		String text = "";
		try{
			text = Files.toString(new File("/tmp/testdigest.txt"), Charsets.UTF_8);
			text= text.replaceAll(" ", "+");
			System.out.println("digest structure: " + text);

			//urlencod string and send to render
			str = URLEncoder.encode(text);

		} catch (IOException e) {
			e.printStackTrace();
		}

		//add string to session
		/*session().clear();
		String uuid= java.util.UUID.randomUUID().toString();
		Cache.set(uuid,str);
		session("uuid",uuid); */
		Cache.set("digestStr", text);

		//trying to improve and clean up url requests

		return ok(glycodigestBuilder.render(text));

	}

	public static Result glycodigesttestBuilder(String str, String s) {
		Map<String, String> strMap = new HashMap<String, String>();
		String enz = request().queryString().get("digest").toString() ;
		String uri =  request().uri();
		String uriPass = request().getQueryString("digest");

		Set<Map.Entry<String,String[]>> entries = request().queryString().entrySet();
		for (Map.Entry<String,String[]> entry : entries) {
			final String key = entry.getKey();
			final String value = Arrays.toString(entry.getValue());
			Logger.debug(key + " " + value);
		}	

		ct ct = new ct();

		//replace str with value from session see above
		/* String uuid = session("uuid").toString();
		String t = Cache.get(uuid).toString(); */
		//Logger.info(Cache.get("digestStr") );

		try {
			strMap = ct.digest(Cache.get("digestStr").toString() , URLDecoder.decode(uriPass));

		} catch (IOException e) {
			e.printStackTrace();
			return ok(builderDigest.render());
		}

		return ok(glycodigesttestBuilder.render(strMap, Cache.get("digestStr").toString() ));
	}

	public static Result SubstructureSearch() {
		SubstructureQuery query = null;
		//Structure s = Structure.find.byId(1);
		
		Long id = 2L;
		Translation t = Translation.find.byId(id);

		SugarSequence seq = new SugarSequence( t.ct );
		query = new SubstructureQuery( seq.getSugar() );

		String q = query.getQueryString();
		q = q.replaceAll("and.*r\\d.anomer =.*(a||b)", "" );
		Logger.info("this is the query string " + q);
		//if ( submitAction.equals("Search core") )
		 query.setOption( Must_Include_Reducing_Terminus );

		//if ( submitAction.equals("Search terminal") )
		query.setOption( Must_Include_All_Non_Reducing_Terminii );

		//query.execute();

		return ok();

	}


}

