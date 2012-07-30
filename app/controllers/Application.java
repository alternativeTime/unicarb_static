package controllers;

import java.util.*;

import play.mvc.*;
import play.data.*;
import play.*;

import views.html.*;

import models.*;

import com.avaje.ebean.*; //dont think this should be here due to SqlRow
import static play.libs.Json.toJson;
import static play.libs.Json.*;
import java.net.URLDecoder;
import java.io.UnsupportedEncodingException;

/**
 * Manage a database of computers
 */
public class Application extends Controller {
    
    /**
     * This result directly redirect to application home.
     */
    public static Result GO_HOME = redirect(
        routes.Application.list2(0, "name", "asc", "")
    );
	
    public static Result stref(Long id) {
    	System.out.println("testing params value " + id);
    	Streference display = Streference.find.byId(id);

    	return ok( 
    			//render(id, display)t
    			stref.ref().render(display)
    			); 
    };

    public static Result structureDetails(Long id) {

	//Structure strDisplay = Structure.find.byId(id);
    List<Structure> strDisplay = Structure.findStructureRef(id);
    ArrayList proteinNames = new ArrayList();
    HashSet proteinNamesUnique = new HashSet();
    ArrayList taxNames = new ArrayList();
    ArrayList taxDivs = new ArrayList();
    HashSet taxNamesUnique = new HashSet();
    ArrayList sourceNames = new ArrayList();
    HashSet sourceNamesUnique = new HashSet();
    ArrayList uniprot = new ArrayList();
    HashSet uniprotUnique = new HashSet();
    ArrayList taxIds = new ArrayList();
    HashSet taxIdsUnique = new HashSet();
    HashSet taxDivsUnique = new HashSet();


    List<String[]> rowList = new ArrayList<String[]>();
     Map<String, Integer> m = new HashMap<String, Integer>();

    //rowList.add(new int[] { 1, 2, 3 });
	
    if (strDisplay !=null){
    	for (Structure entries : strDisplay){
    		List<Stproteins> stToProtein = entries.stproteins;
		List<Strtaxonomy> stToTax = entries.strtaxonomy;
		List<Stsource> stToSource = entries.stsource;
    		if (!stToProtein.isEmpty()) {
    			for (Stproteins stProteinEntry : stToProtein){
    				String proteinName = stProteinEntry.proteins.name;
    				proteinNamesUnique.add(proteinName);
				uniprotUnique.add(uniprot); //dead
    			}
    			proteinNames.addAll(proteinNamesUnique);
			uniprot.addAll(uniprotUnique);
			rowList.add(new String[] {"hello", "test"});
			 rowList.add(new String[] {"hlo", "tt"});
    		}

		if (!stToTax.isEmpty()){
			for (Strtaxonomy stTaxEntry : stToTax){
				String taxName = stTaxEntry.taxonomy.species;
				Long taxId = stTaxEntry.taxonomy.id;
				taxNamesUnique.add(taxName);
				taxIdsUnique.add(taxId);
				String divtax = "<a href=\"../taxonomy/" + stTaxEntry.taxonomy.id + "\">" + taxName + "</a>";
				taxDivsUnique.add(divtax);
			}
			taxNames.addAll(taxNamesUnique);
			taxIds.addAll(taxIdsUnique);
			taxDivs.addAll(taxDivsUnique);
		}

		if (!stToSource.isEmpty()){
			for (Stsource stSourceEntry : stToSource) {
				String div = "<a href=\"../taxonomy/" +  stSourceEntry.source.id + "\"> > " + stSourceEntry.source.div1 + " > " + stSourceEntry.source.div2 + " > " + stSourceEntry.source.div3 + " > " + stSourceEntry.source.div4 + "</a> <br />";
				sourceNamesUnique.add(div);
			}
			
			sourceNames.addAll(sourceNamesUnique);
		}
    	}
    }
    
	//Application str;
	return ok(
			structureDetails.render(strDisplay, id, proteinNames, taxNames, sourceNames, rowList, uniprot, taxDivs)
			
	);
    };

    public static Result refdisplay(Long id) {
    	System.out.println("testingssss params value for reference " + id);
    	//Reference displayReference = null;
    	Reference displayReferencce = Reference.find.byId(id);
	List<Reference> t = Reference.findJournal(id);
	List<Method> m = Method.findmethod(id);
	List<Reference> u = Reference.findRefMethods(id);

	for (Reference r : t ) {
		List<Sourceref> biol = r.sourceref;		
	}
	
	ArrayList taxsources = new ArrayList();
	ArrayList proteinsources = new ArrayList();
	HashSet hs = new HashSet();
	HashSet proteinHs = new HashSet();
	
	for (Reference taxfind : u){
		List<Sourceref> source = taxfind.sourceref;
		for (Sourceref tax : source){
			hs.add(tax.biolsource.taxonomy);
			proteinHs.add(tax.biolsource.protein);
			//String taxsource = tax.biolsource.taxonomy;
			//taxsources.add(taxsource); 
		}
	}
	
	taxsources.addAll(hs);
	proteinsources.addAll(proteinHs);
	
    	//List<Reference> sourcered = Reference.findSourceref(id);	
	System.out.println("testing value: " + t.size() ) ;
    	return ok( 
    			//refdisplay.render(displayReference)
    			//list2.
    			//refdisplay.ref().render(displayReferencce)
			refdisplay.render("View selected reference", t, u, taxsources, proteinsources)
    			); 
    };
    

    
    /*
    private static Content render(Reference displayReference) {
		// TODO Auto-generated method stub
		return null;
	} */

