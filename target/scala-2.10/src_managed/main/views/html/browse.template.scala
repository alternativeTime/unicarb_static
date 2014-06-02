
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
object browse extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template16[List[String],ArrayList[Taxonomy],List[Biolsource],List[List[String]],HashSet[String],HashSet[String],ArrayList[Proteins],ArrayList[Tissue],List[Tissue],List[GlycobaseSource],List[String],Integer,List[String],Integer,List[String],Integer,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(taxonomy: List[String], taxon: ArrayList[Taxonomy],  biolsource: List[Biolsource], groupTax: List[List[String]], sources: HashSet[String], proteins: HashSet[String], proteinList: ArrayList[Proteins], tissueList: ArrayList[Tissue], tissueTerms: List[Tissue], glycobasePerturbation: List[GlycobaseSource], output: List[String], count: Integer, outputtissue: List[String], counttissue: Integer, outputprotein: List[String], countprotein: Integer):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.446*/("""

"""),_display_(Seq[Any](/*3.2*/main/*3.6*/{_display_(Seq[Any](format.raw/*3.7*/("""

<script>
$(document).ready(function() """),format.raw/*6.30*/("""{"""),format.raw/*6.31*/("""
$('#myTabBar a[data-toggle="tab"]').on('shown', function (e) """),format.raw/*7.62*/("""{"""),format.raw/*7.63*/("""
  e.target // activated tab
  var filterstring = e.target.toString();
  var filtervalue =filterstring.split('#');
  var name = filtervalue[1];

  if(name == "filter3")"""),format.raw/*13.24*/("""{"""),format.raw/*13.25*/("""
   $('.glycobase').show();
  """),format.raw/*15.3*/("""}"""),format.raw/*15.4*/("""
  if(name != "filter3")"""),format.raw/*16.24*/("""{"""),format.raw/*16.25*/("""
   $('.glycobase').hide();
  """),format.raw/*18.3*/("""}"""),format.raw/*18.4*/("""

  if(name == "filter1")"""),format.raw/*20.24*/("""{"""),format.raw/*20.25*/("""
   $('.glycosuiteResult').show();
  """),format.raw/*22.3*/("""}"""),format.raw/*22.4*/("""

  if(name != "filter1")"""),format.raw/*24.24*/("""{"""),format.raw/*24.25*/("""
   $('.glycosuiteResult').hide();
  """),format.raw/*26.3*/("""}"""),format.raw/*26.4*/("""

  
"""),format.raw/*29.1*/("""}"""),format.raw/*29.2*/(""");
"""),format.raw/*30.1*/("""}"""),format.raw/*30.2*/(""");
</script>

<script>
      $(document).ready(function()"""),format.raw/*34.35*/("""{"""),format.raw/*34.36*/("""
        $("#e1").select2("""),format.raw/*35.26*/("""{"""),format.raw/*35.27*/("""
          placeholder: "Select multiple species...",
          allowClear: true,
	minimumInputLength: 1,
        """),format.raw/*39.9*/("""}"""),format.raw/*39.10*/(""");
	"""),format.raw/*40.2*/("""}"""),format.raw/*40.3*/(""");
</script>
<script>
      $(document).ready(function()"""),format.raw/*43.35*/("""{"""),format.raw/*43.36*/("""
        $("#e2").select2("""),format.raw/*44.26*/("""{"""),format.raw/*44.27*/("""
          placeholder: "Select multiple tissues... ",
          allowClear: true,
	  minimumInputLength: 1,
        """),format.raw/*48.9*/("""}"""),format.raw/*48.10*/(""");
        """),format.raw/*49.9*/("""}"""),format.raw/*49.10*/(""");
</script>
<script>
      $(document).ready(function()"""),format.raw/*52.35*/("""{"""),format.raw/*52.36*/("""
        $("#e3").select2("""),format.raw/*53.26*/("""{"""),format.raw/*53.27*/("""
          placeholder: "Select multiple proteins...",
          allowClear: true,
	  minimumInputLength: 1,
        """),format.raw/*57.9*/("""}"""),format.raw/*57.10*/(""");
        """),format.raw/*58.9*/("""}"""),format.raw/*58.10*/(""");
</script>

<script>
      $(document).ready(function()"""),format.raw/*62.35*/("""{"""),format.raw/*62.36*/("""
        $("#e4").select2("""),format.raw/*63.26*/("""{"""),format.raw/*63.27*/("""
          placeholder: "Select multiple tissues...",
          allowClear: true,
	  minimumInputLength: 1,
        """),format.raw/*67.9*/("""}"""),format.raw/*67.10*/(""");
        """),format.raw/*68.9*/("""}"""),format.raw/*68.10*/(""");
</script>

<script>
      $(document).ready(function()"""),format.raw/*72.35*/("""{"""),format.raw/*72.36*/("""
        $("#e5").select2("""),format.raw/*73.26*/("""{"""),format.raw/*73.27*/("""
          placeholder: "Select multiple species...",
          allowClear: true,
	  minimumInputLength: 1,
        """),format.raw/*77.9*/("""}"""),format.raw/*77.10*/(""");
        """),format.raw/*78.9*/("""}"""),format.raw/*78.10*/(""");
</script>

<script>
      $(document).ready(function()"""),format.raw/*82.35*/("""{"""),format.raw/*82.36*/("""
        $("#e6").select2("""),format.raw/*83.26*/("""{"""),format.raw/*83.27*/("""
          placeholder: "Select multiple proteins...",
          allowClear: true,
	  minimumInputLength: 1,
        """),format.raw/*87.9*/("""}"""),format.raw/*87.10*/(""");
        """),format.raw/*88.9*/("""}"""),format.raw/*88.10*/(""");
</script>

<script>
      $(document).ready(function()"""),format.raw/*92.35*/("""{"""),format.raw/*92.36*/("""
        $("#e7").select2("""),format.raw/*93.26*/("""{"""),format.raw/*93.27*/("""
          placeholder: "Select multiple species...",
          allowClear: true,
	  minimumInputLength: 1,
        """),format.raw/*97.9*/("""}"""),format.raw/*97.10*/(""");
        """),format.raw/*98.9*/("""}"""),format.raw/*98.10*/(""");
</script>

<script>
      $(document).ready(function()"""),format.raw/*102.35*/("""{"""),format.raw/*102.36*/("""
        $("#e8").select2("""),format.raw/*103.26*/("""{"""),format.raw/*103.27*/("""
          placeholder: "Select multiple tissues...",
          allowClear: true,
	  minimumInputLength: 1,
        """),format.raw/*107.9*/("""}"""),format.raw/*107.10*/(""");
        """),format.raw/*108.9*/("""}"""),format.raw/*108.10*/(""");
</script>

<script>
      $(document).ready(function()"""),format.raw/*112.35*/("""{"""),format.raw/*112.36*/("""
        $("#e9").select2("""),format.raw/*113.26*/("""{"""),format.raw/*113.27*/("""
          placeholder: "Select multiple species...",
          allowClear: true,
	  minimumInputLength: 1,
        """),format.raw/*117.9*/("""}"""),format.raw/*117.10*/(""");
        """),format.raw/*118.9*/("""}"""),format.raw/*118.10*/(""");
</script>

<script>
      $(document).ready(function()"""),format.raw/*122.35*/("""{"""),format.raw/*122.36*/("""
        $("#e10").select2("""),format.raw/*123.27*/("""{"""),format.raw/*123.28*/("""
          placeholder: "Select multiple tissues...",
          allowClear: true,
          minimumInputLength: 1,
        """),format.raw/*127.9*/("""}"""),format.raw/*127.10*/(""");
        """),format.raw/*128.9*/("""}"""),format.raw/*128.10*/(""");
</script>

<script>
      $(document).ready(function()"""),format.raw/*132.35*/("""{"""),format.raw/*132.36*/("""
        $("#e11").select2("""),format.raw/*133.27*/("""{"""),format.raw/*133.28*/("""
          placeholder: "Select multiple proteins...",
          allowClear: true,
	  minimumInputLength: 1,
        """),format.raw/*137.9*/("""}"""),format.raw/*137.10*/(""");
        """),format.raw/*138.9*/("""}"""),format.raw/*138.10*/(""");
</script>

<script>
        $(function() """),format.raw/*142.22*/("""{"""),format.raw/*142.23*/("""
        var myArray = new Array();
        """),_display_(Seq[Any](/*144.10*/for(a <- taxonomy) yield /*144.28*/{_display_(Seq[Any](format.raw/*144.29*/("""
                myArray.push(""""),_display_(Seq[Any](/*145.32*/a)),format.raw/*145.33*/("""");
        """)))})),format.raw/*146.10*/("""
	myArray.sort();
        options = '';
        for (var i = 0; i < myArray.length; i++) """),format.raw/*149.50*/("""{"""),format.raw/*149.51*/("""
                options += '<option value="' + myArray[i] + '">' + myArray[i] + '</option>';
        """),format.raw/*151.9*/("""}"""),format.raw/*151.10*/("""
        $('#e1').html(options);
	$('#e5').html(options);
	$('#e7').html(options);
	$('#e9').html(options);
        """),format.raw/*156.9*/("""}"""),format.raw/*156.10*/(""");
</script>

<script>
	$(function() """),format.raw/*160.15*/("""{"""),format.raw/*160.16*/("""
        var mySources = new Array();
	"""),_display_(Seq[Any](/*162.3*/for(s <- sources) yield /*162.20*/{_display_(Seq[Any](format.raw/*162.21*/("""
		mySources.push(""""),_display_(Seq[Any](/*163.20*/s)),format.raw/*163.21*/("""");
	""")))})),format.raw/*164.3*/("""
	mySources.sort();
	options = '';
	for (var i = 0; i < mySources.length; i++) """),format.raw/*167.45*/("""{"""),format.raw/*167.46*/("""
		options += '<option value="' + mySources[i] + '">' + mySources[i] + '</option>';
        """),format.raw/*169.9*/("""}"""),format.raw/*169.10*/("""
	$('#e2').html(options);
	$('#e4').html(options);
	$('#e8').html(options);
	$('#e10').html(options);
	"""),format.raw/*174.2*/("""}"""),format.raw/*174.3*/(""");
</script>

<script>
        $(function() """),format.raw/*178.22*/("""{"""),format.raw/*178.23*/("""
        var myProteins = new Array();
        """),_display_(Seq[Any](/*180.10*/for(s <- proteins ) yield /*180.29*/{_display_(Seq[Any](format.raw/*180.30*/("""
                myProteins.push(""""),_display_(Seq[Any](/*181.35*/s)),format.raw/*181.36*/("""");
        """)))})),format.raw/*182.10*/("""
        myProteins.sort();
        options = '';
        for (var i = 0; i < myProteins.length; i++) """),format.raw/*185.53*/("""{"""),format.raw/*185.54*/("""
                options += '<option value="' + myProteins[i] + '">' + myProteins[i] + '</option>';
        """),format.raw/*187.9*/("""}"""),format.raw/*187.10*/("""
        $('#e3').html(options);
	$('#e6').html(options);
	$('#e11').html(options);
        """),format.raw/*191.9*/("""}"""),format.raw/*191.10*/(""");
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
          <li><a href="#filter1" data-toggle="tab">GlycoSuiteDB <span class="pull-right count">"""),_display_(Seq[Any](/*214.97*/if(taxon.size() != 0)/*214.118*/ {_display_(Seq[Any](_display_(Seq[Any](/*214.121*/taxon/*214.126*/.size()))))})),format.raw/*214.134*/(""" """),_display_(Seq[Any](/*214.136*/if(proteinList.size() != 0)/*214.163*/ {_display_(Seq[Any](_display_(Seq[Any](/*214.166*/proteinList/*214.177*/.size()))))})),format.raw/*214.185*/(""" """),_display_(Seq[Any](/*214.187*/if(tissueList.size() != 0)/*214.213*/ {_display_(Seq[Any](_display_(Seq[Any](/*214.216*/tissueList/*214.226*/.size()))))})),format.raw/*214.234*/("""</span></a></li>
          <li class=""><a href="#filter2" data-toggle="tab">EUROCarbDB</a></li>
          <li><a href="#filter3" data-toggle="tab">GlycoBase <span class="pull-right count"> """),_display_(Seq[Any](/*216.95*/if(count != 0)/*216.109*/ {_display_(Seq[Any](_display_(Seq[Any](/*216.112*/count))))})),format.raw/*216.118*/(""" """),_display_(Seq[Any](/*216.120*/if(counttissue != 0)/*216.140*/ {_display_(Seq[Any](_display_(Seq[Any](/*216.143*/counttissue))))})),format.raw/*216.155*/("""</span></a></li> </ul>
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
          <h2>Search returned """),_display_(Seq[Any](/*233.32*/if(taxon.size() != 0)/*233.53*/ {_display_(Seq[Any](_display_(Seq[Any](/*233.56*/taxon/*233.61*/.size()))))})),format.raw/*233.69*/(""" """),_display_(Seq[Any](/*233.71*/if(proteinList.size() != 0)/*233.98*/ {_display_(Seq[Any](_display_(Seq[Any](/*233.101*/proteinList/*233.112*/.size()))))})),format.raw/*233.120*/(""" """),_display_(Seq[Any](/*233.122*/if(tissueList.size() != 0)/*233.148*/ {_display_(Seq[Any](_display_(Seq[Any](/*233.151*/tissueList/*233.161*/.size()))))})),format.raw/*233.169*/(""" results...
          </h2>
          <a href="/browse"><input type="button" value="Search Again" href="/browse" class="btn btn-small pull-right"></a>
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
              <form id="glycosuitedbComposition" class="form-search controls" action="/compositions">
                <!--<h4>Query by Composition</h4>-->
                <div class='row-fluid'>
                  <label class='checkbox span4'><input class="span2" name=comp type=text> Hex</label>
                  <label class='checkbox span4'><input class="span2" name=comp type=text> HexNAc</label>
                  <label class='checkbox span4'><input class="span2" name=comp type=text> dHex</label>
                </div>

                <div class='row-fluid'>
                  <label class='checkbox span4'><input class="span2" name=comp type=text> NeuAc</label>
                  <label class='checkbox span4'><input class="span2" name=comp type=text> NeuGc</label>
                  <label class='checkbox span4'><input class="span2" name=comp type=text> Pentose</label>
                </div>

                <div class='row-fluid'>
                  <label class='checkbox span4'><input class="span2" name=comp type=text> Sulphate</label>
                  <label class='checkbox span4'><input class="span2" name=comp type=text> Phosphate</label>
                  <label class='checkbox span4'><input class="span2" name=comp type=text> KDN</label>
                </div>

                <div class='row-fluid'>
                  <label class='checkbox span4'><input class="span2" name=comp type=text> KDO</label>
                  <label class='checkbox span4'><input class="span2" name=comp type=text> HexA</label>
                  <label class='checkbox span4'><input class="span2" name=comp type=text> Methyl</label>
                </div>

                <div class='row-fluid'>
                  <label class='checkbox span4'><input class="span2" name=comp type=text> Acetyl</label>
                  <label class='checkbox span4'><input class="span2" name=comp type=text> Other</label>
                </div>

                <div class='row-fluid'>
                  <button type="submit" class="btn btn-primary">Composition Search</button>
                </div>

              </form>
            </div> """),format.raw/*333.45*/("""

          </div> """),format.raw/*335.35*/("""

          <div id="filter2" class="tab-pane control-group row-fluid eurocarb">

	    <p>Support for EUROCarbDB will be available in the next release</p>

	    """),format.raw/*390.8*/("""

          </div> """),format.raw/*392.38*/("""

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

            </div> """),format.raw/*473.40*/("""

          </div> """),format.raw/*475.35*/("""
        </div> """),format.raw/*476.33*/("""

      <div class="tab-pane" id="tab2">

        <hr />

    """),_display_(Seq[Any](/*482.6*/for(out <- output) yield /*482.24*/ {_display_(Seq[Any](format.raw/*482.26*/("""
    <div class="row-fluid glycobase">
      """),_display_(Seq[Any](/*484.8*/Html(out))),format.raw/*484.17*/("""
    </div>
    """)))})),format.raw/*486.6*/("""

    """),_display_(Seq[Any](/*488.6*/for(out <- outputtissue) yield /*488.30*/ {_display_(Seq[Any](format.raw/*488.32*/("""
    <div class="row-fluid glycobase">
      """),_display_(Seq[Any](/*490.8*/Html(out))),format.raw/*490.17*/("""
    </div>
    """)))})),format.raw/*492.6*/("""

    """),_display_(Seq[Any](/*494.6*/for(out <- outputprotein) yield /*494.31*/ {_display_(Seq[Any](format.raw/*494.33*/("""
    <div class="row-fluid glycobase">
      """),_display_(Seq[Any](/*496.8*/Html(out))),format.raw/*496.17*/("""
    </div>
    """)))})),format.raw/*498.6*/("""


    """),_display_(Seq[Any](/*501.6*/if(proteinList != null)/*501.29*/ {_display_(Seq[Any](format.raw/*501.31*/("""

    """),_display_(Seq[Any](/*503.6*/if(proteinList.size() >=1 )/*503.33*/{_display_(Seq[Any](format.raw/*503.34*/("""
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
    """)))})),format.raw/*516.6*/("""


    """),_display_(Seq[Any](/*519.6*/for(p <- proteinList) yield /*519.27*/ {_display_(Seq[Any](format.raw/*519.29*/("""
    <div class="row-fluid glycosuiteResult">
      <div class="details span9">
        <h3>"""),_display_(Seq[Any](/*522.14*/if(p.swissProt != null)/*522.37*/ {_display_(Seq[Any](format.raw/*522.39*/("""<a href=""""),_display_(Seq[Any](/*522.49*/routes/*522.55*/.Application.proteinsummary(p.swissProt, "annotated" ))),format.raw/*522.109*/("""">""")))})),format.raw/*522.112*/("""
	     """),_display_(Seq[Any](/*523.8*/if(p.swissProt == null)/*523.31*/ {_display_(Seq[Any](format.raw/*523.33*/("""<a href=""""),_display_(Seq[Any](/*523.43*/routes/*523.49*/.Application.proteinsummary(p.name, "name" ))),format.raw/*523.93*/("""">""")))})),format.raw/*523.96*/("""
	    """),_display_(Seq[Any](/*524.7*/p/*524.8*/.name)),format.raw/*524.13*/("""</a></h3>  
        <p class="">"""),_display_(Seq[Any](/*525.22*/p/*525.23*/.stproteins.size())),format.raw/*525.41*/(""" structures are associated with this protein</p>
      </div>
      <div class="span3">
         <p class="pull-right structures"><a href=""""),_display_(Seq[Any](/*528.53*/routes/*528.59*/.Application.proteinsummary(p.swissProt, "name" ))),format.raw/*528.108*/("""">"""),_display_(Seq[Any](/*528.111*/p/*528.112*/.stproteins.size())),format.raw/*528.130*/(""" structures </a></p> 
      </div>
    </div>
    """)))})),format.raw/*531.6*/("""
    """)))})),format.raw/*532.6*/("""



    """),_display_(Seq[Any](/*536.6*/if(tissueList != null && tissueTerms != null)/*536.51*/ {_display_(Seq[Any](format.raw/*536.53*/("""
    """),_display_(Seq[Any](/*537.6*/if(tissueList.size() >=1 )/*537.32*/{_display_(Seq[Any](format.raw/*537.33*/("""
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
    """)))})),format.raw/*550.6*/("""

    """),_display_(Seq[Any](/*552.6*/for(p <- tissueList) yield /*552.26*/ {_display_(Seq[Any](format.raw/*552.28*/("""
    <div class="row-fluid glycosuiteResult">
      <h3><a href="#">"""),_display_(Seq[Any](/*554.24*/p/*554.25*/.div1)),format.raw/*554.30*/(""", """),_display_(Seq[Any](/*554.33*/p/*554.34*/.div2)),format.raw/*554.39*/(""", """),_display_(Seq[Any](/*554.42*/p/*554.43*/.div3)),format.raw/*554.48*/(""", """),_display_(Seq[Any](/*554.51*/p/*554.52*/.div4)),format.raw/*554.57*/("""</a></h3>
      <div class="details span9">
        <p class="">"""),_display_(Seq[Any](/*556.22*/p/*556.23*/.stsource.size())),format.raw/*556.39*/(""" structures are associated with this protein</p>
      </div>
      <div class="span3">
        <p class="pull-right structures"><a href="#">"""),_display_(Seq[Any](/*559.55*/p/*559.56*/.stsource.size())),format.raw/*559.72*/(""" structures </a></p>
      </div>
    </div>
    """)))})),format.raw/*562.6*/("""
    """)))})),format.raw/*563.6*/("""

    """),_display_(Seq[Any](/*565.6*/for( (taxon, ii) <- taxon.zipWithIndex) yield /*565.45*/ {_display_(Seq[Any](format.raw/*565.47*/("""        <div class="row-fluid glycosuiteResult">
      <div class="details span9">
        <h3><a href="/taxonomysearch?taxonomy="""),_display_(Seq[Any](/*567.48*/taxon/*567.53*/.species)),format.raw/*567.61*/("""">"""),_display_(Seq[Any](/*567.64*/taxon/*567.69*/.species)),format.raw/*567.77*/("""</a>"""),format.raw/*567.212*/("""</h3>
	<p class="">"""),_display_(Seq[Any](/*568.15*/taxon/*568.20*/.taxprotein.size())),format.raw/*568.38*/(""" glycoproteins are associated with this taxonomy including: """),_display_(Seq[Any](/*568.99*/for( (tax, i) <- taxon.taxprotein.zipWithIndex; if (i <= 6)) yield /*568.159*/ {_display_(Seq[Any](format.raw/*568.161*/("""
	"""),_display_(Seq[Any](/*569.3*/if(tax.swiss_prot != null)/*569.29*/ {_display_(Seq[Any](format.raw/*569.31*/(""" <a href=""""),_display_(Seq[Any](/*569.42*/routes/*569.48*/.Application.proteinsummary(tax.swiss_prot, "annotated" ))),format.raw/*569.105*/("""">"""),_display_(Seq[Any](/*569.108*/tax/*569.111*/.protein)),format.raw/*569.119*/(""", </a> """)))})),format.raw/*569.127*/("""
	"""),_display_(Seq[Any](/*570.3*/if(tax.swiss_prot == null)/*570.29*/ {_display_(Seq[Any](format.raw/*570.31*/("""<a href=""""),_display_(Seq[Any](/*570.41*/routes/*570.47*/.Application.proteinsummary(tax.protein, "name" ))),format.raw/*570.96*/("""">"""),_display_(Seq[Any](/*570.99*/tax/*570.102*/.protein)),format.raw/*570.110*/(""", </a> """)))})),format.raw/*570.118*/(""" 
	
  """)))})),format.raw/*572.4*/("""</p>
      </div>
      <div class="span3">
        <p class="pull-right structures"><a href="/taxonomysearch?taxonomy="""),_display_(Seq[Any](/*575.77*/taxon/*575.82*/.species)),format.raw/*575.90*/("""">"""),_display_(Seq[Any](/*575.93*/taxon/*575.98*/.strtaxonomy.size())),format.raw/*575.117*/(""" structures </a></p>
      </div>

    </div>
    """)))}))))})),format.raw/*579.7*/("""
  </div>
  """),format.raw/*581.17*/("""

  <div class="tab-pane" id="tab3">
  </div>

</div>
    </div>
  </div><!-- /col -->
</div><!-- /row -->
"""),_display_(Seq[Any](/*590.2*/views/*590.7*/.html.footerunicarb.footerunicarb())),format.raw/*590.42*/("""
</section>

"""),_display_(Seq[Any](/*593.2*/if(taxon.size() != 0 )/*593.24*/ {_display_(Seq[Any](format.raw/*593.26*/("""
<script>
  $(function () """),format.raw/*595.17*/("""{"""),format.raw/*595.18*/("""
    var test = 'first'; """),format.raw/*596.61*/("""
    $('#myTabBar a:' + test).tab('show');
    $('#myTab a[href="#tab2"]').tab('show');
  """),format.raw/*599.3*/("""}"""),format.raw/*599.4*/(""")
</script>
""")))})),format.raw/*601.2*/("""

"""),_display_(Seq[Any](/*603.2*/if(taxon.size() == 0  )/*603.25*/ {_display_(Seq[Any](format.raw/*603.27*/("""
<script>
  $(function () """),format.raw/*605.17*/("""{"""),format.raw/*605.18*/("""
    var test = 'first'; """),format.raw/*606.61*/("""
    $('#myTabBar a:' + test).tab('show');
    $('#myTab a[href="#tab1"]').tab('show');
  """),format.raw/*609.3*/("""}"""),format.raw/*609.4*/(""")
</script>
""")))})),format.raw/*611.2*/("""

"""),_display_(Seq[Any](/*613.2*/if(proteinList.size() != 0 )/*613.30*/ {_display_(Seq[Any](format.raw/*613.32*/("""
<script>
  $(function () """),format.raw/*615.17*/("""{"""),format.raw/*615.18*/("""
    var test = 'first'; """),format.raw/*616.61*/("""
    $('#myTabBar a:' + test).tab('show');
    $('#myTab a[href="#tab2"]').tab('show');
  """),format.raw/*619.3*/("""}"""),format.raw/*619.4*/(""")
</script>
""")))})),format.raw/*621.2*/("""

"""),_display_(Seq[Any](/*623.2*/if(tissueList.size() != 0 )/*623.29*/ {_display_(Seq[Any](format.raw/*623.31*/("""
<script>
  $(function () """),format.raw/*625.17*/("""{"""),format.raw/*625.18*/("""
    var test = 'first'; """),format.raw/*626.61*/("""
    $('#myTabBar a:' + test).tab('show');
    $('#myTab a[href="#tab2"]').tab('show');
  """),format.raw/*629.3*/("""}"""),format.raw/*629.4*/(""")
</script>
""")))})),format.raw/*631.2*/("""
"""))}
    }
    
    def render(taxonomy:List[String],taxon:ArrayList[Taxonomy],biolsource:List[Biolsource],groupTax:List[List[String]],sources:HashSet[String],proteins:HashSet[String],proteinList:ArrayList[Proteins],tissueList:ArrayList[Tissue],tissueTerms:List[Tissue],glycobasePerturbation:List[GlycobaseSource],output:List[String],count:Integer,outputtissue:List[String],counttissue:Integer,outputprotein:List[String],countprotein:Integer): play.api.templates.HtmlFormat.Appendable = apply(taxonomy,taxon,biolsource,groupTax,sources,proteins,proteinList,tissueList,tissueTerms,glycobasePerturbation,output,count,outputtissue,counttissue,outputprotein,countprotein)
    
    def f:((List[String],ArrayList[Taxonomy],List[Biolsource],List[List[String]],HashSet[String],HashSet[String],ArrayList[Proteins],ArrayList[Tissue],List[Tissue],List[GlycobaseSource],List[String],Integer,List[String],Integer,List[String],Integer) => play.api.templates.HtmlFormat.Appendable) = (taxonomy,taxon,biolsource,groupTax,sources,proteins,proteinList,tissueList,tissueTerms,glycobasePerturbation,output,count,outputtissue,counttissue,outputprotein,countprotein) => apply(taxonomy,taxon,biolsource,groupTax,sources,proteins,proteinList,tissueList,tissueTerms,glycobasePerturbation,output,count,outputtissue,counttissue,outputprotein,countprotein)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 02 10:52:55 EST 2014
                    SOURCE: /Users/matthew/git/glycomics_working/app/views/browse.scala.html
                    HASH: aa1a167167d10ace399eeb737e1b05cf9eda5d09
                    MATRIX: 1006->1|1545->445|1582->448|1593->452|1630->453|1697->493|1725->494|1814->556|1842->557|2038->725|2067->726|2124->756|2152->757|2204->781|2233->782|2290->812|2318->813|2371->838|2400->839|2464->876|2492->877|2545->902|2574->903|2638->940|2666->941|2698->946|2726->947|2756->950|2784->951|2869->1008|2898->1009|2952->1035|2981->1036|3122->1150|3151->1151|3182->1155|3210->1156|3294->1212|3323->1213|3377->1239|3406->1240|3550->1357|3579->1358|3617->1369|3646->1370|3730->1426|3759->1427|3813->1453|3842->1454|3986->1571|4015->1572|4053->1583|4082->1584|4167->1641|4196->1642|4250->1668|4279->1669|4422->1785|4451->1786|4489->1797|4518->1798|4603->1855|4632->1856|4686->1882|4715->1883|4858->1999|4887->2000|4925->2011|4954->2012|5039->2069|5068->2070|5122->2096|5151->2097|5295->2214|5324->2215|5362->2226|5391->2227|5476->2284|5505->2285|5559->2311|5588->2312|5731->2428|5760->2429|5798->2440|5827->2441|5913->2498|5943->2499|5998->2525|6028->2526|6172->2642|6202->2643|6241->2654|6271->2655|6357->2712|6387->2713|6442->2739|6472->2740|6616->2856|6646->2857|6685->2868|6715->2869|6801->2926|6831->2927|6887->2954|6917->2955|7068->3078|7098->3079|7137->3090|7167->3091|7253->3148|7283->3149|7339->3176|7369->3177|7514->3294|7544->3295|7583->3306|7613->3307|7686->3351|7716->3352|7798->3397|7833->3415|7873->3416|7942->3448|7966->3449|8012->3462|8130->3551|8160->3552|8290->3654|8320->3655|8464->3771|8494->3772|8560->3809|8590->3810|8666->3850|8700->3867|8740->3868|8797->3888|8821->3889|8859->3895|8967->3974|8997->3975|9117->4067|9147->4068|9278->4171|9307->4172|9380->4216|9410->4217|9495->4265|9531->4284|9571->4285|9643->4320|9667->4321|9713->4334|9844->4436|9874->4437|10010->4545|10040->4546|10160->4638|10190->4639|11052->5464|11084->5485|11135->5488|11151->5493|11187->5501|11227->5503|11265->5530|11316->5533|11338->5544|11374->5552|11414->5554|11451->5580|11502->5583|11523->5593|11559->5601|11787->5792|11812->5806|11863->5809|11897->5815|11937->5817|11968->5837|12019->5840|12059->5852|12865->6621|12896->6642|12946->6645|12961->6650|12996->6658|13035->6660|13072->6687|13123->6690|13145->6701|13181->6709|13221->6711|13258->6737|13309->6740|13330->6750|13366->6758|18538->11926|18586->11962|18775->14323|18823->14362|22943->18473|22991->18509|23036->18542|23135->18605|23170->18623|23211->18625|23293->18671|23325->18680|23374->18697|23417->18704|23458->18728|23499->18730|23581->18776|23613->18785|23662->18802|23705->18809|23747->18834|23788->18836|23870->18882|23902->18891|23951->18908|23995->18916|24028->18939|24069->18941|24112->18948|24149->18975|24189->18976|24655->19410|24699->19418|24737->19439|24778->19441|24908->19534|24941->19557|24982->19559|25029->19569|25045->19575|25123->19629|25160->19632|25204->19640|25237->19663|25278->19665|25325->19675|25341->19681|25408->19725|25444->19728|25487->19735|25497->19736|25525->19741|25595->19774|25606->19775|25647->19793|25824->19933|25840->19939|25913->19988|25954->19991|25966->19992|26008->20010|26091->20061|26129->20067|26174->20076|26229->20121|26270->20123|26312->20129|26348->20155|26388->20156|26853->20589|26896->20596|26933->20616|26974->20618|27080->20687|27091->20688|27119->20693|27159->20696|27170->20697|27198->20702|27238->20705|27249->20706|27277->20711|27317->20714|27328->20715|27356->20720|27458->20785|27469->20786|27508->20802|27687->20944|27698->20945|27737->20961|27819->21011|27857->21017|27900->21024|27956->21063|27997->21065|28164->21195|28179->21200|28210->21208|28250->21211|28265->21216|28296->21224|28330->21359|28387->21379|28402->21384|28443->21402|28541->21463|28619->21523|28661->21525|28700->21528|28736->21554|28777->21556|28825->21567|28841->21573|28922->21630|28963->21633|28977->21636|29009->21644|29051->21652|29090->21655|29126->21681|29167->21683|29214->21693|29230->21699|29302->21748|29342->21751|29356->21754|29388->21762|29430->21770|29469->21777|29626->21897|29641->21902|29672->21910|29712->21913|29727->21918|29770->21937|29858->21989|29899->22015|30043->22123|30057->22128|30115->22163|30165->22177|30197->22199|30238->22201|30293->22227|30323->22228|30377->22289|30495->22379|30524->22380|30569->22393|30608->22396|30641->22419|30682->22421|30737->22447|30767->22448|30821->22509|30939->22599|30968->22600|31013->22613|31052->22616|31090->22644|31131->22646|31186->22672|31216->22673|31270->22734|31388->22824|31417->22825|31462->22838|31501->22841|31538->22868|31579->22870|31634->22896|31664->22897|31718->22958|31836->23048|31865->23049|31910->23062
                    LINES: 26->1|29->1|31->3|31->3|31->3|34->6|34->6|35->7|35->7|41->13|41->13|43->15|43->15|44->16|44->16|46->18|46->18|48->20|48->20|50->22|50->22|52->24|52->24|54->26|54->26|57->29|57->29|58->30|58->30|62->34|62->34|63->35|63->35|67->39|67->39|68->40|68->40|71->43|71->43|72->44|72->44|76->48|76->48|77->49|77->49|80->52|80->52|81->53|81->53|85->57|85->57|86->58|86->58|90->62|90->62|91->63|91->63|95->67|95->67|96->68|96->68|100->72|100->72|101->73|101->73|105->77|105->77|106->78|106->78|110->82|110->82|111->83|111->83|115->87|115->87|116->88|116->88|120->92|120->92|121->93|121->93|125->97|125->97|126->98|126->98|130->102|130->102|131->103|131->103|135->107|135->107|136->108|136->108|140->112|140->112|141->113|141->113|145->117|145->117|146->118|146->118|150->122|150->122|151->123|151->123|155->127|155->127|156->128|156->128|160->132|160->132|161->133|161->133|165->137|165->137|166->138|166->138|170->142|170->142|172->144|172->144|172->144|173->145|173->145|174->146|177->149|177->149|179->151|179->151|184->156|184->156|188->160|188->160|190->162|190->162|190->162|191->163|191->163|192->164|195->167|195->167|197->169|197->169|202->174|202->174|206->178|206->178|208->180|208->180|208->180|209->181|209->181|210->182|213->185|213->185|215->187|215->187|219->191|219->191|242->214|242->214|242->214|242->214|242->214|242->214|242->214|242->214|242->214|242->214|242->214|242->214|242->214|242->214|242->214|244->216|244->216|244->216|244->216|244->216|244->216|244->216|244->216|261->233|261->233|261->233|261->233|261->233|261->233|261->233|261->233|261->233|261->233|261->233|261->233|261->233|261->233|261->233|361->333|363->335|369->390|371->392|452->473|454->475|455->476|461->482|461->482|461->482|463->484|463->484|465->486|467->488|467->488|467->488|469->490|469->490|471->492|473->494|473->494|473->494|475->496|475->496|477->498|480->501|480->501|480->501|482->503|482->503|482->503|495->516|498->519|498->519|498->519|501->522|501->522|501->522|501->522|501->522|501->522|501->522|502->523|502->523|502->523|502->523|502->523|502->523|502->523|503->524|503->524|503->524|504->525|504->525|504->525|507->528|507->528|507->528|507->528|507->528|507->528|510->531|511->532|515->536|515->536|515->536|516->537|516->537|516->537|529->550|531->552|531->552|531->552|533->554|533->554|533->554|533->554|533->554|533->554|533->554|533->554|533->554|533->554|533->554|533->554|535->556|535->556|535->556|538->559|538->559|538->559|541->562|542->563|544->565|544->565|544->565|546->567|546->567|546->567|546->567|546->567|546->567|546->567|547->568|547->568|547->568|547->568|547->568|547->568|548->569|548->569|548->569|548->569|548->569|548->569|548->569|548->569|548->569|548->569|549->570|549->570|549->570|549->570|549->570|549->570|549->570|549->570|549->570|549->570|551->572|554->575|554->575|554->575|554->575|554->575|554->575|558->579|560->581|569->590|569->590|569->590|572->593|572->593|572->593|574->595|574->595|575->596|578->599|578->599|580->601|582->603|582->603|582->603|584->605|584->605|585->606|588->609|588->609|590->611|592->613|592->613|592->613|594->615|594->615|595->616|598->619|598->619|600->621|602->623|602->623|602->623|604->625|604->625|605->626|608->629|608->629|610->631
                    -- GENERATED --
                */
            