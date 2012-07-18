
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
object structureDetails extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template7[List[Structure],Long,ArrayList[String],ArrayList[String],ArrayList[String],List[Array[String]],ArrayList[String],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(references: List[Structure], structureId: Long, proteinNames: ArrayList[String], taxNames: ArrayList[String], sourceNames: ArrayList[String], test: List[Array[String]], uniprot: ArrayList[String]):play.api.templates.Html = {
        _display_ {import helper._

def /*7.2*/header/*7.8*/(key:String, title:String):play.api.templates.Html = {_display_(

Seq(format.raw/*7.38*/("""
    <th class="">
        <a href="">"""),_display_(Seq(/*9.21*/title)),format.raw/*9.26*/("""</a>
    </th>
""")))};
Seq(format.raw/*1.199*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*6.37*/("""
"""),format.raw/*11.2*/("""

"""),_display_(Seq(/*13.2*/main/*13.6*/ {_display_(Seq(format.raw/*13.8*/("""

	<div class="modal hide fade" id="windowDescription">
				<div class="modal-header">
					<a href="#" class="close" data-dismiss="modal">&times;</a>
					<h3>Protein and Taxonomy Information <span class="label success">Curated Entry</span> <span class="label notice">GlycoSuiteDB</span></h3>
				</div>
				<div class="modal-body">
					<h2 class="fullname">This structure has been associated with various records:</h2>
					
					<div id="myDiv"><p>testthis</p></div>
"""),format.raw/*33.4*/("""
					</div>
				<div class="modal-footer">
					<a href="#" class="btn primary" onclick="okClicked ();">OK</a>
					</div>
				</div>
			</div>

 
    <div class="container">
	<section id="structureLayout">
  	<div class="page-header">
    	<h1>Structure <small>Details for structure</small></h1>
  	</div>

	<div class="row">
	 <div class="span16">
		 <div style="float:left; width:100% ">
		<img class="sugar_image"  src="http://glycosuitedb.expasy.org/glycosuite-structures//_"""),_display_(Seq(/*51.90*/{structureId})),format.raw/*51.103*/(""".png"> 
			<div style="float:right; margin-right:20px"><h4 class="stats">Information</h4>
                                <ul class="stats">
                                        <li>Proteins</li>
                                        <li>Taxonomy</li>
                                        <li>Source</li>
                                </ul>
                        </div>

		</div>
	 </div>
	</div>
	</section>	
	
	<section id="layouts">	
	 <div class="row">
	    <br />   """),format.raw/*67.36*/("""
	    <div class="span16">

		<div class="row-fluid"><h4 class="pull-left">Available Descriptions :&nbsp;</h4><ul class="nav nav-pills pull-left"><li><a href="" style="color: #1F7099;" data-toggle="modal" data-id='"""),_display_(Seq(/*70.188*/taxNames)),format.raw/*70.196*/("""' class="announce"><i class="icon-search"></i> Taxonomy</a></li><li><a style="color: #1F7099;" data-toggle="modal" data-id=""""),_display_(Seq(/*70.321*/proteinNames)),format.raw/*70.333*/("""" class="announce"><i class="icon-th-list"></i> Protein</a></li><li><a style="color: #1F7099;" data-toggle="modal" data-id=""""),_display_(Seq(/*70.458*/sourceNames)),format.raw/*70.469*/("""" class="announce" ><i class="icon-th-list"></i> Source</a></li></div>



		<h4>References associated to structure</h4>


	    	<table class="computers zebra-striped">
	            <thead>
        	        <tr>
                	"""),_display_(Seq(/*80.19*/header("title", "Title"))),format.raw/*80.43*/("""
			"""),_display_(Seq(/*81.5*/header("year", "Year"))),format.raw/*81.27*/("""
                    	"""),_display_(Seq(/*82.23*/header("authors", "Authors"))),format.raw/*82.51*/("""
                	</tr>
            	    </thead>
            	<tbody>


    		"""),_display_(Seq(/*88.8*/for(stref <- references) yield /*88.32*/{_display_(Seq(format.raw/*88.33*/("""


        		"""),_display_(Seq(/*91.12*/for(reference <- stref.references) yield /*91.46*/{_display_(Seq(format.raw/*91.47*/("""
                	"""),format.raw/*92.89*/("""
                	<tr><td><a href="../references/"""),_display_(Seq(/*93.50*/reference/*93.59*/.reference.id)),format.raw/*93.72*/("""">"""),_display_(Seq(/*93.75*/reference/*93.84*/.reference.title)),format.raw/*93.100*/("""</a></td><td>"""),_display_(Seq(/*93.114*/reference/*93.123*/.reference.year)),format.raw/*93.138*/("""</td><td>"""),_display_(Seq(/*93.148*/reference/*93.157*/.reference.authors)),format.raw/*93.175*/("""</td></tr>
        		""")))})),format.raw/*94.12*/("""
    		""")))})),format.raw/*95.8*/("""
		</tbody>
    		</table>



	     </div>

	</div>

    </div>


      
""")))})),format.raw/*109.2*/("""
"""))}
    }
    
    def render(references:List[Structure],structureId:Long,proteinNames:ArrayList[String],taxNames:ArrayList[String],sourceNames:ArrayList[String],test:List[Array[String]],uniprot:ArrayList[String]) = apply(references,structureId,proteinNames,taxNames,sourceNames,test,uniprot)
    
    def f:((List[Structure],Long,ArrayList[String],ArrayList[String],ArrayList[String],List[Array[String]],ArrayList[String]) => play.api.templates.Html) = (references,structureId,proteinNames,taxNames,sourceNames,test,uniprot) => apply(references,structureId,proteinNames,taxNames,sourceNames,test,uniprot)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jul 12 13:36:39 EST 2012
                    SOURCE: /home/matthew/Documents/play-app/tmp/computer-database/app/views/structureDetails.scala.html
                    HASH: 12faf444f4829c89b0b9c24c4b615b605098ece1
                    MATRIX: 872->1|1145->327|1158->333|1246->363|1315->402|1341->407|1392->198|1419->216|1447->325|1475->423|1508->426|1520->430|1554->432|2052->1395|2564->1876|2600->1889|3111->2393|3358->2608|3389->2616|3546->2741|3581->2753|3738->2878|3772->2889|4032->3118|4078->3142|4113->3147|4157->3169|4211->3192|4261->3220|4371->3300|4411->3324|4445->3325|4490->3339|4540->3373|4574->3374|4620->3463|4701->3513|4719->3522|4754->3535|4788->3538|4806->3547|4845->3563|4891->3577|4910->3586|4948->3601|4990->3611|5009->3620|5050->3638|5104->3660|5143->3668|5249->3742
                    LINES: 27->1|30->7|30->7|32->7|34->9|34->9|37->1|38->3|39->6|40->11|42->13|42->13|42->13|53->33|71->51|71->51|87->67|90->70|90->70|90->70|90->70|90->70|90->70|100->80|100->80|101->81|101->81|102->82|102->82|108->88|108->88|108->88|111->91|111->91|111->91|112->92|113->93|113->93|113->93|113->93|113->93|113->93|113->93|113->93|113->93|113->93|113->93|113->93|114->94|115->95|129->109
                    -- GENERATED --
                */
            