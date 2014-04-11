package models;

import java.util.*;
import javax.persistence.*;
import java.io.IOException;

import org.eurocarbdb.application.glycanbuilder.Glycan;
import org.eurocarbdb.application.glycanbuilder.MassOptions;
import org.eurocarbdb.dataaccess.core.GlycanSequence;
import org.eurocarbdb.sugar.SugarSequence;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

@Entity 
@Table(schema="public", name="translation")
public class Translation extends Model {

    @Id
    public Long id;
    
    public String iupac;
   
    public String ct;

    public String gws;

    @ManyToOne    
    public Structure structure;
    
    //public Long gs;

    public static Model.Finder<Long,Translation> find = new Model.Finder<Long,Translation>(Long.class, Translation.class);

    
    public static List<Translation> searchTranslation(String glycoct) { 
        return
            find.where()
            	.like("ct", glycoct)  
                //.join("strtaxonomy")
		.findList();
    }

    public static Translation searchTransUnique(String glycoct) {
	Translation translation = null;		
	//return 
	translation = find.where().like("ct", glycoct).findUnique();
	if (translation == null ) {
		try{
		//throw new NullPointerException(); // RuntimeException("Query is empty");
		//
		}catch(RuntimeException e) { String err = e.getMessage(); } 
	}
	return translation;
    }
	

    public static Translation translationCT(Long id){
    	return	
	    find.where()
	    	.eq("structure_id", id)
		.findUnique();
    
    }
    
    public static String builder(String glycoct){
    	Glycan g = new Glycan();
    	
    	System.out.println(glycoct);
    	//g.fromGlycoCT(glycoct);
    	
    	
    	
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


     public static Long checkDigestStructure(String ct) {
	Long gsId = -1L;
	Translation translation = new Translation();
	translation = Translation.searchTransUnique(ct);
	if(translation != null && translation.structure.id > 0 ) {  //test change
		return translation.structure.id; //test change
	} else {
		return gsId;
	}

     }

}
