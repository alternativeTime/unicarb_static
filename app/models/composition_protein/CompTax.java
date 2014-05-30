package models.composition_protein;

import models.Taxonomy;
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
@Table(schema="composition_protein", name="comp_tax")
public class CompTax extends Model  {

    @Id
    public Long id;

    @ManyToOne
    public Taxonomy taxonomy;

    @ManyToOne
    public CompositionStructure composition_structure_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Taxonomy getTaxonomy() {
        return taxonomy;
    }

    public void setTaxonomy(Taxonomy taxonomy) {
        this.taxonomy = taxonomy;
    }

    public CompositionStructure getComposition_structure_id() {
        return composition_structure_id;
    }

    public void setComposition_structure_id(CompositionStructure composition_structure_id) {
        this.composition_structure_id = composition_structure_id;
    }

    public static Model.Finder<Long,CompTax> find = new Model.Finder<Long,CompTax>(Long.class, CompTax.class);
}
