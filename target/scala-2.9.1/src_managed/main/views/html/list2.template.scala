
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
object list2 extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template4[Page[Reference],String,String,String,play.api.templates.Html] {

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
    
    <h1 id="homeTitle">"""),_display_(Seq(/*40.25*/Messages("GlycoSuite Reference ", currentPage.getTotalRowCount))),format.raw/*40.88*/("""</h1>

    """),_display_(Seq(/*42.6*/if(flash.containsKey("success"))/*42.38*/ {_display_(Seq(format.raw/*42.40*/("""
        <div class="alert-message warning">
            <strong>Done!</strong> """),_display_(Seq(/*44.37*/flash/*44.42*/.get("success"))),format.raw/*44.57*/("""
        </div>
    """)))})),format.raw/*46.6*/(""" 

    <div id="actions">
        <form action=""""),_display_(Seq(/*49.24*/link(0, "name"))),format.raw/*49.39*/("""" method="GET">
            <input type="search" id="searchbox" name="f" value=""""),_display_(Seq(/*50.66*/currentFilter)),format.raw/*50.79*/("""" placeholder="Filter by reference title or author name...">
            <input type="submit" id="searchsubmit" value="Filter" class="btn primary">
        </form>
        
        <a class="btn success" id="add" href=""""),_display_(Seq(/*54.48*/routes/*54.54*/.Application.list2())),format.raw/*54.74*/("""">Show All References</a>  
        
    </div>
    
    """),_display_(Seq(/*58.6*/if(currentPage.getTotalRowCount == 0)/*58.43*/ {_display_(Seq(format.raw/*58.45*/("""
        
        <div class="well">
            <em>Nothing to display</em>
        </div>
        
    """)))}/*64.7*/else/*64.12*/{_display_(Seq(format.raw/*64.13*/("""
        
        <table class="computers zebra-striped">
            <thead>
                <tr>
                    """),_display_(Seq(/*69.22*/header("title", "Title"))),format.raw/*69.46*/("""
                    """),_display_(Seq(/*70.22*/header("year", "Year"))),format.raw/*70.44*/("""
                    """),_display_(Seq(/*71.22*/header("authors", "Authors"))),format.raw/*71.50*/("""
                    """),_display_(Seq(/*72.22*/header("journal.name", "Journalss"))),format.raw/*72.57*/("""
		    """),_display_(Seq(/*73.8*/header("strference.id", "Streference"))),format.raw/*73.46*/("""
                </tr>
            </thead>
            <tbody>

                """),_display_(Seq(/*78.18*/for(reference <- currentPage.getList) yield /*78.55*/ {_display_(Seq(format.raw/*78.57*/("""
                    <tr>
                        <td><a href="">"""),_display_(Seq(/*80.41*/reference/*80.50*/.title)),format.raw/*80.56*/("""</a></td>
                        <td>
                            """),_display_(Seq(/*82.30*/if(reference.year == null)/*82.56*/ {_display_(Seq(format.raw/*82.58*/("""
                                <em>-</em>
                            """)))}/*84.31*/else/*84.36*/{_display_(Seq(format.raw/*84.37*/("""
                                """),_display_(Seq(/*85.34*/reference/*85.43*/.year)),format.raw/*85.48*/("""
                            """)))})),format.raw/*86.30*/("""
                        </td>
                        <td>
                            """),_display_(Seq(/*89.30*/if(reference.authors == null)/*89.59*/ {_display_(Seq(format.raw/*89.61*/("""
                                <em>-</em>
                            """)))}/*91.31*/else/*91.36*/{_display_(Seq(format.raw/*91.37*/("""
                                """),_display_(Seq(/*92.34*/reference/*92.43*/.authors)),format.raw/*92.51*/("""
                            """)))})),format.raw/*93.30*/("""
                        </td>
                        <td>
                            """),_display_(Seq(/*96.30*/if(reference.journal == null)/*96.59*/ {_display_(Seq(format.raw/*96.61*/("""
                                <em>-</em>
                            """)))}/*98.31*/else/*98.36*/{_display_(Seq(format.raw/*98.37*/("""
                                """),_display_(Seq(/*99.34*/reference/*99.43*/.journal.name)),format.raw/*99.56*/("""
                            """)))})),format.raw/*100.30*/("""
                        </td>
                    </tr>
                """)))})),format.raw/*103.18*/("""

            </tbody>
        </table>

