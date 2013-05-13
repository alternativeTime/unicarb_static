package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.ebean.Model;

@Entity 
public class Proteinsource extends Model {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    public Long id;
    
    public String name;
    public String swissprot;
    public String system;
    public String common;
    public String classname;
    public String species;
    public String div1;
    public String div2;
    public String div3;
    public String div4;
    
    public static Model.Finder<Long,Proteinsource> find = new Model.Finder<Long,Proteinsource>(Long.class, Proteinsource.class);

    public static List<Proteinsource> findProteinsource(String protein) {
        return
           find.where().ilike("swissprot", protein).findList();
   }

	
}