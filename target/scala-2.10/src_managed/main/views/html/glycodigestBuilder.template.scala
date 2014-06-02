
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
object glycodigestBuilder extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(str: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.15*/("""
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
           <img src="http://www.glycodigest.org:8080/eurocarb/get_sugar_image.action?download=false&amp;scale=1.0&amp;opaque=false&amp;outputType=png&notation=cfglink&inputType=glycoct_condensed&sequences="""),_display_(Seq[Any](/*87.207*/helper/*87.213*/.urlEncode(str))),format.raw/*87.228*/("""" />
        </div>
	<p>Use the search box below to select the panel of exoglycosidase to digest the structure shown:</p>	
	 <form class="form-search" action="/glycodigestBuilder/test/digest" method="GET">  	
       <div id="selection" class="row-fluid">
       <input name=digest  id="e20" id="listBox" class="span4"></input>
       <button type="submit" class="btn btn-primary">Digest</button>
       </div>
    </form>
</div>


      """),_display_(Seq[Any](/*99.8*/views/*99.13*/.html.footerunicarb.footerunicarb())),format.raw/*99.48*/("""    


  </section>
        
""")))})),format.raw/*104.2*/("""
"""))}
    }
    
    def render(str:String): play.api.templates.HtmlFormat.Appendable = apply(str)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (str) => apply(str)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 02 10:52:56 EST 2014
                    SOURCE: /Users/matthew/git/glycomics_working/app/views/glycodigestBuilder.scala.html
                    HASH: 79896e3587ea8045cc161fd3515e6ee09cc38839
                    MATRIX: 787->1|910->14|937->32|974->35|985->39|1023->41|1088->79|1116->80|1216->153|1244->154|1286->168|1315->169|1553->380|1581->381|1614->387|1642->388|2146->865|2174->866|2213->877|2242->878|2360->969|2388->970|2425->980|2454->981|2544->1044|2572->1045|2636->1081|2665->1082|2708->1098|2736->1099|2822->1157|2851->1158|2917->1196|2946->1197|3091->1314|3120->1315|3158->1326|3187->1327|3862->1965|3878->1971|3916->1986|4389->2424|4403->2429|4460->2464|4522->2494
                    LINES: 26->1|30->1|31->3|33->5|33->5|33->5|36->8|36->8|41->13|41->13|43->15|43->15|53->25|53->25|54->26|54->26|71->43|71->43|73->45|73->45|78->50|78->50|80->52|80->52|84->56|84->56|88->60|88->60|90->62|90->62|95->67|95->67|97->69|97->69|99->71|99->71|100->72|100->72|115->87|115->87|115->87|127->99|127->99|127->99|132->104
                    -- GENERATED --
                */
            