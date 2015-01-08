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
@Table(schema="glycomob_composition", name="glycoprotein_standard")
public class GlycoproteinStandard extends Model {

    @Id
    public Long id;
    public String name;

    @OneToMany
    public List<GlycoproteinStandard> glycoproteinStandardList;

    public static Model.Finder<Long,GlycoproteinStandard> find = new Model.Finder<Long,GlycoproteinStandard>(Long.class, GlycoproteinStandard.class);

}
