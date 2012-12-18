// @SOURCE:/home/matthew/Documents/play-app/office/glycomics/conf/routes
// @HASH:7727632e881f6ee91a23c6cda056a6cc072615f5
// @DATE:Tue Dec 18 17:18:55 EST 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:38
// @LINE:37
// @LINE:33
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:26
// @LINE:23
// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:6
package controllers {

// @LINE:23
class ReverseSearch {
    


 
// @LINE:23
def saySearch(s:String) = {
   Call("GET", "/saySearch/" + implicitly[PathBindable[String]].unbind("s", s))
}
                                                        

                      
    
}
                            

// @LINE:33
// @LINE:31
// @LINE:29
// @LINE:28
// @LINE:26
// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:6
class ReverseApplication {
    


 
// @LINE:9
def refdisplay(id:Long) = {
   Call("GET", "/references/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:8
def list2(p:Int = 0, s:String = "name", o:String = "asc", f:String = "", protein:String = "") = {
   Call("GET", "/references" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "name") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)), if(protein == "") None else Some(implicitly[QueryStringBindable[String]].unbind("protein", protein)))))
}
                                                        
 
// @LINE:16
def findAllSpecies() = {
   Call("GET", "/taxonomy")
}
                                                        
 
// @LINE:17
def tissueSummary(id:Long) = {
   Call("GET", "/tissuesummary/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:19
def unicarb(p:Int = 0, s:String = "name", o:String = "asc", f:String = "") = {
   Call("GET", "/unicarb" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "name") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
}
                                                        
 
// @LINE:28
def proteinsummary(s:String) = {
   Call("GET", "/proteinsummary/" + implicitly[PathBindable[String]].unbind("s", s))
}
                                                        
 
// @LINE:31
def taxonsearch(taxonomy:String = "") = {
   Call("GET", "/taxonomysearch" + queryString(List(if(taxonomy == "") None else Some(implicitly[QueryStringBindable[String]].unbind("taxonomy", taxonomy)))))
}
                                                        
 
// @LINE:6
def index() = {
   Call("GET", "/")
}
                                                        
 
// @LINE:20
def ms() = {
   Call("GET", "/ms")
}
                                                        
 
// @LINE:11
def stref(id:Long) = {
   Call("GET", "/streference/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:29
// @LINE:26
def browse() = {
   () match {
// @LINE:26
case () if true => Call("GET", "/browse")
                                                                
// @LINE:29
case () if true => Call("GET", "/proteinsummary")
                                                                    
   }
}
                                                        
 
// @LINE:22
def builder() = {
   Call("GET", "/builder")
}
                                                        
 
// @LINE:33
def compositions() = {
   Call("GET", "/compositions")
}
                                                        
 
// @LINE:12
def structureDetails(id:Long) = {
   Call("GET", "/structure/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:14
def taxonDetails(id:Long) = {
   Call("GET", "/taxonomy/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        

                      
    
}
                            

// @LINE:30
class ReverseUniprotConnection {
    


 
// @LINE:30
def proteinsite() = {
   Call("GET", "/proteinsite")
}
                                                        

                      
    
}
                            

// @LINE:38
// @LINE:37
class ReverseAssets {
    


 
// @LINE:38
// @LINE:37
def at(path:String, file:String) = {
   (path, file) match {
// @LINE:37
case (path, file) if path == "/public" => Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
                                                                
// @LINE:38
case (path, file) if path == "/public/images" => Call("GET", "/images/" + implicitly[PathBindable[String]].unbind("file", file))
                                                                    
   }
}
                                                        

                      
    
}
                            
}
                    


// @LINE:38
// @LINE:37
// @LINE:33
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:26
// @LINE:23
// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
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
                            

// @LINE:33
// @LINE:31
// @LINE:29
// @LINE:28
// @LINE:26
// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:6
class ReverseApplication {
    


 
// @LINE:9
def refdisplay = JavascriptReverseRoute(
   "controllers.Application.refdisplay",
   """
      function(id) {
      return _wA({method:"GET", url:"/references/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:8
def list2 = JavascriptReverseRoute(
   "controllers.Application.list2",
   """
      function(p,s,o,f,protein) {
      return _wA({method:"GET", url:"/references" + _qS([(p == """ +  implicitly[JavascriptLitteral[Int]].to(0) + """ ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == """ +  implicitly[JavascriptLitteral[String]].to("name") + """ ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == """ +  implicitly[JavascriptLitteral[String]].to("asc") + """ ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == """ +  implicitly[JavascriptLitteral[String]].to("") + """ ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f)), (protein == """ +  implicitly[JavascriptLitteral[String]].to("") + """ ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("protein", protein))])})
      }
   """
)
                                                        
 
// @LINE:16
def findAllSpecies = JavascriptReverseRoute(
   "controllers.Application.findAllSpecies",
   """
      function() {
      return _wA({method:"GET", url:"/taxonomy"})
      }
   """
)
                                                        
 
// @LINE:17
def tissueSummary = JavascriptReverseRoute(
   "controllers.Application.tissueSummary",
   """
      function(id) {
      return _wA({method:"GET", url:"/tissuesummary/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
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
                                                        
 
// @LINE:28
def proteinsummary = JavascriptReverseRoute(
   "controllers.Application.proteinsummary",
   """
      function(s) {
      return _wA({method:"GET", url:"/proteinsummary/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("s", s)})
      }
   """
)
                                                        
 
// @LINE:31
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
                                                        
 
// @LINE:20
def ms = JavascriptReverseRoute(
   "controllers.Application.ms",
   """
      function() {
      return _wA({method:"GET", url:"/ms"})
      }
   """
)
                                                        
 
// @LINE:11
def stref = JavascriptReverseRoute(
   "controllers.Application.stref",
   """
      function(id) {
      return _wA({method:"GET", url:"/streference/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:29
// @LINE:26
def browse = JavascriptReverseRoute(
   "controllers.Application.browse",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"/browse"})
      }
      if (true) {
      return _wA({method:"GET", url:"/proteinsummary"})
      }
      }
   """
)
                                                        
 
// @LINE:22
def builder = JavascriptReverseRoute(
   "controllers.Application.builder",
   """
      function() {
      return _wA({method:"GET", url:"/builder"})
      }
   """
)
                                                        
 
// @LINE:33
def compositions = JavascriptReverseRoute(
   "controllers.Application.compositions",
   """
      function() {
      return _wA({method:"GET", url:"/compositions"})
      }
   """
)
                                                        
 
// @LINE:12
def structureDetails = JavascriptReverseRoute(
   "controllers.Application.structureDetails",
   """
      function(id) {
      return _wA({method:"GET", url:"/structure/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:14
def taxonDetails = JavascriptReverseRoute(
   "controllers.Application.taxonDetails",
   """
      function(id) {
      return _wA({method:"GET", url:"/taxonomy/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:30
class ReverseUniprotConnection {
    


 
// @LINE:30
def proteinsite = JavascriptReverseRoute(
   "controllers.UniprotConnection.proteinsite",
   """
      function() {
      return _wA({method:"GET", url:"/proteinsite"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:38
// @LINE:37
class ReverseAssets {
    


 
// @LINE:38
// @LINE:37
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
                    


// @LINE:38
// @LINE:37
// @LINE:33
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:26
// @LINE:23
// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.ref {

// @LINE:23
class ReverseSearch {
    


 
// @LINE:23
def saySearch(s:String) = new play.api.mvc.HandlerRef(
   controllers.Search.saySearch(s), HandlerDef(this, "controllers.Search", "saySearch", Seq(classOf[String]))
)
                              

                      
    
}
                            

// @LINE:33
// @LINE:31
// @LINE:29
// @LINE:28
// @LINE:26
// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:6
class ReverseApplication {
    


 
// @LINE:9
def refdisplay(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.refdisplay(id), HandlerDef(this, "controllers.Application", "refdisplay", Seq(classOf[Long]))
)
                              
 
// @LINE:8
def list2(p:Int, s:String, o:String, f:String, protein:String) = new play.api.mvc.HandlerRef(
   controllers.Application.list2(p, s, o, f, protein), HandlerDef(this, "controllers.Application", "list2", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String]))
)
                              
 
// @LINE:16
def findAllSpecies() = new play.api.mvc.HandlerRef(
   controllers.Application.findAllSpecies(), HandlerDef(this, "controllers.Application", "findAllSpecies", Seq())
)
                              
 
// @LINE:17
def tissueSummary(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.tissueSummary(id), HandlerDef(this, "controllers.Application", "tissueSummary", Seq(classOf[Long]))
)
                              
 
// @LINE:19
def unicarb(p:Int, s:String, o:String, f:String) = new play.api.mvc.HandlerRef(
   controllers.Application.unicarb(p, s, o, f), HandlerDef(this, "controllers.Application", "unicarb", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]))
)
                              
 
// @LINE:28
def proteinsummary(s:String) = new play.api.mvc.HandlerRef(
   controllers.Application.proteinsummary(s), HandlerDef(this, "controllers.Application", "proteinsummary", Seq(classOf[String]))
)
                              
 
// @LINE:31
def taxonsearch(taxonomy:String) = new play.api.mvc.HandlerRef(
   controllers.Application.taxonsearch(taxonomy), HandlerDef(this, "controllers.Application", "taxonsearch", Seq(classOf[String]))
)
                              
 
// @LINE:6
def index() = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq())
)
                              
 
// @LINE:20
def ms() = new play.api.mvc.HandlerRef(
   controllers.Application.ms(), HandlerDef(this, "controllers.Application", "ms", Seq())
)
                              
 
// @LINE:11
def stref(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.stref(id), HandlerDef(this, "controllers.Application", "stref", Seq(classOf[Long]))
)
                              
 
// @LINE:26
def browse() = new play.api.mvc.HandlerRef(
   controllers.Application.browse(), HandlerDef(this, "controllers.Application", "browse", Seq())
)
                              
 
// @LINE:22
def builder() = new play.api.mvc.HandlerRef(
   controllers.Application.builder(), HandlerDef(this, "controllers.Application", "builder", Seq())
)
                              
 
// @LINE:33
def compositions() = new play.api.mvc.HandlerRef(
   controllers.Application.compositions(), HandlerDef(this, "controllers.Application", "compositions", Seq())
)
                              
 
// @LINE:12
def structureDetails(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.structureDetails(id), HandlerDef(this, "controllers.Application", "structureDetails", Seq(classOf[Long]))
)
                              
 
// @LINE:14
def taxonDetails(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.taxonDetails(id), HandlerDef(this, "controllers.Application", "taxonDetails", Seq(classOf[Long]))
)
                              

                      
    
}
                            

// @LINE:30
class ReverseUniprotConnection {
    


 
// @LINE:30
def proteinsite() = new play.api.mvc.HandlerRef(
   controllers.UniprotConnection.proteinsite(), HandlerDef(this, "controllers.UniprotConnection", "proteinsite", Seq())
)
                              

                      
    
}
                            

// @LINE:38
// @LINE:37
class ReverseAssets {
    


 
// @LINE:37
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            
}
                    
                