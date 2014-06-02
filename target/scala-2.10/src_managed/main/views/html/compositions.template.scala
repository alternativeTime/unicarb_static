
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
object compositions extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,List[Structurecomp],Array[String],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(notation: String, structure: List[Structurecomp], query: Array[String]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.74*/("""

"""),_display_(Seq[Any](/*3.2*/main/*3.6*/{_display_(Seq[Any](format.raw/*3.7*/("""
<script>
$(document).ready(function () """),format.raw/*5.31*/("""{"""),format.raw/*5.32*/("""

    (function ($) """),format.raw/*7.19*/("""{"""),format.raw/*7.20*/("""

        $('#filter').keyup(function () """),format.raw/*9.40*/("""{"""),format.raw/*9.41*/("""

            var rex = new RegExp($(this).val(), 'i');
            $('.searchable tr').hide();
            $('.searchable tr').filter(function () """),format.raw/*13.52*/("""{"""),format.raw/*13.53*/("""
                return rex.test($(this).text());
            """),format.raw/*15.13*/("""}"""),format.raw/*15.14*/(""").show();

        """),format.raw/*17.9*/("""}"""),format.raw/*17.10*/(""")

    """),format.raw/*19.5*/("""}"""),format.raw/*19.6*/("""(jQuery));

"""),format.raw/*21.1*/("""}"""),format.raw/*21.2*/(""");
</script>

<ul class="breadcrumb">
  <li><i class="icon-home"></i><a href="/"> UniCarbKB</a> <span class="divider">&gt;</span></li>
  <li><i class="icon-search"></i><a href="/query"> Search</a> <span class="divider">&gt;</span></li>
  <li class="active"> Composition Search</li>
</ul>

<section id="structureLayout">
  <section id="layouts">

  <div class="page-header row-fluid">
	<h1>Composition Search</h1>
	<h4 class="subheader span8">GlycosuiteDB records</h4>
  </div>
	<div class="row-fluid">

	<div class="span3 search">
    	<div class="row-fluid">
      	  <div class="filterbar tabbable clearfix">
           <ul class="nav nav-tabs" id="myTabBar">
           <li class="active"><a href="#filter1" data-toggle="tab">GlycoSuiteDB <span class="pull-right count">  </span></a></li>
           """),format.raw/*45.121*/("""
          </div>

          <div class="info">
            <h4>Other Options:</h4>
            <p><b>Glycan Builder:</b> Build and search a glycan structure<a href="/builder"> using the new interface</a>.</p>
            <p><b>Curated Publications:</b> Search the <a href="/references">growing list of publications, associated structures, and metadata</a>.</p>
          </div>
        </div>
  	</div>

	<div class="span9 rightpanel">
	  <h3>Query</h3>
	  <p>"""),_display_(Seq[Any](/*58.8*/for(q <- query) yield /*58.23*/ {_display_(Seq[Any](_display_(Seq[Any](/*58.26*/q))))})),format.raw/*58.28*/("""</p>
	  """),_display_(Seq[Any](/*59.5*/views/*59.10*/.html.format.format())),format.raw/*59.31*/("""
	  """),_display_(Seq[Any](/*60.5*/if(structure.size() >1 )/*60.29*/ {_display_(Seq[Any](format.raw/*60.31*/("""
	  <div class="input-group"> <span class="input-group-addon">Filter</span>
          <input id="filter" type="text" class="form-control" placeholder="Type here...">
          </div>
	  <table class="table table-striped table-bordered table-condensed"><thead><th>Structure</th><th>Information</th></thead><tbody class="searchable">
          """),_display_(Seq[Any](/*65.12*/for(structure <- structure) yield /*65.39*/ {_display_(Seq[Any](format.raw/*65.41*/("""
	  <tr><td>"""),_display_(Seq[Any](/*66.13*/views/*66.18*/.html.format.structure(notation, structure.structure.id))),format.raw/*66.74*/("""</td><td> """),_display_(Seq[Any](/*66.85*/if(structure.structure.strproteintax.size() > 0)/*66.133*/ {_display_(Seq[Any](_display_(Seq[Any](/*66.136*/for(s <- structure.structure.strproteintax) yield /*66.179*/{_display_(Seq[Any](format.raw/*66.180*/(""" """),_display_(Seq[Any](/*66.182*/if(s.proteins != null )/*66.205*/{_display_(Seq[Any](format.raw/*66.206*/("""
			  <p>"""),_display_(Seq[Any](/*67.10*/{ s.proteins.name })),format.raw/*67.29*/(""" ("""),_display_(Seq[Any](/*67.32*/{s.taxonomy.species})),format.raw/*67.52*/(""") </p>
			  """)))}))))}))))})),format.raw/*68.9*/(""" </td></tr>
	  """)))})),format.raw/*69.5*/(""" 
	  </tbody></table>
	  """)))})),format.raw/*71.5*/("""
	"""),_display_(Seq[Any](/*72.3*/if(structure.size() == 1)/*72.28*/{_display_(Seq[Any](format.raw/*72.29*/("""
	<ul class="structures media-grid">
	"""),_display_(Seq[Any](/*74.3*/for(structure <- structure) yield /*74.30*/ {_display_(Seq[Any](format.raw/*74.32*/("""
        <li>
        """),_display_(Seq[Any](/*76.10*/views/*76.15*/.html.format.structureLarge(notation, structure.structure.id))),format.raw/*76.76*/("""
        </li>
	""")))})),format.raw/*78.3*/("""
    	</ul>
	""")))})),format.raw/*80.3*/("""
	  """),_display_(Seq[Any](/*81.5*/if(structure.size() <1 )/*81.29*/ {_display_(Seq[Any](format.raw/*81.31*/("""
	  <div class="row-fluid">
	  <h3>No structures with that compostion were found</h3>

          <a class="btn btn-info" href="/query"> Try Searching Again! </a>
          """)))})),format.raw/*86.12*/("""
	</div>
	</div>

	</div>

</section>


""")))})),format.raw/*95.2*/("""
"""))}
    }
    
    def render(notation:String,structure:List[Structurecomp],query:Array[String]): play.api.templates.HtmlFormat.Appendable = apply(notation,structure,query)
    
    def f:((String,List[Structurecomp],Array[String]) => play.api.templates.HtmlFormat.Appendable) = (notation,structure,query) => apply(notation,structure,query)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 02 10:52:55 EST 2014
                    SOURCE: /Users/matthew/git/glycomics_working/app/views/compositions.scala.html
                    HASH: 9f87e2a44f778e63a21375360f09b085b4564797
                    MATRIX: 815->1|981->73|1018->76|1029->80|1066->81|1133->121|1161->122|1208->142|1236->143|1304->184|1332->185|1507->332|1536->333|1626->395|1655->396|1701->415|1730->416|1764->423|1792->424|1831->436|1859->437|2691->1432|3188->1894|3219->1909|3268->1912|3296->1914|3340->1923|3354->1928|3397->1949|3437->1954|3470->1978|3510->1980|3889->2323|3932->2350|3972->2352|4021->2365|4035->2370|4113->2426|4160->2437|4218->2485|4268->2488|4328->2531|4368->2532|4407->2534|4440->2557|4480->2558|4526->2568|4567->2587|4606->2590|4648->2610|4702->2625|4749->2641|4806->2667|4844->2670|4878->2695|4917->2696|4991->2735|5034->2762|5074->2764|5133->2787|5147->2792|5230->2853|5278->2870|5323->2884|5363->2889|5396->2913|5436->2915|5641->3088|5713->3129
                    LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|35->7|35->7|37->9|37->9|41->13|41->13|43->15|43->15|45->17|45->17|47->19|47->19|49->21|49->21|72->45|85->58|85->58|85->58|85->58|86->59|86->59|86->59|87->60|87->60|87->60|92->65|92->65|92->65|93->66|93->66|93->66|93->66|93->66|93->66|93->66|93->66|93->66|93->66|93->66|94->67|94->67|94->67|94->67|95->68|96->69|98->71|99->72|99->72|99->72|101->74|101->74|101->74|103->76|103->76|103->76|105->78|107->80|108->81|108->81|108->81|113->86|122->95
                    -- GENERATED --
                */
            