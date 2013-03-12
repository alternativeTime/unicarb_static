package controllers;

import java.util.*;

import play.mvc.*;
//import play.data.*;
import play.*;

import views.html.*;

import models.*;

//import com.avaje.ebean.*; //dont think this should be here due to SqlRow
//import static play.libs.Json.toJson;
//import static play.libs.Json.*;
import java.net.URLDecoder;
import java.io.UnsupportedEncodingException;

public class ProteinDetails extends Controller {


	public static Result proteinlist(int page, String sortBy, String order, String filter, String protein) {
                return ok(
                        proteinlist.render(
                                Proteins.proteinpage(page, 10, sortBy, order, filter),
                                sortBy, order, filter
                                )
                        );
	}

}
