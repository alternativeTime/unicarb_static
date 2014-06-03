package controllers;

import java.util.*;

import play.mvc.*;
import play.*;
import play.db.ebean.*;
import com.avaje.ebean.*;

import views.html.*;

import models.*;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;


public class Pubmed extends Controller {

	public static Result getpubmed() {

		List<Method> method = Ebean.find(Method.class).findList();
		List<TissueTaxonomy> tissue = Ebean.find(TissueTaxonomy.class).findList();
                List<Disease> disease = Ebean.find(Disease.class).findList();
		return ok(pubmed.render("pubmed", method, tissue, disease) );	

	}







	
}

