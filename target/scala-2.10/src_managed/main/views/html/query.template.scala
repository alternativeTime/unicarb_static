
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
object query extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template18[List[String],ArrayList[Taxonomy],List[Biolsource],List[List[String]],HashSet[String],HashSet[String],ArrayList[Proteins],ArrayList[Tissue],List[Tissue],List[GlycobaseSource],List[String],Integer,List[String],Integer,List[String],Integer,HashSet[String],ArrayList[Proteins],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(taxonomy: List[String], taxon: ArrayList[Taxonomy],  biolsource: List[Biolsource], groupTax: List[List[String]], sources: HashSet[String], proteins: HashSet[String], proteinList: ArrayList[Proteins], tissueList: ArrayList[Tissue], tissueTerms: List[Tissue], glycobasePerturbation: List[GlycobaseSource], output: List[String], count: Integer, outputtissue: List[String], counttissue: Integer, outputprotein: List[String], countprotein: Integer, proteinaccession: HashSet[String],  accsearch: ArrayList[Proteins]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.514*/("""

"""),_display_(Seq[Any](/*3.2*/main/*3.6*/{_display_(Seq[Any](format.raw/*3.7*/("""

<script>
  $(function() """),format.raw/*6.16*/("""{"""),format.raw/*6.17*/("""
  $(".glycanType .btn").click(function() """),format.raw/*7.42*/("""{"""),format.raw/*7.43*/("""
    $("#glycanType").val($(this).text());
  """),format.raw/*9.3*/("""}"""),format.raw/*9.4*/("""); """),format.raw/*9.7*/("""}"""),format.raw/*9.8*/("""); 
</script>

<script>
$(document).ready(function() """),format.raw/*13.30*/("""{"""),format.raw/*13.31*/("""
$('#myTabBar a[data-toggle="tab"]').on('shown', function (e) """),format.raw/*14.62*/("""{"""),format.raw/*14.63*/("""
  e.target // activated tab
  var filterstring = e.target.toString();
  var filtervalue =filterstring.split('#');
  var name = filtervalue[1];

  if(name == "filter3")"""),format.raw/*20.24*/("""{"""),format.raw/*20.25*/("""
   $('.glycobase').show();
  """),format.raw/*22.3*/("""}"""),format.raw/*22.4*/("""
  if(name != "filter3")"""),format.raw/*23.24*/("""{"""),format.raw/*23.25*/("""
   $('.glycobase').hide();
  """),format.raw/*25.3*/("""}"""),format.raw/*25.4*/("""

  if(name == "filter1")"""),format.raw/*27.24*/("""{"""),format.raw/*27.25*/("""
   $('.glycosuiteResult').show();
  """),format.raw/*29.3*/("""}"""),format.raw/*29.4*/("""

  if(name != "filter1")"""),format.raw/*31.24*/("""{"""),format.raw/*31.25*/("""
   $('.glycosuiteResult').hide();
  """),format.raw/*33.3*/("""}"""),format.raw/*33.4*/("""

  
"""),format.raw/*36.1*/("""}"""),format.raw/*36.2*/(""");
"""),format.raw/*37.1*/("""}"""),format.raw/*37.2*/(""");
</script>

<script>
      $(document).ready(function()"""),format.raw/*41.35*/("""{"""),format.raw/*41.36*/("""
        $("#e12").select2("""),format.raw/*42.27*/("""{"""),format.raw/*42.28*/("""
          placeholder: "Select SwissProt ID...",
          allowClear: true,
        minimumInputLength: 1,
        """),format.raw/*46.9*/("""}"""),format.raw/*46.10*/(""");
        """),format.raw/*47.9*/("""}"""),format.raw/*47.10*/(""");
</script>

<script>
      $(document).ready(function()"""),format.raw/*51.35*/("""{"""),format.raw/*51.36*/("""
        $("#e13").select2("""),format.raw/*52.27*/("""{"""),format.raw/*52.28*/("""
          placeholder: "Select SwissProt ID...",
          allowClear: true,
        minimumInputLength: 1,
        """),format.raw/*56.9*/("""}"""),format.raw/*56.10*/(""");
        """),format.raw/*57.9*/("""}"""),format.raw/*57.10*/(""");
</script>


<script>
      $(document).ready(function()"""),format.raw/*62.35*/("""{"""),format.raw/*62.36*/("""
        $("#e1").select2("""),format.raw/*63.26*/("""{"""),format.raw/*63.27*/("""
          placeholder: "Select multiple species...",
          allowClear: true,
	minimumInputLength: 1,
        """),format.raw/*67.9*/("""}"""),format.raw/*67.10*/(""");
	"""),format.raw/*68.2*/("""}"""),format.raw/*68.3*/(""");
</script>
<script>
      $(document).ready(function()"""),format.raw/*71.35*/("""{"""),format.raw/*71.36*/("""
        $("#e2").select2("""),format.raw/*72.26*/("""{"""),format.raw/*72.27*/("""
          placeholder: "Select multiple tissues... ",
          allowClear: true,
	  minimumInputLength: 1,
        """),format.raw/*76.9*/("""}"""),format.raw/*76.10*/(""");
        """),format.raw/*77.9*/("""}"""),format.raw/*77.10*/(""");
</script>
<script>
      $(document).ready(function()"""),format.raw/*80.35*/("""{"""),format.raw/*80.36*/("""
        $("#e3").select2("""),format.raw/*81.26*/("""{"""),format.raw/*81.27*/("""
          placeholder: "Select multiple proteins...",
          allowClear: true,
	  minimumInputLength: 1,
        """),format.raw/*85.9*/("""}"""),format.raw/*85.10*/(""");
        """),format.raw/*86.9*/("""}"""),format.raw/*86.10*/(""");
</script>

<script>
      $(document).ready(function()"""),format.raw/*90.35*/("""{"""),format.raw/*90.36*/("""
        $("#e4").select2("""),format.raw/*91.26*/("""{"""),format.raw/*91.27*/("""
          placeholder: "Select multiple tissues...",
          allowClear: true,
	  minimumInputLength: 1,
        """),format.raw/*95.9*/("""}"""),format.raw/*95.10*/(""");
        """),format.raw/*96.9*/("""}"""),format.raw/*96.10*/(""");
</script>

<script>
      $(document).ready(function()"""),format.raw/*100.35*/("""{"""),format.raw/*100.36*/("""
        $("#e5").select2("""),format.raw/*101.26*/("""{"""),format.raw/*101.27*/("""
          placeholder: "Select multiple species...",
          allowClear: true,
	  minimumInputLength: 1,
        """),format.raw/*105.9*/("""}"""),format.raw/*105.10*/(""");
        """),format.raw/*106.9*/("""}"""),format.raw/*106.10*/(""");
</script>

<script>
      $(document).ready(function()"""),format.raw/*110.35*/("""{"""),format.raw/*110.36*/("""
        $("#e6").select2("""),format.raw/*111.26*/("""{"""),format.raw/*111.27*/("""
          placeholder: "Select multiple proteins...",
          allowClear: true,
	  minimumInputLength: 1,
        """),format.raw/*115.9*/("""}"""),format.raw/*115.10*/(""");
        """),format.raw/*116.9*/("""}"""),format.raw/*116.10*/(""");
</script>

<script>
      $(document).ready(function()"""),format.raw/*120.35*/("""{"""),format.raw/*120.36*/("""
        $("#e7").select2("""),format.raw/*121.26*/("""{"""),format.raw/*121.27*/("""
          placeholder: "Select multiple species...",
          allowClear: true,
	  minimumInputLength: 1,
        """),format.raw/*125.9*/("""}"""),format.raw/*125.10*/(""");
        """),format.raw/*126.9*/("""}"""),format.raw/*126.10*/(""");
</script>

<script>
      $(document).ready(function()"""),format.raw/*130.35*/("""{"""),format.raw/*130.36*/("""
        $("#e8").select2("""),format.raw/*131.26*/("""{"""),format.raw/*131.27*/("""
          placeholder: "Select multiple tissues...",
          allowClear: true,
	  minimumInputLength: 1,
        """),format.raw/*135.9*/("""}"""),format.raw/*135.10*/(""");
        """),format.raw/*136.9*/("""}"""),format.raw/*136.10*/(""");
</script>

<script>
      $(document).ready(function()"""),format.raw/*140.35*/("""{"""),format.raw/*140.36*/("""
        $("#e9").select2("""),format.raw/*141.26*/("""{"""),format.raw/*141.27*/("""
          placeholder: "Select multiple species...",
          allowClear: true,
	  minimumInputLength: 1,
        """),format.raw/*145.9*/("""}"""),format.raw/*145.10*/(""");
        """),format.raw/*146.9*/("""}"""),format.raw/*146.10*/(""");
</script>

<script>
      $(document).ready(function()"""),format.raw/*150.35*/("""{"""),format.raw/*150.36*/("""
        $("#e10").select2("""),format.raw/*151.27*/("""{"""),format.raw/*151.28*/("""
          placeholder: "Select multiple tissues...",
          allowClear: true,
          minimumInputLength: 1,
        """),format.raw/*155.9*/("""}"""),format.raw/*155.10*/(""");
        """),format.raw/*156.9*/("""}"""),format.raw/*156.10*/(""");
</script>

<script>
      $(document).ready(function()"""),format.raw/*160.35*/("""{"""),format.raw/*160.36*/("""
        $("#e11").select2("""),format.raw/*161.27*/("""{"""),format.raw/*161.28*/("""
          placeholder: "Select multiple proteins...",
          allowClear: true,
	  minimumInputLength: 1,
        """),format.raw/*165.9*/("""}"""),format.raw/*165.10*/(""");
        """),format.raw/*166.9*/("""}"""),format.raw/*166.10*/(""");
</script>

<script>
        $(function() """),format.raw/*170.22*/("""{"""),format.raw/*170.23*/("""
        var myArray = new Array();
        """),_display_(Seq[Any](/*172.10*/for(a <- taxonomy) yield /*172.28*/{_display_(Seq[Any](format.raw/*172.29*/("""
                myArray.push(""""),_display_(Seq[Any](/*173.32*/a)),format.raw/*173.33*/("""");
        """)))})),format.raw/*174.10*/("""
	myArray.sort();
        options = '';
        for (var i = 0; i < myArray.length; i++) """),format.raw/*177.50*/("""{"""),format.raw/*177.51*/("""
                options += '<option value="' + myArray[i] + '">' + myArray[i] + '</option>';
        """),format.raw/*179.9*/("""}"""),format.raw/*179.10*/("""
        $('#e1').html(options);
	$('#e5').html(options);
	$('#e7').html(options);
	$('#e9').html(options);
        """),format.raw/*184.9*/("""}"""),format.raw/*184.10*/(""");
</script>

<script>
        $(function() """),format.raw/*188.22*/("""{"""),format.raw/*188.23*/("""
        var myAcc = new Array();
        """),_display_(Seq[Any](/*190.10*/for(a <- proteinaccession) yield /*190.36*/{_display_(Seq[Any](format.raw/*190.37*/("""
                myAcc.push(""""),_display_(Seq[Any](/*191.30*/a)),format.raw/*191.31*/("""");
        """)))})),format.raw/*192.10*/("""
        myAcc.sort();
        options = '';
        for (var i = 0; i < myAcc.length; i++) """),format.raw/*195.48*/("""{"""),format.raw/*195.49*/("""
                options += '<option value="' + myAcc[i] + '">' + myAcc[i] + '</option>';
        """),format.raw/*197.9*/("""}"""),format.raw/*197.10*/("""
	$('#e12').html(options);
	$('#e13').html(options);
	"""),format.raw/*200.2*/("""}"""),format.raw/*200.3*/(""");
</script>

<script>
	$(function() """),format.raw/*204.15*/("""{"""),format.raw/*204.16*/("""
        var mySources = new Array();
	"""),_display_(Seq[Any](/*206.3*/for(s <- sources) yield /*206.20*/{_display_(Seq[Any](format.raw/*206.21*/("""
		mySources.push(""""),_display_(Seq[Any](/*207.20*/s)),format.raw/*207.21*/("""");
	""")))})),format.raw/*208.3*/("""
	mySources.sort();
	options = '';
	for (var i = 0; i < mySources.length; i++) """),format.raw/*211.45*/("""{"""),format.raw/*211.46*/("""
		options += '<option value="' + mySources[i] + '">' + mySources[i] + '</option>';
        """),format.raw/*213.9*/("""}"""),format.raw/*213.10*/("""
	$('#e2').html(options);
	$('#e4').html(options);
	$('#e8').html(options);
	$('#e10').html(options);
	"""),format.raw/*218.2*/("""}"""),format.raw/*218.3*/(""");
</script>

<script>
        $(function() """),format.raw/*222.22*/("""{"""),format.raw/*222.23*/("""
        var myProteins = new Array();
        """),_display_(Seq[Any](/*224.10*/for(s <- proteins ) yield /*224.29*/{_display_(Seq[Any](format.raw/*224.30*/("""
                myProteins.push(""""),_display_(Seq[Any](/*225.35*/s)),format.raw/*225.36*/("""");
        """)))})),format.raw/*226.10*/("""
        myProteins.sort();
        options = '';
        for (var i = 0; i < myProteins.length; i++) """),format.raw/*229.53*/("""{"""),format.raw/*229.54*/("""
                options += '<option value="' + myProteins[i] + '">' + myProteins[i] + '</option>';
        """),format.raw/*231.9*/("""}"""),format.raw/*231.10*/("""
        $('#e3').html(options);
	$('#e6').html(options);
	$('#e11').html(options);
        """),format.raw/*235.9*/("""}"""),format.raw/*235.10*/(""");
</script>


<ul class="breadcrumb">
  <li><i class="icon-home" ></i><a href="/"> UniCarbKB</a> <span class="divider">></span></li>
  <li class="active"><i class="icon-search" ></i> Search<span class="divider"></span></li>
  <!--<li class="active" > You are here</li>-->
</ul>

<section id="layouts" class="browse">

  <div class="page-header row-fluid">
    <h1>Search UniCarbKB</h1>
    <h4 class="subheader">Retrieve records from GlycosuiteDB, EUROCarbDB and GlycoBase</h4>
  </div>

<div class="row-fluid">
  <div class="span3 search">
    <div class="row-fluid">
      <div class="filterbar tabbable clearfix">
        <ul class="nav nav-tabs" id="myTabBar">
          <li class="title">Select a Structure Database: </li>
          <li><a href="#filter1" data-toggle="tab">GlycoSuiteDB <span class="pull-right count">"""),_display_(Seq[Any](/*258.97*/if(taxon.size() != 0)/*258.118*/ {_display_(Seq[Any](_display_(Seq[Any](/*258.121*/taxon/*258.126*/.size()))))})),format.raw/*258.134*/(""" """),_display_(Seq[Any](/*258.136*/if(proteinList.size() != 0)/*258.163*/ {_display_(Seq[Any](_display_(Seq[Any](/*258.166*/proteinList/*258.177*/.size()))))})),format.raw/*258.185*/(""" """),_display_(Seq[Any](/*258.187*/if(tissueList.size() != 0)/*258.213*/ {_display_(Seq[Any](_display_(Seq[Any](/*258.216*/tissueList/*258.226*/.size()))))})),format.raw/*258.234*/(""" """),_display_(Seq[Any](/*258.236*/if(!accsearch.isEmpty() )/*258.261*/ {_display_(Seq[Any](_display_(Seq[Any](/*258.264*/accsearch/*258.273*/.size()))))})),format.raw/*258.281*/("""</span></a></li>
          <li class=""><a href="#filter2" data-toggle="tab">EUROCarbDB</a></li>
          <li><a href="#filter3" data-toggle="tab">GlycoBase <span class="pull-right count"> """),_display_(Seq[Any](/*260.95*/if(count != 0)/*260.109*/ {_display_(Seq[Any](_display_(Seq[Any](/*260.112*/count))))})),format.raw/*260.118*/(""" """),_display_(Seq[Any](/*260.120*/if(counttissue != 0)/*260.140*/ {_display_(Seq[Any](_display_(Seq[Any](/*260.143*/counttissue))))})),format.raw/*260.155*/("""</span></a></li> </ul>
      </div>

      <div class="info">
        <h4>Other Options:</h4>
        <p><b>Glycan Builder:</b> Build and search a glycan structure<a href="/search"> using the new interface</a>.</p>
        <p><b>Curated Publications:</b> Search the <a href="/references">growing list of publications, associated structures, and metadata</a>.</p>
      </div>
    </div>
  </div>

  <div class="span9 rightpanel">
    <div class="tabbable"> <!-- Only required for left/right tabs -->

      <ul class="nav nav-tabs row-fluid" id="myTab">
        <li class="active"><a href="#tab1" data-toggle="tab"><h2>Construct a Query:</h2></a></li>
        <li class="span12"><a class="returnedresults" href="#tab2" data-toggle="tab">
          <h2>Search returned """),_display_(Seq[Any](/*277.32*/if(taxon.size() != 0)/*277.53*/ {_display_(Seq[Any](_display_(Seq[Any](/*277.56*/taxon/*277.61*/.size()))))})),format.raw/*277.69*/(""" """),_display_(Seq[Any](/*277.71*/if(proteinList.size() != 0)/*277.98*/ {_display_(Seq[Any](_display_(Seq[Any](/*277.101*/proteinList/*277.112*/.size()))))})),format.raw/*277.120*/(""" """),_display_(Seq[Any](/*277.122*/if(tissueList.size() != 0)/*277.148*/ {_display_(Seq[Any](_display_(Seq[Any](/*277.151*/tissueList/*277.161*/.size()))))})),format.raw/*277.169*/(""" """),_display_(Seq[Any](/*277.171*/if(!accsearch.isEmpty()  )/*277.197*/ {_display_(Seq[Any](_display_(Seq[Any](/*277.200*/accsearch/*277.209*/.size()))))})),format.raw/*277.217*/(""" results...
          </h2>
          <a href="/query"><input type="button" value="Search Again" href="/query" class="btn btn-small pull-right"></a>
        </a></li>
        <li><a href="#tab3" data-toggle="tab">Related Results</a></li>
      </ul>

      <div class="tab-content results">

        <div class="tab-pane active" id="tab1">

          <!--<h2><img src="../images/icon_search.png"> Search Features &amp; Results</h2>-->
          <div id="filter1" class="control-group row-fluid glycosuitedb">
            <div id="tab1" class="span12" >

              <div class="multi-option clearfix">
                <span class="pull-left label">Search by: </span>
                <label class="radio">
                  <input type="radio" name="glycosuitedbSearch" value="Taxonomy" checked> <h4>Taxonomy</h4>
                </label>
                <label class="radio">
                  <input type="radio" name="glycosuitedbSearch" value="Localisation"> <h4>Tissue</h4>
                </label>
                <label class="radio">
                  <input type="radio" name="glycosuitedbSearch" value="ProteinLocalisation"> <h4>Protein</h4>
                </label>
		<label class="radio">
                  <input type="radio" name="glycosuitedbSearch" value="Accession"> <h4>Protein Accession</h4>
                </label>
                <label class="radio">
                  <input type="radio" name="glycosuitedbSearch" value="Composition"> <h4>Composition</h4>
                </label>
              </div>

              <div id="glycosuitedbTaxonomy" class="controls">
                <label class="checkbox">
                  <form class="form-search">
                    <!--<h4>Taxonomy</h4>-->
                    <div id="selection" class="input-append row-fluid">
                      <select  name=taxonomy MULTIPLE id="e1" id="listBox" class="span10"></select>
                      <button type="submit" class="btn btn-primary">Search</button>
                    </div>
                  </form>
                </label>
              </div>
              <div id="glycosuitedbLocalisation" class="controls">
                <label class="checkbox">
                  <form class="form-search">
                    <!--<h4>Localisation</h4>-->
                    <div id="selection" class="row-fluid">
                      <select  name=tissue MULTIPLE id="e2" id="listBox" class="span10"></select>
                      <button type="submit" class="btn btn-primary">Search</button>
                    </div>
                  </form>
                </label>
              </div>
              <div id="glycosuitedbAssociation" class="controls">
                <label class="checkbox">
                  <form class="form-search">
                    <!--<h4>Protein Association</h4>-->
                    <div id="selection" class="row-fluid">
                      <select  name=protein MULTIPLE id="e3" id="listBox" class="span10"></select>
                      <button type="submit" class="btn btn-primary">Search</button>
                    </div>
                  </form>
                </label>
              </div>
	      <div id="glycosuitedbAcc" class="controls">
		<label class="checkbox">
		   <form class="form-search">
                    <!--<h4>Localisation</h4>-->
		     <div id="selection" class="row-fluid">
                      <select  name=swiss MULTIPLE id="e12" id="listBox" class="span10"></select>
                      <button type="submit" class="btn btn-primary">Search</button>
                    </div>
                  </form>
		</label>
	      </div>
              <form id="glycosuitedbComposition" class="form-search controls" action="/compositions">
                <h4>Glycan Type</h4>
		<input type="hidden" name="glycanType" id="glycanType" value="" />
		<div class="btn-group glycanType" data-toggle="buttons-radio">
  	     	    <button type="button" class="btn btn-primary" data-value="N-LINKED">N-Linked</button>
  		    <button type="button" class="btn btn-primary" data-value="O-LINKED">O-Linked</button>
                </div>
		<br />

		<h4>Monosaccharide Residues</h4>
                <div class='row-fluid'>
                  <label class='checkbox span4'><input class="span2" name=comp_Hex type=text> Hex</label>
                  <label class='checkbox span4'><input class="span2" name=comp_HexNAc type=text> HexNAc</label>
                  <label class='checkbox span4'><input class="span2" name=comp_Deoxyhexose type=text> dHex</label>
                </div>

                <div class='row-fluid'>
                  <label class='checkbox span4'><input class="span2" name=comp_NeuAc type=text> NeuAc</label>
                  <label class='checkbox span4'><input class="span2" name=comp_NeuGc type=text> NeuGc</label>
                  <label class='checkbox span4'><input class="span2" name=comp_Pent type=text> Pentose</label>
                </div>

                <div class='row-fluid'>
                  <label class='checkbox span4'><input class="span2" name=comp_Sulph type=text> Sulphate</label>
                  <label class='checkbox span4'><input class="span2" name=comp_Phos type=text> Phosphate</label>
                  <label class='checkbox span4'><input class="span2" name=comp_KDN type=text> KDN</label>
                </div>

                <div class='row-fluid'>
                  <label class='checkbox span4'><input class="span2" name=comp_KDO type=text> KDO</label>
                  <label class='checkbox span4'><input class="span2" name=comp_HexA type=text> HexA</label>
                  <label class='checkbox span4'><input class="span2" name=comp_methyl type=text> Methyl</label>
                </div>

                <div class='row-fluid'>
                  <label class='checkbox span4'><input class="span2" name=comp_acetyl type=text> Acetyl</label>
                  <label class='checkbox span4'><input class="span2" name=comp_other type=text> Other</label>
                </div>

                <div class='row-fluid'>
                  <button type="submit" class="btn btn-primary">Composition Search</button>
                </div>

              </form>
            </div> """),format.raw/*399.45*/("""

          </div> """),format.raw/*401.35*/("""

          <div id="filter2" class="tab-pane control-group row-fluid eurocarb">

	    <p>Support for EUROCarbDB will be available in the next release</p>

	    """),format.raw/*456.8*/("""

          </div> """),format.raw/*458.38*/("""

          <div id="filter3" class="tab-pane control-group nextprot">
            <div class="row-fluid">

                <div class="multi-option clearfix">
                  <span class="pull-left label">Search by: </span>
                  <label class="radio">
                    <input type="radio" name="glycobaseSearch" value="Taxonomy" checked> <h4>Taxonomy</h4>
                  </label>
                  <label class="radio">
                    <input type="radio" name="glycobaseSearch" value="Localisation"> <h4>Localisation</h4>
                  </label>
                  <label class="radio">
                    <input type="radio" name="glycobaseSearch" value="ProteinLocalisation"> <h4>Protein</h4>
                  </label>
                  <label class="radio">
                    <input type="radio" name="glycobaseSearch" value="Composition"> <h4>Composition</h4>
                  </label>
                </div>

                <div id="glycobaseTaxonomy" class="controls">
                  <label class="checkbox">
                    <form class="form-search">
                      <!--<h4>Taxonomy</h4>-->
                      <div id="selection" class="row-fluid">
                        <select  name=taxonomy MULTIPLE id="e5" id="listBox" class="span10"></select>
                        <button type="submit" class="btn btn-primary">Search</button>
                      </div>
                    </form>
                  </label>
                </div>

                <div id="glycobaseLocalisation" class="controls">
                  <label class="checkbox">
                    <form class="form-search">
                      <!--<h4>Localisation</h4>-->
                      <div id="selection" class="row-fluid">
                        <select  name=tissue MULTIPLE id="e10" id="listBox" class="span10"></select>
                        <button type="submit" class="btn btn-primary">Search</button>
                      </div>
                    </form>
                  </label>
                </div>

                <div id="glycobaseAssociation" class="controls">
                  <label class="checkbox">
                    <form class="form-search">
                      <!--<h4>Protein Association</h4>-->
                      <div id="selection" class="row-fluid">
                        <select  name=protein MULTIPLE id="e11" id="listBox" class="span10"></select>
                        <button type="submit" class="btn btn-primary">Search</button>
                      </div>
                    </form>
                  </label>
                </div>


                <!--<h4>Query by Composition</h4>-->
                <form id="glycobaseComposition" class="form-search controls">
                  <div class="row-fluid">
                    <label class="checkbox span4"><input class="span2" name=mscomp_Hexose type=text> Hex</label>
                    <label class="checkbox span4"><input class="span2" name=mscomp_HexNAc type=text> HexNAc</label>
                    <label class="checkbox span4"><input class="span2" name=mscomp_deoxyHexose type=text> dHex</label>
                  </div>

                  <div class="row-fluid">
                    <label class="checkbox span4"><input class="span2" name=mscomp_pentose type=text> Pent</label>
                    <label class="checkbox span4"><input class="span2" name=mscomp_NeuAc type=text> NeuAc</label>
                    <label class="checkbox span4"><input class="span2" name=mscomp_NeuGc type=text> NeuGc</label>
                  </div>

                  <div class="row-fluid">
                    <label class="checkbox span4"><input class="span2" name=mscomp_KDN   type=text> KDN</label>
                    <label class="checkbox span4"><input class="span2" name=mscomp_HexA type=text> HexA</label>
                  </div>
                  <div class="row-fluid">
                    <button type="submit" class="btn btn-primary">Composition Search</button>
                  </div>
                </form>

            </div> """),format.raw/*539.40*/("""

          </div> """),format.raw/*541.35*/("""
        </div> """),format.raw/*542.33*/("""

      <div class="tab-pane" id="tab2">

        <hr />

    """),_display_(Seq[Any](/*548.6*/for(out <- output) yield /*548.24*/ {_display_(Seq[Any](format.raw/*548.26*/("""
    <div class="row-fluid glycobase">
      """),_display_(Seq[Any](/*550.8*/Html(out))),format.raw/*550.17*/("""
    </div>
    """)))})),format.raw/*552.6*/("""

    """),_display_(Seq[Any](/*554.6*/for(out <- outputtissue) yield /*554.30*/ {_display_(Seq[Any](format.raw/*554.32*/("""
    <div class="row-fluid glycobase">
      """),_display_(Seq[Any](/*556.8*/Html(out))),format.raw/*556.17*/("""
    </div>
    """)))})),format.raw/*558.6*/("""

    """),_display_(Seq[Any](/*560.6*/for(out <- outputprotein) yield /*560.31*/ {_display_(Seq[Any](format.raw/*560.33*/("""
    <div class="row-fluid glycobase">
      """),_display_(Seq[Any](/*562.8*/Html(out))),format.raw/*562.17*/("""
    </div>
    """)))})),format.raw/*564.6*/("""


    """),_display_(Seq[Any](/*567.6*/if(proteinList != null)/*567.29*/ {_display_(Seq[Any](format.raw/*567.31*/("""

    """),_display_(Seq[Any](/*569.6*/if(proteinList.size() >=1 )/*569.33*/{_display_(Seq[Any](format.raw/*569.34*/("""
    <div class="row-fluid glycosuiteResult">
      <div class="controls">
        <label class="checkbox">
          <form class="form-search">
            <div id="selection">
              <select  name=protein MULTIPLE id="e6" style="width:350px"  id="listBox"></select>
              <button type="submit" class="btn btn-primary">Search</button>
            </div>
          </form>
        </label>
      </div>
    </div>
    """)))})),format.raw/*582.6*/("""


    """),_display_(Seq[Any](/*585.6*/for(p <- proteinList) yield /*585.27*/ {_display_(Seq[Any](format.raw/*585.29*/("""
    <div class="row-fluid glycosuiteResult">
      <div class="details span9">
        <h3>"""),_display_(Seq[Any](/*588.14*/if(p.swissProt != null)/*588.37*/ {_display_(Seq[Any](format.raw/*588.39*/("""<a href=""""),_display_(Seq[Any](/*588.49*/routes/*588.55*/.Application.proteinsummary(p.swissProt, "annotated" ))),format.raw/*588.109*/("""">"""),_display_(Seq[Any](/*588.112*/p/*588.113*/.name)),format.raw/*588.118*/("""</a>""")))})),format.raw/*588.123*/("""
	    """),_display_(Seq[Any](/*589.7*/if(p.swissProt == null)/*589.30*/{_display_(Seq[Any](format.raw/*589.31*/("""

	    """),_display_(Seq[Any](/*591.7*/for(t <- p.proteinsTax) yield /*591.30*/{_display_(Seq[Any](format.raw/*591.31*/(""" <a href="/proteinsummary/"""),_display_(Seq[Any](/*591.58*/p/*591.59*/.name)),format.raw/*591.64*/("""/"""),_display_(Seq[Any](/*591.66*/t/*591.67*/.species)),format.raw/*591.75*/("""">"""),_display_(Seq[Any](/*591.78*/p/*591.79*/.name)),format.raw/*591.84*/("""</a>
	    """)))})),format.raw/*592.7*/("""
	""")))})),format.raw/*593.3*/(""" 


	   """),format.raw/*597.19*/("""

	</h3>
        <p class="">"""),_display_(Seq[Any](/*600.22*/p/*600.23*/.stproteins.size())),format.raw/*600.41*/(""" structures are associated with this protein</p>
      </div>
      <div class="span3">
	  """),_display_(Seq[Any](/*603.5*/for(t <- p.proteinsTax) yield /*603.28*/{_display_(Seq[Any](format.raw/*603.29*/(""" <p class="pull-right structures"><a href="/proteinsummary/"""),_display_(Seq[Any](/*603.89*/p/*603.90*/.name)),format.raw/*603.95*/("""/"""),_display_(Seq[Any](/*603.97*/t/*603.98*/.species)),format.raw/*603.106*/("""">"""),_display_(Seq[Any](/*603.109*/p/*603.110*/.stproteins.size())),format.raw/*603.128*/(""" structures </a></p> """)))})),format.raw/*603.150*/("""


        """),format.raw/*607.6*/("""

      </div>
    </div>
    """)))})),format.raw/*611.6*/("""
    """)))})),format.raw/*612.6*/("""



    """),_display_(Seq[Any](/*616.6*/if(tissueList != null && tissueTerms != null)/*616.51*/ {_display_(Seq[Any](format.raw/*616.53*/("""
    """),_display_(Seq[Any](/*617.6*/if(tissueList.size() >=1 )/*617.32*/{_display_(Seq[Any](format.raw/*617.33*/("""
    <div class="row-fluid glycosuiteResult">
      <div class="controls">
        <label class="checkbox">
          <form class="form-search">
            <div id="selection">
              <select  name=tissue MULTIPLE id="e4" style="width:350px"  id="listBox"></select>
              <button type="submit" class="btn btn-primary">Search</button>
            </div>
          </form>
        </label>
      </div>
    </div>
    """)))})),format.raw/*630.6*/("""

    """),_display_(Seq[Any](/*632.6*/for(p <- tissueList) yield /*632.26*/ {_display_(Seq[Any](format.raw/*632.28*/("""
    <div class="row-fluid glycosuiteResult">
      <h3><a href="tissuesummary/"""),_display_(Seq[Any](/*634.35*/p/*634.36*/.id)),format.raw/*634.39*/("""">"""),_display_(Seq[Any](/*634.42*/p/*634.43*/.div1)),format.raw/*634.48*/(""", """),_display_(Seq[Any](/*634.51*/p/*634.52*/.div2)),format.raw/*634.57*/(""", """),_display_(Seq[Any](/*634.60*/p/*634.61*/.div3)),format.raw/*634.66*/(""", """),_display_(Seq[Any](/*634.69*/p/*634.70*/.div4)),format.raw/*634.75*/("""</a></h3>
      <div class="details span9">
        <p class="">"""),_display_(Seq[Any](/*636.22*/p/*636.23*/.stsource.size())),format.raw/*636.39*/(""" structures are associated with this tissue</p>
      </div>
      <div class="span3">
        <p class="pull-right structures"><a href="tissuesummary/"""),_display_(Seq[Any](/*639.66*/p/*639.67*/.id)),format.raw/*639.70*/("""">"""),_display_(Seq[Any](/*639.73*/p/*639.74*/.stsource.size())),format.raw/*639.90*/(""" structures </a></p>
      </div>
    </div>
    """)))})),format.raw/*642.6*/("""
    """)))})),format.raw/*643.6*/("""

    """),_display_(Seq[Any](/*645.6*/if(accsearch.size() != 0 )/*645.32*/ {_display_(Seq[Any](format.raw/*645.34*/("""
    <div class="row-fluid glycosuiteResult">
      <div class="controls">
        <label class="checkbox">
          <form class="form-search">
            <div id="selection">
              <select  name=swiss MULTIPLE id="e13" style="width:350px"  id="listBox"></select>
              <button type="submit" class="btn btn-primary">Search</button>
            </div>
          </form>
        </label>
      </div>
    </div>
    """),_display_(Seq[Any](/*658.6*/for(a <- accsearch) yield /*658.25*/ {_display_(Seq[Any](format.raw/*658.27*/("""
    <div class="row-fluid glycosuiteResult">
      <h3><a href="proteinsummary/"""),_display_(Seq[Any](/*660.36*/a/*660.37*/.swissProt)),format.raw/*660.47*/("""">"""),_display_(Seq[Any](/*660.50*/a/*660.51*/.swissProt)),format.raw/*660.61*/(""" ("""),_display_(Seq[Any](/*660.64*/a/*660.65*/.name)),format.raw/*660.70*/(""")</a></h3>
    </div>
    """)))})),format.raw/*662.6*/("""
    """)))})),format.raw/*663.6*/("""

    """),_display_(Seq[Any](/*665.6*/for( (taxon, ii) <- taxon.zipWithIndex) yield /*665.45*/ {_display_(Seq[Any](format.raw/*665.47*/("""        <div class="row-fluid glycosuiteResult">
      <div class="details span9">
        <h3><a href="/taxonomysearch?taxonomy="""),_display_(Seq[Any](/*667.48*/taxon/*667.53*/.species)),format.raw/*667.61*/("""">"""),_display_(Seq[Any](/*667.64*/taxon/*667.69*/.species)),format.raw/*667.77*/("""</a>"""),format.raw/*667.212*/("""</h3>
        <p class="">"""),_display_(Seq[Any](/*668.22*/taxon/*668.27*/.taxprotein.size())),format.raw/*668.45*/(""" glycoproteins are associated with this taxonomy including: """),_display_(Seq[Any](/*668.106*/for( (tax, i) <- taxon.taxprotein.zipWithIndex; if (i <= 6)) yield /*668.166*/ {_display_(Seq[Any](format.raw/*668.168*/("""  """),_display_(Seq[Any](/*668.171*/if(tax.swiss_prot != null)/*668.197*/ {_display_(Seq[Any](format.raw/*668.199*/(""" <a href=""""),_display_(Seq[Any](/*668.210*/routes/*668.216*/.Application.proteinsummary(tax.swiss_prot, "annotated" ))),format.raw/*668.273*/("""">""")))})),format.raw/*668.276*/(""" """),_display_(Seq[Any](/*668.278*/if(tax.swiss_prot == null)/*668.304*/ {_display_(Seq[Any](format.raw/*668.306*/("""<a href=""""),_display_(Seq[Any](/*668.316*/routes/*668.322*/.Application.proteinsummary(tax.protein, taxon.species ))),format.raw/*668.378*/("""">""")))})),format.raw/*668.381*/(""" """),_display_(Seq[Any](/*668.383*/tax/*668.386*/.protein)),format.raw/*668.394*/(""", </a> """)))})),format.raw/*668.402*/("""</p>
      </div>
      <div class="span3">
        <p class="pull-right structures"><a href="/taxonomysearch?taxonomy="""),_display_(Seq[Any](/*671.77*/taxon/*671.82*/.species)),format.raw/*671.90*/("""">"""),_display_(Seq[Any](/*671.93*/taxon/*671.98*/.strtaxonomy.size())),format.raw/*671.117*/(""" structures </a></p>
      </div>

    </div>
    """)))}))))})),format.raw/*675.7*/("""
  </div>
  """),format.raw/*677.17*/("""

  <div class="tab-pane" id="tab3">
  </div>

</div>
    </div>
  </div><!-- /col -->
</div><!-- /row -->
"""),_display_(Seq[Any](/*686.2*/views/*686.7*/.html.footerunicarb.footerunicarb())),format.raw/*686.42*/("""
</section>

"""),_display_(Seq[Any](/*689.2*/if(taxon.size() != 0 )/*689.24*/ {_display_(Seq[Any](format.raw/*689.26*/("""
<script>
  $(function () """),format.raw/*691.17*/("""{"""),format.raw/*691.18*/("""
    var test = 'first'; """),format.raw/*692.61*/("""
    $('#myTabBar a:' + test).tab('show');
    $('#myTab a[href="#tab2"]').tab('show');
  """),format.raw/*695.3*/("""}"""),format.raw/*695.4*/(""")
</script>
""")))})),format.raw/*697.2*/("""

"""),_display_(Seq[Any](/*699.2*/if(taxon.size() == 0  )/*699.25*/ {_display_(Seq[Any](format.raw/*699.27*/("""
<script>
  $(function () """),format.raw/*701.17*/("""{"""),format.raw/*701.18*/("""
    var test = 'first'; """),format.raw/*702.61*/("""
    $('#myTabBar a:' + test).tab('show');
    $('#myTab a[href="#tab1"]').tab('show');
  """),format.raw/*705.3*/("""}"""),format.raw/*705.4*/(""")
</script>
""")))})),format.raw/*707.2*/("""

"""),_display_(Seq[Any](/*709.2*/if(proteinList.size() != 0 )/*709.30*/ {_display_(Seq[Any](format.raw/*709.32*/("""
<script>
  $(function () """),format.raw/*711.17*/("""{"""),format.raw/*711.18*/("""
    var test = 'first'; """),format.raw/*712.61*/("""
    $('#myTabBar a:' + test).tab('show');
    $('#myTab a[href="#tab2"]').tab('show');
  """),format.raw/*715.3*/("""}"""),format.raw/*715.4*/(""")
</script>
""")))})),format.raw/*717.2*/("""

"""),_display_(Seq[Any](/*719.2*/if(tissueList.size() != 0 )/*719.29*/ {_display_(Seq[Any](format.raw/*719.31*/("""
<script>
  $(function () """),format.raw/*721.17*/("""{"""),format.raw/*721.18*/("""
    var test = 'first'; """),format.raw/*722.61*/("""
    $('#myTabBar a:' + test).tab('show');
    $('#myTab a[href="#tab2"]').tab('show');
  """),format.raw/*725.3*/("""}"""),format.raw/*725.4*/(""")
</script>
""")))})),format.raw/*727.2*/("""

"""),_display_(Seq[Any](/*729.2*/if(accsearch.size() != 0 )/*729.28*/ {_display_(Seq[Any](format.raw/*729.30*/("""
<script>
  $(function () """),format.raw/*731.17*/("""{"""),format.raw/*731.18*/("""
    var test = 'first'; """),format.raw/*732.61*/("""
    $('#myTabBar a:' + test).tab('show');
    $('#myTab a[href="#tab2"]').tab('show');
  """),format.raw/*735.3*/("""}"""),format.raw/*735.4*/(""")
</script>
""")))})),format.raw/*737.2*/("""


"""))}
    }
    
    def render(taxonomy:List[String],taxon:ArrayList[Taxonomy],biolsource:List[Biolsource],groupTax:List[List[String]],sources:HashSet[String],proteins:HashSet[String],proteinList:ArrayList[Proteins],tissueList:ArrayList[Tissue],tissueTerms:List[Tissue],glycobasePerturbation:List[GlycobaseSource],output:List[String],count:Integer,outputtissue:List[String],counttissue:Integer,outputprotein:List[String],countprotein:Integer,proteinaccession:HashSet[String],accsearch:ArrayList[Proteins]): play.api.templates.HtmlFormat.Appendable = apply(taxonomy,taxon,biolsource,groupTax,sources,proteins,proteinList,tissueList,tissueTerms,glycobasePerturbation,output,count,outputtissue,counttissue,outputprotein,countprotein,proteinaccession,accsearch)
    
    def f:((List[String],ArrayList[Taxonomy],List[Biolsource],List[List[String]],HashSet[String],HashSet[String],ArrayList[Proteins],ArrayList[Tissue],List[Tissue],List[GlycobaseSource],List[String],Integer,List[String],Integer,List[String],Integer,HashSet[String],ArrayList[Proteins]) => play.api.templates.HtmlFormat.Appendable) = (taxonomy,taxon,biolsource,groupTax,sources,proteins,proteinList,tissueList,tissueTerms,glycobasePerturbation,output,count,outputtissue,counttissue,outputprotein,countprotein,proteinaccession,accsearch) => apply(taxonomy,taxon,biolsource,groupTax,sources,proteins,proteinList,tissueList,tissueTerms,glycobasePerturbation,output,count,outputtissue,counttissue,outputprotein,countprotein,proteinaccession,accsearch)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 02 10:52:57 EST 2014
                    SOURCE: /Users/matthew/git/glycomics_working/app/views/query.scala.html
                    HASH: 39d22100db3510f6e177b69e0604fb0d93e8f501
                    MATRIX: 1041->1|1648->513|1685->516|1696->520|1733->521|1786->547|1814->548|1883->590|1911->591|1982->636|2009->637|2038->640|2065->641|2146->694|2175->695|2265->757|2294->758|2490->926|2519->927|2576->957|2604->958|2656->982|2685->983|2742->1013|2770->1014|2823->1039|2852->1040|2916->1077|2944->1078|2997->1103|3026->1104|3090->1141|3118->1142|3150->1147|3178->1148|3208->1151|3236->1152|3321->1209|3350->1210|3405->1237|3434->1238|3578->1355|3607->1356|3645->1367|3674->1368|3759->1425|3788->1426|3843->1453|3872->1454|4016->1571|4045->1572|4083->1583|4112->1584|4198->1642|4227->1643|4281->1669|4310->1670|4451->1784|4480->1785|4511->1789|4539->1790|4623->1846|4652->1847|4706->1873|4735->1874|4879->1991|4908->1992|4946->2003|4975->2004|5059->2060|5088->2061|5142->2087|5171->2088|5315->2205|5344->2206|5382->2217|5411->2218|5496->2275|5525->2276|5579->2302|5608->2303|5751->2419|5780->2420|5818->2431|5847->2432|5933->2489|5963->2490|6018->2516|6048->2517|6192->2633|6222->2634|6261->2645|6291->2646|6377->2703|6407->2704|6462->2730|6492->2731|6637->2848|6667->2849|6706->2860|6736->2861|6822->2918|6852->2919|6907->2945|6937->2946|7081->3062|7111->3063|7150->3074|7180->3075|7266->3132|7296->3133|7351->3159|7381->3160|7525->3276|7555->3277|7594->3288|7624->3289|7710->3346|7740->3347|7795->3373|7825->3374|7969->3490|7999->3491|8038->3502|8068->3503|8154->3560|8184->3561|8240->3588|8270->3589|8421->3712|8451->3713|8490->3724|8520->3725|8606->3782|8636->3783|8692->3810|8722->3811|8867->3928|8897->3929|8936->3940|8966->3941|9039->3985|9069->3986|9151->4031|9186->4049|9226->4050|9295->4082|9319->4083|9365->4096|9483->4185|9513->4186|9643->4288|9673->4289|9817->4405|9847->4406|9920->4450|9950->4451|10030->4494|10073->4520|10113->4521|10180->4551|10204->4552|10250->4565|10371->4657|10401->4658|10527->4756|10557->4757|10639->4811|10668->4812|10734->4849|10764->4850|10840->4890|10874->4907|10914->4908|10971->4928|10995->4929|11033->4935|11141->5014|11171->5015|11291->5107|11321->5108|11452->5211|11481->5212|11554->5256|11584->5257|11669->5305|11705->5324|11745->5325|11817->5360|11841->5361|11887->5374|12018->5476|12048->5477|12184->5585|12214->5586|12334->5678|12364->5679|13226->6504|13258->6525|13309->6528|13325->6533|13361->6541|13401->6543|13439->6570|13490->6573|13512->6584|13548->6592|13588->6594|13625->6620|13676->6623|13697->6633|13733->6641|13773->6643|13809->6668|13860->6671|13880->6680|13916->6688|14144->6879|14169->6893|14220->6896|14254->6902|14294->6904|14325->6924|14376->6927|14416->6939|15222->7708|15253->7729|15303->7732|15318->7737|15353->7745|15392->7747|15429->7774|15480->7777|15502->7788|15538->7796|15578->7798|15615->7824|15666->7827|15687->7837|15723->7845|15763->7847|15800->7873|15851->7876|15871->7885|15907->7893|22164->14146|22212->14182|22401->16543|22449->16582|26569->20693|26617->20729|26662->20762|26761->20825|26796->20843|26837->20845|26919->20891|26951->20900|27000->20917|27043->20924|27084->20948|27125->20950|27207->20996|27239->21005|27288->21022|27331->21029|27373->21054|27414->21056|27496->21102|27528->21111|27577->21128|27621->21136|27654->21159|27695->21161|27738->21168|27775->21195|27815->21196|28281->21630|28325->21638|28363->21659|28404->21661|28534->21754|28567->21777|28608->21779|28655->21789|28671->21795|28749->21849|28790->21852|28802->21853|28831->21858|28870->21863|28913->21870|28946->21893|28986->21894|29030->21902|29070->21925|29110->21926|29174->21953|29185->21954|29213->21959|29252->21961|29263->21962|29294->21970|29334->21973|29345->21974|29373->21979|29416->21990|29451->21993|29488->22086|29555->22116|29566->22117|29607->22135|29735->22227|29775->22250|29815->22251|29912->22311|29923->22312|29951->22317|29990->22319|30001->22320|30033->22328|30074->22331|30086->22332|30128->22350|30184->22372|30223->22535|30286->22566|30324->22572|30369->22581|30424->22626|30465->22628|30507->22634|30543->22660|30583->22661|31048->23094|31091->23101|31128->23121|31169->23123|31286->23203|31297->23204|31323->23207|31363->23210|31374->23211|31402->23216|31442->23219|31453->23220|31481->23225|31521->23228|31532->23229|31560->23234|31600->23237|31611->23238|31639->23243|31741->23308|31752->23309|31791->23325|31980->23477|31991->23478|32017->23481|32057->23484|32068->23485|32107->23501|32189->23551|32227->23557|32270->23564|32306->23590|32347->23592|32816->24025|32852->24044|32893->24046|33011->24127|33022->24128|33055->24138|33095->24141|33106->24142|33139->24152|33179->24155|33190->24156|33218->24161|33277->24188|33315->24194|33358->24201|33414->24240|33455->24242|33622->24372|33637->24377|33668->24385|33708->24388|33723->24393|33754->24401|33788->24536|33852->24563|33867->24568|33908->24586|34007->24647|34085->24707|34127->24709|34168->24712|34205->24738|34247->24740|34296->24751|34313->24757|34394->24814|34431->24817|34471->24819|34508->24845|34550->24847|34598->24857|34615->24863|34695->24919|34732->24922|34772->24924|34786->24927|34818->24935|34860->24943|35017->25063|35032->25068|35063->25076|35103->25079|35118->25084|35161->25103|35249->25155|35290->25181|35434->25289|35448->25294|35506->25329|35556->25343|35588->25365|35629->25367|35684->25393|35714->25394|35768->25455|35886->25545|35915->25546|35960->25559|35999->25562|36032->25585|36073->25587|36128->25613|36158->25614|36212->25675|36330->25765|36359->25766|36404->25779|36443->25782|36481->25810|36522->25812|36577->25838|36607->25839|36661->25900|36779->25990|36808->25991|36853->26004|36892->26007|36929->26034|36970->26036|37025->26062|37055->26063|37109->26124|37227->26214|37256->26215|37301->26228|37340->26231|37376->26257|37417->26259|37472->26285|37502->26286|37556->26347|37674->26437|37703->26438|37748->26451
                    LINES: 26->1|29->1|31->3|31->3|31->3|34->6|34->6|35->7|35->7|37->9|37->9|37->9|37->9|41->13|41->13|42->14|42->14|48->20|48->20|50->22|50->22|51->23|51->23|53->25|53->25|55->27|55->27|57->29|57->29|59->31|59->31|61->33|61->33|64->36|64->36|65->37|65->37|69->41|69->41|70->42|70->42|74->46|74->46|75->47|75->47|79->51|79->51|80->52|80->52|84->56|84->56|85->57|85->57|90->62|90->62|91->63|91->63|95->67|95->67|96->68|96->68|99->71|99->71|100->72|100->72|104->76|104->76|105->77|105->77|108->80|108->80|109->81|109->81|113->85|113->85|114->86|114->86|118->90|118->90|119->91|119->91|123->95|123->95|124->96|124->96|128->100|128->100|129->101|129->101|133->105|133->105|134->106|134->106|138->110|138->110|139->111|139->111|143->115|143->115|144->116|144->116|148->120|148->120|149->121|149->121|153->125|153->125|154->126|154->126|158->130|158->130|159->131|159->131|163->135|163->135|164->136|164->136|168->140|168->140|169->141|169->141|173->145|173->145|174->146|174->146|178->150|178->150|179->151|179->151|183->155|183->155|184->156|184->156|188->160|188->160|189->161|189->161|193->165|193->165|194->166|194->166|198->170|198->170|200->172|200->172|200->172|201->173|201->173|202->174|205->177|205->177|207->179|207->179|212->184|212->184|216->188|216->188|218->190|218->190|218->190|219->191|219->191|220->192|223->195|223->195|225->197|225->197|228->200|228->200|232->204|232->204|234->206|234->206|234->206|235->207|235->207|236->208|239->211|239->211|241->213|241->213|246->218|246->218|250->222|250->222|252->224|252->224|252->224|253->225|253->225|254->226|257->229|257->229|259->231|259->231|263->235|263->235|286->258|286->258|286->258|286->258|286->258|286->258|286->258|286->258|286->258|286->258|286->258|286->258|286->258|286->258|286->258|286->258|286->258|286->258|286->258|286->258|288->260|288->260|288->260|288->260|288->260|288->260|288->260|288->260|305->277|305->277|305->277|305->277|305->277|305->277|305->277|305->277|305->277|305->277|305->277|305->277|305->277|305->277|305->277|305->277|305->277|305->277|305->277|305->277|427->399|429->401|435->456|437->458|518->539|520->541|521->542|527->548|527->548|527->548|529->550|529->550|531->552|533->554|533->554|533->554|535->556|535->556|537->558|539->560|539->560|539->560|541->562|541->562|543->564|546->567|546->567|546->567|548->569|548->569|548->569|561->582|564->585|564->585|564->585|567->588|567->588|567->588|567->588|567->588|567->588|567->588|567->588|567->588|567->588|568->589|568->589|568->589|570->591|570->591|570->591|570->591|570->591|570->591|570->591|570->591|570->591|570->591|570->591|570->591|571->592|572->593|575->597|578->600|578->600|578->600|581->603|581->603|581->603|581->603|581->603|581->603|581->603|581->603|581->603|581->603|581->603|581->603|581->603|584->607|588->611|589->612|593->616|593->616|593->616|594->617|594->617|594->617|607->630|609->632|609->632|609->632|611->634|611->634|611->634|611->634|611->634|611->634|611->634|611->634|611->634|611->634|611->634|611->634|611->634|611->634|611->634|613->636|613->636|613->636|616->639|616->639|616->639|616->639|616->639|616->639|619->642|620->643|622->645|622->645|622->645|635->658|635->658|635->658|637->660|637->660|637->660|637->660|637->660|637->660|637->660|637->660|637->660|639->662|640->663|642->665|642->665|642->665|644->667|644->667|644->667|644->667|644->667|644->667|644->667|645->668|645->668|645->668|645->668|645->668|645->668|645->668|645->668|645->668|645->668|645->668|645->668|645->668|645->668|645->668|645->668|645->668|645->668|645->668|645->668|645->668|645->668|645->668|645->668|648->671|648->671|648->671|648->671|648->671|648->671|652->675|654->677|663->686|663->686|663->686|666->689|666->689|666->689|668->691|668->691|669->692|672->695|672->695|674->697|676->699|676->699|676->699|678->701|678->701|679->702|682->705|682->705|684->707|686->709|686->709|686->709|688->711|688->711|689->712|692->715|692->715|694->717|696->719|696->719|696->719|698->721|698->721|699->722|702->725|702->725|704->727|706->729|706->729|706->729|708->731|708->731|709->732|712->735|712->735|714->737
                    -- GENERATED --
                */
            