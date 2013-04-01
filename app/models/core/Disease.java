package models;

import java.util.*;

import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import play.mvc.Content;

import com.avaje.ebean.*;

@Entity 
@Table(name="disease", schema="core")
public class Disease extends Model {

    @Id
    public Long id;
    
    public String disease_name;
    public String mesh_id;
    public String description;
   
    public static Finder<Long,Disease> find = new Finder<Long,Disease>(Long.class, Disease.class);
    
}

