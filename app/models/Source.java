package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

@Entity 
public class Source extends Model {

    @Id
    public Long id;
    
    public String div1;
   
    public String div2;

    public String div3;

    public String div4;

    @OneToMany
    public List<Stsource> stsource;

    public static Model.Finder<Long,Source> find = new Model.Finder<Long,Source>(Long.class, Source.class);
    
}

