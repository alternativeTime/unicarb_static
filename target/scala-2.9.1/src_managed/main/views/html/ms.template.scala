
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
        <script src="http://static.scripting.com/github/bootstrap2/js/jquery.js"></script>
        <script src="http://static.scripting.com/github/bootstrap2/js/bootstrap-modal.js"></script>
        <script src=""""),_display_(Seq(/*19.23*/routes/*19.29*/.Assets.at("/public","javascripts/jquery.ae.image.resize.min.js"))),format.raw/*19.94*/(""""></script>
        <script src="http://designshack.net/tutorialexamples/masonry/demos/jquery.wookmark.js"></script>
        <script src=""""),_display_(Seq(/*21.23*/routes/*21.29*/.Assets.at("/public","javascripts/bootstrap.min.js"))),format.raw/*21.81*/(""""></script>
        <script src=""""),_display_(Seq(/*22.23*/routes/*22.29*/.Assets.at("/public","javascripts/jquery.tablesorter.min.js"))),format.raw/*22.90*/(""""></script>
        <script src=""""),_display_(Seq(/*23.23*/routes/*23.29*/.Assets.at("/public","javascripts/jquery.lightbox-0.5.min.js"))),format.raw/*23.91*/(""""></script>
        <script src=""""),_display_(Seq(/*24.23*/routes/*24.29*/.Assets.at("/public","javascripts/jquery.lightbox-0.5.pack.js"))),format.raw/*24.92*/(""""></script>
        <script src=""""),_display_(Seq(/*25.23*/routes/*25.29*/.Assets.at("/public","javascripts/showdown.js"))),format.raw/*25.76*/(""""></script>
        <script src=""""),_display_(Seq(/*26.23*/routes/*26.29*/.Assets.at("/public","javascripts/google-jsapi.js"))),format.raw/*26.80*/(""""></script>
"""),format.raw/*27.88*/("""
        <script src=""""),_display_(Seq(/*28.23*/routes/*28.29*/.Assets.at("/public","javascripts/jPages.js"))),format.raw/*28.74*/(""""></script>
        <script src=""""),_display_(Seq(/*29.23*/routes/*29.29*/.Assets.at("/public","javascripts/jquery.lazyload.js"))),format.raw/*29.83*/(""""></script>

	<script>

/* Download lazy load plugin and make sure you add it in the head of your page. */

/* when document is ready */
$(function() """),format.raw("""{"""),format.raw/*36.15*/("""
    
    /* initiate lazyload defining a custom event to trigger image loading  */
    $("ul li img").lazyload("""),format.raw("""{"""),format.raw/*39.30*/("""
        event : "turnPage",
        effect : "fadeIn"
    """),format.raw("""}"""),format.raw/*42.6*/(""");

    /* initiate plugin */
    $("div.pagination").jPages("""),format.raw("""{"""),format.raw/*45.33*/("""
        containerID : "itemContainer",
        animation   : "fadeInUp",
        callback    : function( pages, items )"""),format.raw("""{"""),format.raw/*48.48*/("""
            /* lazy load current images */
            items.showing.find("img").trigger("turnPage");
            /* lazy load next page images */
            items.oncoming.find("img").trigger("turnPage");
        """),format.raw("""}"""),format.raw/*53.10*/("""
    """),format.raw("""}"""),format.raw/*54.6*/(""");

"""),format.raw("""}"""),format.raw/*56.2*/(""");
</script>



