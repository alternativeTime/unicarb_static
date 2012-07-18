// @SOURCE:/home/matthew/Documents/play-app/tmp/computer-database/conf/routes
// @HASH:c671398f956d9f76fdaec57d04a8517466fac417
// @DATE:Thu Jul 12 16:18:11 EST 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {


// @LINE:6
val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:9
val controllers_Application_list21 = Route("GET", PathPattern(List(StaticPart("/references"))))
                    

// @LINE:10
val controllers_Application_refdisplay2 = Route("GET", PathPattern(List(StaticPart("/references/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:12
val controllers_Application_stref3 = Route("GET", PathPattern(List(StaticPart("/streference/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:13
val controllers_Application_structureDetails4 = Route("GET", PathPattern(List(StaticPart("/structure/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:15
val controllers_Application_taxonDetails5 = Route("GET", PathPattern(List(StaticPart("/taxonomy/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:17
val controllers_Application_findAllSpecies6 = Route("GET", PathPattern(List(StaticPart("/taxonomy"))))
                    

// @LINE:19
val controllers_Application_unicarb7 = Route("GET", PathPattern(List(StaticPart("/unicarb"))))
                    

// @LINE:20
val controllers_Application_ms8 = Route("GET", PathPattern(List(StaticPart("/ms"))))
                    

// @LINE:22
val controllers_Application_search9 = Route("GET", PathPattern(List(StaticPart("/search"))))
                    

// @LINE:23
val controllers_Search_saySearch10 = Route("GET", PathPattern(List(StaticPart("/saySearch/"),DynamicPart("s", """[^/]+"""))))
                    

// @LINE:43
val controllers_Assets_at11 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    

// @LINE:44
val controllers_Assets_at12 = Route("GET", PathPattern(List(StaticPart("/images/"),DynamicPart("file", """.+"""))))
                    
def documentation = List(("""GET""","""/""","""controllers.Application.index()"""),("""GET""","""/references""","""controllers.Application.list2(p:Int ?= 0, s:String ?= "name", o:String ?= "asc", f:String ?= "")"""),("""GET""","""/references/$id<[^/]+>""","""controllers.Application.refdisplay(id:Long)"""),("""GET""","""/streference/$id<[^/]+>""","""controllers.Application.stref(id:Long)"""),("""GET""","""/structure/$id<[^/]+>""","""controllers.Application.structureDetails(id:Long)"""),("""GET""","""/taxonomy/$id<[^/]+>""","""controllers.Application.taxonDetails(id:Long)"""),("""GET""","""/taxonomy""","""controllers.Application.findAllSpecies()"""),("""GET""","""/unicarb""","""controllers.Application.unicarb(p:Int ?= 0, s:String ?= "name", o:String ?= "asc", f:String ?= "")"""),("""GET""","""/ms""","""controllers.Application.ms()"""),("""GET""","""/search""","""controllers.Application.search()"""),("""GET""","""/saySearch/$s<[^/]+>""","""controllers.Search.saySearch(s:String)"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""","""/images/$file<.+>""","""controllers.Assets.at(path:String = "/public/images", file:String)"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil))
   }
}
                    

// @LINE:9
case controllers_Application_list21(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("name")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some(""))) { (p, s, o, f) =>
        invokeHandler(_root_.controllers.Application.list2(p, s, o, f), HandlerDef(this, "controllers.Application", "list2", Seq(classOf[Int], classOf[String], classOf[String], classOf[String])))
   }
}
                    

// @LINE:10
case controllers_Application_refdisplay2(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.refdisplay(id), HandlerDef(this, "controllers.Application", "refdisplay", Seq(classOf[Long])))
   }
}
                    

// @LINE:12
case controllers_Application_stref3(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.stref(id), HandlerDef(this, "controllers.Application", "stref", Seq(classOf[Long])))
   }
}
                    

// @LINE:13
case controllers_Application_structureDetails4(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.structureDetails(id), HandlerDef(this, "controllers.Application", "structureDetails", Seq(classOf[Long])))
   }
}
                    

// @LINE:15
case controllers_Application_taxonDetails5(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.taxonDetails(id), HandlerDef(this, "controllers.Application", "taxonDetails", Seq(classOf[Long])))
   }
}
                    

// @LINE:17
case controllers_Application_findAllSpecies6(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.findAllSpecies(), HandlerDef(this, "controllers.Application", "findAllSpecies", Nil))
   }
}
                    

// @LINE:19
case controllers_Application_unicarb7(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("name")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some(""))) { (p, s, o, f) =>
        invokeHandler(_root_.controllers.Application.unicarb(p, s, o, f), HandlerDef(this, "controllers.Application", "unicarb", Seq(classOf[Int], classOf[String], classOf[String], classOf[String])))
   }
}
                    

// @LINE:20
case controllers_Application_ms8(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.ms(), HandlerDef(this, "controllers.Application", "ms", Nil))
   }
}
                    

// @LINE:22
case controllers_Application_search9(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.search(), HandlerDef(this, "controllers.Application", "search", Nil))
   }
}
                    

// @LINE:23
case controllers_Search_saySearch10(params) => {
   call(params.fromPath[String]("s", None)) { (s) =>
        invokeHandler(_root_.controllers.Search.saySearch(s), HandlerDef(this, "controllers.Search", "saySearch", Seq(classOf[String])))
   }
}
                    

// @LINE:43
case controllers_Assets_at11(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    

// @LINE:44
case controllers_Assets_at12(params) => {
   call(Param[String]("path", Right("/public/images")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    
}
    
}
                