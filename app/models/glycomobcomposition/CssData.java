package models.glycomobcomposition;

import play.db.ebean.Model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by matthew on 8/01/15.
 */
@SuppressWarnings("serial")
@Entity
@Table(schema="glycomobcomposition", name="css_data")
public class CssData extends Model {

    @Id
    public Long id;
    public Double css;
    public String mode;
    public String nativeStructure;


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
    @JoinColumn(name="sodiated_glycomob_composition_id")
    public SodiatedGlycomobComposition sodiatedGlycomobCompositionList;

    public static Model.Finder<Long,CssData> find = new Model.Finder<Long,CssData>(Long.class, CssData.class);

    public static List<CssData> getMatchingCSS(Double css) {
        List<CssData> cssDatas = find.where().between("css", css-4, css+4).findList();
        return cssDatas;
    }


}