<style type="text/css">

	.holder """),format.raw("""{"""),format.raw/*63.11*/("""
    		margin: 15px 0;
    	"""),format.raw("""}"""),format.raw/*65.7*/("""
    
    	.holder a """),format.raw("""{"""),format.raw/*67.17*/("""
    		font-size: 14px;
    		cursor: pointer;
    		margin: 0 5px;
    		color: #0F466F; 
    	"""),format.raw("""}"""),format.raw/*72.7*/("""
    
    	.holder a:hover """),format.raw("""{"""),format.raw/*74.23*/("""
    		background-color: #222;
    		color: #fff;
    	"""),format.raw("""}"""),format.raw/*77.7*/("""
    
    	.holder a.jp-previous """),format.raw("""{"""),format.raw/*79.29*/(""" margin-right: 15px; """),format.raw("""}"""),format.raw/*79.51*/("""
    	.holder a.jp-next """),format.raw("""{"""),format.raw/*80.25*/(""" margin-left: 15px; """),format.raw("""}"""),format.raw/*80.46*/("""
    
    	.holder a.jp-current, a.jp-current:hover """),format.raw("""{"""),format.raw/*82.48*/(""" 
    		color: #FF4242;
    		font-weight: bold;
    	"""),format.raw("""}"""),format.raw/*85.7*/("""
    
    	.holder a.jp-disabled, a.jp-disabled:hover """),format.raw("""{"""),format.raw/*87.50*/("""
    		color: #bbb;
    	"""),format.raw("""}"""),format.raw/*89.7*/("""
    
    	.holder a.jp-current, a.jp-current:hover,
    	.holder a.jp-disabled, a.jp-disabled:hover """),format.raw("""{"""),format.raw/*92.50*/("""
    		cursor: default; 
    		background: none;
    	"""),format.raw("""}"""),format.raw/*95.7*/("""
    
    	.holder span """),format.raw("""{"""),format.raw/*97.20*/(""" margin: 0 5px; """),format.raw("""}"""),format.raw/*97.37*/("""
        
		/* content2 */

div#content2 """),format.raw("""{"""),format.raw/*101.15*/(""" float: left; width: 680px; """),format.raw("""}"""),format.raw/*101.44*/("""
div#content2 h2 """),format.raw("""{"""),format.raw/*102.18*/(""" font-size: 21px; margin-bottom: 30px; """),format.raw("""}"""),format.raw/*102.58*/("""
div#content2 h3 """),format.raw("""{"""),format.raw/*103.18*/(""" margin: 5px 0px 10px 0px; """),format.raw("""}"""),format.raw/*103.46*/("""
div#content2 p """),format.raw("""{"""),format.raw/*104.17*/(""" line-height:1.5; """),format.raw("""}"""),format.raw/*104.36*/("""
div#content2 p a """),format.raw("""{"""),format.raw/*105.19*/(""" color: white; background: #D4EE5E; font-weight: bold; """),format.raw("""}"""),format.raw/*105.75*/("""
div#content2 p a:hover """),format.raw("""{"""),format.raw/*106.25*/(""" background: black; """),format.raw("""}"""),format.raw/*106.46*/("""
div#content2 p + div """),format.raw("""{"""),format.raw/*107.23*/(""" margin-top: 50px; """),format.raw("""}"""),format.raw/*107.43*/("""
div#content2 h3 span """),format.raw("""{"""),format.raw/*108.23*/(""" background-color: #F4FAD2; color: #5C826D; padding: 2px 3px; margin-left: 10px; font-weight: normal; """),format.raw("""}"""),format.raw/*108.126*/("""

/* content2 -> Code */

div#content2 div.codeBlocks """),format.raw("""{"""),format.raw/*112.30*/(""" margin: 20px 0 35px; """),format.raw("""}"""),format.raw/*112.53*/("""

div#content2 pre """),format.raw("""{"""),format.raw/*114.19*/(""" float: left; margin-right: 10px; cursor: pointer; """),format.raw("""}"""),format.raw/*114.71*/("""
div#content2 pre:before """),format.raw("""{"""),format.raw/*115.26*/(""" content2: attr(class); padding: 2px 3px; color: white; """),format.raw("""}"""),format.raw/*115.83*/("""

div#content2 pre.html """),format.raw("""{"""),format.raw/*117.24*/(""" background: #F0F2EB; border-bottom: 1px solid #D7D9D3; """),format.raw("""}"""),format.raw/*117.81*/("""
div#content2 pre.html:before """),format.raw("""{"""),format.raw/*118.31*/(""" background: #D7D9D3; """),format.raw("""}"""),format.raw/*118.54*/("""

div#content2 pre.javascript """),format.raw("""{"""),format.raw/*120.30*/(""" background: #F4FAD2; border-bottom: 1px solid #DBE0BC; """),format.raw("""}"""),format.raw/*120.87*/("""
div#content2 pre.javascript:before """),format.raw("""{"""),format.raw/*121.37*/(""" background: #DBE0BC; """),format.raw("""}"""),format.raw/*121.60*/("""

div#content2 pre.css """),format.raw("""{"""),format.raw/*123.23*/(""" background: #E1EDB9; border-bottom: 1px solid #CAD5A6; """),format.raw("""}"""),format.raw/*123.80*/("""
div#content2 pre.css:before """),format.raw("""{"""),format.raw/*124.30*/(""" background: #CAD5A6; """),format.raw("""}"""),format.raw/*124.53*/("""

