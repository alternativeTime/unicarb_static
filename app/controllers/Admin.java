package controllers;

import java.util.*;

import play.mvc.*;
//import play.data.*;
import play.*;

import views.html.*;

import models.*;

public class Admin extends Controller {
	
	public static Result about() {
        	return ok ( about.render() );
    }

}
