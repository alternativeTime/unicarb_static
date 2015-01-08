package models.glycomobcomposition;

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
@Table(schema="glycomob_composition", name="adduct")
public class Adduct {

    @Id
    public Long id;
    public String adduct;

    @OneToMany
    public List<Adduct> adductList;
}
