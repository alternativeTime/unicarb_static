package controllers;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.Set;

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

import com.avaje.ebean.*; //dont think this should be here due to SqlRow



public class Glycodigest extends Controller {
	
	public static Result glycodigest(Long id) {
		String enzymes = "";
		Map<String, String> hashMap = new HashMap<String, String>();

		
		Logger.info("URL STUFF " + id );
	
		Translation translation = new Translation();
		Translation ctt = translation.translationCT(id);

		ct ctt2 = new ct();
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
	Logger.debug(request().getQueryString("digest"));
	String test = request().getQueryString("digest");
	Logger.info("come one " + test);


		Logger.info("-------> ");
		Logger.info("---------hdhhdhd#################################  " + request().queryString().toString() );
		
		/*for(String xx : x){
			Logger.info("djdjdjdjjd " + xx.toString());
			
		}*/
	
		Translation translation = new Translation();
		Translation ctt = translation.translationCT(id);
		ct ctt2 = new ct();

		try {
			hashMap = ctt2.digest(ctt.ct, test);
		}
		catch(IOException e) {
			e.printStackTrace();
		}

		/*ct ctt = new ct();
		ctt = ct.find.byId(id);
		
		try{
			hashMap = ctt.digest(ctt.ct, x);
		}
		catch(IOException e){
			e.printStackTrace();
			
		}*/
		//Lorequest().uri();
		
		return ok( 
				glycodigesttest.render(hashMap, id, ctt.ct)
				); 
	}

}
