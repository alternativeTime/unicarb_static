package models;

import java.util.*;

import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import play.mvc.Content;

import com.avaje.ebean.*;

@SuppressWarnings("serial")
@Entity 
@Table(name="tissue_taxonomy", schema="core")
public class TissueTaxonomy extends Model {

    @Id
    public Long id;
    
    public String tissue_taxon;
    public String mesh_id;
    public String description;
   
    public static Finder<Long,TissueTaxonomy> find = new Finder<Long,TissueTaxonomy>(Long.class, TissueTaxonomy.class);
    
}

