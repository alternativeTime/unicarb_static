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
@Table(schema="ionmob", name="nitrogen_negative")
public class NitrogenNegative extends Model {

    @Id
    public Long id;

    public Double h;
    public Double cl;
    public Double p;

    @ManyToOne
    public GlycanMob glycanMob;

    public static Finder<Long,NitrogenNegative> find = new Finder<Long,NitrogenNegative>(Long.class, NitrogenNegative.class);


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

    public Double getCl() {
        return cl;
    }

    public void setCl(Double cl) {
        this.cl = cl;
    }

    public Double getP() {
        return p;
    }

    public void setP(Double p) {
        this.p = p;
    }

    public GlycanMob getGlycanMob() {
        return glycanMob;
    }

    public void setGlycanMob(GlycanMob glycanMob) {
        this.glycanMob = glycanMob;
    }
}
