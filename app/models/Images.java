package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import play.db.ebean.Model;

@Entity
public class Images {

	@Id
	public Long id;
	
	@ManyToOne
	public Structure structure;

	public static Model.Finder<Long,Images> find = new Model.Finder<Long,Images>(Long.class, Images.class);


}
