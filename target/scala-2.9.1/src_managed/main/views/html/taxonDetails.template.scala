
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
object taxonDetails extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,Taxonomy,List[Biolsource],List[SqlRow],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(message: String, taxon: Taxonomy, biolsource: List[Biolsource], groupTax: List[SqlRow] ):play.api.templates.Html = {
        _display_ {import helper._

def /*8.2*/header/*8.8*/(key:String, title:String):play.api.templates.Html = {_display_(

Seq(format.raw/*8.38*/("""
    <th class="">
        <a href="">"""),_display_(Seq(/*10.21*/title)),format.raw/*10.26*/("""</a>
    </th>
""")))};
Seq(format.raw/*1.91*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*6.37*/("""

"""),format.raw/*12.2*/("""

"""),_display_(Seq(/*14.2*/main/*14.6*/ {_display_(Seq(format.raw/*14.8*/("""

     <div class="modal hide fade" id="taxDescription">
	<div class="modal-header">
		<a href="#" class="close" data-dismiss="modal">&times;</a>
             	<h3>Taxonomy Structures</h3>
	</div>
	<div class="modal-body">
		"""),format.raw/*22.74*/("""

		<ul class="thumbnails">
        		"""),_display_(Seq(/*25.12*/for(s <- taxon.strtaxonomy ) yield /*25.40*/{_display_(Seq(format.raw/*25.41*/("""

        	<li class="span4">
          		<a href=""""),_display_(Seq(/*28.23*/routes/*28.29*/.Application.structureDetails(s.structure.id))),format.raw/*28.74*/("""" class="thumbnail">
            		<img src="../images/_"""),_display_(Seq(/*29.37*/{s.structure.id})),format.raw/*29.53*/(""".png" alt="">
          		</a>
        	</li>
		""")))})),format.raw/*32.4*/("""
		</ul>
	</div>
	<div class="modal-footer">
                <a href="#" class="btn primary" onclick="okClicked ();">OK</a>
	</div>

     </div>	


     <div class="container">
     	<section>
        	<div class="page-header">
		<h1>"""),_display_(Seq(/*45.8*/message)),format.raw/*45.15*/(""" <small>"""),_display_(Seq(/*45.24*/taxon/*45.29*/.species)),format.raw/*45.37*/("""</small>  <span class="label success">Curated Entry</span> <span class="label notice">GlycoSuiteDB</span><br /></h1>
		</div>
	</section>

	<section>
	<div class="row">
<div class="span12">

	<div class="span10">
      	<h3>"""),_display_(Seq(/*54.13*/message)),format.raw/*54.20*/("""</h3>
      	<p style="font-size: 14px; line-height: 20px; text-align:justify">The GlycoSuite database is an annotated and curated relational database of glycan structures. For the taxonomy entry <b>"""),_display_(Seq(/*55.195*/taxon/*55.200*/.species)),format.raw/*55.208*/("""</b> a number of glycan structures, glycoproteins and tissue source's have been curated.</p>
	 <p  style="font-weight: bold;"><a href=""  data-toggle="modal" data-id='"""),_display_(Seq(/*56.76*/taxon)),format.raw/*56.81*/("""' class="announceTaxStructures"><i class="icon-resize-full"></i> See more structures</a> <small>limited to six records below</small></p>
	</div>
	<ul class="thumbnails">
	"""),_display_(Seq(/*59.3*/for((s, i) <- taxon.strtaxonomy.zipWithIndex; if (i <=5) ) yield /*59.61*/{_display_(Seq(format.raw/*59.62*/("""

        <li class="span5">
          <a href=""""),_display_(Seq(/*62.21*/routes/*62.27*/.Application.structureDetails(s.structure.id))),format.raw/*62.72*/("""" class="thumbnail">
            <img src="../images/_"""),_display_(Seq(/*63.35*/{s.structure.id})),format.raw/*63.51*/(""".png" alt="">
          </a>
        </li>
	""")))})),format.raw/*66.3*/("""
      </ul>
	<p  style="font-weight: bold;"><a href=""  data-toggle="modal" data-id='"""),_display_(Seq(/*68.75*/taxon)),format.raw/*68.80*/("""' class="announceTaxStructures"><i class="icon-resize-full"></i> See more structures</a></p>
	
</div>
    <div class="span4">
      <h3><small>Glycan Structures</small></h3>
	<p><i class="icon-chevron-right"></i> <b>"""),_display_(Seq(/*73.44*/taxon/*73.49*/.strtaxonomy.size())),format.raw/*73.68*/(""" </b> structures reported</p>
	<p  style="font-weight: bold;"><a href=""  data-toggle="modal" data-id='"""),_display_(Seq(/*74.75*/taxon)),format.raw/*74.80*/("""' class="announceTaxStructures"><i class="icon-th-large"></i> See more details</a></p>

     <h3><small>Glycoproteins</small></h3>
	<p><i class="icon-chevron-right"></i><b>"""),_display_(Seq(/*77.43*/groupTax/*77.51*/.size())),format.raw/*77.58*/(""" </b> glycoproteins curated</p>

	"""),_display_(Seq(/*79.3*/for( (sql,i) <- groupTax.zipWithIndex; if (i <= 6)) yield /*79.54*/ {_display_(Seq(format.raw/*79.56*/("""
        <p class="short">"""),_display_(Seq(/*80.27*/sql("protein"))),format.raw/*80.41*/("""</p>
      """)))})),format.raw/*81.8*/("""


	<p><i class="icon-th-large"></i> See more details</p>
     <h3><small>External Resources</small></h3>
	<p><i class="icon-search"></i> Search UniCarb-DB</p>
	<p><i class="icon-search"></i> Search EUROCarbDB</p>
"""),format.raw/*90.7*/("""
    </div>
  </div>
	<div class="row"></div>
	</section>

     </div>


<script type="text/javascript">
    $(document).ready(new function() """),format.raw("""{"""),format.raw/*100.39*/("""
      // Prepare layout options.
      var options = """),format.raw("""{"""),format.raw/*102.22*/("""
        autoResize: true, // This will auto-update the layout when the browser window is resized.
        container: $('#myContent'), // Optional, used for some extra CSS styling
        offset: 2, // Optional, the distance between grid items
        itemWidth: 210 // Optional, the width of a grid item
      """),format.raw("""}"""),format.raw/*107.8*/(""";
      
      // Get a reference to your grid items.
      var handler = $('#myContent li');
      
      // Call the layout function.
      handler.wookmark(options);
      
      // Capture clicks on grid items.
      handler.click(function()"""),format.raw("""{"""),format.raw/*116.32*/("""
        // Randomize the height of the clicked item.
        var newHeight = $('img', this).height() + Math.round(Math.random()*300+30);
        $(this).css('height', newHeight+'px');
        
        // Update the layout.
        handler.wookmark();
      """),format.raw("""}"""),format.raw/*123.8*/(""");
    """),format.raw("""}"""),format.raw/*124.6*/(""");
  </script

""")))})),format.raw/*127.2*/("""
"""))}
    }
    
    def render(message:String,taxon:Taxonomy,biolsource:List[Biolsource],groupTax:List[SqlRow]) = apply(message,taxon,biolsource,groupTax)
    
    def f:((String,Taxonomy,List[Biolsource],List[SqlRow]) => play.api.templates.Html) = (message,taxon,biolsource,groupTax) => apply(message,taxon,biolsource,groupTax)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Oct 12 14:39:33 EST 2012
                    SOURCE: /home/matthew/Documents/play-app/tmp/glycomics/app/views/taxonDetails.scala.html
                    HASH: 46637745d89b034de6dea3bcef22826319a038a1
                    MATRIX: 801->1|966->220|979->226|1067->256|1137->295|1164->300|1214->90|1241->108|1269->217|1298->316|1331->319|1343->323|1377->325|1630->621|1700->660|1744->688|1778->689|1861->741|1876->747|1943->792|2031->849|2069->865|2149->914|2414->1149|2443->1156|2483->1165|2497->1170|2527->1178|2783->1403|2812->1410|3044->1610|3059->1615|3090->1623|3289->1791|3316->1796|3518->1968|3592->2026|3626->2027|3706->2076|3721->2082|3788->2127|3874->2182|3912->2198|3988->2243|4106->2330|4133->2335|4381->2552|4395->2557|4436->2576|4571->2680|4598->2685|4802->2858|4819->2866|4848->2873|4913->2908|4980->2959|5015->2961|5073->2988|5109->3002|5152->3014|5393->3401|5584->3544|5687->3599|6046->3911|6340->4157|6646->4416|6701->4424|6749->4440
                    LINES: 27->1|30->8|30->8|32->8|34->10|34->10|37->1|38->3|39->6|41->12|43->14|43->14|43->14|51->22|54->25|54->25|54->25|57->28|57->28|57->28|58->29|58->29|61->32|74->45|74->45|74->45|74->45|74->45|83->54|83->54|84->55|84->55|84->55|85->56|85->56|88->59|88->59|88->59|91->62|91->62|91->62|92->63|92->63|95->66|97->68|97->68|102->73|102->73|102->73|103->74|103->74|106->77|106->77|106->77|108->79|108->79|108->79|109->80|109->80|110->81|117->90|127->100|129->102|134->107|143->116|150->123|151->124|154->127
                    -- GENERATED --
                */
            