// @SOURCE:/Users/matthew/git/glycomics_working/conf/routes
// @HASH:bce024e089f274d82e72dc124770a1769f20230f
// @DATE:Mon Jun 02 10:52:54 EST 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:75
// @LINE:74
// @LINE:71
// @LINE:67
// @LINE:64
// @LINE:62
// @LINE:60
// @LINE:58
// @LINE:55
// @LINE:54
// @LINE:51
// @LINE:50
// @LINE:48
// @LINE:47
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:39
// @LINE:36
// @LINE:35
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:29
// @LINE:27
// @LINE:26
// @LINE:24
// @LINE:23
// @LINE:21
// @LINE:19
// @LINE:18
// @LINE:16
// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:35
class ReverseProteinDetails {
    

// @LINE:35
def proteinlist(p:Int = 0, s:String = "name", o:String = "asc", f:String = "", protein:String = ""): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "proteins" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "name") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)), if(protein == "") None else Some(implicitly[QueryStringBindable[String]].unbind("protein", protein)))))
}
                                                
    
}
                          

// @LINE:75
// @LINE:74
class ReverseAssets {
    

// @LINE:75
// @LINE:74
def at(path:String, file:String): Call = {
   (path: @unchecked, file: @unchecked) match {
// @LINE:74
case (path, file) if path == "/public" => Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
                                                        
// @LINE:75
case (path, file) if path == "/public/images" => Call("GET", _prefix + { _defaultPrefix } + "images/" + implicitly[PathBindable[String]].unbind("file", file))
                                                        
   }
}
                                                
    
}
                          

// @LINE:12
class ReverseAdmin {
    

// @LINE:12
def about(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "about")
}
                                                
    
}
                          

// @LINE:55
class ReversePubchemLinks {
    

// @LINE:55
def pubchemExternal(s:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "pubchem/" + implicitly[PathBindable[String]].unbind("s", dynamicString(s)))
}
                                                
    
}
                          

// @LINE:54
// @LINE:39
class ReverseUniprotConnection {
    

// @LINE:39
def proteinsite(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "proteinsite")
}
                                                

// @LINE:54
def swissprotFT(feature:String = ""): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "swissprotFT" + queryString(List(if(feature == "") None else Some(implicitly[QueryStringBindable[String]].unbind("feature", feature)))))
}
                                                
    
}
                          

// @LINE:47
// @LINE:44
// @LINE:43
class ReverseGlycodigest {
    

// @LINE:47
def glycodigesttest(id:Long, s:String = ""): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "glycodigest/" + implicitly[PathBindable[Long]].unbind("id", id) + "/digest" + queryString(List(if(s == "") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)))))
}
                                                

// @LINE:43
def glycodigest(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "glycodigest/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:44
def glycodigestHome(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "glycodigest")
}
                                                
    
}
                          

// @LINE:64
class ReversePubmed {
    

// @LINE:64
def getpubmed(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "pubmed")
}
                                                
    
}
                          

// @LINE:62
// @LINE:60
// @LINE:58
// @LINE:51
// @LINE:50
// @LINE:42
// @LINE:41
// @LINE:36
// @LINE:32
// @LINE:29
// @LINE:27
// @LINE:26
// @LINE:24
// @LINE:23
// @LINE:21
// @LINE:19
// @LINE:18
// @LINE:16
// @LINE:15
// @LINE:13
// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:32
def builderDigest(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "builderDigest")
}
                                                

// @LINE:18
def stref(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "streference/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:16
def refdisplay(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "references/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:51
def news(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "news")
}
                                                

// @LINE:36
def proteinsummary(s:String, other:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "proteinsummary/" + implicitly[PathBindable[String]].unbind("s", dynamicString(s)) + "/" + implicitly[PathBindable[String]].unbind("other", dynamicString(other)))
}
                                                

// @LINE:26
def unicarb(p:Int = 0, s:String = "name", o:String = "asc", f:String = ""): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "unicarb" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "name") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
}
                                                

// @LINE:60
def workflows(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "workflows")
}
                                                

// @LINE:50
def enzymes(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "enzymes")
}
                                                

// @LINE:62
def massspec(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "massspec")
}
                                                

// @LINE:24
def tissueSummary(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "tissuesummary/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:19
def structureDetails(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "structure/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:42
def compositions(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "compositions")
}
                                                

// @LINE:41
def taxonsearch(taxonomy:String = ""): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "taxonomysearch" + queryString(List(if(taxonomy == "") None else Some(implicitly[QueryStringBindable[String]].unbind("taxonomy", taxonomy)))))
}
                                                

