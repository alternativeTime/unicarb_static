package models.composition_protein;

import models.Proteins;
import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

/**
 * Created by matthew on 30/05/2014.
 */
@Entity
@Table(schema="composition_protein", name="comp_protein")
public class CompProtein extends Model  {

    @Id
    public Long id;

    public String swissProt;

    @ManyToOne
    public Proteins proteins;

    @ManyToOne
    public CompositionStructure composition_structure;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSwissProt() {
        return swissProt;
    }

    public void setSwissProt(String swissProt) {
        this.swissProt = swissProt;
    }

    public Proteins getProteins() {
        return proteins;
    }

    public void setProteins(Proteins proteins) {
        this.proteins = proteins;
    }

    public CompositionStructure getComposition_structure() {
        return composition_structure;
    }

    public void setComposition_structure(CompositionStructure composition_structure) {
        this.composition_structure = composition_structure;
    }

    /**
     * Generic query helper for entity Composition Protein with id Long
     */
    public static Finder<Long,CompProtein> find = new Finder<Long,CompProtein>(Long.class, CompProtein.class);


    public static List<CompProtein> compProteins(String swissProt) {
        return find.where()
                        .ilike("swiss_prot", swissProt ).findList();

    }

}
