package models.glycomobcomposition;

import play.db.ebean.Model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by matthew on 14/01/15.
 */
@SuppressWarnings("serial")
@Entity
@Table(schema="glycomobcomposition", name="glycomobcomposition")
public class Glycomobcomposition extends Model {

    @Id
    public Long id;
    public String mass;
    public String hex;
    public String hexnac;
    public String dhex;
    public String neunac;
    public int charge;
    public String mi; //multiple isomers

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<CssDataGeneral> cssDataGenerals;

    public static Model.Finder<Long,Glycomobcomposition> find = new Model.Finder<Long,Glycomobcomposition>(Long.class, Glycomobcomposition.class);

    /* will match compositions referenced to native structures only */
    public static List<Glycomobcomposition> getMatchingCompositions(String hex, String hexnac, String dhex, String neunac){
        List<Glycomobcomposition> glycomobcompositions = find.fetch("cssDataGenerals").where().eq("hex", hex).eq("hexnac", hexnac).eq("dhex", dhex).eq("neunac", neunac).eq("native_structure", "y").findList();
        return glycomobcompositions;
    }

    public static List<Glycomobcomposition> getMatchingCompositionsAll(String hex, String hexnac, String dhex, String neunac){
        List<Glycomobcomposition> glycomobcompositions = find.fetch("cssDataGenerals").where().eq("hex", hex).eq("hexnac", hexnac).eq("dhex", dhex).eq("neunac", neunac).findList();
        return glycomobcompositions;
    }
}
