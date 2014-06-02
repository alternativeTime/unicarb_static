
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
object glycodigest extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Map[String, String],Long,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(map: Map[String,String], id: Long, ct: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.49*/("""
"""),format.raw/*3.1*/("""

"""),_display_(Seq[Any](/*5.2*/main/*5.6*/ {_display_(Seq[Any](format.raw/*5.8*/("""

<style type="text/css">
#wrapperpin """),format.raw/*8.13*/("""{"""),format.raw/*8.14*/("""
	width: 90%;
	max-width: 1100px;
	min-width: 800px;
	margin: 50px auto;
"""),format.raw/*13.1*/("""}"""),format.raw/*13.2*/("""

#columnspin """),format.raw/*15.13*/("""{"""),format.raw/*15.14*/("""
	-webkit-column-count: 3;
	-webkit-column-gap: 10px;
	-webkit-column-fill: auto;
	-moz-column-count: 3;
	-moz-column-gap: 10px;
	-moz-column-fill: auto;
	column-count: 3;
	column-gap: 15px;
	column-fill: auto;
"""),format.raw/*25.1*/("""}"""),format.raw/*25.2*/("""
.pin """),format.raw/*26.6*/("""{"""),format.raw/*26.7*/("""
	display: inline-block;
	background: #FEFEFE;
	border: 2px solid #FAFAFA;
	box-shadow: 0 1px 2px rgba(34, 25, 25, 0.4);
	margin: 0 2px 15px;
	-webkit-column-break-inside: avoid;
	-moz-column-break-inside: avoid;
	column-break-inside: avoid;
	padding: 15px;
	padding-bottom: 5px;
	background: -webkit-linear-gradient(45deg, #FFF, #F9F9F9);
	opacity: 1;
	-webkit-transition: all .2s ease;
	-moz-transition: all .2s ease;
	-o-transition: all .2s ease;
	transition: all .2s ease;
"""),format.raw/*43.1*/("""}"""),format.raw/*43.2*/("""

.pin img """),format.raw/*45.10*/("""{"""),format.raw/*45.11*/("""
	width: 100%;
	border-bottom: 1px solid #ccc;
	padding-bottom: 15px;
	margin-bottom: 5px;
"""),format.raw/*50.1*/("""}"""),format.raw/*50.2*/("""

.pin2 p """),format.raw/*52.9*/("""{"""),format.raw/*52.10*/("""
	font: 12px/18px Arial, sans-serif;
	color: #333;
	margin: 0;
"""),format.raw/*56.1*/("""}"""),format.raw/*56.2*/("""



#columns:hover .pin:not(:hover) """),format.raw/*60.33*/("""{"""),format.raw/*60.34*/("""
	opacity: 0.4;
"""),format.raw/*62.1*/("""}"""),format.raw/*62.2*/("""

</style>

<script>
        $(document).ready(function() """),format.raw/*67.38*/("""{"""),format.raw/*67.39*/("""  
        
        $("#e20").select2("""),format.raw/*69.27*/("""{"""),format.raw/*69.28*/("""
            tags:["ABS", "AMF", "BKF", "BTG", "GUH", "JBM", "NAN1", "SPG" ],
            tokenSeparators: [",", " "]"""),format.raw/*71.40*/("""}"""),format.raw/*71.41*/(""");
        """),format.raw/*72.9*/("""}"""),format.raw/*72.10*/(""");
</script>

<script>
	$('.container').hide();
	$('#game_container').show();

	$('.post_types button').click(function()"""),format.raw/*79.42*/("""{"""),format.raw/*79.43*/("""
        	var target = "#" + $(this).data("target");
	        $(".container").not(target).hide();
	        $(target).show();
	        $('#post_type').val($(target).text());
	"""),format.raw/*84.2*/("""}"""),format.raw/*84.3*/(""");
</script>

<ul class="breadcrumb">
    <li><i class="icon-home" ></i><a href="/"> UniCarbKB</a> <span class="divider"></span></li>
    <li class="active"><i class="icon-map-marker" ></i> GlycoDigest<span class="divider"></span></li>
</ul>
   
<div class="page-header row-fluid"> 
    <h1 id="homeTitle">GlycoDigest</h1>
    <h4 class="subheader">A tool to predict exoglycosidase digestions</h4>
</div>

<div class="bs-callout bs-callout-warning" >
	<h4>Using Exoglycosidases <span class="glyphicon glyphicon-search"></span></h4>
    <p>Exoglycosidase enzyme array digestions, in combination with U/HPLC and LC-MS, can deliver semi-quantitative glycan analysis of sugars released from glycoproteins. A detailed description and example experimental protocols for using and applying exoglycosidases is published by <a href="http://link.springer.com/protocol/10.1385%2F1-59745-167-3%3A125" target="_blank">Royle et al., Methods Mol Biol. 2006;347:125-43</a>.</p>
    <p>A summary of the mode of action of exoglycosidases and examples can be found <a href="http://www.glycodigest.org/exoglycosidase.pdf" target="_blank">here</a>. Click the 'Information on Glycosidases' button in the 'Build Exoglycosidases' box below.</p>
    """),format.raw/*103.13*/("""



</div>

<div id="actions">
	<div>
           <img src="http://www.glycodigest.org:8080/eurocarb/get_sugar_image.action?download=false&amp;scale=1.0&amp;opaque=false&amp;outputType=png&notation=cfglink&inputType=glycoct_condensed&sequences="""),_display_(Seq[Any](/*111.207*/helper/*111.213*/.urlEncode(ct))),format.raw/*111.227*/("""" />
   	</div>
	<div class="bs-callout bs-callout-info" >
    	   <h4>Build Exoglycosidase Array</h4>
	   <p>Use the search box below to select the panel of exoglycosidase to digest the structure shown:</p>	
	 <form class="form-search" action=""""),_display_(Seq[Any](/*116.38*/routes/*116.44*/.Glycodigest.glycodigesttest({id}))),format.raw/*116.78*/("""" method="GET">  	
       <div id="selection" class="row-fluid">
       <input name=digest  id="e20" id="listBox" class="span4"></input>
       <button type="submit" class="btn btn-primary">Digest</button>
       <a class='btn pull-right' href="/builderDigest"><i class="icon-refresh"></i> New Glycan</a>
       </div>
    </form>
<div class='more-exoglycosidases'>
    <a id='toggle-exoglycosidases'><span class='label'><span class='icon-tags icon-white'></span> Information on Exoglycosidases <span class="caret"></span></span></a>
   </div>

</div>

<div>
	          <ul id='more-exoglycosidases'>
<div class="table-responsive" id="exoglycosidases">
	<table class="table table-striped">
		<thead>
	        <tr>
	        <th>Short Name</th>
	        <th>Full Name</th>
	        <th>Source</th>
	        <th>Specificity</th>
		</tr>
		</thead>
		<tr><td>
			ABS</td>
		    <td>α(2-3,6,8,9)-Sialidase</td>
		    <td>Recombinant Arthrobacter ureafaciens gene, expressed in E. coli
			    </td><td>α(2-3,6,8,9)-specific, cleaves all non-reducing terminal branched and unbranched sialic acids</td></tr>
		<tr><td>NAN1
		    </td>
		    <td>α(2-3)-Sialidase
		    </td>
		    <td>Recombinant Streptococcus pneumoniae gene, expressed in E. coli
		    </td><td>Releases α(2-3)-linked sialic acid
		    </td>
	    	</tr>
		<tr><td>BKF
		    </td><td>α(1-2,3,4,6)-Fucosidase
		    </td><td>Bovine Kidney
		    </td><td>iReleases non-reducing terminal α(1-6) core-linked fucose more efficiently than other α-fucose linkages. Frequently used for release of core fucose residues
		    </td>
	    	</tr>
		<tr><td>XMF
		    </td>
		    <td>α(1-2)-Fucosidase
		    </td>
		    <td>Xanthomonas manihotis
		    </td>
	    	    <td>Releases non-reducing terminal α(1-2)-linked fucose
		    </td>
	    	</tr>
		<tr>
		    <td>AMF
		    </td>
		    <td>α(1-3,4)-Fucosidase
		    </td>
		    <td>Almond Meal
		    </td>
		    <td>Releases non-reducing terminal α(1-3,4)-linked fucose. Does not release core linked fucose in α(1-3,6) configuration
		    </td>
	    	</tr>
		<tr>
		   <td>BTG
		   </td>
		   <td>	β(1-3,4)-Galactosidase
		   </td>
		   <td>Bovine testis
		   </td>
		   <td>Releases non-reducing terminal β(1-3,4)-linked galactose residues
		   </td>
		</tr>
		<tr>
 		   <td>SPG
		   </td>
		   <td>β(1-4)-Galactosidase
		   </td>
		   <td>Streptococcus pneumoniae
		   </td>
		   <td>β(1-4) specific galactosidase removes galactose residues from non- reducing terminal
		   </td>
	   	</tr>
		<tr><td>CBG</td>
		<td>α(1-3,4,6)-Galactosidase</td>
		<td>Coffee Bean</td>
			<td>Hydrolyses α(1-3,4,6)-linked terminal galactose residues</td>
		</tr>
		<tr>
			<td>JBM</td>
			<td>α(1-2,3,6)-Mannosidase</td>
			<td>Jack Bean</td>
			<td>Releases non-reducing terminal α(1-2,6)-linked mannose residues more efficiently than α(1-3)</td>
		</tr>
		<tr>
			<td>GUH</td>
			<td>β-N-Acetylhexosaminidase</td>
			<td>Recombinant Streptococcus pneumoniae gene, expressed in E. coli</td>
			<td>Releases all non-reducing terminal β-linked N-acetylglucosamine but not bisecting GlcNAc β(1-4)Man residues</td>
		</tr>
		<tr>
			<td>JBH</td>
			<td>β-N-Acetylhexosaminidase</td>
			<td>Jack Bean</td>
			<td>Specific to all non-reducing terminal β(1-2,3,4,6)-linked N- acetylglucosamine and N-acetylgalactosamine residues</td>
		</tr>
		   


	</table>
</div>
</ul></div>

<h2>Results</h2>
<div>
"""),_display_(Seq[Any](/*231.2*/for((key, value) <- map) yield /*231.26*/{_display_(Seq[Any](format.raw/*231.27*/("""
    <div class="col-xs-6 col-md-3"">
      <img class="thumbnail" src="http://www.glycodigest.org:8080/eurocarb/get_sugar_image.action?download=false&amp;scale=0.5&amp;opaque=false&amp;outputType=png&notation=cfglink&inputType=glycoct_condensed&sequences="""),_display_(Seq[Any](/*233.220*/value)),format.raw/*233.225*/("""" />
      <p>"""),_display_(Seq[Any](/*234.11*/key/*234.14*/.replace("ABS", "ABS - Sialidase").replace("BTG", "β(1-3,4)-Galactosidase").replace("NAN1", "NAN1 - α(2-3)-Sialidase").replace("BKF", "BKF α(1-2,3,4,6)-Fucosidase").replace("XMF", "XMF α(1-2)-Fucosidase").replace("AMF", "AMF α(1-3,4)-Fucosidase").replace("SPG", "SPG β(1-4)-Galactosidase").replace("CBG", "CBG α(1-3,4,6)-Galactosidase").replace("JBM", "JBM α(1-2,3,6)-Mannosidase").replace("GUH", "GUH β-N-Acetylhexosaminidase").replace("JBH", "JBH β-N-Acetylhexosaminidase"))),format.raw/*234.489*/("""</p>
    </div>
""")))})),format.raw/*236.2*/("""
</div>



      """),_display_(Seq[Any](/*241.8*/views/*241.13*/.html.footerunicarb.footerunicarb())),format.raw/*241.48*/("""    


  </section>
        
""")))})),format.raw/*246.2*/("""
"""))}
    }
    
    def render(map:Map[String, String],id:Long,ct:String): play.api.templates.HtmlFormat.Appendable = apply(map,id,ct)
    
    def f:((Map[String, String],Long,String) => play.api.templates.HtmlFormat.Appendable) = (map,id,ct) => apply(map,id,ct)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 02 10:52:56 EST 2014
                    SOURCE: /Users/matthew/git/glycomics_working/app/views/glycodigest.scala.html
                    HASH: 4650361ef5a6a49f604f2b9a09671b89a5d28c3e
                    MATRIX: 805->1|962->48|989->66|1026->69|1037->73|1075->75|1140->113|1168->114|1268->187|1296->188|1338->202|1367->203|1605->414|1633->415|1666->421|1694->422|2198->899|2226->900|2265->911|2294->912|2412->1003|2440->1004|2477->1014|2506->1015|2596->1078|2624->1079|2688->1115|2717->1116|2760->1132|2788->1133|2874->1191|2903->1192|2969->1230|2998->1231|3143->1348|3172->1349|3210->1360|3239->1361|3387->1481|3416->1482|3617->1656|3645->1657|4899->3100|5181->3344|5198->3350|5236->3364|5519->3610|5535->3616|5592->3650|9007->7029|9048->7053|9088->7054|9383->7311|9412->7316|9464->7331|9477->7334|9976->7809|10025->7826|10079->7844|10094->7849|10152->7884|10214->7914
                    LINES: 26->1|30->1|31->3|33->5|33->5|33->5|36->8|36->8|41->13|41->13|43->15|43->15|53->25|53->25|54->26|54->26|71->43|71->43|73->45|73->45|78->50|78->50|80->52|80->52|84->56|84->56|88->60|88->60|90->62|90->62|95->67|95->67|97->69|97->69|99->71|99->71|100->72|100->72|107->79|107->79|112->84|112->84|129->103|137->111|137->111|137->111|142->116|142->116|142->116|257->231|257->231|257->231|259->233|259->233|260->234|260->234|260->234|262->236|267->241|267->241|267->241|272->246
                    -- GENERATED --
                */
            