        <div id="pagination" class="pagination">
            <ul>
                """),_display_(Seq(/*110.18*/if(currentPage.hasPrev)/*110.41*/ {_display_(Seq(format.raw/*110.43*/("""
                    <li class="prev">
                        <a href=""""),_display_(Seq(/*112.35*/link(currentPage.getPageIndex - 1, null))),format.raw/*112.75*/("""">&larr; Previous</a>
                    </li>
                """)))}/*114.19*/else/*114.24*/{_display_(Seq(format.raw/*114.25*/("""
                    <li class="prev disabled">
                        <a>&larr; Previous</a>
                    </li>
                """)))})),format.raw/*118.18*/("""
                <li class="current">
                    <a>Displaying """),_display_(Seq(/*120.36*/currentPage/*120.47*/.getDisplayXtoYofZ(" to "," of "))),format.raw/*120.80*/("""</a>
                </li>
                """),_display_(Seq(/*122.18*/if(currentPage.hasNext)/*122.41*/ {_display_(Seq(format.raw/*122.43*/("""
                    <li class="next">
                        <a href=""""),_display_(Seq(/*124.35*/link(currentPage.getPageIndex + 1, null))),format.raw/*124.75*/("""">Next &rarr;</a>
                    </li>
                """)))}/*126.19*/else/*126.24*/{_display_(Seq(format.raw/*126.25*/("""
                    <li class="next disabled">
                        <a>Next &rarr;</a>
                    </li>
                """)))})),format.raw/*130.18*/("""
            </ul>
        </div>
        
    """)))})),format.raw/*134.6*/("""
        
""")))})),format.raw/*136.2*/("""

            
"""))}
    }
    
    def render(currentPage:Page[Reference],currentSortBy:String,currentOrder:String,currentFilter:String) = apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def f:((Page[Reference],String,String,String) => play.api.templates.Html) = (currentPage,currentSortBy,currentOrder,currentFilter) => apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jul 12 13:36:39 EST 2012
                    SOURCE: /home/matthew/Documents/play-app/tmp/computer-database/app/views/list2.scala.html
                    HASH: a7209bd454833864162d5ad3173c690ef0554080
                    MATRIX: 785->1|944->846|958->852|1047->882|1095->899|1107->902|1146->919|1186->928|1220->954|1308->1018|1360->1039|1394->1051|1428->1054|1455->1059|1493->228|1504->232|2032->99|2061->226|2089->734|2119->844|2147->1075|2180->1078|2192->1082|2226->1084|2287->1114|2372->1177|2414->1189|2455->1221|2490->1223|2602->1304|2616->1309|2653->1324|2705->1345|2785->1394|2822->1409|2934->1490|2969->1503|3220->1723|3235->1729|3277->1749|3365->1807|3411->1844|3446->1846|3570->1953|3583->1958|3617->1959|3768->2079|3814->2103|3867->2125|3911->2147|3964->2169|4014->2197|4067->2219|4124->2254|4162->2262|4222->2300|4335->2382|4388->2419|4423->2421|4520->2487|4538->2496|4566->2502|4665->2570|4700->2596|4735->2598|4827->2672|4840->2677|4874->2678|4939->2712|4957->2721|4984->2726|5046->2756|5166->2845|5204->2874|5239->2876|5331->2950|5344->2955|5378->2956|5443->2990|5461->2999|5491->3007|5553->3037|5673->3126|5711->3155|5746->3157|5838->3231|5851->3236|5885->3237|5950->3271|5968->3280|6003->3293|6066->3323|6173->3397|6329->3521|6362->3544|6398->3546|6503->3619|6566->3659|6651->3725|6665->3730|6700->3731|6871->3869|6976->3942|6997->3953|7053->3986|7129->4030|7162->4053|7198->4055|7303->4128|7366->4168|7447->4230|7461->4235|7496->4236|7663->4370|7743->4418|7786->4429
                    LINES: 27->1|29->32|29->32|31->32|32->33|32->33|32->33|32->33|32->33|32->33|33->34|33->34|33->34|33->34|35->6|35->6|57->1|59->5|60->27|62->31|63->36|65->38|65->38|65->38|67->40|67->40|69->42|69->42|69->42|71->44|71->44|71->44|73->46|76->49|76->49|77->50|77->50|81->54|81->54|81->54|85->58|85->58|85->58|91->64|91->64|91->64|96->69|96->69|97->70|97->70|98->71|98->71|99->72|99->72|100->73|100->73|105->78|105->78|105->78|107->80|107->80|107->80|109->82|109->82|109->82|111->84|111->84|111->84|112->85|112->85|112->85|113->86|116->89|116->89|116->89|118->91|118->91|118->91|119->92|119->92|119->92|120->93|123->96|123->96|123->96|125->98|125->98|125->98|126->99|126->99|126->99|127->100|130->103|137->110|137->110|137->110|139->112|139->112|141->114|141->114|141->114|145->118|147->120|147->120|147->120|149->122|149->122|149->122|151->124|151->124|153->126|153->126|153->126|157->130|161->134|163->136
                    -- GENERATED --
                */
            