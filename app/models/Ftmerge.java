package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

/**
 * Reference entity managed by Ebean
 */
@Entity 
@Table(schema="public", name="ftmerge")
public class Ftmerge extends Model {

    @Id
    public Long id;
    public String glycodb_no;
    public String ft;
    public String amino_acid;
    public String swiss_prot;

    @ManyToOne
    public Reference reference;

    public static Finder<Long,Ftmerge> find = new Finder<Long,Ftmerge>(Long.class, Ftmerge.class); 
    

    public static List<Ftmerge> findFt(String ft) {
       return find //.fetch("reference")
           .where()
                .eq("ft", ft)
           .findList();
    }
    
}

