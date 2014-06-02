
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
object stref extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Streference,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(s: Streference):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.18*/("""
"""),format.raw/*3.1*/("""

"""),_display_(Seq[Any](/*5.2*/main/*5.6*/ {_display_(Seq[Any](format.raw/*5.8*/("""
    
    <h1>test: """),_display_(Seq[Any](/*7.16*/s/*7.17*/.structure.id)),format.raw/*7.30*/(""" </h1>

    
    
        
""")))})),format.raw/*12.2*/("""

            
"""))}
    }
    
    def render(s:Streference): play.api.templates.HtmlFormat.Appendable = apply(s)
    
    def f:((Streference) => play.api.templates.HtmlFormat.Appendable) = (s) => apply(s)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 02 10:52:57 EST 2014
                    SOURCE: /Users/matthew/git/glycomics_working/app/views/stref.scala.html
                    HASH: 382d523b7ce19a5c42ab2b57b3ed89a352c717c7
                    MATRIX: 779->1|905->17|932->35|969->38|980->42|1018->44|1074->65|1083->66|1117->79|1176->107
                    LINES: 26->1|30->1|31->3|33->5|33->5|33->5|35->7|35->7|35->7|40->12
                    -- GENERATED --
                */
            