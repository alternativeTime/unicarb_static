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


/**
 * StructureToSiteDefined entity managed by Ebean
 */
@SuppressWarnings("serial")
@Entity 
@Table(name="structure_to_site_defined", schema="glycosuite")
public class StructureToSiteDefined extends Model {

    @Id
    public Long id;
    public String protein_name;
    public String swiss_prot;
    public String amino_acid_position;
    //public String note;
    public int structure_id;
    //public String glycan_type;
    //public int source_id; //make this a relationship

    @ManyToOne
    public DefinedSites definedSites; 

    
    public static Finder<Long,StructureToSiteDefined> find = new Finder<Long,StructureToSiteDefined>(Long.class, StructureToSiteDefined.class);

    public static List<StructureToSiteDefined> findStructuresDefined(String protein, String site) {
        return
           find.where().disjunction()
		.ilike("swiss_prot", protein)
		.ilike("protein_name", protein)
		.endJunction()
		.ilike("amino_acid_position", "%" + site + "%")
		.findList();
   }

}
