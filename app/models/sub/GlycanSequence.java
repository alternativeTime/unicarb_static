package models.sub;

import java.util.*;

import javax.persistence.*;


import models.sub.*;

import javax.persistence.*;

import play.Logger;
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
@Table(schema="sub", name="glycan_sequence")
public class GlycanSequence extends Model {

	@Id
	public Long glycanSequenceId;

	public String sequenceGws;
	public String sequenceCtCondensed;
	
	@OneToMany
	public List<GlycanResidueUnicarb> glycanResidueUnicarb;
	
	
}
