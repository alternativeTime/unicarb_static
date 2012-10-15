
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
object species extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,List[String],String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(message: String, speciesDetails: List[String], jsSpecies: String):play.api.templates.Html = {
        _display_ {

Seq(format.raw/*1.68*/("""

"""),_display_(Seq(/*3.2*/main/*3.6*/ {_display_(Seq(format.raw/*3.8*/("""
	<script src="http://code.jquery.com/ui/1.8.21/jquery-ui.min.js" type="text/javascript"></script>

<script>
	$(function() """),format.raw("""{"""),format.raw/*7.16*/("""
	

	var myArray = new Array();
	"""),_display_(Seq(/*11.3*/for(a <- speciesDetails) yield /*11.27*/ {_display_(Seq(format.raw/*11.29*/("""
	myArray.push(""""),_display_(Seq(/*12.17*/a)),format.raw/*12.18*/("""");
	""")))})),format.raw/*13.3*/("""
	
		$( "#tags" ).autocomplete("""),format.raw("""{"""),format.raw/*15.30*/("""
			source: myArray, 
			minLength: 3,
			select: function (event, ui) """),format.raw("""{"""),format.raw/*18.34*/("""
			var selectobj = ui.item;
			$("#hidCidade").val(ui.item.label);
			
			"""),format.raw("""}"""),format.raw/*22.5*/("""
			
		"""),format.raw("""}"""),format.raw/*24.4*/(""");
	"""),format.raw("""}"""),format.raw/*25.3*/(""");
	</script>


	<h1 id="homeTitle">"""),_display_(Seq(/*29.22*/Messages("EXample Taxonomy Search with typeahead"))),format.raw/*29.72*/("""</h1>

	<form action="taxonomysearch" method="GET">
	<label for="">Taxonomy: </label>
	<input id="tags" class="ui-widget" name="taxonomy">
	<input id="hidCidade" type="hidden" />
	<input type="submit" value="go" />
	</form>
    
""")))})),format.raw/*38.2*/("""
"""))}
    }
    
    def render(message:String,speciesDetails:List[String],jsSpecies:String) = apply(message,speciesDetails,jsSpecies)
    
    def f:((String,List[String],String) => play.api.templates.Html) = (message,speciesDetails,jsSpecies) => apply(message,speciesDetails,jsSpecies)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Oct 12 14:39:33 EST 2012
                    SOURCE: /home/matthew/Documents/play-app/tmp/glycomics/app/views/species.scala.html
                    HASH: 6340066822bc4303ff96842b98bb4284da80a226
                    MATRIX: 777->1|915->67|947->70|958->74|991->76|1161->200|1225->234|1265->258|1300->260|1348->277|1371->278|1408->284|1487->316|1606->388|1728->464|1782->472|1833->477|1901->514|1973->564|2234->794
                    LINES: 27->1|30->1|32->3|32->3|32->3|36->7|40->11|40->11|40->11|41->12|41->12|42->13|44->15|47->18|51->22|53->24|54->25|58->29|58->29|67->38
                    -- GENERATED --
                */
            