div#content2 pre.collapse """),format.raw("""{"""),format.raw/*126.28*/(""" position: relative; padding:2% 3%; width:94%; """),format.raw("""}"""),format.raw/*126.76*/("""
div#content2 pre.collapse:before """),format.raw("""{"""),format.raw/*127.35*/(""" position: absolute; right: 0; top: 0; """),format.raw("""}"""),format.raw/*127.75*/("""

div#content2 pre code """),format.raw("""{"""),format.raw/*129.24*/(""" display: none; background: none; font: 11px/16px "Courier New", Courier, monospace; """),format.raw("""}"""),format.raw/*129.110*/("""
div#content2 pre.collapse code """),format.raw("""{"""),format.raw/*130.33*/(""" display:block; """),format.raw("""}"""),format.raw/*130.50*/("""

/* content2 -> Unordered Lists */

div#content2 ul#itemContainer """),format.raw("""{"""),format.raw/*134.32*/(""" list-style: none; padding:0; margin: 20px 0;  """),format.raw("""}"""),format.raw/*134.80*/("""
div#content2 ul#itemContainer li """),format.raw("""{"""),format.raw/*135.35*/(""" display: inline-block; margin: 5px; zoom: 1; *display:inline; """),format.raw("""}"""),format.raw/*135.99*/("""
div#content2 ul#itemContainer ll li img """),format.raw("""{"""),format.raw/*136.42*/(""" vertical-align: bottom; width: 125px; height: 125px; """),format.raw("""}"""),format.raw/*136.97*/("""

/* content2 -> index */

div#content2.index pre """),format.raw("""{"""),format.raw/*140.25*/(""" float:none; cursor:default; """),format.raw("""}"""),format.raw/*140.55*/("""
div#content2.index pre code """),format.raw("""{"""),format.raw/*141.30*/(""" display:block; """),format.raw("""}"""),format.raw/*141.47*/("""
div#content2.index h2 """),format.raw("""{"""),format.raw/*142.24*/(""" margin-top: 55px; """),format.raw("""}"""),format.raw/*142.44*/("""
div#content2.index dl dt,
div#content2.index dl dd """),format.raw("""{"""),format.raw/*144.27*/(""" float: left; margin-top: 10px; """),format.raw("""}"""),format.raw/*144.60*/("""
div#content2.index dl dt """),format.raw("""{"""),format.raw/*145.27*/(""" clear: left; width: 70px; font-style: italic; """),format.raw("""}"""),format.raw/*145.75*/("""
div#content2.index dl dd """),format.raw("""{"""),format.raw/*146.27*/(""" width: 450px; """),format.raw("""}"""),format.raw/*146.43*/("""
div#content2.index i + p """),format.raw("""{"""),format.raw/*147.27*/(""" margin-top: 5px; """),format.raw("""}"""),format.raw/*147.46*/("""

/* content2 -> documentation */

div#content2.documentation h2 """),format.raw("""{"""),format.raw/*151.32*/(""" margin-top: 55px; """),format.raw("""}"""),format.raw/*151.52*/("""
div#content2.documentation dl dt,
div#content2.documentation dl dd """),format.raw("""{"""),format.raw/*153.35*/(""" float: left; margin-top: 10px; """),format.raw("""}"""),format.raw/*153.68*/("""
div#content2.documentation dl dt """),format.raw("""{"""),format.raw/*154.35*/(""" clear: left; width: 70px; font-style: italic; """),format.raw("""}"""),format.raw/*154.83*/("""
div#content2.documentation dl dd """),format.raw("""{"""),format.raw/*155.35*/(""" width: 450px; """),format.raw("""}"""),format.raw/*155.51*/("""
div#content2.documentation i + p """),format.raw("""{"""),format.raw/*156.35*/(""" margin-top: 5px; """),format.raw("""}"""),format.raw/*156.54*/("""

/* content2 -> author */

div#content2.author img """),format.raw("""{"""),format.raw/*160.26*/(""" margin-bottom: 50px; """),format.raw("""}"""),format.raw/*160.49*/("""
div#content2.author img + p:before """),format.raw("""{"""),format.raw/*161.37*/(""" content2: '“'; font-size:65px; font-family: Georgia; position:absolute; top: -55px; color: #ccc; """),format.raw("""}"""),format.raw/*161.136*/("""
div#content2.author p """),format.raw("""{"""),format.raw/*162.24*/(""" width: 590px; position: relative; """),format.raw("""}"""),format.raw/*162.60*/("""

