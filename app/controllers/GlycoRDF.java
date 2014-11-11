package controllers;

import com.hp.hpl.jena.query.*;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import org.apache.jena.riot.RDFFormat;
import org.expasy.glycanrdf.query.QueryGenerator;
import org.expasy.glycanrdf.rdf.model.RDFModelOne;
import org.expasy.glycanrdf.rdf.query.VirtuosoQueryGeneratorExtend;
import org.expasy.mzjava.glycomics.io.mol.glycoct.GlycoCTReader;
import play.Logger;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;


/**
 * Created by matthew on 11/11/14.
 */
public class GlycoRDF extends Controller {

    public static Result SubstructureSPARQLQuery(){
        return ok(views.html.rdf.substructureRDFQuery.render());
    }

    public static Result SubstructureSPARQLQueryResult() {

        DynamicForm dynamicForm = Form.form().bindFromRequest();
        Logger.info("form posted " + dynamicForm.data().values() );
        //prepareQuery(dynamicForm.data().values().toString());

        Logger.info("TESTING " + dynamicForm.data().values().toString().replaceAll("\\[", "").replaceAll("\\]", "") );
        String queryRDF = prepareQuery(dynamicForm.data().values().toString().replaceAll("\\[", "").replaceAll("\\]", "") );


        /*String sparqlQueryString2 = "prefix glycan:  <http://rdf.unicarbkb.org.org/glycan/>\n" +
                "prefix predicate:  <http://rdf.unicarbkb.org.org/predicate/>\n" +
                "prefix component:  <http://rdf.unicarbkb.org.org/component/>\n" +
                "prefix structureConnection:  <http://rdf.unicarbkb.org.org/structureConnection/>\n" +
                "SELECT DISTINCT ?structureConnection\n" +
                "WHERE { \n" +
                "?structureConnection predicate:has_components ?component0 . \n" +
                "{\n" +
                "SELECT * WHERE { \n" +
                "?component0 predicate:is_a_Gal ?component0 . \n" +
                "?component1 predicate:is_a_NAcetyl ?component1 . \n" +
                "?component0 predicate:is_connected ?component1 . \n" +
                "?component0 predicate:is_SubstituentLinkage ?component1 . \n" +
                "?component0 predicate:has_linkedCarbon_2 ?component1 . \n" +
                "?component2 predicate:is_a_Gal ?component2 . \n" +
                "?component0 predicate:is_connected ?component2 . \n" +
                "?component0 predicate:is_GlycosidicLinkage ?component2 . \n" +
                "?component0 predicate:has_anomerConnection_beta ?component2 . \n" +
                "?component0 predicate:has_linkedCarbon_3 ?component2 . \n" +
                "?component0 predicate:has_anomerCarbon_1 ?component2 . \n" +
                "?component3 predicate:is_a_Gal ?component3 . \n" +
                "?component2 predicate:is_connected ?component3 . \n" +
                "?component2 predicate:is_GlycosidicLinkage ?component3 . \n" +
                "?component2 predicate:has_anomerConnection_alpha ?component3 . \n" +
                "?component2 predicate:has_linkedCarbon_4 ?component3 . \n" +
                "?component2 predicate:has_anomerCarbon_1 ?component3 . \n" +
                "?component4 predicate:is_a_Gal ?component4 . \n" +
                "?component3 predicate:is_connected ?component4 . \n" +
                "?component3 predicate:is_GlycosidicLinkage ?component4 . \n" +
                "?component3 predicate:has_anomerConnection_alpha ?component4 . \n" +
                "?component3 predicate:has_linkedCarbon_3 ?component4 . \n" +
                "?component3 predicate:has_anomerCarbon_1 ?component4 . \n" +
                "?component5 predicate:is_a_Fuc ?component5 . \n" +
                "?component4 predicate:is_connected ?component5 . \n" +
                "?component4 predicate:is_GlycosidicLinkage ?component5 . \n" +
                "?component4 predicate:has_anomerConnection_alpha ?component5 . \n" +
                "?component4 predicate:has_linkedCarbon_2 ?component5 . \n" +
                "?component4 predicate:has_anomerCarbon_1 ?component5 . \n" +
                "}\n" +
                "}\n" +
                "}"; */

        //Logger.info("QUERY " + sparqlQueryString2 );

        Query query = QueryFactory.create(queryRDF.replaceAll("\\.org", "\\.org\\.org")  );
        ARQ.getContext().setTrue(ARQ.useSAX);
        //Executing SPARQL Query and pointing to the DBpedia SPARQL Endpoint
        QueryExecution qexec = QueryExecutionFactory.sparqlService("http://103.29.112.169:3030/KB/query", query);
        //Retrieving the SPARQL Query results
        com.hp.hpl.jena.query.ResultSet results = qexec.execSelect();



        //Iterating over the SPARQL Query results
        while (results.hasNext()) {
            QuerySolution soln = results.nextSolution();

            //Logger.info("TESTING 2 " + results.nextSolution() ) ;
            //Printing DBpedia entries' abstract.
            System.out.println(soln);  //get("?abstract"));
        }
        qexec.close();

        return ok(views.html.rdf.substructureRDFResult.render());
    }

   public static String prepareQuery(String glycoCT){

       /*String glycoCT =    "RES\n" +
               "1b:a-dgal-HEX-1:5\n" +
               "2s:n-acetyl\n" +
               "3b:b-dgal-HEX-1:5\n" +
               "4b:a-dgal-HEX-1:5\n" +
               "5b:a-dgal-HEX-1:5\n" +
               "6b:a-lgal-HEX-1:5|6:d\n" +
               "LIN\n" +
               "1:1d(2+1)2n\n" +
               "2:1o(3+1)3d\n" +
               "3:3o(4+1)4d\n" +
               "4:4o(3+1)5d\n" +
               "5:5o(2+1)6d";*/

       GlycoCTReader reader = new GlycoCTReader();
       org.expasy.mzjava.glycomics.mol.Glycan glycan = reader.read(glycoCT, "1");

       QueryGenerator queryGenerator = new VirtuosoQueryGeneratorExtend();
       String query = queryGenerator.generateQueryString(glycan);
       System.out.println("query: " + query);
       return query;
    }

}
