
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
object proteinsite extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template11[String,String,String,ArrayList[com.avaje.ebean.SqlRow],String,HashSet[Long],Proteinstaxonomy,List[Proteinstaxonomy],HashSet[String],String,List[composition_protein.CompSite],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(notation: String, sequence: String, accession: String, source: ArrayList[com.avaje.ebean.SqlRow], site: String, structures: HashSet[Long], taxsources: Proteinstaxonomy, taxsourceslist: List[Proteinstaxonomy], multicar: HashSet[String], proteinFromTax: String, compSite: List[composition_protein.CompSite]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.308*/("""

"""),_display_(Seq[Any](/*3.2*/main/*3.6*/ {_display_(Seq[Any](format.raw/*3.8*/("""

<ul class="breadcrumb">
  <li><i class="icon-home" ></i><a href="/"> UniCarbKB</a> <span class="divider">></span></li>
  <li><i class="icon-map-marker" ></i><a href="/proteins"> Protein</a> <span class="divider">></span></li>
  <li><a href="/proteinsummary/"""),_display_(Seq[Any](/*8.33*/accession)),format.raw/*8.42*/(""""> """),_display_(Seq[Any](/*8.46*/accession)),format.raw/*8.55*/(""" </a><span class="divider">></span></li>
  <li class="active"><i class="icon-th" ></i> Associated Structures</li> 
</ul>

<section id="layouts" class="proteinsummary">

  <div class="page-header row-fluid">
    <h1>Associated Structures</h1>
    """),_display_(Seq[Any](/*16.6*/if(taxsources != null )/*16.29*/{_display_(Seq[Any](format.raw/*16.30*/("""
    <h4 class="subheader span8">Accession: <a href='/proteinsummary/"""),_display_(Seq[Any](/*17.70*/accession)),format.raw/*17.79*/("""'>"""),_display_(Seq[Any](/*17.82*/accession)),format.raw/*17.91*/("""</a> <br/>"""),_display_(Seq[Any](/*17.102*/taxsources/*17.112*/.protein)),format.raw/*17.120*/("""
      <span class="pull-right"><a href="http://uniprot.org/uniprot/"""),_display_(Seq[Any](/*18.69*/accession)),format.raw/*18.78*/(""""><span class='label label-light'>UniProtKB/SWISS-PROT Entry</span></a></span>
    </h4>
    """)))})),format.raw/*20.6*/("""
    """),_display_(Seq[Any](/*21.6*/if(taxsources == null )/*21.29*/{_display_(Seq[Any](format.raw/*21.30*/("""
    <h4 class="subheader span8">Accession: <a href='/proteinsummary/"""),_display_(Seq[Any](/*22.70*/accession)),format.raw/*22.79*/("""'>"""),_display_(Seq[Any](/*22.82*/accession)),format.raw/*22.91*/("""</a> """),_display_(Seq[Any](/*22.97*/for(car <- multicar) yield /*22.117*/ {_display_(Seq[Any](format.raw/*22.119*/("""<br/>"""),_display_(Seq[Any](/*22.125*/car)),format.raw/*22.128*/(""" """)))})),format.raw/*22.130*/(""" 
      <span class="pull-right"><a href="http://uniprot.org/uniprot/"""),_display_(Seq[Any](/*23.69*/accession)),format.raw/*23.78*/(""""><span class='label label-light'>UniProtkb/swiss-prot Entry</span></a></span>
    </h4>
    """)))})),format.raw/*25.6*/("""
  </div>

  <div class="row-fluid">
    <div class="span8">
      """),_display_(Seq[Any](/*30.8*/if(taxsources == null)/*30.30*/{_display_(Seq[Any](format.raw/*30.31*/("""<div class="alert alert-error">Warning: This entry corresponds to more than one protein description <ul> """),_display_(Seq[Any](/*30.137*/for(car <- multicar) yield /*30.157*/{_display_(Seq[Any](format.raw/*30.158*/(""" <li>"""),_display_(Seq[Any](/*30.164*/car)),format.raw/*30.167*/("""</li> """)))})),format.raw/*30.174*/(""" </ul> </div> """)))})),format.raw/*30.189*/("""
      <h3>Structures reported on """),_display_(Seq[Any](/*31.35*/site/*31.39*/.replace("N-", "ASN-").replace("Asn-", "ASN-").replace("S-", "SER-").replace("Ser-", "SER-").replace("T-", "THR-").replace("Thr-", "THR-").replace("ASASN-", "ASN-").replace("AsnAsn", "ASN-"))),format.raw/*31.229*/(""" <a href="/proteinsummary/"""),_display_(Seq[Any](/*31.256*/accession)),format.raw/*31.265*/(""""><span class="pull-right" style="text-transform:uppercase;text-transform:uppercase;font-size:12px;text-align:center;color:#21b5fd;margin:0 0 5px;font-weight:600">Discover more sites</span></a></h3>
      <ul class="structures clearfix">

        """),_display_(Seq[Any](/*34.10*/for(s <- structures) yield /*34.30*/ {_display_(Seq[Any](format.raw/*34.32*/("""
        <li>
          """),_display_(Seq[Any](/*36.12*/views/*36.17*/.html.format.structure(notation, s))),format.raw/*36.52*/("""
        </li>
        """)))})),format.raw/*38.10*/("""
      </ul>


      """),format.raw/*65.18*/("""


    </div><!-- /col -->

    <div class="span4 details">

      """),_display_(Seq[Any](/*72.8*/views/*72.13*/.html.format.format())),format.raw/*72.34*/("""

      <div class="info">
        <h3>Sequence</h3>
        <div class="sequence">
          """),_display_(Seq[Any](/*77.12*/sequence)),format.raw/*77.20*/(""" 
        </div>
      </div>

      <div class="info">
        <h3>Biological Associations</h3>
        <div class='taxonomy'>
          <a id='toggle-taxonomy'><span class='label label-important'><span class='icon-tags icon-white'></span> Taxonomy """),_display_(Seq[Any](/*84.124*/if(taxsources != null)/*84.146*/ {_display_(Seq[Any](format.raw/*84.148*/("""(1)""")))}/*84.153*/else/*84.158*/{_display_(Seq[Any](format.raw/*84.159*/("""(0)""")))})),format.raw/*84.163*/(""" <span class="caret"></span></span></a>
          <a id='toggle-protein'><span class='label label-warning'><span class='icon-map-marker icon-white'></span> Protein """),_display_(Seq[Any](/*85.126*/if(taxsources != null)/*85.148*/ {_display_(Seq[Any](format.raw/*85.150*/("""(1)""")))}/*85.155*/else/*85.160*/{_display_(Seq[Any](format.raw/*85.161*/("""(0)""")))})),format.raw/*85.165*/(""" <span class="caret"></span></span></a>
        </div>
        <div class='taxonomy'>
          <ul id='more-taxonomy'>
            <h3 id='less-taxonomy'><span class='icon-tags icon-white'></span> Taxonomies</h3>
            """),_display_(Seq[Any](/*90.14*/if(taxsources != null )/*90.37*/ {_display_(Seq[Any](format.raw/*90.39*/("""
            <li><span class='icon-map-marker icon-white'></span> <a href="../taxonomysearch?taxonomy="""),_display_(Seq[Any](/*91.103*/taxsources/*91.113*/.species)),format.raw/*91.121*/("""">"""),_display_(Seq[Any](/*91.124*/taxsources/*91.134*/.species)),format.raw/*91.142*/("""</a></li>
            """)))})),format.raw/*92.14*/("""
          </ul>
          <ul id='more-protein'>
            <h3 id='less-protein'><span class='icon-map-marker icon-white'></span> Protein</h3>
            """),_display_(Seq[Any](/*96.14*/if(taxsources != null)/*96.36*/ {_display_(Seq[Any](format.raw/*96.38*/("""
            <li><span class='icon-map-marker icon-white'></span> <a href='../proteinsummary/"""),_display_(Seq[Any](/*97.94*/taxsources/*97.104*/.protein)),format.raw/*97.112*/("""'>"""),_display_(Seq[Any](/*97.115*/taxsources/*97.125*/.protein)),format.raw/*97.133*/("""</a></li>
            """)))})),format.raw/*98.14*/("""
          </ul>
        </div>
      </div>
      <div class="info">
        <h3>Reference """),_display_(Seq[Any](/*103.24*/if(source.size() > 5)/*103.45*/ {_display_(Seq[Any](format.raw/*103.47*/("""showing top 5""")))})),format.raw/*103.61*/(""" <span id='show-references' class="label" style="font-size:16px"><a href="#4">"""),_display_(Seq[Any](/*103.140*/source/*103.146*/.size())),format.raw/*103.153*/("""</a></span></h3>
        <ol>
          """),format.raw/*105.81*/("""

          """),_display_(Seq[Any](/*107.12*/for((source,i) <- source.zipWithIndex; if (i < 5)) yield /*107.62*/ {_display_(Seq[Any](format.raw/*107.64*/("""
          <li class="references">
            <p class="title"><a name='"""),_display_(Seq[Any](/*109.40*/i)),format.raw/*109.41*/("""' href='/references/"""),_display_(Seq[Any](/*109.62*/source/*109.68*/.get("id"))),format.raw/*109.78*/("""'>"""),_display_(Seq[Any](/*109.81*/source/*109.87*/.get("title"))),format.raw/*109.100*/("""</a></p>
            <p class="author">"""),_display_(Seq[Any](/*110.32*/source/*110.38*/.get("authors"))),format.raw/*110.53*/("""</p>
            <p class="ref">PubMed: <a href='http://www.ncbi.nlm.nih.gov/pubmed/"""),_display_(Seq[Any](/*111.81*/source/*111.87*/.get("pmid"))),format.raw/*111.99*/("""'>"""),_display_(Seq[Any](/*111.102*/source/*111.108*/.get("pmid"))),format.raw/*111.120*/("""</a> Year: """),_display_(Seq[Any](/*111.132*/source/*111.138*/.get("year"))),format.raw/*111.150*/("""</p>
          </li>
          """)))})),format.raw/*113.12*/("""
          <div id='more-references'>
          """),_display_(Seq[Any](/*115.12*/for((source,i) <- source.zipWithIndex; if (i > 5)) yield /*115.62*/ {_display_(Seq[Any](format.raw/*115.64*/("""
          <li class="references">
            <p class="title"><a name='"""),_display_(Seq[Any](/*117.40*/i)),format.raw/*117.41*/("""' href='/references/"""),_display_(Seq[Any](/*117.62*/source/*117.68*/.get("id"))),format.raw/*117.78*/("""'>"""),_display_(Seq[Any](/*117.81*/source/*117.87*/.get("title"))),format.raw/*117.100*/("""</a></p>
            <p class="author">"""),_display_(Seq[Any](/*118.32*/source/*118.38*/.get("authors"))),format.raw/*118.53*/("""</p>
            <p class="ref">PubMed: <a href='http://www.ncbi.nlm.nih.gov/pubmed/"""),_display_(Seq[Any](/*119.81*/source/*119.87*/.get("pmid"))),format.raw/*119.99*/("""'>"""),_display_(Seq[Any](/*119.102*/source/*119.108*/.get("pmid"))),format.raw/*119.120*/("""</a> Year: """),_display_(Seq[Any](/*119.132*/source/*119.138*/.get("year"))),format.raw/*119.150*/("""</p>
          </li>
          """)))})),format.raw/*121.12*/("""
          </div>
          """),_display_(Seq[Any](/*123.12*/if(source.size() > 5)/*123.33*/ {_display_(Seq[Any](format.raw/*123.35*/("""
          <div id='show-more-references' class='more-structures' href='#'>
            See more references
            <br />
            <span>&#9679; &#9679; &#9679;</span>
          </div>
          """)))})),format.raw/*129.12*/("""

        </ol>
      </div>

    </div><!-- /col -->
  </div><!-- /row -->

  """),_display_(Seq[Any](/*137.4*/views/*137.9*/.html.footerunicarb.footerunicarb())),format.raw/*137.44*/("""

</section>

""")))})),format.raw/*141.2*/("""
"""))}
    }
    
    def render(notation:String,sequence:String,accession:String,source:ArrayList[com.avaje.ebean.SqlRow],site:String,structures:HashSet[Long],taxsources:Proteinstaxonomy,taxsourceslist:List[Proteinstaxonomy],multicar:HashSet[String],proteinFromTax:String,compSite:List[composition_protein.CompSite]): play.api.templates.HtmlFormat.Appendable = apply(notation,sequence,accession,source,site,structures,taxsources,taxsourceslist,multicar,proteinFromTax,compSite)
    
    def f:((String,String,String,ArrayList[com.avaje.ebean.SqlRow],String,HashSet[Long],Proteinstaxonomy,List[Proteinstaxonomy],HashSet[String],String,List[composition_protein.CompSite]) => play.api.templates.HtmlFormat.Appendable) = (notation,sequence,accession,source,site,structures,taxsources,taxsourceslist,multicar,proteinFromTax,compSite) => apply(notation,sequence,accession,source,site,structures,taxsources,taxsourceslist,multicar,proteinFromTax,compSite)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 02 16:21:23 EST 2014
                    SOURCE: /Users/matthew/git/glycomics_working/app/views/proteinsite.scala.html
                    HASH: 5e420f8772e93555335f7a04ee3316bdca5a98c3
                    MATRIX: 948->1|1349->307|1386->310|1397->314|1435->316|1730->576|1760->585|1799->589|1829->598|2111->845|2143->868|2182->869|2288->939|2319->948|2358->951|2389->960|2437->971|2457->981|2488->989|2593->1058|2624->1067|2749->1161|2790->1167|2822->1190|2861->1191|2967->1261|2998->1270|3037->1273|3068->1282|3110->1288|3147->1308|3188->1310|3231->1316|3257->1319|3292->1321|3398->1391|3429->1400|3554->1494|3657->1562|3688->1584|3727->1585|3870->1691|3907->1711|3947->1712|3990->1718|4016->1721|4056->1728|4104->1743|4175->1778|4188->1782|4401->1972|4465->1999|4497->2008|4781->2256|4817->2276|4857->2278|4918->2303|4932->2308|4989->2343|5045->2367|5094->3352|5197->3420|5211->3425|5254->3446|5385->3541|5415->3549|5703->3800|5735->3822|5776->3824|5800->3829|5814->3834|5854->3835|5891->3839|6093->4004|6125->4026|6166->4028|6190->4033|6204->4038|6244->4039|6281->4043|6544->4270|6576->4293|6616->4295|6756->4398|6776->4408|6807->4416|6847->4419|6867->4429|6898->4437|6953->4460|7148->4619|7179->4641|7219->4643|7349->4737|7369->4747|7400->4755|7440->4758|7460->4768|7491->4776|7546->4799|7676->4892|7707->4913|7748->4915|7795->4929|7912->5008|7929->5014|7960->5021|8029->5131|8079->5144|8146->5194|8187->5196|8298->5270|8322->5271|8380->5292|8396->5298|8429->5308|8469->5311|8485->5317|8522->5330|8599->5370|8615->5376|8653->5391|8775->5476|8791->5482|8826->5494|8867->5497|8884->5503|8920->5515|8970->5527|8987->5533|9023->5545|9088->5577|9174->5626|9241->5676|9282->5678|9393->5752|9417->5753|9475->5774|9491->5780|9524->5790|9564->5793|9580->5799|9617->5812|9694->5852|9710->5858|9748->5873|9870->5958|9886->5964|9921->5976|9962->5979|9979->5985|10015->5997|10065->6009|10082->6015|10118->6027|10183->6059|10249->6088|10280->6109|10321->6111|10558->6315|10674->6395|10688->6400|10746->6435|10793->6450
                    LINES: 26->1|29->1|31->3|31->3|31->3|36->8|36->8|36->8|36->8|44->16|44->16|44->16|45->17|45->17|45->17|45->17|45->17|45->17|45->17|46->18|46->18|48->20|49->21|49->21|49->21|50->22|50->22|50->22|50->22|50->22|50->22|50->22|50->22|50->22|50->22|51->23|51->23|53->25|58->30|58->30|58->30|58->30|58->30|58->30|58->30|58->30|58->30|58->30|59->31|59->31|59->31|59->31|59->31|62->34|62->34|62->34|64->36|64->36|64->36|66->38|70->65|77->72|77->72|77->72|82->77|82->77|89->84|89->84|89->84|89->84|89->84|89->84|89->84|90->85|90->85|90->85|90->85|90->85|90->85|90->85|95->90|95->90|95->90|96->91|96->91|96->91|96->91|96->91|96->91|97->92|101->96|101->96|101->96|102->97|102->97|102->97|102->97|102->97|102->97|103->98|108->103|108->103|108->103|108->103|108->103|108->103|108->103|110->105|112->107|112->107|112->107|114->109|114->109|114->109|114->109|114->109|114->109|114->109|114->109|115->110|115->110|115->110|116->111|116->111|116->111|116->111|116->111|116->111|116->111|116->111|116->111|118->113|120->115|120->115|120->115|122->117|122->117|122->117|122->117|122->117|122->117|122->117|122->117|123->118|123->118|123->118|124->119|124->119|124->119|124->119|124->119|124->119|124->119|124->119|124->119|126->121|128->123|128->123|128->123|134->129|142->137|142->137|142->137|146->141
                    -- GENERATED --
                */
            