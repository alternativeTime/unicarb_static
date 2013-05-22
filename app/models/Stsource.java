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

	public String div1;
	   
    public String div2;

    public String div3;

    public String div4;

	
	@ManyToOne
	public Structure structure; 

	@ManyToOne
	public Tissue tissue;

	public static Model.Finder<Long,Stsource> find = new Model.Finder<Long,Stsource>(Long.class, Stsource.class);
	
	public static List<Stsource> findStsource(String tissue1, String tissue2, String tissue3, String tissue4) {
        return
           find.where().disjunction()
		.ilike("div1", tissue1)
		.ilike("div2", tissue2)
		.ilike("div3", tissue3)
		.ilike("div4", tissue4)
		.findList();
   }

}

