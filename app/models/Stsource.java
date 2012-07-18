package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

@Entity 
public class Stsource extends Model {

    @Id
    public Long id;

    @ManyToOne
    public Structure structure; 

    @ManyToOne
    public Source source;

    public static Model.Finder<Long,Stsource> find = new Model.Finder<Long,Stsource>(Long.class, Stsource.class);

    
}

