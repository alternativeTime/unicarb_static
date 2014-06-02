
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
object proteinlist extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template6[com.avaje.ebean.Page[Proteins],String,String,String,List[Proteins],String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(currentPage: com.avaje.ebean.Page[Proteins], currentSortBy: String, currentOrder: String, currentFilter: String, proteins: List[Proteins], filterYesNo: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*35.2*/header/*35.8*/(key:String, title:String):play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*35.38*/("""
    <th class=""""),_display_(Seq[Any](/*36.17*/key/*36.20*/.replace(".","_"))),format.raw/*36.37*/(""" header """),_display_(Seq[Any](/*36.46*/if(currentSortBy == key){/*36.72*/{if(currentOrder == "asc") "headerSortDown" else "headerSortUp"}})),format.raw/*36.136*/("""">
        <a href=""""),_display_(Seq[Any](/*37.19*/link(0, key))),format.raw/*37.31*/("""">"""),_display_(Seq[Any](/*37.34*/title)),format.raw/*37.39*/("""</a>
    </th>
""")))};def /*8.2*/link/*8.6*/(newPage:Int, newSortBy:String) = {{
    
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
    routes.ProteinDetails.proteinlist(newPage, sortBy, order, currentFilter)
    
}};
Seq[Any](format.raw/*1.162*/("""
"""),format.raw/*3.1*/("""

"""),format.raw/*7.42*/("""
"""),format.raw/*29.2*/("""


"""),format.raw/*34.37*/("""
"""),format.raw/*39.2*/("""

"""),_display_(Seq[Any](/*41.2*/main/*41.6*/ {_display_(Seq[Any](format.raw/*41.8*/("""

<script>
      $(document).ready(function()"""),format.raw/*44.35*/("""{"""),format.raw/*44.36*/("""
        $("#e3").select2("""),format.raw/*45.26*/("""{"""),format.raw/*45.27*/("""
          placeholder: "Select multiple proteins...",
          allowClear: true,
          minimumInputLength: 1,
        """),format.raw/*49.9*/("""}"""),format.raw/*49.10*/(""");
        """),format.raw/*50.9*/("""}"""),format.raw/*50.10*/(""");
</script>
<script>
        $(function() """),format.raw/*53.22*/("""{"""),format.raw/*53.23*/("""
        var myProteins = new Array();
        """),_display_(Seq[Any](/*55.10*/for(s <- proteins ) yield /*55.29*/{_display_(Seq[Any](format.raw/*55.30*/("""
                myProteins.push(""""),_display_(Seq[Any](/*56.35*/s/*56.36*/.name)),format.raw/*56.41*/("""");
        """)))})),format.raw/*57.10*/("""
        myProteins.sort();
        options = '';
        for (var i = 0; i < myProteins.length; i++) """),format.raw/*60.53*/("""{"""),format.raw/*60.54*/("""
                options += '<option value="' + myProteins[i] + '">' + myProteins[i] + '</option>';
        """),format.raw/*62.9*/("""}"""),format.raw/*62.10*/("""
        $('#e3').html(options);
        """),format.raw/*64.9*/("""}"""),format.raw/*64.10*/(""");
</script>


  <ul class="breadcrumb">
    <li><i class="icon-home" ></i><a href="/"> UniCarbKB</a> <span class="divider">></span></li>
    <li class="active"><i class="icon-map-marker" ></i> Proteins<span class="divider"></span></li>
  </ul>
   
    <div class="page-header row-fluid"> 
      <h1 id="homeTitle">"""),_display_(Seq[Any](/*74.27*/Messages(" Protein Search ", currentPage.getTotalRowCount))),format.raw/*74.85*/("""</h1>
      <h4 class="subheader">Search the curated collection of Protein data by name.</h4>
    </div>
    """),_display_(Seq[Any](/*77.6*/if(flash.containsKey("success"))/*77.38*/ {_display_(Seq[Any](format.raw/*77.40*/("""
        <div class="alert-message warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*79.37*/flash/*79.42*/.get("success"))),format.raw/*79.57*/("""
        </div>
    """)))})),format.raw/*81.6*/("""

    <div id="actions">
 
        """),format.raw/*89.19*/("""
    
        <div id='test'  class="input-append controls">
          <form class='form-search' action=""""),_display_(Seq[Any](/*92.46*/link(0, "name"))),format.raw/*92.61*/("""" method="GET">
            <select  name="m" MULTIPLE id="e3" id="listBox" class="input-xxlarge"></select>
            <input type="submit" id="searchsubmit" value="Filter" class="btn btn-primary">
            <a class="btn success" id="add" href="/proteins">Show All Glycoproteins</a>
          </form>
        </div>

    
    </div>
    
    <div class="row-fluid">
    """),_display_(Seq[Any](/*103.6*/if(currentPage.getTotalRowCount == 0)/*103.43*/ {_display_(Seq[Any](format.raw/*103.45*/("""
        
        <div class="well">
            <em>Nothing to display</em>
        </div>
        
    """)))}/*109.7*/else/*109.12*/{_display_(Seq[Any](format.raw/*109.13*/("""
        
        <table class="computers table table-striped">
            <thead>
                <tr>
		    """),_display_(Seq[Any](/*114.8*/header("name", "Name"))),format.raw/*114.30*/("""
   		    """),_display_(Seq[Any](/*115.11*/header("", "Accession"))),format.raw/*115.34*/("""
                    """),_display_(Seq[Any](/*116.22*/header("", "Taxonomy"))),format.raw/*116.44*/(""" 
		    """),_display_(Seq[Any](/*117.8*/header("stproteins", "Glycan Structures"))),format.raw/*117.49*/("""
		    """),_display_(Seq[Any](/*118.8*/header("proteinGeneralSites", "General"))),format.raw/*118.48*/("""
                </tr>
            </thead>
            <tbody>

                """),_display_(Seq[Any](/*123.18*/for(protein <- currentPage.getList) yield /*123.53*/ {_display_(Seq[Any](format.raw/*123.55*/("""
"""),format.raw/*124.44*/("""
                    <tr>
				<td>"""),_display_(Seq[Any](/*126.10*/protein/*126.17*/.name)),format.raw/*126.22*/("""</td>	    
				<td>"""),_display_(Seq[Any](/*127.10*/if(protein.swissProt != null)/*127.39*/ {_display_(Seq[Any](format.raw/*127.41*/(""" <a href="proteinsummary/"""),_display_(Seq[Any](/*127.67*/protein/*127.74*/.swissProt)),format.raw/*127.84*/("""/annotated">"""),_display_(Seq[Any](/*127.97*/protein/*127.104*/.swissProt)),format.raw/*127.114*/("""</a>""")))})),format.raw/*127.119*/("""</td>
			<td>			
			"""),_display_(Seq[Any](/*129.5*/for(tax <- protein.proteinsTax) yield /*129.36*/ {_display_(Seq[Any](format.raw/*129.38*/("""
			"""),_display_(Seq[Any](/*130.5*/if(protein.swissProt != null)/*130.34*/ {_display_(Seq[Any](format.raw/*130.36*/("""<a href="proteinsummary/"""),_display_(Seq[Any](/*130.61*/protein/*130.68*/.swissProt)),format.raw/*130.78*/("""/annotated">"""),_display_(Seq[Any](/*130.91*/tax/*130.94*/.species)),format.raw/*130.102*/(""" </a>""")))})),format.raw/*130.108*/("""
			"""),_display_(Seq[Any](/*131.5*/if(protein.swissProt == null)/*131.34*/ {_display_(Seq[Any](format.raw/*131.36*/("""<a href="proteinsummary/"""),_display_(Seq[Any](/*131.61*/protein/*131.68*/.name)),format.raw/*131.73*/("""/"""),_display_(Seq[Any](/*131.75*/tax/*131.78*/.species)),format.raw/*131.86*/("""">"""),_display_(Seq[Any](/*131.89*/tax/*131.92*/.species)),format.raw/*131.100*/(""" </a>""")))})),format.raw/*131.106*/("""
        		""")))})),format.raw/*132.12*/("""
			</td>
			<td>
			"""),_display_(Seq[Any](/*135.5*/for(tax <- protein.proteinsTax) yield /*135.36*/{_display_(Seq[Any](format.raw/*135.37*/("""
				"""),_display_(Seq[Any](/*136.6*/if(protein.swissProt != null)/*136.35*/ {_display_(Seq[Any](format.raw/*136.37*/("""
				<a href="proteinsummary/"""),_display_(Seq[Any](/*137.30*/protein/*137.37*/.swissProt)),format.raw/*137.47*/("""/annotated" style="text-decoration : none, font-color: #404040; ">"""),_display_(Seq[Any](/*137.114*/protein/*137.121*/.stproteins.size())),format.raw/*137.139*/("""</a>""")))})),format.raw/*137.144*/("""	
				"""),_display_(Seq[Any](/*138.6*/if(protein.swissProt == null)/*138.35*/ {_display_(Seq[Any](format.raw/*138.37*/(""" <a href="proteinsummary/"""),_display_(Seq[Any](/*138.63*/protein/*138.70*/.name)),format.raw/*138.75*/("""/"""),_display_(Seq[Any](/*138.77*/tax/*138.80*/.species)),format.raw/*138.88*/("""">"""),_display_(Seq[Any](/*138.91*/protein/*138.98*/.stproteins.size())),format.raw/*138.116*/("""</a> """)))})),format.raw/*138.122*/("""

			""")))})),format.raw/*140.5*/("""
			</td>
      <td><a href="proteinsummary/"""),_display_(Seq[Any](/*142.36*/protein/*142.43*/.name)),format.raw/*142.48*/("""" style="text-decoration : none, font-color: #404040; ">"""),_display_(Seq[Any](/*142.105*/if(protein.proteinDefinedSites.size() > 0 )/*142.148*/ {_display_(Seq[Any](format.raw/*142.150*/(""" <span class="label">Site-Specific</span>""")))})),format.raw/*142.192*/("""</a></td>
                    </tr>
                """)))})),format.raw/*144.18*/("""
"""),format.raw/*145.8*/("""

            </tbody>
        </table>

	"""),_display_(Seq[Any](/*150.3*/if(filterYesNo.matches("no"))/*150.32*/ {_display_(Seq[Any](format.raw/*150.34*/("""
        <div id="pagination" class="pagination">
            <ul class="clearfix">
              """),_display_(Seq[Any](/*153.16*/if(currentPage.hasPrev)/*153.39*/ {_display_(Seq[Any](format.raw/*153.41*/("""
                <li class="prev"><a href=""""),_display_(Seq[Any](/*154.44*/link(currentPage.getPageIndex - 1, null))),format.raw/*154.84*/("""">&larr; Previous</a></li>
              """)))}/*155.17*/else/*155.22*/{_display_(Seq[Any](format.raw/*155.23*/("""
                <li class="prev disabled"><a>&larr; Previous</a></li>
              """)))})),format.raw/*157.16*/("""
                """),format.raw/*158.111*/("""
		<li class="current"><a>Displaying """),_display_(Seq[Any](/*159.38*/(currentPage.getPageIndex()+1))),format.raw/*159.68*/(""" of """),_display_(Seq[Any](/*159.73*/currentPage/*159.84*/.getTotalPageCount())),format.raw/*159.104*/(""" Pages</a></li>
              """),_display_(Seq[Any](/*160.16*/if(currentPage.hasNext)/*160.39*/ {_display_(Seq[Any](format.raw/*160.41*/("""
                <li class="next"><a href=""""),_display_(Seq[Any](/*161.44*/link(currentPage.getPageIndex + 1, null))),format.raw/*161.84*/("""">Next &rarr;</a></li>
              """)))}/*162.17*/else/*162.22*/{_display_(Seq[Any](format.raw/*162.23*/("""
                <li class="next disabled"><a>Next &rarr;</a></li>
              """)))})),format.raw/*164.16*/("""
            </ul>
        </div>
	""")))})),format.raw/*167.3*/("""
	"""),_display_(Seq[Any](/*168.3*/if(filterYesNo.matches("yes"))/*168.33*/{_display_(Seq[Any](format.raw/*168.34*/("""
	<div id="pagination" class="pagination">
            <ul class="clearfix">
		<li class="disabled"><a href="">Displaying All Results</a></li>
	    </ul>
        </div>
	""")))})),format.raw/*174.3*/("""

      </div>
    
      """),_display_(Seq[Any](/*178.8*/views/*178.13*/.html.footerunicarb.footerunicarb())),format.raw/*178.48*/("""    
    """)))})),format.raw/*179.6*/("""
        
""")))})),format.raw/*181.2*/("""

            
"""))}
    }
    
    def render(currentPage:com.avaje.ebean.Page[Proteins],currentSortBy:String,currentOrder:String,currentFilter:String,proteins:List[Proteins],filterYesNo:String): play.api.templates.HtmlFormat.Appendable = apply(currentPage,currentSortBy,currentOrder,currentFilter,proteins,filterYesNo)
    
    def f:((com.avaje.ebean.Page[Proteins],String,String,String,List[Proteins],String) => play.api.templates.HtmlFormat.Appendable) = (currentPage,currentSortBy,currentOrder,currentFilter,proteins,filterYesNo) => apply(currentPage,currentSortBy,currentOrder,currentFilter,proteins,filterYesNo)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 02 10:52:56 EST 2014
                    SOURCE: /Users/matthew/git/glycomics_working/app/views/proteinlist.scala.html
                    HASH: a5ac75e0dbda89e476428d27f126a804d2c91860
                    MATRIX: 847->1|1101->936|1115->942|1226->972|1279->989|1291->992|1330->1009|1375->1018|1409->1044|1497->1108|1554->1129|1588->1141|1627->1144|1654->1149|1692->308|1703->312|2245->161|2272->179|2301->306|2329->823|2360->934|2388->1165|2426->1168|2438->1172|2477->1174|2550->1219|2579->1220|2633->1246|2662->1247|2813->1371|2842->1372|2880->1383|2909->1384|2980->1427|3009->1428|3093->1476|3128->1495|3167->1496|3238->1531|3248->1532|3275->1537|3320->1550|3450->1652|3479->1653|3614->1761|3643->1762|3711->1803|3740->1804|4092->2120|4172->2178|4317->2288|4358->2320|4398->2322|4515->2403|4529->2408|4566->2423|4618->2444|4681->2890|4823->2996|4860->3011|5271->3386|5318->3423|5359->3425|5484->3532|5498->3537|5538->3538|5686->3650|5731->3672|5779->3683|5825->3706|5884->3728|5929->3750|5974->3759|6038->3800|6082->3808|6145->3848|6264->3930|6316->3965|6357->3967|6387->4011|6459->4046|6476->4053|6504->4058|6561->4078|6600->4107|6641->4109|6704->4135|6721->4142|6754->4152|6804->4165|6822->4172|6856->4182|6895->4187|6952->4208|7000->4239|7041->4241|7082->4246|7121->4275|7162->4277|7224->4302|7241->4309|7274->4319|7324->4332|7337->4335|7369->4343|7409->4349|7450->4354|7489->4383|7530->4385|7592->4410|7609->4417|7637->4422|7676->4424|7689->4427|7720->4435|7760->4438|7773->4441|7805->4449|7845->4455|7890->4467|7948->4489|7996->4520|8036->4521|8078->4527|8117->4556|8158->4558|8225->4588|8242->4595|8275->4605|8380->4672|8398->4679|8440->4697|8479->4702|8522->4709|8561->4738|8602->4740|8665->4766|8682->4773|8710->4778|8749->4780|8762->4783|8793->4791|8833->4794|8850->4801|8892->4819|8932->4825|8970->4831|9052->4876|9069->4883|9097->4888|9192->4945|9246->4988|9288->4990|9364->5032|9450->5085|9479->5093|9558->5136|9597->5165|9638->5167|9774->5266|9807->5289|9848->5291|9929->5335|9992->5375|10054->5418|10068->5423|10108->5424|10227->5510|10274->5621|10349->5659|10402->5689|10444->5694|10465->5705|10509->5725|10577->5756|10610->5779|10651->5781|10732->5825|10795->5865|10853->5904|10867->5909|10907->5910|11022->5992|11090->6028|11129->6031|11169->6061|11209->6062|11412->6233|11475->6260|11490->6265|11548->6300|11590->6310|11633->6321
                    LINES: 26->1|29->35|29->35|31->35|32->36|32->36|32->36|32->36|32->36|32->36|33->37|33->37|33->37|33->37|35->8|35->8|57->1|58->3|60->7|61->29|64->34|65->39|67->41|67->41|67->41|70->44|70->44|71->45|71->45|75->49|75->49|76->50|76->50|79->53|79->53|81->55|81->55|81->55|82->56|82->56|82->56|83->57|86->60|86->60|88->62|88->62|90->64|90->64|100->74|100->74|103->77|103->77|103->77|105->79|105->79|105->79|107->81|111->89|114->92|114->92|125->103|125->103|125->103|131->109|131->109|131->109|136->114|136->114|137->115|137->115|138->116|138->116|139->117|139->117|140->118|140->118|145->123|145->123|145->123|146->124|148->126|148->126|148->126|149->127|149->127|149->127|149->127|149->127|149->127|149->127|149->127|149->127|149->127|151->129|151->129|151->129|152->130|152->130|152->130|152->130|152->130|152->130|152->130|152->130|152->130|152->130|153->131|153->131|153->131|153->131|153->131|153->131|153->131|153->131|153->131|153->131|153->131|153->131|153->131|154->132|157->135|157->135|157->135|158->136|158->136|158->136|159->137|159->137|159->137|159->137|159->137|159->137|159->137|160->138|160->138|160->138|160->138|160->138|160->138|160->138|160->138|160->138|160->138|160->138|160->138|160->138|162->140|164->142|164->142|164->142|164->142|164->142|164->142|164->142|166->144|167->145|172->150|172->150|172->150|175->153|175->153|175->153|176->154|176->154|177->155|177->155|177->155|179->157|180->158|181->159|181->159|181->159|181->159|181->159|182->160|182->160|182->160|183->161|183->161|184->162|184->162|184->162|186->164|189->167|190->168|190->168|190->168|196->174|200->178|200->178|200->178|201->179|203->181
                    -- GENERATED --
                */
            