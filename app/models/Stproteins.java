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
@Table(schema="public", name="stproteins")
public class Stproteins extends Model {

    @Id
    public Long id;
    @ManyToOne
    public Structure  structure;
    @ManyToOne
    public Proteins proteins; 
      

    public Stproteins(Structure structure, Proteins proteins) {
	this.structure=structure;
	this.proteins=proteins;
    }   
    
    /**
     * Generic query helper for entity with id Long
     */
    public static Finder<Long,Stproteins> find = new Finder<Long,Stproteins>(Long.class, Stproteins.class); 
    


}

