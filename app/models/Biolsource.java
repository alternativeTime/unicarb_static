package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

/**
 * Structure entity managed by Ebean
 */
@Entity 
public class Biolsource extends Model {

    @Id
    public Long id;
    
    public String protein;
    public String taxonomy;

   // @OneToMany
   // public List<Sourceref> sourceref; 

    //@ManyToOne
    //Biolsource biolsource;

    
    /**
     * Generic query helper for entity Reference with id Long
     */
    public static Finder<Long,Biolsource> find = new Finder<Long,Biolsource>(Long.class, Biolsource.class); 
   
    public static List<SqlRow> findTaxonomyProteinSQL(String taxon) {

	String sql = "SELECT biolsource.protein, proteins.name FROM public.biolsource, public.proteins WHERE biolsource.protein = proteins.name and biolsource.taxonomy ilike '" + taxon +  "' group by  biolsource.protein, proteins.name";

	RawSql rawSql = RawSqlBuilder.parse(sql).columnMapping("proteins.name", "proteins.name").columnMapping("biolsource.protein", "biolsource.protein").create();
   
	SqlQuery sqlQuery = Ebean.createSqlQuery(sql);
	List<SqlRow> listSql = sqlQuery.findList();
	return listSql;
    }
	public static List<Biolsource> findTaxonomyProtein(String taxon) {
        return
            find.where()
                .ilike("taxonomy", "%" + taxon + "%")
                .findList();
    }
    
}

