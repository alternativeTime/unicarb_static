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

    //public String composition;

    @ManyToOne
    public Reference reference;

    @ManyToOne
    public CompositionStructure composition_structure;

    public static Model.Finder<Long,CompRef> find = new Model.Finder<Long,CompRef>(Long.class, CompRef.class);

    public static List<CompRef> findCompRefs(Long id) {
        return
                find.fetch("composition_structure")//.fetch("comp_ref")//.fetch("composition_structure")
                        .where()
                        .eq("reference_id", id)
                        .orderBy("composition_structure.composition")
                        .findList();
    }

}
