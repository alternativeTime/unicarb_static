package models;

import java.util.*;

import javax.persistence.*;

import play.db.ebean.*;
import play.db.ebean.Model.Finder;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

/**
 * Refmethod entity managed by Ebean
 */

@Entity 
@Table(schema="public", name="refmethod")
public class Refmethod extends Model {


	@Id
    public Long id;  
    @ManyToOne
    public Reference reference;
    @ManyToOne
    public Method method;
    
    
    
    public Refmethod() {
		super();
		// TODO Auto-generated constructor stub
	}





	public Refmethod(Long id, Reference reference, Method method) {
		super();
		this.id = id;
		this.reference = reference;
		this.method = method;
	}

	public static Finder<Long,Refmethod> find = new Finder<Long,Refmethod>(Long.class, Refmethod.class); 
	
	/* public static List<Refmethod> findrefmethod(Long id) {
			return find
			   .where()

			   	.eq(Reference.class, id)
			   .findList();
		   }*/
    
}
