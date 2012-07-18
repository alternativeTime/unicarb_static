package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

/**
 * Unicarbdbreference entity managed by Ebean
 */
@Entity 
public class Unicarbdbreference extends Model {

    @Id
    public Long id;
    
    @Constraints.Required
    public String first;
   
    public int year;

    public String volume;
    public String pages;
    public String medline;
    public String title;
    public String authors; 

    //@ManyToOne(fetch=FetchType.EAGER)
     @ManyToOne
    //@JoinColumn(name="id", nullable=false)
    //public Journal getJournal() { return journal; }
    public Journal journal;

    @OneToMany
    public List<Lcmucin> lcmucin;


    
     public Unicarbdbreference(String volume, String pages, String medline, String title, String authors, String first, Journal journal) {
        this.first = first;
        this.volume = volume;
	this.pages = pages;
	this.medline = medline;
	this.title = title;
	this.authors = authors;
	this.journal = journal;
}

    
    /**
     * Generic query helper for entity Unicarbdbreference with id Long
     */
    public static Finder<Long,Unicarbdbreference> find = new Finder<Long,Unicarbdbreference>(Long.class, Unicarbdbreference.class); 
    
    /**
     * Return a page of computer
     *
     * @param page Page to display
     * @param pageSize Number of computers per page
     * @param sortBy Unicarbdbreference property used for sorting
     * @param order Sort order (either or asc or desc)
     * @param filter Filter applied on the name column
     */
    public static Page<Unicarbdbreference> page(int page, int pageSize, String sortBy, String order, String filter) {
        return 
            find.where().disjunction()
		.ilike("title", "%" + filter + "%") 
		.ilike("authors", "%" + filter + "%") 
		.endJunction()
		.join("journal")
                .findPagingList(pageSize)
                .getPage(page);
    }


  public static List<Unicarbdbreference> findJournal(Long id) {
       return find.join("journal")
           .where()
                .eq("id", id)
           .findList();
    }
    
}