// @LINE:13
def query(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "query")
}
                                                

// @LINE:23
def findAllSpecies(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "taxonomy")
}
                                                

// @LINE:8
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:21
def taxonDetails(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "taxonomy/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:29
def builder(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "builder")
}
                                                

// @LINE:15
def list2(p:Int = 0, s:String = "name", o:String = "asc", f:String = "", protein:String = ""): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "references" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "name") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)), if(protein == "") None else Some(implicitly[QueryStringBindable[String]].unbind("protein", protein)))))
}
                                                

// @LINE:7
def authenticate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:11
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:58
def format(s:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "format/" + implicitly[PathBindable[String]].unbind("s", dynamicString(s)))
}
                                                

// @LINE:6
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:27
def ms(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "ms")
}
                                                
    
}
                          

// @LINE:67
class ReverseAnds {
    

// @LINE:67
def ands(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "ands")
}
                                                
    
}
                          

// @LINE:71
// @LINE:48
// @LINE:33
// @LINE:31
class ReverseSearch {
    

// @LINE:71
def SubstructureSearch(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "testing")
}
                                                

// @LINE:48
def glycodigesttestBuilder(s:String, d:String = ""): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "glycodigestBuilder/" + implicitly[PathBindable[String]].unbind("s", dynamicString(s)) + "/digest" + queryString(List(if(d == "") None else Some(implicitly[QueryStringBindable[String]].unbind("d", d)))))
}
                                                

// @LINE:33
def builderDigestSearch(s:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "builderDigestSearch/" + implicitly[PathBindable[String]].unbind("s", dynamicString(s)))
}
                                                

// @LINE:31
def saySearch(s:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "saySearch/" + implicitly[PathBindable[String]].unbind("s", dynamicString(s)))
}
                                                
    
}
                          
}
                  


// @LINE:75
// @LINE:74
// @LINE:71
// @LINE:67
// @LINE:64
// @LINE:62
// @LINE:60
// @LINE:58
// @LINE:55
// @LINE:54
// @LINE:51
// @LINE:50
// @LINE:48
// @LINE:47
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:39
// @LINE:36
// @LINE:35
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:29
// @LINE:27
// @LINE:26
// @LINE:24
// @LINE:23
// @LINE:21
// @LINE:19
// @LINE:18
// @LINE:16
// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:35
class ReverseProteinDetails {
    

// @LINE:35
def proteinlist : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProteinDetails.proteinlist",
   """
      function(p,s,o,f,protein) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "proteins" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f)), (protein == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("protein", protein))])})
      }
   """
)
                        
    
}
              

// @LINE:75
// @LINE:74
class ReverseAssets {
    

// @LINE:75
// @LINE:74
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(path, file) {
      if (path == """ + implicitly[JavascriptLitteral[String]].to("/public") + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      if (path == """ + implicitly[JavascriptLitteral[String]].to("/public/images") + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "images/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      }
   """
)
                        
    
}
              

// @LINE:12
class ReverseAdmin {
    

// @LINE:12
def about : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.about",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "about"})
      }
   """
)
                        
    
}
              

// @LINE:55
class ReversePubchemLinks {
    

// @LINE:55
def pubchemExternal : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PubchemLinks.pubchemExternal",
   """
      function(s) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pubchem/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("s", encodeURIComponent(s))})
      }
   """
)
                        
    
}
              

// @LINE:54
// @LINE:39
class ReverseUniprotConnection {
    

// @LINE:39
def proteinsite : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UniprotConnection.proteinsite",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "proteinsite"})
      }
   """
)
                        

// @LINE:54
def swissprotFT : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UniprotConnection.swissprotFT",
   """
      function(feature) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "swissprotFT" + _qS([(feature == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("feature", feature))])})
      }
   """
)
                        
    
}
              

// @LINE:47
// @LINE:44
// @LINE:43
class ReverseGlycodigest {
    

// @LINE:47
def glycodigesttest : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Glycodigest.glycodigesttest",
   """
      function(id,s) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "glycodigest/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/digest" + _qS([(s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s))])})
      }
   """
)
                        

// @LINE:43
def glycodigest : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Glycodigest.glycodigest",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "glycodigest/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:44
def glycodigestHome : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Glycodigest.glycodigestHome",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "glycodigest"})
      }
   """
)
                        
    
}
              

