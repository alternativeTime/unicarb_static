
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
object ms extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[SqlRow],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(groupStructures: List[SqlRow] ):play.api.templates.Html = {
        _display_ {import helper._


Seq(format.raw/*1.34*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*6.37*/("""

<!DOCTYPE html>
<html>
    <head>
        <title>Reference</title>
         <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq(/*12.71*/routes/*12.77*/.Assets.at("/public", "stylesheets/bootstrap.min.css"))),format.raw/*12.131*/(""""> 
        """),format.raw/*13.144*/("""
         <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq(/*14.71*/routes/*14.77*/.Assets.at("/public", "stylesheets/style.css"))),format.raw/*14.123*/(""""> 
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq(/*15.70*/routes/*15.76*/.Assets.at("/public", "stylesheets/customMarkdown.css"))),format.raw/*15.131*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq(/*16.70*/routes/*16.76*/.Assets.at("/public", "stylesheets/jquery.lightbox-0.5.css"))),format.raw/*16.136*/("""">
"""),format.raw/*17.98*/("""
        <script src="http://static.scripting.com/github/bootstrap2/js/bootstrap-modal.js"></script>
	<script src=""""),_display_(Seq(/*19.16*/routes/*19.22*/.Assets.at("/public","javascripts/bootstrap-modal.js"))),format.raw/*19.76*/(""""></script>
        <script src=""""),_display_(Seq(/*20.23*/routes/*20.29*/.Assets.at("/public","javascripts/jquery.ae.image.resize.min.js"))),format.raw/*20.94*/(""""></script>
       """),format.raw/*21.112*/("""
        <script src=""""),_display_(Seq(/*22.23*/routes/*22.29*/.Assets.at("/public","javascripts/bootstrap.min.js"))),format.raw/*22.81*/(""""></script>
        <script src=""""),_display_(Seq(/*23.23*/routes/*23.29*/.Assets.at("/public","javascripts/jquery.tablesorter.min.js"))),format.raw/*23.90*/(""""></script>
        <script src=""""),_display_(Seq(/*24.23*/routes/*24.29*/.Assets.at("/public","javascripts/jquery.lightbox-0.5.min.js"))),format.raw/*24.91*/(""""></script>
        <script src=""""),_display_(Seq(/*25.23*/routes/*25.29*/.Assets.at("/public","javascripts/jquery.lightbox-0.5.pack.js"))),format.raw/*25.92*/(""""></script>
        <script src=""""),_display_(Seq(/*26.23*/routes/*26.29*/.Assets.at("/public","javascripts/showdown.js"))),format.raw/*26.76*/(""""></script>
        <script src=""""),_display_(Seq(/*27.23*/routes/*27.29*/.Assets.at("/public","javascripts/google-jsapi.js"))),format.raw/*27.80*/(""""></script>
"""),format.raw/*28.88*/("""
        <script src=""""),_display_(Seq(/*29.23*/routes/*29.29*/.Assets.at("/public","javascripts/jPages.js"))),format.raw/*29.74*/(""""></script>
        <script src=""""),_display_(Seq(/*30.23*/routes/*30.29*/.Assets.at("/public","javascripts/jquery.lazyload.js"))),format.raw/*30.83*/(""""></script>

	<script>

/* Download lazy load plugin and make sure you add it in the head of your page. */

/* when document is ready */
$(function() """),format.raw("""{"""),format.raw/*37.15*/("""
    
    /* initiate lazyload defining a custom event to trigger image loading  */
    $("ul li img").lazyload("""),format.raw("""{"""),format.raw/*40.30*/("""
        event : "turnPage",
        effect : "fadeIn"
    """),format.raw("""}"""),format.raw/*43.6*/(""");

    /* initiate plugin */
    $("div.pagination").jPages("""),format.raw("""{"""),format.raw/*46.33*/("""
        containerID : "itemContainer",
        animation   : "fadeInUp",
        callback    : function( pages, items )"""),format.raw("""{"""),format.raw/*49.48*/("""
            /* lazy load current images */
            items.showing.find("img").trigger("turnPage");
            /* lazy load next page images */
            items.oncoming.find("img").trigger("turnPage");
        """),format.raw("""}"""),format.raw/*54.10*/("""
    """),format.raw("""}"""),format.raw/*55.6*/(""");

"""),format.raw("""}"""),format.raw/*57.2*/(""");
</script>



<style type="text/css">

	.holder """),format.raw("""{"""),format.raw/*64.11*/("""
    		margin: 15px 0;
    	"""),format.raw("""}"""),format.raw/*66.7*/("""
    
    	.holder a """),format.raw("""{"""),format.raw/*68.17*/("""
    		font-size: 14px;
    		cursor: pointer;
    		margin: 0 5px;
    		color: #0F466F; 
    	"""),format.raw("""}"""),format.raw/*73.7*/("""
    
    	.holder a:hover """),format.raw("""{"""),format.raw/*75.23*/("""
    		background-color: #222;
    		color: #fff;
    	"""),format.raw("""}"""),format.raw/*78.7*/("""
    
    	.holder a.jp-previous """),format.raw("""{"""),format.raw/*80.29*/(""" margin-right: 15px; """),format.raw("""}"""),format.raw/*80.51*/("""
    	.holder a.jp-next """),format.raw("""{"""),format.raw/*81.25*/(""" margin-left: 15px; """),format.raw("""}"""),format.raw/*81.46*/("""
    
    	.holder a.jp-current, a.jp-current:hover """),format.raw("""{"""),format.raw/*83.48*/(""" 
    		color: #FF4242;
    		font-weight: bold;
    	"""),format.raw("""}"""),format.raw/*86.7*/("""
    
    	.holder a.jp-disabled, a.jp-disabled:hover """),format.raw("""{"""),format.raw/*88.50*/("""
    		color: #bbb;
    	"""),format.raw("""}"""),format.raw/*90.7*/("""
    
    	.holder a.jp-current, a.jp-current:hover,
    	.holder a.jp-disabled, a.jp-disabled:hover """),format.raw("""{"""),format.raw/*93.50*/("""
    		cursor: default; 
    		background: none;
    	"""),format.raw("""}"""),format.raw/*96.7*/("""
    
    	.holder span """),format.raw("""{"""),format.raw/*98.20*/(""" margin: 0 5px; """),format.raw("""}"""),format.raw/*98.37*/("""
        
		/* content2 */

div#content2 """),format.raw("""{"""),format.raw/*102.15*/(""" float: left; width: 680px; """),format.raw("""}"""),format.raw/*102.44*/("""
div#content2 h2 """),format.raw("""{"""),format.raw/*103.18*/(""" font-size: 21px; margin-bottom: 30px; """),format.raw("""}"""),format.raw/*103.58*/("""
div#content2 h3 """),format.raw("""{"""),format.raw/*104.18*/(""" margin: 5px 0px 10px 0px; """),format.raw("""}"""),format.raw/*104.46*/("""
div#content2 p """),format.raw("""{"""),format.raw/*105.17*/(""" line-height:1.5; """),format.raw("""}"""),format.raw/*105.36*/("""
div#content2 p a """),format.raw("""{"""),format.raw/*106.19*/(""" color: white; background: #D4EE5E; font-weight: bold; """),format.raw("""}"""),format.raw/*106.75*/("""
div#content2 p a:hover """),format.raw("""{"""),format.raw/*107.25*/(""" background: black; """),format.raw("""}"""),format.raw/*107.46*/("""
div#content2 p + div """),format.raw("""{"""),format.raw/*108.23*/(""" margin-top: 50px; """),format.raw("""}"""),format.raw/*108.43*/("""
div#content2 h3 span """),format.raw("""{"""),format.raw/*109.23*/(""" background-color: #F4FAD2; color: #5C826D; padding: 2px 3px; margin-left: 10px; font-weight: normal; """),format.raw("""}"""),format.raw/*109.126*/("""

/* content2 -> Code */

div#content2 div.codeBlocks """),format.raw("""{"""),format.raw/*113.30*/(""" margin: 20px 0 35px; """),format.raw("""}"""),format.raw/*113.53*/("""

div#content2 pre """),format.raw("""{"""),format.raw/*115.19*/(""" float: left; margin-right: 10px; cursor: pointer; """),format.raw("""}"""),format.raw/*115.71*/("""
div#content2 pre:before """),format.raw("""{"""),format.raw/*116.26*/(""" content2: attr(class); padding: 2px 3px; color: white; """),format.raw("""}"""),format.raw/*116.83*/("""

div#content2 pre.html """),format.raw("""{"""),format.raw/*118.24*/(""" background: #F0F2EB; border-bottom: 1px solid #D7D9D3; """),format.raw("""}"""),format.raw/*118.81*/("""
div#content2 pre.html:before """),format.raw("""{"""),format.raw/*119.31*/(""" background: #D7D9D3; """),format.raw("""}"""),format.raw/*119.54*/("""

div#content2 pre.javascript """),format.raw("""{"""),format.raw/*121.30*/(""" background: #F4FAD2; border-bottom: 1px solid #DBE0BC; """),format.raw("""}"""),format.raw/*121.87*/("""
div#content2 pre.javascript:before """),format.raw("""{"""),format.raw/*122.37*/(""" background: #DBE0BC; """),format.raw("""}"""),format.raw/*122.60*/("""

div#content2 pre.css """),format.raw("""{"""),format.raw/*124.23*/(""" background: #E1EDB9; border-bottom: 1px solid #CAD5A6; """),format.raw("""}"""),format.raw/*124.80*/("""
div#content2 pre.css:before """),format.raw("""{"""),format.raw/*125.30*/(""" background: #CAD5A6; """),format.raw("""}"""),format.raw/*125.53*/("""

div#content2 pre.collapse """),format.raw("""{"""),format.raw/*127.28*/(""" position: relative; padding:2% 3%; width:94%; """),format.raw("""}"""),format.raw/*127.76*/("""
div#content2 pre.collapse:before """),format.raw("""{"""),format.raw/*128.35*/(""" position: absolute; right: 0; top: 0; """),format.raw("""}"""),format.raw/*128.75*/("""

div#content2 pre code """),format.raw("""{"""),format.raw/*130.24*/(""" display: none; background: none; font: 11px/16px "Courier New", Courier, monospace; """),format.raw("""}"""),format.raw/*130.110*/("""
div#content2 pre.collapse code """),format.raw("""{"""),format.raw/*131.33*/(""" display:block; """),format.raw("""}"""),format.raw/*131.50*/("""

/* content2 -> Unordered Lists */

div#content2 ul#itemContainer """),format.raw("""{"""),format.raw/*135.32*/(""" list-style: none; padding:0; margin: 20px 0;  """),format.raw("""}"""),format.raw/*135.80*/("""
div#content2 ul#itemContainer li """),format.raw("""{"""),format.raw/*136.35*/(""" display: inline-block; margin: 5px; zoom: 1; *display:inline; """),format.raw("""}"""),format.raw/*136.99*/("""
div#content2 ul#itemContainer ll li img """),format.raw("""{"""),format.raw/*137.42*/(""" vertical-align: bottom; width: 125px; height: 125px; """),format.raw("""}"""),format.raw/*137.97*/("""

/* content2 -> index */

div#content2.index pre """),format.raw("""{"""),format.raw/*141.25*/(""" float:none; cursor:default; """),format.raw("""}"""),format.raw/*141.55*/("""
div#content2.index pre code """),format.raw("""{"""),format.raw/*142.30*/(""" display:block; """),format.raw("""}"""),format.raw/*142.47*/("""
div#content2.index h2 """),format.raw("""{"""),format.raw/*143.24*/(""" margin-top: 55px; """),format.raw("""}"""),format.raw/*143.44*/("""
div#content2.index dl dt,
div#content2.index dl dd """),format.raw("""{"""),format.raw/*145.27*/(""" float: left; margin-top: 10px; """),format.raw("""}"""),format.raw/*145.60*/("""
div#content2.index dl dt """),format.raw("""{"""),format.raw/*146.27*/(""" clear: left; width: 70px; font-style: italic; """),format.raw("""}"""),format.raw/*146.75*/("""
div#content2.index dl dd """),format.raw("""{"""),format.raw/*147.27*/(""" width: 450px; """),format.raw("""}"""),format.raw/*147.43*/("""
div#content2.index i + p """),format.raw("""{"""),format.raw/*148.27*/(""" margin-top: 5px; """),format.raw("""}"""),format.raw/*148.46*/("""

/* content2 -> documentation */

div#content2.documentation h2 """),format.raw("""{"""),format.raw/*152.32*/(""" margin-top: 55px; """),format.raw("""}"""),format.raw/*152.52*/("""
div#content2.documentation dl dt,
div#content2.documentation dl dd """),format.raw("""{"""),format.raw/*154.35*/(""" float: left; margin-top: 10px; """),format.raw("""}"""),format.raw/*154.68*/("""
div#content2.documentation dl dt """),format.raw("""{"""),format.raw/*155.35*/(""" clear: left; width: 70px; font-style: italic; """),format.raw("""}"""),format.raw/*155.83*/("""
div#content2.documentation dl dd """),format.raw("""{"""),format.raw/*156.35*/(""" width: 450px; """),format.raw("""}"""),format.raw/*156.51*/("""
div#content2.documentation i + p """),format.raw("""{"""),format.raw/*157.35*/(""" margin-top: 5px; """),format.raw("""}"""),format.raw/*157.54*/("""

/* content2 -> author */

div#content2.author img """),format.raw("""{"""),format.raw/*161.26*/(""" margin-bottom: 50px; """),format.raw("""}"""),format.raw/*161.49*/("""
div#content2.author img + p:before """),format.raw("""{"""),format.raw/*162.37*/(""" content2: '“'; font-size:65px; font-family: Georgia; position:absolute; top: -55px; color: #ccc; """),format.raw("""}"""),format.raw/*162.136*/("""
div#content2.author p """),format.raw("""{"""),format.raw/*163.24*/(""" width: 590px; position: relative; """),format.raw("""}"""),format.raw/*163.60*/("""

/* =============================================================================
   Non-semantic helper classes
   Please define your styles before this section.
   ========================================================================== */

/* For image replacement */
.ir """),format.raw("""{"""),format.raw/*171.6*/(""" display: block; text-indent: -999em; overflow: hidden; background-repeat: no-repeat; text-align: left; direction: ltr; """),format.raw("""}"""),format.raw/*171.127*/("""
.ir br """),format.raw("""{"""),format.raw/*172.9*/(""" display: none; """),format.raw("""}"""),format.raw/*172.26*/("""

/* Hide for both screenreaders and browsers:
   css-discuss.incutio.com/wiki/Screenreader_Visibility */
.hidden """),format.raw("""{"""),format.raw/*176.10*/(""" display: none; visibility: hidden; """),format.raw("""}"""),format.raw/*176.47*/("""

/* Hide only visually, but have it available for screenreaders: by Jon Neal.
  www.webaim.org/techniques/css/invisiblecontent2/  &  j.mp/visuallyhidden */
.visuallyhidden """),format.raw("""{"""),format.raw/*180.18*/(""" border: 0; clip: rect(0 0 0 0); height: 1px; margin: -1px; overflow: hidden; padding: 0; position: absolute; width: 1px; """),format.raw("""}"""),format.raw/*180.141*/("""

/* Extends the .visuallyhidden class to allow the element to be focusable when navigated to via the keyboard: drupal.org/node/897638 */
.visuallyhidden.focusable:active, .visuallyhidden.focusable:focus """),format.raw("""{"""),format.raw/*183.68*/(""" clip: auto; height: auto; margin: 0; overflow: visible; position: static; width: auto; """),format.raw("""}"""),format.raw/*183.157*/("""

/* Hide visually and from screenreaders, but maintain layout */
.invisible """),format.raw("""{"""),format.raw/*186.13*/(""" visibility: hidden; """),format.raw("""}"""),format.raw/*186.35*/("""

/* Contain floats: nicolasgallagher.com/micro-clearfix-hack/ */ 
.clearfix:before, .clearfix:after """),format.raw("""{"""),format.raw/*189.36*/(""" content2: ""; display: table; """),format.raw("""}"""),format.raw/*189.68*/("""
.clearfix:after """),format.raw("""{"""),format.raw/*190.18*/(""" clear: both; """),format.raw("""}"""),format.raw/*190.33*/("""
.clearfix """),format.raw("""{"""),format.raw/*191.12*/(""" zoom: 1; """),format.raw("""}"""),format.raw/*191.23*/("""



/* =============================================================================
   PLACEHOLDER Media Queries for Responsive Design.
   These override the primary ('mobile first') styles
   Modify as content2 requires.
   ========================================================================== */


	</style>

    <body>

        """),format.raw/*212.20*/("""
<header>
<header>
        <div class="topbar">
      <div class="topbar-inner">
        <div class="container">
          <a class="brand" href="#">UniCarbKB</a>
          <ul class="nav">
            <li class="active"><a href="#">Home</a></li>
            <li><a href="#about">About</a></li>
            <li><a href="#contact">Contact</a></li>
          </ul>
          """),format.raw/*224.79*/("""
        </div>
      </div>
    </div>
       </header>



<section class="subHead" style="box-shadow: rgba(0, 0, 0, 0) 0px 0px 0px 0px; ">
	<section class="row-fluid subHeadInner borBox">
		<div class="span12">
			<h2 class="pull-left welcome"><img src="/images/dblogo.png" style="height:80px" />
 <small>an experimental LC-MS/MS database of glycan structures</small></h2>
			<figure class="menuButton btn sharp btn-success" style="display: none; "><i class="icon-white icon-th-list"></i> Menu</figure>
		</div>
	</section>
</section>
<section class="container-fluid" id="mainContainer">
	<div class="row-fluid">
		<div class="span2 sideBar" style="height: 273px; ">
			<ul>
				<li data-link="home" class=""><figure><i class="icon-home"></i> <div class="menuText">Home</div></figure></li>
				<li data-link="features"><figure><i class="icon-star"></i> <div class="menuText">Features</div></figure></li>
				<li data-link="dashboard"><figure><i class="icon-th-list"></i> <div class="menuText">Dashboard</div></figure></li>
				<hr>
				<li data-link="features"><figure><i class="icon-th-large"></i> <div class="menuText"><a href="http://unicarb-db.org/unicarbdb/show_mucin.action">303 Structures</a></div></figure></li>
				<li data-link="features"><figure><i class="icon-th-large"></i> <div class="menuText"><a href="http://unicarb-db.org/unicarbdb/show_mucin.action">269 MS/MS Spectra</a></div></figure></li>
				"""),format.raw/*257.14*/("""
			</ul>
		</div>
		<div class="span10 content" style="display: block">

<div class="row-fluid">
	<div class="span7">
	<p>A platform for presenting N- and O-linked oligosaccharide structures and fragment data characterized by LC-MS/MS strategies. The database is annotated with high-quality MS/MS datasets and is designed to extend and reinforce those standards and ontologies developed by existing glycomics databases.</p>
	<form class="well form-inline">
  <input type="text" class="input" placeholder="Search by mass">
  <label class="checkbox">
    <input type="checkbox"> -1 
  </label>
  <label class="checkbox">
    <input type="checkbox"> -2
  </label>
  <label class="checkbox">
    <input type="checkbox"> -3
  </label>
  <button type="submit" class="btn success">Filter</button>
  <a href="" class="btn btn-success">Glycan Builder Coming Soon</a>
</form>

		<!-- MEMEBER LIST ITEMS ARE FILLED HERE,
			YOU CAN DO IT BY EITHER METHOD, JAVASCRIPT BASED OR STATIC HTML -->
"""),format.raw/*292.13*/("""


<div id="content2"  style="min-height: 1000px">
       	<h3>Click on structure for information</h3> 
		<!-- navigation holder -->
        <div class="pagination" style="overflow-y:auto;overflow-x:hidden;height:100%;width:100%">></div>
        
        <!-- item container -->
        <ul id="itemContainer" >
		"""),_display_(Seq(/*302.4*/for(s <- groupStructures) yield /*302.29*/{_display_(Seq(format.raw/*302.30*/("""
		<li><img src="http://unicarb-db.biomedicine.gu.se/unicarbdb/get_sugar_image.action?download=true&scale=0.5&outputType=png&inputType=gws&tolerateUnknown=1&glycanSequenceId="""),_display_(Seq(/*303.175*/s("glycan_sequence_id"))),format.raw/*303.198*/("""" alt="image"></li>
		""")))})),format.raw/*304.4*/("""

		</ul>

	</div> <!--! end of #content -->

</div>



	<div class="span5">
	
		<div class="widget widget-nopad">
							
					<div class="widget-header">
						<i class="icon-list-alt"></i>
						<h3>Recent Published Data <small><a href="http://unicarb-db.org">(see all)</a></small></h3>
					</div> <!-- /widget-header -->
					
					<div class="widget-content">
						
						<ul class="news-items">
							<li>
								<div class="news-item-detail">										
									<a href="" class="news-item-title">Cross Validation of Liquid Chromatography-Mass Spectrometry and Lectin Array for Monitoring Glycosylation in Fed-Batch Glycoprotein Production</a>
									<p class="news-item-preview">Hayes CA, Doohan R, Kirkley D, Leister K, Harhen B, Savage AV, Karlsson NG.</p>
								</div>
								
								<div class="news-item-date">
									<img src="/images/charts.png">
								</div>
							</li>
							<li>
								<div class="news-item-detail">										
									<a href="javascript:;" class="news-item-title">GlycoSpectrumScan: fishing glycopeptides from MS spectra of protease digests of human colostrum sIgA.</a>
									<p class="news-item-preview">Deshpande N, Jensen PH, Packer NH, Kolarich D.</p>
								</div>
								
								<div class="news-item-date">
									<img src="/images/charts.png">
								</div>
							</li>
						</ul>
						
					</div> <!-- /widget-content -->
				
				</div>


	<div class="widget widget-nopad">

                                        <div class="widget-header">
                                                <i class="icon-eye-open"></i>
                                                <h3>Browse New Data Collections <small><a href="http://unicarb-db.org">(see all)</a></small></h3>
                                        </div> <!-- /widget-header -->

                                        <div class="widget-content">

                                                <ul class="news-items">
                                                        <li>
                                                                <div class="news-item-detail">
                                                                        <a href="" class="news-item-title">Saliva data ......</a>
                                                                </div>

                                                                <div class="news-item-date">
                                                                        <img src="/images/charts.png">
                                                                </div>
                                                        </li>
                                                        <li>
                                                                <div class="news-item-detail">
                                                                        <a href="javascript:;" class="news-item-title">Some agilent chip data</a>
                                                                </div>

                                                                <div class="news-item-date">
                                                                        <img src="/images/charts.png">
                                                                </div>
                                                        </li>
                                                </ul>

                                        </div> <!-- /widget-content -->

                                </div>

	<div class="page-header">
				<h1 class="hBig">Contributors <small>Curated and Annotated MS/MS Data</small></h1>
	</div>
				<p>Data collections have been contributed by researchers from:</p>
				<div class="news-item-detail">										
				<p class="news-item-preview">University of Gothenburg</p>
				<p class="news-item-preview">Macquarie University</p>
				<p class="news-item-preview">Max Planck</p>
				</div>

        </div>


</div></div>
	</div>
</section>
<footer style="box-shadow: rgba(0, 0, 0, 0.0585938) 0px -1px 5px 0px; ">
	<div class="container-fluid" id="footMain">
		<div class="row-fluid">
			<div class="span6">
				<div class="pull-left">
					<h6></h6>
				</div>
			</div>
			<div class="span6">
				<div class="pull-right">
					<h6>UniCarbKB</h6>
				</div>
			</div>
		</div>
	</div>
</footer>
</div>


 <!-- ##### MODALS #####- -->
<div class="modal fade hide" id="thisModal">

</div>


<!-- ### BACKGROUND DIV -->
<div class="bg">
</div>

<div class="commandWindow hide">
	<div class="commandWindow-inner">
		<h2 class="hBig">CommandLine</h2><br>
		<div class="form sharp form-horizontal">
			<div class="input-append row-fluid">
				<input class="sharp span9" id="commandInput" placeholder="Enter Command" type="text"><button class="btn btn-info">Go</button>
			</div>
		</div>
		<br>
		<div class="alert fade in">
			<a class="close" data-dismiss="alert">Ã</a>
			<p>Type <code> goto("dashboard") or goto("portfolio") </code></p>

		</div>
	</div>
</div>


	
"""))}
    }
    
    def render(groupStructures:List[SqlRow]) = apply(groupStructures)
    
    def f:((List[SqlRow]) => play.api.templates.Html) = (groupStructures) => apply(groupStructures)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Dec 18 08:54:50 EST 2012
                    SOURCE: /home/matthew/Documents/play-app/office/glycomics/app/views/ms.scala.html
                    HASH: 6896749cf9641e880872f3aa696fefe88f517a36
                    MATRIX: 758->1|878->33|905->51|933->160|1103->299|1118->305|1195->359|1236->506|1338->577|1353->583|1422->629|1526->702|1541->708|1619->763|1722->835|1737->841|1820->901|1851->1001|1998->1117|2013->1123|2089->1177|2154->1211|2169->1217|2256->1282|2304->1405|2358->1428|2373->1434|2447->1486|2512->1520|2527->1526|2610->1587|2675->1621|2690->1627|2774->1689|2839->1723|2854->1729|2939->1792|3004->1826|3019->1832|3088->1879|3153->1913|3168->1919|3241->1970|3281->2069|3335->2092|3350->2098|3417->2143|3482->2177|3497->2183|3573->2237|3771->2388|3931->2501|4037->2561|4146->2623|4314->2744|4578->2961|4630->2967|4681->2972|4779->3023|4854->3052|4923->3074|5066->3171|5141->3199|5243->3255|5324->3289|5393->3311|5465->3336|5533->3357|5633->3410|5734->3465|5836->3520|5908->3546|6057->3648|6158->3703|6230->3728|6294->3745|6384->3787|6461->3816|6527->3834|6615->3874|6681->3892|6757->3920|6822->3937|6889->3956|6956->3975|7060->4031|7133->4056|7202->4077|7273->4100|7341->4120|7412->4143|7564->4246|7667->4301|7738->4324|7806->4344|7906->4396|7980->4422|8085->4479|8158->4504|8263->4561|8342->4592|8413->4615|8492->4646|8597->4703|8682->4740|8753->4763|8825->4787|8930->4844|9008->4874|9079->4897|9156->4926|9252->4974|9335->5009|9423->5049|9496->5074|9631->5160|9712->5193|9777->5210|9893->5278|9989->5326|10072->5361|10184->5425|10274->5467|10377->5522|10476->5573|10554->5603|10632->5633|10697->5650|10769->5674|10837->5694|10938->5747|11019->5780|11094->5807|11190->5855|11265->5882|11329->5898|11404->5925|11471->5944|11585->6010|11653->6030|11770->6099|11851->6132|11934->6167|12030->6215|12113->6250|12177->6266|12260->6301|12327->6320|12428->6373|12499->6396|12584->6433|12732->6532|12804->6556|12888->6592|13214->6871|13384->6992|13440->7001|13505->7018|13668->7133|13753->7170|13975->7344|14147->7467|14400->7672|14538->7761|14664->7839|14734->7861|14884->7963|14964->7995|15030->8013|15093->8028|15153->8040|15212->8051|15578->8596|15980->9037|17426->10848|18437->12372|18783->12687|18825->12712|18860->12713|19068->12888|19115->12911|19170->12934
                    LINES: 27->1|31->1|32->3|33->6|39->12|39->12|39->12|40->13|41->14|41->14|41->14|42->15|42->15|42->15|43->16|43->16|43->16|44->17|46->19|46->19|46->19|47->20|47->20|47->20|48->21|49->22|49->22|49->22|50->23|50->23|50->23|51->24|51->24|51->24|52->25|52->25|52->25|53->26|53->26|53->26|54->27|54->27|54->27|55->28|56->29|56->29|56->29|57->30|57->30|57->30|64->37|67->40|70->43|73->46|76->49|81->54|82->55|84->57|91->64|93->66|95->68|100->73|102->75|105->78|107->80|107->80|108->81|108->81|110->83|113->86|115->88|117->90|120->93|123->96|125->98|125->98|129->102|129->102|130->103|130->103|131->104|131->104|132->105|132->105|133->106|133->106|134->107|134->107|135->108|135->108|136->109|136->109|140->113|140->113|142->115|142->115|143->116|143->116|145->118|145->118|146->119|146->119|148->121|148->121|149->122|149->122|151->124|151->124|152->125|152->125|154->127|154->127|155->128|155->128|157->130|157->130|158->131|158->131|162->135|162->135|163->136|163->136|164->137|164->137|168->141|168->141|169->142|169->142|170->143|170->143|172->145|172->145|173->146|173->146|174->147|174->147|175->148|175->148|179->152|179->152|181->154|181->154|182->155|182->155|183->156|183->156|184->157|184->157|188->161|188->161|189->162|189->162|190->163|190->163|198->171|198->171|199->172|199->172|203->176|203->176|207->180|207->180|210->183|210->183|213->186|213->186|216->189|216->189|217->190|217->190|218->191|218->191|233->212|245->224|272->257|297->292|307->302|307->302|307->302|308->303|308->303|309->304
                    -- GENERATED --
                */
            