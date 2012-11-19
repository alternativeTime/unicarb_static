package models;

import java.util.*;

import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import play.mvc.Content;

import com.avaje.ebean.*;

/**
 * Structure entity managed by Ebean
 */
@SuppressWarnings("serial")
@Entity 
@Table(name="glycobase_source", schema="connected")
public class GlycobaseSource extends Model {

    @Id
    public Long id;
    public int glycan_id;
    //public int ref_id;
    //public int mesh_pert_id;
    //public int mesh_disease_id;
    //public int mesh_tissue_id;
    //public int tax_species_id;
    //public int biological_context_id;
    public String tax_species;
    public String tissue;
    public String perturbation;
    public String disease;
    
   
//    @OneToMany
//    public List<Eurocarb> eurocarb;


    public static Finder<Long,GlycobaseSource> find = new Finder<Long,GlycobaseSource>(Long.class, GlycobaseSource.class);

    public static HashSet perturbationSummary() {

        HashSet perturbationUnique = new HashSet();
        List<GlycobaseSource> glycobasesource = GlycobaseSource.find.all();

        for (GlycobaseSource glycobaseAll : glycobasesource) {
                perturbationUnique.add(glycobaseAll.perturbation);

        }

    return perturbationUnique;
    }

    public static List<GlycobaseSource> findPerturbation(String search) {
        return
           find.where().disjunction()
		.ilike("perturbation", search)
		.ilike("tax_species", search)
		.ilike("tissue", search)
		.endJunction()
		.findList();
    }

    public static List<GlycobaseSource> findSpecies(String search) {
        return
           find.where().like("tax_species", search).findList();
    }

    public static List<GlycobaseSource> findTissue(String search) {
        return
           find.where().like("tissue", search).findList();
    }
    
}

