package models;

import java.util.*;

import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import play.mvc.Content;

import com.avaje.ebean.*;

/**
 * Structure entity managed by Ebean
 */
@SuppressWarnings("serial")
@Entity 
public class Pubchem extends Model {

    @Id
    public Long id;
    
    public String iupac;
    public String pubchem_id ;
   
    @ManyToOne
    public Structure structure;

    public static Finder<Long,Pubchem> find = new Finder<Long,Pubchem>(Long.class, Pubchem.class);

    public static List<Pubchem> pubchemId(String pubchem) {
	return find //.fetch("reference")
           .where()
                .eq("pubchem_id", pubchem)
           .findList();
    }

    
}

