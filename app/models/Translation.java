package models;

import java.util.*;
import javax.persistence.*;

import org.eurocarbdb.application.glycanbuilder.Glycan;
import org.eurocarbdb.application.glycanbuilder.MassOptions;
import org.eurocarbdb.dataaccess.core.GlycanSequence;
import org.eurocarbdb.sugar.SugarSequence;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

@Entity 
public class Translation extends Model {

    @Id
    public Long id;
    
    public String iupac;
   
    public String ct;

    public String gws;
    
    public Long gs;


    public static Model.Finder<Long,Translation> find = new Model.Finder<Long,Translation>(Long.class, Translation.class);

    
    public static List<Translation> searchTranslation(String glycoct) { 
        return
            find.where()
            	.like("ct", glycoct)  
                //.join("strtaxonomy")
		.findList();
    }
    
	public static String builder(String glycoct){
    	Glycan g = new Glycan();
    	
    	System.out.println(glycoct);
    	//g.fromGlycoCT(glycoct);
    	g.fromGlycoCTCondensed(glycoct);
    	
    	
    	
    	String option = MassOptions.NO_DERIVATIZATION;

        MassOptions masso = new MassOptions();

        masso.ION_CLOUD.clear();
        masso.setDerivatization(option);


        g.setMassOptions(masso);
        //g.setCharges(ic);

        double mass = g.computeMass();
        System.out.println("mass result is --- " + mass); 
    	
    	return "this value";
    	
    }
}
