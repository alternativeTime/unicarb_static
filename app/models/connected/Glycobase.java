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
@Table(schema="connected")
public class Glycobase extends Model {

    @Id
    public Long id;
    
    public String gws;
    public String glycoct;
   
//    @OneToMany
//    public List<Eurocarb> eurocarb;


    public static Finder<Long,Glycobase> find = new Finder<Long,Glycobase>(Long.class, Glycobase.class);

    public static List<Glycobase> searchStructureGlycoBase(String glycoct) {
        return
            find.where()
                .like("glycoct", glycoct)
                //.join("strtaxonomy")
                .findList();
    }


    
}