/* =============================================================================
   Non-semantic helper classes
   Please define your styles before this section.
   ========================================================================== */

/* For image replacement */
.ir """),format.raw("""{"""),format.raw/*170.6*/(""" display: block; text-indent: -999em; overflow: hidden; background-repeat: no-repeat; text-align: left; direction: ltr; """),format.raw("""}"""),format.raw/*170.127*/("""
.ir br """),format.raw("""{"""),format.raw/*171.9*/(""" display: none; """),format.raw("""}"""),format.raw/*171.26*/("""

/* Hide for both screenreaders and browsers:
   css-discuss.incutio.com/wiki/Screenreader_Visibility */
.hidden """),format.raw("""{"""),format.raw/*175.10*/(""" display: none; visibility: hidden; """),format.raw("""}"""),format.raw/*175.47*/("""

/* Hide only visually, but have it available for screenreaders: by Jon Neal.
  www.webaim.org/techniques/css/invisiblecontent2/  &  j.mp/visuallyhidden */
.visuallyhidden """),format.raw("""{"""),format.raw/*179.18*/(""" border: 0; clip: rect(0 0 0 0); height: 1px; margin: -1px; overflow: hidden; padding: 0; position: absolute; width: 1px; """),format.raw("""}"""),format.raw/*179.141*/("""

/* Extends the .visuallyhidden class to allow the element to be focusable when navigated to via the keyboard: drupal.org/node/897638 */
.visuallyhidden.focusable:active, .visuallyhidden.focusable:focus """),format.raw("""{"""),format.raw/*182.68*/(""" clip: auto; height: auto; margin: 0; overflow: visible; position: static; width: auto; """),format.raw("""}"""),format.raw/*182.157*/("""

/* Hide visually and from screenreaders, but maintain layout */
.invisible """),format.raw("""{"""),format.raw/*185.13*/(""" visibility: hidden; """),format.raw("""}"""),format.raw/*185.35*/("""

/* Contain floats: nicolasgallagher.com/micro-clearfix-hack/ */ 
.clearfix:before, .clearfix:after """),format.raw("""{"""),format.raw/*188.36*/(""" content2: ""; display: table; """),format.raw("""}"""),format.raw/*188.68*/("""
.clearfix:after """),format.raw("""{"""),format.raw/*189.18*/(""" clear: both; """),format.raw("""}"""),format.raw/*189.33*/("""
.clearfix """),format.raw("""{"""),format.raw/*190.12*/(""" zoom: 1; """),format.raw("""}"""),format.raw/*190.23*/("""



/* =============================================================================
   PLACEHOLDER Media Queries for Responsive Design.
   These override the primary ('mobile first') styles
   Modify as content2 requires.
   ========================================================================== */


	</style>

    <body>

        """),format.raw/*211.20*/("""
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
          """),format.raw/*223.79*/("""
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
				"""),format.raw/*256.14*/("""
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
"""),format.raw/*291.13*/("""


