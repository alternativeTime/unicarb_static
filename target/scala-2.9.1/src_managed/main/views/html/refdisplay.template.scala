
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
object refdisplay extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template5[String,List[Reference],List[Reference],ArrayList[String],ArrayList[String],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(message: String, references: List[Reference], refmethods: List[Reference], taxsources: ArrayList[String], proteinsources: ArrayList[String] ):play.api.templates.Html = {
        _display_ {import helper._


Seq(format.raw/*1.144*/("""
"""),format.raw/*3.1*/("""

"""),_display_(Seq(/*5.2*/main/*5.6*/ {_display_(Seq(format.raw/*5.8*/("""
"""),_display_(Seq(/*6.2*/for(r <- references) yield /*6.22*/ {_display_(Seq(format.raw/*6.24*/("""
<ul class="breadcrumb">
  <li><i class="icon-home" ></i><a href="/"> UniCarbKB</a> <span class="divider">></span></li>
  <li><i class="icon-search" ></i><a href="/references"> Reference Search</a> <span class="divider">></span></li>
  <li class="active"><i class="icon-file" ></i> """),_display_(Seq(/*10.50*/r/*10.51*/.authors)),format.raw/*10.59*/(""", """),_display_(Seq(/*10.62*/r/*10.63*/.year)),format.raw/*10.68*/(""", """),_display_(Seq(/*10.71*/r/*10.72*/.journal.name)),format.raw/*10.85*/("""<span class="divider"></span></li>
</ul>
""")))})),format.raw/*12.2*/("""
  <section id="layouts">

  <div class="row-fluid">
    <div class="span8">
      """),_display_(Seq(/*17.8*/for(r <- references) yield /*17.28*/ {_display_(Seq(format.raw/*17.30*/("""
      <div class="page-header">
        <h1>Reference <span class="pull-right"><span class="label success">Curated Entry</span> <span class="label notice">GlycoSuiteDB</span></span></h1>
        <h4 class="subheader">"""),_display_(Seq(/*20.32*/r/*20.33*/.journal.name)),format.raw/*20.46*/(""", """),_display_(Seq(/*20.49*/r/*20.50*/.year)),format.raw/*20.55*/(""", </h4>

      </div>

      <p><b>"""),_display_(Seq(/*24.14*/r/*24.15*/.title)),format.raw/*24.21*/("""</b></p>
      <p><a href="http://www.ncbi.nlm.nih.gov/pubmed/"""),_display_(Seq(/*25.55*/r/*25.56*/.pmid)),format.raw/*25.61*/("""">PubMed Entry: """),_display_(Seq(/*25.78*/r/*25.79*/.pmid)),format.raw/*25.84*/("""</a></p>
      <div class="mini-layout">
        <div class="mini-layout-body"></div>
      </div>
      <div id="31" class="RP">
        """),_display_(Seq(/*30.10*/for(s <- r.streference) yield /*30.33*/ {_display_(Seq(format.raw/*30.35*/("""
        <div class="fA a-l-k" style="margin-right: 16px">
          <div class="OR YP aQ"></div>                                                                           
          <div class="ZP">
            """),format.raw/*34.82*/("""
	    <a href=""""),_display_(Seq(/*35.16*/routes/*35.22*/.Application.structureDetails(s.structure.id))),format.raw/*35.67*/(""""><img class="thumbnail" style="max-height: 300px; max-width: 300px";  src="../images/_"""),_display_(Seq(/*35.155*/{s.structure.id})),format.raw/*35.171*/(""".png"></a>
        </div></div>

        """)))})),format.raw/*38.10*/("""
    </div></div><!-- /col -->
    """)))})),format.raw/*40.6*/(""" 
    <div class="span4 sidebar">
      """),format.raw/*44.17*/("""

      <div class="info">
        <h3>Biological Associations</h3>
        """),_display_(Seq(/*48.10*/for(tax <- taxsources) yield /*48.32*/{_display_(Seq(format.raw/*48.33*/("""
          <p><span class="label important">Taxonomy</span><a href="../taxonomysearch?taxonomy="""),_display_(Seq(/*49.96*/tax)),format.raw/*49.99*/(""""> """),_display_(Seq(/*49.103*/tax)),format.raw/*49.106*/("""</a></p> 
        """)))})),format.raw/*50.10*/("""
        """),_display_(Seq(/*51.10*/for(protein <- proteinsources) yield /*51.40*/{_display_(Seq(format.raw/*51.41*/("""
          <p><span class="label warning">Protein</span> """),_display_(Seq(/*52.58*/protein)),format.raw/*52.65*/("""</p> 
        """)))})),format.raw/*53.10*/("""
      </div>

      <div class="info">
        <h3>Validation Method</h3>
        """),_display_(Seq(/*58.10*/for(methods <- refmethods) yield /*58.36*/ {_display_(Seq(format.raw/*58.38*/("""
        """),_display_(Seq(/*59.10*/for(rmethod <- methods.refmethod) yield /*59.43*/ {_display_(Seq(format.raw/*59.45*/(""" <p>"""),_display_(Seq(/*59.50*/rmethod/*59.57*/.method.description)),format.raw/*59.76*/("""</p>
        """)))})),format.raw/*60.10*/("""
        """)))})),format.raw/*61.10*/("""
        <div class="mini-layout fluid">
          <div class="mini-layout-sidebar"></div>
          <div class="mini-layout-body"></div>
        </div>
      </div>
    </div><!-- /col -->
  </div><!-- /row -->
  </section>


  <div class="footer row-fluid">
    <div class="span12">
      <p class="pull-left">UniCarbKB</p>
      <p class="pull-right">Supported by 
        <a href="http://www.nectar.org.au">NeCTAR</a> &nbsp;|&nbsp; 
        <a href="http://www.ands.org.au">ANDS</a> &nbsp;|&nbsp;
        <a href="http://www.stint.se"> STINT</a>
      </p>
    </div>
  </div>

""")))})),format.raw/*83.2*/("""
"""))}
    }
    
    def render(message:String,references:List[Reference],refmethods:List[Reference],taxsources:ArrayList[String],proteinsources:ArrayList[String]) = apply(message,references,refmethods,taxsources,proteinsources)
    
    def f:((String,List[Reference],List[Reference],ArrayList[String],ArrayList[String]) => play.api.templates.Html) = (message,references,refmethods,taxsources,proteinsources) => apply(message,references,refmethods,taxsources,proteinsources)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Dec 18 08:54:50 EST 2012
                    SOURCE: /home/matthew/Documents/play-app/office/glycomics/app/views/refdisplay.scala.html
                    HASH: 9c4a45f32a319fac1fc304588f89c9f626e604c7
                    MATRIX: 828->1|1059->143|1086->161|1118->164|1129->168|1162->170|1193->172|1228->192|1262->194|1576->477|1586->478|1616->486|1650->489|1660->490|1687->495|1721->498|1731->499|1766->512|1839->554|1953->638|1989->658|2024->660|2274->879|2284->880|2319->893|2353->896|2363->897|2390->902|2457->938|2467->939|2495->945|2589->1008|2599->1009|2626->1014|2674->1031|2684->1032|2711->1037|2881->1176|2920->1199|2955->1201|3195->1482|3242->1498|3257->1504|3324->1549|3444->1637|3483->1653|3557->1695|3624->1731|3692->1887|3800->1964|3838->1986|3872->1987|3999->2083|4024->2086|4060->2090|4086->2093|4137->2112|4178->2122|4224->2152|4258->2153|4347->2211|4376->2218|4423->2233|4538->2317|4580->2343|4615->2345|4656->2355|4705->2388|4740->2390|4776->2395|4792->2402|4833->2421|4879->2435|4921->2445|5535->3028
                    LINES: 27->1|31->1|32->3|34->5|34->5|34->5|35->6|35->6|35->6|39->10|39->10|39->10|39->10|39->10|39->10|39->10|39->10|39->10|41->12|46->17|46->17|46->17|49->20|49->20|49->20|49->20|49->20|49->20|53->24|53->24|53->24|54->25|54->25|54->25|54->25|54->25|54->25|59->30|59->30|59->30|63->34|64->35|64->35|64->35|64->35|64->35|67->38|69->40|71->44|75->48|75->48|75->48|76->49|76->49|76->49|76->49|77->50|78->51|78->51|78->51|79->52|79->52|80->53|85->58|85->58|85->58|86->59|86->59|86->59|86->59|86->59|86->59|87->60|88->61|110->83
                    -- GENERATED --
                */
            