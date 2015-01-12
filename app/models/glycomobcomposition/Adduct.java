package models.glycomobcomposition;

import play.db.ebean.Model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by matthew on 8/01/15.
 */
@SuppressWarnings("serial")
@Entity
@Table(schema="glycomob_composition", name="adduct")
public class Adduct extends Model {

    @Id
    public Long id;
    public String adduct;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<Adduct> adductList;
}
