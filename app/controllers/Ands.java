package controllers;
import java.util.*;

import play.mvc.*;
import play.data.*;
import play.*;
import play.cache.*;

import views.html.*;

import models.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import static play.data.Form.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import models.Journal;
import models.Reference;

import org.ands.rifcs.base.Address;
import org.ands.rifcs.base.Collection;
import org.ands.rifcs.base.Description;
import org.ands.rifcs.base.Electronic;
import org.ands.rifcs.base.Identifier;
import org.ands.rifcs.base.Location;
import org.ands.rifcs.base.Name;
import org.ands.rifcs.base.Physical;
import org.ands.rifcs.base.RIFCS;
import org.ands.rifcs.base.RIFCSException;
import org.ands.rifcs.base.RIFCSWrapper;
import org.ands.rifcs.base.RegistryObject;
import org.ands.rifcs.base.RelatedInfo;
import org.ands.rifcs.base.RelatedObject;
import org.ands.rifcs.base.Relation;
import org.xml.sax.SAXException;



/* 
 * To be used to generate ANDS RIFCS 
 */

public class Ands extends Controller {

	/** The rifcs. */
	private static RIFCS rifcs = null;

	public static Result ands() throws FileNotFoundException, RIFCSException, SAXException, ParserConfigurationException, IOException {
		
		String pubmedId = "111";
    String title = "klsksks";
    String url = null;
    String authors = "sks";
    String volume = "o[o[p";
    String journal = "xxx";
    int pubyear = 1;

		List<Reference> ref = Reference.find.fetch("journal").findList();
		for(Reference r : ref){
			Logger.info(r.pmid + r.title + r.id + r.authors + r.volume + r.journal.name + r.year);
					generateRIF(r.pmid, r.title, r.id, r.authors, r.volume, r.journal.name, r.year);
		}

		return ok(
				ands.render()			
				);		

	}

    
    

	private static void generateRIF(String pubmedId, String title, Long url, String authors, String volume, String journal, int pubyear) throws RIFCSException, FileNotFoundException, SAXException, ParserConfigurationException, IOException {
		RIFCSWrapper mw = new RIFCSWrapper();
		rifcs = mw.getRIFCSObject();

		RegistryObject r = rifcs.newRegistryObject();

		r.setKey("bmfrc-paper-" + pubmedId);

		r.setGroup("Macquarie University");

		r.setOriginatingSource("http://glycosuitedb.expasy.org");

		String url1 = "http://unicarbkb.org/reference/" + url;

		Collection c = r.newCollection();
		c.setType("collection");
		c.addIdentifier(url1, "url");   //temp ignore and changed to url

		Name name = c.newName();
		name.setType("primary");

		name.addNamePart(title, "");

		c.addName(name);

		Location l = c.newLocation();

		Address a = l.newAddress();
		Physical p = a.newPhysical();
		Electronic elect = a.newElectronic();

		elect.setType("url"); //changed to url from uri
		elect.setValue(url1);
		a.addElectronic(elect);

		l.addAddress(a);
		c.addLocation(l);


		RelatedObject object = c.newRelatedObject();
		Relation relation = object.newRelation();
		object.setKey("bmfrc-database-1");
		relation.setType("hasPart");
		relation.setDescription("The results (meta-data and glycan structures) from this paper have been curated by GlycoSuiteDB.");
		object.addRelation(relation);
		c.addRelatedObject(object);

		RelatedObject object2 = c.newRelatedObject();
		Relation relation2 = object2.newRelation();

		object2.setKey("http://www.chem.mq.edu.au/academics/npacker.html");
		relation2.setType("isManagedBy");
		object2.addRelation(relation2);
		c.addRelatedObject(object2);


		Description descriptionbrief = c.newDescription();
		descriptionbrief.setType("brief");
		descriptionbrief.setValue("GlycoSuiteDB is a curated database of carbohydrate (glycan) structures sourced from published material. This entry corresponds to a catologue of structures reported in the publication - " + title);
		//add title above
		c.addDescription(descriptionbrief);

		Description descriptionrights = c.newDescription();
		descriptionrights.setType("rights");
		descriptionrights.setValue("Copyright. Macquarie University (Biomolecular Frontiers Research Centre), Australia; Proteome Informatics Group (Swiss Institute for Bioinformatics)");
		c.addDescription(descriptionrights);

		Description descriptionnote = c.newDescription();
		descriptionnote.setType("note");
		descriptionnote.setValue("The results obtained in the context of research activities will be immediately made available to the scientific community through the portal, taking due precautions for protecting the potential for exploiting the results and will be be disseminated and exploited at the other research initiatives in the network as soon as feasible.");
		c.addDescription(descriptionnote);

		Description descriptionaccess = c.newDescription();
		descriptionaccess.setType("accessRights");
		descriptionaccess.setValue("UniCarb-DB is open source platform and an open access resource. The resources published via the platform need to be referenced when used. For example: UniCarb-DB, http://www.unicarb-db.org last accessed: dd/mm/yyyy. with citation");
		c.addDescription(descriptionaccess);

		RelatedInfo relatedinfoPubmed = c.newRelatedInfo();
		relatedinfoPubmed.setType("publication");
		relatedinfoPubmed.setIdentifier("http://www.ncbi.nlm.nih.gov/pubmed/" + pubmedId, "uri" );

		relatedinfoPubmed.setTitle(authors + " " + journal + " " + pubyear);
		c.addRelatedInfo(relatedinfoPubmed);


		RelatedInfo relatedinfo = c.newRelatedInfo();
		relatedinfo.setType("website");
		relatedinfo.setIdentifier("http://www.isb-sib.ch", "uri");
		relatedinfo.setTitle("Swiss Institute for Bioinformatics");
		c.addRelatedInfo(relatedinfo);


		//c.addSubject("N-linked", "local", "en");
		c.addSubject("O-linked", "local", "en");
		c.addSubject("060101", "anzsrc-for", "en");
		c.addSubject("0601", "anzsrc-for", "en");
		c.addSubject("060102", "anzsrc-for", "en");
		c.addSubject("Carbohydrate Sequence", "local", "en");

		r.addCollection(c);
		rifcs.addRegistryObject(r);

		String file_name = "/tmp/bmfrc-paper-" + pubmedId + ".xml";
		OutputStream output = new FileOutputStream(file_name);
		mw.write(output);


	}


}