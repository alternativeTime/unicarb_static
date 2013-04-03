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


public class PubchemLinks extends Controller {

	public static Result pubchemExternal(String pubchem) {

		List<Pubchem> pubchemResult = Pubchem.pubchemId(pubchem);
		Structure structure = null;
		Long structureId = 1234566L;
		for(Pubchem c : pubchemResult) {
			structure = Ebean.find(Structure.class, c.structure.id);
			structureId = c.structure.id;
		}
		//return redirect(structureDetails.render(structureId);
		return redirect(routes.Application.structureDetails(structureId) );	
	}
	
}

