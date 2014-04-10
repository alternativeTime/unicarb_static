package models.sub;

import java.util.*;

import javax.persistence.*;


import models.sub.*;
import models.*;
import javax.persistence.*;

import play.Logger;
import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import play.mvc.Content;
import com.avaje.ebean.*;

import org.eurocarbdb.action.core.*;
import org.eurocarbdb.dataaccess.core.seq.*;
import org.eurocarbdb.sugar.Sugar;
import org.eurocarbdb.sugar.SugarSequence;
import org.eurocarbdb.application.glycanbuilder.Glycan;
import static org.eurocarbdb.dataaccess.core.seq.SubstructureQuery.Option.Must_Include_Reducing_Terminus;
import static org.eurocarbdb.dataaccess.core.seq.SubstructureQuery.Option.Must_Include_All_Non_Reducing_Terminii;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import com.google.common.base.Charsets;
import com.google.common.io.Files;

@SuppressWarnings("serial")
@Entity 
@Table(schema="sub", name="glycan_residue_unicarb")
public class GlycanResidueUnicarb {

	/** Unique id */
	public int glycanResidueId;

	/** The GlycanSequence to which this GlycanResidue belongs */
	@ManyToOne
	public GlycanSequence glycanSequence;

	public int parentId;

	public String residueName;

	/** The identity of the residue this GlycanResidue represents */
	//public String residue;

	/** This is the linkage of this residue to its parent, if any */
	public String linkageParent;

	/** The parent of this GlycanResidue, if any */
	public String parent;

	/** The children of this GlycanResidue, if any */
	//public Set<GlycanResidue> children = new HashSet<GlycanResidue>(0);

	public String linkageChild;

	/** The 'left' value of this GlycanResidue in a nested set traversal
	 *   of the {@link Graph} of GlycanResidues to which this GlycanResidue
	 *   belongs. */
	public int leftIndex;

	/** The 'right' value of this GlycanResidue in a nested set traversal
	 *   of the {@link Graph} of GlycanResidues to which this GlycanResidue
	 *   belongs. */
	public int rightIndex;


	public List<SqlRow> SubstructureSearch() { //String ct) {
		SubstructureQuery query = null;
		//Structure s = Structure.find.byId(1);
		String text = "";
		try {
			text = Files.toString(new File("/tmp/test.txt"), Charsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		//text = text.replaceAll("(\\d)\\w(\\d)", "$1,+ $2"); //keep an eye on this
		text = text.replaceAll(" ", "+");
		Logger.info("read file " + text);
		Long id = 2L;
		//Translation t = Translation.find.byId(id);

		SugarSequence seq = new SugarSequence( text.trim() );
		query = new SubstructureQuery( seq.getSugar() );
		//query.setOption( Must_Include_All_Non_Reducing_Terminii );
		query.setOption( Must_Include_All_Non_Reducing_Terminii );


		String q = query.getQueryString();
		q = q.replaceAll("and.*r\\d.anomer =.*(a||b)", "" ).replaceAll("core.", "sub.").replaceAll("seq.glycan_residue", "sub.glycan_residue_unicarb");

		SqlQuery sqlQuery = Ebean.createSqlQuery(q);
		List<SqlRow> listResults = sqlQuery.findList();


		//Logger.info("this is the query string " + q);
		//if ( submitAction.equals("Search core") )
		//query.setOption( Must_Include_Reducing_Terminus );

		//if ( submitAction.equals("Search terminal") )
		//query.setOption( Must_Include_All_Non_Reducing_Terminii );

		//query.execute();

		return listResults; // ok();

	}



}
