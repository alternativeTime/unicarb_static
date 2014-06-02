
package views.html.footerunicarb

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
object footerunicarb extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<div class="footer row-fluid">
 <div class="span12">
        <p class="pull-left">UniCarbKB 
	<a rel="license" href="http://creativecommons.org/licenses/by-nc-nd/3.0/deed.en_US"><img alt="Creative Commons License" style="border-width:0" src="http://i.creativecommons.org/l/by-nc-nd/3.0/80x15.png" /></a>
	</p>
        <p class="pull-right">Supported by
          <a href="http://www.nectar.org.au">NeCTAR</a> &nbsp;|&nbsp;
          <a href="http://www.ands.org.au">ANDS</a> &nbsp;|&nbsp;
          <a href="http://www.stint.se"> STINT</a> &nbsp;|&nbsp;
          <a href="http://www.snf.ch/"> SNF</a>
        </p>
 </div>
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
                    SOURCE: /Users/matthew/git/glycomics_working/app/views/footerunicarb/footerunicarb.scala.html
                    HASH: 6a06c58c1e14f156a69a702029ec3e1f470c8e2b
                    MATRIX: 877->0
                    LINES: 29->1
                    -- GENERATED --
                */
            