
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
"""),format.raw/*59.3*/("""
<div class="container">
<ul class="breadcrumb">
  <li><a href="#">Curated Database</a> <span class="divider">/</span></li>
  <li><a href="#">GlycoSuite</a> <span class="divider">/</span></li>
  <li><a href="../references">Reference</a> <span class="divider">/</span></li>
  <li class="active">You are here</li>
</ul>
<section id="layouts">
  <div class="page-header">
    <h1>Reference <small>Details for reference</small></h1>
  </div>

  <div class="row">
    <div class="span10">

      """),_display_(Seq(/*75.8*/for(r <- references) yield /*75.28*/ {_display_(Seq(format.raw/*75.30*/("""
      <p style=" text-align: justify; text-justify: newspaper"><b>"""),_display_(Seq(/*76.68*/r/*76.69*/.title)),format.raw/*76.75*/("""</b></p>
	<p style=" text-align: justify; text-justify: newspaper">"""),_display_(Seq(/*77.60*/r/*77.61*/.authors)),format.raw/*77.69*/(""", """),_display_(Seq(/*77.72*/r/*77.73*/.year)),format.raw/*77.78*/(""", """),_display_(Seq(/*77.81*/r/*77.82*/.journal.name)),format.raw/*77.95*/("""</p>
	<p style=" text-align: justify; text-justify: newspaper"><a href=""""),_display_(Seq(/*78.69*/r/*78.70*/.medline)),format.raw/*78.78*/("""">PubMed Entry: """),_display_(Seq(/*78.95*/r/*78.96*/.medline)),format.raw/*78.104*/("""</a></p>
	<span class="label success">Curated Entry</span> <span class="label notice">GlycoSuiteDB</span>
      <div class="mini-layout">
        <div class="mini-layout-body"></div>
      </div>
	<div id="31" class="RP" style="background-color: rgb(243, 245, 252); padding-bottom: 5px; display: block">
	"""),_display_(Seq(/*84.3*/for(s <- r.streference) yield /*84.26*/ {_display_(Seq(format.raw/*84.28*/("""
	 <div class="fA a-l-k" style="margin-right: 16px">
        <div class="OR YP aQ"></div>                                                                           
                                                                                        <div class="ZP">
	<img class="sugar_image"  src="../images/cfg/"""),_display_(Seq(/*88.48*/{s.structure.id})),format.raw/*88.64*/(""".png">
	</div></div>

	""")))})),format.raw/*91.3*/("""
    </div></div><!-- /col -->
   """)))})),format.raw/*93.5*/(""" 
    <div class="span6">

	 
	 """),format.raw/*100.13*/("""


      
    <h2>Biological Associations</h2>
    	"""),_display_(Seq(/*105.7*/for(tax <- taxsources) yield /*105.29*/{_display_(Seq(format.raw/*105.30*/("""
    	<p><span class="label important">Taxonomy</span><a href="../taxonomysearch?taxonomy="""),_display_(Seq(/*106.91*/tax)),format.raw/*106.94*/(""""> """),_display_(Seq(/*106.98*/tax)),format.raw/*106.101*/("""</a></p> 
    	""")))})),format.raw/*107.7*/("""
    	"""),_display_(Seq(/*108.7*/for(protein <- proteinsources) yield /*108.37*/{_display_(Seq(format.raw/*108.38*/("""
    	<p><span class="label warning">Protein</span> """),_display_(Seq(/*109.53*/protein)),format.raw/*109.60*/("""</p> 
    	""")))})),format.raw/*110.7*/("""
    	
	
	

	<h2>Validation Method</h2>
      """),_display_(Seq(/*116.8*/for(methods <- refmethods) yield /*116.34*/ {_display_(Seq(format.raw/*116.36*/("""
	"""),_display_(Seq(/*117.3*/for(rmethod <- methods.refmethod) yield /*117.36*/ {_display_(Seq(format.raw/*117.38*/(""" <p>"""),_display_(Seq(/*117.43*/rmethod/*117.50*/.method.description)),format.raw/*117.69*/("""</p>
	""")))})),format.raw/*118.3*/("""
      """)))})),format.raw/*119.8*/("""
      <div class="mini-layout fluid">
        <div class="mini-layout-sidebar"></div>
        <div class="mini-layout-body"></div>
      </div>
    </div><!-- /col -->
  </div><!-- /row -->
</section>


</div> <!-- end container -->
        
""")))})),format.raw/*131.2*/("""
"""))}
    }
    
    def render(message:String,references:List[Reference],refmethods:List[Reference],taxsources:ArrayList[String],proteinsources:ArrayList[String]) = apply(message,references,refmethods,taxsources,proteinsources)
    
    def f:((String,List[Reference],List[Reference],ArrayList[String],ArrayList[String]) => play.api.templates.Html) = (message,references,refmethods,taxsources,proteinsources) => apply(message,references,refmethods,taxsources,proteinsources)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Oct 12 14:39:33 EST 2012
                    SOURCE: /home/matthew/Documents/play-app/tmp/glycomics/app/views/refdisplay.scala.html
                    HASH: 8686073187828a88717e6b9db308524421f8adab
                    MATRIX: 828->1|1059->143|1086->161|1118->164|1129->168|1162->170|1190->1806|1712->2298|1748->2318|1783->2320|1882->2388|1892->2389|1920->2395|2019->2463|2029->2464|2059->2472|2093->2475|2103->2476|2130->2481|2164->2484|2174->2485|2209->2498|2313->2571|2323->2572|2353->2580|2401->2597|2411->2598|2442->2606|2778->2912|2817->2935|2852->2937|3200->3254|3238->3270|3293->3294|3359->3329|3420->3470|3504->3523|3543->3545|3578->3546|3701->3637|3727->3640|3763->3644|3790->3647|3838->3663|3876->3670|3923->3700|3958->3701|4043->3754|4073->3761|4117->3773|4195->3820|4238->3846|4274->3848|4308->3851|4358->3884|4394->3886|4431->3891|4448->3898|4490->3917|4529->3924|4569->3932|4845->4176
                    LINES: 27->1|31->1|32->3|34->5|34->5|34->5|35->59|51->75|51->75|51->75|52->76|52->76|52->76|53->77|53->77|53->77|53->77|53->77|53->77|53->77|53->77|53->77|54->78|54->78|54->78|54->78|54->78|54->78|60->84|60->84|60->84|64->88|64->88|67->91|69->93|73->100|78->105|78->105|78->105|79->106|79->106|79->106|79->106|80->107|81->108|81->108|81->108|82->109|82->109|83->110|89->116|89->116|89->116|90->117|90->117|90->117|90->117|90->117|90->117|91->118|92->119|104->131
                    -- GENERATED --
                */
            