
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
object pubmed extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,List[Method],List[TissueTaxonomy],List[Disease],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(p: String, method: List[Method], tissue: List[TissueTaxonomy], disease: List[Disease]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.89*/("""
"""),_display_(Seq[Any](/*2.2*/main/*2.6*/{_display_(Seq[Any](format.raw/*2.7*/("""

<script src=""""),_display_(Seq[Any](/*4.15*/routes/*4.21*/.Assets.at("/public","javascripts/Biojs.js"))),format.raw/*4.65*/(""""></script>
<script src=""""),_display_(Seq[Any](/*5.15*/routes/*5.21*/.Assets.at("/public","javascripts/Biojs.Sequence.js"))),format.raw/*5.74*/(""""></script>
<script src=""""),_display_(Seq[Any](/*6.15*/routes/*6.21*/.Assets.at("/public","javascripts/Biojs.EbiGlobalSearch.js"))),format.raw/*6.81*/(""""></script>

"""),format.raw/*11.3*/("""

<script>
      $(document).ready(function()"""),format.raw/*14.35*/("""{"""),format.raw/*14.36*/("""
        $("#e1").select2("""),format.raw/*15.26*/("""{"""),format.raw/*15.27*/("""
          placeholder: "Select multiple tissues...",
          allowClear: true,
        minimumInputLength: 1,
        """),format.raw/*19.9*/("""}"""),format.raw/*19.10*/(""");
        """),format.raw/*20.9*/("""}"""),format.raw/*20.10*/(""");
</script>
<script>
      $(document).ready(function()"""),format.raw/*23.35*/("""{"""),format.raw/*23.36*/("""
        $("#e2").select2("""),format.raw/*24.26*/("""{"""),format.raw/*24.27*/("""
          placeholder: "Select multiple disease states... ",
          allowClear: true,
          minimumInputLength: 1,
        """),format.raw/*28.9*/("""}"""),format.raw/*28.10*/(""");
        """),format.raw/*29.9*/("""}"""),format.raw/*29.10*/(""");
</script>

<script>
        $(function() """),format.raw/*33.22*/("""{"""),format.raw/*33.23*/("""
        var myArray = new Array();
        """),_display_(Seq[Any](/*35.10*/for(a <- tissue) yield /*35.26*/{_display_(Seq[Any](format.raw/*35.27*/("""
                myArray.push(""""),_display_(Seq[Any](/*36.32*/a/*36.33*/.tissue_taxon)),format.raw/*36.46*/("""");
        """)))})),format.raw/*37.10*/("""
        myArray.sort();
        options = '';
        for (var i = 0; i < myArray.length; i++) """),format.raw/*40.50*/("""{"""),format.raw/*40.51*/("""
                options += '<option value="' + myArray[i] + '">' + myArray[i] + '</option>';
        """),format.raw/*42.9*/("""}"""),format.raw/*42.10*/("""
        $('#e1').html(options);
        """),format.raw/*44.9*/("""}"""),format.raw/*44.10*/(""");
</script>

<script>
        $(function() """),format.raw/*48.22*/("""{"""),format.raw/*48.23*/("""
        var myArray = new Array();
        """),_display_(Seq[Any](/*50.10*/for(a <- disease) yield /*50.27*/{_display_(Seq[Any](format.raw/*50.28*/("""
                myArray.push(""""),_display_(Seq[Any](/*51.32*/a/*51.33*/.disease_name)),format.raw/*51.46*/("""");
        """)))})),format.raw/*52.10*/("""
        myArray.sort();
        options = '';
        for (var i = 0; i < myArray.length; i++) """),format.raw/*55.50*/("""{"""),format.raw/*55.51*/("""
                options += '<option value="' + myArray[i] + '">' + myArray[i] + '</option>';
        """),format.raw/*57.9*/("""}"""),format.raw/*57.10*/("""
        $('#e2').html(options);
        """),format.raw/*59.9*/("""}"""),format.raw/*59.10*/(""");
</script>


<script>
	var textfront = "front-";

    var textend = "-back";
    var pubmedid = "";

	

    $(document).ready(function() """),format.raw/*71.34*/("""{"""),format.raw/*71.35*/("""

        $('.update').click(
            function ()"""),format.raw/*74.24*/("""{"""),format.raw/*74.25*/("""pubmed(); """),format.raw/*74.35*/("""}"""),format.raw/*74.36*/("""
        );
        $('.clear').click(
              function ()"""),format.raw/*77.26*/("""{"""),format.raw/*77.27*/("""clear(); """),format.raw/*77.36*/("""}"""),format.raw/*77.37*/("""
        );
        
    """),format.raw/*80.5*/("""}"""),format.raw/*80.6*/(""");

    function update()
    """),format.raw/*83.5*/("""{"""),format.raw/*83.6*/("""
        //$('div.update-here').html(textfront+$('.update-it input').val()+textend);
	console.log("hello" + $('.update-it input').val()  );
	var pubmedid = $('.update-it input').val();
	var xx = String($('.update-it input').val());
    """),format.raw/*88.5*/("""}"""),format.raw/*88.6*/("""
    function clear()
    """),format.raw/*90.5*/("""{"""),format.raw/*90.6*/("""
        $('div.update-here').html($(''));
    """),format.raw/*92.5*/("""}"""),format.raw/*92.6*/("""


	function pubmed() """),format.raw/*95.20*/("""{"""),format.raw/*95.21*/("""
		console.log("check id entered only: " + $('.update-it input').val()  );
		var pubmedid = $('.update-it input').val();
		document.getElementById('pubmedresult').value=pubmedid;
		
	        args = """),format.raw/*100.17*/("""{"""),format.raw/*100.18*/("""'apikey'  : '191d24f81e61c107bca103f7d6a9ca10',
	                'dbfrom'  : 'pubmed',
	                'id'      : pubmedid,
	                'db'      : 'pubmed',
	                'mindate' : '1990',
	                'datetype': 'pdat',
	                'max'     : '1'"""),format.raw/*106.33*/("""}"""),format.raw/*106.34*/("""

	        $.getJSON('http://entrezajax.appspot.com/elink+esummary?callback=?', args, function(data) """),format.raw/*108.100*/("""{"""),format.raw/*108.101*/("""                $('#result').html('');
	                $.each(data.result, function(i, item) """),format.raw/*109.56*/("""{"""),format.raw/*109.57*/("""
	                        var author_list = '';
	                        for(var i = 0; i < item.AuthorList.length; i ++) """),format.raw/*111.75*/("""{"""),format.raw/*111.76*/("""
	                                if(i != 0) """),format.raw/*112.45*/("""{"""),format.raw/*112.46*/("""
	                                        author_list += ', ';
	                                """),format.raw/*114.34*/("""}"""),format.raw/*114.35*/("""
	                                author_list += item.AuthorList[i];
	                        """),format.raw/*116.26*/("""}"""),format.raw/*116.27*/("""
	                        var html = '<p><a href=\'http://www.ncbi.nlm.nih.gov/pubmed/' + item.ArticleIds.pubmed + '\'>' + item.Title + '</a><br/>' + author_list + '<br/>' + item.FullJournalName + ' ' + item.PubDate + '</p>';
	                        $("<div/>").html(html).appendTo('#result');
	                """),format.raw/*119.18*/("""}"""),format.raw/*119.19*/(""");
	        """),format.raw/*120.10*/("""}"""),format.raw/*120.11*/(""");
	"""),format.raw/*121.2*/("""}"""),format.raw/*121.3*/(""";

</script>


"""),format.raw/*128.3*/("""


<ul class="breadcrumb">
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

          <div class="update-here">
          </div>

          <div id="result">
            Contacting NCBI Entrez ...
          </div>

        </div> """),format.raw/*185.33*/("""

        <div id="workflow2" class="tab-pane control-group row-fluid eurocarb">
          <h3>Selected (multiple) reported method(s)</h3>
          <form>
            <select name="method" multiple size="10">
              """),_display_(Seq[Any](/*191.16*/for(m <- method) yield /*191.32*/ {_display_(Seq[Any](format.raw/*191.34*/(""" <option value=""""),_display_(Seq[Any](/*191.51*/m/*191.52*/.id)),format.raw/*191.55*/("""">"""),_display_(Seq[Any](/*191.58*/m/*191.59*/.description)),format.raw/*191.71*/("""</option> """)))})),format.raw/*191.82*/("""
            </select>
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

        <div id="workflow3" class="tab-pane control-group nextprot">


        </div> """),format.raw/*214.36*/("""

      </div>

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

""")))})),format.raw/*235.2*/("""
"""))}
    }
    
    def render(p:String,method:List[Method],tissue:List[TissueTaxonomy],disease:List[Disease]): play.api.templates.HtmlFormat.Appendable = apply(p,method,tissue,disease)
    
    def f:((String,List[Method],List[TissueTaxonomy],List[Disease]) => play.api.templates.HtmlFormat.Appendable) = (p,method,tissue,disease) => apply(p,method,tissue,disease)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 02 10:52:56 EST 2014
                    SOURCE: /Users/matthew/git/glycomics_working/app/views/pubmed.scala.html
                    HASH: 2a43c6a6356c023e97b4b7bde486d4c5f8b3ba66
                    MATRIX: 823->1|1004->88|1040->90|1051->94|1088->95|1139->111|1153->117|1218->161|1279->187|1293->193|1367->246|1428->272|1442->278|1523->338|1563->584|1636->629|1665->630|1719->656|1748->657|1896->778|1925->779|1963->790|1992->791|2076->847|2105->848|2159->874|2188->875|2346->1006|2375->1007|2413->1018|2442->1019|2514->1063|2543->1064|2624->1109|2656->1125|2695->1126|2763->1158|2773->1159|2808->1172|2853->1185|2977->1281|3006->1282|3135->1384|3164->1385|3232->1426|3261->1427|3333->1471|3362->1472|3443->1517|3476->1534|3515->1535|3583->1567|3593->1568|3628->1581|3673->1594|3797->1690|3826->1691|3955->1793|3984->1794|4052->1835|4081->1836|4248->1975|4277->1976|4358->2029|4387->2030|4425->2040|4454->2041|4546->2105|4575->2106|4612->2115|4641->2116|4693->2141|4721->2142|4778->2172|4806->2173|5069->2409|5097->2410|5150->2436|5178->2437|5252->2484|5280->2485|5330->2507|5359->2508|5586->2706|5616->2707|5916->2978|5946->2979|6077->3080|6108->3081|6231->3175|6261->3176|6412->3298|6442->3299|6516->3344|6546->3345|6671->3441|6701->3442|6824->3536|6854->3537|7195->3849|7225->3850|7266->3862|7296->3863|7328->3867|7357->3868|7400->3931|9046->5605|9231->5778|9493->6003|9526->6019|9567->6021|9621->6038|9632->6039|9658->6042|9698->6045|9709->6046|9744->6058|9788->6069|10522->6794|10639->6902|11159->7390
                    LINES: 26->1|29->1|30->2|30->2|30->2|32->4|32->4|32->4|33->5|33->5|33->5|34->6|34->6|34->6|36->11|39->14|39->14|40->15|40->15|44->19|44->19|45->20|45->20|48->23|48->23|49->24|49->24|53->28|53->28|54->29|54->29|58->33|58->33|60->35|60->35|60->35|61->36|61->36|61->36|62->37|65->40|65->40|67->42|67->42|69->44|69->44|73->48|73->48|75->50|75->50|75->50|76->51|76->51|76->51|77->52|80->55|80->55|82->57|82->57|84->59|84->59|96->71|96->71|99->74|99->74|99->74|99->74|102->77|102->77|102->77|102->77|105->80|105->80|108->83|108->83|113->88|113->88|115->90|115->90|117->92|117->92|120->95|120->95|125->100|125->100|131->106|131->106|133->108|133->108|134->109|134->109|136->111|136->111|137->112|137->112|139->114|139->114|141->116|141->116|144->119|144->119|145->120|145->120|146->121|146->121|151->128|199->176|208->185|214->191|214->191|214->191|214->191|214->191|214->191|214->191|214->191|214->191|214->191|232->209|237->214|258->235
                    -- GENERATED --
                */
            