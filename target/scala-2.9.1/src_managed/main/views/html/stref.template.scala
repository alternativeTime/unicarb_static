
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
object stref extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Streference,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(s: Streference):play.api.templates.Html = {
        _display_ {import helper._


Seq(format.raw/*1.18*/("""
"""),format.raw/*3.1*/("""

"""),_display_(Seq(/*5.2*/main/*5.6*/ {_display_(Seq(format.raw/*5.8*/("""
    
    <h1>test: """),_display_(Seq(/*7.16*/s/*7.17*/.structure.id)),format.raw/*7.30*/(""" </h1>

    
    
        
""")))})),format.raw/*12.2*/("""

            
"""))}
    }
    
    def render(s:Streference) = apply(s)
    
    def f:((Streference) => play.api.templates.Html) = (s) => apply(s)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Dec 18 08:54:51 EST 2012
                    SOURCE: /home/matthew/Documents/play-app/office/glycomics/app/views/stref.scala.html
                    HASH: 7769f0d8d125a8d905ad786ea79e7ffa3db6d38e
                    MATRIX: 760->1|864->17|891->35|923->38|934->42|967->44|1018->65|1027->66|1061->79|1120->107
                    LINES: 27->1|31->1|32->3|34->5|34->5|34->5|36->7|36->7|36->7|41->12
                    -- GENERATED --
                */
            