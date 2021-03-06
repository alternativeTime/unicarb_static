package models.glycomobcomposition;

import play.db.ebean.Model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by matthew on 14/01/15.
 */
@SuppressWarnings("serial")
@Entity
@Table(schema="glycomobcomposition", name="css_data_general")
public class CssDataGeneral extends Model {

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
    @JoinColumn(name="glycomobcomposition_id")
    public Glycomobcomposition glycomobcompositionList;

    public String ion;
    public Double ionMass;


    public static Model.Finder<Long,CssDataGeneral> find = new Model.Finder<Long,CssDataGeneral>(Long.class, CssDataGeneral.class);

    public static List<CssDataGeneral> getMatchingCSS(Double css) {
        List<CssDataGeneral> cssDatas = find.where().between("css", css-4, css+4).findList();
        return cssDatas;
    }


}