// @SOURCE:/Users/matthew/git/glycomics_working/conf/routes
// @HASH:bce024e089f274d82e72dc124770a1769f20230f
// @DATE:Mon Jun 02 10:52:54 EST 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_login0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:7
private[this] lazy val controllers_Application_authenticate1 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:8
private[this] lazy val controllers_Application_logout2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:11
private[this] lazy val controllers_Application_index3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:12
private[this] lazy val controllers_Admin_about4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("about"))))
        

// @LINE:13
private[this] lazy val controllers_Application_query5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("query"))))
        

// @LINE:15
private[this] lazy val controllers_Application_list26 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("references"))))
        

// @LINE:16
private[this] lazy val controllers_Application_refdisplay7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("references/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:18
private[this] lazy val controllers_Application_stref8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("streference/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:19
private[this] lazy val controllers_Application_structureDetails9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("structure/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:21
private[this] lazy val controllers_Application_taxonDetails10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("taxonomy/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:23
private[this] lazy val controllers_Application_findAllSpecies11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("taxonomy"))))
        

// @LINE:24
private[this] lazy val controllers_Application_tissueSummary12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tissuesummary/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:26
private[this] lazy val controllers_Application_unicarb13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("unicarb"))))
        

// @LINE:27
private[this] lazy val controllers_Application_ms14 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("ms"))))
        

// @LINE:29
private[this] lazy val controllers_Application_builder15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("builder"))))
        

// @LINE:31
private[this] lazy val controllers_Search_saySearch16 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("saySearch/"),DynamicPart("s", """[^/]+""",true))))
        

// @LINE:32
private[this] lazy val controllers_Application_builderDigest17 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("builderDigest"))))
        

// @LINE:33
private[this] lazy val controllers_Search_builderDigestSearch18 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("builderDigestSearch/"),DynamicPart("s", """[^/]+""",true))))
        

// @LINE:35
private[this] lazy val controllers_ProteinDetails_proteinlist19 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("proteins"))))
        

// @LINE:36
private[this] lazy val controllers_Application_proteinsummary20 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("proteinsummary/"),DynamicPart("s", """[^/]+""",true),StaticPart("/"),DynamicPart("other", """[^/]+""",true))))
        

// @LINE:39
private[this] lazy val controllers_UniprotConnection_proteinsite21 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("proteinsite"))))
        

// @LINE:41
private[this] lazy val controllers_Application_taxonsearch22 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("taxonomysearch"))))
        

// @LINE:42
private[this] lazy val controllers_Application_compositions23 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("compositions"))))
        

// @LINE:43
private[this] lazy val controllers_Glycodigest_glycodigest24 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("glycodigest/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:44
private[this] lazy val controllers_Glycodigest_glycodigestHome25 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("glycodigest"))))
        

// @LINE:47
private[this] lazy val controllers_Glycodigest_glycodigesttest26 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("glycodigest/"),DynamicPart("id", """[^/]+""",true),StaticPart("/digest"))))
        

// @LINE:48
private[this] lazy val controllers_Search_glycodigesttestBuilder27 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("glycodigestBuilder/"),DynamicPart("s", """[^/]+""",true),StaticPart("/digest"))))
        

// @LINE:50
private[this] lazy val controllers_Application_enzymes28 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("enzymes"))))
        

// @LINE:51
private[this] lazy val controllers_Application_news29 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("news"))))
        

// @LINE:54
private[this] lazy val controllers_UniprotConnection_swissprotFT30 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("swissprotFT"))))
        

// @LINE:55
private[this] lazy val controllers_PubchemLinks_pubchemExternal31 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("pubchem/"),DynamicPart("s", """[^/]+""",true))))
        

// @LINE:58
private[this] lazy val controllers_Application_format32 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("format/"),DynamicPart("s", """[^/]+""",true))))
        

// @LINE:60
private[this] lazy val controllers_Application_workflows33 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflows"))))
        

// @LINE:62
private[this] lazy val controllers_Application_massspec34 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("massspec"))))
        

// @LINE:64
private[this] lazy val controllers_Pubmed_getpubmed35 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("pubmed"))))
        

// @LINE:67
private[this] lazy val controllers_Ands_ands36 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("ands"))))
        

// @LINE:71
private[this] lazy val controllers_Search_SubstructureSearch37 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("testing"))))
        

