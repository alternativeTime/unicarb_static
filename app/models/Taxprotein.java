package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

/**
 * Taxprotein entity managed by Ebean
 */
@Entity 
public class Taxprotein extends Model {

    @Id
    public Long id;
    
    public String taxonomy;
   
    public String protein;

	@ManyToOne
	public Taxonomy taxonomyRelationship;

    public static Model.Finder<Long,Taxprotein> find = new Model.Finder<Long,Taxprotein>(Long.class, Taxprotein.class);
    
}

