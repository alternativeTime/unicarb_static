package models;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.ContainerFactory;
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

	@OneToMany
	public List<Translation> translation;

	@OneToMany
	public List<Strproteintax> strproteintax;

	@OneToMany
	public List<Strproteintaxbiolsource> strproteintaxbiolsource;

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
		List<String> components = new ArrayList<String>();
		ArrayList<Object[]> ob = new ArrayList<>();
		String html = "";
		
		JSONParser parser = new JSONParser();

		try {

			Object obj = parser.parse(new FileReader("/tmp/json/" + iupac + ".json"));

			JSONObject jsonObject = (JSONObject) obj;

			String name = (String) jsonObject.get("str");

			JSONArray msg = (JSONArray) jsonObject.get("parts");

			for(Object c : msg){

				JSONParser parserString = new JSONParser();
				ContainerFactory containerFactory = new ContainerFactory(){
					public List creatArrayContainer() {
						return new LinkedList();
					}

					public Map createObjectContainer() {
						return new LinkedHashMap();
					}

				};
				
				try{
				    Map json = (Map)parser.parse(c.toString(), 	containerFactory);
				    Iterator iter = json.entrySet().iterator();
				    System.out.println("==iterate result==");
				  
				   
				    while(iter.hasNext()){
				     
				      Map.Entry entry = (Map.Entry)iter.next();
				      System.out.println(entry.getKey() + "=>" + entry.getValue());
				     
				      if(entry.getKey().equals("enz")){
				    	  String searchEnz = entry.getValue().toString();
				    	  long lEnz = Long.parseLong(searchEnz);
				    	  
				    	  Enzyme enzyme = Enzyme.find.byId( lEnz );
				    	  html += "<tr><td>" +enzyme.name + "</td><td>" + enzyme.jcggdb + "</td><td>" + enzyme.kegg + "</td><td>" + enzyme.goterm + "</td>";
				      }
				      else{
				           html  += "<td>" + entry.getValue().toString() + "</td>";
				      }
				    }
				   
				  
				   // System.out.println("==toJSONString()==");
				   // System.out.println(JSONValue.toJSONString(json));
				     
				 	html  += "</tr>";
				 	Logger.info("html " + html);
				  }
				  catch(ParseException pe){
				    System.out.println(pe);
				  }

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}

		
		return html;
	}



}