// @LINE:64
class ReversePubmed {
    

// @LINE:64
def getpubmed : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Pubmed.getpubmed",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pubmed"})
      }
   """
)
                        
    
}
              

// @LINE:62
// @LINE:60
// @LINE:58
// @LINE:51
// @LINE:50
// @LINE:42
// @LINE:41
// @LINE:36
// @LINE:32
// @LINE:29
// @LINE:27
// @LINE:26
// @LINE:24
// @LINE:23
// @LINE:21
// @LINE:19
// @LINE:18
// @LINE:16
// @LINE:15
// @LINE:13
// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:32
def builderDigest : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.builderDigest",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "builderDigest"})
      }
   """
)
                        

// @LINE:18
def stref : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.stref",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "streference/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:16
def refdisplay : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.refdisplay",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "references/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:51
def news : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.news",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "news"})
      }
   """
)
                        

// @LINE:36
def proteinsummary : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.proteinsummary",
   """
      function(s,other) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "proteinsummary/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("s", encodeURIComponent(s)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("other", encodeURIComponent(other))})
      }
   """
)
                        

// @LINE:26
def unicarb : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.unicarb",
   """
      function(p,s,o,f) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "unicarb" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
      }
   """
)
                        

// @LINE:60
def workflows : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.workflows",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workflows"})
      }
   """
)
                        

// @LINE:50
def enzymes : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.enzymes",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "enzymes"})
      }
   """
)
                        

// @LINE:62
def massspec : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.massspec",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "massspec"})
      }
   """
)
                        

// @LINE:24
def tissueSummary : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.tissueSummary",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tissuesummary/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:19
def structureDetails : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.structureDetails",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "structure/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:42
def compositions : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.compositions",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "compositions"})
      }
   """
)
                        

// @LINE:41
def taxonsearch : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.taxonsearch",
   """
      function(taxonomy) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "taxonomysearch" + _qS([(taxonomy == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("taxonomy", taxonomy))])})
      }
   """
)
                        

// @LINE:13
def query : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.query",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "query"})
      }
   """
)
                        

// @LINE:23
def findAllSpecies : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.findAllSpecies",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "taxonomy"})
      }
   """
)
                        

// @LINE:8
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:21
def taxonDetails : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.taxonDetails",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "taxonomy/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:29
def builder : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.builder",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "builder"})
      }
   """
)
                        

// @LINE:15
def list2 : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.list2",
   """
      function(p,s,o,f,protein) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "references" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f)), (protein == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("protein", protein))])})
      }
   """
)
                        

// @LINE:7
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:11
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:58
def format : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.format",
   """
      function(s) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "format/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("s", encodeURIComponent(s))})
      }
   """
)
                        

// @LINE:6
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:27
def ms : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.ms",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ms"})
      }
   """
)
                        
    
}
              

// @LINE:67
class ReverseAnds {
    

// @LINE:67
def ands : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Ands.ands",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ands"})
      }
   """
)
                        
    
}
              

