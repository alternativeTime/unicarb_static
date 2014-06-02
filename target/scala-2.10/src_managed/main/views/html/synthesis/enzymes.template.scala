
package views.html.synthesis

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
object enzymes extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[Structure],String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(references: List[Structure], reader: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*7.2*/header/*7.8*/(key:String, title:String):play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*7.38*/("""
    <th class="">
        <a href="">"""),_display_(Seq[Any](/*9.21*/title)),format.raw/*9.26*/("""</a>
    </th>
""")))};
Seq[Any](format.raw/*1.47*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*6.37*/("""
"""),format.raw/*11.2*/("""

<ul class="nav nav-tabs" data-tabs="tabs">
    <li class="active"><a data-toggle="tab" href="#red">References</a></li>
	<li><a data-toggle="tab" href="#annotated">Enzyme</a></li>
</ul>

<div class="tab-content">
      <div class="tab-pane active" id="red">
	  
	  
      <h3>References associated to structure</h3>
      <table class="computers table table-striped">
        <thead>
          <tr>
            """),_display_(Seq[Any](/*26.14*/header("title", "Title"))),format.raw/*26.38*/("""
            """),_display_(Seq[Any](/*27.14*/header("year", "Year"))),format.raw/*27.36*/("""
            """),_display_(Seq[Any](/*28.14*/header("authors", "Authors"))),format.raw/*28.42*/("""
          </tr>
        </thead>
        <tbody>
          """),_display_(Seq[Any](/*32.12*/for(stref <- references) yield /*32.36*/{_display_(Seq[Any](format.raw/*32.37*/("""
          """),_display_(Seq[Any](/*33.12*/for(reference <- stref.references) yield /*33.46*/{_display_(Seq[Any](format.raw/*33.47*/("""
          <tr>
            <td><a href="../references/"""),_display_(Seq[Any](/*35.41*/reference/*35.50*/.reference.id)),format.raw/*35.63*/("""">"""),_display_(Seq[Any](/*35.66*/reference/*35.75*/.reference.title)),format.raw/*35.91*/("""</a></td>
            <td>"""),_display_(Seq[Any](/*36.18*/reference/*36.27*/.reference.year)),format.raw/*36.42*/("""</td>
            <td>"""),_display_(Seq[Any](/*37.18*/reference/*37.27*/.reference.authors)),format.raw/*37.45*/("""</td>
          </tr>
          """)))})),format.raw/*39.12*/("""
          """)))})),format.raw/*40.12*/("""
        </tbody>
      </table>
    
      </div>
      
      <div class="tab-pane" id="annotated">

      <table class="computers table table-striped">
        <thead>
          <tr>
          	<th>Gene</th>
          	<th>Name</th>
          	<th>Enzyme Commission</th>
          	<th>GO Term</th>
          	<th>Residue</th>
          	<th>Linked Residue</th>
          </tr>
        </thead>
        <tbody>
        """),_display_(Seq[Any](/*60.10*/Html(reader))),format.raw/*60.22*/("""
        </tbody>
        </table>
      </div>
      
</div>"""))}
    }
    
    def render(references:List[Structure],reader:String): play.api.templates.HtmlFormat.Appendable = apply(references,reader)
    
    def f:((List[Structure],String) => play.api.templates.HtmlFormat.Appendable) = (references,reader) => apply(references,reader)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 02 10:52:57 EST 2014
                    SOURCE: /Users/matthew/git/glycomics_working/app/views/synthesis/enzymes.scala.html
                    HASH: d0050a64df436ff6a284c773b95cce0757e8fed6
                    MATRIX: 802->1|940->175|953->181|1063->211|1137->250|1163->255|1218->46|1245->64|1273->173|1301->271|1750->684|1796->708|1846->722|1890->744|1940->758|1990->786|2087->847|2127->871|2166->872|2214->884|2264->918|2303->919|2395->975|2413->984|2448->997|2487->1000|2505->1009|2543->1025|2606->1052|2624->1061|2661->1076|2720->1099|2738->1108|2778->1126|2843->1159|2887->1171|3346->1594|3380->1606
                    LINES: 26->1|29->7|29->7|31->7|33->9|33->9|36->1|37->3|38->6|39->11|54->26|54->26|55->27|55->27|56->28|56->28|60->32|60->32|60->32|61->33|61->33|61->33|63->35|63->35|63->35|63->35|63->35|63->35|64->36|64->36|64->36|65->37|65->37|65->37|67->39|68->40|88->60|88->60
                    -- GENERATED --
                */
            