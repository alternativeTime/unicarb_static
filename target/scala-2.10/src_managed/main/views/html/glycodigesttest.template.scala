
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
object glycodigesttest extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Map[String, String],Long,String,play.api.templates.HtmlFormat.Appendable] {

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
	$(document).ready(function() """),format.raw/*67.31*/("""{"""),format.raw/*67.32*/("""
	$('input:button').click(function() """),format.raw/*68.37*/("""{"""),format.raw/*68.38*/("""
		    var x = $(this).attr('id');
	   	    ajax(x);
   	"""),format.raw/*71.5*/("""}"""),format.raw/*71.6*/(""");

	function ajax(x)"""),format.raw/*73.18*/("""{"""),format.raw/*73.19*/("""
		$.ajax("""),format.raw/*74.10*/("""{"""),format.raw/*74.11*/("""
	    	type: 'GET',
	        url: 'http://localhost:9000/ajax/' + x,
	    	dataType: 'json',
        	success: function(json) """),format.raw/*78.34*/("""{"""),format.raw/*78.35*/("""
		$('#badge').append( "<a href=\"/structure/" + json.message + "\"><span class=\"label label-dark\"><span class=\"icon-adjust icon-white\"></span> Link to UniCarbKB</span></a>"  );
     		"""),format.raw/*80.8*/("""}"""),format.raw/*80.9*/(""",
		error: function(json) """),format.raw/*81.25*/("""{"""),format.raw/*81.26*/("""
			$('#badge').append("<p>no result</p>");
		"""),format.raw/*83.3*/("""}"""),format.raw/*83.4*/("""
        """),format.raw/*84.9*/("""}"""),format.raw/*84.10*/(""");
	"""),format.raw/*85.2*/("""}"""),format.raw/*85.3*/("""
	"""),format.raw/*86.2*/("""}"""),format.raw/*86.3*/(""");
	</script>

<script>
        $(document).ready(function() """),format.raw/*90.38*/("""{"""),format.raw/*90.39*/("""  
        
        $("#e20").select2("""),format.raw/*92.27*/("""{"""),format.raw/*92.28*/("""
            tags:["ABS", "AMF", "BKF", "BTG", "GUH", "JBM", "NAN1", "SPG" ],
            tokenSeparators: [",", " "]"""),format.raw/*94.40*/("""}"""),format.raw/*94.41*/(""");
        """),format.raw/*95.9*/("""}"""),format.raw/*95.10*/(""");
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
</div>

<div id="actions">
	<div>
		<a href="/structure/1249"><img src="http://www.glycodigest.org:8080/eurocarb/get_sugar_image.action?download=false&amp;scale=1.0&amp;opaque=false&amp;outputType=png&notation=cfg&inputType=glycoct_condensed&sequences="""),_display_(Seq[Any](/*116.220*/helper/*116.226*/.urlEncode(ct))),format.raw/*116.240*/("""" ></a>
	</div>
	
	"""),format.raw/*122.71*/("""

   <div class="bs-callout bs-callout-info" >
        <h4>Build Exoglycosidase Array</h4>
        <p>Use the search box below to select the panel of exoglycosidase to digest the structure shown:</p>    
       <form class="form-search" action=""""),_display_(Seq[Any](/*127.43*/routes/*127.49*/.Glycodigest.glycodigesttest(1249))),format.raw/*127.83*/("""" method="GET">  	
       <div id="selection" class="row-fluid">
       <input name=digest  id="e20" id="listBox" class="span4"></input>
       <button type="submit" class="btn btn-primary">Search</button>
       </div>
    </form>
    <div class='more-exoglycosidases'>
    <a id='toggle-exoglycosidases'><span class='label'><span class='icon-tags icon-white'></span> Information on Exoglycosidases <span class="caret"></span></span></a>
   </div>
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
 <td> β(1-3,4)-Galactosidase
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
    <ul class="thumbnails">
"""),_display_(Seq[Any](/*243.2*/for((key, value) <- map) yield /*243.26*/{_display_(Seq[Any](format.raw/*243.27*/("""
    """),_display_(Seq[Any](/*244.6*/if(!key.contains("no change"))/*244.36*/ {_display_(Seq[Any](format.raw/*244.38*/("""
    <li class="span4">
    <div class="thumbnail">
      <img src="http://www.glycodigest.org:8080/eurocarb/get_sugar_image.action?download=false&amp;scale=0.5&amp;opaque=false&amp;outputType=png&notation=cfglink&inputType=glycoct_condensed&sequences="""),_display_(Seq[Any](/*247.202*/value)),format.raw/*247.207*/("""" />
      <p>"""),_display_(Seq[Any](/*248.11*/key/*248.14*/.replace("ABS", "ABS - Sialidase").replace("BTG", " BTG β(1-3,4)-Galactosidase").replace("NAN1", "NAN1 - α(2-3)-Sialidase").replace("BKF", "BKF α(1-2,3,4,6)-Fucosidase").replace("XMF", "XMF α(1-2)-Fucosidase").replace("AMF", "AMF α(1-3,4)-Fucosidase").replace("SPG", "SPG β(1-4)-Galactosidase").replace("CBG", "CBG α(1-3,4,6)-Galactosidase").replace("JBM", "JBM α(1-2,3,6)-Mannosidase").replace("GUH", "GUH β-N-Acetylhexosaminidase").replace("JBH", "JBH β-N-Acetylhexosaminidase").replace("ABS - Sialidase + ABS - Sialidase", "ABS - Sialidase"))),format.raw/*248.558*/("""</p>
    </div>
    </li>
    """)))})),format.raw/*251.6*/("""
""")))})),format.raw/*252.2*/("""
    </ul>
</div>
      """),_display_(Seq[Any](/*255.8*/views/*255.13*/.html.footerunicarb.footerunicarb())),format.raw/*255.48*/("""    
        
""")))})),format.raw/*257.2*/("""
"""))}
    }
    
    def render(map:Map[String, String],id:Long,ct:String): play.api.templates.HtmlFormat.Appendable = apply(map,id,ct)
    
    def f:((Map[String, String],Long,String) => play.api.templates.HtmlFormat.Appendable) = (map,id,ct) => apply(map,id,ct)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 02 10:52:56 EST 2014
                    SOURCE: /Users/matthew/git/glycomics_working/app/views/glycodigesttest.scala.html
                    HASH: e556fdad8461183c59024dae9e9d23fc36a344bc
                    MATRIX: 809->1|966->48|993->66|1030->69|1041->73|1079->75|1144->113|1172->114|1272->187|1300->188|1342->202|1371->203|1609->414|1637->415|1670->421|1698->422|2202->899|2230->900|2269->911|2298->912|2416->1003|2444->1004|2481->1014|2510->1015|2600->1078|2628->1079|2692->1115|2721->1116|2764->1132|2792->1133|2871->1184|2900->1185|2965->1222|2994->1223|3078->1280|3106->1281|3155->1302|3184->1303|3222->1313|3251->1314|3405->1440|3434->1441|3650->1630|3678->1631|3732->1657|3761->1658|3834->1704|3862->1705|3898->1714|3927->1715|3958->1719|3986->1720|4015->1722|4043->1723|4132->1784|4161->1785|4227->1823|4256->1824|4401->1941|4430->1942|4468->1953|4497->1954|6016->3435|6033->3441|6071->3455|6119->3710|6402->3956|6418->3962|6475->3996|11108->8593|11149->8617|11189->8618|11231->8624|11271->8654|11312->8656|11603->8909|11632->8914|11684->8929|11697->8932|12265->9476|12328->9507|12362->9509|12423->9534|12438->9539|12496->9574|12543->9589
                    LINES: 26->1|30->1|31->3|33->5|33->5|33->5|36->8|36->8|41->13|41->13|43->15|43->15|53->25|53->25|54->26|54->26|71->43|71->43|73->45|73->45|78->50|78->50|80->52|80->52|84->56|84->56|88->60|88->60|90->62|90->62|95->67|95->67|96->68|96->68|99->71|99->71|101->73|101->73|102->74|102->74|106->78|106->78|108->80|108->80|109->81|109->81|111->83|111->83|112->84|112->84|113->85|113->85|114->86|114->86|118->90|118->90|120->92|120->92|122->94|122->94|123->95|123->95|144->116|144->116|144->116|147->122|152->127|152->127|152->127|268->243|268->243|268->243|269->244|269->244|269->244|272->247|272->247|273->248|273->248|273->248|276->251|277->252|280->255|280->255|280->255|282->257
                    -- GENERATED --
                */
            