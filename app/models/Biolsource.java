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
    public String swiss_prot;

   	@OneToMany
   	public List<Sourceref> sourceref; 

    //@ManyToOne
    //Biolsource biolsource;

    public static List<String> proteinNames;
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

    public static List<List<String>> findTaxonomyProteinString(String taxon) {

	System.out.println("sit here once?");
	String sql = "SELECT biolsource.protein, proteins.name FROM public.biolsource, public.proteins WHERE biolsource.protein = proteins.name and biolsource.taxonomy ilike '" + taxon +  "' group by  biolsource.protein, proteins.name";

	RawSql rawSql = RawSqlBuilder.parse(sql).columnMapping("proteins.name", "proteins.name").columnMapping("biolsource.protein", "biolsource.protein").create();

	SqlQuery sqlQuery = Ebean.createSqlQuery(sql);
        List<SqlRow> listSql = sqlQuery.findList();
	System.out.println("check rowsss " + listSql.size() );
	String protein = "";
	List<String> proteinNames = new ArrayList<String>();

	List <String[]> result = new ArrayList<String[]>();
	int columnCount = 0;
	String[] rowresult = new String[2];	

	ArrayList<String> results = new ArrayList<String>();
	HashMap<String,String> zl = new HashMap<String,String>();
	List<List<String>> addresses = new ArrayList<List<String>>();
	 
	for (SqlRow row : listSql) {
                //System.out.println("check row " + row.getString("protein") );
		String proteinfound = row.getString("protein").toString();
		proteinNames.add(proteinfound);
		//System.out.println("check row again " + proteinfound);

		//rowresult[0] = proteinfound;
		//rowresult[1] = "taxon";

		//result.add(proteinfound, "taxon");

		ArrayList<String> single = new ArrayList<String>();
		single.add(proteinfound);
		single.add(taxon);
		addresses.add(single);
		

		//result.add(rowresult);
		
        }

        return addresses;	
    }
	public static List<Biolsource> findTaxonomyProtein(String taxon) {
        return
            find.where()
                .ilike("taxonomy", "%" + taxon + "%")
                .findList();
    }

	public static List<Biolsource> findBiolSourceIds(String protein) {
		return
			find.where().disjunction()
				.ilike("swiss_prot", protein)
				.ilike("protein", protein)
				.findList();
	}
    
}

