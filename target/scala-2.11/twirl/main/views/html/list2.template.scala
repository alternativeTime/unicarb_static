
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
object list2 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[com.avaje.ebean.Page[Reference],String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentPage: com.avaje.ebean.Page[Reference], currentSortBy: String, currentOrder: String, currentFilter: String, proteinFilter: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
def /*32.2*/header/*32.8*/(key:String, title:String):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*32.38*/("""
    """),format.raw/*33.5*/("""<th class=""""),_display_(/*33.17*/key/*33.20*/.replace(".","_")),format.raw/*33.37*/(""" """),format.raw/*33.38*/("""header """),_display_(/*33.46*/if(currentSortBy == key){/*33.72*/{if(currentOrder == "asc") "headerSortDown" else "headerSortUp"}}),format.raw/*33.136*/("""">
        <a href=""""),_display_(/*34.19*/link(0, key)),format.raw/*34.31*/("""">"""),_display_(/*34.34*/title),format.raw/*34.39*/("""</a>
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

"""),_display_(/*38.2*/main/*38.6*/ {_display_(Seq[Any](format.raw/*38.8*/("""
    
    """),format.raw/*40.5*/("""<h1 id="homeTitle">"""),_display_(/*40.25*/Messages("GlycoSuite Reference ", currentPage.getTotalRowCount)),format.raw/*40.88*/("""</h1>

    """),_display_(/*42.6*/if(flash.containsKey("success"))/*42.38*/ {_display_(Seq[Any](format.raw/*42.40*/("""
        """),format.raw/*43.9*/("""<div class="alert-message warning">
            <strong>Done!</strong> """),_display_(/*44.37*/flash/*44.42*/.get("success")),format.raw/*44.57*/("""
        """),format.raw/*45.9*/("""</div>
    """)))}),format.raw/*46.6*/(""" 

    """),format.raw/*48.5*/("""<div id="actions">
        <form action=""""),_display_(/*49.24*/link(0, "name")),format.raw/*49.39*/("""" method="GET">
            <input type="search" id="searchbox" name="f" value=""""),_display_(/*50.66*/currentFilter),format.raw/*50.79*/("""" placeholder="Filter by reference title or author name...">
            <input type="submit" id="searchsubmit" value="Filter" class="btn primary">
        </form>
        
        """),format.raw/*54.105*/("""
	"""),format.raw/*55.2*/("""<a class="btn success" id="add" href="/references?s=authors">Show All References</a>  
        
    </div>
    
    """),_display_(/*59.6*/if(currentPage.getTotalRowCount == 0)/*59.43*/ {_display_(Seq[Any](format.raw/*59.45*/("""
        
        """),format.raw/*61.9*/("""<div class="well">
            <em>Nothing to display</em>
        </div>
        
    """)))}/*65.7*/else/*65.12*/{_display_(Seq[Any](format.raw/*65.13*/("""
        
        """),format.raw/*67.9*/("""<table class="computers zebra-striped">
            <thead>
                <tr>
                    """),_display_(/*70.22*/header("title", "Title")),format.raw/*70.46*/("""
                    """),_display_(/*71.22*/header("year", "Year")),format.raw/*71.44*/("""
                    """),_display_(/*72.22*/header("authors", "Authors")),format.raw/*72.50*/("""
                    """),_display_(/*73.22*/header("journal.name", "Journalss")),format.raw/*73.57*/("""
		    """),_display_(/*74.8*/header("strference.id", "Streference")),format.raw/*74.46*/("""
                """),format.raw/*75.17*/("""</tr>
            </thead>
            <tbody>

                """),_display_(/*79.18*/for(reference <- currentPage.getList) yield /*79.55*/ {_display_(Seq[Any](format.raw/*79.57*/("""
                    """),format.raw/*80.21*/("""<tr>
                        <td><a href="">"""),_display_(/*81.41*/reference/*81.50*/.title),format.raw/*81.56*/("""</a></td>
                        <td>
                            """),_display_(/*83.30*/if(reference.year < 1)/*83.52*/ {_display_(Seq[Any](format.raw/*83.54*/("""
                                """),format.raw/*84.33*/("""<em>-</em>
                            """)))}/*85.31*/else/*85.36*/{_display_(Seq[Any](format.raw/*85.37*/("""
                                """),_display_(/*86.34*/reference/*86.43*/.year),format.raw/*86.48*/("""
                            """)))}),format.raw/*87.30*/("""
                        """),format.raw/*88.25*/("""</td>
                        <td>
                            """),_display_(/*90.30*/if(reference.authors == null)/*90.59*/ {_display_(Seq[Any](format.raw/*90.61*/("""
                                """),format.raw/*91.33*/("""<em>-</em>
                            """)))}/*92.31*/else/*92.36*/{_display_(Seq[Any](format.raw/*92.37*/("""
                                """),_display_(/*93.34*/reference/*93.43*/.authors),format.raw/*93.51*/("""
                            """)))}),format.raw/*94.30*/("""
                        """),format.raw/*95.25*/("""</td>
                        <td>
                            """),_display_(/*97.30*/if(reference.journal == null)/*97.59*/ {_display_(Seq[Any](format.raw/*97.61*/("""
                                """),format.raw/*98.33*/("""<em>-</em>
                            """)))}/*99.31*/else/*99.36*/{_display_(Seq[Any](format.raw/*99.37*/("""
                                """),_display_(/*100.34*/reference/*100.43*/.journal.name),format.raw/*100.56*/("""
                            """)))}),format.raw/*101.30*/("""
                        """),format.raw/*102.25*/("""</td>
                    </tr>
                """)))}),format.raw/*104.18*/("""

            """),format.raw/*106.13*/("""</tbody>
        </table>

        <div id="pagination" class="pagination">
            <ul>
                """),_display_(/*111.18*/if(currentPage.hasPrev)/*111.41*/ {_display_(Seq[Any](format.raw/*111.43*/("""
                    """),format.raw/*112.21*/("""<li class="prev">
                        <a href=""""),_display_(/*113.35*/link(currentPage.getPageIndex - 1, null)),format.raw/*113.75*/("""">&larr; Previous</a>
                    </li>
                """)))}/*115.19*/else/*115.24*/{_display_(Seq[Any](format.raw/*115.25*/("""
                    """),format.raw/*116.21*/("""<li class="prev disabled">
                        <a>&larr; Previous</a>
                    </li>
                """)))}),format.raw/*119.18*/("""
                """),format.raw/*120.17*/("""<li class="current">
                    <a>Displaying """),_display_(/*121.36*/currentPage/*121.47*/.getDisplayXtoYofZ(" to "," of ")),format.raw/*121.80*/("""</a>
                </li>
                """),_display_(/*123.18*/if(currentPage.hasNext)/*123.41*/ {_display_(Seq[Any](format.raw/*123.43*/("""
                    """),format.raw/*124.21*/("""<li class="next">
                        <a href=""""),_display_(/*125.35*/link(currentPage.getPageIndex + 1, null)),format.raw/*125.75*/("""">Next &rarr;</a>
                    </li>
                """)))}/*127.19*/else/*127.24*/{_display_(Seq[Any](format.raw/*127.25*/("""
                    """),format.raw/*128.21*/("""<li class="next disabled">
                        <a>Next &rarr;</a>
                    </li>
                """)))}),format.raw/*131.18*/("""
            """),format.raw/*132.13*/("""</ul>
        </div>
        
    """)))}),format.raw/*135.6*/("""
        
""")))}),format.raw/*137.2*/("""

            
"""))}
  }

  def render(currentPage:com.avaje.ebean.Page[Reference],currentSortBy:String,currentOrder:String,currentFilter:String,proteinFilter:String): play.twirl.api.HtmlFormat.Appendable = apply(currentPage,currentSortBy,currentOrder,currentFilter,proteinFilter)

  def f:((com.avaje.ebean.Page[Reference],String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (currentPage,currentSortBy,currentOrder,currentFilter,proteinFilter) => apply(currentPage,currentSortBy,currentOrder,currentFilter,proteinFilter)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Nov 14 11:35:22 EST 2014
                  SOURCE: /Users/matthew/git/glycomics_working/app/views/list2.scala.html
                  HASH: e3d6b5cfc880f2842f020aa8a3970c7f6d37dcce
                  MATRIX: 776->1|985->885|999->891|1106->921|1138->926|1177->938|1189->941|1227->958|1256->959|1291->967|1325->993|1412->1057|1460->1078|1493->1090|1523->1093|1549->1098|1587->267|1598->271|2131->138|2160->265|2188->773|2218->883|2246->1114|2275->1117|2287->1121|2326->1123|2363->1133|2410->1153|2494->1216|2532->1228|2573->1260|2613->1262|2649->1271|2748->1343|2762->1348|2798->1363|2834->1372|2876->1384|2910->1391|2979->1433|3015->1448|3123->1529|3157->1542|3367->1819|3396->1821|3539->1938|3585->1975|3625->1977|3670->1995|3776->2084|3789->2089|3828->2090|3873->2108|4002->2210|4047->2234|4096->2256|4139->2278|4188->2300|4237->2328|4286->2350|4342->2385|4376->2393|4435->2431|4480->2448|4572->2513|4625->2550|4665->2552|4714->2573|4786->2618|4804->2627|4831->2633|4926->2701|4957->2723|4997->2725|5058->2758|5117->2799|5130->2804|5169->2805|5230->2839|5248->2848|5274->2853|5335->2883|5388->2908|5479->2972|5517->3001|5557->3003|5618->3036|5677->3077|5690->3082|5729->3083|5790->3117|5808->3126|5837->3134|5898->3164|5951->3189|6042->3253|6080->3282|6120->3284|6181->3317|6240->3358|6253->3363|6292->3364|6354->3398|6373->3407|6408->3420|6470->3450|6524->3475|6605->3524|6648->3538|6786->3648|6819->3671|6860->3673|6910->3694|6990->3746|7052->3786|7137->3852|7151->3857|7191->3858|7241->3879|7390->3996|7436->4013|7520->4069|7541->4080|7596->4113|7668->4157|7701->4180|7742->4182|7792->4203|7872->4255|7934->4295|8015->4357|8029->4362|8069->4363|8119->4384|8264->4497|8306->4510|8372->4545|8414->4556
                  LINES: 26->1|28->32|28->32|30->32|31->33|31->33|31->33|31->33|31->33|31->33|31->33|31->33|32->34|32->34|32->34|32->34|34->6|34->6|56->1|58->5|59->27|61->31|62->36|64->38|64->38|64->38|66->40|66->40|66->40|68->42|68->42|68->42|69->43|70->44|70->44|70->44|71->45|72->46|74->48|75->49|75->49|76->50|76->50|80->54|81->55|85->59|85->59|85->59|87->61|91->65|91->65|91->65|93->67|96->70|96->70|97->71|97->71|98->72|98->72|99->73|99->73|100->74|100->74|101->75|105->79|105->79|105->79|106->80|107->81|107->81|107->81|109->83|109->83|109->83|110->84|111->85|111->85|111->85|112->86|112->86|112->86|113->87|114->88|116->90|116->90|116->90|117->91|118->92|118->92|118->92|119->93|119->93|119->93|120->94|121->95|123->97|123->97|123->97|124->98|125->99|125->99|125->99|126->100|126->100|126->100|127->101|128->102|130->104|132->106|137->111|137->111|137->111|138->112|139->113|139->113|141->115|141->115|141->115|142->116|145->119|146->120|147->121|147->121|147->121|149->123|149->123|149->123|150->124|151->125|151->125|153->127|153->127|153->127|154->128|157->131|158->132|161->135|163->137
                  -- GENERATED --
              */
          