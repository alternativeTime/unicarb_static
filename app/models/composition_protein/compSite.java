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
@Table(schema="composition_protein", name="comp_site")
public class CompSite extends Model {

    @Id
    public Long id;

    public String swissProt;
    public String aminoAcidPosition;

    @ManyToOne
    public Proteins proteins_id;

    @ManyToOne
    public CompositionStructure composition_structure_id;

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

    public String getAminoAcidPosition() {
        return aminoAcidPosition;
    }

    public void setAminoAcidPosition(String aminoAcidPosition) {
        this.aminoAcidPosition = aminoAcidPosition;
    }

    public Proteins getProteins_id() {
        return proteins_id;
    }

    public void setProteins_id(Proteins proteins_id) {
        this.proteins_id = proteins_id;
    }

    public CompositionStructure getComposition_structure_id() {
        return composition_structure_id;
    }

    public void setComposition_structure_id(CompositionStructure composition_structure_id) {
        this.composition_structure_id = composition_structure_id;
    }

    public static Model.Finder<Long,CompSite> find = new Model.Finder<Long,CompSite>(Long.class, CompSite.class);
}
