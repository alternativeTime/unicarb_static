package models.core;

import java.util.*;

import javax.persistence.*;


import models.core.*;

import javax.persistence.*;

import play.Logger;
import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import play.mvc.Content;
import com.avaje.ebean.*;

@SuppressWarnings("serial")
@Entity 
@Table(schema="core", name="glycan_residue")
public class GlycanResidue {
	
	/** Unique id */
    public int glycanResidueId;

    /** The GlycanSequence to which this GlycanResidue belongs */
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

}
