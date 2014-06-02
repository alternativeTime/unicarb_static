
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
object browseunicarb extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[String],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(taxonomy: List[String] ):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.27*/("""

"""),_display_(Seq[Any](/*3.2*/main/*3.6*/{_display_(Seq[Any](format.raw/*3.7*/("""

<script>
	$(function() """),format.raw/*6.15*/("""{"""),format.raw/*6.16*/("""
	var myArray = new Array();
	"""),_display_(Seq[Any](/*8.3*/for(a <- taxonomy) yield /*8.21*/{_display_(Seq[Any](format.raw/*8.22*/("""
		myArray.push(""""),_display_(Seq[Any](/*9.18*/a)),format.raw/*9.19*/("""");
	""")))})),format.raw/*10.3*/("""
	options = '';
	for (var i = 0; i < myArray.length; i++) """),format.raw/*12.43*/("""{"""),format.raw/*12.44*/("""
      		options += '<option value="' + myArray[i] + '">' + myArray[i] + '</option>';
  	"""),format.raw/*14.4*/("""}"""),format.raw/*14.5*/("""
  	$('#e1').html(options);

	"""),format.raw/*17.2*/("""}"""),format.raw/*17.3*/(""");




</script>


      <ul class="breadcrumb">
        <li><a href="#">Curated Database</a> <span class="divider">/</span></li>
        <li><a href="#">GlycoSuite</a> <span class="divider">/</span></li>
        <li><a href="../references">Reference</a> <span class="divider">/</span></li>
        <li class="active">You are here</li>
      </ul>

    <section id="layouts" class="browse">
      <h1>Browse</h1>
      <h4 class="subheader">Currently returning results from GlycosuiteDB, EuroCarb, and NextProt</h4>
      <div class="row-fluid">
        <div class="span12">
        <select class="" name="mydropdown">
          <option value="">Select a Protine database to search:</option>
          <option value="Milk">Fresh Milk</option>
          <option value="Cheese">Old Cheese</option>
          <option value="Bread">Hot Bread</option>
        </select>
      </div>
      </div>
      <div class="row-fluid">
        <div class="span3 filterbar tabbable">
          <ul class="nav nav-tabs">
            <li><a href="#filter1" data-toggle="tab">Taxonomy</a></li>
            <li class=""><a href="#filter2" data-toggle="tab">Protein</a></li>
            <li><a href="#filter3" data-toggle="tab">Structure</a></li>
          </ul>
        </div><!-- /col -->
        <div class="span9 rightpanel">
          <div class="tabbable"> <!-- Only required for left/right tabs -->
            <ul class="nav nav-tabs">
              <li class="active"><a href="#tab1" data-toggle="tab">Filters</a></li>
              <li><a href="#tab2" data-toggle="tab">Results</a></li>
              <li><a href="#tab3" data-toggle="tab">Related Results</a></li>
            </ul>
            <div class="tab-content results">
              <div class="tab-pane active" id="tab1">
                <h2>Filter</h2>
<div id="filter1" class="control-group glycosuitedb">
                  <div class="controls">
                    <label class="checkbox">
			<form class="form-search">
		 	<div id="selection">
			<select  name=taxonomy MULTIPLE id="e1" style="width:300px"  id="listBox"></select>
			<button type="submit" class="btn">Search</button>
			</div>
			</form>
		</div>
	      </div>
                <div id="filter1" class="control-group glycosuitedb">
                  <div class="controls">
                    <label class="checkbox">
                      <input type="checkbox"> Query by Disease State: 
                      <select name=disease MULTIPLE id="e1" style="width:300px">
                        <option value =" #none">NONE</option>
                        <option value =" #any" >ALL</option>
                        <option value="Adenocarcinoma">Adenocarcinoma</option>
                        <option value="Adenocarcinoma, Grade II">Adenocarcinoma, Grade II</option>
                        <option value="Alzheimer's">Alzheimer's</option>
                        <option value="Amyloidosis, A-I Amyloid">Amyloidosis, A-I Amyloid</option>
                        <option value="Amyloidosis, AA Amyloid">Amyloidosis, AA Amyloid</option>
                        <option value="Amyloidosis, AL Amyloid">Amyloidosis, AL Amyloid</option>
                        <option value="Anemia, Aplastic">Anemia, Aplastic</option>
                        <option value="Arthritis">Arthritis</option>
                        <option value="Aspartylglycosaminuria">Aspartylglycosaminuria</option>
                        <option value="Bronchiectasis, due to Kartagener's Syndrome">Bronchiectasis, due to Kartagener's Syndrome</option>
                        <option value="Bronchitis, Chronic">Bronchitis, Chronic</option>
                        <option value="Cancer, Bile duct">Cancer, Bile duct</option>
                        <option value="Cancer, Ovarian">Cancer, Ovarian</option>
                        <option value="Cancer, Ovarian (Cystic)">Cancer, Ovarian (Cystic)</option>
                        <option value="Carbohydrate-Deficient Glycoprotein Syndrome, Type II">Carbohydrate-Deficient Glycoprotein Syndrome, Type II</option>
                        <option value="Carcinoid Tumor, with multiple liver metastasis">Carcinoid Tumor, with multiple liver metastasis</option>
                        <option value="Carcinoma">Carcinoma</option>
                        <option value="Carcinoma, Gallbladder which metastasises to the liver">Carcinoma, Gallbladder which metastasises to the liver</option>
                        <option value="Carcinoma, Hepatocellular">Carcinoma, Hepatocellular</option>
                        <option value="Carcinoma, Lewis Lung">Carcinoma, Lewis Lung</option>
                        <option value="Carcinoma, Squamous cell">Carcinoma, Squamous cell</option>
                        <option value="Chondrosarcoma">Chondrosarcoma</option><option value="Choriocarcinoma">Choriocarcinoma</option>
                        <option value="Choriocarcinoma, with Hyperthyroidism">Choriocarcinoma, with Hyperthyroidism</option>
                        <option value="Cyst">Cyst</option>
                        <option value="Cystic Fibrosis">Cystic Fibrosis</option>
                        <option value="Diabetes Mellitus">Diabetes Mellitus</option>
                        <option value="Diabetes Mellitus, Non-insulin dependent">Diabetes Mellitus, Non-insulin dependent</option>
                        <option value="Diverticulosis">Diverticulosis</option>
                        <option value="Dyscrasia, Plasma Cell">Dyscrasia, Plasma Cell</option>
                        <option value="Erythroleukemia with associated Polycythemia">Erythroleukemia with associated Polycythemia</option>
                        <option value="Fibrosarcoma">Fibrosarcoma</option>
                        <option value="Fucosidosis">Fucosidosis</option>
                        <option value="Gangliosidosis GM1">Gangliosidosis GM1</option>
                        <option value="Gaucher Disease">Gaucher Disease</option>
                        <option value="Glioma">Glioma</option>
                        <option value="Heavy Chain Disease">Heavy Chain Disease</option>
                        <option value="Hydatidiform Mole">Hydatidiform Mole</option>
                        <option value="Hydatidiform Mole, Invasive">Hydatidiform Mole, Invasive</option>
                        <option value="Hypercholesterolemia, Familial">Hypercholesterolemia, Familial</option>
                        <option value="Hyperlipoproteinemia, Familial Type V">Hyperlipoproteinemia, Familial Type V</option>
                        <option value="Infantile Sialidosis, Type II (Dysmorphic)">Infantile Sialidosis, Type II (Dysmorphic)</option>
                        <option value="Kidney Failure, Chronic">Kidney Failure, Chronic</option>
                        <option value="Leukemia">Leukemia</option>
                        <option value="Leukemia, Acute lymphoblastic">Leukemia, Acute lymphoblastic</option>
                        <option value="Leukemia, Acute lymphoblastic and HIV-1">Leukemia, Acute lymphoblastic and HIV-1</option>
                        <option value="Leukemia, Acute myelogenous">Leukemia, Acute myelogenous</option>
                        <option value="Leukemia, Chronic myelogenous">Leukemia, Chronic myelogenous</option>
                        <option value="Leukemia, Promyelocytic">Leukemia, Promyelocytic</option>
                        <option value="Lymphoma">Lymphoma</option>
                        <option value="Lymphoma, Burkitt">Lymphoma, Burkitt</option>
                        <option value="Lymphoma, Lymphoblastic">Lymphoma, Lymphoblastic</option>
                        <option value="Lymphoma, Thymic">Lymphoma, Thymic</option>
                        <option value="Lysosomal storage disease">Lysosomal storage disease</option>
                        <option value="Malaria Tropica, Malignant">Malaria Tropica, Malignant</option>
                        <option value="Malignant material">Malignant material</option>
                        <option value="Mannosidosis, alpha">Mannosidosis, alpha</option>
                        <option value="Mannosidosis, beta">Mannosidosis, beta</option>
                        <option value="Melanoma">Melanoma</option>
                        <option value="Myeloma">Myeloma</option>
                        <option value="Myeloma (Mouse)">Myeloma (Mouse)</option>
                        <option value="Myeloma, Multiple with an accompanying Hypogammaglobulinaemia">Myeloma, Multiple with an accompanying Hypogammaglobulinaemia</option>
                        <option value="Neuroblastoma">Neuroblastoma</option>
                        <option value="Pancreatitis, Chronic">Pancreatitis, Chronic</option>
                        <option value="Parasite Nippostrongylus brasiliensis infection">Parasite Nippostrongylus brasiliensis infection</option>
                        <option value="Plasmacytoma (Mouse)">Plasmacytoma (Mouse)</option>
                        <option value="Sialidosis (Mucolipidosis I)">Sialidosis (Mucolipidosis I)</option>
                        <option value="Sialidosis, severe infantile with abdominal ascites">Sialidosis, severe infantile with abdominal ascites</option>
                        <option value="Tn Polyagglutinability Syndrome">Tn Polyagglutinability Syndrome</option>
                        <option value="Tumor, Endodermal Sinus">Tumor, Endodermal Sinus</option>
                        <option value="Tumor, Glial">Tumor, Glial</option>
                        <option value="Tumor, Pituitary">Tumor, Pituitary</option>
                        <option value="Tumor, Subcutaneous">Tumor, Subcutaneous</option>
                        <option value="Waldenstrom Macroglobulinaemia">Waldenstrom Macroglobulinaemia</option>
                        <option value="Wiskott-Aldrich Syndrome">Wiskott-Aldrich Syndrome</option>
                        <option value="Zajdela Hepatocarcinoma">Zajdela Hepatocarcinoma</option>
                        <option>
                      </select>
                      <span>Or</span>
                      <input type="text" placeholder="Disease keyword">
                    </label>
                  </div>
                </div>
                <div id="filter2" class="tab-pane control-group eurocarb">
                  <div class="controls">
                    <label class="checkbox">
                      <input type="checkbox"> Linkage 
                      <select class="" name="mydropdown">
                        <option value="">Select a Protine database to search:</option>
                        <option value="Milk">Fresh Milk</option>
                        <option value="Cheese">Old Cheese</option>
                        <option value="Bread">Hot Bread</option>
                      </select>
                      <input type="text" placeholder="Text input">
                    </label>
                  </div>
                </div>
                <div id="filter3" class="tab-pane control-group nextprot">
                  <div class="controls">
                    <label class="checkbox">
                      <input type="checkbox"> Linkage 
                      <select class="" name="mydropdown">
                        <option value="">Select a Protine database to search:</option>
                        <option value="Milk">Fresh Milk</option>
                        <option value="Cheese">Old Cheese</option>
                        <option value="Bread">Hot Bread</option>
                      </select>
                      <input type="text" placeholder="Text input">
                    </label>
                  </div>
                </div>
              </div>
              <div class="tab-pane" id="tab2">
                <h2>Browse Results</h2>
                <div class="row-fluid">
                  <h3><a href="#">Example Result 01</a><span class="pull-right"><span class="label success">Curated Entry</span> <span class="label notice">GlycoSuiteDB</span></span></h3>
                  <div class="details span9">
                    <p class="">Lorem ipsum dolor sit amet, consectetur adipiscing amet semper bibendum, leo ipsum rhoncus sapien, vitae adipiscing mauris velit at tellus.</p>
                  </div>
                  <div class="span3">
                    <p class="pull-right">12.06.12</p>
                  </div>
                </div>
                <div class="row-fluid">
                  <h3><a href="#">Example Result 01</a><span class="pull-right"><span class="label success">Curated Entry</span> <span class="label notice">GlycoSuiteDB</span></span></h3>
                  <div class="details span9">
                    <p class="">Lorem ipsum dolor sit amet, consectetur adipiscing amet semper bibendum, leo ipsum rhoncus sapien, vitae adipiscing mauris velit at tellus.</p>
                  </div>
                  <div class="span3">
                    <p class="pull-right">12.06.12</p>
                  </div>
                </div>
              </div>
              <div class="tab-pane" id="tab3">
                <h2>Browse Related Results</h2>
                <div class="row-fluid">
                  <h3><a href="#">Example Result 01</a><span class="pull-right"><span class="label success">Curated Entry</span> <span class="label notice">GlycoSuiteDB</span></span></h3>
                  <div class="details span9">
                    <p class="">Lorem ipsum dolor sit amet, consectetur adipiscing amet semper bibendum, leo ipsum rhoncus sapien, vitae adipiscing mauris velit at tellus.</p>
                  </div>
                  <div class="span3">
                    <p class="pull-right">12.06.12</p>
                  </div>
                </div>
                <div class="row-fluid">
                  <h3><a href="#">Example Result 01</a><span class="pull-right"><span class="label success">Curated Entry</span> <span class="label notice">GlycoSuiteDB</span></span></h3>
                  <div class="details span9">
                    <p class="">Lorem ipsum dolor sit amet, consectetur adipiscing amet semper bibendum, leo ipsum rhoncus sapien, vitae adipiscing mauris velit at tellus.</p>
                  </div>
                  <div class="span3">
                    <p class="pull-right">12.06.12</p>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div><!-- /col -->
      </div><!-- /row -->
    </section>

""")))})))}
    }
    
    def render(taxonomy:List[String]): play.api.templates.HtmlFormat.Appendable = apply(taxonomy)
    
    def f:((List[String]) => play.api.templates.HtmlFormat.Appendable) = (taxonomy) => apply(taxonomy)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 02 10:52:55 EST 2014
                    SOURCE: /Users/matthew/git/glycomics_working/app/views/browseunicarb.scala.html
                    HASH: 22156eb0659f172b07d3a40dca2c11e30cc17670
                    MATRIX: 788->1|907->26|944->29|955->33|992->34|1044->59|1072->60|1137->91|1170->109|1208->110|1261->128|1283->129|1320->135|1406->193|1435->194|1551->283|1579->284|1636->314|1664->315
                    LINES: 26->1|29->1|31->3|31->3|31->3|34->6|34->6|36->8|36->8|36->8|37->9|37->9|38->10|40->12|40->12|42->14|42->14|45->17|45->17
                    -- GENERATED --
                */
            