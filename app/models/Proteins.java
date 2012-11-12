package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

@Entity 
public class Proteins extends Model {

    @Id
    public Long id;
    
    public String name;
   
    public String swissProt;

    public String description;

    @OneToMany
    public List<Stproteins> stproteins;

    public static Model.Finder<Long,Proteins> find = new Model.Finder<Long,Proteins>(Long.class, Proteins.class);

   /* public static Map<String,String> options() {
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(Proteins c: Proteins.find.orderBy("name").findList()) {
            options.put(c.id.toString(), c.name);
        }
        return options;
    }*/

    public static HashSet proteinSummary() {

        HashSet proteinUnique = new HashSet();
        List<Proteins> proteins = Proteins.find.all();

        for (Proteins protein : proteins) {
                proteinUnique.add(protein.name);

        }

    return proteinUnique;
    }


    
}

