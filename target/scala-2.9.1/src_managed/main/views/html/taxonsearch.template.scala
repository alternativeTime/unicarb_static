
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
import play.api.templates.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import com.avaje.ebean._
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object taxonsearch extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template4[Page[Reference],String,String,String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(currentPage: Page[Reference], currentSortBy: String, currentOrder: String, currentFilter: String):play.api.templates.Html = {
        _display_ {

Seq(format.raw/*1.100*/("""

"""),_display_(Seq(/*3.2*/main/*3.6*/ {_display_(Seq(format.raw/*3.8*/("""
    
 	<h1>hellow</h1> 
""")))})),format.raw/*6.2*/("""
"""))}
    }
    
    def render(currentPage:Page[Reference],currentSortBy:String,currentOrder:String,currentFilter:String) = apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def f:((Page[Reference],String,String,String) => play.api.templates.Html) = (currentPage,currentSortBy,currentOrder,currentFilter) => apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Dec 18 08:54:51 EST 2012
                    SOURCE: /home/matthew/Documents/play-app/office/glycomics/app/views/taxonsearch.scala.html
                    HASH: e44476c755ab2664c3cfe4a82940edfe0554e5c6
                    MATRIX: 791->1|962->99|994->102|1005->106|1038->108|1094->134
                    LINES: 27->1|30->1|32->3|32->3|32->3|35->6
                    -- GENERATED --
                */
            