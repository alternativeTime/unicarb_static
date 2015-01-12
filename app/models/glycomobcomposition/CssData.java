package models.glycomobcomposition;

import play.db.ebean.Model;

import javax.persistence.*;

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
    @JoinColumn(name="adduct_id")
    public Adduct adductList;

    @ManyToOne
    @JoinColumn(name="glycoprotein_standard_id")
    public GlycoproteinStandard glycoproteinStandardList;

    @ManyToOne
    @JoinColumn(name="ionmob_gas_id")
    public IonmobGas ionmobGasList;

    @ManyToOne
    @JoinColumn(name="glycomob_composition_id")
    public GlycomobComposition glycomobCompositionList;

    public static Model.Finder<Long,CssData> find = new Model.Finder<Long,CssData>(Long.class, CssData.class);


}
