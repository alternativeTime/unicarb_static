
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
object list2 extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[com.avaje.ebean.Page[Reference],String,String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(currentPage: com.avaje.ebean.Page[Reference], currentSortBy: String, currentOrder: String, currentFilter: String, proteinFilter: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*32.2*/header/*32.8*/(key:String, title:String):play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*32.38*/("""
    <th class=""""),_display_(Seq[Any](/*33.17*/key/*33.20*/.replace(".","_"))),format.raw/*33.37*/(""" header """),_display_(Seq[Any](/*33.46*/if(currentSortBy == key){/*33.72*/{if(currentOrder == "asc") "headerSortDown" else "headerSortUp"}})),format.raw/*33.136*/("""">
        <a href=""""),_display_(Seq[Any](/*34.19*/link(0, key))),format.raw/*34.31*/("""">"""),_display_(Seq[Any](/*34.34*/title)),format.raw/*34.39*/("""</a>
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
Seq[Any](format.raw/*1.139*/("""

"""),format.raw/*5.42*/("""
"""),format.raw/*27.2*/("""

"""),format.raw/*31.37*/("""
"""),format.raw/*36.2*/("""

"""),_display_(Seq[Any](/*38.2*/main/*38.6*/ {_display_(Seq[Any](format.raw/*38.8*/("""
    
    <h1 id="homeTitle">"""),_display_(Seq[Any](/*40.25*/Messages("GlycoSuite Reference ", currentPage.getTotalRowCount))),format.raw/*40.88*/("""</h1>

    """),_display_(Seq[Any](/*42.6*/if(flash.containsKey("success"))/*42.38*/ {_display_(Seq[Any](format.raw/*42.40*/("""
        <div class="alert-message warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*44.37*/flash/*44.42*/.get("success"))),format.raw/*44.57*/("""
        </div>
    """)))})),format.raw/*46.6*/(""" 

    <div id="actions">
        <form action=""""),_display_(Seq[Any](/*49.24*/link(0, "name"))),format.raw/*49.39*/("""" method="GET">
            <input type="search" id="searchbox" name="f" value=""""),_display_(Seq[Any](/*50.66*/currentFilter)),format.raw/*50.79*/("""" placeholder="Filter by reference title or author name...">
            <input type="submit" id="searchsubmit" value="Filter" class="btn primary">
        </form>
        
        """),format.raw/*54.105*/("""
	<a class="btn success" id="add" href="/references?s=authors">Show All References</a>  
        
    </div>
    
    """),_display_(Seq[Any](/*59.6*/if(currentPage.getTotalRowCount == 0)/*59.43*/ {_display_(Seq[Any](format.raw/*59.45*/("""
        
        <div class="well">
            <em>Nothing to display</em>
        </div>
        
    """)))}/*65.7*/else/*65.12*/{_display_(Seq[Any](format.raw/*65.13*/("""
        
        <table class="computers zebra-striped">
            <thead>
                <tr>
                    """),_display_(Seq[Any](/*70.22*/header("title", "Title"))),format.raw/*70.46*/("""
                    """),_display_(Seq[Any](/*71.22*/header("year", "Year"))),format.raw/*71.44*/("""
                    """),_display_(Seq[Any](/*72.22*/header("authors", "Authors"))),format.raw/*72.50*/("""
                    """),_display_(Seq[Any](/*73.22*/header("journal.name", "Journalss"))),format.raw/*73.57*/("""
		    """),_display_(Seq[Any](/*74.8*/header("strference.id", "Streference"))),format.raw/*74.46*/("""
                </tr>
            </thead>
            <tbody>

                """),_display_(Seq[Any](/*79.18*/for(reference <- currentPage.getList) yield /*79.55*/ {_display_(Seq[Any](format.raw/*79.57*/("""
                    <tr>
                        <td><a href="">"""),_display_(Seq[Any](/*81.41*/reference/*81.50*/.title)),format.raw/*81.56*/("""</a></td>
                        <td>
                            """),_display_(Seq[Any](/*83.30*/if(reference.year < 1)/*83.52*/ {_display_(Seq[Any](format.raw/*83.54*/("""
                                <em>-</em>
                            """)))}/*85.31*/else/*85.36*/{_display_(Seq[Any](format.raw/*85.37*/("""
                                """),_display_(Seq[Any](/*86.34*/reference/*86.43*/.year)),format.raw/*86.48*/("""
                            """)))})),format.raw/*87.30*/("""
                        </td>
                        <td>
                            """),_display_(Seq[Any](/*90.30*/if(reference.authors == null)/*90.59*/ {_display_(Seq[Any](format.raw/*90.61*/("""
                                <em>-</em>
                            """)))}/*92.31*/else/*92.36*/{_display_(Seq[Any](format.raw/*92.37*/("""
                                """),_display_(Seq[Any](/*93.34*/reference/*93.43*/.authors)),format.raw/*93.51*/("""
                            """)))})),format.raw/*94.30*/("""
                        </td>
                        <td>
                            """),_display_(Seq[Any](/*97.30*/if(reference.journal == null)/*97.59*/ {_display_(Seq[Any](format.raw/*97.61*/("""
                                <em>-</em>
                            """)))}/*99.31*/else/*99.36*/{_display_(Seq[Any](format.raw/*99.37*/("""
                                """),_display_(Seq[Any](/*100.34*/reference/*100.43*/.journal.name)),format.raw/*100.56*/("""
                            """)))})),format.raw/*101.30*/("""
                        </td>
                    </tr>
                """)))})),format.raw/*104.18*/("""

            </tbody>
        </table>

        <div id="pagination" class="pagination">
            <ul>
                """),_display_(Seq[Any](/*111.18*/if(currentPage.hasPrev)/*111.41*/ {_display_(Seq[Any](format.raw/*111.43*/("""
                    <li class="prev">
                        <a href=""""),_display_(Seq[Any](/*113.35*/link(currentPage.getPageIndex - 1, null))),format.raw/*113.75*/("""">&larr; Previous</a>
                    </li>
                """)))}/*115.19*/else/*115.24*/{_display_(Seq[Any](format.raw/*115.25*/("""
                    <li class="prev disabled">
                        <a>&larr; Previous</a>
                    </li>
                """)))})),format.raw/*119.18*/("""
                <li class="current">
                    <a>Displaying """),_display_(Seq[Any](/*121.36*/currentPage/*121.47*/.getDisplayXtoYofZ(" to "," of "))),format.raw/*121.80*/("""</a>
                </li>
                """),_display_(Seq[Any](/*123.18*/if(currentPage.hasNext)/*123.41*/ {_display_(Seq[Any](format.raw/*123.43*/("""
                    <li class="next">
                        <a href=""""),_display_(Seq[Any](/*125.35*/link(currentPage.getPageIndex + 1, null))),format.raw/*125.75*/("""">Next &rarr;</a>
                    </li>
                """)))}/*127.19*/else/*127.24*/{_display_(Seq[Any](format.raw/*127.25*/("""
                    <li class="next disabled">
                        <a>Next &rarr;</a>
                    </li>
                """)))})),format.raw/*131.18*/("""
            </ul>
        </div>
        
    """)))})),format.raw/*135.6*/("""
        
""")))})),format.raw/*137.2*/("""

            
"""))}
    }
    
    def render(currentPage:com.avaje.ebean.Page[Reference],currentSortBy:String,currentOrder:String,currentFilter:String,proteinFilter:String): play.api.templates.HtmlFormat.Appendable = apply(currentPage,currentSortBy,currentOrder,currentFilter,proteinFilter)
    
    def f:((com.avaje.ebean.Page[Reference],String,String,String,String) => play.api.templates.HtmlFormat.Appendable) = (currentPage,currentSortBy,currentOrder,currentFilter,proteinFilter) => apply(currentPage,currentSortBy,currentOrder,currentFilter,proteinFilter)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 02 10:52:56 EST 2014
                    SOURCE: /Users/matthew/git/glycomics_working/app/views/list2.scala.html
                    HASH: ab84dcb5ec59a44bd2fb183c2f90a77bcbbdc37c
                    MATRIX: 827->1|1042->885|1056->891|1167->921|1220->938|1232->941|1271->958|1316->967|1350->993|1438->1057|1495->1078|1529->1090|1568->1093|1595->1098|1633->267|1644->271|2177->138|2206->265|2234->773|2264->883|2292->1114|2330->1117|2342->1121|2381->1123|2447->1153|2532->1216|2579->1228|2620->1260|2660->1262|2777->1343|2791->1348|2828->1363|2880->1384|2965->1433|3002->1448|3119->1529|3154->1542|3364->1819|3518->1938|3564->1975|3604->1977|3728->2084|3741->2089|3780->2090|3936->2210|3982->2234|4040->2256|4084->2278|4142->2300|4192->2328|4250->2350|4307->2385|4350->2393|4410->2431|4528->2513|4581->2550|4621->2552|4723->2618|4741->2627|4769->2633|4873->2701|4904->2723|4944->2725|5036->2799|5049->2804|5088->2805|5158->2839|5176->2848|5203->2853|5265->2883|5390->2972|5428->3001|5468->3003|5560->3077|5573->3082|5612->3083|5682->3117|5700->3126|5730->3134|5792->3164|5917->3253|5955->3282|5995->3284|6087->3358|6100->3363|6139->3364|6210->3398|6229->3407|6265->3420|6328->3450|6435->3524|6596->3648|6629->3671|6670->3673|6780->3746|6843->3786|6928->3852|6942->3857|6982->3858|7153->3996|7263->4069|7284->4080|7340->4113|7421->4157|7454->4180|7495->4182|7605->4255|7668->4295|7749->4357|7763->4362|7803->4363|7970->4497|8050->4545|8093->4556
                    LINES: 26->1|28->32|28->32|30->32|31->33|31->33|31->33|31->33|31->33|31->33|32->34|32->34|32->34|32->34|34->6|34->6|56->1|58->5|59->27|61->31|62->36|64->38|64->38|64->38|66->40|66->40|68->42|68->42|68->42|70->44|70->44|70->44|72->46|75->49|75->49|76->50|76->50|80->54|85->59|85->59|85->59|91->65|91->65|91->65|96->70|96->70|97->71|97->71|98->72|98->72|99->73|99->73|100->74|100->74|105->79|105->79|105->79|107->81|107->81|107->81|109->83|109->83|109->83|111->85|111->85|111->85|112->86|112->86|112->86|113->87|116->90|116->90|116->90|118->92|118->92|118->92|119->93|119->93|119->93|120->94|123->97|123->97|123->97|125->99|125->99|125->99|126->100|126->100|126->100|127->101|130->104|137->111|137->111|137->111|139->113|139->113|141->115|141->115|141->115|145->119|147->121|147->121|147->121|149->123|149->123|149->123|151->125|151->125|153->127|153->127|153->127|157->131|161->135|163->137
                    -- GENERATED --
                */
            