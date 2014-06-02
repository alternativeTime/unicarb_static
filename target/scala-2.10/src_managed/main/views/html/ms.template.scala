
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
object ms extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*5.37*/("""

<!DOCTYPE html>
<html>
    <head>
        <title>Reference</title>
         <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*11.71*/routes/*11.77*/.Assets.at("/public", "stylesheets/bootstrap.min.css"))),format.raw/*11.131*/(""""> 
        """),format.raw/*12.144*/("""
         <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*13.71*/routes/*13.77*/.Assets.at("/public", "stylesheets/style.css"))),format.raw/*13.123*/(""""> 
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*14.70*/routes/*14.76*/.Assets.at("/public", "stylesheets/customMarkdown.css"))),format.raw/*14.131*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*15.70*/routes/*15.76*/.Assets.at("/public", "stylesheets/bootstrap-lightbox.css"))),format.raw/*15.135*/("""">
"""),format.raw/*16.98*/("""
        <script src="http://static.scripting.com/github/bootstrap2/js/bootstrap-modal.js"></script>
	<script src=""""),_display_(Seq[Any](/*18.16*/routes/*18.22*/.Assets.at("/public","javascripts/bootstrap-modal.js"))),format.raw/*18.76*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*19.23*/routes/*19.29*/.Assets.at("/public","javascripts/jquery.ae.image.resize.min.js"))),format.raw/*19.94*/(""""></script>
       """),format.raw/*20.112*/("""
        <script src=""""),_display_(Seq[Any](/*21.23*/routes/*21.29*/.Assets.at("/public","javascripts/bootstrap.min.js"))),format.raw/*21.81*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*22.23*/routes/*22.29*/.Assets.at("/public","javascripts/jquery.tablesorter.min.js"))),format.raw/*22.90*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*23.23*/routes/*23.29*/.Assets.at("/public","javascripts/bootstrap-lightbox.min.js"))),format.raw/*23.90*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*24.23*/routes/*24.29*/.Assets.at("/public","javascripts/showdown.js"))),format.raw/*24.76*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*25.23*/routes/*25.29*/.Assets.at("/public","javascripts/google-jsapi.js"))),format.raw/*25.80*/(""""></script>
"""),format.raw/*26.88*/("""
        <script src=""""),_display_(Seq[Any](/*27.23*/routes/*27.29*/.Assets.at("/public","javascripts/jPages.js"))),format.raw/*27.74*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*28.23*/routes/*28.29*/.Assets.at("/public","javascripts/jquery.lazyload.js"))),format.raw/*28.83*/(""""></script>

	<script>

/* Download lazy load plugin and make sure you add it in the head of your page. */

/* when document is ready */
$(function() """),format.raw/*35.14*/("""{"""),format.raw/*35.15*/("""
    
    /* initiate lazyload defining a custom event to trigger image loading  */
    $("ul li img").lazyload("""),format.raw/*38.29*/("""{"""),format.raw/*38.30*/("""
        event : "turnPage",
        effect : "fadeIn"
    """),format.raw/*41.5*/("""}"""),format.raw/*41.6*/(""");

    /* initiate plugin */
    $("div.pagination").jPages("""),format.raw/*44.32*/("""{"""),format.raw/*44.33*/("""
        containerID : "itemContainer",
        animation   : "fadeInUp",
        callback    : function( pages, items )"""),format.raw/*47.47*/("""{"""),format.raw/*47.48*/("""
            /* lazy load current images */
            items.showing.find("img").trigger("turnPage");
            /* lazy load next page images */
            items.oncoming.find("img").trigger("turnPage");
        """),format.raw/*52.9*/("""}"""),format.raw/*52.10*/("""
    """),format.raw/*53.5*/("""}"""),format.raw/*53.6*/(""");

"""),format.raw/*55.1*/("""}"""),format.raw/*55.2*/(""");
</script>



<style type="text/css">

	.holder """),format.raw/*62.10*/("""{"""),format.raw/*62.11*/("""
    		margin: 15px 0;
    	"""),format.raw/*64.6*/("""}"""),format.raw/*64.7*/("""
    
    	.holder a """),format.raw/*66.16*/("""{"""),format.raw/*66.17*/("""
    		font-size: 14px;
    		cursor: pointer;
    		margin: 0 5px;
    		color: #0F466F; 
    	"""),format.raw/*71.6*/("""}"""),format.raw/*71.7*/("""
    
    	.holder a:hover """),format.raw/*73.22*/("""{"""),format.raw/*73.23*/("""
    		background-color: #222;
    		color: #fff;
    	"""),format.raw/*76.6*/("""}"""),format.raw/*76.7*/("""
    
    	.holder a.jp-previous """),format.raw/*78.28*/("""{"""),format.raw/*78.29*/(""" margin-right: 15px; """),format.raw/*78.50*/("""}"""),format.raw/*78.51*/("""
    	.holder a.jp-next """),format.raw/*79.24*/("""{"""),format.raw/*79.25*/(""" margin-left: 15px; """),format.raw/*79.45*/("""}"""),format.raw/*79.46*/("""
    
    	.holder a.jp-current, a.jp-current:hover """),format.raw/*81.47*/("""{"""),format.raw/*81.48*/(""" 
    		color: #FF4242;
    		font-weight: bold;
    	"""),format.raw/*84.6*/("""}"""),format.raw/*84.7*/("""
    
    	.holder a.jp-disabled, a.jp-disabled:hover """),format.raw/*86.49*/("""{"""),format.raw/*86.50*/("""
    		color: #bbb;
    	"""),format.raw/*88.6*/("""}"""),format.raw/*88.7*/("""
    
    	.holder a.jp-current, a.jp-current:hover,
    	.holder a.jp-disabled, a.jp-disabled:hover """),format.raw/*91.49*/("""{"""),format.raw/*91.50*/("""
    		cursor: default; 
    		background: none;
    	"""),format.raw/*94.6*/("""}"""),format.raw/*94.7*/("""
    
    	.holder span """),format.raw/*96.19*/("""{"""),format.raw/*96.20*/(""" margin: 0 5px; """),format.raw/*96.36*/("""}"""),format.raw/*96.37*/("""
        
		/* content2 */

div#content2 """),format.raw/*100.14*/("""{"""),format.raw/*100.15*/(""" float: left; width: 680px; """),format.raw/*100.43*/("""}"""),format.raw/*100.44*/("""
div#content2 h2 """),format.raw/*101.17*/("""{"""),format.raw/*101.18*/(""" font-size: 21px; margin-bottom: 30px; """),format.raw/*101.57*/("""}"""),format.raw/*101.58*/("""
div#content2 h3 """),format.raw/*102.17*/("""{"""),format.raw/*102.18*/(""" margin: 5px 0px 10px 0px; """),format.raw/*102.45*/("""}"""),format.raw/*102.46*/("""
div#content2 p """),format.raw/*103.16*/("""{"""),format.raw/*103.17*/(""" line-height:1.5; """),format.raw/*103.35*/("""}"""),format.raw/*103.36*/("""
div#content2 p a """),format.raw/*104.18*/("""{"""),format.raw/*104.19*/(""" color: white; background: #D4EE5E; font-weight: bold; """),format.raw/*104.74*/("""}"""),format.raw/*104.75*/("""
div#content2 p a:hover """),format.raw/*105.24*/("""{"""),format.raw/*105.25*/(""" background: black; """),format.raw/*105.45*/("""}"""),format.raw/*105.46*/("""
div#content2 p + div """),format.raw/*106.22*/("""{"""),format.raw/*106.23*/(""" margin-top: 50px; """),format.raw/*106.42*/("""}"""),format.raw/*106.43*/("""
div#content2 h3 span """),format.raw/*107.22*/("""{"""),format.raw/*107.23*/(""" background-color: #F4FAD2; color: #5C826D; padding: 2px 3px; margin-left: 10px; font-weight: normal; """),format.raw/*107.125*/("""}"""),format.raw/*107.126*/("""

/* content2 -> Code */

div#content2 div.codeBlocks """),format.raw/*111.29*/("""{"""),format.raw/*111.30*/(""" margin: 20px 0 35px; """),format.raw/*111.52*/("""}"""),format.raw/*111.53*/("""

div#content2 pre """),format.raw/*113.18*/("""{"""),format.raw/*113.19*/(""" float: left; margin-right: 10px; cursor: pointer; """),format.raw/*113.70*/("""}"""),format.raw/*113.71*/("""
div#content2 pre:before """),format.raw/*114.25*/("""{"""),format.raw/*114.26*/(""" content2: attr(class); padding: 2px 3px; color: white; """),format.raw/*114.82*/("""}"""),format.raw/*114.83*/("""

div#content2 pre.html """),format.raw/*116.23*/("""{"""),format.raw/*116.24*/(""" background: #F0F2EB; border-bottom: 1px solid #D7D9D3; """),format.raw/*116.80*/("""}"""),format.raw/*116.81*/("""
div#content2 pre.html:before """),format.raw/*117.30*/("""{"""),format.raw/*117.31*/(""" background: #D7D9D3; """),format.raw/*117.53*/("""}"""),format.raw/*117.54*/("""

div#content2 pre.javascript """),format.raw/*119.29*/("""{"""),format.raw/*119.30*/(""" background: #F4FAD2; border-bottom: 1px solid #DBE0BC; """),format.raw/*119.86*/("""}"""),format.raw/*119.87*/("""
div#content2 pre.javascript:before """),format.raw/*120.36*/("""{"""),format.raw/*120.37*/(""" background: #DBE0BC; """),format.raw/*120.59*/("""}"""),format.raw/*120.60*/("""

div#content2 pre.css """),format.raw/*122.22*/("""{"""),format.raw/*122.23*/(""" background: #E1EDB9; border-bottom: 1px solid #CAD5A6; """),format.raw/*122.79*/("""}"""),format.raw/*122.80*/("""
div#content2 pre.css:before """),format.raw/*123.29*/("""{"""),format.raw/*123.30*/(""" background: #CAD5A6; """),format.raw/*123.52*/("""}"""),format.raw/*123.53*/("""

div#content2 pre.collapse """),format.raw/*125.27*/("""{"""),format.raw/*125.28*/(""" position: relative; padding:2% 3%; width:94%; """),format.raw/*125.75*/("""}"""),format.raw/*125.76*/("""
div#content2 pre.collapse:before """),format.raw/*126.34*/("""{"""),format.raw/*126.35*/(""" position: absolute; right: 0; top: 0; """),format.raw/*126.74*/("""}"""),format.raw/*126.75*/("""

div#content2 pre code """),format.raw/*128.23*/("""{"""),format.raw/*128.24*/(""" display: none; background: none; font: 11px/16px "Courier New", Courier, monospace; """),format.raw/*128.109*/("""}"""),format.raw/*128.110*/("""
div#content2 pre.collapse code """),format.raw/*129.32*/("""{"""),format.raw/*129.33*/(""" display:block; """),format.raw/*129.49*/("""}"""),format.raw/*129.50*/("""

/* content2 -> Unordered Lists */

div#content2 ul#itemContainer """),format.raw/*133.31*/("""{"""),format.raw/*133.32*/(""" list-style: none; padding:0; margin: 20px 0;  """),format.raw/*133.79*/("""}"""),format.raw/*133.80*/("""
div#content2 ul#itemContainer li """),format.raw/*134.34*/("""{"""),format.raw/*134.35*/(""" display: inline-block; margin: 5px; zoom: 1; *display:inline; """),format.raw/*134.98*/("""}"""),format.raw/*134.99*/("""
div#content2 ul#itemContainer ll li img """),format.raw/*135.41*/("""{"""),format.raw/*135.42*/(""" vertical-align: bottom; width: 125px; height: 125px; """),format.raw/*135.96*/("""}"""),format.raw/*135.97*/("""

/* content2 -> index */

div#content2.index pre """),format.raw/*139.24*/("""{"""),format.raw/*139.25*/(""" float:none; cursor:default; """),format.raw/*139.54*/("""}"""),format.raw/*139.55*/("""
div#content2.index pre code """),format.raw/*140.29*/("""{"""),format.raw/*140.30*/(""" display:block; """),format.raw/*140.46*/("""}"""),format.raw/*140.47*/("""
div#content2.index h2 """),format.raw/*141.23*/("""{"""),format.raw/*141.24*/(""" margin-top: 55px; """),format.raw/*141.43*/("""}"""),format.raw/*141.44*/("""
div#content2.index dl dt,
div#content2.index dl dd """),format.raw/*143.26*/("""{"""),format.raw/*143.27*/(""" float: left; margin-top: 10px; """),format.raw/*143.59*/("""}"""),format.raw/*143.60*/("""
div#content2.index dl dt """),format.raw/*144.26*/("""{"""),format.raw/*144.27*/(""" clear: left; width: 70px; font-style: italic; """),format.raw/*144.74*/("""}"""),format.raw/*144.75*/("""
div#content2.index dl dd """),format.raw/*145.26*/("""{"""),format.raw/*145.27*/(""" width: 450px; """),format.raw/*145.42*/("""}"""),format.raw/*145.43*/("""
div#content2.index i + p """),format.raw/*146.26*/("""{"""),format.raw/*146.27*/(""" margin-top: 5px; """),format.raw/*146.45*/("""}"""),format.raw/*146.46*/("""

/* content2 -> documentation */

div#content2.documentation h2 """),format.raw/*150.31*/("""{"""),format.raw/*150.32*/(""" margin-top: 55px; """),format.raw/*150.51*/("""}"""),format.raw/*150.52*/("""
div#content2.documentation dl dt,
div#content2.documentation dl dd """),format.raw/*152.34*/("""{"""),format.raw/*152.35*/(""" float: left; margin-top: 10px; """),format.raw/*152.67*/("""}"""),format.raw/*152.68*/("""
div#content2.documentation dl dt """),format.raw/*153.34*/("""{"""),format.raw/*153.35*/(""" clear: left; width: 70px; font-style: italic; """),format.raw/*153.82*/("""}"""),format.raw/*153.83*/("""
div#content2.documentation dl dd """),format.raw/*154.34*/("""{"""),format.raw/*154.35*/(""" width: 450px; """),format.raw/*154.50*/("""}"""),format.raw/*154.51*/("""
div#content2.documentation i + p """),format.raw/*155.34*/("""{"""),format.raw/*155.35*/(""" margin-top: 5px; """),format.raw/*155.53*/("""}"""),format.raw/*155.54*/("""

/* content2 -> author */

div#content2.author img """),format.raw/*159.25*/("""{"""),format.raw/*159.26*/(""" margin-bottom: 50px; """),format.raw/*159.48*/("""}"""),format.raw/*159.49*/("""
div#content2.author img + p:before """),format.raw/*160.36*/("""{"""),format.raw/*160.37*/(""" content2: '“'; font-size:65px; font-family: Georgia; position:absolute; top: -55px; color: #ccc; """),format.raw/*160.135*/("""}"""),format.raw/*160.136*/("""
div#content2.author p """),format.raw/*161.23*/("""{"""),format.raw/*161.24*/(""" width: 590px; position: relative; """),format.raw/*161.59*/("""}"""),format.raw/*161.60*/("""

/* =============================================================================
   Non-semantic helper classes
   Please define your styles before this section.
   ========================================================================== */

/* For image replacement */
.ir """),format.raw/*169.5*/("""{"""),format.raw/*169.6*/(""" display: block; text-indent: -999em; overflow: hidden; background-repeat: no-repeat; text-align: left; direction: ltr; """),format.raw/*169.126*/("""}"""),format.raw/*169.127*/("""
.ir br """),format.raw/*170.8*/("""{"""),format.raw/*170.9*/(""" display: none; """),format.raw/*170.25*/("""}"""),format.raw/*170.26*/("""

/* Hide for both screenreaders and browsers:
   css-discuss.incutio.com/wiki/Screenreader_Visibility */
.hidden """),format.raw/*174.9*/("""{"""),format.raw/*174.10*/(""" display: none; visibility: hidden; """),format.raw/*174.46*/("""}"""),format.raw/*174.47*/("""

/* Hide only visually, but have it available for screenreaders: by Jon Neal.
  www.webaim.org/techniques/css/invisiblecontent2/  &  j.mp/visuallyhidden */
.visuallyhidden """),format.raw/*178.17*/("""{"""),format.raw/*178.18*/(""" border: 0; clip: rect(0 0 0 0); height: 1px; margin: -1px; overflow: hidden; padding: 0; position: absolute; width: 1px; """),format.raw/*178.140*/("""}"""),format.raw/*178.141*/("""

/* Extends the .visuallyhidden class to allow the element to be focusable when navigated to via the keyboard: drupal.org/node/897638 */
.visuallyhidden.focusable:active, .visuallyhidden.focusable:focus """),format.raw/*181.67*/("""{"""),format.raw/*181.68*/(""" clip: auto; height: auto; margin: 0; overflow: visible; position: static; width: auto; """),format.raw/*181.156*/("""}"""),format.raw/*181.157*/("""

/* Hide visually and from screenreaders, but maintain layout */
.invisible """),format.raw/*184.12*/("""{"""),format.raw/*184.13*/(""" visibility: hidden; """),format.raw/*184.34*/("""}"""),format.raw/*184.35*/("""

/* Contain floats: nicolasgallagher.com/micro-clearfix-hack/ */ 
.clearfix:before, .clearfix:after """),format.raw/*187.35*/("""{"""),format.raw/*187.36*/(""" content2: ""; display: table; """),format.raw/*187.67*/("""}"""),format.raw/*187.68*/("""
.clearfix:after """),format.raw/*188.17*/("""{"""),format.raw/*188.18*/(""" clear: both; """),format.raw/*188.32*/("""}"""),format.raw/*188.33*/("""
.clearfix """),format.raw/*189.11*/("""{"""),format.raw/*189.12*/(""" zoom: 1; """),format.raw/*189.22*/("""}"""),format.raw/*189.23*/("""



/* =============================================================================
   PLACEHOLDER Media Queries for Responsive Design.
   These override the primary ('mobile first') styles
   Modify as content2 requires.
   ========================================================================== */


	</style>

    <body>

        """),format.raw/*210.20*/("""
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
          """),format.raw/*222.79*/("""
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
				"""),format.raw/*255.14*/("""
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
"""),format.raw/*290.13*/("""


<div id="content2"  style="min-height: 1000px">
       	<h3>Click on structure for information</h3> 
		<!-- navigation holder -->
        <div class="pagination" style="overflow-y:auto;overflow-x:hidden;height:100%;width:100%">></div>
        
        <!-- item container -->
        <ul id="itemContainer" >
		"""),format.raw/*304.5*/("""
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
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 02 10:52:56 EST 2014
                    SOURCE: /Users/matthew/git/glycomics_working/app/views/ms.scala.html
                    HASH: 982136f0ba5287bcc636cba8ed0ba31600b06000
                    MATRIX: 868->17|896->126|1071->265|1086->271|1163->325|1204->472|1311->543|1326->549|1395->595|1504->668|1519->674|1597->729|1705->801|1720->807|1802->866|1833->966|1985->1082|2000->1088|2076->1142|2146->1176|2161->1182|2248->1247|2296->1370|2355->1393|2370->1399|2444->1451|2514->1485|2529->1491|2612->1552|2682->1586|2697->1592|2780->1653|2850->1687|2865->1693|2934->1740|3004->1774|3019->1780|3092->1831|3132->1930|3191->1953|3206->1959|3273->2004|3343->2038|3358->2044|3434->2098|3612->2248|3641->2249|3781->2361|3810->2362|3896->2421|3924->2422|4013->2483|4042->2484|4190->2604|4219->2605|4462->2821|4491->2822|4523->2827|4551->2828|4582->2832|4610->2833|4688->2883|4717->2884|4772->2912|4800->2913|4849->2934|4878->2935|5001->3031|5029->3032|5084->3059|5113->3060|5195->3115|5223->3116|5284->3149|5313->3150|5362->3171|5391->3172|5443->3196|5472->3197|5520->3217|5549->3218|5629->3270|5658->3271|5739->3325|5767->3326|5849->3380|5878->3381|5930->3406|5958->3407|6087->3508|6116->3509|6197->3563|6225->3564|6277->3588|6306->3589|6350->3605|6379->3606|6449->3647|6479->3648|6536->3676|6566->3677|6612->3694|6642->3695|6710->3734|6740->3735|6786->3752|6816->3753|6872->3780|6902->3781|6947->3797|6977->3798|7024->3816|7054->3817|7101->3835|7131->3836|7215->3891|7245->3892|7298->3916|7328->3917|7377->3937|7407->3938|7458->3960|7488->3961|7536->3980|7566->3981|7617->4003|7647->4004|7779->4106|7810->4107|7893->4161|7923->4162|7974->4184|8004->4185|8052->4204|8082->4205|8162->4256|8192->4257|8246->4282|8276->4283|8361->4339|8391->4340|8444->4364|8474->4365|8559->4421|8589->4422|8648->4452|8678->4453|8729->4475|8759->4476|8818->4506|8848->4507|8933->4563|8963->4564|9028->4600|9058->4601|9109->4623|9139->4624|9191->4647|9221->4648|9306->4704|9336->4705|9394->4734|9424->4735|9475->4757|9505->4758|9562->4786|9592->4787|9668->4834|9698->4835|9761->4869|9791->4870|9859->4909|9889->4910|9942->4934|9972->4935|10087->5020|10118->5021|10179->5053|10209->5054|10254->5070|10284->5071|10380->5138|10410->5139|10486->5186|10516->5187|10579->5221|10609->5222|10701->5285|10731->5286|10801->5327|10831->5328|10914->5382|10944->5383|11023->5433|11053->5434|11111->5463|11141->5464|11199->5493|11229->5494|11274->5510|11304->5511|11356->5534|11386->5535|11434->5554|11464->5555|11545->5607|11575->5608|11636->5640|11666->5641|11721->5667|11751->5668|11827->5715|11857->5716|11912->5742|11942->5743|11986->5758|12016->5759|12071->5785|12101->5786|12148->5804|12178->5805|12272->5870|12302->5871|12350->5890|12380->5891|12477->5959|12507->5960|12568->5992|12598->5993|12661->6027|12691->6028|12767->6075|12797->6076|12860->6110|12890->6111|12934->6126|12964->6127|13027->6161|13057->6162|13104->6180|13134->6181|13215->6233|13245->6234|13296->6256|13326->6257|13391->6293|13421->6294|13549->6392|13580->6393|13632->6416|13662->6417|13726->6452|13756->6453|14062->6731|14091->6732|14241->6852|14272->6853|14308->6861|14337->6862|14382->6878|14412->6879|14554->6993|14584->6994|14649->7030|14679->7031|14881->7204|14911->7205|15063->7327|15094->7328|15327->7532|15357->7533|15475->7621|15506->7622|15612->7699|15642->7700|15692->7721|15722->7722|15852->7823|15882->7824|15942->7855|15972->7856|16018->7873|16048->7874|16091->7888|16121->7889|16161->7900|16191->7901|16230->7911|16260->7912|16626->8457|17028->8898|18474->10709|19485->12233|19827->12805
                    LINES: 30->2|31->5|37->11|37->11|37->11|38->12|39->13|39->13|39->13|40->14|40->14|40->14|41->15|41->15|41->15|42->16|44->18|44->18|44->18|45->19|45->19|45->19|46->20|47->21|47->21|47->21|48->22|48->22|48->22|49->23|49->23|49->23|50->24|50->24|50->24|51->25|51->25|51->25|52->26|53->27|53->27|53->27|54->28|54->28|54->28|61->35|61->35|64->38|64->38|67->41|67->41|70->44|70->44|73->47|73->47|78->52|78->52|79->53|79->53|81->55|81->55|88->62|88->62|90->64|90->64|92->66|92->66|97->71|97->71|99->73|99->73|102->76|102->76|104->78|104->78|104->78|104->78|105->79|105->79|105->79|105->79|107->81|107->81|110->84|110->84|112->86|112->86|114->88|114->88|117->91|117->91|120->94|120->94|122->96|122->96|122->96|122->96|126->100|126->100|126->100|126->100|127->101|127->101|127->101|127->101|128->102|128->102|128->102|128->102|129->103|129->103|129->103|129->103|130->104|130->104|130->104|130->104|131->105|131->105|131->105|131->105|132->106|132->106|132->106|132->106|133->107|133->107|133->107|133->107|137->111|137->111|137->111|137->111|139->113|139->113|139->113|139->113|140->114|140->114|140->114|140->114|142->116|142->116|142->116|142->116|143->117|143->117|143->117|143->117|145->119|145->119|145->119|145->119|146->120|146->120|146->120|146->120|148->122|148->122|148->122|148->122|149->123|149->123|149->123|149->123|151->125|151->125|151->125|151->125|152->126|152->126|152->126|152->126|154->128|154->128|154->128|154->128|155->129|155->129|155->129|155->129|159->133|159->133|159->133|159->133|160->134|160->134|160->134|160->134|161->135|161->135|161->135|161->135|165->139|165->139|165->139|165->139|166->140|166->140|166->140|166->140|167->141|167->141|167->141|167->141|169->143|169->143|169->143|169->143|170->144|170->144|170->144|170->144|171->145|171->145|171->145|171->145|172->146|172->146|172->146|172->146|176->150|176->150|176->150|176->150|178->152|178->152|178->152|178->152|179->153|179->153|179->153|179->153|180->154|180->154|180->154|180->154|181->155|181->155|181->155|181->155|185->159|185->159|185->159|185->159|186->160|186->160|186->160|186->160|187->161|187->161|187->161|187->161|195->169|195->169|195->169|195->169|196->170|196->170|196->170|196->170|200->174|200->174|200->174|200->174|204->178|204->178|204->178|204->178|207->181|207->181|207->181|207->181|210->184|210->184|210->184|210->184|213->187|213->187|213->187|213->187|214->188|214->188|214->188|214->188|215->189|215->189|215->189|215->189|230->210|242->222|269->255|294->290|304->304
                    -- GENERATED --
                */
            