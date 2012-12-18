// @SOURCE:/home/matthew/Documents/play-app/office/glycomics/conf/routes
// @HASH:7727632e881f6ee91a23c6cda056a6cc072615f5
// @DATE:Tue Dec 18 17:18:55 EST 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {


// @LINE:6
val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:8
val controllers_Application_list21 = Route("GET", PathPattern(List(StaticPart("/references"))))
                    

// @LINE:9
val controllers_Application_refdisplay2 = Route("GET", PathPattern(List(StaticPart("/references/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:11
val controllers_Application_stref3 = Route("GET", PathPattern(List(StaticPart("/streference/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:12
val controllers_Application_structureDetails4 = Route("GET", PathPattern(List(StaticPart("/structure/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:14
val controllers_Application_taxonDetails5 = Route("GET", PathPattern(List(StaticPart("/taxonomy/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:16
val controllers_Application_findAllSpecies6 = Route("GET", PathPattern(List(StaticPart("/taxonomy"))))
                    

// @LINE:17
val controllers_Application_tissueSummary7 = Route("GET", PathPattern(List(StaticPart("/tissuesummary/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:19
val controllers_Application_unicarb8 = Route("GET", PathPattern(List(StaticPart("/unicarb"))))
                    

// @LINE:20
val controllers_Application_ms9 = Route("GET", PathPattern(List(StaticPart("/ms"))))
                    

// @LINE:22
val controllers_Application_builder10 = Route("GET", PathPattern(List(StaticPart("/builder"))))
                    

// @LINE:23
val controllers_Search_saySearch11 = Route("GET", PathPattern(List(StaticPart("/saySearch/"),DynamicPart("s", """[^/]+"""))))
                    

// @LINE:26
val controllers_Application_browse12 = Route("GET", PathPattern(List(StaticPart("/browse"))))
                    

// @LINE:28
val controllers_Application_proteinsummary13 = Route("GET", PathPattern(List(StaticPart("/proteinsummary/"),DynamicPart("s", """[^/]+"""))))
                    

// @LINE:29
val controllers_Application_browse14 = Route("GET", PathPattern(List(StaticPart("/proteinsummary"))))
                    

// @LINE:30
val controllers_UniprotConnection_proteinsite15 = Route("GET", PathPattern(List(StaticPart("/proteinsite"))))
                    

// @LINE:31
val controllers_Application_taxonsearch16 = Route("GET", PathPattern(List(StaticPart("/taxonomysearch"))))
                    

// @LINE:33
val controllers_Application_compositions17 = Route("GET", PathPattern(List(StaticPart("/compositions"))))
                    

// @LINE:37
val controllers_Assets_at18 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    

// @LINE:38
val controllers_Assets_at19 = Route("GET", PathPattern(List(StaticPart("/images/"),DynamicPart("file", """.+"""))))
                    
def documentation = List(("""GET""","""/""","""controllers.Application.index()"""),("""GET""","""/references""","""controllers.Application.list2(p:Int ?= 0, s:String ?= "name", o:String ?= "asc", f:String ?= "", protein:String ?= "")"""),("""GET""","""/references/$id<[^/]+>""","""controllers.Application.refdisplay(id:Long)"""),("""GET""","""/streference/$id<[^/]+>""","""controllers.Application.stref(id:Long)"""),("""GET""","""/structure/$id<[^/]+>""","""controllers.Application.structureDetails(id:Long)"""),("""GET""","""/taxonomy/$id<[^/]+>""","""controllers.Application.taxonDetails(id:Long)"""),("""GET""","""/taxonomy""","""controllers.Application.findAllSpecies()"""),("""GET""","""/tissuesummary/$id<[^/]+>""","""controllers.Application.tissueSummary(id:Long)"""),("""GET""","""/unicarb""","""controllers.Application.unicarb(p:Int ?= 0, s:String ?= "name", o:String ?= "asc", f:String ?= "")"""),("""GET""","""/ms""","""controllers.Application.ms()"""),("""GET""","""/builder""","""controllers.Application.builder()"""),("""GET""","""/saySearch/$s<[^/]+>""","""controllers.Search.saySearch(s:String)"""),("""GET""","""/browse""","""controllers.Application.browse()"""),("""GET""","""/proteinsummary/$s<[^/]+>""","""controllers.Application.proteinsummary(s:String)"""),("""GET""","""/proteinsummary""","""controllers.Application.browse()"""),("""GET""","""/proteinsite""","""controllers.UniprotConnection.proteinsite()"""),("""GET""","""/taxonomysearch""","""controllers.Application.taxonsearch(taxonomy:String ?= "")"""),("""GET""","""/compositions""","""controllers.Application.compositions()"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""","""/images/$file<.+>""","""controllers.Assets.at(path:String = "/public/images", file:String)"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil))
   }
}
                    

// @LINE:8
case controllers_Application_list21(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("name")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[String]("protein", Some(""))) { (p, s, o, f, protein) =>
        invokeHandler(_root_.controllers.Application.list2(p, s, o, f, protein), HandlerDef(this, "controllers.Application", "list2", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String])))
   }
}
                    

// @LINE:9
case controllers_Application_refdisplay2(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.refdisplay(id), HandlerDef(this, "controllers.Application", "refdisplay", Seq(classOf[Long])))
   }
}
                    

// @LINE:11
case controllers_Application_stref3(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.stref(id), HandlerDef(this, "controllers.Application", "stref", Seq(classOf[Long])))
   }
}
                    

// @LINE:12
case controllers_Application_structureDetails4(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.structureDetails(id), HandlerDef(this, "controllers.Application", "structureDetails", Seq(classOf[Long])))
   }
}
                    

// @LINE:14
case controllers_Application_taxonDetails5(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.taxonDetails(id), HandlerDef(this, "controllers.Application", "taxonDetails", Seq(classOf[Long])))
   }
}
                    

// @LINE:16
case controllers_Application_findAllSpecies6(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.findAllSpecies(), HandlerDef(this, "controllers.Application", "findAllSpecies", Nil))
   }
}
                    

// @LINE:17
case controllers_Application_tissueSummary7(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.tissueSummary(id), HandlerDef(this, "controllers.Application", "tissueSummary", Seq(classOf[Long])))
   }
}
                    

// @LINE:19
case controllers_Application_unicarb8(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("name")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some(""))) { (p, s, o, f) =>
        invokeHandler(_root_.controllers.Application.unicarb(p, s, o, f), HandlerDef(this, "controllers.Application", "unicarb", Seq(classOf[Int], classOf[String], classOf[String], classOf[String])))
   }
}
                    

// @LINE:20
case controllers_Application_ms9(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.ms(), HandlerDef(this, "controllers.Application", "ms", Nil))
   }
}
                    

// @LINE:22
case controllers_Application_builder10(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.builder(), HandlerDef(this, "controllers.Application", "builder", Nil))
   }
}
                    

// @LINE:23
case controllers_Search_saySearch11(params) => {
   call(params.fromPath[String]("s", None)) { (s) =>
        invokeHandler(_root_.controllers.Search.saySearch(s), HandlerDef(this, "controllers.Search", "saySearch", Seq(classOf[String])))
   }
}
                    

// @LINE:26
case controllers_Application_browse12(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.browse(), HandlerDef(this, "controllers.Application", "browse", Nil))
   }
}
                    

// @LINE:28
case controllers_Application_proteinsummary13(params) => {
   call(params.fromPath[String]("s", None)) { (s) =>
        invokeHandler(_root_.controllers.Application.proteinsummary(s), HandlerDef(this, "controllers.Application", "proteinsummary", Seq(classOf[String])))
   }
}
                    

// @LINE:29
case controllers_Application_browse14(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.browse(), HandlerDef(this, "controllers.Application", "browse", Nil))
   }
}
                    

// @LINE:30
case controllers_UniprotConnection_proteinsite15(params) => {
   call { 
        invokeHandler(_root_.controllers.UniprotConnection.proteinsite(), HandlerDef(this, "controllers.UniprotConnection", "proteinsite", Nil))
   }
}
                    

// @LINE:31
case controllers_Application_taxonsearch16(params) => {
   call(params.fromQuery[String]("taxonomy", Some(""))) { (taxonomy) =>
        invokeHandler(_root_.controllers.Application.taxonsearch(taxonomy), HandlerDef(this, "controllers.Application", "taxonsearch", Seq(classOf[String])))
   }
}
                    

// @LINE:33
case controllers_Application_compositions17(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.compositions(), HandlerDef(this, "controllers.Application", "compositions", Nil))
   }
}
                    

// @LINE:37
case controllers_Assets_at18(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    

// @LINE:38
case controllers_Assets_at19(params) => {
   call(Param[String]("path", Right("/public/images")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    
}
    
}
                