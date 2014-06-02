
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
object structureDetails extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template16[Structure,String,List[Composition],String,List[Structure],Long,ArrayList[String],HashSet[Proteins],ArrayList[String],HashSet[Tissue],List[Array[String]],ArrayList[String],HashSet[Taxonomy],ArrayList[String],String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(strInfo: Structure, glycantype: String, strcomp: List[Composition], notation: String, references: List[Structure], structureId: Long, proteinNames: ArrayList[String], proteinItems: HashSet[Proteins], sourceNames: ArrayList[String], sourceItems: HashSet[Tissue], test: List[Array[String]], uniprot: ArrayList[String], taxItems: HashSet[Taxonomy], taxNames: ArrayList[String], pubchem: String, reader: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*7.2*/header/*7.8*/(key:String, title:String):play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*7.38*/("""
    <th class="">
        <a href="">"""),_display_(Seq[Any](/*9.21*/title)),format.raw/*9.26*/("""</a>
    </th>
""")))};
Seq[Any](format.raw/*1.410*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*6.37*/("""
"""),format.raw/*11.2*/("""

<script src=""""),_display_(Seq[Any](/*13.15*/routes/*13.21*/.Assets.at("/public", "javascripts/bootstrap-tab.js"))),format.raw/*13.74*/(""""></script>


"""),_display_(Seq[Any](/*16.2*/main/*16.6*/ {_display_(Seq[Any](format.raw/*16.8*/("""

<ul class="breadcrumb">
  <li><i class="icon-home" ></i><a href="/"> UniCarbKB</a> <span class="divider">></span></li>
  <li class="active"><i class="icon-th" ></i> Structure<span class="divider"></span></li>
  <!--<li class="active" > You are here</li>-->
</ul>

<div class="modal hide fade" id="windowDescription">
  <div class="modal-header">
    <a href="#" class="close" data-dismiss="modal">&times;</a>
    <h3>Protein and Taxonomy Information <span class="label label-success">Curated Entry</span> <span class="label label-notice">GlycoSuiteDB</span></h3>
  </div>
  <div class="modal-body">
    <h2 class="fullname">This structure has been associated with various records:</h2>

    <div id="myDiv"><p></p></div>
  </div>
  <div class="modal-footer">
    <a href="#" class="btn primary" onclick="okClicked ();">OK</a>
  </div>
</div>


<section id="structureLayout">
  <section id="layouts">	

  <div class="page-header row-fluid">
    <h1>Structure</h1>
    <h4 class="subheader span8">Details for this """),_display_(Seq[Any](/*45.51*/glycantype)),format.raw/*45.61*/(""" glycan structure</h4>
  </div>

 <div class="row-fluid">
    <div class="span8">
      <ul class='structures'>
      """),_display_(Seq[Any](/*51.8*/views/*51.13*/.html.format.structureLarge(notation, structureId))),format.raw/*51.63*/(""" 
      </ul>
      
       
      
      """),_display_(Seq[Any](/*56.8*/if(reader.length > 10)/*56.30*/{_display_(Seq[Any](format.raw/*56.31*/("""
       """),_display_(Seq[Any](/*57.9*/views/*57.14*/.html.synthesis.enzymes(references, reader))),format.raw/*57.57*/("""
      """)))}/*58.8*/else/*58.12*/{_display_(Seq[Any](format.raw/*58.13*/("""
      
      <h3>References associated to structure</h3>
      <table class="computers table table-striped">
        <thead>
          <tr>
            """),_display_(Seq[Any](/*64.14*/header("title", "Title"))),format.raw/*64.38*/("""
            """),_display_(Seq[Any](/*65.14*/header("year", "Year"))),format.raw/*65.36*/("""
            """),_display_(Seq[Any](/*66.14*/header("authors", "Authors"))),format.raw/*66.42*/("""
          </tr>
        </thead>
        <tbody>
          """),_display_(Seq[Any](/*70.12*/for(stref <- references) yield /*70.36*/{_display_(Seq[Any](format.raw/*70.37*/("""
          """),_display_(Seq[Any](/*71.12*/for(reference <- stref.references) yield /*71.46*/{_display_(Seq[Any](format.raw/*71.47*/("""
          <tr>
            <td><a href="../references/"""),_display_(Seq[Any](/*73.41*/reference/*73.50*/.reference.id)),format.raw/*73.63*/("""">"""),_display_(Seq[Any](/*73.66*/reference/*73.75*/.reference.title)),format.raw/*73.91*/("""</a></td>
            <td>"""),_display_(Seq[Any](/*74.18*/reference/*74.27*/.reference.year)),format.raw/*74.42*/("""</td>
            <td>"""),_display_(Seq[Any](/*75.18*/reference/*75.27*/.reference.authors)),format.raw/*75.45*/("""</td>
          </tr>
          """)))})),format.raw/*77.12*/("""
          """)))})),format.raw/*78.12*/("""
        </tbody>
      </table>
      
      """)))})),format.raw/*82.8*/("""
      
      
      """),format.raw/*136.9*/("""
    
    </div>





    <div class="span4 sidebar">

      """),_display_(Seq[Any](/*146.8*/views/*146.13*/.html.format.format())),format.raw/*146.34*/("""
      	
      <div class='info'>
      	<h3>Mass Details</h3>
      	"""),_display_(Seq[Any](/*150.9*/for(c <- strcomp) yield /*150.26*/ {_display_(Seq[Any](format.raw/*150.28*/("""
      		<p>Average Mass: """),_display_(Seq[Any](/*151.27*/c/*151.28*/.glycan_mass)),format.raw/*151.40*/("""</p>
      		<p>Monoisotopic Mass: """),_display_(Seq[Any](/*152.32*/c/*152.33*/.glycan_mass_monoisotopic)),format.raw/*152.58*/("""</p>
      	""")))})),format.raw/*153.9*/("""
      </div>

      <div class='info'>
	<h3>Linkage Type</h3>
	<p>"""),_display_(Seq[Any](/*158.6*/glycantype)),format.raw/*158.16*/(""" glycan structure</p>
      </div>

      <div class='info'>
        <h3>Biological Associations</h4>
        <div class='taxonomy'>
          <a id='toggle-taxonomy'><span class='label label-important'><span class='icon-tags icon-white'></span> Taxonomy ("""),_display_(Seq[Any](/*164.125*/taxItems/*164.133*/.size())),format.raw/*164.140*/(""") <span class="caret"></span></span></a>
          <a id='toggle-protein'><span class='label label-warning'><span class='icon-map-marker icon-white'></span> Protein ("""),_display_(Seq[Any](/*165.127*/proteinItems/*165.139*/.size())),format.raw/*165.146*/(""") <span class="caret"></span></span></a>
          <a id='toggle-source'><span class='label label-success'><span class='icon-leaf icon-white'></span> Source ("""),_display_(Seq[Any](/*166.119*/sourceItems/*166.130*/.size())),format.raw/*166.137*/(""") <span class="caret"></span></span></a>
        </div>
        <div>
          <ul id='more-taxonomy'>
            <h3 id='less-taxonomy'><span class='icon-tags icon-white'></span> Taxonomies</h3>
            """),_display_(Seq[Any](/*171.14*/for(tax <- taxItems) yield /*171.34*/{_display_(Seq[Any](format.raw/*171.35*/("""
            <li><span class='icon-tag icon-white'></span> <a href='../taxonomy/"""),_display_(Seq[Any](/*172.81*/tax/*172.84*/.id)),format.raw/*172.87*/("""'>"""),_display_(Seq[Any](/*172.90*/tax/*172.93*/.species)),format.raw/*172.101*/("""</a></li>
            """)))})),format.raw/*173.14*/("""
          </ul>
          <ul id='more-protein'>
            <h3 id='less-protein'><span class='icon-map-marker icon-white'></span> Protein</h3>
            """),_display_(Seq[Any](/*177.14*/for(protein <- proteinItems) yield /*177.42*/{_display_(Seq[Any](format.raw/*177.43*/("""
	    """),_display_(Seq[Any](/*178.7*/if(protein.swissProt == null )/*178.37*/ {_display_(Seq[Any](format.raw/*178.39*/("""
	    <li><span class='icon-map-marker icon-white'></span> <a href='../proteinsummary/"""),_display_(Seq[Any](/*179.87*/protein/*179.94*/.name)),format.raw/*179.99*/("""'>"""),_display_(Seq[Any](/*179.102*/protein/*179.109*/.name)),format.raw/*179.114*/("""</a></li>
	    """)))})),format.raw/*180.7*/("""
	    """),_display_(Seq[Any](/*181.7*/if(protein.swissProt != null  )/*181.38*/ {_display_(Seq[Any](format.raw/*181.40*/("""
            <li><span class='icon-map-marker icon-white'></span> <a href='../proteinsummary/"""),_display_(Seq[Any](/*182.94*/protein/*182.101*/.swissProt)),format.raw/*182.111*/("""'>"""),_display_(Seq[Any](/*182.114*/protein/*182.121*/.name)),format.raw/*182.126*/("""</a></li>
            """)))})),format.raw/*183.14*/("""
	    """)))})),format.raw/*184.7*/("""
          </ul>
          <ul id='more-source'>
            <h3 id='less-source'><span class='icon-leaf icon-white'></span> Source</h3>
            """),_display_(Seq[Any](/*188.14*/for(source <- sourceItems) yield /*188.40*/{_display_(Seq[Any](format.raw/*188.41*/("""
            <li><span class='icon-leaf icon-white'></span> <a href='../tissuesummary/"""),_display_(Seq[Any](/*189.87*/source/*189.93*/.id)),format.raw/*189.96*/("""'>"""),_display_(Seq[Any](/*189.99*/source/*189.105*/.div1)),format.raw/*189.110*/(""" > """),_display_(Seq[Any](/*189.114*/source/*189.120*/.div2)),format.raw/*189.125*/(""" """),_display_(Seq[Any](/*189.127*/source/*189.133*/.div3)),format.raw/*189.138*/(""" > """),_display_(Seq[Any](/*189.142*/source/*189.148*/.div4)),format.raw/*189.153*/("""</a></li>
            """)))})),format.raw/*190.14*/("""
          </ul>
        </div>
      </div>

      <div class='info'>
        <h3>Defined Content</h3>
      <div class='taxonomy'>
	<a id='toggle-defined'><span class='label label-success'><span class='icon-leaf icon-white'></span> Source ("""),_display_(Seq[Any](/*198.111*/sourceItems/*198.122*/.size())),format.raw/*198.129*/(""") <span class="caret"></span></span></a>
      </div>
      <div>
         <ul id='more-defined'>
            <h3 id='less-defined'><span class='icon-leaf icon-white'></span> More Defined Info</h3>
            """),_display_(Seq[Any](/*203.14*/for(d <- strInfo.strproteintaxbiolsource) yield /*203.55*/{_display_(Seq[Any](format.raw/*203.56*/("""
            <li><span class='icon-leaf icon-white'></span> <a href=''>"""),_display_(Seq[Any](/*204.72*/if(d.taxonomy != null )/*204.95*/ {_display_(Seq[Any](format.raw/*204.97*/(""" """),_display_(Seq[Any](/*204.99*/{d.taxonomy.species})),format.raw/*204.119*/("""  >""")))})),format.raw/*204.123*/(""" """),_display_(Seq[Any](/*204.125*/if(d.proteins !=null )/*204.147*/{_display_(Seq[Any](format.raw/*204.148*/(""" """),_display_(Seq[Any](/*204.150*/{d.proteins.name})),format.raw/*204.167*/(""" """)))})),format.raw/*204.169*/("""</a></li>
            """)))})),format.raw/*205.14*/("""
         </ul>
      </div>
      </div>

      """),_display_(Seq[Any](/*210.8*/if(pubchem != null)/*210.27*/ {_display_(Seq[Any](format.raw/*210.29*/("""
	 """),_display_(Seq[Any](/*211.4*/views/*211.9*/.html.format.pubchem( pubchem ))),format.raw/*211.40*/("""
      """)))})),format.raw/*212.8*/("""
      """),_display_(Seq[Any](/*213.8*/if(strInfo.glycanst matches ".*\\?.*" )/*213.47*/ {_display_(Seq[Any](format.raw/*213.49*/("""
      <h3></h3>
      
      """)))}/*216.9*/else/*216.14*/{_display_(Seq[Any](format.raw/*216.15*/(""" """),_display_(Seq[Any](/*216.17*/views/*216.22*/.html.digest.digest( strInfo ))),format.raw/*216.52*/(""" """)))})),format.raw/*216.54*/("""

    </div>
  </div>

  <div class="row-fluid">

  </div>
</section>
</section>	

"""),_display_(Seq[Any](/*227.2*/views/*227.7*/.html.footerunicarb.footerunicarb())),format.raw/*227.42*/("""

""")))})),format.raw/*229.2*/("""
"""))}
    }
    
    def render(strInfo:Structure,glycantype:String,strcomp:List[Composition],notation:String,references:List[Structure],structureId:Long,proteinNames:ArrayList[String],proteinItems:HashSet[Proteins],sourceNames:ArrayList[String],sourceItems:HashSet[Tissue],test:List[Array[String]],uniprot:ArrayList[String],taxItems:HashSet[Taxonomy],taxNames:ArrayList[String],pubchem:String,reader:String): play.api.templates.HtmlFormat.Appendable = apply(strInfo,glycantype,strcomp,notation,references,structureId,proteinNames,proteinItems,sourceNames,sourceItems,test,uniprot,taxItems,taxNames,pubchem,reader)
    
    def f:((Structure,String,List[Composition],String,List[Structure],Long,ArrayList[String],HashSet[Proteins],ArrayList[String],HashSet[Tissue],List[Array[String]],ArrayList[String],HashSet[Taxonomy],ArrayList[String],String,String) => play.api.templates.HtmlFormat.Appendable) = (strInfo,glycantype,strcomp,notation,references,structureId,proteinNames,proteinItems,sourceNames,sourceItems,test,uniprot,taxItems,taxNames,pubchem,reader) => apply(strInfo,glycantype,strcomp,notation,references,structureId,proteinNames,proteinItems,sourceNames,sourceItems,test,uniprot,taxItems,taxNames,pubchem,reader)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 02 10:52:57 EST 2014
                    SOURCE: /Users/matthew/git/glycomics_working/app/views/structureDetails.scala.html
                    HASH: 12a820e964a7e46bd0a839609831a913f1b7c98e
                    MATRIX: 1000->1|1501->538|1514->544|1624->574|1698->613|1724->618|1780->409|1807->427|1835->536|1863->634|1915->650|1930->656|2005->709|2055->724|2067->728|2106->730|3157->1745|3189->1755|3343->1874|3357->1879|3429->1929|3507->1972|3538->1994|3577->1995|3621->2004|3635->2009|3700->2052|3726->2060|3739->2064|3778->2065|3968->2219|4014->2243|4064->2257|4108->2279|4158->2293|4208->2321|4305->2382|4345->2406|4384->2407|4432->2419|4482->2453|4521->2454|4613->2510|4631->2519|4666->2532|4705->2535|4723->2544|4761->2560|4824->2587|4842->2596|4879->2611|4938->2634|4956->2643|4996->2661|5061->2694|5105->2706|5183->2753|5232->4017|5330->4079|5345->4084|5389->4105|5496->4176|5530->4193|5571->4195|5635->4222|5646->4223|5681->4235|5754->4271|5765->4272|5813->4297|5858->4310|5962->4378|5995->4388|6290->4645|6309->4653|6340->4660|6545->4827|6568->4839|6599->4846|6796->5005|6818->5016|6849->5023|7097->5234|7134->5254|7174->5255|7292->5336|7305->5339|7331->5342|7371->5345|7384->5348|7416->5356|7472->5379|7668->5538|7713->5566|7753->5567|7796->5574|7836->5604|7877->5606|8001->5693|8018->5700|8046->5705|8087->5708|8105->5715|8134->5720|8182->5736|8225->5743|8266->5774|8307->5776|8438->5870|8456->5877|8490->5887|8531->5890|8549->5897|8578->5902|8634->5925|8673->5932|8860->6082|8903->6108|8943->6109|9067->6196|9083->6202|9109->6205|9149->6208|9166->6214|9195->6219|9237->6223|9254->6229|9283->6234|9323->6236|9340->6242|9369->6247|9411->6251|9428->6257|9457->6262|9513->6285|9794->6528|9816->6539|9847->6546|10095->6757|10153->6798|10193->6799|10302->6871|10335->6894|10376->6896|10415->6898|10459->6918|10497->6922|10537->6924|10570->6946|10611->6947|10651->6949|10692->6966|10728->6968|10784->6991|10870->7041|10899->7060|10940->7062|10980->7066|10994->7071|11048->7102|11088->7110|11132->7118|11181->7157|11222->7159|11272->7191|11286->7196|11326->7197|11365->7199|11380->7204|11433->7234|11468->7236|11588->7320|11602->7325|11660->7360|11695->7363
                    LINES: 26->1|29->7|29->7|31->7|33->9|33->9|36->1|37->3|38->6|39->11|41->13|41->13|41->13|44->16|44->16|44->16|73->45|73->45|79->51|79->51|79->51|84->56|84->56|84->56|85->57|85->57|85->57|86->58|86->58|86->58|92->64|92->64|93->65|93->65|94->66|94->66|98->70|98->70|98->70|99->71|99->71|99->71|101->73|101->73|101->73|101->73|101->73|101->73|102->74|102->74|102->74|103->75|103->75|103->75|105->77|106->78|110->82|113->136|123->146|123->146|123->146|127->150|127->150|127->150|128->151|128->151|128->151|129->152|129->152|129->152|130->153|135->158|135->158|141->164|141->164|141->164|142->165|142->165|142->165|143->166|143->166|143->166|148->171|148->171|148->171|149->172|149->172|149->172|149->172|149->172|149->172|150->173|154->177|154->177|154->177|155->178|155->178|155->178|156->179|156->179|156->179|156->179|156->179|156->179|157->180|158->181|158->181|158->181|159->182|159->182|159->182|159->182|159->182|159->182|160->183|161->184|165->188|165->188|165->188|166->189|166->189|166->189|166->189|166->189|166->189|166->189|166->189|166->189|166->189|166->189|166->189|166->189|166->189|166->189|167->190|175->198|175->198|175->198|180->203|180->203|180->203|181->204|181->204|181->204|181->204|181->204|181->204|181->204|181->204|181->204|181->204|181->204|181->204|182->205|187->210|187->210|187->210|188->211|188->211|188->211|189->212|190->213|190->213|190->213|193->216|193->216|193->216|193->216|193->216|193->216|193->216|204->227|204->227|204->227|206->229
                    -- GENERATED --
                */
            