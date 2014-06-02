
package views.html.format

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
object pubchem extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(pubchem : String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.20*/("""
<div class="info">
  <h3>External Links</h3>
  <a href="http://www.ncbi.nlm.nih.gov/pcsubstance?term="""),_display_(Seq[Any](/*4.58*/pubchem)),format.raw/*4.65*/(""""><span class='label label-dark'>  PubChem Entry</span></a>
</div>

"""))}
    }
    
    def render(pubchem:String): play.api.templates.HtmlFormat.Appendable = apply(pubchem)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (pubchem) => apply(pubchem)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 02 10:52:57 EST 2014
                    SOURCE: /Users/matthew/git/glycomics_working/app/views/format/pubchem.scala.html
                    HASH: 7e414230867535803221c0d53032badeb01b6c0f
                    MATRIX: 783->1|895->19|1033->122|1061->129
                    LINES: 26->1|29->1|32->4|32->4
                    -- GENERATED --
                */
            