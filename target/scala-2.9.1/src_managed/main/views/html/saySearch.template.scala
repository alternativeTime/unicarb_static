
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
object saySearch extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template4[List[Translation],List[Structure],ArrayList[String],Structure,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(result: List[Translation], structure: List[Structure], taxonomy: ArrayList[String], structureObject: Structure):play.api.templates.Html = {
        _display_ {import helper._


Seq(format.raw/*1.114*/("""
"""),format.raw/*3.1*/("""

"""),_display_(Seq(/*5.2*/main/*5.6*/{_display_(Seq(format.raw/*5.7*/("""

      <ul class="breadcrumb">
        <li><i class="icon-folder-open" ></i><a href="#"> UniCarbKB Database</a> <span class="divider">></span></li>
        <li><i class="icon-hdd" ></i><a href="#"> GlycoSuite</a> <span class="divider">></span></li>
        <li><i class="icon-list-alt" ></i><a href="../references"> Reference</a> <span class="divider">></span></li>
        <li class="active">You are here</li>
      </ul>

    <section id="layouts" class="browse">
      <h1>Search UniCarbKB</h1>
      <h4 class="subheader">Currently returning results from GlycosuiteDB, EuroCarb, and GlycoBase</h4>
      <div class="row-fluid">
        <div class="span12">
         </div>
      </div>
      <div class="row-fluid">
        <div class="span3 filterbar tabbable">
          <ul class="nav nav-tabs" id="myTabBar">
            <li><a href="#filter1" data-toggle="tab">Glycosuite <span class="pull-right count"></span></a></li>
            <li class=""><a href="#filter2" data-toggle="tab">EuroCarb</a></li>
            <li><a href="#filter3" data-toggle="tab">GlycoBase</a></li>
          </ul>
        </div><!-- /col -->
        <div class="span9 rightpanelBuilder">
          <div class="tabbable"> <!-- Only required for left/right tabs -->
            """),format.raw/*36.20*/("""
            <div class="tab-content results">
              <div class="tab-pane active" id="tab1">
                <h2>"""),format.raw/*39.97*/("""
		"""),_display_(Seq(/*40.4*/for(result <- result) yield /*40.25*/{_display_(Seq(format.raw/*40.26*/("""
		<img src="http://unicarb-db.biomedicine.gu.se/unicarbdb/get_sugar_image.action?download=true&scale=1.0&outputType=png&inputType=gws&tolerateUnknown=1&sequences="""),_display_(Seq(/*41.164*/{result.gws})),format.raw/*41.176*/("""" />
		""")))})),format.raw/*42.4*/("""
		<div class="row-fluid">
		  <a class="btn" href="../search"><i class="icon-refresh"></i> Build Structure</a>
		</div>
		<div class="row-fluid">
		  <div class="span3">
                    <p class="publications"><a href="#">"""),_display_(Seq(/*48.58*/structureObject/*48.73*/.references.size())),format.raw/*48.91*/(""" Publications</a></p>
                  </div>
		  <div class="span3">
                    <p class="biological"><a href="#">"""),_display_(Seq(/*51.56*/structureObject/*51.71*/.strtaxonomy.size())),format.raw/*51.90*/(""" Biological Content</a></p>
                  </div>

		   <div class="span3">
                    <p class="structures"><a href="#">"""),_display_(Seq(/*55.56*/structureObject/*55.71*/.stsource.size())),format.raw/*55.87*/(""" Protein</a></p>
                  </div>
		  <div class="span3">
		  </div>

                </div>

    <div class="row-fluid">
      <h3><a href="#">Publications</a><span class="pull-right"></span></h3>
      <div class="details span9">
        """),_display_(Seq(/*65.10*/for(stref <- structure) yield /*65.33*/{_display_(Seq(format.raw/*65.34*/("""
          """),_display_(Seq(/*66.12*/for( (reference,i) <- stref.references.zipWithIndex; if (i <=3)) yield /*66.76*/{_display_(Seq(format.raw/*66.77*/("""
            <p><a href="../references/"""),_display_(Seq(/*67.40*/reference/*67.49*/.reference.id)),format.raw/*67.62*/("""">"""),_display_(Seq(/*67.65*/reference/*67.74*/.reference.title)),format.raw/*67.90*/("""</a>, """),_display_(Seq(/*67.97*/reference/*67.106*/.reference.year)),format.raw/*67.121*/(""", """),_display_(Seq(/*67.124*/reference/*67.133*/.reference.authors)),format.raw/*67.151*/("""</p>
          """)))})),format.raw/*68.12*/("""
        """)))})),format.raw/*69.10*/("""
      </div>
    </div>

		<div class="row-fluid">
                  <h3><a href="#">Biological Associations</a><span class="pull-right"></span></h3>
                  <div class="details span9" style="font-size: 14px; font-weight: normal; line-height: 22px; margin-bottom: 9px;">
		    """),_display_(Seq(/*76.8*/for( (tax,j) <- taxonomy.zipWithIndex; if (j <=3)) yield /*76.58*/{_display_(Seq(format.raw/*76.59*/("""
			<a href="" style="font-size: 14px; font-weight: normal; line-height: 22px; margin-bottom: 9px; color: #4B5C66;">"""),_display_(Seq(/*77.117*/tax)),format.raw/*77.120*/(""", </a> 
		    """)))})),format.raw/*78.8*/("""
                  </div>
		</div>

                </div>


              </div>
            </div>
          </div>
        </div><!-- /col -->
      </div><!-- /row -->
    </section>

<script>
        $(function () """),format.raw("""{"""),format.raw/*93.24*/("""
        var test = 'second'; """),format.raw/*94.66*/("""
        $('#myTabBar a:' + test).tab('show');
        """),format.raw("""}"""),format.raw/*96.10*/(""")
</script>


""")))})),format.raw/*100.2*/("""

"""))}
    }
    
    def render(result:List[Translation],structure:List[Structure],taxonomy:ArrayList[String],structureObject:Structure) = apply(result,structure,taxonomy,structureObject)
    
    def f:((List[Translation],List[Structure],ArrayList[String],Structure) => play.api.templates.Html) = (result,structure,taxonomy,structureObject) => apply(result,structure,taxonomy,structureObject)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Dec 18 08:54:51 EST 2012
                    SOURCE: /home/matthew/Documents/play-app/office/glycomics/app/views/saySearch.scala.html
                    HASH: dd12228144004422329433817cfa1fee8dee9852
                    MATRIX: 814->1|1015->113|1042->131|1074->134|1085->138|1117->139|2405->1757|2554->1954|2588->1958|2625->1979|2659->1980|2855->2144|2890->2156|2929->2164|3188->2392|3212->2407|3252->2425|3409->2551|3433->2566|3474->2585|3639->2719|3663->2734|3701->2750|3981->2999|4020->3022|4054->3023|4097->3035|4177->3099|4211->3100|4282->3140|4300->3149|4335->3162|4369->3165|4387->3174|4425->3190|4463->3197|4482->3206|4520->3221|4555->3224|4574->3233|4615->3251|4663->3267|4705->3277|5024->3566|5090->3616|5124->3617|5273->3734|5299->3737|5345->3752|5612->3972|5670->4038|5773->4094|5820->4109
                    LINES: 27->1|31->1|32->3|34->5|34->5|34->5|60->36|63->39|64->40|64->40|64->40|65->41|65->41|66->42|72->48|72->48|72->48|75->51|75->51|75->51|79->55|79->55|79->55|89->65|89->65|89->65|90->66|90->66|90->66|91->67|91->67|91->67|91->67|91->67|91->67|91->67|91->67|91->67|91->67|91->67|91->67|92->68|93->69|100->76|100->76|100->76|101->77|101->77|102->78|117->93|118->94|120->96|124->100
                    -- GENERATED --
                */
            