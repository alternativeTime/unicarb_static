
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
object footer extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(footer: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.16*/(""" = """),format.raw/*1.19*/("""{"""),format.raw/*1.20*/("""

<div class="footer row-fluid">
  <div class="span12">
    <p class="pull-left">UniCarbKB</p>
    <p class="pull-right">Supported by
      <a href="http://www.nectar.org.au">NeCTAR</a> &nbsp;|&nbsp;
      <a href="http://www.ands.org.au">ANDS</a> &nbsp;|&nbsp;
      <a href="http://www.stint.se"> STINT</a> &nbsp;|&nbsp;
      <a rel="license" href="http://creativecommons.org/licenses/by-nc-nd/3.0/deed.en_US"><img alt="Creative Commons License" style="border-width:0" src="http://i.creativecommons.org/l/by-nc-nd/3.0/80x15.png" /></a>
    </p>
  </div>
</div>
"""),format.raw/*14.1*/("""}"""),format.raw/*14.2*/("""
"""))}
    }
    
    def render(footer:Html): play.api.templates.HtmlFormat.Appendable = apply(footer)
    
    def f:((Html) => play.api.templates.HtmlFormat.Appendable) = (footer) => apply(footer)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 02 10:52:55 EST 2014
                    SOURCE: /Users/matthew/git/glycomics_working/app/views/footer.scala.html
                    HASH: 1249cdcfa80735925b54f29b8945a82545849d60
                    MATRIX: 773->1|881->15|911->18|939->19|1530->583|1558->584
                    LINES: 26->1|29->1|29->1|29->1|42->14|42->14
                    -- GENERATED --
                */
            