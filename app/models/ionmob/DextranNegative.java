package models.ionmob;

import play.db.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * Created by matthew on 8/01/15.
 */
@SuppressWarnings("serial")
@Entity
@Table(schema="ionmob", name="dextran_negative")
public class DextranNegative extends Model {

    @Id
    public Long id;

    @Column(scale = 2)
    public BigDecimal mass;

    public int charge;
    public String glucose;
    public String ion;
    public BigDecimal cssHe;
    public BigDecimal cssN;

    public static Model.Finder<Long,DextranNegative> find = new Model.Finder<Long,DextranNegative>(Long.class, DextranNegative.class);


}
