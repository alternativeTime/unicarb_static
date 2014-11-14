package models.ionmob;

import play.db.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Created by matthew on 03/08/2014.
 */

@SuppressWarnings("serial")
@Entity
@Table(schema="ionmob", name="nitrogen_positive")
public class NitrogenPositive extends Model {

    @Id
    public Long id;

    public Double h;
    public Double na;
    public Double k;

    @ManyToOne
    public GlycanMob glycanMob;

    public static Finder<Long,NitrogenPositive> find = new Finder<Long,NitrogenPositive>(Long.class, NitrogenPositive.class);

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getH() {
        return h;
    }

    public void setH(Double h) {
        this.h = h;
    }

    public Double getNa() {
        return na;
    }

    public void setNa(Double na) {
        this.na = na;
    }

    public Double getK() {
        return k;
    }

    public void setK(Double k) {
        this.k = k;
    }

    public GlycanMob getGlycanMob() {
        return glycanMob;
    }

    public void setGlycanMob(GlycanMob glycanMob) {
        this.glycanMob = glycanMob;
    }
}