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
    public String composition;

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

    public String getAminoAcidPosition() {
        return aminoAcidPosition;
    }

    public void setAminoAcidPosition(String aminoAcidPosition) {
        this.aminoAcidPosition = aminoAcidPosition;
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

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public static Model.Finder<Long,CompSite> find = new Model.Finder<Long,CompSite>(Long.class, CompSite.class);


    public static List<CompSite> compSite(String swissProt) {
        return find.where()
                .ilike("swiss_prot", swissProt ).findList();

    }
}
