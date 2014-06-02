
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html class="home">
  <head>
    <title>UniCarbKB</title>
    <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*5.66*/routes/*5.72*/.Assets.at("/public", "stylesheets/bootstrap.min.css"))),format.raw/*5.126*/(""""> 
    <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*6.66*/routes/*6.72*/.Assets.at("/public", "stylesheets/unicarbkb.css"))),format.raw/*6.122*/("""">
    <link rel="icon" href=""""),_display_(Seq[Any](/*7.29*/routes/*7.35*/.Assets.at("/public", "favicon.ico"))),format.raw/*7.71*/("""" type="image/x-icon">
    <link rel="icon" href=""""),_display_(Seq[Any](/*8.29*/routes/*8.35*/.Assets.at("/public", "favicon.ico"))),format.raw/*8.71*/("""" type="image/x-icon">
    <script type="text/javascript" src=""""),_display_(Seq[Any](/*9.42*/routes/*9.48*/.Assets.at("/public", "javascripts/jquery-2.0.3.min.js"))),format.raw/*9.104*/(""""></script>
    <script type="text/javascript" src=""""),_display_(Seq[Any](/*10.42*/routes/*10.48*/.Assets.at("/public", "javascripts/pines/jquery.pnotify.min.js"))),format.raw/*10.112*/(""""></script>
    <script type="text/javascript" src=""""),_display_(Seq[Any](/*11.42*/routes/*11.48*/.Assets.at("/public", "javascripts/bootstrap.min.js"))),format.raw/*11.101*/(""""></script>
    <script type="text/javascript" src=""""),_display_(Seq[Any](/*12.42*/routes/*12.48*/.Assets.at("/public", "javascripts/pines/bootstrap-collapse.js"))),format.raw/*12.112*/(""""></script>
    <link href=""""),_display_(Seq[Any](/*13.18*/routes/*13.24*/.Assets.at("/public", "stylesheets/pines/jquery.pnotify.default.css"))),format.raw/*13.93*/("""" media="all" rel="stylesheet" type="text/css" />
 
    <script type="text/javascript">
$(function()"""),format.raw/*16.13*/("""{"""),format.raw/*16.14*/("""
	
	$.pnotify.defaults.history = false;
	
    $.pnotify("""),format.raw/*20.15*/("""{"""),format.raw/*20.16*/("""
        title: 'GlycoSuiteDB Notice',
	text: 'From September 2013 GlycoSuiteDB will be redirected to UniCarbKB <a href="/news">more info</a>'
    """),format.raw/*23.5*/("""}"""),format.raw/*23.6*/(""");
"""),format.raw/*24.1*/("""}"""),format.raw/*24.2*/(""");
</script>

  <script type="text/javascript">
     $(function()"""),format.raw/*28.18*/("""{"""),format.raw/*28.19*/("""
	$.pnotify.defaults.history = false;
     	$.pnotify("""),format.raw/*30.17*/("""{"""),format.raw/*30.18*/("""
        title: 'Citation',
        text: 'New publication now in press: <a href="http://nar.oxfordjournals.org/content/42/D1/D215.long">NAR Database Issue</a>'
     """),format.raw/*33.6*/("""}"""),format.raw/*33.7*/(""");
     """),format.raw/*34.6*/("""}"""),format.raw/*34.7*/(""");
 </script>
 
  </head>

  <header>
  <div class="navbar">
    <div class="navbar-inner">
      <div class="container-fluid">
        <a class="brand" href="/">UniCarbKB</a>
        <ul class="nav">
          <li class="active"><a href="#">Home</a></li>
          <li><a href="/query">Query</a></li>
          <li><a href="/references?s=authors">References</a></li>
	  <li><a href="/proteins">Glycoproteins</a></li>
	  <li><a href="/builder">Glycan Builder</a></li>
	  <li class="dropdown">
	    <a href="#" class="dropdown-toggle" data-toggle="dropdown">GlycoDigest  <b class="caret"></b></a>
            <ul class="dropdown-menu">
            <li><a href="http://www.glycodigest.org" target="_blank">Home (External)</a></li>
	    <li class="dropdown-submenu">
	       <a href="#">Get Started</a>
	       <ul class="dropdown-menu">
		       <li><a href="https://github.com/alternativeTime/glycomics/wiki/GlycoDigest-Guide-(UniCarbKB)" target="_blank" >Guide/Wiki</a></li>
		       <li><a href="/builderDigest">UniCarbKB Integrated</a></li>
		       <li><a href="https://bitbucket.org/sib-pig/glycodigest/downloads/GlycoDigest-StandAloneRunnableJar.jar">Download Standalone</a></li>
		       <li><a href="http://www.glycodigest.org/digestJava7.html" target="_blank">GlycoDigest Applet</a></li>
	       </ul>
	    </li>
            <li class="divider"></li>
	    <li class="dropdown-submenu">
              <a href="#">Exoglycosidase Information</a>
	      <ul class="dropdown-menu">
                    <li><a href="http://link.springer.com/protocol/10.1385%2F1-59745-167-3%3A125" target="_blank">Experimental Protocol</a></li>
                    <li><a href="http://www.glycodigest.org/exoglycosidase.pdf" target="_blank">Exoglycosidase Brief Guide</a></li>
                    <li><a href="http://www.glycodigest.org/lcms.pdf" target="_blank">Example IgG LC-MS</a></li>
                    <li><a href="http://link.springer.com/protocol/10.1385%2F1-59745-167-3:125/fulltext.html#Sec16" target="_blank">2-AB HPLC IgG Exoglycosidase Treatment</a></li>
		    <li><a href="http://www.mdpi.com/2218-1989/2/4/648" target="_blank">O-Links: Using Exoglycosidases and MS</a></li>
                  </ul>		
            </ul>
        </li>
        </ul>
        <div id="headersearch" class="pull-right">
          <ul class='nav'>
            <li><a href="/about">About</a></li>
            <li><a href="/about">"""),_display_(Seq[Any](/*79.35*/request()/*79.44*/.username())),format.raw/*79.55*/(""" Contact</a></li>
          </ul>
        </div>
      </div>
    </div>
  </div>
  </header>

  <div class="container-fluid content">
    <div class="row-fluid">
      <div class="span12">
        <!--<image src=""""),_display_(Seq[Any](/*90.26*/routes/*90.32*/.Assets.at("/public/images", "UniCarbKB_Logo.png"))),format.raw/*90.82*/("""" class="imglogo">-->
        <h3 class="subheader"><a href="/query"><span class="start">Start here with UniCarbKB<small> A new collaborative approach to glycomics</small></span></a></h3>
        
      </div>
    </div>

    <div class="row-fluid">
      <div class="span8 leftContent">
        <div class="row-fluid">
            <p>
	     UniCarbKB is an initiative that aims to promote the creation of an online information storage and search platform for glycomics and glycobiology research. The knowledgebase will offer a freely accessible and information-rich resource supported by querying interfaces, annotation technologies and the adoption of common standards to integrate structural, experimental and functional data. 
            </p>
        </div>
        <div class="row-fluid">
          <div class="widget">
            <h3 class="lead">Search categories <small> by following a link below</small></h3>
            <div class="row-fluid">
            <div class="span3 glyco">
              <a href="/query" title="" target="_blank" rel="nofollow"><span class="count">3238</span><span class="desc">GlycoSuite Structures</span></a>
            </div>
            <div class="span3 publications">
              <a href="/references" title="" target="_blank" rel="nofollow"><span class="count">864</span><span class="desc">Publications</span></a>
            </div>
            <div class="span3 unicarbdb">
              <a href="http://www.unicarb-db.org" title="" target="_blank" rel="nofollow"><span class="count">520</span><span class="desc">UniCarb-DB MS/MS</span></a>
            </div>
            <div class="span3 structurescount">
              <a href="http://unicarb-db.org/unicarbdb/show_mucin.action" title="" target="_blank" rel="nofollow"><span class="count">507</span><span class="desc">MS Confirmed Structures</span></a>
            </div>
          </div>
          </div>
      </div>

        <div class="row-fluid">
          <div class="span6">
            <h3 class="cntPara">A Curated Resource</h3>
            <p class="cntPara easyUse">
              UniCarbKB builds on previous efforts by GlycoSuiteDB to curate information from the scientific literature on glycoprotein derived glycan structures. This knowledgebase will continue the principle and give access to both a curated and validated data repository.</p>
            </div>
            <div class="span6">
              <h3 class="cntPara">Open Access</h3>
              <p class="cntPara itsFree">
                UniCarbKB continues to build on the principles of EUROCarbDB to provide an open-access platform for glycoinformatics and provides the community with free access to a leading research platform.</p>      
            </div>                                        
          </div>
          <hr>
          <div class="row-fluid">
            <div class="span12">
		    <h3 class="pull-center lead"><a href="http://nar.oxfordjournals.org/content/42/D1/D215.long">Read more about UniCarbKB...</a></h3>
		    <p>How to cite us:</p>
		    <p>Campbell MP, Peterson R, Mariethoz J, Gasteiger E, Akune Y, Aoki-Kinoshita KF, Lisacek F, Packer NH.</p><p><b>UniCarbkb: building a knowledge platform for glycoproteomics</b></p><p><a href="http://nar.oxfordjournals.org/content/42/D1/D215.long"> Nucleic Acids Res. 2014, Jan 1;42(1):D215-21</a></p>
            </div>                                        
          </div>
          <div class="row-fluid">
            <div class="span12">

              """),format.raw/*168.18*/("""
            </div>                                        
          </div>
        </div>
        <div class="span4 sidebar" style="margin-top: 0px">
          """),format.raw/*180.22*/("""

              <div class="info">
                <h3>International Effort</h3>
                <p>A collaboration of researchers from Macquarie University, Australia; University of Gothenburg, Sweden; Swiss Institute for Bioinformatics, Switzerland; Max Planck Institute of Colloids and Interfaces, Germany;  and the National Institute for Bioprocessing Research and Training (NIBRT), Ireland; UNSW, Australia; Soka University, Japan; CCRC, USA</p>
              </div>

              <ul class="nav nav-pills nav-stacked clearfix">
                <li><a href="http://glycosuitedb.expasy.org"><strong>GlycoSuiteDB</strong> - a database of curated glycan structural data (previously commercial)
                <li><a href="http://www.ebi.ac.uk/eurocarb"><strong>EUROCarbDB</strong> - an experimental and structural database</a></li>
                <li><a href="http://unicarb-db.org/unicarbdb/show_mucin.action"><strong>UniCarb-DB</strong> - an experimental LC-MS/MS database of glycan structures</a></li>
                <li><a href="http://web.expasy.org/glycomod/"><strong>GlycoMod</strong> - a tool for calculating composition of glycans from MS data</a></li>
                <li><a href="http://sugarbind.expasy.org/sugarbind/"><strong>SugarBind</strong> - a database of pathogen-glycan interactions</a></li>
                <li><a href="http://glycam.ccrc.uga.edu/ccrc/pages/3dspt.html"><strong>GLYCAM</strong> - an environment for 3-D glycan structures</a></li>
                <li><a href="http://glycobase.nibrt.ie"><strong>GlycoBase</strong> - an experimental LC database of derivatized glycans</a></li>
                <li><a href="http://rings.t.soka.ac.jp/"><strong>RINGS</strong> - a web resource providing algorithmic and data mining tools</a></li>
              </ul>

              """),format.raw/*214.23*/("""
            </div>
           </div>
           <div class="footer row-fluid">
            <div class="span12">
              <p class="pull-left">UniCarbKB</p>
              <p class="pull-right">Supported by 
		 <a href="http://www.nectar.org.au">NeCTAR</a> &nbsp;|&nbsp;
      		 <a href="http://www.ands.org.au">ANDS</a> &nbsp;|&nbsp;
      	         <a href="http://www.stint.se"> STINT</a> &nbsp;|&nbsp;
      		 <a href="http://expasy.org/"> SIB ExPASy</a> &nbsp;|&nbsp;
		 <a href="https://twitter.com/unicarbkb" class="twitter-follow-button" data-show-count="false">Follow unicarbkb</a>
		 <a rel="license" href="http://creativecommons.org/licenses/by-nc-nd/3.0/deed.en_US"><img alt="Creative Commons License" style="border-width:0" src="http://i.creativecommons.org/l/by-nc-nd/3.0/80x15.png" /></a>
              </p>

              <script>!function(d,s,id)"""),format.raw/*229.40*/("""{"""),format.raw/*229.41*/("""var js,fjs=d.getElementsByTagName(s)[0];if(!d.getElementById(id))"""),format.raw/*229.106*/("""{"""),format.raw/*229.107*/("""js=d.createElement(s);js.id=id;js.src="//platform.twitter.com/widgets.js";fjs.parentNode.insertBefore(js,fjs);"""),format.raw/*229.217*/("""}"""),format.raw/*229.218*/("""}"""),format.raw/*229.219*/("""(document,"script","twitter-wjs");</script>
              </p>
            </div>
             </div>
           </div>
         </div>

<script type="text/javascript">

	var _gaq = _gaq || [];
	var pluginUrl = 
	 '//www.google-analytics.com/plugins/ga/inpage_linkid.js';
	 _gaq.push(['_require', 'inpage_linkid', pluginUrl]);
  	_gaq.push(['_setAccount', 'UA-28274077-1']);
  	_gaq.push(['_trackPageview']);

  (function() """),format.raw/*245.15*/("""{"""),format.raw/*245.16*/("""
    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
  """),format.raw/*249.3*/("""}"""),format.raw/*249.4*/(""")();

</script>

<script>
	(function(i,s,o,g,r,a,m)"""),format.raw/*254.26*/("""{"""),format.raw/*254.27*/("""i['GoogleAnalyticsObject']=r;i[r]=i[r]||function()"""),format.raw/*254.77*/("""{"""),format.raw/*254.78*/("""
    		(i[r].q=i[r].q||[]).push(arguments)"""),format.raw/*255.42*/("""}"""),format.raw/*255.43*/(""",i[r].l=1*new Date();a=s.createElement(o),
		m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
	"""),format.raw/*257.2*/("""}"""),format.raw/*257.3*/(""")(window,document,'script','//www.google-analytics.com/analytics.js','ga');

	ga('create', 'UA-28274077-2', 'unicarbkb.org');
	ga('send', 'pageview');
</script>

</html>	
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 02 10:52:56 EST 2014
                    SOURCE: /Users/matthew/git/glycomics_working/app/views/index.scala.html
                    HASH: bf48915b9fd347d15c4e2a729d48dfba62e31efa
                    MATRIX: 855->0|1029->139|1043->145|1119->199|1223->268|1237->274|1309->324|1375->355|1389->361|1446->397|1532->448|1546->454|1603->490|1702->554|1716->560|1794->616|1883->669|1898->675|1985->739|2074->792|2089->798|2165->851|2254->904|2269->910|2356->974|2421->1003|2436->1009|2527->1078|2655->1178|2684->1179|2768->1235|2797->1236|2971->1383|2999->1384|3029->1387|3057->1388|3150->1453|3179->1454|3261->1508|3290->1509|3483->1675|3511->1676|3546->1684|3574->1685|6018->4093|6036->4102|6069->4113|6320->4328|6335->4334|6407->4384|9947->8744|10138->9299|11970->12261|12868->13130|12898->13131|12993->13196|13024->13197|13164->13307|13195->13308|13226->13309|13679->13733|13709->13734|14041->14038|14070->14039|14150->14090|14180->14091|14259->14141|14289->14142|14360->14184|14390->14185|14544->14311|14573->14312
                    LINES: 29->1|33->5|33->5|33->5|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|44->16|44->16|48->20|48->20|51->23|51->23|52->24|52->24|56->28|56->28|58->30|58->30|61->33|61->33|62->34|62->34|107->79|107->79|107->79|118->90|118->90|118->90|174->168|179->180|197->214|212->229|212->229|212->229|212->229|212->229|212->229|212->229|228->245|228->245|232->249|232->249|237->254|237->254|237->254|237->254|238->255|238->255|240->257|240->257
                    -- GENERATED --
                */
            