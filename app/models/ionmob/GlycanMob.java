package models.ionmob;

import play.db.ebean.Model;
import java.util.List;
import javax.persistence.*;

/**
 * Created by matthew on 03/08/2014.
 */

@SuppressWarnings("serial")
@Entity
@Table(schema="ionmob", name="glycan_mob")
public class GlycanMob extends Model {

    @Id
    public Long id;

    public String structure;

    public int structureId;

    @OneToMany
    public List<HeNegative> heNegativeList;

    @OneToMany
    public List<HePositive> hePositiveList;

    @OneToMany
    public List<NitrogenNegative> nitrogenNegativeList;

    @OneToMany
    public List<NitrogenPositive> nitrogenPositiveList;


    public static Finder<Long,GlycanMob> find = new Finder<Long,GlycanMob>(Long.class, GlycanMob.class);


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<HeNegative> getHeNegativeList() {
        return heNegativeList;
    }

    public void setHeNegativeList(List<HeNegative> heNegativeList) {
        this.heNegativeList = heNegativeList;
    }

    public List<HePositive> getHePositiveList() {
        return hePositiveList;
    }

    public void setHePositiveList(List<HePositive> hePositiveList) {
        this.hePositiveList = hePositiveList;
    }

    public List<NitrogenNegative> getNitrogenNegativeList() {
        return nitrogenNegativeList;
    }

    public void setNitrogenNegativeList(List<NitrogenNegative> nitrogenNegativeList) {
        this.nitrogenNegativeList = nitrogenNegativeList;
    }

    public List<NitrogenPositive> getNitrogenPositiveList() {
        return nitrogenPositiveList;
    }

    public void setNitrogenPositiveList(List<NitrogenPositive> nitrogenPositiveList) {
        this.nitrogenPositiveList = nitrogenPositiveList;
    }
}
