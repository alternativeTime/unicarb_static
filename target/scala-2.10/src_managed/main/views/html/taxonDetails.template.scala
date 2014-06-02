
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
object taxonDetails extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[String,String,Taxonomy,List[Biolsource],List[com.avaje.ebean.SqlRow],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(notation: String, message: String, taxon: Taxonomy, biolsource: List[Biolsource], groupTax: List[com.avaje.ebean.SqlRow] ):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*8.2*/header/*8.8*/(key:String, title:String):play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*8.38*/("""
<th class="">
  <a href="">"""),_display_(Seq[Any](/*10.15*/title)),format.raw/*10.20*/("""</a>
</th>
""")))};
Seq[Any](format.raw/*1.125*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*6.37*/("""

"""),format.raw/*12.2*/("""

"""),_display_(Seq[Any](/*14.2*/main/*14.6*/ {_display_(Seq[Any](format.raw/*14.8*/("""

<div class="modal hide fade" id="taxDescription">
  <div class="modal-header">
    <a href="#" class="close" data-dismiss="modal">&times;</a>
    <h3>Taxonomy Structures</h3>
  </div>
  <div class="modal-body">
    <ul class="thumbnails">
      """),_display_(Seq[Any](/*23.8*/for(s <- taxon.strtaxonomy ) yield /*23.36*/{_display_(Seq[Any](format.raw/*23.37*/("""

      <li class="span4">
	"""),_display_(Seq[Any](/*26.3*/views/*26.8*/.html.format.structure(notation, s.structure.id))),format.raw/*26.56*/("""
      </li>
      """)))})),format.raw/*28.8*/("""
    </ul>
  </div>
  <div class="modal-footer">
    help<a href="#" class="btn primary" onclick="okClicked ();">OK</a>
  </div>

</div>	

<ul class="breadcrumb">
  <li><i class="icon-home" ></i><a href="/"> UniCarbKB</a> <span class="divider">></span></li>
  <li><i class="icon-tags" ></i><a href="/references"> Taxonomy</a> <span class="divider">></span></li>
  <li><i class="icon-tag" ></i> """),_display_(Seq[Any](/*40.34*/taxon/*40.39*/.species)),format.raw/*40.47*/("""</li>
</ul>

<section id="layouts">

<div class="page-header row-fluid">
  <h1>"""),_display_(Seq[Any](/*46.8*/taxon/*46.13*/.species)),format.raw/*46.21*/("""</h1> 
  <h4 class="subheader span8">"""),_display_(Seq[Any](/*47.32*/message)),format.raw/*47.39*/(""" <span class="pull-right"><span class="label label-light">Curated Entry</span> <span class="label label-light">GlycoSuiteDB</span></span></h4>
</div>

<div class="row-fluid">
  <div class="span8">

    <p>The GlycoSuite database is an annotated and curated relational database of glycan structures. For the taxonomy entry <b>"""),_display_(Seq[Any](/*53.129*/taxon/*53.134*/.species)),format.raw/*53.142*/("""</b> a number of glycan structures, glycoproteins and tissue source's have been curated.</p>


    <ul class="structures clearfix">
      """),_display_(Seq[Any](/*57.8*/for((s, i) <- taxon.strtaxonomy.zipWithIndex; if (i <=5) ) yield /*57.66*/{_display_(Seq[Any](format.raw/*57.67*/("""
        <li class="span5">
          """),_display_(Seq[Any](/*59.12*/views/*59.17*/.html.format.structure(notation, s.structure.id))),format.raw/*59.65*/("""  
        </li>
      """)))})),format.raw/*61.8*/("""
    </ul>
    <ul id='more-thumbnails' class='structures clearfix'>
      """),_display_(Seq[Any](/*64.8*/for((s, i) <- taxon.strtaxonomy.zipWithIndex; if (i >=6) ) yield /*64.66*/{_display_(Seq[Any](format.raw/*64.67*/("""
        <li class="span5">
 	  """),_display_(Seq[Any](/*66.6*/views/*66.11*/.html.format.structure(notation, s.structure.id))),format.raw/*66.59*/("""
        </li>
      """)))})),format.raw/*68.8*/("""
    </ul>
    """),_display_(Seq[Any](/*70.6*/if(taxon.strtaxonomy.size() >=5)/*70.38*/ {_display_(Seq[Any](format.raw/*70.40*/("""
    <div id='show-structures' class='more-structures' href='#'>
      <span class="linktext">See more structures</span>
      <span class="linktext" style="display:none">See less structures</span>
      <br />
      <span>&#9679; &#9679; &#9679;</span>
    </div>
    """)))})),format.raw/*77.6*/("""
  </div>

  <div class="span4 sidebar">

    """),_display_(Seq[Any](/*82.6*/views/*82.11*/.html.format.format())),format.raw/*82.32*/("""

    <div class="info">
      <h3>Glycan Structures</h3>
      <p>
        <span id='more-structures' class='label label-notice'>
          <i class="icon-th icon-white"></i> Structures <b>("""),_display_(Seq[Any](/*88.62*/taxon/*88.67*/.strtaxonomy.size())),format.raw/*88.86*/(""")</b> 
          <span class='caret'></span>
        </span>
      </p>

    </div>

    <div class="info">
      <h3>Glycoproteins</h3>
      <p><i class="icon-chevron-right"></i><b>"""),_display_(Seq[Any](/*97.48*/groupTax/*97.56*/.size())),format.raw/*97.63*/(""" </b> glycoproteins curated</p>
      """),_display_(Seq[Any](/*98.8*/for( (sql,i) <- groupTax.zipWithIndex; if (i <= 6)) yield /*98.59*/ {_display_(Seq[Any](format.raw/*98.61*/("""
      """)))})),format.raw/*99.8*/("""

      <div class='more'>
      </div>

    </div>

  </div>
</div>

"""),_display_(Seq[Any](/*109.2*/views/*109.7*/.html.footerunicarb.footerunicarb())),format.raw/*109.42*/("""

</section>


     """),format.raw/*140.20*/("""


""")))})),format.raw/*143.2*/("""
"""))}
    }
    
    def render(notation:String,message:String,taxon:Taxonomy,biolsource:List[Biolsource],groupTax:List[com.avaje.ebean.SqlRow]): play.api.templates.HtmlFormat.Appendable = apply(notation,message,taxon,biolsource,groupTax)
    
    def f:((String,String,Taxonomy,List[Biolsource],List[com.avaje.ebean.SqlRow]) => play.api.templates.HtmlFormat.Appendable) = (notation,message,taxon,biolsource,groupTax) => apply(notation,message,taxon,biolsource,groupTax)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 02 10:52:57 EST 2014
                    SOURCE: /Users/matthew/git/glycomics_working/app/views/taxonDetails.scala.html
                    HASH: 2fb80fbe6e2ce93ae5e024f46ac51a0d5fd64b0f
                    MATRIX: 843->1|1059->254|1072->260|1182->290|1247->319|1274->324|1326->124|1353->142|1381->251|1410->336|1448->339|1460->343|1499->345|1782->593|1826->621|1865->622|1929->651|1942->656|2012->704|2063->724|2494->1119|2508->1124|2538->1132|2653->1212|2667->1217|2697->1225|2771->1263|2800->1270|3163->1596|3178->1601|3209->1609|3383->1748|3457->1806|3496->1807|3571->1846|3585->1851|3655->1899|3710->1923|3821->1999|3895->2057|3934->2058|4002->2091|4016->2096|4086->2144|4139->2166|4190->2182|4231->2214|4271->2216|4572->2486|4654->2533|4668->2538|4711->2559|4939->2751|4953->2756|4994->2775|5214->2959|5231->2967|5260->2974|5334->3013|5401->3064|5441->3066|5480->3074|5587->3145|5601->3150|5659->3185|5708->4217|5744->4221
                    LINES: 26->1|29->8|29->8|31->8|33->10|33->10|36->1|37->3|38->6|40->12|42->14|42->14|42->14|51->23|51->23|51->23|54->26|54->26|54->26|56->28|68->40|68->40|68->40|74->46|74->46|74->46|75->47|75->47|81->53|81->53|81->53|85->57|85->57|85->57|87->59|87->59|87->59|89->61|92->64|92->64|92->64|94->66|94->66|94->66|96->68|98->70|98->70|98->70|105->77|110->82|110->82|110->82|116->88|116->88|116->88|125->97|125->97|125->97|126->98|126->98|126->98|127->99|137->109|137->109|137->109|142->140|145->143
                    -- GENERATED --
                */
            