// @LINE:74
private[this] lazy val controllers_Assets_at38 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:75
private[this] lazy val controllers_Assets_at39 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("images/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Application.logout()"""),("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """about""","""controllers.Admin.about()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """query""","""controllers.Application.query()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """references""","""controllers.Application.list2(p:Int ?= 0, s:String ?= "name", o:String ?= "asc", f:String ?= "", protein:String ?= "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """references/$id<[^/]+>""","""controllers.Application.refdisplay(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """streference/$id<[^/]+>""","""controllers.Application.stref(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """structure/$id<[^/]+>""","""controllers.Application.structureDetails(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """taxonomy/$id<[^/]+>""","""controllers.Application.taxonDetails(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """taxonomy""","""controllers.Application.findAllSpecies()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tissuesummary/$id<[^/]+>""","""controllers.Application.tissueSummary(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """unicarb""","""controllers.Application.unicarb(p:Int ?= 0, s:String ?= "name", o:String ?= "asc", f:String ?= "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ms""","""controllers.Application.ms()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """builder""","""controllers.Application.builder()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """saySearch/$s<[^/]+>""","""controllers.Search.saySearch(s:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """builderDigest""","""controllers.Application.builderDigest()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """builderDigestSearch/$s<[^/]+>""","""controllers.Search.builderDigestSearch(s:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """proteins""","""controllers.ProteinDetails.proteinlist(p:Int ?= 0, s:String ?= "name", o:String ?= "asc", f:String ?= "", protein:String ?= "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """proteinsummary/$s<[^/]+>/$other<[^/]+>""","""controllers.Application.proteinsummary(s:String, other:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """proteinsite""","""controllers.UniprotConnection.proteinsite()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """taxonomysearch""","""controllers.Application.taxonsearch(taxonomy:String ?= "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """compositions""","""controllers.Application.compositions()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """glycodigest/$id<[^/]+>""","""controllers.Glycodigest.glycodigest(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """glycodigest""","""controllers.Glycodigest.glycodigestHome()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """glycodigest/$id<[^/]+>/digest""","""controllers.Glycodigest.glycodigesttest(id:Long, s:String ?= "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """glycodigestBuilder/$s<[^/]+>/digest""","""controllers.Search.glycodigesttestBuilder(s:String, d:String ?= "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """enzymes""","""controllers.Application.enzymes()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """news""","""controllers.Application.news()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """swissprotFT""","""controllers.UniprotConnection.swissprotFT(feature:String ?= "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """pubchem/$s<[^/]+>""","""controllers.PubchemLinks.pubchemExternal(s:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """format/$s<[^/]+>""","""controllers.Application.format(s:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflows""","""controllers.Application.workflows()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """massspec""","""controllers.Application.massspec()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """pubmed""","""controllers.Pubmed.getpubmed()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ands""","""controllers.Ands.ands()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """testing""","""controllers.Search.SubstructureSearch()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """images/$file<.+>""","""controllers.Assets.at(path:String = "/public/images", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_login0(params) => {
   call { 
        invokeHandler(controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Nil,"GET", """ Authentication""", Routes.prefix + """login"""))
   }
}
        

// @LINE:7
case controllers_Application_authenticate1(params) => {
   call { 
        invokeHandler(controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Nil,"POST", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:8
case controllers_Application_logout2(params) => {
   call { 
        invokeHandler(controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:11
case controllers_Application_index3(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Default path will just redirect to the computer list""", Routes.prefix + """"""))
   }
}
        

// @LINE:12
case controllers_Admin_about4(params) => {
   call { 
        invokeHandler(controllers.Admin.about(), HandlerDef(this, "controllers.Admin", "about", Nil,"GET", """""", Routes.prefix + """about"""))
   }
}
        

// @LINE:13
case controllers_Application_query5(params) => {
   call { 
        invokeHandler(controllers.Application.query(), HandlerDef(this, "controllers.Application", "query", Nil,"GET", """""", Routes.prefix + """query"""))
   }
}
        

// @LINE:15
case controllers_Application_list26(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("name")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[String]("protein", Some(""))) { (p, s, o, f, protein) =>
        invokeHandler(controllers.Application.list2(p, s, o, f, protein), HandlerDef(this, "controllers.Application", "list2", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """references"""))
   }
}
        

// @LINE:16
case controllers_Application_refdisplay7(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.refdisplay(id), HandlerDef(this, "controllers.Application", "refdisplay", Seq(classOf[Long]),"GET", """""", Routes.prefix + """references/$id<[^/]+>"""))
   }
}
        

// @LINE:18
case controllers_Application_stref8(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.stref(id), HandlerDef(this, "controllers.Application", "stref", Seq(classOf[Long]),"GET", """""", Routes.prefix + """streference/$id<[^/]+>"""))
   }
}
        

// @LINE:19
case controllers_Application_structureDetails9(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.structureDetails(id), HandlerDef(this, "controllers.Application", "structureDetails", Seq(classOf[Long]),"GET", """""", Routes.prefix + """structure/$id<[^/]+>"""))
   }
}
        

