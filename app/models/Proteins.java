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

    @OneToMany
    public List<Proteinstaxonomy> proteinsTax;

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
		.orderBy(sortBy + " " + order)
                .findPagingList(pageSize)
                .getPage(page);
    }

    public static Page<Proteins> proteinpagerefine(int page, int pageSize, String sortBy, String order, String filter) {

	RawSql rawsql = RawSqlBuilder.parse(filter).create();
	System.out.println("fiter" + filter);
        com.avaje.ebean.Query<Proteins> query = Ebean.find(Proteins.class);
	query.setRawSql(rawsql); 

	PagingList<Proteins> pagingList = query.findPagingList(100);
	pagingList.getFutureRowCount();

	Page<Proteins> page2 = pagingList.getPage(page);

	return page2;

    }

    public static List proteinList() {
	List<Proteins> proteins = Proteins.find.all();
	return proteins;
    }

    public static List<Proteins> proteinSearch(String filter) {
	return
	   find.where()
	        .ilike("name", "%" + filter + "%").findList();
    }
}

