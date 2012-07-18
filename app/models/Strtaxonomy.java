package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

@Entity 
public class Strtaxonomy extends Model {

    @Id
    public Long id;

    @ManyToOne
    public Taxonomy taxonomy;

    @ManyToOne
    public Structure structure; 

    public static Model.Finder<Long,Strtaxonomy> find = new Model.Finder<Long,Strtaxonomy>(Long.class, Strtaxonomy.class);

    
}

