
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
object enzymes extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Enzyme],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(enzyme: List[Enzyme]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.24*/("""

"""),_display_(Seq[Any](/*3.2*/main/*3.6*/{_display_(Seq[Any](format.raw/*3.7*/("""
	
	<h1>Enzyme Descriptions</h1>
	
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
            	"""),_display_(Seq[Any](/*21.15*/for(e <- enzyme) yield /*21.31*/{_display_(Seq[Any](format.raw/*21.32*/("""
            	"""),_display_(Seq[Any](/*22.15*/if(!e.name.contains("NA"))/*22.41*/{_display_(Seq[Any](format.raw/*22.42*/("""
            	<tr>
            	<td>"""),_display_(Seq[Any](/*24.19*/e/*24.20*/.name)),format.raw/*24.25*/("""</td><td>"""),_display_(Seq[Any](/*24.35*/e/*24.36*/.jcggdb)),format.raw/*24.43*/("""</td><td>"""),_display_(Seq[Any](/*24.53*/e/*24.54*/.goterm)),format.raw/*24.61*/("""</td><td>"""),_display_(Seq[Any](/*24.71*/e/*24.72*/.kegg)),format.raw/*24.77*/("""</td>
            	</tr>
            	""")))})),format.raw/*26.15*/("""
            	""")))})),format.raw/*27.15*/("""
            	
            </tbody>
            </table>	
          
  
""")))})),format.raw/*33.2*/("""
    """))}
    }
    
    def render(enzyme:List[Enzyme]): play.api.templates.HtmlFormat.Appendable = apply(enzyme)
    
    def f:((List[Enzyme]) => play.api.templates.HtmlFormat.Appendable) = (enzyme) => apply(enzyme)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 02 10:52:55 EST 2014
                    SOURCE: /Users/matthew/git/glycomics_working/app/views/enzymes.scala.html
                    HASH: 19e0d684b82144acf2761c4e5d49b1c0cd2bf4e6
                    MATRIX: 782->1|898->23|935->26|946->30|983->31|1605->617|1637->633|1676->634|1727->649|1762->675|1801->676|1874->713|1884->714|1911->719|1957->729|1967->730|1996->737|2042->747|2052->748|2081->755|2127->765|2137->766|2164->771|2235->810|2282->825|2386->898
                    LINES: 26->1|29->1|31->3|31->3|31->3|49->21|49->21|49->21|50->22|50->22|50->22|52->24|52->24|52->24|52->24|52->24|52->24|52->24|52->24|52->24|52->24|52->24|52->24|54->26|55->27|61->33
                    -- GENERATED --
                */
            