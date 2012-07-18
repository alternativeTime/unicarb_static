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
public class Streference extends Model {

    @Id
    public Long id;
    @ManyToOne
    public Structure  structure;
    @ManyToOne
    public Reference reference;
      

    public Streference(Reference reference, Structure structure) {
	this.structure=structure;
	this.reference=reference;
    }   
    
    /**
     * Generic query helper for entity with id Long
     */
    public static Finder<Long,Streference> find = new Finder<Long,Streference>(Long.class, Streference.class); 
    


}

