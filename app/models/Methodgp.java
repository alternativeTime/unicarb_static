package models;

import java.util.*;

import javax.persistence.*;

import play.db.ebean.*;
import play.db.ebean.Model.Finder;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

/**
 * Method entity managed by Ebean
 */
@Entity
@Table(schema="public", name="methodgp")
public class Methodgp extends Model {

    @Id
    public Long id;
    public String description;
    public Long confidence;

    //@OneToMany
    //List<Refmethodgp> refmethodgps;



    public static Finder<Long,Methodgp> find = new Finder<Long,Methodgp>(Long.class, Methodgp.class);

    public static List<Methodgp> findmethodgp(Long id) {
        return find
                .where()
                .eq("id", id)
                .findList();
    }


}