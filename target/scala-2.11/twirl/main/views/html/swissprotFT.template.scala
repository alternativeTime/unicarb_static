
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

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
object swissprotFT extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[HashSet[Reference],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(ft: HashSet[Reference], car: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.39*/("""


"""),_display_(/*4.2*/main/*4.6*/ {_display_(Seq[Any](format.raw/*4.8*/("""

  """),format.raw/*6.3*/("""<ul class="breadcrumb">
    <li><i class="icon-home" ></i><a href="/"> UniCarbKB</a> <span class="divider">></span></li>
    <li class="active"><i class="icon-book" ></i> SwissProt<span class="divider"></span></li>
    <!--<li class="active" > You are here</li>-->
  </ul>

  <section id="layouts">

    <div class="page-header row-fluid">
      <h1 id="homeTitle">"""),_display_(/*15.27*/Messages(" UniProtKB/Swiss-Prot Feature Table ")),format.raw/*15.75*/("""</h1>
      <h4 class="subheader"> Feature Table Link for """),_display_(/*16.54*/car),format.raw/*16.57*/(""" """),format.raw/*16.58*/("""</h4>
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
        """),_display_(/*32.10*/for(reference <- ft) yield /*32.30*/ {_display_(Seq[Any](format.raw/*32.32*/("""
        """),format.raw/*33.9*/("""<tr>
          <td><a href="references/"""),_display_(/*34.36*/reference/*34.45*/.id),format.raw/*34.48*/("""" style="text-decoration : none, font-color: #404040; ">"""),_display_(/*34.105*/reference/*34.114*/.title),format.raw/*34.120*/("""</a></td>
          <td>
            """),_display_(/*36.14*/if(reference.year < 1)/*36.36*/ {_display_(Seq[Any](format.raw/*36.38*/("""
            """),format.raw/*37.13*/("""<em>-</em>
            """)))}/*38.15*/else/*38.20*/{_display_(Seq[Any](format.raw/*38.21*/("""
            """),_display_(/*39.14*/reference/*39.23*/.year),format.raw/*39.28*/("""
            """)))}),format.raw/*40.14*/("""
          """),format.raw/*41.11*/("""</td>
          <td>
            """),_display_(/*43.14*/if(reference.authors == null)/*43.43*/ {_display_(Seq[Any](format.raw/*43.45*/("""
            """),format.raw/*44.13*/("""<em>-</em>
            """)))}/*45.15*/else/*45.20*/{_display_(Seq[Any](format.raw/*45.21*/("""
            """),_display_(/*46.14*/reference/*46.23*/.authors),format.raw/*46.31*/("""
            """)))}),format.raw/*47.14*/("""
          """),format.raw/*48.11*/("""</td>
          <td>
            """),_display_(/*50.14*/if(reference.journal == null)/*50.43*/ {_display_(Seq[Any](format.raw/*50.45*/("""
            """),format.raw/*51.13*/("""<em>-</em>
            """)))}/*52.15*/else/*52.20*/{_display_(Seq[Any](format.raw/*52.21*/("""
            """),_display_(/*53.14*/reference/*53.23*/.journal.name),format.raw/*53.36*/("""                            """)))}),format.raw/*53.65*/("""
          """),format.raw/*54.11*/("""</td>
          <td>
            """),_display_(/*56.14*/reference/*56.23*/.streference.size()),format.raw/*56.42*/("""
          """),format.raw/*57.11*/("""</td>
        </tr>
        """)))}),format.raw/*59.10*/("""

      """),format.raw/*61.7*/("""</tbody>
    </table>

    """),_display_(/*64.6*/views/*64.11*/.html.footerunicarb.footerunicarb()),format.raw/*64.46*/("""    

  """),format.raw/*66.3*/("""</section>

  """)))}),format.raw/*68.4*/("""


"""))}
  }

  def render(ft:HashSet[Reference],car:String): play.twirl.api.HtmlFormat.Appendable = apply(ft,car)

  def f:((HashSet[Reference],String) => play.twirl.api.HtmlFormat.Appendable) = (ft,car) => apply(ft,car)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Nov 14 15:46:55 EST 2014
                  SOURCE: /Users/matthew/playframework/glycomics_again/glycomics/app/views/swissprotFT.scala.html
                  HASH: 78d71376349a04039420edf30e5405a71689d36b
                  MATRIX: 748->1|873->38|902->42|913->46|951->48|981->52|1374->418|1443->466|1529->525|1553->528|1582->529|1899->819|1935->839|1975->841|2011->850|2078->890|2096->899|2120->902|2205->959|2224->968|2252->974|2317->1012|2348->1034|2388->1036|2429->1049|2472->1074|2485->1079|2524->1080|2565->1094|2583->1103|2609->1108|2654->1122|2693->1133|2754->1167|2792->1196|2832->1198|2873->1211|2916->1236|2929->1241|2968->1242|3009->1256|3027->1265|3056->1273|3101->1287|3140->1298|3201->1332|3239->1361|3279->1363|3320->1376|3363->1401|3376->1406|3415->1407|3456->1421|3474->1430|3508->1443|3568->1472|3607->1483|3668->1517|3686->1526|3726->1545|3765->1556|3825->1585|3860->1593|3914->1621|3928->1626|3984->1661|4019->1669|4064->1684
                  LINES: 26->1|29->1|32->4|32->4|32->4|34->6|43->15|43->15|44->16|44->16|44->16|60->32|60->32|60->32|61->33|62->34|62->34|62->34|62->34|62->34|62->34|64->36|64->36|64->36|65->37|66->38|66->38|66->38|67->39|67->39|67->39|68->40|69->41|71->43|71->43|71->43|72->44|73->45|73->45|73->45|74->46|74->46|74->46|75->47|76->48|78->50|78->50|78->50|79->51|80->52|80->52|80->52|81->53|81->53|81->53|81->53|82->54|84->56|84->56|84->56|85->57|87->59|89->61|92->64|92->64|92->64|94->66|96->68
                  -- GENERATED --
              */
          