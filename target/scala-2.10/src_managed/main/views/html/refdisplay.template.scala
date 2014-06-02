
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
object refdisplay extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template8[String,String,List[Reference],List[Reference],ArrayList[String],ArrayList[Biolsource],ArrayList[String],List[Reference],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(notation: String, message: String, references: List[Reference], refmethods: List[Reference], taxsources: ArrayList[String], proteinsources: ArrayList[Biolsource], prot: ArrayList[String],  refmethodsgp: List[Reference] ):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*4.2*/title/*4.7*/(text: String) = {{
  text.split(' ').map(_.capitalize).mkString(" ")
}};def /*8.2*/ands/*8.6*/(text: String) = {{
  text.replaceAll(" ", "-").replaceAll("(\\.$)", "")
}};
Seq[Any](format.raw/*1.223*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*6.2*/("""

"""),format.raw/*10.2*/("""

<script>
    var ands = "";
    var andsTitle = "title";
	"""),_display_(Seq[Any](/*15.3*/for(ands <- references) yield /*15.26*/{_display_(Seq[Any](format.raw/*15.27*/("""
		andsTitle = ands.title
	""")))})),format.raw/*17.3*/("""
	andsTitle.replace(/\s+/g, '-').toLowerCase();
	console.log("ands title " + andsTitle);	

</script>

"""),_display_(Seq[Any](/*23.2*/main/*23.6*/ {_display_(Seq[Any](format.raw/*23.8*/("""
"""),_display_(Seq[Any](/*24.2*/for(r <- references) yield /*24.22*/ {_display_(Seq[Any](format.raw/*24.24*/("""
<ul class="breadcrumb">
  <li><i class="icon-home" ></i><a href="/"> UniCarbKB</a> <span class="divider">></span></li>
  <li><i class="icon-book" ></i><a href="/references"> References</a> <span class="divider">></span></li>
  <li class="active"><i class="icon-file" ></i> """),_display_(Seq[Any](/*28.50*/r/*28.51*/.authors)),format.raw/*28.59*/(""", """),_display_(Seq[Any](/*28.62*/r/*28.63*/.year)),format.raw/*28.68*/(""", """),_display_(Seq[Any](/*28.71*/r/*28.72*/.journal.name)),format.raw/*28.85*/("""<span class="divider"></span></li>
</ul>
""")))})),format.raw/*30.2*/("""
<section id="layouts">

  """),_display_(Seq[Any](/*33.4*/for(r <- references) yield /*33.24*/ {_display_(Seq[Any](format.raw/*33.26*/("""
  <div class="page-header row-fluid">
    <h1 class="">"""),_display_(Seq[Any](/*35.19*/r/*35.20*/.journal.name)),format.raw/*35.33*/(""", """),_display_(Seq[Any](/*35.36*/r/*35.37*/.year)),format.raw/*35.42*/("""</h1>
    <h4 class="subheader span8">Reference details <span class="pull-right"><span class="label label-light">Curated Entry</span> <span class="label label-light">GlycoSuiteDB</span></span></h4>
  </div>

  <div class="row-fluid">
    <div class="span8">

      <p><b>"""),_display_(Seq[Any](/*42.14*/title(r.title))),format.raw/*42.28*/("""</b></p>   	
      <p>PubMed Entry: <a href="http://www.ncbi.nlm.nih.gov/pubmed/"""),_display_(Seq[Any](/*43.69*/r/*43.70*/.pmid)),format.raw/*43.75*/("""">"""),_display_(Seq[Any](/*43.78*/r/*43.79*/.pmid)),format.raw/*43.84*/("""</a></p>
      <div class="mini-layout">
        <div class="mini-layout-body"></div>
      </div>
      <ul id="31" class="structures">
        """),_display_(Seq[Any](/*48.10*/for(s <- r.streference) yield /*48.33*/ {_display_(Seq[Any](format.raw/*48.35*/("""
        <li>
          """),_display_(Seq[Any](/*50.12*/views/*50.17*/.html.format.structure(notation, s.structure.id))),format.raw/*50.65*/("""
        </li>
        """)))})),format.raw/*52.10*/("""
      </ul>
    </div><!-- /col -->
    """)))})),format.raw/*55.6*/(""" 
    <div class="span4 sidebar">

      """),_display_(Seq[Any](/*58.8*/views/*58.13*/.html.format.format())),format.raw/*58.34*/("""

      <div class="info">
        <h3>Biological Associations</h3>
        <div class='taxonomy'>
          <a id='toggle-taxonomy'><span class='label label-important'><span class='icon-tags icon-white'></span> Taxonomy ("""),_display_(Seq[Any](/*63.125*/taxsources/*63.135*/.size())),format.raw/*63.142*/(""") <span class="caret"></span></span></a>
          <a id='toggle-protein'><span class='label label-warning'><span class='icon-map-marker icon-white'></span> Protein ("""),_display_(Seq[Any](/*64.127*/proteinsources/*64.141*/.size())),format.raw/*64.148*/(""") <span class="caret"></span></span></a>
        </div>

        <div>
          <ul id='more-taxonomy'>
            <h3 id='less-taxonomy'><span class='icon-tags icon-white'></span> Taxonomies</h3>
            """),_display_(Seq[Any](/*70.14*/for(tax <- taxsources) yield /*70.36*/{_display_(Seq[Any](format.raw/*70.37*/("""
            <li><span class='icon-tag icon-white'></span> <a href='../taxonomysearch?taxonomy="""),_display_(Seq[Any](/*71.96*/tax)),format.raw/*71.99*/("""'>"""),_display_(Seq[Any](/*71.102*/tax)),format.raw/*71.105*/("""</a></li>
            """)))})),format.raw/*72.14*/("""
          </ul>
          <ul id='more-protein'>
            <h3 id='less-protein'><span class='icon-map-marker icon-white'></span> Protein</h3>
            """),_display_(Seq[Any](/*76.14*/for(protein <- proteinsources) yield /*76.44*/{_display_(Seq[Any](format.raw/*76.45*/("""

		"""),_display_(Seq[Any](/*78.4*/if(protein.swiss_prot != null)/*78.34*/ {_display_(Seq[Any](format.raw/*78.36*/("""
           	 <li><span class='icon-map-marker icon-white'></span> <a href='/proteinsummary/"""),_display_(Seq[Any](/*79.93*/protein/*79.100*/.swiss_prot)),format.raw/*79.111*/("""/annotated'>"""),_display_(Seq[Any](/*79.124*/protein/*79.131*/.protein)),format.raw/*79.139*/(""", """),_display_(Seq[Any](/*79.142*/protein/*79.149*/.swiss_prot)),format.raw/*79.160*/("""</a></li>
		""")))})),format.raw/*80.4*/("""
		"""),_display_(Seq[Any](/*81.4*/if(protein.swiss_prot == null)/*81.34*/ {_display_(Seq[Any](format.raw/*81.36*/("""
                 <li><span class='icon-map-marker icon-white'></span> <a href="/proteinsummary/"""),_display_(Seq[Any](/*82.97*/protein/*82.104*/.protein)),format.raw/*82.112*/("""/"""),_display_(Seq[Any](/*82.114*/protein/*82.121*/.taxonomy)),format.raw/*82.130*/("""">"""),_display_(Seq[Any](/*82.133*/protein/*82.140*/.protein)),format.raw/*82.148*/("""</a></li>
                """)))})),format.raw/*83.18*/("""
		
            """)))})),format.raw/*85.14*/("""
          </ul>
        </div>

      </div>

      <div class="info">
        <h3>Validation Method</h3>
        """),_display_(Seq[Any](/*93.10*/for(methods <- refmethods) yield /*93.36*/ {_display_(Seq[Any](format.raw/*93.38*/("""
        """),_display_(Seq[Any](/*94.10*/for(rmethod <- methods.refmethod) yield /*94.43*/ {_display_(Seq[Any](format.raw/*94.45*/(""" <p>"""),_display_(Seq[Any](/*94.50*/rmethod/*94.57*/.method.description.toUpperCase())),format.raw/*94.90*/("""</p>
        """)))})),format.raw/*95.10*/("""
        """)))})),format.raw/*96.10*/("""

        """),_display_(Seq[Any](/*98.10*/for(methodsgp <- refmethodsgp) yield /*98.40*/ {_display_(Seq[Any](format.raw/*98.42*/("""
        """),_display_(Seq[Any](/*99.10*/for(rmethodgp <- methodsgp.refmethodgps) yield /*99.50*/ {_display_(Seq[Any](format.raw/*99.52*/(""" <p>"""),_display_(Seq[Any](/*99.57*/rmethodgp/*99.66*/.methodgp.description.toUpperCase())),format.raw/*99.101*/("""</p>
        """)))})),format.raw/*100.10*/("""
        """)))})),format.raw/*101.10*/("""
        
        
        <div class="mini-layout fluid">
          <div class="mini-layout-sidebar"></div>
          <div class="mini-layout-body"></div>
        </div>
      </div>
      
      <div class="info">
      	 <h3>Connections</h3>
      	 """),_display_(Seq[Any](/*112.10*/for(r <- references) yield /*112.30*/{_display_(Seq[Any](format.raw/*112.31*/("""
      	 <a href='http://researchdata.ands.org.au/"""),_display_(Seq[Any](/*113.51*/ands(r.title))),format.raw/*113.64*/("""'> Research Data Australia </a>
     	 """)))})),format.raw/*114.9*/("""
      </div>
    </div><!-- /col -->
  </div><!-- /row -->
  """),_display_(Seq[Any](/*118.4*/views/*118.9*/.html.footerunicarb.footerunicarb())),format.raw/*118.44*/("""
</section>



""")))})),format.raw/*123.2*/("""
"""))}
    }
    
    def render(notation:String,message:String,references:List[Reference],refmethods:List[Reference],taxsources:ArrayList[String],proteinsources:ArrayList[Biolsource],prot:ArrayList[String],refmethodsgp:List[Reference]): play.api.templates.HtmlFormat.Appendable = apply(notation,message,references,refmethods,taxsources,proteinsources,prot,refmethodsgp)
    
    def f:((String,String,List[Reference],List[Reference],ArrayList[String],ArrayList[Biolsource],ArrayList[String],List[Reference]) => play.api.templates.HtmlFormat.Appendable) = (notation,message,references,refmethods,taxsources,proteinsources,prot,refmethodsgp) => apply(notation,message,references,refmethods,taxsources,proteinsources,prot,refmethodsgp)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 02 18:00:09 EST 2014
                    SOURCE: /Users/matthew/git/glycomics_working/app/views/refdisplay.scala.html
                    HASH: fe8ecbb8877901a03d46ad010285d9c01c3da611
                    MATRIX: 892->1|1206->242|1218->247|1302->321|1313->325|1418->222|1445->240|1472->318|1501->399|1597->460|1636->483|1675->484|1734->512|1872->615|1884->619|1923->621|1960->623|1996->643|2036->645|2347->920|2357->921|2387->929|2426->932|2436->933|2463->938|2502->941|2512->942|2547->955|2620->997|2683->1025|2719->1045|2759->1047|2852->1104|2862->1105|2897->1118|2936->1121|2946->1122|2973->1127|3281->1399|3317->1413|3434->1494|3444->1495|3471->1500|3510->1503|3520->1504|3547->1509|3729->1655|3768->1678|3808->1680|3869->1705|3883->1710|3953->1758|4009->1782|4082->1824|4159->1866|4173->1871|4216->1892|4476->2115|4496->2125|4526->2132|4730->2299|4754->2313|4784->2320|5032->2532|5070->2554|5109->2555|5241->2651|5266->2654|5306->2657|5332->2660|5387->2683|5582->2842|5628->2872|5667->2873|5707->2878|5746->2908|5786->2910|5915->3003|5932->3010|5966->3021|6016->3034|6033->3041|6064->3049|6104->3052|6121->3059|6155->3070|6199->3083|6238->3087|6277->3117|6317->3119|6450->3216|6467->3223|6498->3231|6537->3233|6554->3240|6586->3249|6626->3252|6643->3259|6674->3267|6733->3294|6782->3311|6934->3427|6976->3453|7016->3455|7062->3465|7111->3498|7151->3500|7192->3505|7208->3512|7263->3545|7309->3559|7351->3569|7398->3580|7444->3610|7484->3612|7530->3622|7586->3662|7626->3664|7667->3669|7685->3678|7743->3713|7790->3727|7833->3737|8124->3991|8161->4011|8201->4012|8289->4063|8325->4076|8397->4116|8496->4179|8510->4184|8568->4219|8616->4235
                    LINES: 26->1|29->4|29->4|31->8|31->8|34->1|35->3|36->6|38->10|43->15|43->15|43->15|45->17|51->23|51->23|51->23|52->24|52->24|52->24|56->28|56->28|56->28|56->28|56->28|56->28|56->28|56->28|56->28|58->30|61->33|61->33|61->33|63->35|63->35|63->35|63->35|63->35|63->35|70->42|70->42|71->43|71->43|71->43|71->43|71->43|71->43|76->48|76->48|76->48|78->50|78->50|78->50|80->52|83->55|86->58|86->58|86->58|91->63|91->63|91->63|92->64|92->64|92->64|98->70|98->70|98->70|99->71|99->71|99->71|99->71|100->72|104->76|104->76|104->76|106->78|106->78|106->78|107->79|107->79|107->79|107->79|107->79|107->79|107->79|107->79|107->79|108->80|109->81|109->81|109->81|110->82|110->82|110->82|110->82|110->82|110->82|110->82|110->82|110->82|111->83|113->85|121->93|121->93|121->93|122->94|122->94|122->94|122->94|122->94|122->94|123->95|124->96|126->98|126->98|126->98|127->99|127->99|127->99|127->99|127->99|127->99|128->100|129->101|140->112|140->112|140->112|141->113|141->113|142->114|146->118|146->118|146->118|151->123
                    -- GENERATED --
                */
            