// @LINE:71
// @LINE:48
// @LINE:33
// @LINE:31
class ReverseSearch {
    

// @LINE:71
def SubstructureSearch : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Search.SubstructureSearch",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "testing"})
      }
   """
)
                        

// @LINE:48
def glycodigesttestBuilder : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Search.glycodigesttestBuilder",
   """
      function(s,d) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "glycodigestBuilder/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("s", encodeURIComponent(s)) + "/digest" + _qS([(d == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("d", d))])})
      }
   """
)
                        

// @LINE:33
def builderDigestSearch : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Search.builderDigestSearch",
   """
      function(s) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "builderDigestSearch/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("s", encodeURIComponent(s))})
      }
   """
)
                        

// @LINE:31
def saySearch : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Search.saySearch",
   """
      function(s) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "saySearch/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("s", encodeURIComponent(s))})
      }
   """
)
                        
    
}
              
}
        


// @LINE:75
// @LINE:74
// @LINE:71
// @LINE:67
// @LINE:64
// @LINE:62
// @LINE:60
// @LINE:58
// @LINE:55
// @LINE:54
// @LINE:51
// @LINE:50
// @LINE:48
// @LINE:47
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:39
// @LINE:36
// @LINE:35
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:29
// @LINE:27
// @LINE:26
// @LINE:24
// @LINE:23
// @LINE:21
// @LINE:19
// @LINE:18
// @LINE:16
// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:35
class ReverseProteinDetails {
    

// @LINE:35
def proteinlist(p:Int, s:String, o:String, f:String, protein:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProteinDetails.proteinlist(p, s, o, f, protein), HandlerDef(this, "controllers.ProteinDetails", "proteinlist", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """proteins""")
)
                      
    
}
                          

// @LINE:75
// @LINE:74
class ReverseAssets {
    

// @LINE:74
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:12
class ReverseAdmin {
    

// @LINE:12
def about(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.about(), HandlerDef(this, "controllers.Admin", "about", Seq(), "GET", """""", _prefix + """about""")
)
                      
    
}
                          

// @LINE:55
class ReversePubchemLinks {
    

// @LINE:55
def pubchemExternal(s:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PubchemLinks.pubchemExternal(s), HandlerDef(this, "controllers.PubchemLinks", "pubchemExternal", Seq(classOf[String]), "GET", """""", _prefix + """pubchem/$s<[^/]+>""")
)
                      
    
}
                          

// @LINE:54
// @LINE:39
class ReverseUniprotConnection {
    

// @LINE:39
def proteinsite(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UniprotConnection.proteinsite(), HandlerDef(this, "controllers.UniprotConnection", "proteinsite", Seq(), "GET", """GET   /proteinsummary/:s       controllers.Application.proteinsummary(s: String)
GET  /proteinsummary           controllers.Application.browse()""", _prefix + """proteinsite""")
)
                      

// @LINE:54
def swissprotFT(feature:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UniprotConnection.swissprotFT(feature), HandlerDef(this, "controllers.UniprotConnection", "swissprotFT", Seq(classOf[String]), "GET", """external links""", _prefix + """swissprotFT""")
)
                      
    
}
                          

// @LINE:47
// @LINE:44
// @LINE:43
class ReverseGlycodigest {
    

// @LINE:47
def glycodigesttest(id:Long, s:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Glycodigest.glycodigesttest(id, s), HandlerDef(this, "controllers.Glycodigest", "glycodigesttest", Seq(classOf[Long], classOf[String]), "GET", """ distance based""", _prefix + """glycodigest/$id<[^/]+>/digest""")
)
                      

// @LINE:43
def glycodigest(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Glycodigest.glycodigest(id), HandlerDef(this, "controllers.Glycodigest", "glycodigest", Seq(classOf[Long]), "GET", """""", _prefix + """glycodigest/$id<[^/]+>""")
)
                      

// @LINE:44
def glycodigestHome(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Glycodigest.glycodigestHome(), HandlerDef(this, "controllers.Glycodigest", "glycodigestHome", Seq(), "GET", """""", _prefix + """glycodigest""")
)
                      
    
}
                          

// @LINE:64
class ReversePubmed {
    

// @LINE:64
def getpubmed(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Pubmed.getpubmed(), HandlerDef(this, "controllers.Pubmed", "getpubmed", Seq(), "GET", """""", _prefix + """pubmed""")
)
                      
    
}
                          

// @LINE:62
// @LINE:60
// @LINE:58
// @LINE:51
// @LINE:50
// @LINE:42
// @LINE:41
// @LINE:36
// @LINE:32
// @LINE:29
// @LINE:27
// @LINE:26
// @LINE:24
// @LINE:23
// @LINE:21
// @LINE:19
// @LINE:18
// @LINE:16
// @LINE:15
// @LINE:13
// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:32
def builderDigest(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.builderDigest(), HandlerDef(this, "controllers.Application", "builderDigest", Seq(), "GET", """""", _prefix + """builderDigest""")
)
                      

// @LINE:18
def stref(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.stref(id), HandlerDef(this, "controllers.Application", "stref", Seq(classOf[Long]), "GET", """""", _prefix + """streference/$id<[^/]+>""")
)
                      

// @LINE:16
def refdisplay(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.refdisplay(id), HandlerDef(this, "controllers.Application", "refdisplay", Seq(classOf[Long]), "GET", """""", _prefix + """references/$id<[^/]+>""")
)
                      

// @LINE:51
def news(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.news(), HandlerDef(this, "controllers.Application", "news", Seq(), "GET", """""", _prefix + """news""")
)
                      

// @LINE:36
def proteinsummary(s:String, other:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.proteinsummary(s, other), HandlerDef(this, "controllers.Application", "proteinsummary", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """proteinsummary/$s<[^/]+>/$other<[^/]+>""")
)
                      

// @LINE:26
def unicarb(p:Int, s:String, o:String, f:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.unicarb(p, s, o, f), HandlerDef(this, "controllers.Application", "unicarb", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """unicarb""")
)
                      

// @LINE:60
def workflows(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.workflows(), HandlerDef(this, "controllers.Application", "workflows", Seq(), "GET", """""", _prefix + """workflows""")
)
                      

// @LINE:50
def enzymes(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.enzymes(), HandlerDef(this, "controllers.Application", "enzymes", Seq(), "GET", """""", _prefix + """enzymes""")
)
                      

// @LINE:62
def massspec(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.massspec(), HandlerDef(this, "controllers.Application", "massspec", Seq(), "GET", """""", _prefix + """massspec""")
)
                      

// @LINE:24
def tissueSummary(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.tissueSummary(id), HandlerDef(this, "controllers.Application", "tissueSummary", Seq(classOf[Long]), "GET", """""", _prefix + """tissuesummary/$id<[^/]+>""")
)
                      

// @LINE:19
def structureDetails(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.structureDetails(id), HandlerDef(this, "controllers.Application", "structureDetails", Seq(classOf[Long]), "GET", """""", _prefix + """structure/$id<[^/]+>""")
)
                      

// @LINE:42
def compositions(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.compositions(), HandlerDef(this, "controllers.Application", "compositions", Seq(), "GET", """""", _prefix + """compositions""")
)
                      

// @LINE:41
def taxonsearch(taxonomy:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.taxonsearch(taxonomy), HandlerDef(this, "controllers.Application", "taxonsearch", Seq(classOf[String]), "GET", """""", _prefix + """taxonomysearch""")
)
                      

// @LINE:13
def query(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.query(), HandlerDef(this, "controllers.Application", "query", Seq(), "GET", """""", _prefix + """query""")
)
                      

// @LINE:23
def findAllSpecies(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.findAllSpecies(), HandlerDef(this, "controllers.Application", "findAllSpecies", Seq(), "GET", """""", _prefix + """taxonomy""")
)
                      

// @LINE:8
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:21
def taxonDetails(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.taxonDetails(id), HandlerDef(this, "controllers.Application", "taxonDetails", Seq(classOf[Long]), "GET", """""", _prefix + """taxonomy/$id<[^/]+>""")
)
                      

// @LINE:29
def builder(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.builder(), HandlerDef(this, "controllers.Application", "builder", Seq(), "GET", """""", _prefix + """builder""")
)
                      

// @LINE:15
def list2(p:Int, s:String, o:String, f:String, protein:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.list2(p, s, o, f, protein), HandlerDef(this, "controllers.Application", "list2", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """references""")
)
                      

// @LINE:7
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:11
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Default path will just redirect to the computer list""", _prefix + """""")
)
                      

