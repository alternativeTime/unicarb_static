package models;

import java.util.ArrayList;

import javax.persistence.*;

import play.Logger;
import play.db.ebean.*;
import play.db.ebean.Model.Finder;
import play.data.format.*;
import play.data.validation.*;
import play.mvc.Content;

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
	
	
	public String id;
	
	public String ct;
	
	//public static Finder<Long,ct> find = new Finder<Long,ct>(Long.class, ct.class);
	
	@SuppressWarnings("null")
	public String digest(String ct){
		
		ArrayList<String> enz = new ArrayList<String>();
		enz.add("BTG");
		
		EnzymeMapping e = new EnzymeMapping();
		e.createDic_link();
		e.createDic_res();
		
		Sugar s = new Sugar(ct, enz, false, false);
		
		
		//SugarTreatment d = new SugarTreatment(ct, e, enz, null, false);
		Logger.info("digest tine" + s.getGlycanOutput().toString() );
		
		
		
		return ct;
	}

}
