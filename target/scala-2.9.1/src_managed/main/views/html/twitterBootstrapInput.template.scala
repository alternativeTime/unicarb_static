
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
object twitterBootstrapInput extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[helper.FieldElements,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(elements: helper.FieldElements):play.api.templates.Html = {
        _display_ {

Seq(format.raw/*1.34*/("""

"""),format.raw/*5.52*/("""
<div class="clearfix """),_display_(Seq(/*6.23*/if(elements.hasErrors)/*6.45*/ {_display_(Seq(format.raw/*6.47*/("""error""")))})),format.raw/*6.53*/("""">
    <label for=""""),_display_(Seq(/*7.18*/elements/*7.26*/.id)),format.raw/*7.29*/("""">"""),_display_(Seq(/*7.32*/elements/*7.40*/.label)),format.raw/*7.46*/("""</label>
    <div class="input">
        """),_display_(Seq(/*9.10*/elements/*9.18*/.input)),format.raw/*9.24*/("""
        <span class="help-inline">"""),_display_(Seq(/*10.36*/elements/*10.44*/.infos.mkString(", "))),format.raw/*10.65*/("""</span> 
    </div>
</div>
"""))}
    }
    
    def render(elements:helper.FieldElements) = apply(elements)
    
    def f:((helper.FieldElements) => play.api.templates.Html) = (elements) => apply(elements)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Dec 18 08:54:51 EST 2012
                    SOURCE: /home/matthew/Documents/play-app/office/glycomics/app/views/twitterBootstrapInput.scala.html
                    HASH: 69ac1da3a5c9505436ae5a8eb5dc1c480cf7a34a
                    MATRIX: 785->1|889->33|918->190|971->213|1001->235|1035->237|1072->243|1122->263|1138->271|1162->274|1195->277|1211->285|1238->291|1310->333|1326->341|1353->347|1420->383|1437->391|1480->412
                    LINES: 27->1|30->1|32->5|33->6|33->6|33->6|33->6|34->7|34->7|34->7|34->7|34->7|34->7|36->9|36->9|36->9|37->10|37->10|37->10
                    -- GENERATED --
                */
            