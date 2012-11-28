package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

/**
 * Reference entity managed by Ebean
 */
@Entity 
public class Reference extends Model {

    @Id
    public Long id;
    
    @Constraints.Required
    public String first;
   
    public int year;

    public String volume;
    public String pages;
    public String medline;
    public String pmid;
    public String title;
    public String authors; 

    //@ManyToOne(fetch=FetchType.EAGER)
     @ManyToOne
    //@JoinColumn(name="id", nullable=false)
    //public Journal getJournal() { return journal; }
    public Journal journal;

    @OneToMany
    public List<Streference> streference;

    @OneToMany
    public List<Sourceref> sourceref;

    @OneToMany
    public List<Refmethod> refmethod;
    
     public Reference(String volume, String pages, String medline, String title, String authors, String first, Journal journal) {
        this.first = first;
        this.volume = volume;
	this.pages = pages;
	this.medline = medline;
	this.title = title;
	this.authors = authors;
	this.journal = journal;
}

    
    /**
     * Generic query helper for entity Reference with id Long
     */
    public static Finder<Long,Reference> find = new Finder<Long,Reference>(Long.class, Reference.class); 
    
    /**
     * Return a page of computer
     *
     * @param page Page to display
     * @param pageSize Number of computers per page
     * @param sortBy Reference property used for sorting
     * @param order Sort order (either or asc or desc)
     * @param filter Filter applied on the name column
     */
    public static Page<Reference> page(int page, int pageSize, String sortBy, String order, String filter) {
        return 
            find.where().disjunction()
		.ilike("title", "%" + filter + "%") 
		.ilike("authors", "%" + filter + "%") 
		.endJunction()
		.join("journal")
                .findPagingList(pageSize)
                .getPage(page);
    }


  public static List<Reference> findJournal(Long id) {
       return find.join("journal").join("sourceref").join("sourceref.biolsource")
           .where()
                .eq("id", id)
           .findList();
    }
  
  public static List<Reference> findRefMethods(Long id) {
      return find.join("refmethod.method")
          .where()
               .eq("id", id)
          .findList();
   }

   public static List<Reference> findSourceref(Long id) {
	return find.join("sourceref").join("method")
	   .where()
		.eq("reference_id", id)
	   .findList();
   }
   

    
}

