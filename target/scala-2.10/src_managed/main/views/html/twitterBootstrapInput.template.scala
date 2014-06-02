
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
object twitterBootstrapInput extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[helper.FieldElements,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(elements: helper.FieldElements):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.34*/("""

"""),format.raw/*5.52*/("""
<div class="clearfix """),_display_(Seq[Any](/*6.23*/if(elements.hasErrors)/*6.45*/ {_display_(Seq[Any](format.raw/*6.47*/("""error""")))})),format.raw/*6.53*/("""">
    <label for=""""),_display_(Seq[Any](/*7.18*/elements/*7.26*/.id)),format.raw/*7.29*/("""">"""),_display_(Seq[Any](/*7.32*/elements/*7.40*/.label)),format.raw/*7.46*/("""</label>
    <div class="input">
        """),_display_(Seq[Any](/*9.10*/elements/*9.18*/.input)),format.raw/*9.24*/("""
        <span class="help-inline">"""),_display_(Seq[Any](/*10.36*/elements/*10.44*/.infos.mkString(", "))),format.raw/*10.65*/("""</span> 
    </div>
</div>
"""))}
    }
    
    def render(elements:helper.FieldElements): play.api.templates.HtmlFormat.Appendable = apply(elements)
    
    def f:((helper.FieldElements) => play.api.templates.HtmlFormat.Appendable) = (elements) => apply(elements)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 02 10:52:57 EST 2014
                    SOURCE: /Users/matthew/git/glycomics_working/app/views/twitterBootstrapInput.scala.html
                    HASH: de7bea9f46e315139d9d9739a655114db8a2925d
                    MATRIX: 804->1|930->33|959->190|1017->213|1047->235|1086->237|1123->243|1178->263|1194->271|1218->274|1256->277|1272->285|1299->291|1376->333|1392->341|1419->347|1491->383|1508->391|1551->412
                    LINES: 26->1|29->1|31->5|32->6|32->6|32->6|32->6|33->7|33->7|33->7|33->7|33->7|33->7|35->9|35->9|35->9|36->10|36->10|36->10
                    -- GENERATED --
                */
            