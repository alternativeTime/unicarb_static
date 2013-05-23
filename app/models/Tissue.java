package models;

import java.util.*;

import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

@Entity 
public class Tissue extends Model {

	@Id
	public Long id;

	public String div1;

	public String div2;

	public String div3;

	public String div4;

	@OneToMany
	public List<Stsource> stsource;

	@OneToMany
	public List<Proteinsource> taxproteinsource;
	
	@OneToMany
	public List<Taxtissue> taxtissue;
	
	@OneToMany
	public List<Proteintissue> proteintissue;


	public static Model.Finder<Long,Tissue> find = new Model.Finder<Long,Tissue>(Long.class, Tissue.class);

	public static HashSet sourceSummary() {

		HashSet sourceUnique = new HashSet();
		List<Tissue> source = Tissue.find.all();

		for (Tissue sources : source) {
			sourceUnique.add(sources.div1);
			sourceUnique.add(sources.div2);
			sourceUnique.add(sources.div3);
			sourceUnique.add(sources.div4);

		}

		return sourceUnique;
	}

	public static List<Tissue> findTissue(String tissue) {
		return
				find.where().disjunction()
				.ilike("div1", tissue)
				.ilike("div2", tissue)
				.ilike("div3", tissue)
				.ilike("div4", tissue)
				.findList();
	}

	public static List<SqlRow> findTissueStructures(Long id) {

		String sql = "SELECT stsource.structure_id from public.tissue, public.stsource where tissue.id = stsource.tissue_id and tissue.id = " + id;
	
		RawSql rawSql = RawSqlBuilder.parse(sql).columnMapping("stsource.structure_id", "stsource.structure_id").create();

		SqlQuery sqlQuery = Ebean.createSqlQuery(sql);
		List<SqlRow> listSql = sqlQuery.findList();
		return listSql;
	}


}

