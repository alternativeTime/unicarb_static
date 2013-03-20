package controllers;

import java.util.*;

import play.mvc.*;
import play.*;
import play.cache.Cache;
import play.cache.*;

import views.html.*;

import models.*;

import com.avaje.ebean.*; //dont think this should be here due to SqlRow
//import static play.libs.Json.toJson;
//import static play.libs.Json.*;
import java.net.URLDecoder;
import java.io.UnsupportedEncodingException;
import java.io.IOException;

import uk.ac.ebi.kraken.interfaces.uniprot.UniProtEntry;
import uk.ac.ebi.kraken.uuw.services.remoting.EntryRetrievalService;
import uk.ac.ebi.kraken.uuw.services.remoting.UniProtJAPI;
import uk.ac.ebi.kraken.interfaces.uniprot.*;

import uk.ac.ebi.kraken.interfaces.ProteinData;
import uk.ac.ebi.kraken.interfaces.uniprot.DatabaseCrossReference;
import uk.ac.ebi.kraken.interfaces.uniprot.ProteinDescription;
import uk.ac.ebi.kraken.interfaces.uniprot.comments.Comment;
import uk.ac.ebi.kraken.interfaces.uniprot.description.Field;
import uk.ac.ebi.kraken.interfaces.uniprot.description.FieldType;
import uk.ac.ebi.kraken.interfaces.uniprot.description.Name;
import uk.ac.ebi.kraken.interfaces.uniprot.description.Section;
import uk.ac.ebi.kraken.uuw.services.remoting.EntryIterator;
import uk.ac.ebi.kraken.uuw.services.remoting.ProteinDataQueryService;
import uk.ac.ebi.kraken.uuw.services.remoting.UniProtJAPI;
import uk.ac.ebi.kraken.uuw.services.remoting.UniProtQueryBuilder;
import uk.ac.ebi.kraken.uuw.services.remoting.AttributeIterator;
import uk.ac.ebi.kraken.uuw.services.remoting.Attribute;
import uk.ac.ebi.kraken.uuw.services.remoting.RemoteDataAccessException;


public class UniprotConnection extends Controller {

	
	public static List<String>EntryRetrievalExample(String accession){

	
	ArrayList arrayFunction = new ArrayList();
	List arrayPTM = new ArrayList();
        //Create entry retrieval service
        EntryRetrievalService entryRetrievalService = UniProtJAPI.factory.getEntryRetrievalService();

        //Retrieve UniProt entry by its accession number
	String acc = accession;
	String accessionPTMInfo = "";
	List<String> uniprotDetails = new ArrayList<String>(); 
	//UniProtEntry entry = new UniProtEntry();
        /* UniProtEntry entry = (UniProtEntry) entryRetrievalService.getUniProtEntry(acc);	
	ProteinDataQueryService queryService = UniProtJAPI.factory.getProteinDataQueryService();

                
        uk.ac.ebi.kraken.uuw.services.remoting.Query proteinQuery = UniProtQueryBuilder.buildQuery(acc);
        EntryIterator<ProteinData> entries = queryService.getEntryIterator(proteinQuery);
        System.out.println("Entries with protein name quried = " + entries.getResultSize());
	String recommendedNameDisplay;

	for (ProteinData e : entries){
			System.out.println(e);
                        for (Field field2 : e.getUniProtEntry().getProteinDescription().getRecommendedName().getFields()) {
                                if (field2.getType().getValue().equalsIgnoreCase("FULL")) {
                                        String recommendedName = field2.getValue();
                                        recommendedNameDisplay = recommendedName;
                                }
                        }


	Collection<Comment> comments = e.getUniProtEntry().getComments();

                        for (Comment com : comments){
                                String function = "FUNCTION";
                                String ptm = "PTM";

                                String uniprot = com.getCommentType().toString();
                                
                                if (uniprot.equals(function)) {

                                        arrayFunction.add(com.toString());
                                }

                                if(uniprot.equals(ptm)) {
                                        arrayFunction.add(com.toString());
					uniprotDetails.add(com.toString());
                                }
                        }
	}*/

	try {
		Object accessionPTM = UniProtJAPI.factory.getEntryRetrievalService().getUniProtAttribute(accession,  "ognl:getComments(@uk.ac.ebi.kraken.interfaces.uniprot.comments.CommentType@PTM).{value}" );
		accessionPTMInfo = accessionPTM.toString();
		accessionPTMInfo = accessionPTMInfo.replaceAll("^\\[", "");
		accessionPTMInfo = accessionPTMInfo.replaceAll("]$", "");
		uniprotDetails.add(accessionPTMInfo); 
	} catch (RemoteDataAccessException e) {
    		System.err.println("Caught IOException: " + e.getMessage());
	}
	

	return uniprotDetails;
	}
	
	
	
