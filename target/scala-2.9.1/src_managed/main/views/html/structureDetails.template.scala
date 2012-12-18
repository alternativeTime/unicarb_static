
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
object structureDetails extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template8[List[Structure],Long,ArrayList[String],ArrayList[String],ArrayList[String],List[Array[String]],ArrayList[String],ArrayList[String],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(references: List[Structure], structureId: Long, proteinNames: ArrayList[String], taxNames: ArrayList[String], sourceNames: ArrayList[String], test: List[Array[String]], uniprot: ArrayList[String], taxDiv: ArrayList[String]):play.api.templates.Html = {
        _display_ {import helper._

def /*7.2*/header/*7.8*/(key:String, title:String):play.api.templates.Html = {_display_(

Seq(format.raw/*7.38*/("""
    <th class="">
        <a href="">"""),_display_(Seq(/*9.21*/title)),format.raw/*9.26*/("""</a>
    </th>
""")))};
Seq(format.raw/*1.226*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*6.37*/("""
"""),format.raw/*11.2*/("""

"""),_display_(Seq(/*13.2*/main/*13.6*/ {_display_(Seq(format.raw/*13.8*/("""

<ul class="breadcrumb">
  <li><i class="icon-home" ></i><a href="/"> UniCarbKB</a> <span class="divider">></span></li>
  <li class="active"><i class="icon-th" ></i> Structure<span class="divider"></span></li>
  <!--<li class="active" > You are here</li>-->
</ul>

<div class="modal hide fade" id="windowDescription">
  <div class="modal-header">
    <a href="#" class="close" data-dismiss="modal">&times;</a>
    <h3>Protein and Taxonomy Information <span class="label success">Curated Entry</span> <span class="label notice">GlycoSuiteDB</span></h3>
  </div>
  <div class="modal-body">
    <h2 class="fullname">This structure has been associated with various records:</h2>

    <div id="myDiv"><p></p></div>
  </div>
  <div class="modal-footer">
    <a href="#" class="btn primary" onclick="okClicked ();">OK</a>
  </div>
</div>
      </div>


      <section id="structureLayout">
      <div class="page-header">
        <h1>Structure</h1>
        <h4 class="subheader">Details for structure</h4>
    </div>

    <div class="row-fluid">
      <div class="span12">
        <img class="sugar_image"  src="../images/_"""),_display_(Seq(/*46.52*/{structureId})),format.raw/*46.65*/(""".png"> 
      </div>
    </div>
    </section>	

    <section id="layouts">	
    <div class="row-fluid">
      <div class="span12">

        <div class="row-fluid">
          <h4 class="pull-left">Available Descriptions :&nbsp;</h4>
          <ul class="nav nav-pills pull-left">
            <li><a href="" style="color: #1F7099;" data-toggle="modal" data-id='"""),_display_(Seq(/*58.82*/taxDiv)),format.raw/*58.88*/("""' class="announce2" data-id2='100'><i class="icon-search"></i> Taxonomy</a></li>
            <li><a style="color: #1F7099;" data-toggle="modal" data-id=""""),_display_(Seq(/*59.74*/proteinNames)),format.raw/*59.86*/("""" class="announce"><i class="icon-th-list"></i> Protein</a></li>
            <li><a style="color: #1F7099;" data-toggle="modal" data-id=""""),_display_(Seq(/*60.74*/sourceNames)),format.raw/*60.85*/("""" class="announce" ><i class="icon-th-list"></i> Source</a></li>
          </ul>
        </div>

        <h2>References associated to structure</h2>


          <table class="computers zebra-striped">
            <thead>
              <tr>
                """),_display_(Seq(/*70.18*/header("title", "Title"))),format.raw/*70.42*/("""
                """),_display_(Seq(/*71.18*/header("year", "Year"))),format.raw/*71.40*/("""
                """),_display_(Seq(/*72.18*/header("authors", "Authors"))),format.raw/*72.46*/("""
              </tr>
            </thead>
            <tbody>


              """),_display_(Seq(/*78.16*/for(stref <- references) yield /*78.40*/{_display_(Seq(format.raw/*78.41*/("""


              """),_display_(Seq(/*81.16*/for(reference <- stref.references) yield /*81.50*/{_display_(Seq(format.raw/*81.51*/("""
              """),format.raw/*82.86*/("""
              <tr><td><a href="../references/"""),_display_(Seq(/*83.47*/reference/*83.56*/.reference.id)),format.raw/*83.69*/("""">"""),_display_(Seq(/*83.72*/reference/*83.81*/.reference.title)),format.raw/*83.97*/("""</a></td><td>"""),_display_(Seq(/*83.111*/reference/*83.120*/.reference.year)),format.raw/*83.135*/("""</td><td>"""),_display_(Seq(/*83.145*/reference/*83.154*/.reference.authors)),format.raw/*83.172*/("""</td></tr>
              """)))})),format.raw/*84.16*/("""
              """)))})),format.raw/*85.16*/("""
            </tbody>
          </table>



        </div>

      </div>

    </div>

    </section>

    <div class="footer row-fluid">
      <div class="span12">
        <p class="pull-left">UniCarbKB</p>
        <p class="pull-right">Supported by 
          <a href="http://www.nectar.org.au">NeCTAR</a> &nbsp;|&nbsp; 
          <a href="http://www.ands.org.au">ANDS</a> &nbsp;|&nbsp;
          <a href="http://www.stint.se"> STINT</a>
        </p>
      </div>
    </div>

    """)))})),format.raw/*110.6*/("""
"""))}
    }
    
    def render(references:List[Structure],structureId:Long,proteinNames:ArrayList[String],taxNames:ArrayList[String],sourceNames:ArrayList[String],test:List[Array[String]],uniprot:ArrayList[String],taxDiv:ArrayList[String]) = apply(references,structureId,proteinNames,taxNames,sourceNames,test,uniprot,taxDiv)
    
    def f:((List[Structure],Long,ArrayList[String],ArrayList[String],ArrayList[String],List[Array[String]],ArrayList[String],ArrayList[String]) => play.api.templates.Html) = (references,structureId,proteinNames,taxNames,sourceNames,test,uniprot,taxDiv) => apply(references,structureId,proteinNames,taxNames,sourceNames,test,uniprot,taxDiv)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Dec 18 08:54:51 EST 2012
                    SOURCE: /home/matthew/Documents/play-app/office/glycomics/app/views/structureDetails.scala.html
                    HASH: 707a7b869827662c4cdff99e3e487f5294e40301
                    MATRIX: 890->1|1190->354|1203->360|1291->390|1360->429|1386->434|1437->225|1464->243|1492->352|1520->450|1553->453|1565->457|1599->459|2748->1577|2783->1590|3175->1951|3203->1957|3388->2111|3422->2123|3591->2261|3624->2272|3912->2529|3958->2553|4007->2571|4051->2593|4100->2611|4150->2639|4260->2718|4300->2742|4334->2743|4383->2761|4433->2795|4467->2796|4510->2882|4588->2929|4606->2938|4641->2951|4675->2954|4693->2963|4731->2979|4777->2993|4796->3002|4834->3017|4876->3027|4895->3036|4936->3054|4994->3080|5042->3096|5556->3578
                    LINES: 27->1|30->7|30->7|32->7|34->9|34->9|37->1|38->3|39->6|40->11|42->13|42->13|42->13|75->46|75->46|87->58|87->58|88->59|88->59|89->60|89->60|99->70|99->70|100->71|100->71|101->72|101->72|107->78|107->78|107->78|110->81|110->81|110->81|111->82|112->83|112->83|112->83|112->83|112->83|112->83|112->83|112->83|112->83|112->83|112->83|112->83|113->84|114->85|139->110
                    -- GENERATED --
                */
            