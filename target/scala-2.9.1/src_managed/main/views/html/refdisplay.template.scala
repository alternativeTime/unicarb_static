
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

<p>test time</p>
      """),_display_(Seq(/*76.8*/for(r <- references) yield /*76.28*/ {_display_(Seq(format.raw/*76.30*/("""
      <h2>Details</h2>
      <p style=" text-align: justify; text-justify: newspaper">"""),_display_(Seq(/*78.65*/r/*78.66*/.title)),format.raw/*78.72*/(""", """),_display_(Seq(/*78.75*/r/*78.76*/.authors)),format.raw/*78.84*/(""", """),_display_(Seq(/*78.87*/r/*78.88*/.year)),format.raw/*78.93*/(""", """),_display_(Seq(/*78.96*/r/*78.97*/.journal.name)),format.raw/*78.110*/("""</p>
	<span class="label success">Curated Entry</span> <span class="label notice">GlycoSuiteDB</span>
      <div class="mini-layout">
        <div class="mini-layout-body"></div>
      </div>
	<div id="31" class="RP" style="background-color: rgb(243, 245, 252); padding-bottom: 5px; display: block">
	"""),_display_(Seq(/*84.3*/for(s <- r.streference) yield /*84.26*/ {_display_(Seq(format.raw/*84.28*/("""
	 <div class="fA a-l-k" style="margin-right: 16px">
        <div class="OR YP aQ"></div>                                                                           
                                                                                        <div class="ZP">
	<img class="sugar_image"  src="http://glycosuitedb.expasy.org/glycosuite-structures//_"""),_display_(Seq(/*88.89*/{s.structure.id})),format.raw/*88.105*/(""".png">
	</div></div>

	""")))})),format.raw/*91.3*/("""
    </div></div><!-- /col -->
   """)))})),format.raw/*93.5*/(""" 
    <div class="span6">

	 
	 """),format.raw/*100.13*/("""


      
    <h2>Biological Associations</h2>
    	"""),_display_(Seq(/*105.7*/for(tax <- taxsources) yield /*105.29*/{_display_(Seq(format.raw/*105.30*/("""
    	<p><span class="label important">Taxonomy</span> """),_display_(Seq(/*106.56*/tax)),format.raw/*106.59*/("""</p> 
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
                    DATE: Thu Jul 12 13:36:39 EST 2012
                    SOURCE: /home/matthew/Documents/play-app/tmp/computer-database/app/views/refdisplay.scala.html
                    HASH: 48c78a3e535d3c5603d3a919d786e76c9e358f06
                    MATRIX: 828->1|1059->143|1086->161|1118->164|1129->168|1162->170|1190->1847|1729->2356|1765->2376|1800->2378|1919->2466|1929->2467|1957->2473|1991->2476|2001->2477|2031->2485|2065->2488|2075->2489|2102->2494|2136->2497|2146->2498|2182->2511|2514->2813|2553->2836|2588->2838|2977->3196|3016->3212|3071->3236|3137->3271|3198->3412|3282->3465|3321->3487|3356->3488|3444->3544|3470->3547|3514->3559|3552->3566|3599->3596|3634->3597|3719->3650|3749->3657|3793->3669|3871->3716|3914->3742|3950->3744|3984->3747|4034->3780|4070->3782|4107->3787|4124->3794|4166->3813|4205->3820|4245->3828|4521->4072
                    LINES: 27->1|31->1|32->3|34->5|34->5|34->5|35->59|52->76|52->76|52->76|54->78|54->78|54->78|54->78|54->78|54->78|54->78|54->78|54->78|54->78|54->78|54->78|60->84|60->84|60->84|64->88|64->88|67->91|69->93|73->100|78->105|78->105|78->105|79->106|79->106|80->107|81->108|81->108|81->108|82->109|82->109|83->110|89->116|89->116|89->116|90->117|90->117|90->117|90->117|90->117|90->117|91->118|92->119|104->131
                    -- GENERATED --
                */
            