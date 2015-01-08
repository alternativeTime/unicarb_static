package models.glycomobcomposition;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

/**
 * Created by matthew on 8/01/15.
 */
@SuppressWarnings("serial")
@Entity
@Table(schema="glycomob_composition", name="glycomob_composition")
public class GlycomobComposition extends Model {

    @Id
    public Long id;
    public String massCharge;
    public String hex;
    public String hexnac;
    public String dhex;
    public String neuac;
    public int charge;
    public String mi; //multiple isomers

    @OneToMany
    public List<GlycomobComposition> glycomobCompositionList;

    public static Model.Finder<Long,GlycomobComposition> find = new Model.Finder<Long,GlycomobComposition>(Long.class, GlycomobComposition.class);
}

