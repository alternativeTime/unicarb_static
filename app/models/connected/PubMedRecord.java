package models.connected;

/**
 * Created by matthew on 3/06/2014.
 */
public class PubMedRecord {

    protected Integer pubMedID; //Unique id used to find this record
    protected String title; //Title of paper
    protected Integer yearCreated; //Year paper was published
    protected String citation; //Full citation of paper
    protected String abs; //Abstract

    /**
     * This MUST be easily parseable in CachedPubmedAbstractsDB
     */
    public String toString() {
        return pubMedID + "\t" + yearCreated + "\t" + title + "\t" + getCitation() + "\t" + abs;
    }

    public String getCitation() {
        return citation;
    }

    public String getAbstract() {
        return abs;
    }

    /**
     * Obtain publication date of record
     * @return
     */
    public int getYear() {
        return yearCreated;
    }

    public String getTitle() {
        return title;
    }

}

