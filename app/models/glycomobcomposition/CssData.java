package models.glycomobcomposition;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Created by matthew on 8/01/15.
 */
@SuppressWarnings("serial")
@Entity
@Table(schema="glycomob_composition", name="css_data")
public class CssData extends Model {

    @Id
    public Long id;
    public Double css;

    @ManyToOne
    public Adduct adduct;
    @ManyToOne
    public GlycoproteinStandard glycoproteinStandard;
    @ManyToOne
    public IonmobGas ionmobGas;
    @ManyToOne
    public GlycomobComposition glycomobComposition;

   public static Model.Finder<Long,CssData> find = new Model.Finder<Long,CssData>(Long.class, CssData.class);


}
