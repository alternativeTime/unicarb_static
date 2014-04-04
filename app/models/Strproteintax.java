package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import play.mvc.Controller;
import play.mvc.Result;

import com.avaje.ebean.*;

/**
 * Streference entity managed by Ebean
 */
@SuppressWarnings("serial")
@Entity 
@Table(schema="public", name="strproteintax")
public class Strproteintax extends Model {

    @ManyToOne
    public Structure structure;
    @ManyToOne
    public Proteins proteins;
    @ManyToOne
    public Taxonomy taxonomy; 
      
    
    /**
     * Generic query helper for entity with id Long
     */
    public static Finder<Long,Strproteintax> find = new Finder<Long,Strproteintax>(Long.class, Strproteintax.class); 
    


}

