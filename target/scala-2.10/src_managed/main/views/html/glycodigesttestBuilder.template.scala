
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
object glycodigesttestBuilder extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Map[String, String],String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(map: Map[String,String], ct: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.39*/("""
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

<div id="actions">
	<div>
		<a href="/structure/1249"><img src="http://www.glycodigest.org:8080/eurocarb/get_sugar_image.action?download=false&amp;scale=1.0&amp;opaque=false&amp;outputType=png&notation=cfg&inputType=glycoct_condensed&sequences="""),_display_(Seq[Any](/*110.220*/helper/*110.226*/.urlEncode(ct))),format.raw/*110.240*/("""" ></a>
	</div>
	
	"""),format.raw/*116.72*/("""

    <p>Use the search box below to select the panel of exoglycosidase to digest the structure shown:</p>    
     <form class="form-search" action="/glycodigestBuilder/test/digest" method="GET">  	
       <div id="selection" class="row-fluid">
       <input name=digest  id="e20" id="listBox" class="span4"></input>
       <button type="submit" class="btn btn-primary">Digest</button>
       <p><a href="http://www.glycodigest.org/exoglycosidase.pdf">Exoglycosidase information</a></p> 
       </div>
    </form> 
</div>

<div>
	<ul class="thumbnails">
"""),_display_(Seq[Any](/*130.2*/for((key, value) <- map) yield /*130.26*/{_display_(Seq[Any](format.raw/*130.27*/("""
	<li class="span4">
    <div class="thumbnail">
         <img src="http://www.glycodigest.org:8080/eurocarb/get_sugar_image.action?download=false&amp;scale=1.0&amp;opaque=false&amp;outputType=png&notation=cfg&inputType=glycoct_condensed&sequences="""),_display_(Seq[Any](/*133.201*/value)),format.raw/*133.206*/("""" />
      	<p class="pin2">Enzyme"""),_display_(Seq[Any](/*134.31*/key)),format.raw/*134.34*/("""</p>

      	"""),format.raw/*136.66*/("""

        </div>
        </li>
""")))})),format.raw/*140.2*/("""
	</ul>

</div>

<div>
      """),format.raw/*148.33*/("""

</div>
      """),_display_(Seq[Any](/*151.8*/views/*151.13*/.html.footerunicarb.footerunicarb())),format.raw/*151.48*/("""    


  </section>
        
""")))})),format.raw/*156.2*/("""
"""))}
    }
    
    def render(map:Map[String, String],ct:String): play.api.templates.HtmlFormat.Appendable = apply(map,ct)
    
    def f:((Map[String, String],String) => play.api.templates.HtmlFormat.Appendable) = (map,ct) => apply(map,ct)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 02 10:52:56 EST 2014
                    SOURCE: /Users/matthew/git/glycomics_working/app/views/glycodigesttestBuilder.scala.html
                    HASH: 250e9e51daded3ba8eb9769b6a815d217d5fbc54
                    MATRIX: 811->1|958->38|985->56|1022->59|1033->63|1071->65|1136->103|1164->104|1264->177|1292->178|1334->192|1363->193|1601->404|1629->405|1662->411|1690->412|2194->889|2222->890|2261->901|2290->902|2408->993|2436->994|2473->1004|2502->1005|2592->1068|2620->1069|2684->1105|2713->1106|2756->1122|2784->1123|2863->1174|2892->1175|2957->1212|2986->1213|3070->1270|3098->1271|3147->1292|3176->1293|3214->1303|3243->1304|3397->1430|3426->1431|3642->1620|3670->1621|3724->1647|3753->1648|3826->1694|3854->1695|3890->1704|3919->1705|3950->1709|3978->1710|4007->1712|4035->1713|4124->1774|4153->1775|4219->1813|4248->1814|4393->1931|4422->1932|4460->1943|4489->1944|5178->2595|5195->2601|5233->2615|5281->2872|5873->3428|5914->3452|5954->3453|6241->3702|6270->3707|6342->3742|6368->3745|6410->3816|6474->3848|6532->4053|6584->4069|6599->4074|6657->4109|6719->4139
                    LINES: 26->1|30->1|31->3|33->5|33->5|33->5|36->8|36->8|41->13|41->13|43->15|43->15|53->25|53->25|54->26|54->26|71->43|71->43|73->45|73->45|78->50|78->50|80->52|80->52|84->56|84->56|88->60|88->60|90->62|90->62|95->67|95->67|96->68|96->68|99->71|99->71|101->73|101->73|102->74|102->74|106->78|106->78|108->80|108->80|109->81|109->81|111->83|111->83|112->84|112->84|113->85|113->85|114->86|114->86|118->90|118->90|120->92|120->92|122->94|122->94|123->95|123->95|138->110|138->110|138->110|141->116|155->130|155->130|155->130|158->133|158->133|159->134|159->134|161->136|165->140|171->148|174->151|174->151|174->151|179->156
                    -- GENERATED --
                */
            