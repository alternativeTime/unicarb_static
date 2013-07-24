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
@Table(schema="public", name="biolsource")
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

		String sql = "SELECT biolsource.protein, biolsource.swiss_prot, proteins.name FROM public.biolsource, public.proteins WHERE biolsource.protein = proteins.name and biolsource.taxonomy ilike '" + taxon +  "' group by biolsource.swiss_prot,  biolsource.protein, proteins.name";
		SqlQuery sqlQuery = Ebean.createSqlQuery(sql);

		List<SqlRow> listSql = sqlQuery.findList();
		return listSql;
	}

	public static List<List<String>> findTaxonomyProteinString(String taxon) {

		System.out.println("sit here once?");
		String sql = "SELECT biolsource.protein, proteins.name FROM public.biolsource, public.proteins WHERE biolsource.protein = proteins.name and biolsource.taxonomy ilike '" + taxon +  "' group by  biolsource.protein, proteins.name";

	
		SqlQuery sqlQuery = Ebean.createSqlQuery(sql);
		List<SqlRow> listSql = sqlQuery.findList();

		List<String> proteinNames = new ArrayList<String>();


		List<List<String>> addresses = new ArrayList<List<String>>();

		for (SqlRow row : listSql) {

			String proteinfound = row.getString("protein").toString();
			proteinNames.add(proteinfound);

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
	
	/*
	 * Use to find a single swissprot id
	 */
	public static List<Biolsource> findBiolSourceIdsUniProt(String protein) {
	System.out.println("test here");
		return
				find.where()
				.ilike("swiss_prot", protein)
				.findList();
	}
	
	/*
	 * A few glycosuite entries have multiple accession ids 
	 * Use this method where a single search is null
	 */
	public static List<Biolsource> findBiolSourceIdsUniProtMultiple(String protein){
		return
				find.where().disjunction()
				.ilike("swiss_prot", "%" + protein + "%")
				.findList();
	}

	public static List<Biolsource> findBiolSourceIdsName(String protein) {
		return
				find.where().disjunction()
				.ilike("protein", protein)
				.findList();
	} 


	public static ArrayList<SqlRow> findBiolsourceRefs(String protein) {
		List<SqlRow> listSql = null;
		ArrayList<SqlRow> listSqlArray = new ArrayList<SqlRow>();
		String proteinName = "";
		ArrayList<Biolsource> biolSourceProtein = new ArrayList<Biolsource>();
		List<Biolsource> biolSourceProteins = Biolsource.findBiolSourceIds(protein);
		for(Biolsource biol : biolSourceProteins){
			proteinName = biol.protein;
			Biolsource objectBiolSource = Ebean.find(Biolsource.class, biol.id);
			biolSourceProtein.add(objectBiolSource);

			listSql = Sourceref.findReferenceSource(biol.id);
			listSqlArray.addAll(listSql);

		}
		return listSqlArray;
	}

}

