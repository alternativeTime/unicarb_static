package models;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

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
	
	public Map<String, String> digest(String ct, String enzymesInput) throws IOException{
		
		ArrayList<String> enz = new ArrayList<String>();
		String[] x = null;
		List<String> list = null;	
		if(enzymesInput != null){
			Logger.info("some odd " + enzymesInput); // + Arrays.toString(enzymesInput) );
			String [] strings = enzymesInput.split(",");
			list = Arrays.asList(strings);

		} else { 
			enz.add("ABS");
		}
		enz.add("ABS");
		//
		for(String l : list){
			enz.add(l);
		}
		
		//EnzymeMapping e = new EnzymeMapping();
		//e.createDic_link();
		//e.createDic_res();
		
		Sugar s = new Sugar(ct, enz, false, false);
		
		//s.getGlycanInput();
		//SugarTreatment d = new SugarTreatment(ct, e, enz, null, false);
		Logger.info("output enz treatment" + s.glycanTreatment());
			
		String[] enzymes = StringUtils.substringsBetween(s.glycanTreatment(), "enzyme", "RES");

		/*String[] enzymes2 = StringUtils.substringsBetween(s.glycanTreatment(), "enzyme : ", "enzyme :");

		for(String xxx : enzymes2) {
			Logger.info("fingers crossed\n" + xxx);
		}*/
	
		ArrayList<String> out = s.getGlycanOutput();
		
		String[] enz2 = null;
		List enzList = new ArrayList<String>();
		for(String o : out){
			o.toString();
			enz2 = o.split("enzyme \\:");
			Logger.info("split " + URLEncoder.encode(enz2[0]) );
			enzList.add(URLEncoder.encode(enz2[0]));

		}
		Logger.info("size is " + enzList.size() );
		
		Map<String, String> hashMap= 	new HashMap<String, String>();
		
		int count = 1;
		for (String t : enzymes){
			hashMap.put(t, enzList.get(count).toString());
			count++;
		}	
		
		/*for (Map.Entry<String,String> entry : hashMap.entrySet()) {
			  String key = entry.getKey();
			  String value = entry.getValue();
		}*/
		
		return hashMap;
	}
	
	
	public List<String> digestCTResults(String ct, String enzymesInput) throws IOException{
		
		ArrayList<String> enz = new ArrayList<String>();
		String[] x = null;
		List<String> list = null;	
		if(enzymesInput != null){
			Logger.info("some odd " + enzymesInput); // + Arrays.toString(enzymesInput) );
			String [] strings = enzymesInput.split(",");
			list = Arrays.asList(strings);

		} else { 
			enz.add("ABS");
		}
		enz.add("ABS");
		//
		for(String l : list){
			enz.add(l);
		}
		
		//EnzymeMapping e = new EnzymeMapping();
		//e.createDic_link();
		//e.createDic_res();
		
		Sugar s = new Sugar(ct, enz, false, false);
		
		String[] enzymes2 = StringUtils.substringsBetween(s.glycanTreatment(), "enzyme", "RES");
		//String[] enzymes2 = StringUtils.substringsBetween(s.glycanTreatment(), "enzyme : ", "enzyme :");
		ArrayList<String> ar = new ArrayList<String>();
		for(String xxx : enzymes2) {
			//String x = xxx.replace("ABS||BTG","");
			ar.add( xxx.replace("ABS","").trim() );
			//Logger.info("fingers crossed\n" + xxx.replace("ABS",""));
		}
		
		ArrayList<String> out = s.getGlycanOutput();
		
		String[] enz2 = null;
		List enzList = new ArrayList<String>();
		for(String o : out){
			o.toString();
			//enz2 = o.split("enzyme \\:");
			Logger.info("split check " + o );//+ URLEncoder.encode(enz2[1]) );
			enzList.add(o);

		}
		
		Logger.info("size check " + ar.size());
		return enzList;
	}
	

}