// @LINE:21
case controllers_Application_taxonDetails10(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.taxonDetails(id), HandlerDef(this, "controllers.Application", "taxonDetails", Seq(classOf[Long]),"GET", """""", Routes.prefix + """taxonomy/$id<[^/]+>"""))
   }
}
        

// @LINE:23
case controllers_Application_findAllSpecies11(params) => {
   call { 
        invokeHandler(controllers.Application.findAllSpecies(), HandlerDef(this, "controllers.Application", "findAllSpecies", Nil,"GET", """""", Routes.prefix + """taxonomy"""))
   }
}
        

// @LINE:24
case controllers_Application_tissueSummary12(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.tissueSummary(id), HandlerDef(this, "controllers.Application", "tissueSummary", Seq(classOf[Long]),"GET", """""", Routes.prefix + """tissuesummary/$id<[^/]+>"""))
   }
}
        

// @LINE:26
case controllers_Application_unicarb13(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("name")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some(""))) { (p, s, o, f) =>
        invokeHandler(controllers.Application.unicarb(p, s, o, f), HandlerDef(this, "controllers.Application", "unicarb", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """unicarb"""))
   }
}
        

// @LINE:27
case controllers_Application_ms14(params) => {
   call { 
        invokeHandler(controllers.Application.ms(), HandlerDef(this, "controllers.Application", "ms", Nil,"GET", """""", Routes.prefix + """ms"""))
   }
}
        

// @LINE:29
case controllers_Application_builder15(params) => {
   call { 
        invokeHandler(controllers.Application.builder(), HandlerDef(this, "controllers.Application", "builder", Nil,"GET", """""", Routes.prefix + """builder"""))
   }
}
        

// @LINE:31
case controllers_Search_saySearch16(params) => {
   call(params.fromPath[String]("s", None)) { (s) =>
        invokeHandler(controllers.Search.saySearch(s), HandlerDef(this, "controllers.Search", "saySearch", Seq(classOf[String]),"GET", """""", Routes.prefix + """saySearch/$s<[^/]+>"""))
   }
}
        

// @LINE:32
case controllers_Application_builderDigest17(params) => {
   call { 
        invokeHandler(controllers.Application.builderDigest(), HandlerDef(this, "controllers.Application", "builderDigest", Nil,"GET", """""", Routes.prefix + """builderDigest"""))
   }
}
        

// @LINE:33
case controllers_Search_builderDigestSearch18(params) => {
   call(params.fromPath[String]("s", None)) { (s) =>
        invokeHandler(controllers.Search.builderDigestSearch(s), HandlerDef(this, "controllers.Search", "builderDigestSearch", Seq(classOf[String]),"GET", """""", Routes.prefix + """builderDigestSearch/$s<[^/]+>"""))
   }
}
        

// @LINE:35
case controllers_ProteinDetails_proteinlist19(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("name")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[String]("protein", Some(""))) { (p, s, o, f, protein) =>
        invokeHandler(controllers.ProteinDetails.proteinlist(p, s, o, f, protein), HandlerDef(this, "controllers.ProteinDetails", "proteinlist", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """proteins"""))
   }
}
        

// @LINE:36
case controllers_Application_proteinsummary20(params) => {
   call(params.fromPath[String]("s", None), params.fromPath[String]("other", None)) { (s, other) =>
        invokeHandler(controllers.Application.proteinsummary(s, other), HandlerDef(this, "controllers.Application", "proteinsummary", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """proteinsummary/$s<[^/]+>/$other<[^/]+>"""))
   }
}
        

// @LINE:39
case controllers_UniprotConnection_proteinsite21(params) => {
   call { 
        invokeHandler(controllers.UniprotConnection.proteinsite(), HandlerDef(this, "controllers.UniprotConnection", "proteinsite", Nil,"GET", """GET   /proteinsummary/:s       controllers.Application.proteinsummary(s: String)
GET  /proteinsummary           controllers.Application.browse()""", Routes.prefix + """proteinsite"""))
   }
}
        

// @LINE:41
case controllers_Application_taxonsearch22(params) => {
   call(params.fromQuery[String]("taxonomy", Some(""))) { (taxonomy) =>
        invokeHandler(controllers.Application.taxonsearch(taxonomy), HandlerDef(this, "controllers.Application", "taxonsearch", Seq(classOf[String]),"GET", """""", Routes.prefix + """taxonomysearch"""))
   }
}
        

// @LINE:42
case controllers_Application_compositions23(params) => {
   call { 
        invokeHandler(controllers.Application.compositions(), HandlerDef(this, "controllers.Application", "compositions", Nil,"GET", """""", Routes.prefix + """compositions"""))
   }
}
        

// @LINE:43
case controllers_Glycodigest_glycodigest24(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Glycodigest.glycodigest(id), HandlerDef(this, "controllers.Glycodigest", "glycodigest", Seq(classOf[Long]),"GET", """""", Routes.prefix + """glycodigest/$id<[^/]+>"""))
   }
}
        

