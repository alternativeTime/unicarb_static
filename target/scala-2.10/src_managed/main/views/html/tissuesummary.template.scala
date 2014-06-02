
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
object tissuesummary extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template12[Tissue,HashSet[String],TreeMap[String, String],String,String,String,ArrayList[Taxonomy],ArrayList[Taxonomy],ArrayList[String],ArrayList[Proteins],ArrayList[String],ArrayList[Tissue],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(tissue: Tissue, test: HashSet[String], strtax: TreeMap[String, String], notation: String, message: String, description: String, taxNames: ArrayList[Taxonomy], taxItems: ArrayList[Taxonomy], proteinNames: ArrayList[String], proteinItems: ArrayList[Proteins], sourceNames: ArrayList[String], sourceItems: ArrayList[Tissue] ):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*8.2*/header/*8.8*/(key:String, title:String):play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*8.38*/("""
<th class="">
  <a href="">"""),_display_(Seq[Any](/*10.15*/title)),format.raw/*10.20*/("""</a>
</th>
""")))};
Seq[Any](format.raw/*1.325*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*6.37*/("""

"""),format.raw/*12.2*/("""

"""),_display_(Seq[Any](/*14.2*/main/*14.6*/ {_display_(Seq[Any](format.raw/*14.8*/("""
<ul class="breadcrumb">
  <li><i class="icon-home" ></i><a href="/"> UniCarbKB</a> <span class="divider">></span></li>
  <li><i class="icon-book" ></i><a href="/references"> References</a> <span class="divider">></span></li>
  <li class="active"><i class="icon-file" ></i> """),_display_(Seq[Any](/*18.50*/message)),format.raw/*18.57*/("""<span class="divider"></span></li>
</ul>

<section id="layouts">

  <div class="page-header row-fluid">
    <h1 class="">"""),_display_(Seq[Any](/*24.19*/message)),format.raw/*24.26*/("""</h1>
    <h4 class="subheader span8">"""),_display_(Seq[Any](/*25.34*/description)),format.raw/*25.45*/(""" <span class="pull-right"><span class="label label-light">Curated Entry</span> <span class="label label-light">GlycoSuiteDB</span></span></h4>
  </div>

  <div class="row-fluid">
    <div class="span8">




      <ul class="structures clearfix">
        """),format.raw/*35.75*/("""
	"""),_display_(Seq[Any](/*36.3*/for(t <- test) yield /*36.17*/ {_display_(Seq[Any](format.raw/*36.19*/("""
        <li class="span5">
           """),_display_(Seq[Any](/*38.13*/views/*38.18*/.html.format.structure(notation, t.toLong))),format.raw/*38.60*/("""   

        </li>
        """)))})),format.raw/*41.10*/("""
      </ul>
      <ul id='more-thumbnails' class='structures clearfix'>
      </ul>
      """),_display_(Seq[Any](/*45.8*/if( test.size > 5)/*45.26*/ {_display_(Seq[Any](format.raw/*45.28*/("""
      <div id='show-structures' class='more-structures' href='#'>
        <span class="linktext">See more structures</span>
        <span class="linktext" style="display:none">See less structures</span> 
        <br />
        <span>&#9679; &#9679; &#9679;</span>
      </div>
      """)))})),format.raw/*52.8*/("""

    </div>

    <div class="span4 sidebar">

	  	"""),_display_(Seq[Any](/*58.6*/views/*58.11*/.html.format.format())),format.raw/*58.32*/("""

      <div class='info'>
        <h3>Biological Associations</h4>
        <div class='taxonomy'>
          <a id='toggle-taxonomy'><span class='label label-important'><span class='icon-tags icon-white'></span> Taxonomy ("""),_display_(Seq[Any](/*63.125*/tissue/*63.131*/.taxtissue.size())),format.raw/*63.148*/(""") <span class="caret"></span></span></a>
          <a id='toggle-protein'><span class='label label-warning'><span class='icon-map-marker icon-white'></span> Protein ("""),_display_(Seq[Any](/*64.127*/tissue/*64.133*/.proteintissue.size())),format.raw/*64.154*/(""") <span class="caret"></span></span></a> 
          """),format.raw/*65.183*/("""
        </div>
	
	<div>
	  """),_display_(Seq[Any](/*69.5*/if(tissue.taxtissue.size() > 0)/*69.36*/ {_display_(Seq[Any](format.raw/*69.38*/("""
          <ul id='more-taxonomy'>
            <h3 id='less-taxonomy'><span class='icon-tags icon-white'></span> Taxonomies</h3>
            """),format.raw/*75.17*/("""
	    """),_display_(Seq[Any](/*76.7*/for(t <- tissue.taxtissue) yield /*76.33*/ {_display_(Seq[Any](format.raw/*76.35*/("""
	     <li><span class='icon-tag icon-white'></span> <a href='../taxonomy/"""),_display_(Seq[Any](/*77.75*/t/*77.76*/.taxonomy.id)),format.raw/*77.88*/("""'>"""),_display_(Seq[Any](/*77.91*/t/*77.92*/.species)),format.raw/*77.100*/("""</a></li>
            """)))})),format.raw/*78.14*/("""
          </ul> """)))})),format.raw/*79.18*/(""" 
	  """),_display_(Seq[Any](/*80.5*/if(tissue.proteintissue.size() > 0)/*80.40*/ {_display_(Seq[Any](format.raw/*80.42*/("""
	  <ul id='more-protein'>
	    """),_display_(Seq[Any](/*82.7*/for(t <- tissue.proteintissue) yield /*82.37*/{_display_(Seq[Any](format.raw/*82.38*/("""
	    <li><span class='icon-map-marker icon-white'></span> <a href='../proteinsummary/"""),_display_(Seq[Any](/*83.87*/t/*83.88*/.swiss)),format.raw/*83.94*/("""'>"""),_display_(Seq[Any](/*83.97*/t/*83.98*/.protein)),format.raw/*83.106*/(""" ("""),_display_(Seq[Any](/*83.109*/t/*83.110*/.swiss)),format.raw/*83.116*/(""")</a></li>
	    """)))})),format.raw/*84.7*/("""
	  </ul>
	  """)))})),format.raw/*86.5*/("""
	</div>

      </div>


    </div>

  </div>
  """),_display_(Seq[Any](/*95.4*/views/*95.9*/.html.footerunicarb.footerunicarb())),format.raw/*95.44*/("""
</section>


""")))})),format.raw/*99.2*/("""
"""))}
    }
    
    def render(tissue:Tissue,test:HashSet[String],strtax:TreeMap[String, String],notation:String,message:String,description:String,taxNames:ArrayList[Taxonomy],taxItems:ArrayList[Taxonomy],proteinNames:ArrayList[String],proteinItems:ArrayList[Proteins],sourceNames:ArrayList[String],sourceItems:ArrayList[Tissue]): play.api.templates.HtmlFormat.Appendable = apply(tissue,test,strtax,notation,message,description,taxNames,taxItems,proteinNames,proteinItems,sourceNames,sourceItems)
    
    def f:((Tissue,HashSet[String],TreeMap[String, String],String,String,String,ArrayList[Taxonomy],ArrayList[Taxonomy],ArrayList[String],ArrayList[Proteins],ArrayList[String],ArrayList[Tissue]) => play.api.templates.HtmlFormat.Appendable) = (tissue,test,strtax,notation,message,description,taxNames,taxItems,proteinNames,proteinItems,sourceNames,sourceItems) => apply(tissue,test,strtax,notation,message,description,taxNames,taxItems,proteinNames,proteinItems,sourceNames,sourceItems)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 02 10:52:57 EST 2014
                    SOURCE: /Users/matthew/git/glycomics_working/app/views/tissuesummary.scala.html
                    HASH: 22c659a85167f4fccf50f124da6ea23000719c1b
                    MATRIX: 958->1|1374->454|1387->460|1497->490|1562->519|1589->524|1641->324|1668->342|1696->451|1725->536|1763->539|1775->543|1814->545|2125->820|2154->827|2312->949|2341->956|2416->995|2449->1006|2731->1326|2769->1329|2799->1343|2839->1345|2915->1385|2929->1390|2993->1432|3053->1460|3180->1552|3207->1570|3247->1572|3563->1857|3650->1909|3664->1914|3707->1935|3967->2158|3983->2164|4023->2181|4227->2348|4243->2354|4287->2375|4368->2599|4432->2628|4472->2659|4512->2661|4681->2958|4723->2965|4765->2991|4805->2993|4916->3068|4926->3069|4960->3081|4999->3084|5009->3085|5040->3093|5095->3116|5145->3134|5186->3140|5230->3175|5270->3177|5338->3210|5384->3240|5423->3241|5546->3328|5556->3329|5584->3335|5623->3338|5633->3339|5664->3347|5704->3350|5715->3351|5744->3357|5792->3374|5837->3388|5921->3437|5934->3442|5991->3477|6037->3492
                    LINES: 26->1|29->8|29->8|31->8|33->10|33->10|36->1|37->3|38->6|40->12|42->14|42->14|42->14|46->18|46->18|52->24|52->24|53->25|53->25|63->35|64->36|64->36|64->36|66->38|66->38|66->38|69->41|73->45|73->45|73->45|80->52|86->58|86->58|86->58|91->63|91->63|91->63|92->64|92->64|92->64|93->65|97->69|97->69|97->69|100->75|101->76|101->76|101->76|102->77|102->77|102->77|102->77|102->77|102->77|103->78|104->79|105->80|105->80|105->80|107->82|107->82|107->82|108->83|108->83|108->83|108->83|108->83|108->83|108->83|108->83|108->83|109->84|111->86|120->95|120->95|120->95|124->99
                    -- GENERATED --
                */
            