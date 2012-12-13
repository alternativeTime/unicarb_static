package models;

import java.util.*;

import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import play.mvc.Content;

import com.avaje.ebean.*;


/**
 * Sites entity managed by Ebean
 */
@SuppressWarnings("serial")
@Entity 
@Table(name="sites_references2", schema="glycosuite")
public class SitesReferences2 extends Model {

    @Id
    public Long id;
    public String protein_name;
    public String swiss_prot;
    public String description;

    public static Finder<Long,SitesReferences2> find = new Finder<Long,SitesReferences2>(Long.class, SitesReferences2.class);

    public static List<SitesReferences2> findSitesReferences(String protein) {
        return
           find.where().ilike("swiss_prot", protein).findList();
    }
}
