package models.composition_protein;

import models.Reference;
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
@Table(schema="composition_protein", name="comp_ref")
public class CompRef extends Model  {

    @Id
    public Long id;

    public Reference getReference() {
        return reference;
    }

    public void setReference(Reference reference) {
        this.reference = reference;
    }

    public CompositionStructure getComposition_structure_id() {
        return composition_structure_id;
    }

    public void setComposition_structure_id(CompositionStructure composition_structure_id) {
        this.composition_structure_id = composition_structure_id;
    }

    @ManyToOne
    public Reference reference;

    @ManyToOne
    public CompositionStructure composition_structure_id;

    public static Model.Finder<Long,CompRef> find = new Model.Finder<Long,CompRef>(Long.class, CompRef.class);

}
