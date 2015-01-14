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
    public List<Glycomobcomposition> glycomobCompositionList;

    public static Model.Finder<Long,Glycomobcomposition> find = new Model.Finder<Long,Glycomobcomposition>(Long.class, Glycomobcomposition.class);
}