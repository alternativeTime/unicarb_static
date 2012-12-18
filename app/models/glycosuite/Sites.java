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

}
