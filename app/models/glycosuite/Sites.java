package models;

import java.util.*;

import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import play.mvc.Content;

import com.avaje.ebean.*;

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


/**
 * Sites entity managed by Ebean
 */
@SuppressWarnings("serial")
@Entity 
@Table(name="sites", schema="glycosuite")
public class Sites extends Model {

    @Id
    public Long id;
    public String protein_name;
    public String swiss_prot;
    public String glyco_aa;
    public String glyco_aa_site;

    
    public static Finder<Long,Sites> find = new Finder<Long,Sites>(Long.class, Sites.class);

    public static List<Sites> findSites(String protein) {
        return
           find.where().ilike("protein_name", protein).findList();
    }

    public static List<String> EntryRetrievalExample(String accession) {

	ArrayList arrayFunction = new ArrayList();
	List arrayPTM = new ArrayList();
        //Create entry retrieval service
        EntryRetrievalService entryRetrievalService = UniProtJAPI.factory.getEntryRetrievalService();

        //Retrieve UniProt entry by its accession number
	String acc = accession;
	List<String> uniprotDetails = new ArrayList<String>(); 
	//UniProtEntry entry = new UniProtEntry();
        UniProtEntry entry = (UniProtEntry) entryRetrievalService.getUniProtEntry(acc);


        //If entry with a given accession number is not found, entry will be equal null
        if (entry != null) {
	    //uniprotDetails.add(entry.getUniProtId().getValue());
	    //List<Field> name = entry.getProteinDescription().getRecommendedName().getFields(RecName);
	    //uniprotDetails.addAll(entry.getProteinDescription().getRecommendedName().getFields() );
	    //uniprotDetails.add(entry.getProteinDescription().getEcNumbers());

        }


	ProteinDataQueryService queryService = UniProtJAPI.factory.getProteinDataQueryService();

                
        uk.ac.ebi.kraken.uuw.services.remoting.Query proteinQuery = UniProtQueryBuilder.buildQuery(acc);
        EntryIterator<ProteinData> entries = queryService.getEntryIterator(proteinQuery);
        System.out.println("Entries with protein name quried = " + entries.getResultSize());
	String recommendedNameDisplay;
	//this is a bit slow
	for (ProteinData e : entries){
			System.out.println(e);
                        for (Field field2 : e.getUniProtEntry().getProteinDescription().getRecommendedName().getFields()) {
                                if (field2.getType().getValue().equalsIgnoreCase("FULL")) {
                                        String recommendedName = field2.getValue();
                                        System.out.println("recc name from:" + recommendedName);
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
			//System.out.println("function --> " + arrayFunction + "\n" + );
			//uniprotDetails.add(arrayFunction);		
	}

	return uniprotDetails;
	//return arrayFunction;
    }

    public static String EntryRetrievalSequence(String accession) {

	EntryRetrievalService entryRetrievalService = UniProtJAPI.factory.getEntryRetrievalService();
 
	Object attribute = UniProtJAPI.factory.getEntryRetrievalService().getUniProtAttribute(accession ,  "ognl:sequence.value");
        String sequence = attribute.toString();

	String []thisCombo2 = sequence.split("(?<=\\G..........)");
	String asString = Arrays.toString(thisCombo2);
	String sequenceCat = "";
	int i = 0;
	for(String s : thisCombo2) {
		if (i == 50 ) {
		sequenceCat += s;
		sequenceCat += "\n";
		i = 0;
		} else {
		sequenceCat += s;
		i = i + 10;
		}
	}

	return sequenceCat;
    }

}
