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
 * StructureToSites entity managed by Ebean
 */
@SuppressWarnings("serial")
@Entity 
@Table(name="gs_protein_site_structure", schema="glycosuite")
public class GsProteinSiteStructure extends Model {

    @Id
    public Long id;
    public String swiss_prot;
    public String amino_acid_position;
    //public String note;
    public int structure_id;
    public String glycan_type;
    //public int source_id; //make this a relationship

    @ManyToOne
    public GsProteinSite gsProteinSite;
    
    public static Finder<Long,GsProteinSiteStructure> find = new Finder<Long,GsProteinSiteStructure>(Long.class, GsProteinSiteStructure.class);

}
