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
@Table(schema="public", name="lcmucin")
public class Lcmucin extends Model {

    @Id
    public Long id;
    public int glycanSequenceId;
    public int biologicalContextId;
    public double retentionTime;
    //public int evidence;
    //public int methodRunId;
    //public int columnId;
    //public int scanId;
    //public int journalReferenceId;
    //public int acquisitionId;
    //public int scanparent;
    //public String gwpname;
    //public String ionizationMethod;
    //public int evidenceLc;
    //public int standard;
    //public int evidenceToGlycoproteinId;
    //public int unicarbreferenceId;

    @ManyToOne
    Unicarbdbreference unicarbdbreference;    

    
    /**
     * Generic query helper for entity Reference with id Long
     */
    public static Finder<Long,Lcmucin> find = new Finder<Long,Lcmucin>(Long.class, Lcmucin.class); 

    
    public static List<SqlRow> groupLcGlycans()  {
	String sql = "SELECT l.glycan_sequence_id FROM public.lcmucin as l group by l.glycan_sequence_id";

        RawSql rawSql = RawSqlBuilder.parse(sql).columnMapping("l.glycan_sequence_id", "l.glycan_sequence_id").create();

        SqlQuery sqlQuery = Ebean.createSqlQuery(sql);
        List<SqlRow> listSql = sqlQuery.findList();

        return listSql;
    }

   
    
}