// @LINE:44
case controllers_Glycodigest_glycodigestHome25(params) => {
   call { 
        invokeHandler(controllers.Glycodigest.glycodigestHome(), HandlerDef(this, "controllers.Glycodigest", "glycodigestHome", Nil,"GET", """""", Routes.prefix + """glycodigest"""))
   }
}
        

// @LINE:47
case controllers_Glycodigest_glycodigesttest26(params) => {
   call(params.fromPath[Long]("id", None), params.fromQuery[String]("s", Some(""))) { (id, s) =>
        invokeHandler(controllers.Glycodigest.glycodigesttest(id, s), HandlerDef(this, "controllers.Glycodigest", "glycodigesttest", Seq(classOf[Long], classOf[String]),"GET", """ distance based""", Routes.prefix + """glycodigest/$id<[^/]+>/digest"""))
   }
}
        

// @LINE:48
case controllers_Search_glycodigesttestBuilder27(params) => {
   call(params.fromPath[String]("s", None), params.fromQuery[String]("d", Some(""))) { (s, d) =>
        invokeHandler(controllers.Search.glycodigesttestBuilder(s, d), HandlerDef(this, "controllers.Search", "glycodigesttestBuilder", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """glycodigestBuilder/$s<[^/]+>/digest"""))
   }
}
        

// @LINE:50
case controllers_Application_enzymes28(params) => {
   call { 
        invokeHandler(controllers.Application.enzymes(), HandlerDef(this, "controllers.Application", "enzymes", Nil,"GET", """""", Routes.prefix + """enzymes"""))
   }
}
        

// @LINE:51
case controllers_Application_news29(params) => {
   call { 
        invokeHandler(controllers.Application.news(), HandlerDef(this, "controllers.Application", "news", Nil,"GET", """""", Routes.prefix + """news"""))
   }
}
        

// @LINE:54
case controllers_UniprotConnection_swissprotFT30(params) => {
   call(params.fromQuery[String]("feature", Some(""))) { (feature) =>
        invokeHandler(controllers.UniprotConnection.swissprotFT(feature), HandlerDef(this, "controllers.UniprotConnection", "swissprotFT", Seq(classOf[String]),"GET", """external links""", Routes.prefix + """swissprotFT"""))
   }
}
        

// @LINE:55
case controllers_PubchemLinks_pubchemExternal31(params) => {
   call(params.fromPath[String]("s", None)) { (s) =>
        invokeHandler(controllers.PubchemLinks.pubchemExternal(s), HandlerDef(this, "controllers.PubchemLinks", "pubchemExternal", Seq(classOf[String]),"GET", """""", Routes.prefix + """pubchem/$s<[^/]+>"""))
   }
}
        

// @LINE:58
case controllers_Application_format32(params) => {
   call(params.fromPath[String]("s", None)) { (s) =>
        invokeHandler(controllers.Application.format(s), HandlerDef(this, "controllers.Application", "format", Seq(classOf[String]),"GET", """""", Routes.prefix + """format/$s<[^/]+>"""))
   }
}
        

// @LINE:60
case controllers_Application_workflows33(params) => {
   call { 
        invokeHandler(controllers.Application.workflows(), HandlerDef(this, "controllers.Application", "workflows", Nil,"GET", """""", Routes.prefix + """workflows"""))
   }
}
        

// @LINE:62
case controllers_Application_massspec34(params) => {
   call { 
        invokeHandler(controllers.Application.massspec(), HandlerDef(this, "controllers.Application", "massspec", Nil,"GET", """""", Routes.prefix + """massspec"""))
   }
}
        

// @LINE:64
case controllers_Pubmed_getpubmed35(params) => {
   call { 
        invokeHandler(controllers.Pubmed.getpubmed(), HandlerDef(this, "controllers.Pubmed", "getpubmed", Nil,"GET", """""", Routes.prefix + """pubmed"""))
   }
}
        

// @LINE:67
case controllers_Ands_ands36(params) => {
   call { 
        invokeHandler(controllers.Ands.ands(), HandlerDef(this, "controllers.Ands", "ands", Nil,"GET", """ANDS RIF OAI""", Routes.prefix + """ands"""))
   }
}
        

// @LINE:71
case controllers_Search_SubstructureSearch37(params) => {
   call { 
        invokeHandler(controllers.Search.SubstructureSearch(), HandlerDef(this, "controllers.Search", "SubstructureSearch", Nil,"GET", """Testing""", Routes.prefix + """testing"""))
   }
}
        

// @LINE:74
case controllers_Assets_at38(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:75
case controllers_Assets_at39(params) => {
   call(Param[String]("path", Right("/public/images")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """images/$file<.+>"""))
   }
}
        
}

}
     