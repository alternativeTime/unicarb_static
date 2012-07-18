
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
		<h2 class="fullname">Structure's associated with taxonomy:</h2>

		<ul class="thumbnails">
        		"""),_display_(Seq(/*25.12*/for(s <- taxon.strtaxonomy ) yield /*25.40*/{_display_(Seq(format.raw/*25.41*/("""

        	<li class="span4">
          		<a href=""""),_display_(Seq(/*28.23*/routes/*28.29*/.Application.structureDetails(s.structure.id))),format.raw/*28.74*/("""" class="thumbnail">
            		<img src="http://glycosuitedb.expasy.org/glycosuite-structures//_"""),_display_(Seq(/*29.81*/{s.structure.id})),format.raw/*29.97*/(""".png" alt="">
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
      	<h3>Protein Association</h3>
      	<p style="font-size: 14px; line-height: 20px; text-align:justify">The GlycoSuite database is an annotated and curated relational database of glycan structures. For the taxonomic entry """),_display_(Seq(/*55.193*/taxon/*55.198*/.species)),format.raw/*55.206*/(""" a number of glycan structures, glycoproteins and tissue source's have been curated.</p>
	 <p  style="font-weight: bold;"><a href=""  data-toggle="modal" data-id='"""),_display_(Seq(/*56.76*/taxon)),format.raw/*56.81*/("""' class="announceTaxStructures"><i class="icon-resize-full"></i> See more structures</a> <small>limited to six records below</small></p>
	</div>
	<ul class="thumbnails">
	"""),_display_(Seq(/*59.3*/for((s, i) <- taxon.strtaxonomy.zipWithIndex; if (i <=5) ) yield /*59.61*/{_display_(Seq(format.raw/*59.62*/("""

        <li class="span5">
          <a href=""""),_display_(Seq(/*62.21*/routes/*62.27*/.Application.structureDetails(s.structure.id))),format.raw/*62.72*/("""" class="thumbnail">
            <img src="http://glycosuitedb.expasy.org/glycosuite-structures//_"""),_display_(Seq(/*63.79*/{s.structure.id})),format.raw/*63.95*/(""".png" alt="">
          </a>
        </li>
	""")))})),format.raw/*66.3*/("""
      </ul>
	<p  style="font-weight: bold;"><a href=""  data-toggle="modal" data-id='"""),_display_(Seq(/*68.75*/taxon)),format.raw/*68.80*/("""' class="announceTaxStructures"><i class="icon-resize-full"></i> See more structures</a></p>
	
</div>
    <div class="span4">
      <h3><small>Glycan Structures</small></h3>
	<p><i class="icon-chevron-right"></i> <b>"""),_display_(Seq(/*73.44*/taxon/*73.49*/.strtaxonomy.size())),format.raw/*73.68*/(""" </b> structures reported</p>
	<p><i class="icon-th-large"></i> See more details</p>

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
                    DATE: Thu Jul 12 13:36:39 EST 2012
                    SOURCE: /home/matthew/Documents/play-app/tmp/computer-database/app/views/taxonDetails.scala.html
                    HASH: 564325861a8fec26fc0a81b6e96bc3cc68bccac2
                    MATRIX: 801->1|966->220|979->226|1067->256|1137->295|1164->300|1214->90|1241->108|1269->217|1298->316|1331->319|1343->323|1377->325|1735->652|1779->680|1813->681|1896->733|1911->739|1978->784|2110->885|2148->901|2228->950|2493->1185|2522->1192|2562->1201|2576->1206|2606->1214|3079->1655|3094->1660|3125->1668|3320->1832|3347->1837|3549->2009|3623->2067|3657->2068|3737->2117|3752->2123|3819->2168|3949->2267|3987->2283|4063->2328|4181->2415|4208->2420|4456->2637|4470->2642|4511->2661|4713->2832|4730->2840|4759->2847|4824->2882|4891->2933|4926->2935|4984->2962|5020->2976|5063->2988|5304->3375|5495->3518|5598->3573|5957->3885|6251->4131|6557->4390|6612->4398|6660->4414
                    LINES: 27->1|30->8|30->8|32->8|34->10|34->10|37->1|38->3|39->6|41->12|43->14|43->14|43->14|54->25|54->25|54->25|57->28|57->28|57->28|58->29|58->29|61->32|74->45|74->45|74->45|74->45|74->45|84->55|84->55|84->55|85->56|85->56|88->59|88->59|88->59|91->62|91->62|91->62|92->63|92->63|95->66|97->68|97->68|102->73|102->73|102->73|106->77|106->77|106->77|108->79|108->79|108->79|109->80|109->80|110->81|117->90|127->100|129->102|134->107|143->116|150->123|151->124|154->127
                    -- GENERATED --
                */
            