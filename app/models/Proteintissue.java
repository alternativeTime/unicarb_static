package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import play.db.ebean.Model;

@Entity
public class Proteintissue {
	
	@Id
	public Long id;

	public String div1;

	public String div2;

	public String div3;

	public String div4;
	
	public String protein;
	
	public String swiss;
	
	@ManyToOne
	public Tissue tissue;
	
	@ManyToOne
	public Proteins proteins;
	
	public static Model.Finder<Long,Proteintissue> find = new Model.Finder<Long,Proteintissue>(Long.class, Proteintissue.class);

}
