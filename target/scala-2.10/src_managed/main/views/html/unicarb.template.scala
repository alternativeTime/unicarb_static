
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
object unicarb extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[com.avaje.ebean.Page[Unicarbdbreference],String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(currentPage: com.avaje.ebean.Page[Unicarbdbreference], currentSortBy: String, currentOrder: String, currentFilter: String):play.api.templates.HtmlFormat.Appendable = {
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
Seq[Any](format.raw/*1.125*/("""

"""),format.raw/*5.42*/("""
"""),format.raw/*27.2*/("""

"""),format.raw/*31.37*/("""
"""),format.raw/*36.2*/("""

"""),_display_(Seq[Any](/*38.2*/main/*38.6*/ {_display_(Seq[Any](format.raw/*38.8*/("""
    
    <h1 id="homeTitle">"""),_display_(Seq[Any](/*40.25*/Messages("Reference - UniCarb-DB", currentPage.getTotalRowCount))),format.raw/*40.89*/("""</h1>

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
        
        <a class="btn success" id="add" href=""""),_display_(Seq[Any](/*54.48*/routes/*54.54*/.Application.unicarb())),format.raw/*54.76*/("""">Show All References</a>
	<a class="btn success" id="add" href=""""),_display_(Seq[Any](/*55.41*/routes/*55.47*/.Application.list2())),format.raw/*55.67*/("""">GlycoSuite References</a>  
        
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
                    """),_display_(Seq[Any](/*73.22*/header("journal.name", "Journal"))),format.raw/*73.55*/("""
		    """),_display_(Seq[Any](/*74.8*/header("strference.id", "Glycan Structures"))),format.raw/*74.52*/("""
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
			 <td>
                          	"""),_display_(Seq[Any](/*104.29*/reference/*104.38*/.lcmucin.size())),format.raw/*104.53*/(""" 
                        </td>

                    </tr>
                """)))})),format.raw/*108.18*/("""

            </tbody>
        </table>

        <div id="pagination" class="pagination">
            <ul>
                """),_display_(Seq[Any](/*115.18*/if(currentPage.hasPrev)/*115.41*/ {_display_(Seq[Any](format.raw/*115.43*/("""
                    <li class="prev">
                        <a href=""""),_display_(Seq[Any](/*117.35*/link(currentPage.getPageIndex - 1, null))),format.raw/*117.75*/("""">&larr; Previous</a>
                    </li>
                """)))}/*119.19*/else/*119.24*/{_display_(Seq[Any](format.raw/*119.25*/("""
                    <li class="prev disabled">
                        <a>&larr; Previous</a>
                    </li>
                """)))})),format.raw/*123.18*/("""
                <li class="current">
                    <a>Displaying """),_display_(Seq[Any](/*125.36*/currentPage/*125.47*/.getDisplayXtoYofZ(" to "," of "))),format.raw/*125.80*/("""</a>
                </li>
                """),_display_(Seq[Any](/*127.18*/if(currentPage.hasNext)/*127.41*/ {_display_(Seq[Any](format.raw/*127.43*/("""
                    <li class="next">
                        <a href=""""),_display_(Seq[Any](/*129.35*/link(currentPage.getPageIndex + 1, null))),format.raw/*129.75*/("""">Next &rarr;</a>
                    </li>
                """)))}/*131.19*/else/*131.24*/{_display_(Seq[Any](format.raw/*131.25*/("""
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
    
    def render(currentPage:com.avaje.ebean.Page[Unicarbdbreference],currentSortBy:String,currentOrder:String,currentFilter:String): play.api.templates.HtmlFormat.Appendable = apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def f:((com.avaje.ebean.Page[Unicarbdbreference],String,String,String) => play.api.templates.HtmlFormat.Appendable) = (currentPage,currentSortBy,currentOrder,currentFilter) => apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 02 10:52:57 EST 2014
                    SOURCE: /Users/matthew/git/glycomics_working/app/views/unicarb.scala.html
                    HASH: 093bed5f2e1ebd6dc096f118f135ca6e7d81dbec
                    MATRIX: 831->1|1032->871|1046->877|1157->907|1210->924|1222->927|1261->944|1306->953|1340->979|1428->1043|1485->1064|1519->1076|1558->1079|1585->1084|1623->253|1634->257|2167->124|2196->251|2224->759|2254->869|2282->1100|2320->1103|2332->1107|2371->1109|2437->1139|2523->1203|2570->1215|2611->1247|2651->1249|2768->1330|2782->1335|2819->1350|2871->1371|2956->1420|2993->1435|3110->1516|3145->1529|3401->1749|3416->1755|3460->1777|3562->1843|3577->1849|3619->1869|3714->1929|3760->1966|3800->1968|3924->2075|3937->2080|3976->2081|4132->2201|4178->2225|4236->2247|4280->2269|4338->2291|4388->2319|4446->2341|4501->2374|4544->2382|4610->2426|4728->2508|4781->2545|4821->2547|4923->2613|4941->2622|4969->2628|5073->2696|5104->2718|5144->2720|5236->2794|5249->2799|5288->2800|5358->2834|5376->2843|5403->2848|5465->2878|5590->2967|5628->2996|5668->2998|5760->3072|5773->3077|5812->3078|5882->3112|5900->3121|5930->3129|5992->3159|6117->3248|6155->3277|6195->3279|6287->3353|6300->3358|6339->3359|6410->3393|6429->3402|6465->3415|6528->3445|6633->3513|6652->3522|6690->3537|6799->3613|6960->3737|6993->3760|7034->3762|7144->3835|7207->3875|7292->3941|7306->3946|7346->3947|7517->4085|7627->4158|7648->4169|7704->4202|7785->4246|7818->4269|7859->4271|7969->4344|8032->4384|8113->4446|8127->4451|8167->4452|8334->4586|8414->4634|8457->4645
                    LINES: 26->1|28->32|28->32|30->32|31->33|31->33|31->33|31->33|31->33|31->33|32->34|32->34|32->34|32->34|34->6|34->6|56->1|58->5|59->27|61->31|62->36|64->38|64->38|64->38|66->40|66->40|68->42|68->42|68->42|70->44|70->44|70->44|72->46|75->49|75->49|76->50|76->50|80->54|80->54|80->54|81->55|81->55|81->55|85->59|85->59|85->59|91->65|91->65|91->65|96->70|96->70|97->71|97->71|98->72|98->72|99->73|99->73|100->74|100->74|105->79|105->79|105->79|107->81|107->81|107->81|109->83|109->83|109->83|111->85|111->85|111->85|112->86|112->86|112->86|113->87|116->90|116->90|116->90|118->92|118->92|118->92|119->93|119->93|119->93|120->94|123->97|123->97|123->97|125->99|125->99|125->99|126->100|126->100|126->100|127->101|130->104|130->104|130->104|134->108|141->115|141->115|141->115|143->117|143->117|145->119|145->119|145->119|149->123|151->125|151->125|151->125|153->127|153->127|153->127|155->129|155->129|157->131|157->131|157->131|161->135|165->139|167->141
                    -- GENERATED --
                */
            