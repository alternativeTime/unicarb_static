
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object taxonsearch extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[com.avaje.ebean.Page[Reference],String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(currentPage: com.avaje.ebean.Page[Reference], currentSortBy: String, currentOrder: String, currentFilter: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.116*/("""

"""),_display_(Seq[Any](/*3.2*/main/*3.6*/ {_display_(Seq[Any](format.raw/*3.8*/("""
    
 	<h1>hellow</h1> 
""")))})),format.raw/*6.2*/("""
"""))}
    }
    
    def render(currentPage:com.avaje.ebean.Page[Reference],currentSortBy:String,currentOrder:String,currentFilter:String): play.api.templates.HtmlFormat.Appendable = apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def f:((com.avaje.ebean.Page[Reference],String,String,String) => play.api.templates.HtmlFormat.Appendable) = (currentPage,currentSortBy,currentOrder,currentFilter) => apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 02 10:52:57 EST 2014
                    SOURCE: /Users/matthew/git/glycomics_working/app/views/taxonsearch.scala.html
                    HASH: ecb983de84927ef14b187b59a47b3aee9dba0956
                    MATRIX: 826->1|1035->115|1072->118|1083->122|1121->124|1177->150
                    LINES: 26->1|29->1|31->3|31->3|31->3|34->6
                    -- GENERATED --
                */
            