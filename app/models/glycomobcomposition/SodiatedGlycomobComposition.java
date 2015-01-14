package models.glycomobcomposition;

import play.db.ebean.Model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by matthew on 8/01/15.
 */
@SuppressWarnings("serial")
@Entity
@Table(schema="glycomobcomposition", name="sodiated_glycomob_composition")
public class SodiatedGlycomobComposition extends Model {

    @Id
    public Long id;
    public String massCharge;
    public String hex;
    public String hexnac;
    public String dhex;
    public String neunac;
    public int charge;
    public String mi; //multiple isomers

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<SodiatedGlycomobComposition> glycomobCompositionList;

    public static Model.Finder<Long,SodiatedGlycomobComposition> find = new Model.Finder<Long,SodiatedGlycomobComposition>(Long.class, SodiatedGlycomobComposition.class);
}

