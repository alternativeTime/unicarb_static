package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

/**
 * Structure entity managed by Ebean
 */
@Entity 
public class Sourceref extends Model {

    @Id
    public Long id;

    @ManyToOne
    public Reference reference;
    @ManyToOne
    public Biolsource biolsource;    

    //@OneToMany
    //public List<Biolsource> biolsource;

    public Sourceref(Reference reference, Biolsource biolsource) {
        this.reference=reference;
	this.biolsource = biolsource;
    }

    
    /**
     * Generic query helper for entity Reference with id Long
     */
    public static Finder<Long,Sourceref> find = new Finder<Long,Sourceref>(Long.class, Sourceref.class); 
    
    
}

