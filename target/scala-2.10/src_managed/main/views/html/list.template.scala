
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
object list extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[com.avaje.ebean.Page[Reference],String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(currentPage: com.avaje.ebean.Page[Reference], currentSortBy: String, currentOrder: String, currentFilter: String):play.api.templates.HtmlFormat.Appendable = {
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
Seq[Any](format.raw/*1.116*/("""

"""),format.raw/*5.42*/("""
"""),format.raw/*27.2*/("""

"""),format.raw/*31.37*/("""
"""),format.raw/*36.2*/("""

"""),_display_(Seq[Any](/*38.2*/main/*38.6*/ {_display_(Seq[Any](format.raw/*38.8*/("""

  <ul class="breadcrumb">
    <li><i class="icon-home" ></i><a href="/"> UniCarbKB</a> <span class="divider">></span></li>
    <li class="active"><i class="icon-book" ></i> References<span class="divider"></span></li>
    <!--<li class="active" > You are here</li>-->
  </ul>

  <section id="layouts">

    <div class="page-header row-fluid">
      <h1 id="homeTitle">"""),_display_(Seq[Any](/*49.27*/Messages(" Reference Search ", currentPage.getTotalRowCount))),format.raw/*49.87*/("""</h1>
      <h4 class="subheader">Search the curated collection of publication data by author or title descriptions</h4>
    </div>

    """),_display_(Seq[Any](/*53.6*/if(flash.containsKey("success"))/*53.38*/ {_display_(Seq[Any](format.raw/*53.40*/("""
        <div class="alert-message warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*55.37*/flash/*55.42*/.get("success"))),format.raw/*55.57*/("""
        </div>
    """)))})),format.raw/*57.6*/(""" 

    <div id="actions">
 
        <form class='input-append' action=""""),_display_(Seq[Any](/*61.45*/link(0, "name"))),format.raw/*61.60*/("""" method="GET">
          <input type="search" id="searchbox" class='input-xxlarge' name="f" value=""""),_display_(Seq[Any](/*62.86*/currentFilter)),format.raw/*62.99*/("""" placeholder="Reference title or author name...">
          <input type="submit" id="searchsubmit" value="Filter" class="btn btn-primary">
          <a class="btn success" id="add" href="/references?s=authors">Show All References</a> 
        </form>
        
    </div>
    
    <div class="row-fluid">
    """),_display_(Seq[Any](/*70.6*/if(currentPage.getTotalRowCount == 0)/*70.43*/ {_display_(Seq[Any](format.raw/*70.45*/("""
        
        <div class="well">
            <em>Nothing to display</em>
        </div>
        
    """)))}/*76.7*/else/*76.12*/{_display_(Seq[Any](format.raw/*76.13*/("""
        
        <table class="computers table table-striped">
            <thead>
                <tr>
                    """),_display_(Seq[Any](/*81.22*/header("title", "Title"))),format.raw/*81.46*/("""
                    """),_display_(Seq[Any](/*82.22*/header("year", "Year"))),format.raw/*82.44*/("""
                    """),_display_(Seq[Any](/*83.22*/header("authors", "Authors"))),format.raw/*83.50*/("""
                    """),_display_(Seq[Any](/*84.22*/header("journal.name", "Journal"))),format.raw/*84.55*/("""
                    """),_display_(Seq[Any](/*85.22*/header("streference.id", "Associated Glycans"))),format.raw/*85.68*/("""
                </tr>
            </thead>
            <tbody>

                """),_display_(Seq[Any](/*90.18*/for(reference <- currentPage.getList) yield /*90.55*/ {_display_(Seq[Any](format.raw/*90.57*/("""
                    <tr>
                        <td><a href="references/"""),_display_(Seq[Any](/*92.50*/reference/*92.59*/.id)),format.raw/*92.62*/("""" style="text-decoration : none, font-color: #404040; ">"""),_display_(Seq[Any](/*92.119*/reference/*92.128*/.title)),format.raw/*92.134*/("""</a></td>
                        <td>
                            """),_display_(Seq[Any](/*94.30*/if(reference.year < 1)/*94.52*/ {_display_(Seq[Any](format.raw/*94.54*/("""
                                <em>-</em>
                            """)))}/*96.31*/else/*96.36*/{_display_(Seq[Any](format.raw/*96.37*/("""
                                """),_display_(Seq[Any](/*97.34*/reference/*97.43*/.year)),format.raw/*97.48*/("""
                            """)))})),format.raw/*98.30*/("""
                        </td>
                        <td>
                            """),_display_(Seq[Any](/*101.30*/if(reference.authors == null)/*101.59*/ {_display_(Seq[Any](format.raw/*101.61*/("""
                                <em>-</em>
                            """)))}/*103.31*/else/*103.36*/{_display_(Seq[Any](format.raw/*103.37*/("""
                                """),_display_(Seq[Any](/*104.34*/reference/*104.43*/.authors)),format.raw/*104.51*/("""
                            """)))})),format.raw/*105.30*/("""
                        </td>
                        <td>
                            """),_display_(Seq[Any](/*108.30*/if(reference.journal == null)/*108.59*/ {_display_(Seq[Any](format.raw/*108.61*/("""
                                <em>-</em>
                            """)))}/*110.31*/else/*110.36*/{_display_(Seq[Any](format.raw/*110.37*/("""
                                """),_display_(Seq[Any](/*111.34*/reference/*111.43*/.journal.name)),format.raw/*111.56*/("""
                            """)))})),format.raw/*112.30*/("""
                        </td>
			<td>
			   """),_display_(Seq[Any](/*115.8*/reference/*115.17*/.streference.size())),format.raw/*115.36*/("""
			</td>
                    </tr>
                """)))})),format.raw/*118.18*/("""

            </tbody>
        </table>

        <div id="pagination" class="pagination">
            <ul class="clearfix">
              """),_display_(Seq[Any](/*125.16*/if(currentPage.hasPrev)/*125.39*/ {_display_(Seq[Any](format.raw/*125.41*/("""
                <li class="prev"><a href=""""),_display_(Seq[Any](/*126.44*/link(currentPage.getPageIndex - 1, null))),format.raw/*126.84*/("""">&larr; Previous</a></li>
              """)))}/*127.17*/else/*127.22*/{_display_(Seq[Any](format.raw/*127.23*/("""
                <li class="prev disabled"><a>&larr; Previous</a></li>
              """)))})),format.raw/*129.16*/("""
                <li class="current"><a>Displaying """),_display_(Seq[Any](/*130.52*/currentPage/*130.63*/.getDisplayXtoYofZ(" to "," of "))),format.raw/*130.96*/("""</a></li>
              """),_display_(Seq[Any](/*131.16*/if(currentPage.hasNext)/*131.39*/ {_display_(Seq[Any](format.raw/*131.41*/("""
                <li class="next"><a href=""""),_display_(Seq[Any](/*132.44*/link(currentPage.getPageIndex + 1, null))),format.raw/*132.84*/("""">Next &rarr;</a></li>
              """)))}/*133.17*/else/*133.22*/{_display_(Seq[Any](format.raw/*133.23*/("""
                <li class="next disabled"><a>Next &rarr;</a></li>
              """)))})),format.raw/*135.16*/("""
            </ul>
        </div>
      </div>
	
      """),_display_(Seq[Any](/*140.8*/views/*140.13*/.html.footerunicarb.footerunicarb())),format.raw/*140.48*/("""    
    
    """)))})),format.raw/*142.6*/("""

  </section>
        
""")))})),format.raw/*146.2*/("""

            
"""))}
    }
    
    def render(currentPage:com.avaje.ebean.Page[Reference],currentSortBy:String,currentOrder:String,currentFilter:String): play.api.templates.HtmlFormat.Appendable = apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def f:((com.avaje.ebean.Page[Reference],String,String,String) => play.api.templates.HtmlFormat.Appendable) = (currentPage,currentSortBy,currentOrder,currentFilter) => apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 02 10:52:56 EST 2014
                    SOURCE: /Users/matthew/git/glycomics_working/app/views/list.scala.html
                    HASH: 627ecaf9a1d8d372b3dd0141ef7417a19521986d
                    MATRIX: 819->1|1011->862|1025->868|1136->898|1189->915|1201->918|1240->935|1285->944|1319->970|1407->1034|1464->1055|1498->1067|1537->1070|1564->1075|1602->244|1613->248|2146->115|2175->242|2203->750|2233->860|2261->1091|2299->1094|2311->1098|2350->1100|2757->1471|2839->1531|3012->1669|3053->1701|3093->1703|3210->1784|3224->1789|3261->1804|3313->1825|3421->1897|3458->1912|3595->2013|3630->2026|3975->2336|4021->2373|4061->2375|4185->2482|4198->2487|4237->2488|4399->2614|4445->2638|4503->2660|4547->2682|4605->2704|4655->2732|4713->2754|4768->2787|4826->2809|4894->2855|5012->2937|5065->2974|5105->2976|5216->3051|5234->3060|5259->3063|5353->3120|5372->3129|5401->3135|5505->3203|5536->3225|5576->3227|5668->3301|5681->3306|5720->3307|5790->3341|5808->3350|5835->3355|5897->3385|6023->3474|6062->3503|6103->3505|6196->3579|6210->3584|6250->3585|6321->3619|6340->3628|6371->3636|6434->3666|6560->3755|6599->3784|6640->3786|6733->3860|6747->3865|6787->3866|6858->3900|6877->3909|6913->3922|6976->3952|7058->3998|7077->4007|7119->4026|7205->4079|7381->4218|7414->4241|7455->4243|7536->4287|7599->4327|7661->4370|7675->4375|7715->4376|7834->4462|7923->4514|7944->4525|8000->4558|8062->4583|8095->4606|8136->4608|8217->4652|8280->4692|8338->4731|8352->4736|8392->4737|8507->4819|8599->4875|8614->4880|8672->4915|8719->4930|8776->4955
                    LINES: 26->1|28->32|28->32|30->32|31->33|31->33|31->33|31->33|31->33|31->33|32->34|32->34|32->34|32->34|34->6|34->6|56->1|58->5|59->27|61->31|62->36|64->38|64->38|64->38|75->49|75->49|79->53|79->53|79->53|81->55|81->55|81->55|83->57|87->61|87->61|88->62|88->62|96->70|96->70|96->70|102->76|102->76|102->76|107->81|107->81|108->82|108->82|109->83|109->83|110->84|110->84|111->85|111->85|116->90|116->90|116->90|118->92|118->92|118->92|118->92|118->92|118->92|120->94|120->94|120->94|122->96|122->96|122->96|123->97|123->97|123->97|124->98|127->101|127->101|127->101|129->103|129->103|129->103|130->104|130->104|130->104|131->105|134->108|134->108|134->108|136->110|136->110|136->110|137->111|137->111|137->111|138->112|141->115|141->115|141->115|144->118|151->125|151->125|151->125|152->126|152->126|153->127|153->127|153->127|155->129|156->130|156->130|156->130|157->131|157->131|157->131|158->132|158->132|159->133|159->133|159->133|161->135|166->140|166->140|166->140|168->142|172->146
                    -- GENERATED --
                */
            