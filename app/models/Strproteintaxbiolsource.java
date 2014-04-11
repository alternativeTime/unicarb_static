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
@Table(schema="public", name="strproteintaxbiolsource")
public class Strproteintaxbiolsource extends Model {

    @Id
    public Long id;

    @ManyToOne
    public Structure structure;
    @ManyToOne
    public Proteins proteins;
    @ManyToOne
    public Taxonomy taxonomy;
    @ManyToOne
    public Sourceref sourceref; 
    @ManyToOne
    public Reference reference;
      
    
    /**
     * Generic query helper for entity with id Long
     */
    public static Finder<Long,Strproteintaxbiolsource> find = new Finder<Long,Strproteintaxbiolsource>(Long.class, Strproteintaxbiolsource.class); 
    


}

