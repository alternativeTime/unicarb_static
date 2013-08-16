package models;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import javax.persistence.*;

import play.Logger;
import play.db.ebean.*;
import play.db.ebean.Model.Finder;
import play.data.format.*;
import play.data.validation.*;
import play.mvc.Content;

import com.avaje.ebean.*;

/**
 * Structure entity managed by Ebean
 */
@SuppressWarnings("serial")
@Entity 
@Table(schema="public", name="enzyme")
public class Enzyme extends Model {
	
	@Id
	public Long id;
	
	public String jcggdb; //e from excel sheet to be removed
	public String kegg; //p
	public String name; //al
	public String goterm; //col az
	
	public static Finder<Long,Enzyme> find = new Finder<Long,Enzyme>(Long.class, Enzyme.class);
	
}

