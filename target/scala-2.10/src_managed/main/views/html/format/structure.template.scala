
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
object structure extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Long,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(notation: String, structureId: Long):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.39*/("""

<a href=""""),_display_(Seq[Any](/*3.11*/routes/*3.17*/.Application.structureDetails(structureId))),format.raw/*3.59*/("""">
"""),_display_(Seq[Any](/*4.2*/if(notation.matches("gs") && (structureId < 7400) )/*4.53*/ {_display_(Seq[Any](format.raw/*4.55*/("""
        <img class="sugar_image"  src="/images/"""),_display_(Seq[Any](/*5.49*/notation)),format.raw/*5.57*/("""/_"""),_display_(Seq[Any](/*5.60*/{structureId})),format.raw/*5.73*/(""".png">
""")))})),format.raw/*6.2*/("""
"""),_display_(Seq[Any](/*7.2*/if(notation.matches("cfgl") )/*7.31*/ {_display_(Seq[Any](format.raw/*7.33*/("""
	<img class="sugar_image"  src="/images/cfgl/smaller/"""),_display_(Seq[Any](/*8.55*/{structureId})),format.raw/*8.68*/(""".png" alt="">
        """)))})),format.raw/*9.10*/(""" 

"""),_display_(Seq[Any](/*11.2*/if(notation.matches("uoxf") )/*11.31*/ {_display_(Seq[Any](format.raw/*11.33*/("""
        <img class="sugar_image"  src="/images/uoxf/smaller/"""),_display_(Seq[Any](/*12.62*/{structureId})),format.raw/*12.75*/(""".png" alt="">
        """)))})),format.raw/*13.10*/("""
</a>
"""))}
    }
    
    def render(notation:String,structureId:Long): play.api.templates.HtmlFormat.Appendable = apply(notation,structureId)
    
    def f:((String,Long) => play.api.templates.HtmlFormat.Appendable) = (notation,structureId) => apply(notation,structureId)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 02 10:52:57 EST 2014
                    SOURCE: /Users/matthew/git/glycomics_working/app/views/format/structure.scala.html
                    HASH: e8b2e47a2dfce3e73f3fbceeecefd43299f4c22e
                    MATRIX: 790->1|921->38|968->50|982->56|1045->98|1083->102|1142->153|1181->155|1265->204|1294->212|1332->215|1366->228|1404->236|1440->238|1477->267|1516->269|1606->324|1640->337|1694->360|1733->364|1771->393|1811->395|1909->457|1944->470|1999->493
                    LINES: 26->1|29->1|31->3|31->3|31->3|32->4|32->4|32->4|33->5|33->5|33->5|33->5|34->6|35->7|35->7|35->7|36->8|36->8|37->9|39->11|39->11|39->11|40->12|40->12|41->13
                    -- GENERATED --
                */
            