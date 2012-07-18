
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
    
    <h1 id="homeTitle">"""),_display_(Seq(/*40.25*/Messages(" GlycoSuite Reference ", currentPage.getTotalRowCount))),format.raw/*40.89*/("""</h1>

    """),_display_(Seq(/*42.6*/if(flash.containsKey("success"))/*42.38*/ {_display_(Seq(format.raw/*42.40*/("""
        <div class="alert-message warning">
            <strong>Done!</strong> """),_display_(Seq(/*44.37*/flash/*44.42*/.get("success"))),format.raw/*44.57*/("""
        </div>
    """)))})),format.raw/*46.6*/(""" 

    <div id="actions">
 
        <form action=""""),_display_(Seq(/*50.24*/link(0, "name"))),format.raw/*50.39*/("""" method="GET">
            <input type="search" id="searchbox" name="f" value=""""),_display_(Seq(/*51.66*/currentFilter)),format.raw/*51.79*/("""" placeholder="Filter by reference title or author name...">
            <input type="submit" id="searchsubmit" value="Filter" class="btn primary">
        </form>
        
        <a class="btn success" id="add" href=""""),_display_(Seq(/*55.48*/routes/*55.54*/.Application.index())),format.raw/*55.74*/("""">Show All References</a>  
        
    </div>
    
    """),_display_(Seq(/*59.6*/if(currentPage.getTotalRowCount == 0)/*59.43*/ {_display_(Seq(format.raw/*59.45*/("""
        
        <div class="well">
            <em>Nothing to display</em>
        </div>
        
    """)))}/*65.7*/else/*65.12*/{_display_(Seq(format.raw/*65.13*/("""
        
        <table class="computers zebra-striped">
            <thead>
                <tr>
                    """),_display_(Seq(/*70.22*/header("title", "Title"))),format.raw/*70.46*/("""
                    """),_display_(Seq(/*71.22*/header("year", "Year"))),format.raw/*71.44*/("""
                    """),_display_(Seq(/*72.22*/header("authors", "Authors"))),format.raw/*72.50*/("""
                    """),_display_(Seq(/*73.22*/header("journal.name", "Journal"))),format.raw/*73.55*/("""
		    """),_display_(Seq(/*74.8*/header("streference.id", "Associated Glycans"))),format.raw/*74.54*/("""
                </tr>
            </thead>
            <tbody>

                """),_display_(Seq(/*79.18*/for(reference <- currentPage.getList) yield /*79.55*/ {_display_(Seq(format.raw/*79.57*/("""
                    <tr>
                        <td><a href="references/"""),_display_(Seq(/*81.50*/reference/*81.59*/.id)),format.raw/*81.62*/("""" style="text-decoration : none, font-color: #404040; ">"""),_display_(Seq(/*81.119*/reference/*81.128*/.title)),format.raw/*81.134*/("""</a></td>
                        <td>
                            """),_display_(Seq(/*83.30*/if(reference.year == null)/*83.56*/ {_display_(Seq(format.raw/*83.58*/("""
                                <em>-</em>
                            """)))}/*85.31*/else/*85.36*/{_display_(Seq(format.raw/*85.37*/("""
                                """),_display_(Seq(/*86.34*/reference/*86.43*/.year)),format.raw/*86.48*/("""
                            """)))})),format.raw/*87.30*/("""
                        </td>
                        <td>
                            """),_display_(Seq(/*90.30*/if(reference.authors == null)/*90.59*/ {_display_(Seq(format.raw/*90.61*/("""
                                <em>-</em>
                            """)))}/*92.31*/else/*92.36*/{_display_(Seq(format.raw/*92.37*/("""
                                """),_display_(Seq(/*93.34*/reference/*93.43*/.authors)),format.raw/*93.51*/("""
                            """)))})),format.raw/*94.30*/("""
                        </td>
                        <td>
                            """),_display_(Seq(/*97.30*/if(reference.journal == null)/*97.59*/ {_display_(Seq(format.raw/*97.61*/("""
                                <em>-</em>
                            """)))}/*99.31*/else/*99.36*/{_display_(Seq(format.raw/*99.37*/("""
                                """),_display_(Seq(/*100.34*/reference/*100.43*/.journal.name)),format.raw/*100.56*/("""
                            """)))})),format.raw/*101.30*/("""
                        </td>
			<td>
			   """),_display_(Seq(/*104.8*/reference/*104.17*/.streference.size())),format.raw/*104.36*/("""
			</td>
                    </tr>
                """)))})),format.raw/*107.18*/("""

            </tbody>
        </table>

        <div id="pagination" class="pagination">
            <ul>
                """),_display_(Seq(/*114.18*/if(currentPage.hasPrev)/*114.41*/ {_display_(Seq(format.raw/*114.43*/("""
                    <li class="prev">
                        <a href=""""),_display_(Seq(/*116.35*/link(currentPage.getPageIndex - 1, null))),format.raw/*116.75*/("""">&larr; Previous</a>
                    </li>
                """)))}/*118.19*/else/*118.24*/{_display_(Seq(format.raw/*118.25*/("""
                    <li class="prev disabled">
                        <a>&larr; Previous</a>
                    </li>
                """)))})),format.raw/*122.18*/("""
                <li class="current">
                    <a>Displaying """),_display_(Seq(/*124.36*/currentPage/*124.47*/.getDisplayXtoYofZ(" to "," of "))),format.raw/*124.80*/("""</a>
                </li>
                """),_display_(Seq(/*126.18*/if(currentPage.hasNext)/*126.41*/ {_display_(Seq(format.raw/*126.43*/("""
                    <li class="next">
                        <a href=""""),_display_(Seq(/*128.35*/link(currentPage.getPageIndex + 1, null))),format.raw/*128.75*/("""">Next &rarr;</a>
                    </li>
                """)))}/*130.19*/else/*130.24*/{_display_(Seq(format.raw/*130.25*/("""
                    <li class="next disabled">
                        <a>Next &rarr;</a>
                    </li>
                """)))})),format.raw/*134.18*/("""
            </ul>
        </div>
        
    """)))})),format.raw/*138.6*/("""
        
""")))})),format.raw/*140.2*/("""

            
"""))}
    }
    
    def render(currentPage:Page[Reference],currentSortBy:String,currentOrder:String,currentFilter:String) = apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def f:((Page[Reference],String,String,String) => play.api.templates.Html) = (currentPage,currentSortBy,currentOrder,currentFilter) => apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jul 12 13:36:39 EST 2012
                    SOURCE: /home/matthew/Documents/play-app/tmp/computer-database/app/views/list.scala.html
                    HASH: 1b207cf3a31da26d226d93bbfe07c9c9479882e3
                    MATRIX: 784->1|943->846|957->852|1046->882|1094->899|1106->902|1145->919|1185->928|1219->954|1307->1018|1359->1039|1393->1051|1427->1054|1454->1059|1492->228|1503->232|2031->99|2060->226|2088->734|2118->844|2146->1075|2179->1078|2191->1082|2225->1084|2286->1114|2372->1178|2414->1190|2455->1222|2490->1224|2602->1305|2616->1310|2653->1325|2705->1346|2787->1397|2824->1412|2936->1493|2971->1506|3222->1726|3237->1732|3279->1752|3367->1810|3413->1847|3448->1849|3572->1956|3585->1961|3619->1962|3770->2082|3816->2106|3869->2128|3913->2150|3966->2172|4016->2200|4069->2222|4124->2255|4162->2263|4230->2309|4343->2391|4396->2428|4431->2430|4537->2505|4555->2514|4580->2517|4669->2574|4688->2583|4717->2589|4816->2657|4851->2683|4886->2685|4978->2759|4991->2764|5025->2765|5090->2799|5108->2808|5135->2813|5197->2843|5317->2932|5355->2961|5390->2963|5482->3037|5495->3042|5529->3043|5594->3077|5612->3086|5642->3094|5704->3124|5824->3213|5862->3242|5897->3244|5989->3318|6002->3323|6036->3324|6102->3358|6121->3367|6157->3380|6220->3410|6297->3456|6316->3465|6358->3484|6444->3537|6600->3661|6633->3684|6669->3686|6774->3759|6837->3799|6922->3865|6936->3870|6971->3871|7142->4009|7247->4082|7268->4093|7324->4126|7400->4170|7433->4193|7469->4195|7574->4268|7637->4308|7718->4370|7732->4375|7767->4376|7934->4510|8014->4558|8057->4569
                    LINES: 27->1|29->32|29->32|31->32|32->33|32->33|32->33|32->33|32->33|32->33|33->34|33->34|33->34|33->34|35->6|35->6|57->1|59->5|60->27|62->31|63->36|65->38|65->38|65->38|67->40|67->40|69->42|69->42|69->42|71->44|71->44|71->44|73->46|77->50|77->50|78->51|78->51|82->55|82->55|82->55|86->59|86->59|86->59|92->65|92->65|92->65|97->70|97->70|98->71|98->71|99->72|99->72|100->73|100->73|101->74|101->74|106->79|106->79|106->79|108->81|108->81|108->81|108->81|108->81|108->81|110->83|110->83|110->83|112->85|112->85|112->85|113->86|113->86|113->86|114->87|117->90|117->90|117->90|119->92|119->92|119->92|120->93|120->93|120->93|121->94|124->97|124->97|124->97|126->99|126->99|126->99|127->100|127->100|127->100|128->101|131->104|131->104|131->104|134->107|141->114|141->114|141->114|143->116|143->116|145->118|145->118|145->118|149->122|151->124|151->124|151->124|153->126|153->126|153->126|155->128|155->128|157->130|157->130|157->130|161->134|165->138|167->140
                    -- GENERATED --
                */
            