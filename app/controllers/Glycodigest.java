package controllers;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.Set;
import java.util.Iterator;

import org.apache.commons.lang.StringUtils;

import play.mvc.*;
import play.data.*;
import play.*;
import play.cache.*;
import views.html.*;
import models.*;
import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import static play.data.Form.*;
import play.libs.Json;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import com.avaje.ebean.*; //dont think this should be here due to SqlRow



public class Glycodigest extends Controller {

	public static Result glycodigestHome() {
		return ok( glycodigestHome.render() );
	}

	public static Result glycodigest(Long id) {
		String enzymes = "";
		Map<String, String> hashMap = new HashMap<String, String>();
	
		Translation translation = new Translation();
		Translation ctt = translation.translationCT(id);

		cttest ctt2 = new cttest();
		//ctt = ct.find.byId(id);
		
		try{
			hashMap = ctt2.digest(ctt.ct, enzymes);
		}
		catch(IOException e){
			e.printStackTrace();
			
		}
		
		return ok( 
				glycodigest.render(hashMap, id, ctt.ct)
				); 
	};
	
	public static Result glycodigesttest(Long id, String s){
		Map<String, String> hashMap = new HashMap<String, String>();
		
		String x = request().queryString().get("digest").toString() ;
		String uri =  request().uri();


	Set<Map.Entry<String,String[]>> entries = request().queryString().entrySet();
        for (Map.Entry<String,String[]> entry : entries) {
	        final String key = entry.getKey();
                final String value = Arrays.toString(entry.getValue());
        Logger.debug(key + " " + value);
						            }
	//Logger.debug(request().getQueryString("digest"));
	String test = request().getQueryString("digest");

		Logger.info("---------#  " + request().queryString().toString() );
		
		Translation translation = new Translation();
		Translation ctt = translation.translationCT(id);
		cttest ctt2 = new cttest();

		try {
			hashMap = ctt2.digest(ctt.ct, test);
		}
		catch(IOException e) {
			e.printStackTrace();
		}

		//check contents of hashmap
	
		for (Map.Entry<String, String> entry : hashMap.entrySet()) {
		    //System.out.println("contents of digesttes map " + entry.getKey()+" : "+entry.getValue());
		    String value = entry.getValue().toString();
		    if(value.startsWith("RES")){
			    Logger.info("need to use this string " + java.net.URLDecoder.decode(value));
			    Long idCheck = Translation.checkDigestStructure(java.net.URLDecoder.decode(value));
			    Logger.info("hopefully: " + idCheck);
		    } 
		}	    
		
		//

		return ok( 
				glycodigesttest.render(hashMap, id, ctt.ct)
				); 
	}
	@BodyParser.Of(BodyParser.Json.class)
	public static Result glycodigestStructureDB(String ct){

		Long id = -1L;
		id = Translation.checkDigestStructure(ct);
			
		JsonNode json = request().body().asJson();
		  ObjectNode result = Json.newObject();
		  if(id > 0 ) {
			  result.put("status", "OK");
		 	  result.put("message", id );
		  } else {
			  result.put("status", "Bad");
		  }
		  Logger.info("created json " + result);
		  return ok(result);
	}
}
