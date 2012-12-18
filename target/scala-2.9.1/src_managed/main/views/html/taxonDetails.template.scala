
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
object taxonDetails extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,Taxonomy,List[Biolsource],List[SqlRow],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(message: String, taxon: Taxonomy, biolsource: List[Biolsource], groupTax: List[SqlRow] ):play.api.templates.Html = {
        _display_ {import helper._

def /*8.2*/header/*8.8*/(key:String, title:String):play.api.templates.Html = {_display_(

Seq(format.raw/*8.38*/("""
<th class="">
  <a href="">"""),_display_(Seq(/*10.15*/title)),format.raw/*10.20*/("""</a>
</th>
""")))};
Seq(format.raw/*1.91*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*6.37*/("""

"""),format.raw/*12.2*/("""

"""),_display_(Seq(/*14.2*/main/*14.6*/ {_display_(Seq(format.raw/*14.8*/("""

<div class="modal hide fade" id="taxDescription">
  <div class="modal-header">
    <a href="#" class="close" data-dismiss="modal">&times;</a>
    <h3>Taxonomy Structures</h3>
  </div>
  <div class="modal-body">
    """),format.raw/*22.76*/("""

    <ul class="thumbnails">
      """),_display_(Seq(/*25.8*/for(s <- taxon.strtaxonomy ) yield /*25.36*/{_display_(Seq(format.raw/*25.37*/("""

      <li class="span4">
        <a href=""""),_display_(Seq(/*28.19*/routes/*28.25*/.Application.structureDetails(s.structure.id))),format.raw/*28.70*/("""" class="thumbnail">
          <img src="../images/_"""),_display_(Seq(/*29.33*/{s.structure.id})),format.raw/*29.49*/(""".png" alt="">
        </a>
      </li>
      """)))})),format.raw/*32.8*/("""
    </ul>
  </div>
  <div class="modal-footer">
    <a href="#" class="btn primary" onclick="okClicked ();">OK</a>
  </div>

</div>	


<div class="row-fluid">
  <div class="span8">
    <section>
    <div class="page-header">
      <h1>"""),_display_(Seq(/*46.12*/message)),format.raw/*46.19*/(""" <span class="pull-right"><span class="label success">Curated Entry</span> <span class="label notice">GlycoSuiteDB</span></span></h1> 
      <h4 class="subheader">"""),_display_(Seq(/*47.30*/taxon/*47.35*/.species)),format.raw/*47.43*/("""</h4>
    </div>
    </section>

    """),format.raw/*51.28*/("""
    <p style='margin:0 0 9px;font-family: "Helvetica Neue", "Helvetica", Helvetica, Arial, sans-serif;'>The GlycoSuite database is an annotated and curated relational database of glycan structures. For the taxonomy entry <b>"""),_display_(Seq(/*52.226*/taxon/*52.231*/.species)),format.raw/*52.239*/("""</b> a number of glycan structures, glycoproteins and tissue source's have been curated.</p>
    <p  style="font-weight: bold;"><a href=""  data-toggle="modal" data-id='"""),_display_(Seq(/*53.78*/taxon)),format.raw/*53.83*/("""' class="announceTaxStructures"><i class="icon-resize-full"></i> See more structures</a> <small>limited to six records below</small></p>
    <ul class="thumbnails RP">
      """),_display_(Seq(/*55.8*/for((s, i) <- taxon.strtaxonomy.zipWithIndex; if (i <=5) ) yield /*55.66*/{_display_(Seq(format.raw/*55.67*/("""
      <li class="span5">
        <a href=""""),_display_(Seq(/*57.19*/routes/*57.25*/.Application.structureDetails(s.structure.id))),format.raw/*57.70*/("""" class="thumbnail">
          <img src="../images/_"""),_display_(Seq(/*58.33*/{s.structure.id})),format.raw/*58.49*/(""".png" alt="">
        </a>
      </li>
      """)))})),format.raw/*61.8*/("""
    </ul>
    <p  style="font-weight: bold;"><a href=""  data-toggle="modal" data-id='"""),_display_(Seq(/*63.78*/taxon)),format.raw/*63.83*/("""' class="announceTaxStructures"><i class="icon-resize-full"></i> See more structures</a></p>
  </div>

  <div class="span4 sidebar">
    <div class="info">
      <h3>Glycan Structures</h3>
      <p><i class="icon-chevron-right"></i> <b>"""),_display_(Seq(/*69.49*/taxon/*69.54*/.strtaxonomy.size())),format.raw/*69.73*/(""" </b> structures reported</p>
      <p  style="font-weight: bold;"><a href=""  data-toggle="modal" data-id='"""),_display_(Seq(/*70.80*/taxon)),format.raw/*70.85*/("""' class="announceTaxStructures"><i class="icon-th-large"></i> See more details</a></p>
    </div>

    <div class="info">
      <h3>Glycoproteins</h3>
      <p><i class="icon-chevron-right"></i><b>"""),_display_(Seq(/*75.48*/groupTax/*75.56*/.size())),format.raw/*75.63*/(""" </b> glycoproteins curated</p>
      """),_display_(Seq(/*76.8*/for( (sql,i) <- groupTax.zipWithIndex; if (i <= 6)) yield /*76.59*/ {_display_(Seq(format.raw/*76.61*/("""
      <p class="short">"""),_display_(Seq(/*77.25*/sql("protein"))),format.raw/*77.39*/("""</p>
      """)))})),format.raw/*78.8*/("""
      <p><i class="icon-th-large"></i> See more details</p>
    </div>

    <div class="info">
      <h3>External Resources</h3>
      <p><i class="icon-search"></i> Search UniCarb-DB</p>
      <p><i class="icon-search"></i> Search EUROCarbDB</p>
      """),format.raw/*88.12*/("""
    </div>
  </div>
</div>


     """),format.raw/*120.20*/("""


""")))})),format.raw/*123.2*/("""
"""))}
    }
    
    def render(message:String,taxon:Taxonomy,biolsource:List[Biolsource],groupTax:List[SqlRow]) = apply(message,taxon,biolsource,groupTax)
    
    def f:((String,Taxonomy,List[Biolsource],List[SqlRow]) => play.api.templates.Html) = (message,taxon,biolsource,groupTax) => apply(message,taxon,biolsource,groupTax)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Dec 18 10:59:13 EST 2012
                    SOURCE: /home/matthew/Documents/play-app/office/glycomics/app/views/taxonDetails.scala.html
                    HASH: c5daf43ebb01891f81ce04e94d035bdf76632b9f
                    MATRIX: 801->1|966->220|979->226|1067->256|1127->285|1154->290|1200->90|1227->108|1255->217|1284->302|1317->305|1329->309|1363->311|1608->599|1675->636|1719->664|1753->665|1829->710|1844->716|1911->761|1995->814|2033->830|2110->876|2378->1113|2407->1120|2602->1284|2616->1289|2646->1297|2711->1357|2969->1583|2984->1588|3015->1596|3216->1766|3243->1771|3448->1946|3522->2004|3556->2005|3631->2049|3646->2055|3713->2100|3797->2153|3835->2169|3912->2215|4031->2303|4058->2308|4326->2545|4340->2550|4381->2569|4521->2678|4548->2683|4777->2881|4794->2889|4823->2896|4892->2935|4959->2986|4994->2988|5050->3013|5086->3027|5129->3039|5411->3475|5475->4522|5511->4526
                    LINES: 27->1|30->8|30->8|32->8|34->10|34->10|37->1|38->3|39->6|41->12|43->14|43->14|43->14|51->22|54->25|54->25|54->25|57->28|57->28|57->28|58->29|58->29|61->32|75->46|75->46|76->47|76->47|76->47|80->51|81->52|81->52|81->52|82->53|82->53|84->55|84->55|84->55|86->57|86->57|86->57|87->58|87->58|90->61|92->63|92->63|98->69|98->69|98->69|99->70|99->70|104->75|104->75|104->75|105->76|105->76|105->76|106->77|106->77|107->78|115->88|121->120|124->123
                    -- GENERATED --
                */
            