
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
object saySearch extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template6[List[Translation],List[Structure],ArrayList[String],Structure,List[com.avaje.ebean.SqlRow],HashSet[Structure],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(result: List[Translation], structure: List[Structure], taxonomy: ArrayList[String], structureObject: Structure, listSub: List[com.avaje.ebean.SqlRow], subStr: HashSet[Structure]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.181*/("""
"""),format.raw/*3.1*/("""

"""),_display_(Seq[Any](/*5.2*/main/*5.6*/{_display_(Seq[Any](format.raw/*5.7*/("""
<script>
$(document).ready(function () """),format.raw/*7.31*/("""{"""),format.raw/*7.32*/("""

    (function ($) """),format.raw/*9.19*/("""{"""),format.raw/*9.20*/("""

        $('#filter').keyup(function () """),format.raw/*11.40*/("""{"""),format.raw/*11.41*/("""

            var rex = new RegExp($(this).val(), 'i');
            $('.searchable tr').hide();
            $('.searchable tr').filter(function () """),format.raw/*15.52*/("""{"""),format.raw/*15.53*/("""
                return rex.test($(this).text());
            """),format.raw/*17.13*/("""}"""),format.raw/*17.14*/(""").show();

        """),format.raw/*19.9*/("""}"""),format.raw/*19.10*/(""")

    """),format.raw/*21.5*/("""}"""),format.raw/*21.6*/("""(jQuery));

"""),format.raw/*23.1*/("""}"""),format.raw/*23.2*/(""");
</script>
    <ul class="breadcrumb">
      <li><i class="icon-home" ></i><a href="/"> UniCarbKB</a> <span class="divider">></span></li>
      <li><i class="icon-wrench" ></i><a href="/builder"> Glycan Builder</a> <span class="divider">></span></li>
      <li class='active'><i class='icon-search'></i> Glycan Search</span></li>
    </ul>

    <section id="layouts" class="browse">

    <div class="page-header row-fluid">
       <h1>Glycan Search</h1>
       <h4 class="subheader">Currently returning results from GlycosuiteDB, EuroCarb, and GlycoBase</h4>
    </div>

    <div class="row-fluid">
        <div class="span3 search">
          <div class="filterbar tabbable">
            <ul class="nav nav-tabs" id="myTabBar">
              <li class='title'>Database filter coming soon: <span class="pull-right count"></span></li>
              <li class='title'>Glycosuite <span class="pull-right count"></span></li>
              <li class='title'>EuroCarb</li>
              <li class='title'>GlycoBase</li>
            </ul>
          </div>
	  <div class="info">
            <h4>Other Options:</h4>
            <p><b>UniCarbKB Search:</b> Search UniCarbKB by Taxonomy, Tissue, Protein, or Composition with <a href="/query">our filtering system</a>.</p>
            <p><b>Curated Publications:</b> Search the <a href="/references">growing list of publications, associated structures, and metadata</a>.</p>
          </div>
        </div>
	<div class="span9">
    	    <ul class="nav nav-tabs" data-tabs="tabs">
      	      <li class="active"><a data-toggle="tab" href="#red">Structure Match</a></li>
              <li><a data-toggle="tab" href="#annotated">Substructure Match</a></li>
            </ul>

            <div class="tab-content">
              <div class="tab-pane active" id="red">
		<a class='btn pull-right' href="/builder"><i class="icon-refresh"></i> New Glycan</a>
                """),_display_(Seq[Any](/*63.18*/for(result <- result) yield /*63.39*/{_display_(Seq[Any](format.raw/*63.40*/("""
                 <a href="/structure/"""),_display_(Seq[Any](/*64.39*/result/*64.45*/.structure.id)),format.raw/*64.58*/(""""><img src="http://www.glycodigest.org:8080/eurocarb/get_sugar_image.action?download=true&scale=1.0&outputType=png&inputType=gws&tolerateUnknown=1&sequences="""),_display_(Seq[Any](/*64.216*/{result.gws})),format.raw/*64.228*/("""" /></a>
                """)))})),format.raw/*65.18*/("""
		"""),_display_(Seq[Any](/*66.4*/if(structureObject != null )/*66.32*/ {_display_(Seq[Any](format.raw/*66.34*/("""
      		<div class="bs-callout bs-callout-info">   
		   <h3>Search returned
        	      <small>
          		<span class='icon-book icon-white'></span> """),_display_(Seq[Any](/*70.57*/structureObject/*70.72*/.references.size())),format.raw/*70.90*/(""" References,
          		<span class='icon-leaf icon-white'></span> """),_display_(Seq[Any](/*71.57*/structureObject/*71.72*/.strtaxonomy.size())),format.raw/*71.91*/(""" Biological Associations,
          		<span class='icon-map-marker icon-white'></span> """),_display_(Seq[Any](/*72.63*/structureObject/*72.78*/.stsource.size())),format.raw/*72.94*/(""" Proteins
        	      </small>
      		   </h3>
    		</div>
    		""")))}/*76.9*/else/*76.14*/{_display_(Seq[Any](format.raw/*76.15*/("""
		   <h3>Search returned</h3>
			<div class="bs-callout bs-callout-warning">
				<p>The structure submitted could not be found! <br/>Only structures completely matching the submitted glycan topology will be returned.</p>
				<p>Check any similar structure in the 'Substructure' tab above!</p>
			</div>	
		""")))})),format.raw/*82.4*/("""
		"""),_display_(Seq[Any](/*83.4*/if(structure != null )/*83.26*/ {_display_(Seq[Any](format.raw/*83.28*/("""
    		   <div class='row-fluid'>
      		   	<h3>Publications</h3>
      			<div class="details span9">
        		"""),_display_(Seq[Any](/*87.12*/for(stref <- structure) yield /*87.35*/{_display_(Seq[Any](format.raw/*87.36*/("""
          		"""),_display_(Seq[Any](/*88.14*/for( (reference,i) <- stref.references.zipWithIndex; if (i <=3)) yield /*88.78*/{_display_(Seq[Any](format.raw/*88.79*/("""
            		<p><a href="../references/"""),_display_(Seq[Any](/*89.42*/reference/*89.51*/.reference.id)),format.raw/*89.64*/("""" target="_blank">"""),_display_(Seq[Any](/*89.83*/reference/*89.92*/.reference.title)),format.raw/*89.108*/("""</a>, """),_display_(Seq[Any](/*89.115*/reference/*89.124*/.reference.year)),format.raw/*89.139*/(""", """),_display_(Seq[Any](/*89.142*/reference/*89.151*/.reference.authors)),format.raw/*89.169*/("""</p>
          		""")))})),format.raw/*90.14*/("""
        		""")))})),format.raw/*91.12*/("""
      			</div>
    		  </div>
    		""")))})),format.raw/*94.8*/("""

		"""),_display_(Seq[Any](/*96.4*/if(structureObject != null )/*96.32*/ {_display_(Seq[Any](format.raw/*96.34*/("""
    		   <div class="row-fluid">
      			<h3>Biological Associations</h3>
      			<div class="details span9">
        		"""),_display_(Seq[Any](/*100.12*/for( (tax,j) <- taxonomy.zipWithIndex; if (j <=3)) yield /*100.62*/{_display_(Seq[Any](format.raw/*100.63*/("""
        		<a href="" style="font-size: 14px; font-weight: normal; line-height: 22px; margin-bottom: 9px; color: #4B5C66;">"""),_display_(Seq[Any](/*101.124*/tax)),format.raw/*101.127*/(""", </a>
                    	""")))})),format.raw/*102.23*/("""
		""")))})),format.raw/*103.4*/("""

            </div>
            <div class="tab-pane" id="annotated">
		 """),_display_(Seq[Any](/*107.5*/if(subStr.size() > 0)/*107.26*/ {_display_(Seq[Any](format.raw/*107.28*/("""
    		<h3>GlycoSuite Substructure Matches (<i>"""),_display_(Seq[Any](/*108.48*/subStr/*108.54*/.size())),format.raw/*108.61*/(""" hits</i>)</h3>	
		 <div class="input-group"> <span class="input-group-addon">Filter</span>
        	   <input id="filter" type="text" class="form-control" placeholder="Type species/glycoprotein/author...">
        	</div>
		<table id="demo" class="table table-striped table-bordered table-condensed">
                <thead><th>Structure</th><th>Taxonomy</th></thead>
                <tbody class="searchable">
                """),_display_(Seq[Any](/*115.18*/for(ls <- subStr) yield /*115.35*/ {_display_(Seq[Any](format.raw/*115.37*/("""
                """),_display_(Seq[Any](/*116.18*/for(l <- ls.translation) yield /*116.42*/ {_display_(Seq[Any](format.raw/*116.44*/("""
                   <tr><td><a href="/structure/"""),_display_(Seq[Any](/*117.49*/l/*117.50*/.structure.id)),format.raw/*117.63*/(""""><img src="http://www.glycodigest.org:8080/eurocarb/get_sugar_image.action?download=true&scale=1.0&outputType=png&inputType=gws&tolerateUnknown=1&sequences="""),_display_(Seq[Any](/*117.221*/{l.gws})),format.raw/*117.228*/(""".png" /></a>
                   </td><td>
		 
		   """),_display_(Seq[Any](/*120.7*/l/*120.8*/.structure.strproteintaxbiolsource.groupBy(_.taxonomy).map/*120.66*/{ case (i, j) =>_display_(Seq[Any](format.raw/*120.82*/(""" <p>"""),_display_(Seq[Any](/*120.87*/i/*120.88*/.species)),format.raw/*120.96*/("""   
		   """),format.raw/*121.118*/("""
		   """),_display_(Seq[Any](/*122.7*/j/*122.8*/.groupBy(_.reference).map/*122.33*/{ case (y,z) =>_display_(Seq[Any](format.raw/*122.48*/(""" (<a href="/references/"""),_display_(Seq[Any](/*122.72*/y/*122.73*/.id)),format.raw/*122.76*/("""" target="_blank">"""),_display_(Seq[Any](/*122.95*/y/*122.96*/.first)),format.raw/*122.102*/(""" , """),_display_(Seq[Any](/*122.106*/y/*122.107*/.year)),format.raw/*122.112*/("""</a>) 
		   """),_display_(Seq[Any](/*123.7*/z/*123.8*/.groupBy(_.proteins).map/*123.32*/{ case (d,e) =>_display_(Seq[Any](format.raw/*123.47*/("""  """),_display_(Seq[Any](/*123.50*/if(d != null )/*123.64*/ {_display_(Seq[Any](format.raw/*123.66*/("""<span class="label label-default">"""),_display_(Seq[Any](/*123.101*/d/*123.102*/.name)),format.raw/*123.107*/("""</span>  """)))})),format.raw/*123.117*/("""
		   </p>
		   """)))}))))})),format.raw/*125.8*/("""
		   
		   
		   """),format.raw/*128.95*/("""
		   """)))})),format.raw/*129.7*/("""
		   

		   

                </td></tr>
                """)))})),format.raw/*135.18*/("""
                """)))})),format.raw/*136.18*/("""
                </tbody></table>
		""")))})),format.raw/*138.4*/("""		

            </div>
        </div>
    </div>
""")))})),format.raw/*143.2*/("""
"""))}
    }
    
    def render(result:List[Translation],structure:List[Structure],taxonomy:ArrayList[String],structureObject:Structure,listSub:List[com.avaje.ebean.SqlRow],subStr:HashSet[Structure]): play.api.templates.HtmlFormat.Appendable = apply(result,structure,taxonomy,structureObject,listSub,subStr)
    
    def f:((List[Translation],List[Structure],ArrayList[String],Structure,List[com.avaje.ebean.SqlRow],HashSet[Structure]) => play.api.templates.HtmlFormat.Appendable) = (result,structure,taxonomy,structureObject,listSub,subStr) => apply(result,structure,taxonomy,structureObject,listSub,subStr)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 02 10:52:57 EST 2014
                    SOURCE: /Users/matthew/git/glycomics_working/app/views/saySearch.scala.html
                    HASH: a7ee73d5f4d7ef3927d04ecb1b1d5029a3b6ce15
                    MATRIX: 881->1|1171->180|1198->198|1235->201|1246->205|1283->206|1350->246|1378->247|1425->267|1453->268|1522->309|1551->310|1726->457|1755->458|1845->520|1874->521|1920->540|1949->541|1983->548|2011->549|2050->561|2078->562|4024->2472|4061->2493|4100->2494|4175->2533|4190->2539|4225->2552|4420->2710|4455->2722|4513->2748|4552->2752|4589->2780|4629->2782|4822->2939|4846->2954|4886->2972|4991->3041|5015->3056|5056->3075|5180->3163|5204->3178|5242->3194|5331->3266|5344->3271|5383->3272|5722->3580|5761->3584|5792->3606|5832->3608|5984->3724|6023->3747|6062->3748|6112->3762|6192->3826|6231->3827|6309->3869|6327->3878|6362->3891|6417->3910|6435->3919|6474->3935|6518->3942|6537->3951|6575->3966|6615->3969|6634->3978|6675->3996|6725->4014|6769->4026|6839->4065|6879->4070|6916->4098|6956->4100|7117->4224|7184->4274|7224->4275|7386->4399|7413->4402|7475->4431|7511->4435|7622->4510|7653->4531|7694->4533|7779->4581|7795->4587|7825->4594|8291->5023|8325->5040|8366->5042|8421->5060|8462->5084|8503->5086|8589->5135|8600->5136|8636->5149|8832->5307|8863->5314|8951->5366|8961->5367|9029->5425|9084->5441|9126->5446|9137->5447|9168->5455|9207->5576|9250->5583|9260->5584|9295->5609|9349->5624|9410->5648|9421->5649|9447->5652|9503->5671|9514->5672|9544->5678|9586->5682|9598->5683|9627->5688|9676->5701|9686->5702|9720->5726|9774->5741|9814->5744|9838->5758|9879->5760|9952->5795|9964->5796|9993->5801|10037->5811|10091->5829|10138->5936|10177->5943|10269->6002|10320->6020|10389->6057|10471->6107
                    LINES: 26->1|30->1|31->3|33->5|33->5|33->5|35->7|35->7|37->9|37->9|39->11|39->11|43->15|43->15|45->17|45->17|47->19|47->19|49->21|49->21|51->23|51->23|91->63|91->63|91->63|92->64|92->64|92->64|92->64|92->64|93->65|94->66|94->66|94->66|98->70|98->70|98->70|99->71|99->71|99->71|100->72|100->72|100->72|104->76|104->76|104->76|110->82|111->83|111->83|111->83|115->87|115->87|115->87|116->88|116->88|116->88|117->89|117->89|117->89|117->89|117->89|117->89|117->89|117->89|117->89|117->89|117->89|117->89|118->90|119->91|122->94|124->96|124->96|124->96|128->100|128->100|128->100|129->101|129->101|130->102|131->103|135->107|135->107|135->107|136->108|136->108|136->108|143->115|143->115|143->115|144->116|144->116|144->116|145->117|145->117|145->117|145->117|145->117|148->120|148->120|148->120|148->120|148->120|148->120|148->120|149->121|150->122|150->122|150->122|150->122|150->122|150->122|150->122|150->122|150->122|150->122|150->122|150->122|150->122|151->123|151->123|151->123|151->123|151->123|151->123|151->123|151->123|151->123|151->123|151->123|153->125|156->128|157->129|163->135|164->136|166->138|171->143
                    -- GENERATED --
                */
            