package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

@Entity 
public class Proteinstaxonomy extends Model {

    @Id
    public Long id;
    
    public String swissProt;

    public String species;

    public String common;
    
    public String protein;
  
    public String strain;


    @ManyToOne
    public Proteins proteins;

    public static Model.Finder<Long,Proteinstaxonomy> find = new Model.Finder<Long,Proteinstaxonomy>(Long.class, Proteinstaxonomy.class);
    
}

