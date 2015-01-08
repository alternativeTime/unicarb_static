
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

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
object enzymes extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Enzyme],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(enzyme: List[Enzyme]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.24*/("""

"""),_display_(/*3.2*/main/*3.6*/{_display_(Seq[Any](format.raw/*3.7*/("""
	
	"""),format.raw/*5.2*/("""<h1>Enzyme Descriptions</h1>
	
	<p>A new feature is the integration of known genes and enzymes involved in the biosynthesis of N-glycans stored in UniCarbKB.</p>
	<p>A description of the enzymes used is provided:</p>
 
        	<table class="computers table table-striped">
            <thead>
                <tr>
                	
                    <th>Enzyme Name</th>
                    <th>JCGGDB Description</th>
                    <th>GO Term</th>
                    <th>Enzyme Accession</th>
                </tr>
            </thead>
            <tbody>
            	"""),_display_(/*21.15*/for(e <- enzyme) yield /*21.31*/{_display_(Seq[Any](format.raw/*21.32*/("""
            	"""),_display_(/*22.15*/if(!e.name.contains("NA"))/*22.41*/{_display_(Seq[Any](format.raw/*22.42*/("""
            	"""),format.raw/*23.14*/("""<tr>
            	<td>"""),_display_(/*24.19*/e/*24.20*/.name),format.raw/*24.25*/("""</td><td>"""),_display_(/*24.35*/e/*24.36*/.jcggdb),format.raw/*24.43*/("""</td><td>"""),_display_(/*24.53*/e/*24.54*/.goterm),format.raw/*24.61*/("""</td><td>"""),_display_(/*24.71*/e/*24.72*/.kegg),format.raw/*24.77*/("""</td>
            	</tr>
            	""")))}),format.raw/*26.15*/("""
            	""")))}),format.raw/*27.15*/("""
            	
            """),format.raw/*29.13*/("""</tbody>
            </table>	
          
  
""")))}),format.raw/*33.2*/("""
    """))}
  }

  def render(enzyme:List[Enzyme]): play.twirl.api.HtmlFormat.Appendable = apply(enzyme)

  def f:((List[Enzyme]) => play.twirl.api.HtmlFormat.Appendable) = (enzyme) => apply(enzyme)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Nov 14 15:46:53 EST 2014
                  SOURCE: /Users/matthew/playframework/glycomics_again/glycomics/app/views/enzymes.scala.html
                  HASH: 2e16873c866341776bc61b843b5cf5934a2368a8
                  MATRIX: 731->1|841->23|869->26|880->30|917->31|947->35|1556->617|1588->633|1627->634|1669->649|1704->675|1743->676|1785->690|1835->713|1845->714|1871->719|1908->729|1918->730|1946->737|1983->747|1993->748|2021->755|2058->765|2068->766|2094->771|2164->810|2210->825|2265->852|2341->898
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|49->21|49->21|49->21|50->22|50->22|50->22|51->23|52->24|52->24|52->24|52->24|52->24|52->24|52->24|52->24|52->24|52->24|52->24|52->24|54->26|55->27|57->29|61->33
                  -- GENERATED --
              */
          