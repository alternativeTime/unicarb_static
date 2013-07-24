package models;

import java.util.*;

import javax.persistence.*;

import play.db.ebean.*;
import play.db.ebean.Model.Finder;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

/**
 * Method entity managed by Ebean
 */
@Entity 
@Table(schema="public", name="method")
public class Method extends Model {

    @Id
    public Long id;
    public String description;
    public Long confidence;
    
    public static Finder<Long,Method> find = new Finder<Long,Method>(Long.class, Method.class); 
    
    public static List<Method> findmethod(Long id) {
		return find
		   .where()
			.eq("id", id)
		   .findList();
	   }
    
    
}
