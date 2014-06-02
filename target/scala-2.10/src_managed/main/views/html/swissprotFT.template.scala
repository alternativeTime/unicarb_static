
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
object swissprotFT extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[HashSet[Reference],String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(ft: HashSet[Reference], car: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.39*/("""


"""),_display_(Seq[Any](/*4.2*/main/*4.6*/ {_display_(Seq[Any](format.raw/*4.8*/("""

  <ul class="breadcrumb">
    <li><i class="icon-home" ></i><a href="/"> UniCarbKB</a> <span class="divider">></span></li>
    <li class="active"><i class="icon-book" ></i> SwissProt<span class="divider"></span></li>
    <!--<li class="active" > You are here</li>-->
  </ul>

  <section id="layouts">

    <div class="page-header row-fluid">
      <h1 id="homeTitle">"""),_display_(Seq[Any](/*15.27*/Messages(" UniProtKB/Swiss-Prot Feature Table "))),format.raw/*15.75*/("""</h1>
      <h4 class="subheader"> Feature Table Link for """),_display_(Seq[Any](/*16.54*/car)),format.raw/*16.57*/(""" </h4>
    </div>

    <table class="computers table table-striped">

      <thead>
        <tr>
          <th>Title</th>
          <th>Year</th>
          <th>Authors</th>
          <th>Journal</th>
          <th>Associated Glycans</th>
        </tr>
      </thead>

      <tbody>
        """),_display_(Seq[Any](/*32.10*/for(reference <- ft) yield /*32.30*/ {_display_(Seq[Any](format.raw/*32.32*/("""
        <tr>
          <td><a href="references/"""),_display_(Seq[Any](/*34.36*/reference/*34.45*/.id)),format.raw/*34.48*/("""" style="text-decoration : none, font-color: #404040; ">"""),_display_(Seq[Any](/*34.105*/reference/*34.114*/.title)),format.raw/*34.120*/("""</a></td>
          <td>
            """),_display_(Seq[Any](/*36.14*/if(reference.year < 1)/*36.36*/ {_display_(Seq[Any](format.raw/*36.38*/("""
            <em>-</em>
            """)))}/*38.15*/else/*38.20*/{_display_(Seq[Any](format.raw/*38.21*/("""
            """),_display_(Seq[Any](/*39.14*/reference/*39.23*/.year)),format.raw/*39.28*/("""
            """)))})),format.raw/*40.14*/("""
          </td>
          <td>
            """),_display_(Seq[Any](/*43.14*/if(reference.authors == null)/*43.43*/ {_display_(Seq[Any](format.raw/*43.45*/("""
            <em>-</em>
            """)))}/*45.15*/else/*45.20*/{_display_(Seq[Any](format.raw/*45.21*/("""
            """),_display_(Seq[Any](/*46.14*/reference/*46.23*/.authors)),format.raw/*46.31*/("""
            """)))})),format.raw/*47.14*/("""
          </td>
          <td>
            """),_display_(Seq[Any](/*50.14*/if(reference.journal == null)/*50.43*/ {_display_(Seq[Any](format.raw/*50.45*/("""
            <em>-</em>
            """)))}/*52.15*/else/*52.20*/{_display_(Seq[Any](format.raw/*52.21*/("""
            """),_display_(Seq[Any](/*53.14*/reference/*53.23*/.journal.name)),format.raw/*53.36*/("""                            """)))})),format.raw/*53.65*/("""
          </td>
          <td>
            """),_display_(Seq[Any](/*56.14*/reference/*56.23*/.streference.size())),format.raw/*56.42*/("""
          </td>
        </tr>
        """)))})),format.raw/*59.10*/("""

      </tbody>
    </table>

    """),_display_(Seq[Any](/*64.6*/views/*64.11*/.html.footerunicarb.footerunicarb())),format.raw/*64.46*/("""    

  </section>

  """)))})),format.raw/*68.4*/("""


"""))}
    }
    
    def render(ft:HashSet[Reference],car:String): play.api.templates.HtmlFormat.Appendable = apply(ft,car)
    
    def f:((HashSet[Reference],String) => play.api.templates.HtmlFormat.Appendable) = (ft,car) => apply(ft,car)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 02 10:52:57 EST 2014
                    SOURCE: /Users/matthew/git/glycomics_working/app/views/swissprotFT.scala.html
                    HASH: d9f55501824067d8dd1ba32a586d061d48fa37d8
                    MATRIX: 799->1|930->38|968->42|979->46|1017->48|1423->418|1493->466|1588->525|1613->528|1940->819|1976->839|2016->841|2101->890|2119->899|2144->902|2238->959|2257->968|2286->974|2360->1012|2391->1034|2431->1036|2487->1074|2500->1079|2539->1080|2589->1094|2607->1103|2634->1108|2680->1122|2761->1167|2799->1196|2839->1198|2895->1236|2908->1241|2947->1242|2997->1256|3015->1265|3045->1273|3091->1287|3172->1332|3210->1361|3250->1363|3306->1401|3319->1406|3358->1407|3408->1421|3426->1430|3461->1443|3522->1472|3603->1517|3621->1526|3662->1545|3734->1585|3805->1621|3819->1626|3876->1661|3930->1684
                    LINES: 26->1|29->1|32->4|32->4|32->4|43->15|43->15|44->16|44->16|60->32|60->32|60->32|62->34|62->34|62->34|62->34|62->34|62->34|64->36|64->36|64->36|66->38|66->38|66->38|67->39|67->39|67->39|68->40|71->43|71->43|71->43|73->45|73->45|73->45|74->46|74->46|74->46|75->47|78->50|78->50|78->50|80->52|80->52|80->52|81->53|81->53|81->53|81->53|84->56|84->56|84->56|87->59|92->64|92->64|92->64|96->68
                    -- GENERATED --
                */
            