// @LINE:58
def format(s:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.format(s), HandlerDef(this, "controllers.Application", "format", Seq(classOf[String]), "GET", """""", _prefix + """format/$s<[^/]+>""")
)
                      

// @LINE:6
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq(), "GET", """ Authentication""", _prefix + """login""")
)
                      

// @LINE:27
def ms(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.ms(), HandlerDef(this, "controllers.Application", "ms", Seq(), "GET", """""", _prefix + """ms""")
)
                      
    
}
                          

// @LINE:67
class ReverseAnds {
    

// @LINE:67
def ands(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Ands.ands(), HandlerDef(this, "controllers.Ands", "ands", Seq(), "GET", """ANDS RIF OAI""", _prefix + """ands""")
)
                      
    
}
                          

// @LINE:71
// @LINE:48
// @LINE:33
// @LINE:31
class ReverseSearch {
    

// @LINE:71
def SubstructureSearch(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Search.SubstructureSearch(), HandlerDef(this, "controllers.Search", "SubstructureSearch", Seq(), "GET", """Testing""", _prefix + """testing""")
)
                      

// @LINE:48
def glycodigesttestBuilder(s:String, d:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Search.glycodigesttestBuilder(s, d), HandlerDef(this, "controllers.Search", "glycodigesttestBuilder", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """glycodigestBuilder/$s<[^/]+>/digest""")
)
                      

// @LINE:33
def builderDigestSearch(s:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Search.builderDigestSearch(s), HandlerDef(this, "controllers.Search", "builderDigestSearch", Seq(classOf[String]), "GET", """""", _prefix + """builderDigestSearch/$s<[^/]+>""")
)
                      

// @LINE:31
def saySearch(s:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Search.saySearch(s), HandlerDef(this, "controllers.Search", "saySearch", Seq(classOf[String]), "GET", """""", _prefix + """saySearch/$s<[^/]+>""")
)
                      
    
}
                          
}
        
    