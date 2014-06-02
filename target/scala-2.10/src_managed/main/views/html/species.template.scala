
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
object species extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,List[String],String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String, speciesDetails: List[String], jsSpecies: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.68*/("""

"""),_display_(Seq[Any](/*3.2*/main/*3.6*/ {_display_(Seq[Any](format.raw/*3.8*/("""
	<script src="http://code.jquery.com/ui/1.8.21/jquery-ui.min.js" type="text/javascript"></script>

<script>
	$(function() """),format.raw/*7.15*/("""{"""),format.raw/*7.16*/("""
	

	var myArray = new Array();
	"""),_display_(Seq[Any](/*11.3*/for(a <- speciesDetails) yield /*11.27*/ {_display_(Seq[Any](format.raw/*11.29*/("""
	myArray.push(""""),_display_(Seq[Any](/*12.17*/a)),format.raw/*12.18*/("""");
	""")))})),format.raw/*13.3*/("""
	
		$( "#tags" ).autocomplete("""),format.raw/*15.29*/("""{"""),format.raw/*15.30*/("""
			source: myArray, 
			minLength: 3,
			select: function (event, ui) """),format.raw/*18.33*/("""{"""),format.raw/*18.34*/("""
			var selectobj = ui.item;
			$("#hidCidade").val(ui.item.label);
			
			"""),format.raw/*22.4*/("""}"""),format.raw/*22.5*/("""
			
		"""),format.raw/*24.3*/("""}"""),format.raw/*24.4*/(""");
	"""),format.raw/*25.2*/("""}"""),format.raw/*25.3*/(""");
	</script>


	<h1 id="homeTitle">"""),_display_(Seq[Any](/*29.22*/Messages("EXample Taxonomy Search with typeahead"))),format.raw/*29.72*/("""</h1>

	<form action="taxonomysearch" method="GET">
	<label for="">Taxonomy: </label>
	<input id="tags" class="ui-widget" name="taxonomy">
	<input id="hidCidade" type="hidden" />
	<input type="submit" value="go" />
	</form>
    
""")))})),format.raw/*38.2*/("""
"""))}
    }
    
    def render(message:String,speciesDetails:List[String],jsSpecies:String): play.api.templates.HtmlFormat.Appendable = apply(message,speciesDetails,jsSpecies)
    
    def f:((String,List[String],String) => play.api.templates.HtmlFormat.Appendable) = (message,speciesDetails,jsSpecies) => apply(message,speciesDetails,jsSpecies)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 02 10:52:57 EST 2014
                    SOURCE: /Users/matthew/git/glycomics_working/app/views/species.scala.html
                    HASH: b48de38897f3ba5d5894f5a0b7ad90a02c1a2e12
                    MATRIX: 796->1|956->67|993->70|1004->74|1042->76|1192->199|1220->200|1289->234|1329->258|1369->260|1422->277|1445->278|1482->284|1541->315|1570->316|1669->387|1698->388|1800->463|1828->464|1862->471|1890->472|1921->476|1949->477|2022->514|2094->564|2355->794
                    LINES: 26->1|29->1|31->3|31->3|31->3|35->7|35->7|39->11|39->11|39->11|40->12|40->12|41->13|43->15|43->15|46->18|46->18|50->22|50->22|52->24|52->24|53->25|53->25|57->29|57->29|66->38
                    -- GENERATED --
                */
            