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


	public static HashSet taxSummary() {

		HashSet taxUnique = new HashSet();
		List<GlycobaseSource> glycobasesource = GlycobaseSource.find.all();

		for (GlycobaseSource glycobaseAll : glycobasesource) {
			taxUnique.add(glycobaseAll.tax_species);

		}

		return taxUnique;
	}

	public static HashSet tissueSummary() {
		HashSet tissueUnique = new HashSet();
		List<GlycobaseSource> glycobasetissue = GlycobaseSource.find.all();
		for(GlycobaseSource glycobaseAll : glycobasetissue) {
			tissueUnique.add(glycobaseAll.tissue);
		}
		return tissueUnique;
	}


	public static String findPerturbation(String search) {

		String sql = "SELECT connected.glycobase_source.tax_species, connected.glycobase_source.perturbation FROM connected.glycobase_source WHERE connected.glycobase_source.perturbation ilike '" + search + "' group by connected.glycobase_source.tax_species, connected.glycobase_source.perturbation";

		SqlQuery sqlQuery = Ebean.createSqlQuery(sql);
		List<SqlRow> listSql = sqlQuery.findList();
		String output = "";
		if (listSql.size() > 0 ) {

			int numberStructures = findGlycobasePerturbationStructure(search);
			output = "<h3 style=\"text-transform:uppercase\" ><a href=\"#\">" + search + "</a></h3><div class=\"details span9\"><p class=\"\">";

			for(SqlRow row : listSql) {
				if (row.get("perturbation") != null  ) {
					output = output + row.get("perturbation") + ", " ;
				}
			}
			output = output + "</p></div>";
			output = output + "<div class=\"span3\"><p class=\"pull-right structures\"><a href=\"#\">" + numberStructures + " structures </a></p></div>";

		}

		return output;

	}


	public static String findGlycobaseTaxonomy(String search) {

		String sql = "SELECT connected.glycobase_source.tax_species, connected.glycobase_source.perturbation FROM connected.glycobase_source WHERE connected.glycobase_source.tax_species ilike '" + search + "' group by connected.glycobase_source.tax_species, connected.glycobase_source.perturbation";


		SqlQuery sqlQuery = Ebean.createSqlQuery(sql);
		List<SqlRow> listSql = sqlQuery.findList();
		String output = "";
		if (listSql.size() > 0 ) {

			int numberStructures = GlycobaseSource.findGlycobaseTaxonomyStructure(search);
			output = "<h3 style=\"text-transform:uppercase\" ><a href=\"#\">" + search + "</a></h3><div class=\"details span9\"><p class=\"\">";

			for(SqlRow row : listSql) {
				if (row.get("perturbation") != null  ) {	
					output = output + row.get("perturbation") + ", " ;
				}
			}
			output = output + "</p></div>";
			output = output + "<div class=\"span3\"><p class=\"pull-right structures\"><a href=\"#\">" + numberStructures + " structures </a></p></div>";
		}

		return output; 
	}

	public static String findGlycobaseTissue(String search) {


		String sql = "SELECT connected.glycobase_source.tissue, connected.glycobase_source.tax_species FROM connected.glycobase_source WHERE connected.glycobase_source.tissue ilike '" + search + "' group by connected.glycobase_source.tissue, connected.glycobase_source.tax_species";

		SqlQuery sqlQuery = Ebean.createSqlQuery(sql);
		List<SqlRow> listSql = sqlQuery.findList();
		String output = "";
		if (listSql.size() > 0 ) {

			int numberStructures = GlycobaseSource.findGlycobaseTissueStructure(search);
			output = "<h3 style=\"text-transform:uppercase\" ><a href=\"#\">" + search + "</a></h3><div class=\"details span9\"><p class=\"\">";

			for(SqlRow row : listSql) {
				if (row.get("tissue") != null  ) {
					output = output + row.get("tax_species") + ", " ;
				}
			}
			output = output + "</p></div>";
			output = output + "<div class=\"span3\"><p class=\"pull-right structures\"><a href=\"#\">" + numberStructures + " structures </a></p></div>";

		}

		return output;
	}

	public static int findGlycobaseTissueStructure(String search) {

		String sql = "SELECT connected.glycobase_source.glycan_id, connected.glycobase_source.tissue, connected.glycobase_source.tax_species FROM connected.glycobase_source WHERE connected.glycobase_source.tissue ilike '" + search + "' group by connected.glycobase_source.tissue, connected.glycobase_source.tax_species, connected.glycobase_source.glycan_id";

		SqlQuery sqlQuery = Ebean.createSqlQuery(sql);
		List<SqlRow> listSql = sqlQuery.findList();
		int structureNumber = listSql.size();

		return structureNumber;
	}

	public static int findGlycobasePerturbationStructure(String search) {

		String sql = "SELECT connected.glycobase_source.glycan_id, connected.glycobase_source.tax_species, connected.glycobase_source.perturbation FROM connected.glycobase_source WHERE connected.glycobase_source.perturbation ilike '" + search + "' group by connected.glycobase_source.tax_species, connected.glycobase_source.perturbation, connected.glycobase_source.glycan_id";

		SqlQuery sqlQuery = Ebean.createSqlQuery(sql);
		List<SqlRow> listSql = sqlQuery.findList();
		int structureNumber = listSql.size();

		return structureNumber;
	}

	public static int findGlycobaseTaxonomyStructure(String search) {
		String sql = "SELECT connected.glycobase_source.glycan_id, connected.glycobase_source.tax_species, connected.glycobase_source.perturbation FROM connected.glycobase_source WHERE connected.glycobase_source.tax_species ilike '" + search + "' group by connected.glycobase_source.tax_species, connected.glycobase_source.perturbation, connected.glycobase_source.glycan_id";

		SqlQuery sqlQuery = Ebean.createSqlQuery(sql);
		List<SqlRow> listSql = sqlQuery.findList();
		int structureNumber = listSql.size();

		return structureNumber;
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

