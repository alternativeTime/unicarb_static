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
@Table(name="gs_protein_site_str2", schema="glycosuite")
public class GsProteinSiteStr2 extends Model {

    @Id
    public Long id;
    public String protein_name;
    public String swiss_prot;
    public String amino_acid;
    public String glyco_aa_site;
    //public String note;
    //public int structure_id;
    //public String glycan_type;
    //public int source_id; //make this a relationship

	@ManyToOne
	public GsProteinStr2 gsProteinStr2;
	
	@OneToMany
	public List<GsProteinSiteStructureAssociation> gsProteinSiteStructureAssociation;
    
    public static Finder<Long,GsProteinSiteStr2> find = new Finder<Long,GsProteinSiteStr2>(Long.class, GsProteinSiteStr2.class);


    


}