	/**
     * Handle default path requests, redirect to computers list
     */
    public static Result index() {
        //return GO_HOME;
	return ok ( index.render() );
    }

    public static Result search() {
	return ok (search.render() );
    }

    /*public static Result saySearch(String structure) {
	try{
		String result = URLDecoder.decode(structure, "UTF-8");
		System.out.println("string test; " + result);
	} catch (UnsupportedEncodingException e) {
        e.printStackTrace();
    }
	
		controllers.Search.searchStructure();
	//return ok (saysearch.render() );
	return ok ( saySearch.render() );
    }*/
	
    public static Result ms() {
	List<SqlRow> results = Lcmucin.groupLcGlycans();
        return ok ( ms.render(results) );
    }

    /**
     * Display the taxon search results.
     * @param taxon Search taxon string
    */
    public static Result taxonDetails(Long id){
	Taxonomy taxonomy  = Taxonomy.find.byId(id);
	String taxon = taxonomy.species;
        List<Biolsource> biolsource = Biolsource.findTaxonomyProtein(taxon);
	List<SqlRow> listSql = Biolsource.findTaxonomyProteinSQL(taxon);
	//return TODO;
	return ok(
		taxonDetails.render("Taxonomy Description", taxonomy, biolsource, listSql)
	);
    }


    /**
     * Display the paginated list of computers.
     *
     * @param page Current page number (starts from 0)
     * @param sortBy Column to be sorted
     * @param order Sort order (either asc or desc)
     * @param filter Filter applied on computer names
     */
    public static Result list2(int page, String sortBy, String order, String filter) {
        return ok(
            list.render(
                Reference.page(page, 10, sortBy, order, filter),
                sortBy, order, filter
            )
        );
    }

    /**
     * Display the paginated list of unicarbreferences.
     *
     * @param page Current page number (starts from 0)
     * @param sortBy Column to be sorted
     * @param order Sort order (either asc or desc)
     * @param filter Filter applied on computer names
     */
    public static Result unicarb(int page, String sortBy, String order, String filter) {
        return ok(
            unicarb.render(
                Unicarbdbreference.page(page, 10, sortBy, order, filter),
                sortBy, order, filter
            )
        );
    }

    public static Result findAllSpecies() {
	List<String> speciesCollection = Taxonomy.findSpecies();
 	
	//AString target = "[ ";	
	String target = "";
	for(String species : speciesCollection) {
		//target += "\"" + species + "\", ";
		target += "replacethis" + species + "replacethis, ";
	}
	String endTarget = ""; // " ]";
	String finalTarget = target.concat(endTarget).toString();
	System.out.println("final string: " + finalTarget);
	return ok(
		species.render("Display Species", speciesCollection, finalTarget)
	);
    }

    
    /**
     * Display the 'edit form' of a existing Computer.
     *
     * @param id Id of the computer to edit
     */
    /*public static Result edit(Long id) {
        Form<Reference> computerForm = form(Reference.class).fill(
            Reference.find.byId(id)
        );
        return ok(
            editForm.render(id, computerForm)
        );
    }*/
    
    /**
     * Handle the 'edit form' submission 
     *
     * @param id Id of the computer to edit
     */
    /*public static Result update(Long id) {
        Form<Reference> computerForm = form(Reference.class).bindFromRequest();
        if(computerForm.hasErrors()) {
            return badRequest(editForm.render(id, computerForm));
        }
        computerForm.get().update(id);
        flash("success", "Reference " + computerForm.get().name + " has been updated");
        return GO_HOME;
    }
    */
    /**
     * Display the 'new computer form'.
     */
    /*public static Result create() {
        Form<Reference> computerForm = form(Reference.class);
        return ok(
            createForm.render(computerForm)
        );
    }
   */ 
    /**
     * Handle the 'new computer form' submission 
     */
    /*public static Result save() {
        Form<Reference> computerForm = form(Reference.class).bindFromRequest();
        if(computerForm.hasErrors()) {
            return badRequest(createForm.render(computerForm));
        }
        computerForm.get().save();
        flash("success", "Reference " + computerForm.get().name + " has been created");
        return GO_HOME;
    }
    */
    /**
     * Handle computer deletion
     */
    /*public static Result delete(Long id) {
        Reference.find.ref(id).delete();
        flash("success", "Reference has been deleted");
        return GO_HOME;
    }
    */

/*    public static int AUTOCOMPLETE_MAX = 10;
	public static void autocompletesearch(final String term) {
   final List<autocompletesearch> response = new ArrayList<autocompletesearch>();
   int index = 1;
   for (String label : Taxonomy.species()) {
      final String value = String.valueOf(index);
      if (label.toLowerCase().startsWith(term.toLowerCase())) {
         response.add(new autocompleteValue(value, label));
      }
      if (response.size() == AUTOCOMPLETE_MAX) {
         break;
      }
      index++;
   }
   //renderJSON(response);
ok(toJson(response));
	}
*/

/*    public static Result taxonsearch (String term) {
	//public static void taxonsearch(final String term) {
	//List<Taxonomy> taxonomy = Taxonomy.findList("upper(species) like upper(?)", term + "%").fetch();
	final List<SqlRow> taxonomy = Taxonomy.findTaxonomy(term);
	toJson(taxonomy);
	// renderJSON(taxonomy);
	 ok(toJson(taxonomy));

	

    } 
*/
}
            
