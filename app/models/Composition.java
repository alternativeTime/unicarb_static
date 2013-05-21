package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import play.db.ebean.Model;

@SuppressWarnings("serial")
@Entity 
public class Composition extends Model {

	@Id
	public Long id; //represents a string of compositions not a PK

	public int hexose;
	public int hexnac;
	public int deoxyhexose;
	public int neuac;
	public int neugc;
	public int pentose;
	public int sulfate;
	public int phosphate;
	public int kdn;
	public int kdo;
	public int hexa;
	public int methyl;
	public int acetyl;
	public int other;
	public double other_mass;
	public double other_mass_monoisotopic;
	public double glycan_mass;
	public double glycan_mass_monoisotopic;
	public int total_residues;
	public String linkage;
	public String composition2;

	@ManyToOne
	public Structure  structure;

	public static Model.Finder<Long,Composition> find = new Model.Finder<Long,Composition>(Long.class, Composition.class);

	public static List<Composition> findCompositionDetails(String compositionId){
		return find
				.where()
				.eq("id", compositionId)
				.findList();
	}

}
