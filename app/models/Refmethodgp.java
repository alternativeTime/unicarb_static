package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * Refmethodgp entity managed by Ebean
 */

@Entity
@Table(schema="public", name="refmethodgp")
public class Refmethodgp extends Model {


    @Id
    public Long id;
    @ManyToOne
    public Reference reference;
    @ManyToOne
    public Methodgp methodgp;

    public Refmethodgp() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Refmethodgp(Long id, Reference reference, Method method) {
        super();
        this.id = id;
        this.reference = reference;
        this.methodgp = methodgp;
    }

    public static Finder<Long,Refmethodgp> find = new Finder<Long,Refmethodgp>(Long.class, Refmethodgp.class);

}