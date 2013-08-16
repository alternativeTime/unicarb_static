package models;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import com.google.gson.*;
import com.google.gson.stream.JsonReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javax.persistence.*;

import play.Logger;
import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import play.mvc.Content;

import com.avaje.ebean.*;

/**
 * Structure entity managed by Ebean
 */
@SuppressWarnings("serial")
@Entity 
@Table(schema="public", name="structure")
public class Structure extends Model {

	@Id
	public Long id;

	public String compositionId;
	public String glycanst;
	public String aminolink;
	public String core;
	public String type;
	public String antigenic;
	public String lectin;
	public String endoglycosidase;
	public String link;	 

	@OneToMany
	public List<Streference> references;

	@OneToMany
	public List<Stproteins> stproteins; 

	@OneToMany
	public List<Strtaxonomy> strtaxonomy;

	@OneToMany
	public List<Stsource> stsource;

	@OneToMany
	public List<Pubchem> pubchem;

	@OneToMany
	public List<Composition> strcomposition;
	
	@OneToMany
	public List<Structurecomp> structurecomp;

	@OneToMany
	public List<Images> images;


	public Structure(String glycanst, String aminolink, String core, String type, String antigenic, String lectin, String endoglycosidase, String link, String compositionId) {
		this.compositionId = compositionId;
		this.glycanst = glycanst;
		this.aminolink = aminolink;
		this.core = core;
		this.type = type;
		this.antigenic = antigenic;
		this.lectin = lectin;
		this.endoglycosidase = endoglycosidase;
		this.link = link; 
	}

	public static List<Structure> findStructureRef(Long id) {
		return find.fetch("references").fetch("references.reference").fetch("stproteins").fetch("stproteins.proteins").fetch("strtaxonomy").fetch("stsource")
				.where()
				.eq("structure_id", id)
				.orderBy("references.reference.year desc")
				.findList();
	}

	/**
	 * Generic query helper for entity Reference with id Long
	 */
	public static Finder<Long,Structure> find = new Finder<Long,Structure>(Long.class, Structure.class);

	public static String buildComposition(String[] input) {
		String build = "";
		for(String composition : input) {
			if (composition.length() < 1 ) {
				build += "0" ;
			}
			build += composition;	
		}

		return build;   
	}

	public static List<Structure> findComposition(String composition) {
		//return find.where().ilike("composition_id", "%" + composition).findList();
		return find.where().ilike("composition_id",  composition).findList();
	}

	public static Content render(Structure strDisplay) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static String getJSON(Long id) throws IOException {
		
		Structure structure = Structure.find.byId(id);
		String iupac = structure.glycanst;
		Logger.info("str is " + iupac);
		
		JSONParser parser = new JSONParser();
		 
		try {
	 
			Object obj = parser.parse(new FileReader("/tmp/json/" + iupac + ".json"));
	 
			JSONObject jsonObject = (JSONObject) obj;
	 
			String name = (String) jsonObject.get("str");
			System.out.println(name);
	 
			//long age = (Long) jsonObject.get("age");
			//System.out.println(age);
	 
			// loop array
			JSONArray msg = (JSONArray) jsonObject.get("parts");
			Iterator<String> iterator = msg.iterator();
			
			for(Object c : msg){
				System.out.println( c.toString() );
			}
				 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
			    

			    //JSONArray cars = (JSONArray) jsonObject.get("cars");

			   /* for (Object c : cars)
			    {
			      System.out.println(c+"");
			    }*/
			 // }
			
			/*JsonReader reader = new JsonReader(new FileReader("/tmp/json/" + iupac + ".json"));
		
		
		
		reader.beginObject();
		while (reader.hasNext()){
			//Logger.info("files stuff " + reader.toString() );
			//String name = reader.nextName();
			
			//if (name.equals("parts")) {
			//	Logger.info("print here");
			//}
			
		}
		 } catch (IOException e) {
				e.printStackTrace();
			     } catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		String test = "test";
		return test;
	}
	


}

