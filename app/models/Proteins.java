package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

@Entity 
public class Proteins extends Model {

    @Id
    public Long id;
    
    public String name;
   
    public String swissProt;

    public String description;

    @OneToMany
    public List<Stproteins> stproteins;

    @ManyToOne
    public List<ProteinGlycosylationSites> proteinsites;

    @OneToMany
    public List<StructureToSites> stsite;

    @OneToMany
    public List<GeneralSites> proteinGeneralSites;

    @OneToMany
    public List<DefinedSites> proteinDefinedSites;

    public static Model.Finder<Long,Proteins> find = new Model.Finder<Long,Proteins>(Long.class, Proteins.class);

    public static List<Proteins> findProteins(String protein) {
        return
           find.where().ilike("name", protein).findList();
   }

   public static List<Proteins> findProteinsSwissProt(String protein) {
        return
           find.where().ilike("swiss_prot", protein).findList();
   }
   
   public static List<Proteins> findProteinsName(String protein) {
        return
           find.where().ilike("name", protein).findList();
   }


    public static HashSet proteinSummary() {

        HashSet proteinUnique = new HashSet();
        List<Proteins> proteins = Proteins.find.all();

        for (Proteins protein : proteins) {
                proteinUnique.add(protein.name);
        }

    return proteinUnique;
    }

    public static Page<Proteins> proteinpage(int page, int pageSize, String sortBy, String order, String filter) {
        return
            find.where().disjunction()
                .ilike("swissProt", "%" + filter + "%")
                .ilike("name", "%" + filter + "%")
                .endJunction()
                //.join("journal")
		.orderBy("name asc")
                .findPagingList(pageSize)
                .getPage(page);
    }

    
}

