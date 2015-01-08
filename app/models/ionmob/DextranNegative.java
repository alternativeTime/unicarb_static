package models.ionmob;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by matthew on 8/01/15.
 */
@SuppressWarnings("serial")
@Entity
@Table(schema="ionmob", name="dextran_negative")
public class DextranNegative extends Model {

    @Id
    public Long id;

    public Double mass;
    public int charge;
    public String glucose;
    public String ion;
    public String cssHe;
    public String cssN;

    public static Model.Finder<Long,DextranNegative> find = new Model.Finder<Long,DextranNegative>(Long.class, DextranNegative.class);


}
