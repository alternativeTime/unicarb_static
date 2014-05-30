package models.composition_protein;

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
@Table(schema = "composition_protein", name = "composition_structure")
public class CompositionStructure extends Model  {

    @Id
    public Long id;

    public String composition;

    @OneToMany
    public List<CompRef> compRef;
    @OneToMany
    public List<CompTax> compTax;
    @OneToMany
    public List<CompSite> compSite;
    @OneToMany
    public List<CompProtein> compProtein;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public List<CompRef> getCompRef() {
        return compRef;
    }

    public void setCompRef(List<CompRef> compRef) {
        this.compRef = compRef;
    }

    public List<CompTax> getCompTax() {
        return compTax;
    }

    public void setCompTax(List<CompTax> compTax) {
        this.compTax = compTax;
    }

    public List<CompSite> getCompSite() {
        return compSite;
    }

    public void setCompSite(List<CompSite> compSite) {
        this.compSite = compSite;
    }

    public List<CompProtein> getCompProtein() {
        return compProtein;
    }

    public void setCompProtein(List<CompProtein> compProtein) {
        this.compProtein = compProtein;
    }
}

