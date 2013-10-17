package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import play.db.ebean.Model;

@Entity
@Table(schema="public", name="taxtissue")
public class Taxtissue {
	
	@Id
	public Long id;

	public String species;
	
	//public String common;
	
	//public String div1;
	   
    //public String div2;

    //public String div3;

    //public String div4;
    
    @ManyToOne
    public Tissue tissue;
    
    @ManyToOne
    public Taxonomy taxonomy;
    
    
    public static Model.Finder<Long,Taxtissue> find = new Model.Finder<Long,Taxtissue>(Long.class, Taxtissue.class);

}