	public static String EntryRetrievalSequence(String accession) {

        EntryRetrievalService entryRetrievalService = UniProtJAPI.factory.getEntryRetrievalService();
	String sequenceCat = "";

	try {
        Object attribute = UniProtJAPI.factory.getEntryRetrievalService().getUniProtAttribute(accession ,  "ognl:sequence.value");

        String sequence = attribute.toString();

        String []thisCombo2 = sequence.split("(?<=\\G..........)");
        String asString = Arrays.toString(thisCombo2);
        int i = 0;
        for(String s : thisCombo2) {
                if (i == 50 ) {
                sequenceCat += s;
                //sequenceCat += "\n";
                i = 0;
                } else {
                sequenceCat += s;
                i = i + 10;
                }
        }

	} catch (RemoteDataAccessException e) {
                System.err.println("Caught IOException: " + e.getMessage());
        }


        return sequenceCat;
	}


	public static Result proteinsite() {

        String proteinName = "";
        String swissProtName = "";
	String proteinNameFull = "";
        String site = "";
        String type = "";
	String sequenceRetrieval = "";
        String protein = "";

	ArrayList<SqlRow> biolRefs  = new ArrayList<SqlRow>();
        List<StructureToSiteDefined> definedStructures = null;
        List<GeneralSites> generalStructures = null;
        ArrayList<Long> structuresShow = new ArrayList();
        List<SqlRow> listSql = null;
        ArrayList<SqlRow> listSqlArray = new ArrayList<SqlRow>();
        ArrayList<Biolsource> biolSourceProtein = new ArrayList<Biolsource>();
        List<Biolsource> biolSourceProteins = Biolsource.findBiolSourceIds(protein);
        HashSet taxsources = new HashSet();
        ArrayList taxsourcesUnique = new ArrayList();
		
        if (request().queryString().size() > 0  ) {
                Map<String, String[]> params = request().queryString();
                String[] searchTerms = null;
                
		
                String key = null;
                for (Map.Entry<String, String[]> entry : params.entrySet() ){
                        key = entry.getKey();
                        searchTerms = entry.getValue();
                
                if(key.equals("position")) {
			for(String p : searchTerms) {
			site = p;
                        System.out.println(" -------> output is " + site);
			}
                }
                if(key.equals("protein")) {
			for(String p : searchTerms) {
			protein = p;
                        System.out.println("output is 2 " + protein);
			//proteinNameFull = GsProteinSite.ProteinRetrievalName(protein);
			/* for(GsProteinSite g : proteinSummary) {
				String proteinNameFu2ll = g.protein_name;
			}*/
				
			}
                }

		if(key.equals("type")){
			for(String t : searchTerms) {
			type = t;
			}
		}

		}

		if(type.equals("defined")) {
			definedStructures = StructureToSiteDefined.findStructuresDefined(protein, site);
			int svalue;
			int x;
			for(StructureToSiteDefined s : definedStructures) {
				x = s.structure_id;
				Long value = Long.valueOf(x);
					//this check should not be required but for safety
					if(!structuresShow.contains(value)) {
                                        	structuresShow.add(value);
                                      	}
			}
		}

		else if (type.equals("general")) {
			int gvalue;
			int x;
			generalStructures = GeneralSites.findStructuresGeneral(protein, site);
			for(GeneralSites str : generalStructures) {
				List<StructureToSiteGeneral> general = str.strSiteGeneral;
				for(StructureToSiteGeneral g : general) {
					if(g.structure_id  > 0){
					gvalue = g.structure_id;
					Long value = Long.valueOf(gvalue);
						//this check should not be required but for safety
						if(!structuresShow.contains(value)) {
						structuresShow.add(value);
						}
					}
				}
			}
			for(Long s : structuresShow) {
			System.out.println("check values" + s );
			}
		}

                for(Biolsource biol : biolSourceProteins){
                        proteinName = biol.protein;
                        swissProtName = biol.swiss_prot;
                        Biolsource objectBiolSource = Ebean.find(Biolsource.class, biol.id);
			taxsources.add(objectBiolSource.taxonomy);
                        biolSourceProtein.add(objectBiolSource);
                }
		
		taxsourcesUnique.addAll(taxsources);	
		
		biolRefs = Biolsource.findBiolsourceRefs(protein);
		
		sequenceRetrieval = UniprotConnection.EntryRetrievalSequence(protein);

        }

	Object format = Cache.get("format");
        String notation = "gs";
        if(format != null) {notation = (String) format.toString();}

        return ok(
                proteinsite.render(notation, sequenceRetrieval,  protein, biolRefs, site, structuresShow,  taxsourcesUnique )
                );
    	}

	
}
