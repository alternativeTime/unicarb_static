
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
object unicarb extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template4[Page[Unicarbdbreference],String,String,String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(currentPage: Page[Unicarbdbreference], currentSortBy: String, currentOrder: String, currentFilter: String):play.api.templates.Html = {
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
Seq(format.raw/*1.109*/("""

"""),format.raw/*5.42*/("""
"""),format.raw/*27.2*/("""

"""),format.raw/*31.37*/("""
"""),format.raw/*36.2*/("""

"""),_display_(Seq(/*38.2*/main/*38.6*/ {_display_(Seq(format.raw/*38.8*/("""
    
    <h1 id="homeTitle">"""),_display_(Seq(/*40.25*/Messages("Reference - UniCarb-DB", currentPage.getTotalRowCount))),format.raw/*40.89*/("""</h1>

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
        
        <a class="btn success" id="add" href=""""),_display_(Seq(/*54.48*/routes/*54.54*/.Application.unicarb())),format.raw/*54.76*/("""">Show All References</a>
	<a class="btn success" id="add" href=""""),_display_(Seq(/*55.41*/routes/*55.47*/.Application.list2())),format.raw/*55.67*/("""">GlycoSuite References</a>  
        
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
		    """),_display_(Seq(/*74.8*/header("strference.id", "Glycan Structures"))),format.raw/*74.52*/("""
                </tr>
            </thead>
            <tbody>

                """),_display_(Seq(/*79.18*/for(reference <- currentPage.getList) yield /*79.55*/ {_display_(Seq(format.raw/*79.57*/("""
                    <tr>
                        <td><a href="">"""),_display_(Seq(/*81.41*/reference/*81.50*/.title)),format.raw/*81.56*/("""</a></td>
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
                          	"""),_display_(Seq(/*104.29*/reference/*104.38*/.lcmucin.size())),format.raw/*104.53*/(""" 
                        </td>

                    </tr>
                """)))})),format.raw/*108.18*/("""

            </tbody>
        </table>

        <div id="pagination" class="pagination">
            <ul>
                """),_display_(Seq(/*115.18*/if(currentPage.hasPrev)/*115.41*/ {_display_(Seq(format.raw/*115.43*/("""
                    <li class="prev">
                        <a href=""""),_display_(Seq(/*117.35*/link(currentPage.getPageIndex - 1, null))),format.raw/*117.75*/("""">&larr; Previous</a>
                    </li>
                """)))}/*119.19*/else/*119.24*/{_display_(Seq(format.raw/*119.25*/("""
                    <li class="prev disabled">
                        <a>&larr; Previous</a>
                    </li>
                """)))})),format.raw/*123.18*/("""
                <li class="current">
                    <a>Displaying """),_display_(Seq(/*125.36*/currentPage/*125.47*/.getDisplayXtoYofZ(" to "," of "))),format.raw/*125.80*/("""</a>
                </li>
                """),_display_(Seq(/*127.18*/if(currentPage.hasNext)/*127.41*/ {_display_(Seq(format.raw/*127.43*/("""
                    <li class="next">
                        <a href=""""),_display_(Seq(/*129.35*/link(currentPage.getPageIndex + 1, null))),format.raw/*129.75*/("""">Next &rarr;</a>
                    </li>
                """)))}/*131.19*/else/*131.24*/{_display_(Seq(format.raw/*131.25*/("""
                    <li class="next disabled">
                        <a>Next &rarr;</a>
                    </li>
                """)))})),format.raw/*135.18*/("""
            </ul>
        </div>
        
    """)))})),format.raw/*139.6*/("""
        
""")))})),format.raw/*141.2*/("""

            
"""))}
    }
    
    def render(currentPage:Page[Unicarbdbreference],currentSortBy:String,currentOrder:String,currentFilter:String) = apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def f:((Page[Unicarbdbreference],String,String,String) => play.api.templates.Html) = (currentPage,currentSortBy,currentOrder,currentFilter) => apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Oct 12 14:39:33 EST 2012
                    SOURCE: /home/matthew/Documents/play-app/tmp/glycomics/app/views/unicarb.scala.html
                    HASH: 87b701fb0b348b57ac540c73bcb82242763d5a01
                    MATRIX: 796->1|964->855|978->861|1067->891|1115->908|1127->911|1166->928|1206->937|1240->963|1328->1027|1380->1048|1414->1060|1448->1063|1475->1068|1513->237|1524->241|2052->108|2081->235|2109->743|2139->853|2167->1084|2200->1087|2212->1091|2246->1093|2307->1123|2393->1187|2435->1199|2476->1231|2511->1233|2623->1314|2637->1319|2674->1334|2726->1355|2806->1404|2843->1419|2955->1500|2990->1513|3241->1733|3256->1739|3300->1761|3397->1827|3412->1833|3454->1853|3544->1913|3590->1950|3625->1952|3749->2059|3762->2064|3796->2065|3947->2185|3993->2209|4046->2231|4090->2253|4143->2275|4193->2303|4246->2325|4301->2358|4339->2366|4405->2410|4518->2492|4571->2529|4606->2531|4703->2597|4721->2606|4749->2612|4848->2680|4883->2706|4918->2708|5010->2782|5023->2787|5057->2788|5122->2822|5140->2831|5167->2836|5229->2866|5349->2955|5387->2984|5422->2986|5514->3060|5527->3065|5561->3066|5626->3100|5644->3109|5674->3117|5736->3147|5856->3236|5894->3265|5929->3267|6021->3341|6034->3346|6068->3347|6134->3381|6153->3390|6189->3403|6252->3433|6352->3501|6371->3510|6409->3525|6518->3601|6674->3725|6707->3748|6743->3750|6848->3823|6911->3863|6996->3929|7010->3934|7045->3935|7216->4073|7321->4146|7342->4157|7398->4190|7474->4234|7507->4257|7543->4259|7648->4332|7711->4372|7792->4434|7806->4439|7841->4440|8008->4574|8088->4622|8131->4633
                    LINES: 27->1|29->32|29->32|31->32|32->33|32->33|32->33|32->33|32->33|32->33|33->34|33->34|33->34|33->34|35->6|35->6|57->1|59->5|60->27|62->31|63->36|65->38|65->38|65->38|67->40|67->40|69->42|69->42|69->42|71->44|71->44|71->44|73->46|76->49|76->49|77->50|77->50|81->54|81->54|81->54|82->55|82->55|82->55|86->59|86->59|86->59|92->65|92->65|92->65|97->70|97->70|98->71|98->71|99->72|99->72|100->73|100->73|101->74|101->74|106->79|106->79|106->79|108->81|108->81|108->81|110->83|110->83|110->83|112->85|112->85|112->85|113->86|113->86|113->86|114->87|117->90|117->90|117->90|119->92|119->92|119->92|120->93|120->93|120->93|121->94|124->97|124->97|124->97|126->99|126->99|126->99|127->100|127->100|127->100|128->101|131->104|131->104|131->104|135->108|142->115|142->115|142->115|144->117|144->117|146->119|146->119|146->119|150->123|152->125|152->125|152->125|154->127|154->127|154->127|156->129|156->129|158->131|158->131|158->131|162->135|166->139|168->141
                    -- GENERATED --
                */
            