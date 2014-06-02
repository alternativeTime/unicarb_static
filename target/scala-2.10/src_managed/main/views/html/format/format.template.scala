
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
object format extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<div class="info">
  <h3>Structure Format</h3>
  <a href="/format/cfgl"><span class='label label-dark'><span class='icon-adjust icon-white'></span> CFG/Essentials</span></a>
  <a href="/format/gs"><span class='label label-dark'><span class='icon-font icon-white'></span> Traditional</span></a>
  <a href="/format/uoxf"><span class='label label-dark'><span class='icon-stop icon-white'></span> Oxford</span></a>
</div>

"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 02 10:52:57 EST 2014
                    SOURCE: /Users/matthew/git/glycomics_working/app/views/format/format.scala.html
                    HASH: 70eaa57eba7a0982d3d2e37fc76e079bb078af2d
                    MATRIX: 863->0
                    LINES: 29->1
                    -- GENERATED --
                */
            