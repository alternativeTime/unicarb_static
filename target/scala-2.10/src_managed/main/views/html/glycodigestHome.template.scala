
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
object glycodigestHome extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*2.1*/("""
"""),_display_(Seq[Any](/*3.2*/main/*3.6*/ {_display_(Seq[Any](format.raw/*3.8*/("""

<style>
.break-block """),format.raw/*6.14*/("""{"""),format.raw/*6.15*/("""
    margin: 50px 0;
    padding: 30px;
    background-color: #f2f6f7;
    font: 16px/24px 'Open Sans', 'Lucida Sans Unicode', 'Lucida Grande', sans-serif;
    font-weight: 300
"""),format.raw/*12.1*/("""}"""),format.raw/*12.2*/("""

.break-block .text-only """),format.raw/*14.25*/("""{"""),format.raw/*14.26*/("""
    position: relative;
    top: 15px
"""),format.raw/*17.1*/("""}"""),format.raw/*17.2*/("""

.break-block .reviewer """),format.raw/*19.24*/("""{"""),format.raw/*19.25*/("""
    font-size: 30px;
    font-weight: 600;
    margin-bottom: 0
"""),format.raw/*23.1*/("""}"""),format.raw/*23.2*/("""

.break-block .right """),format.raw/*25.21*/("""{"""),format.raw/*25.22*/("""
    width: 600px;
    background: url(../img/quote.png) no-repeat 0 0;
    padding-left: 40px
"""),format.raw/*29.1*/("""}"""),format.raw/*29.2*/("""
</style>

<div class="container-fluid content">
	<div class="row-fluid">
		<div class="span12">
			<h1 style="text-align: center">GlycoDigest: a tool for exoglycosidase digestions</h1>
			<p style="text-align: center"><img src="http://www.glycodigest.org/enzymes.png" /></p>

			<h4 style="text-align: center">GlycoDigest a tool that simulates exoglycosidase digestion, based on controlled rules acquired from expert knowledge and experimental evidence available in GlycoBase. The tool allows the targeted design of glycosidase enzyme mixtures by allowing researchers to model the action of exoglycosidases, thereby validating and improving the efficiency and accuracy of glycan analysis.</h4>
"""),format.raw/*43.3*/("""
<hr/>
<p style="text-align: center">
<a href="http://www.glycodigest.org"><button type="button" class="btn-success btn-large">Have a Look at Glycodigest.org</button></a>
<a href="/builderDigest"><button type="button" class="btn-success btn-large">Get Started: Build a Structure</button></a>
</p>
<div class="break-block"><div class="container">
		For help and instructions have a look at our <a href="https://github.com/alternativeTime/glycomics/wiki/GlycoDigest-Guide-(UniCarbKB)">wiki site</a>. Alternatively, select options from the 'GlycoDigest' drop-down list on the navigation bar including links to experimental protocols, information on supported exoglycosidases, or example data....
</div></div>
		</div>
	</div>


</div>

""")))})),format.raw/*58.2*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 02 10:52:56 EST 2014
                    SOURCE: /Users/matthew/git/glycomics_working/app/views/glycodigestHome.scala.html
                    HASH: b6dca654768493da5fcc8faa115bfd98021d07a0
                    MATRIX: 881->17|917->19|928->23|966->25|1016->48|1044->49|1248->226|1276->227|1330->253|1359->254|1425->293|1453->294|1506->319|1535->320|1627->385|1655->386|1705->408|1734->409|1856->504|1884->505|2606->1469|3371->2203
                    LINES: 30->2|31->3|31->3|31->3|34->6|34->6|40->12|40->12|42->14|42->14|45->17|45->17|47->19|47->19|51->23|51->23|53->25|53->25|57->29|57->29|67->43|82->58
                    -- GENERATED --
                */
            