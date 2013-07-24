package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

@Entity 
@Table(schema="public", name="protein_glycosylation_sites")
public class ProteinGlycosylationSites extends Model {

    @Id
    public Long id;

    public int structure_id;

    public String amino_acid_link;

    public String core_type;

    public String link_sugar;

    public String glycan_type;

    public int source_id;

    public String swiss_prot;

    public String glyco_aa;

    public String glyco_aa_site;

    public String recombinant;

    public Double abundance;

    public String confirmed;

    public String amino_acid_position;

    @ManyToOne
    public Proteins proteins;


    public static Model.Finder<Long,ProteinGlycosylationSites> find = new Model.Finder<Long,ProteinGlycosylationSites>(Long.class, ProteinGlycosylationSites.class);

}
    
