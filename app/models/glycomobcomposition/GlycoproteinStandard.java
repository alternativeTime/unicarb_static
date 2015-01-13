package models.glycomobcomposition;

import play.db.ebean.Model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by matthew on 8/01/15.
 */
@SuppressWarnings("serial")
@Entity
@Table(schema="glycomobcomposition", name="glycoprotein_standard")
public class GlycoproteinStandard extends Model {

    @Id
    public Long id;
    public String name;
    public String dataAcquisition;
    public Integer cssCount;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    public List<GlycoproteinStandard> glycoproteinStandardList;

    public static Model.Finder<Long,GlycoproteinStandard> find = new Model.Finder<Long,GlycoproteinStandard>(Long.class, GlycoproteinStandard.class);

    private List<GlycoproteinStandard> getAllProteins() {
        List<GlycoproteinStandard> glycoproteinStandards = GlycoproteinStandard.find.all();
        return glycoproteinStandards;
    }

}
