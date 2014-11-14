
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
object pubmed extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,List[Method],List[TissueTaxonomy],List[Disease],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(p: String, method: List[Method], tissue: List[TissueTaxonomy], disease: List[Disease]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.89*/("""
"""),_display_(/*2.2*/main/*2.6*/{_display_(Seq[Any](format.raw/*2.7*/("""

"""),format.raw/*4.1*/("""<script src=""""),_display_(/*4.15*/routes/*4.21*/.Assets.at("/public","javascripts/Biojs.js")),format.raw/*4.65*/(""""></script>
<script src=""""),_display_(/*5.15*/routes/*5.21*/.Assets.at("/public","javascripts/Biojs.Sequence.js")),format.raw/*5.74*/(""""></script>
<script src=""""),_display_(/*6.15*/routes/*6.21*/.Assets.at("/public","javascripts/Biojs.EbiGlobalSearch.js")),format.raw/*6.81*/(""""></script>

"""),format.raw/*11.3*/("""

"""),format.raw/*13.1*/("""<script>
      $(document).ready(function()"""),format.raw/*14.35*/("""{"""),format.raw/*14.36*/("""
        """),format.raw/*15.9*/("""$("#e1").select2("""),format.raw/*15.26*/("""{"""),format.raw/*15.27*/("""
          """),format.raw/*16.11*/("""placeholder: "Select multiple tissues...",
          allowClear: true,
        minimumInputLength: 1,
        """),format.raw/*19.9*/("""}"""),format.raw/*19.10*/(""");
        """),format.raw/*20.9*/("""}"""),format.raw/*20.10*/(""");
</script>
<script>
      $(document).ready(function()"""),format.raw/*23.35*/("""{"""),format.raw/*23.36*/("""
        """),format.raw/*24.9*/("""$("#e2").select2("""),format.raw/*24.26*/("""{"""),format.raw/*24.27*/("""
          """),format.raw/*25.11*/("""placeholder: "Select multiple disease states... ",
          allowClear: true,
          minimumInputLength: 1,
        """),format.raw/*28.9*/("""}"""),format.raw/*28.10*/(""");
        """),format.raw/*29.9*/("""}"""),format.raw/*29.10*/(""");
</script>

<script>
        $(function() """),format.raw/*33.22*/("""{"""),format.raw/*33.23*/("""
        """),format.raw/*34.9*/("""var myArray = new Array();
        """),_display_(/*35.10*/for(a <- tissue) yield /*35.26*/{_display_(Seq[Any](format.raw/*35.27*/("""
                """),format.raw/*36.17*/("""myArray.push(""""),_display_(/*36.32*/a/*36.33*/.tissue_taxon),format.raw/*36.46*/("""");
        """)))}),format.raw/*37.10*/("""
        """),format.raw/*38.9*/("""myArray.sort();
        options = '';
        for (var i = 0; i < myArray.length; i++) """),format.raw/*40.50*/("""{"""),format.raw/*40.51*/("""
                """),format.raw/*41.17*/("""options += '<option value="' + myArray[i] + '">' + myArray[i] + '</option>';
        """),format.raw/*42.9*/("""}"""),format.raw/*42.10*/("""
        """),format.raw/*43.9*/("""$('#e1').html(options);
        """),format.raw/*44.9*/("""}"""),format.raw/*44.10*/(""");
</script>

<script>
        $(function() """),format.raw/*48.22*/("""{"""),format.raw/*48.23*/("""
        """),format.raw/*49.9*/("""var myArray = new Array();
        """),_display_(/*50.10*/for(a <- disease) yield /*50.27*/{_display_(Seq[Any](format.raw/*50.28*/("""
                """),format.raw/*51.17*/("""myArray.push(""""),_display_(/*51.32*/a/*51.33*/.disease_name),format.raw/*51.46*/("""");
        """)))}),format.raw/*52.10*/("""
        """),format.raw/*53.9*/("""myArray.sort();
        options = '';
        for (var i = 0; i < myArray.length; i++) """),format.raw/*55.50*/("""{"""),format.raw/*55.51*/("""
                """),format.raw/*56.17*/("""options += '<option value="' + myArray[i] + '">' + myArray[i] + '</option>';
        """),format.raw/*57.9*/("""}"""),format.raw/*57.10*/("""
        """),format.raw/*58.9*/("""$('#e2').html(options);
        """),format.raw/*59.9*/("""}"""),format.raw/*59.10*/(""");
</script>


<script>
	var textfront = "front-";

    var textend = "-back";
    var pubmedid = "";

	

    $(document).ready(function() """),format.raw/*71.34*/("""{"""),format.raw/*71.35*/("""

        """),format.raw/*73.9*/("""$('.update').click(
            function ()"""),format.raw/*74.24*/("""{"""),format.raw/*74.25*/("""pubmed(); """),format.raw/*74.35*/("""}"""),format.raw/*74.36*/("""
        """),format.raw/*75.9*/(""");
        $('.clear').click(
              function ()"""),format.raw/*77.26*/("""{"""),format.raw/*77.27*/("""clear(); """),format.raw/*77.36*/("""}"""),format.raw/*77.37*/("""
        """),format.raw/*78.9*/(""");
        
    """),format.raw/*80.5*/("""}"""),format.raw/*80.6*/(""");

    function update()
    """),format.raw/*83.5*/("""{"""),format.raw/*83.6*/("""
        """),format.raw/*84.9*/("""//$('div.update-here').html(textfront+$('.update-it input').val()+textend);
	console.log("hello" + $('.update-it input').val()  );
	var pubmedid = $('.update-it input').val();
	var xx = String($('.update-it input').val());
    """),format.raw/*88.5*/("""}"""),format.raw/*88.6*/("""
    """),format.raw/*89.5*/("""function clear()
    """),format.raw/*90.5*/("""{"""),format.raw/*90.6*/("""
        """),format.raw/*91.9*/("""$('div.update-here').html($(''));
    """),format.raw/*92.5*/("""}"""),format.raw/*92.6*/("""


	"""),format.raw/*95.2*/("""function pubmed() """),format.raw/*95.20*/("""{"""),format.raw/*95.21*/("""
		"""),format.raw/*96.3*/("""console.log("check id entered only: " + $('.update-it input').val()  );
		var pubmedid = $('.update-it input').val();
		document.getElementById('pubmedresult').value=pubmedid;
		
	        args = """),format.raw/*100.17*/("""{"""),format.raw/*100.18*/("""'apikey'  : '191d24f81e61c107bca103f7d6a9ca10',
	                'dbfrom'  : 'pubmed',
	                'id'      : pubmedid,
	                'db'      : 'pubmed',
	                'mindate' : '1990',
	                'datetype': 'pdat',
	                'max'     : '1'"""),format.raw/*106.33*/("""}"""),format.raw/*106.34*/("""

	        """),format.raw/*108.10*/("""$.getJSON('http://entrezajax.appspot.com/elink+esummary?callback=?', args, function(data) """),format.raw/*108.100*/("""{"""),format.raw/*108.101*/("""                """),format.raw/*108.117*/("""$('#result').html('');
	                $.each(data.result, function(i, item) """),format.raw/*109.56*/("""{"""),format.raw/*109.57*/("""
	                        """),format.raw/*110.26*/("""var author_list = '';
	                        for(var i = 0; i < item.AuthorList.length; i ++) """),format.raw/*111.75*/("""{"""),format.raw/*111.76*/("""
	                                """),format.raw/*112.34*/("""if(i != 0) """),format.raw/*112.45*/("""{"""),format.raw/*112.46*/("""
	                                        """),format.raw/*113.42*/("""author_list += ', ';
	                                """),format.raw/*114.34*/("""}"""),format.raw/*114.35*/("""
	                                """),format.raw/*115.34*/("""author_list += item.AuthorList[i];
	                        """),format.raw/*116.26*/("""}"""),format.raw/*116.27*/("""
	                        """),format.raw/*117.26*/("""var html = '<p><a href=\'http://www.ncbi.nlm.nih.gov/pubmed/' + item.ArticleIds.pubmed + '\'>' + item.Title + '</a><br/>' + author_list + '<br/>' + item.FullJournalName + ' ' + item.PubDate + '</p>';
	                        $("<div/>").html(html).appendTo('#result');
	                """),format.raw/*119.18*/("""}"""),format.raw/*119.19*/(""");
	        """),format.raw/*120.10*/("""}"""),format.raw/*120.11*/(""");
	"""),format.raw/*121.2*/("""}"""),format.raw/*121.3*/(""";

</script>


"""),format.raw/*128.3*/("""


"""),format.raw/*131.1*/("""<ul class="breadcrumb">
  <li><i class="icon-home" ></i><a href="/"> UniCarbKB</a> <span class="divider">></span></li>
  <li class="active"><i class="icon-briefcase" ></i> Data Entry<span class="divider"></span></li>
</ul>

<section id="layouts" class="browse">
  <div class="page-header row-fluid">
    <h1>Data Submission</h1>
    <h4 class="subheader">UnicarbKB Mass Spec details.</h4>
  </div>

  <div class="row-fluid">
    <div class="span4 search">
      <div class="row-fluid">
        <div class="filterbar tabbable clearfix">
          <ul class="nav nav-tabs" id="myTabBar">
            <li id='workflow1-toggle' class='active'><a href='#workflow1' data-toggle="tab">Pubmed ID<span class="pull-right count"></span></a></li>
            <li id='workflow2-toggle'><a href='#workflow2' data-toggle="tab">Method</a></li>
            <li id='workflow3-toggle'><a href='#workflow3' data-toggle="tab">UniProt<span class="pull-right count"></span></a></li>
          </ul>
        </div>
        <div class='info'>
          <h3>Mass Spec Details</h3>
        </div>

      </div>
    </div>

    <div class="span8 rightpanel">






      <div class='tab-content span12'>

        <div id="workflow1" class="tab-pane active control-group glycosuitedb update-it">

          <h3>Find details associated with a Pubmed unique identifier:</h3> 
          <div class='input-append'>
            <input class='input-xlarge' type="text" name="update" />
            <button type="button" class="update btn btn-primary" data-loading-text="Loading..." value="update">Load Pubmed Id</button>
          </div>

          """),format.raw/*176.68*/("""

          """),format.raw/*178.11*/("""<div class="update-here">
          </div>

          <div id="result">
            Contacting NCBI Entrez ...
          </div>

        </div> """),format.raw/*185.33*/("""

        """),format.raw/*187.9*/("""<div id="workflow2" class="tab-pane control-group row-fluid eurocarb">
          <h3>Selected (multiple) reported method(s)</h3>
          <form>
            <select name="method" multiple size="10">
              """),_display_(/*191.16*/for(m <- method) yield /*191.32*/ {_display_(Seq[Any](format.raw/*191.34*/(""" """),format.raw/*191.35*/("""<option value=""""),_display_(/*191.51*/m/*191.52*/.id),format.raw/*191.55*/("""">"""),_display_(/*191.58*/m/*191.59*/.description),format.raw/*191.71*/("""</option> """)))}),format.raw/*191.82*/("""
            """),format.raw/*192.13*/("""</select>
            <p><--- Add New ---></p>

            UniProt ID: <input type="text" id="uniprotid" name="uniprot">
            <input type="hidden" id="pubmedresult" value=""/>

            <div id="selection" class="row-fluid">
              <select  name=tissue MULTIPLE id="e1" id="listBox" class="span10"></select>
              <button type="submit" class="btn btn-primary">Search</button>
            </div>

            <div id="selection" class="row-fluid">
              <select  name=tissue MULTIPLE id="e2" id="listBox" class="span10"></select>
              <button type="submit" class="btn btn-primary">Search</button>
            </div>

          </form>
        </div> """),format.raw/*209.36*/("""

        """),format.raw/*211.9*/("""<div id="workflow3" class="tab-pane control-group nextprot">


        </div> """),format.raw/*214.36*/("""

      """),format.raw/*216.7*/("""</div>

    </div>
  </div>
</div><!-- /col -->
</div><!-- /row -->
<div class="footer row-fluid">
  <div class="span12">
    <p class="pull-left">UniCarbKB</p>
    <p class="pull-right">Supported by 
      <a href="http://www.nectar.org.au">NeCTAR</a> &nbsp;|&nbsp; 
      <a href="http://www.ands.org.au">ANDS</a> &nbsp;|&nbsp;
      <a href="http://www.stint.se"> STINT</a> &nbsp;|&nbsp;
      <a href="http://expasy.org/"> SIB ExPASy</a>
    </p>
  </div>
</div>
</section>

""")))}),format.raw/*235.2*/("""
"""))}
  }

  def render(p:String,method:List[Method],tissue:List[TissueTaxonomy],disease:List[Disease]): play.twirl.api.HtmlFormat.Appendable = apply(p,method,tissue,disease)

  def f:((String,List[Method],List[TissueTaxonomy],List[Disease]) => play.twirl.api.HtmlFormat.Appendable) = (p,method,tissue,disease) => apply(p,method,tissue,disease)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Nov 14 11:35:23 EST 2014
                  SOURCE: /Users/matthew/git/glycomics_working/app/views/pubmed.scala.html
                  HASH: 32d41e918272ab076c00d2d77254beb683f58b2e
                  MATRIX: 772->1|947->88|974->90|985->94|1022->95|1050->97|1090->111|1104->117|1168->161|1220->187|1234->193|1307->246|1359->272|1373->278|1453->338|1493->584|1522->586|1593->629|1622->630|1658->639|1703->656|1732->657|1771->668|1908->778|1937->779|1975->790|2004->791|2088->847|2117->848|2153->857|2198->874|2227->875|2266->886|2413->1006|2442->1007|2480->1018|2509->1019|2581->1063|2610->1064|2646->1073|2709->1109|2741->1125|2780->1126|2825->1143|2867->1158|2877->1159|2911->1172|2955->1185|2991->1194|3106->1281|3135->1282|3180->1299|3292->1384|3321->1385|3357->1394|3416->1426|3445->1427|3517->1471|3546->1472|3582->1481|3645->1517|3678->1534|3717->1535|3762->1552|3804->1567|3814->1568|3848->1581|3892->1594|3928->1603|4043->1690|4072->1691|4117->1708|4229->1793|4258->1794|4294->1803|4353->1835|4382->1836|4549->1975|4578->1976|4615->1986|4686->2029|4715->2030|4753->2040|4782->2041|4818->2050|4901->2105|4930->2106|4967->2115|4996->2116|5032->2125|5075->2141|5103->2142|5160->2172|5188->2173|5224->2182|5478->2409|5506->2410|5538->2415|5586->2436|5614->2437|5650->2446|5715->2484|5743->2485|5774->2489|5820->2507|5849->2508|5879->2511|6103->2706|6133->2707|6433->2978|6463->2979|6503->2990|6623->3080|6654->3081|6700->3097|6807->3175|6837->3176|6892->3202|7017->3298|7047->3299|7110->3333|7150->3344|7180->3345|7251->3387|7334->3441|7364->3442|7427->3476|7516->3536|7546->3537|7601->3563|7916->3849|7946->3850|7987->3862|8017->3863|8049->3867|8078->3868|8121->3931|8152->3934|9795->5605|9836->5617|10009->5778|10047->5788|10290->6003|10323->6019|10364->6021|10394->6022|10438->6038|10449->6039|10474->6042|10505->6045|10516->6046|10550->6058|10593->6069|10635->6082|11356->6794|11394->6804|11501->6902|11537->6910|12048->7390
                  LINES: 26->1|29->1|30->2|30->2|30->2|32->4|32->4|32->4|32->4|33->5|33->5|33->5|34->6|34->6|34->6|36->11|38->13|39->14|39->14|40->15|40->15|40->15|41->16|44->19|44->19|45->20|45->20|48->23|48->23|49->24|49->24|49->24|50->25|53->28|53->28|54->29|54->29|58->33|58->33|59->34|60->35|60->35|60->35|61->36|61->36|61->36|61->36|62->37|63->38|65->40|65->40|66->41|67->42|67->42|68->43|69->44|69->44|73->48|73->48|74->49|75->50|75->50|75->50|76->51|76->51|76->51|76->51|77->52|78->53|80->55|80->55|81->56|82->57|82->57|83->58|84->59|84->59|96->71|96->71|98->73|99->74|99->74|99->74|99->74|100->75|102->77|102->77|102->77|102->77|103->78|105->80|105->80|108->83|108->83|109->84|113->88|113->88|114->89|115->90|115->90|116->91|117->92|117->92|120->95|120->95|120->95|121->96|125->100|125->100|131->106|131->106|133->108|133->108|133->108|133->108|134->109|134->109|135->110|136->111|136->111|137->112|137->112|137->112|138->113|139->114|139->114|140->115|141->116|141->116|142->117|144->119|144->119|145->120|145->120|146->121|146->121|151->128|154->131|199->176|201->178|208->185|210->187|214->191|214->191|214->191|214->191|214->191|214->191|214->191|214->191|214->191|214->191|214->191|215->192|232->209|234->211|237->214|239->216|258->235
                  -- GENERATED --
              */
          