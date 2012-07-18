package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

@Entity 
public class Translation extends Model {

    @Id
    public Long id;
    
    public String iupac;
   
    public String ct;

    public String gws;
    
    public Long gs;


    public static Model.Finder<Long,Translation> find = new Model.Finder<Long,Translation>(Long.class, Translation.class);

    
    public static List<Translation> searchTranslation(String glycoct) { 
        return
            find.where()
            	.like("ct", glycoct)  
                //.join("strtaxonomy")
		.findList();
    }
}
