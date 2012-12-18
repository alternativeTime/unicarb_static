package models;

import java.util.*;

import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import play.mvc.Content;

import com.avaje.ebean.*;



/**
 * StructureToSites entity managed by Ebean
 */
@SuppressWarnings("serial")
@Entity 
@Table(name="gs_protein_site_structure_association", schema="glycosuite")
public class GsProteinSiteStructureAssociation extends Model {

    @Id
    public Long id;
    public String protein_name;
    public String swiss_prot;
    public String glyco_aa_site;
    //public String note;
    public int structure_id;
    //public String glycan_type;
    public int source_id; //make this a relationship

    @ManyToOne
    public GsProteinSiteStr2 gsProteinSiteStr2;
    
    
    public static Finder<Long,GsProteinSiteStructureAssociation> find = new Finder<Long,GsProteinSiteStructureAssociation>(Long.class, GsProteinSiteStructureAssociation.class);

    public static List<GsProteinSiteStructureAssociation> findStructuresSites(String protein, String site) {
	return
	 find.where().ilike("swiss_prot", protein).ilike("glyco_aa_site", site).findList();
	
    } 


}
