
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
object list extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template4[Page[Reference],String,String,String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(currentPage: Page[Reference], currentSortBy: String, currentOrder: String, currentFilter: String):play.api.templates.Html = {
        _display_ {
def /*32.2*/header/*32.8*/(key:String, title:String):play.api.templates.Html = {_display_(

Seq(format.raw/*32.38*/("""
    <th class=""""),_display_(Seq(/*33.17*/key/*33.20*/.replace(".","_"))),format.raw/*33.37*/(""" header """),_display_(Seq(/*33.46*/if(currentSortBy == key){/*33.72*/{if(currentOrder == "asc") "headerSortDown" else "headerSortUp"}})),format.raw/*33.136*/("""">
        <a href=""""),_display_(Seq(/*34.19*/link(0, key))),format.raw/*34.31*/("""">"""),_display_(Seq(/*34.34*/title)),format.raw/*34.39*/("""</a>
    </th>
""")))};def /*6.2*/link/*6.6*/(newPage:Int, newSortBy:String) = {{
    
    var sortBy = currentSortBy
    var order = currentOrder
    
    if(newSortBy != null) {
        sortBy = newSortBy
        if(currentSortBy == newSortBy) {
            if(currentOrder == "asc") {
                order = "desc"
            } else {
                order = "asc"
            }
        } else {
            order = "asc"
        }
    }
    
    // Generate the link
    routes.Application.list2(newPage, sortBy, order, currentFilter)
    
}};
Seq(format.raw/*1.100*/("""

"""),format.raw/*5.42*/("""
"""),format.raw/*27.2*/("""

"""),format.raw/*31.37*/("""
"""),format.raw/*36.2*/("""

"""),_display_(Seq(/*38.2*/main/*38.6*/ {_display_(Seq(format.raw/*38.8*/("""

  <ul class="breadcrumb">
    <li><i class="icon-home" ></i><a href="/"> UniCarbKB</a> <span class="divider">></span></li>
    <li class="active"><i class="icon-search" ></i> Reference Search <span class="divider"></span></li>
    <!--<li class="active" > You are here</li>-->
  </ul>
    
    <h1 id="homeTitle">"""),_display_(Seq(/*46.25*/Messages(" Reference Search ", currentPage.getTotalRowCount))),format.raw/*46.85*/("""</h1>
    <h4 class="subheader">Search the curated collection of publication data by author or title descriptions</h4>
    """),_display_(Seq(/*48.6*/if(flash.containsKey("success"))/*48.38*/ {_display_(Seq(format.raw/*48.40*/("""
        <div class="alert-message warning">
            <strong>Done!</strong> """),_display_(Seq(/*50.37*/flash/*50.42*/.get("success"))),format.raw/*50.57*/("""
        </div>
    """)))})),format.raw/*52.6*/(""" 

    <div id="actions">
 
        <form action=""""),_display_(Seq(/*56.24*/link(0, "name"))),format.raw/*56.39*/("""" method="GET">
            <input type="search" id="searchbox" name="f" value=""""),_display_(Seq(/*57.66*/currentFilter)),format.raw/*57.79*/("""" placeholder="Rference title or author name...">
            <input type="submit" id="searchsubmit" value="Filter" class="btn primary">
	    <a class="btn success" id="add" href="/references">Show All References</a>
        </form>
        
    </div>
    
    <div class="row-fluid">
    """),_display_(Seq(/*65.6*/if(currentPage.getTotalRowCount == 0)/*65.43*/ {_display_(Seq(format.raw/*65.45*/("""
        
        <div class="well">
            <em>Nothing to display</em>
        </div>
        
    """)))}/*71.7*/else/*71.12*/{_display_(Seq(format.raw/*71.13*/("""
        
        <table class="computers zebra-striped">
            <thead>
                <tr>
                    """),_display_(Seq(/*76.22*/header("title", "Title"))),format.raw/*76.46*/("""
                    """),_display_(Seq(/*77.22*/header("year", "Year"))),format.raw/*77.44*/("""
                    """),_display_(Seq(/*78.22*/header("authors", "Authors"))),format.raw/*78.50*/("""
                    """),_display_(Seq(/*79.22*/header("journal.name", "Journal"))),format.raw/*79.55*/("""
                    """),_display_(Seq(/*80.22*/header("streference.id", "Associated Glycans"))),format.raw/*80.68*/("""
                </tr>
            </thead>
            <tbody>

                """),_display_(Seq(/*85.18*/for(reference <- currentPage.getList) yield /*85.55*/ {_display_(Seq(format.raw/*85.57*/("""
                    <tr>
                        <td><a href="references/"""),_display_(Seq(/*87.50*/reference/*87.59*/.id)),format.raw/*87.62*/("""" style="text-decoration : none, font-color: #404040; ">"""),_display_(Seq(/*87.119*/reference/*87.128*/.title)),format.raw/*87.134*/("""</a></td>
                        <td>
                            """),_display_(Seq(/*89.30*/if(reference.year == null)/*89.56*/ {_display_(Seq(format.raw/*89.58*/("""
                                <em>-</em>
                            """)))}/*91.31*/else/*91.36*/{_display_(Seq(format.raw/*91.37*/("""
                                """),_display_(Seq(/*92.34*/reference/*92.43*/.year)),format.raw/*92.48*/("""
                            """)))})),format.raw/*93.30*/("""
                        </td>
                        <td>
                            """),_display_(Seq(/*96.30*/if(reference.authors == null)/*96.59*/ {_display_(Seq(format.raw/*96.61*/("""
                                <em>-</em>
                            """)))}/*98.31*/else/*98.36*/{_display_(Seq(format.raw/*98.37*/("""
                                """),_display_(Seq(/*99.34*/reference/*99.43*/.authors)),format.raw/*99.51*/("""
                            """)))})),format.raw/*100.30*/("""
                        </td>
                        <td>
                            """),_display_(Seq(/*103.30*/if(reference.journal == null)/*103.59*/ {_display_(Seq(format.raw/*103.61*/("""
                                <em>-</em>
                            """)))}/*105.31*/else/*105.36*/{_display_(Seq(format.raw/*105.37*/("""
                                """),_display_(Seq(/*106.34*/reference/*106.43*/.journal.name)),format.raw/*106.56*/("""
                            """)))})),format.raw/*107.30*/("""
                        </td>
			<td>
			   """),_display_(Seq(/*110.8*/reference/*110.17*/.streference.size())),format.raw/*110.36*/("""
			</td>
                    </tr>
                """)))})),format.raw/*113.18*/("""

            </tbody>
        </table>

        <div id="pagination" class="pagination">
            <ul class="clearfix">
              """),_display_(Seq(/*120.16*/if(currentPage.hasPrev)/*120.39*/ {_display_(Seq(format.raw/*120.41*/("""
                <li class="prev"><a href=""""),_display_(Seq(/*121.44*/link(currentPage.getPageIndex - 1, null))),format.raw/*121.84*/("""">&larr; Previous</a></li>
              """)))}/*122.17*/else/*122.22*/{_display_(Seq(format.raw/*122.23*/("""
                <li class="prev disabled"><a>&larr; Previous</a></li>
              """)))})),format.raw/*124.16*/("""
                <li class="current"><a>Displaying """),_display_(Seq(/*125.52*/currentPage/*125.63*/.getDisplayXtoYofZ(" to "," of "))),format.raw/*125.96*/("""</a></li>
              """),_display_(Seq(/*126.16*/if(currentPage.hasNext)/*126.39*/ {_display_(Seq(format.raw/*126.41*/("""
                <li class="next"><a href=""""),_display_(Seq(/*127.44*/link(currentPage.getPageIndex + 1, null))),format.raw/*127.84*/("""">Next &rarr;</a></li>
              """)))}/*128.17*/else/*128.22*/{_display_(Seq(format.raw/*128.23*/("""
                <li class="next disabled"><a>Next &rarr;</a></li>
              """)))})),format.raw/*130.16*/("""
            </ul>
        </div>
      </div>
        
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
    """)))})),format.raw/*145.6*/("""
        
""")))})),format.raw/*147.2*/("""

            
"""))}
    }
    
    def render(currentPage:Page[Reference],currentSortBy:String,currentOrder:String,currentFilter:String) = apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def f:((Page[Reference],String,String,String) => play.api.templates.Html) = (currentPage,currentSortBy,currentOrder,currentFilter) => apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Dec 18 08:54:51 EST 2012
                    SOURCE: /home/matthew/Documents/play-app/office/glycomics/app/views/list.scala.html
                    HASH: 22569538916709dfdf1f3f63cb580f04cd1c743e
                    MATRIX: 784->1|943->846|957->852|1046->882|1094->899|1106->902|1145->919|1185->928|1219->954|1307->1018|1359->1039|1393->1051|1427->1054|1454->1059|1492->228|1503->232|2031->99|2060->226|2088->734|2118->844|2146->1075|2179->1078|2191->1082|2225->1084|2572->1400|2654->1460|2808->1584|2849->1616|2884->1618|2996->1699|3010->1704|3047->1719|3099->1740|3181->1791|3218->1806|3330->1887|3365->1900|3686->2191|3732->2228|3767->2230|3891->2337|3904->2342|3938->2343|4089->2463|4135->2487|4188->2509|4232->2531|4285->2553|4335->2581|4388->2603|4443->2636|4496->2658|4564->2704|4677->2786|4730->2823|4765->2825|4871->2900|4889->2909|4914->2912|5003->2969|5022->2978|5051->2984|5150->3052|5185->3078|5220->3080|5312->3154|5325->3159|5359->3160|5424->3194|5442->3203|5469->3208|5531->3238|5651->3327|5689->3356|5724->3358|5816->3432|5829->3437|5863->3438|5928->3472|5946->3481|5976->3489|6039->3519|6160->3608|6199->3637|6235->3639|6328->3713|6342->3718|6377->3719|6443->3753|6462->3762|6498->3775|6561->3805|6638->3851|6657->3860|6699->3879|6785->3932|6956->4071|6989->4094|7025->4096|7101->4140|7164->4180|7226->4223|7240->4228|7275->4229|7394->4315|7478->4367|7499->4378|7555->4411|7612->4436|7645->4459|7681->4461|7757->4505|7820->4545|7878->4584|7892->4589|7927->4590|8042->4672|8529->5127|8572->5138
                    LINES: 27->1|29->32|29->32|31->32|32->33|32->33|32->33|32->33|32->33|32->33|33->34|33->34|33->34|33->34|35->6|35->6|57->1|59->5|60->27|62->31|63->36|65->38|65->38|65->38|73->46|73->46|75->48|75->48|75->48|77->50|77->50|77->50|79->52|83->56|83->56|84->57|84->57|92->65|92->65|92->65|98->71|98->71|98->71|103->76|103->76|104->77|104->77|105->78|105->78|106->79|106->79|107->80|107->80|112->85|112->85|112->85|114->87|114->87|114->87|114->87|114->87|114->87|116->89|116->89|116->89|118->91|118->91|118->91|119->92|119->92|119->92|120->93|123->96|123->96|123->96|125->98|125->98|125->98|126->99|126->99|126->99|127->100|130->103|130->103|130->103|132->105|132->105|132->105|133->106|133->106|133->106|134->107|137->110|137->110|137->110|140->113|147->120|147->120|147->120|148->121|148->121|149->122|149->122|149->122|151->124|152->125|152->125|152->125|153->126|153->126|153->126|154->127|154->127|155->128|155->128|155->128|157->130|172->145|174->147
                    -- GENERATED --
                */
            