package models;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.*;

import play.Logger;
import play.db.ebean.*;
import play.db.ebean.Model.Finder;
import play.data.format.*;
import play.data.validation.*;
import play.mvc.Content;

import org.apache.commons.lang.StringUtils;

import com.avaje.ebean.*;

import stage.main.*;
import stage.sugargui.*;


/**
 * Structure entity managed by Ebean
 */
@SuppressWarnings("serial")
@Entity 
@Table(schema="public", name="ct")

public class ct {
	
	@Id
	public Long id;
	
	public String ct;
	
	public static Finder<Long,ct> find = new Finder<Long,ct>(Long.class, ct.class);
	
	
	public Map<String, String> digest(String ct) throws IOException{
		
		//Logger.info("string ct is " + ct);
		
		ArrayList<String> enz = new ArrayList<String>();
		enz.add("ABS");
		enz.add("BTG");
		
		//EnzymeMapping e = new EnzymeMapping();
		//e.createDic_link();
		//e.createDic_res();
		
		Sugar s = new Sugar(ct, enz, false, false);
		
		//s.getGlycanInput();
		//SugarTreatment d = new SugarTreatment(ct, e, enz, null, false);
		//Logger.info("output enz treatment" + s.glycanTreatment());
		
		
		String[] enzymes = StringUtils.substringsBetween(s.glycanTreatment(), "enzyme", "RES");
	
		for (String t : enzymes) {
			System.out.println("t:" + t); // good
		}
		
	
		ArrayList<String> out = s.getGlycanOutput();
		
		//Logger.info("size is " + out.size() );
		String[] enz2 = null;
		List crap = new ArrayList<String>();
		for(String o : out){
			o.toString();
			enz2 = o.split("enzyme \\:");
			Logger.info("split " + URLEncoder.encode(enz2[0]) );
			crap.add(URLEncoder.encode(enz2[0]));

		}
		Logger.info("size is " + crap.size() );
		//String[][] product = new String[enzymes.length][enz2.length];
		
		Map<String, String> hashMap= 	new HashMap<String, String>();
		
		int count = 1;
		for (String t : enzymes){
			hashMap.put(t, crap.get(count).toString());
			count++;
		}
		
		for (Map.Entry<String,String> entry : hashMap.entrySet()) {
			  String key = entry.getKey();
			  String value = entry.getValue();
			  //Logger.info("key: " + key + " value: " + value);
			  // do stuff
			}
		
		
		
		/*String treatment = s.glycanTreatment();
		
		
		for(String o : out){
			//Logger.info("out " + o.toString());
			Logger.info("encode string " +  URLEncoder.encode(o.toString() ));
		}
		*/
		//Logger.info("treatment " + treatment);
		
		
		
		return hashMap;
	}

}