<div id="content2"  style="min-height: 1000px">
       	<h3>Click on structure for information</h3> 
		<!-- navigation holder -->
        <div class="pagination" style="overflow-y:auto;overflow-x:hidden;height:100%;width:100%">></div>
        
        <!-- item container -->
        <ul id="itemContainer" >
		"""),_display_(Seq(/*301.4*/for(s <- groupStructures) yield /*301.29*/{_display_(Seq(format.raw/*301.30*/("""
		<li><img src="http://unicarb-db.biomedicine.gu.se/unicarbdb/get_sugar_image.action?download=true&scale=0.5&outputType=png&inputType=gws&tolerateUnknown=1&glycanSequenceId="""),_display_(Seq(/*302.175*/s("glycan_sequence_id"))),format.raw/*302.198*/("""" alt="image"></li>
		""")))})),format.raw/*303.4*/("""

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
                    DATE: Thu Jul 12 13:36:38 EST 2012
                    SOURCE: /home/matthew/Documents/play-app/tmp/computer-database/app/views/ms.scala.html
                    HASH: a16e6462cd655f9dcf47cd458c8090342806f50d
                    MATRIX: 758->1|878->33|905->51|933->160|1103->299|1118->305|1195->359|1236->506|1338->577|1353->583|1422->629|1526->702|1541->708|1619->763|1722->835|1737->841|1820->901|2067->1117|2082->1123|2169->1188|2339->1327|2354->1333|2428->1385|2493->1419|2508->1425|2591->1486|2656->1520|2671->1526|2755->1588|2820->1622|2835->1628|2920->1691|2985->1725|3000->1731|3069->1778|3134->1812|3149->1818|3222->1869|3262->1968|3316->1991|3331->1997|3398->2042|3463->2076|3478->2082|3554->2136|3752->2287|3912->2400|4018->2460|4127->2522|4295->2643|4559->2860|4611->2866|4662->2871|4760->2922|4835->2951|4904->2973|5047->3070|5122->3098|5224->3154|5305->3188|5374->3210|5446->3235|5514->3256|5614->3309|5715->3364|5817->3419|5889->3445|6038->3547|6139->3602|6211->3627|6275->3644|6365->3686|6442->3715|6508->3733|6596->3773|6662->3791|6738->3819|6803->3836|6870->3855|6937->3874|7041->3930|7114->3955|7183->3976|7254->3999|7322->4019|7393->4042|7545->4145|7648->4200|7719->4223|7787->4243|7887->4295|7961->4321|8066->4378|8139->4403|8244->4460|8323->4491|8394->4514|8473->4545|8578->4602|8663->4639|8734->4662|8806->4686|8911->4743|8989->4773|9060->4796|9137->4825|9233->4873|9316->4908|9404->4948|9477->4973|9612->5059|9693->5092|9758->5109|9874->5177|9970->5225|10053->5260|10165->5324|10255->5366|10358->5421|10457->5472|10535->5502|10613->5532|10678->5549|10750->5573|10818->5593|10919->5646|11000->5679|11075->5706|11171->5754|11246->5781|11310->5797|11385->5824|11452->5843|11566->5909|11634->5929|11751->5998|11832->6031|11915->6066|12011->6114|12094->6149|12158->6165|12241->6200|12308->6219|12409->6272|12480->6295|12565->6332|12713->6431|12785->6455|12869->6491|13195->6770|13365->6891|13421->6900|13486->6917|13649->7032|13734->7069|13956->7243|14128->7366|14381->7571|14519->7660|14645->7738|14715->7760|14865->7862|14945->7894|15011->7912|15074->7927|15134->7939|15193->7950|15559->8495|15961->8936|17407->10747|18418->12271|18764->12586|18806->12611|18841->12612|19049->12787|19096->12810|19151->12833
                    LINES: 27->1|31->1|32->3|33->6|39->12|39->12|39->12|40->13|41->14|41->14|41->14|42->15|42->15|42->15|43->16|43->16|43->16|46->19|46->19|46->19|48->21|48->21|48->21|49->22|49->22|49->22|50->23|50->23|50->23|51->24|51->24|51->24|52->25|52->25|52->25|53->26|53->26|53->26|54->27|55->28|55->28|55->28|56->29|56->29|56->29|63->36|66->39|69->42|72->45|75->48|80->53|81->54|83->56|90->63|92->65|94->67|99->72|101->74|104->77|106->79|106->79|107->80|107->80|109->82|112->85|114->87|116->89|119->92|122->95|124->97|124->97|128->101|128->101|129->102|129->102|130->103|130->103|131->104|131->104|132->105|132->105|133->106|133->106|134->107|134->107|135->108|135->108|139->112|139->112|141->114|141->114|142->115|142->115|144->117|144->117|145->118|145->118|147->120|147->120|148->121|148->121|150->123|150->123|151->124|151->124|153->126|153->126|154->127|154->127|156->129|156->129|157->130|157->130|161->134|161->134|162->135|162->135|163->136|163->136|167->140|167->140|168->141|168->141|169->142|169->142|171->144|171->144|172->145|172->145|173->146|173->146|174->147|174->147|178->151|178->151|180->153|180->153|181->154|181->154|182->155|182->155|183->156|183->156|187->160|187->160|188->161|188->161|189->162|189->162|197->170|197->170|198->171|198->171|202->175|202->175|206->179|206->179|209->182|209->182|212->185|212->185|215->188|215->188|216->189|216->189|217->190|217->190|232->211|244->223|271->256|296->291|306->301|306->301|306->301|307->302|307->302|308->303
                    -- GENERATED --
                */
            