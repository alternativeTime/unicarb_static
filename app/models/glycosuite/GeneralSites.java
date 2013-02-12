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
@Table(name="general_sites", schema="glycosuite")
public class GeneralSites extends Model {

    @Id
    public Long id;
    public String protein_name;
    public String swiss_prot;
    public String amino_acid_position;
    public String glyco_aa;
    public String glyco_aa_site;

    @OneToMany
    public List<StructureToSiteGeneral> strSiteGeneral;

    
    public static Finder<Long,GeneralSites> find = new Finder<Long,GeneralSites>(Long.class, GeneralSites.class);

    public static List<GeneralSites> findProteinsGeneral(String protein) {
        return
           find.where().ilike("swiss_prot", protein).findList();
   }

   public static List<GeneralSites> findStructuresGeneral(String protein, String site) {
	System.out.println("--------->");
        return
           find.where().ilike("swiss_prot", protein).ilike("glyco_aa_site", site).findList();
   }


}
