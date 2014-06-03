package controllers;

import play.libs.F;
import play.libs.F.Function;
import play.libs.WS;
import play.mvc.*;

import org.w3c.dom.Document;

public class Wspmc extends Controller {


    public static F.Promise<Result> feedTitle(String feed) {
        String feedUrl = "http://www.ebi.ac.uk/europepmc/webservices/rest/search/resulttype=core&query=ext_id:781840";
        final F.Promise<Result> resultPromise = WS.url(feedUrl).get().map(
                new Function<WS.Response, Result>() {
                    public Result apply(WS.Response response) {
                        return ok("Feed title:" + response.asXml());   //asXML().findPath("title"));
                    }
                }
        );
        return resultPromise;
    }


   // public Result feedTitle(String feed) {

     //   F.Promise<WS.Response> result = WS.url("http://www.ebi.ac.uk/europepmc/webservices/rest/search/resulttype=core&query=ext_id:781840").post("content");

       //  result.
       /* String feedUrl = "";
       feedUrl = "http://www.ebi.ac.uk/europepmc/webservices/rest/search/resulttype=core&query=ext_id:781840";
        return async(
                WS.url(feedUrl).get().map(
                        new Function<WS.Response, Result>() {
                            public Result apply(WS.Response response) {
                                return ok("Feed title:" + response.asXml()); //.asXML().findPath("title"));
                            }
                        }
                )
        ); */
       // return ok((Content) result.toString());
   // }

}
