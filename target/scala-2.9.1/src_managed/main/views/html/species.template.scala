
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

	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js" type="text/javascript"></script>
			<script src="http://code.jquery.com/ui/1.8.21/jquery-ui.min.js" type="text/javascript"></script>
			<script src="http://jquery-ui.googlecode.com/svn/tags/latest/external/jquery.bgiframe-2.1.2.js" type="text/javascript"></script>
			<script src="http://jquery-ui.googlecode.com/svn/tags/latest/ui/minified/i18n/jquery-ui-i18n.min.js" type="text/javascript"></script>
<script>
var species = new String("""),_display_(Seq(/*10.27*/jsSpecies)),format.raw/*10.36*/(""");
var msg = species.replace("replacethis", "lalal");
alert('after\n' + msg);
document.write(msg);
</script>
<script>
	$(function() """),format.raw("""{"""),format.raw/*16.16*/("""
		var availableTags = [
"ActionScript",
			"AppleScript",
			"Asp",
			"BASIC",
			"C",
			"C++",
			"Clojure",
			"COBOL",
			"ColdFusion",
			"Erlang",
			"Fortran",
			"Groovy",
			"Haskell",
			"Java",
			"JavaScript",
			"Lisp",
			"Perl",
			"PHP",
			"Python",
			"Ruby",
			"Scala",
			"Scheme",
			"ActionScript",
                        "AppleScript",
                        "Asp",
                        "BASIC2",
                        "C",
                        "C++2",
                        "Clojure2",
                        "COBOL2",
                        "ColdFusion2",
                        "Erlang2",
                        "Fortran2",
                        "Groovy2",
                        "Haskell2",
                        "Java2",
                        "JavaScript2",
                        "Lisp2",
                        "Perl2",
                        "PHP2",
                        "Python2",
                        "Ruby2",
                        "Scala2",
]
		;
		$( "#tags" ).autocomplete("""),format.raw("""{"""),format.raw/*63.30*/("""
			source: availableTags
		"""),format.raw("""}"""),format.raw/*65.4*/(""");
	"""),format.raw("""}"""),format.raw/*66.3*/(""");
	</script>


	
<div class="demo">

<div class="ui-widget">
	<label for="tags">Tags: </label>
	<input id="tags">
</div>
    
 	<h1>hellow</h1> 
""")))})),format.raw/*79.2*/("""
"""))}
    }
    
    def render(message:String,speciesDetails:List[String],jsSpecies:String) = apply(message,speciesDetails,jsSpecies)
    
    def f:((String,List[String],String) => play.api.templates.Html) = (message,speciesDetails,jsSpecies) => apply(message,speciesDetails,jsSpecies)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jul 12 13:36:39 EST 2012
                    SOURCE: /home/matthew/Documents/play-app/tmp/computer-database/app/views/species.scala.html
                    HASH: e4dbdab87a99a47b1e3df0ce90eaa4defc69803d
                    MATRIX: 777->1|915->67|947->70|958->74|991->76|1540->594|1571->603|1751->736|2845->1783|2920->1812|2971->1817|3149->1964
                    LINES: 27->1|30->1|32->3|32->3|32->3|39->10|39->10|45->16|92->63|94->65|95->66|108->79
                    -- GENERATED --
                */
            