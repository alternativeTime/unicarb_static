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

		//need to do something with multiple protein names 
		Map<String, String[]> params = request().queryString();

		System.out.println("query string +++ " + request() );
		String filterOption = request().toString();
		filterOption = filterOption.replace("/proteins?", "");
                String[] searchTerms = null;
                String key = null;
		//ArrayList<String> proteins = new ArrayList<String>();
	        ArrayList<Proteins> proteinSearch = new ArrayList<Proteins>();
		//List<String> proteins = new ArrayList<String>() ;
		HashSet<String> proteins = new HashSet<String>();

		for (Map.Entry<String, String[]> entry : params.entrySet() ){
                        key = entry.getKey();
                        searchTerms = entry.getValue();
			String filterOn = "";
			filterOn = Arrays.toString(params.get(key)).replace("[", "").replace("]", ""); 
			System.out.println("FILTERON ----> " + filterOn);
			if (filterOn.length() > 2) {
			proteins.add(filterOn);
			}

		}

		System.out.println("----> ----> ----> " + proteins.size() );
		//strange actioan
		String queryProtein = "select id, name, swiss_prot, description from proteins where ";
		int count = 0;
		if (proteins.size() == 1 ) {
			for(String proteinlookup : proteins) {
			System.out.println("----> ----> " + proteinlookup + "\n");
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
			//List<Proteins> proteinsearch = Proteins.proteinSearch(s);
			//proteinSearch.addAll(proteinsearch);
			}
			}
		System.out.println("++++++ " + queryProtein);
	
                return ok(
                        //index.render()
			proteinlist.render(
				Proteins.proteinpagerefine(page, 10, sortBy, order, queryProtein),
				sortBy, order, filterOption,
                        	Proteins.proteinList()
                        	)
                        );
		}
		else {
		return ok(
			proteinlist.render(
                                Proteins.proteinpage(page, 10, sortBy, order, filter),
                                sortBy, order, filter,
                                Proteins.proteinList()
                                )
			);
		}
	}

}
