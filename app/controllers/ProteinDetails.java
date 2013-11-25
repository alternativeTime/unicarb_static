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

		Map<String, String[]> params = request().queryString();

		//System.out.println("query string +++ " + request() );
		String filterOption = request().toString();
		filterOption = filterOption.replace("/proteins?", "");
		//System.out.println("updated filteroption " + filterOption);
                String[] searchTerms = null;
                String key = null;
	        ArrayList<Proteins> proteinSearch = new ArrayList<Proteins>();
		HashSet<String> proteins = new HashSet<String>();

		String yesno = "no";

		for (Map.Entry<String, String[]> entry : params.entrySet() ){
                        key = entry.getKey();
                        searchTerms = entry.getValue();
			String filterOn = "";
			filterOn = Arrays.toString(params.get(key)).replace("[", "").replace("]", ""); 
			if (filterOn.length() > 2) {
			proteins.add(filterOn);
			yesno = "yes";
			}

		}

		String queryProtein = "select id, name, swiss_prot, description from public.proteins where ";
		int count = 0;
		if (proteins.size() == 1 ) {
			for(String proteinlookup : proteins) {
			String[] split = proteinlookup.split(",");
			for(String s : split) {
			String buildquery = "";	
			s = s.trim();
			if (count == 0 ) {	
			buildquery = " name like '%" + s + "%' ";
			}
			else {
			buildquery = " or name like '%" + s + "%' ";
			}
			queryProtein += buildquery; 
			count++;
			}
			}
	
		//System.out.println(filterOption);

                return ok(
			proteinlist.render(
				Proteins.proteinpagerefine(page, 10, sortBy, order, queryProtein),
				sortBy, order, filterOption, 
                        	Proteins.proteinList(), yesno
                        	)
                        );
		}
		else {
		return ok(
			proteinlist.render(
                                Proteins.proteinpage(page, 10, sortBy, order, filter),
                                sortBy, order, filter,
                                Proteins.proteinList(), yesno
                                )
			);
		}
	}

}
