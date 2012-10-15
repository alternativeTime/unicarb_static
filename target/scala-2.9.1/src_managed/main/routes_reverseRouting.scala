// @SOURCE:/home/matthew/Documents/play-app/tmp/glycomics/conf/routes
// @HASH:4179ceb371a601c68fb5bdab43dde5e7fd95b026
// @DATE:Fri Oct 12 14:39:32 EST 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:45
// @LINE:44
// @LINE:29
// @LINE:23
// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:10
// @LINE:9
// @LINE:6
package controllers {

// @LINE:23
class ReverseSearch {
    


 
// @LINE:23
def saySearch(s:String) = {
   Call("GET", "/saySearch/" + implicitly[PathBindable[String]].unbind("s", s))
}
                                                        

                      
    
}
                            

// @LINE:29
// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {
    


 
// @LINE:10
def refdisplay(id:Long) = {
   Call("GET", "/references/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:17
def findAllSpecies() = {
   Call("GET", "/taxonomy")
}
                                                        
 
// @LINE:9
def list2(p:Int = 0, s:String = "name", o:String = "asc", f:String = "") = {
   Call("GET", "/references" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "name") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
}
                                                        
 
// @LINE:19
def unicarb(p:Int = 0, s:String = "name", o:String = "asc", f:String = "") = {
   Call("GET", "/unicarb" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "name") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
}
                                                        
 
// @LINE:29
def taxonsearch(taxonomy:String = "") = {
   Call("GET", "/taxonomysearch" + queryString(List(if(taxonomy == "") None else Some(implicitly[QueryStringBindable[String]].unbind("taxonomy", taxonomy)))))
}
                                                        
 
// @LINE:6
def index() = {
   Call("GET", "/")
}
                                                        
 
// @LINE:22
def search() = {
   Call("GET", "/search")
}
                                                        
 
// @LINE:20
def ms() = {
   Call("GET", "/ms")
}
                                                        
 
// @LINE:12
def stref(id:Long) = {
   Call("GET", "/streference/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:13
def structureDetails(id:Long) = {
   Call("GET", "/structure/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:15
def taxonDetails(id:Long) = {
   Call("GET", "/taxonomy/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        

                      
    
}
                            

// @LINE:45
// @LINE:44
class ReverseAssets {
    


 
// @LINE:45
// @LINE:44
def at(path:String, file:String) = {
   (path, file) match {
// @LINE:44
case (path, file) if path == "/public" => Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
                                                                
// @LINE:45
case (path, file) if path == "/public/images" => Call("GET", "/images/" + implicitly[PathBindable[String]].unbind("file", file))
                                                                    
   }
}
                                                        

                      
    
}
                            
}
                    


// @LINE:45
// @LINE:44
// @LINE:29
// @LINE:23
// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:23
class ReverseSearch {
    


 
// @LINE:23
def saySearch = JavascriptReverseRoute(
   "controllers.Search.saySearch",
   """
      function(s) {
      return _wA({method:"GET", url:"/saySearch/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("s", s)})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:29
// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {
    


 
// @LINE:10
def refdisplay = JavascriptReverseRoute(
   "controllers.Application.refdisplay",
   """
      function(id) {
      return _wA({method:"GET", url:"/references/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:17
def findAllSpecies = JavascriptReverseRoute(
   "controllers.Application.findAllSpecies",
   """
      function() {
      return _wA({method:"GET", url:"/taxonomy"})
      }
   """
)
                                                        
 
// @LINE:9
def list2 = JavascriptReverseRoute(
   "controllers.Application.list2",
   """
      function(p,s,o,f) {
      return _wA({method:"GET", url:"/references" + _qS([(p == """ +  implicitly[JavascriptLitteral[Int]].to(0) + """ ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == """ +  implicitly[JavascriptLitteral[String]].to("name") + """ ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == """ +  implicitly[JavascriptLitteral[String]].to("asc") + """ ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == """ +  implicitly[JavascriptLitteral[String]].to("") + """ ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
      }
   """
)
                                                        
 
// @LINE:19
def unicarb = JavascriptReverseRoute(
   "controllers.Application.unicarb",
   """
      function(p,s,o,f) {
      return _wA({method:"GET", url:"/unicarb" + _qS([(p == """ +  implicitly[JavascriptLitteral[Int]].to(0) + """ ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == """ +  implicitly[JavascriptLitteral[String]].to("name") + """ ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == """ +  implicitly[JavascriptLitteral[String]].to("asc") + """ ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == """ +  implicitly[JavascriptLitteral[String]].to("") + """ ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
      }
   """
)
                                                        
 
// @LINE:29
def taxonsearch = JavascriptReverseRoute(
   "controllers.Application.taxonsearch",
   """
      function(taxonomy) {
      return _wA({method:"GET", url:"/taxonomysearch" + _qS([(taxonomy == """ +  implicitly[JavascriptLitteral[String]].to("") + """ ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("taxonomy", taxonomy))])})
      }
   """
)
                                                        
 
// @LINE:6
def index = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"/"})
      }
   """
)
                                                        
 
// @LINE:22
def search = JavascriptReverseRoute(
   "controllers.Application.search",
   """
      function() {
      return _wA({method:"GET", url:"/search"})
      }
   """
)
                                                        
 
// @LINE:20
def ms = JavascriptReverseRoute(
   "controllers.Application.ms",
   """
      function() {
      return _wA({method:"GET", url:"/ms"})
      }
   """
)
                                                        
 
// @LINE:12
def stref = JavascriptReverseRoute(
   "controllers.Application.stref",
   """
      function(id) {
      return _wA({method:"GET", url:"/streference/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:13
def structureDetails = JavascriptReverseRoute(
   "controllers.Application.structureDetails",
   """
      function(id) {
      return _wA({method:"GET", url:"/structure/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:15
def taxonDetails = JavascriptReverseRoute(
   "controllers.Application.taxonDetails",
   """
      function(id) {
      return _wA({method:"GET", url:"/taxonomy/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:45
// @LINE:44
class ReverseAssets {
    


 
// @LINE:45
// @LINE:44
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(path, file) {
      if (path == """ + implicitly[JavascriptLitteral[String]].to("/public") + """) {
      return _wA({method:"GET", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      if (path == """ + implicitly[JavascriptLitteral[String]].to("/public/images") + """) {
      return _wA({method:"GET", url:"/images/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:45
// @LINE:44
// @LINE:29
// @LINE:23
// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.ref {

// @LINE:23
class ReverseSearch {
    


 
// @LINE:23
def saySearch(s:String) = new play.api.mvc.HandlerRef(
   controllers.Search.saySearch(s), HandlerDef(this, "controllers.Search", "saySearch", Seq(classOf[String]))
)
                              

                      
    
}
                            

// @LINE:29
// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {
    


 
// @LINE:10
def refdisplay(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.refdisplay(id), HandlerDef(this, "controllers.Application", "refdisplay", Seq(classOf[Long]))
)
                              
 
// @LINE:17
def findAllSpecies() = new play.api.mvc.HandlerRef(
   controllers.Application.findAllSpecies(), HandlerDef(this, "controllers.Application", "findAllSpecies", Seq())
)
                              
 
// @LINE:9
def list2(p:Int, s:String, o:String, f:String) = new play.api.mvc.HandlerRef(
   controllers.Application.list2(p, s, o, f), HandlerDef(this, "controllers.Application", "list2", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]))
)
                              
 
// @LINE:19
def unicarb(p:Int, s:String, o:String, f:String) = new play.api.mvc.HandlerRef(
   controllers.Application.unicarb(p, s, o, f), HandlerDef(this, "controllers.Application", "unicarb", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]))
)
                              
 
// @LINE:29
def taxonsearch(taxonomy:String) = new play.api.mvc.HandlerRef(
   controllers.Application.taxonsearch(taxonomy), HandlerDef(this, "controllers.Application", "taxonsearch", Seq(classOf[String]))
)
                              
 
// @LINE:6
def index() = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq())
)
                              
 
// @LINE:22
def search() = new play.api.mvc.HandlerRef(
   controllers.Application.search(), HandlerDef(this, "controllers.Application", "search", Seq())
)
                              
 
// @LINE:20
def ms() = new play.api.mvc.HandlerRef(
   controllers.Application.ms(), HandlerDef(this, "controllers.Application", "ms", Seq())
)
                              
 
// @LINE:12
def stref(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.stref(id), HandlerDef(this, "controllers.Application", "stref", Seq(classOf[Long]))
)
                              
 
// @LINE:13
def structureDetails(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.structureDetails(id), HandlerDef(this, "controllers.Application", "structureDetails", Seq(classOf[Long]))
)
                              
 
// @LINE:15
def taxonDetails(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.taxonDetails(id), HandlerDef(this, "controllers.Application", "taxonDetails", Seq(classOf[Long]))
)
                              

                      
    
}
                            

// @LINE:45
// @LINE:44
class ReverseAssets {
    


 
// @LINE:44
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            
}
                    
                