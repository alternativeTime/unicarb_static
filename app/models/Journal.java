package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

/**
 * Journal entity managed by Ebean
 */
@Entity 
public class Journal extends Model {

    @Id
    public Long id;
    
    public String shortname;
   
    public String name;

    public static Model.Finder<Long,Journal> find = new Model.Finder<Long,Journal>(Long.class, Journal.class);

    public static Map<String,String> options() {
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(Journal c: Journal.find.orderBy("name").findList()) {
            options.put(c.id.toString(), c.name);
        }
        return options;
    }

    
}

