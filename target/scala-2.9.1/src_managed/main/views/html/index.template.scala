
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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq(format.raw/*1.1*/("""<!DOCTYPE html>
<html>
    <head>
        <title>Reference</title>
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq(/*5.70*/routes/*5.76*/.Assets.at("/public", "stylesheets/bootstrapnewlayout.css"))),format.raw/*5.135*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq(/*6.70*/routes/*6.76*/.Assets.at("/public", "stylesheets/stylesnewlayout.css"))),format.raw/*6.132*/("""">
         <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq(/*7.71*/routes/*7.77*/.Assets.at("/public", "stylesheets/bootstrap-responsive.css"))),format.raw/*7.138*/("""">
    </head>

<header>
        <div class="topbar">
      <div class="topbar-inner">
        <div class="container">
          <a class="brand" href="">UniCarbKB</a>
          <ul class="nav">
            <li class="active"><a href="#">Home</a></li>
            <li><a href="#about">About</a></li>
            <li><a href="#contact">Contact</a></li>
          </ul>
          """),format.raw/*20.79*/("""
          """),format.raw/*26.5*/("""

        </div>
      </div>
    </div>
</header>

<hr>
	<div class="container content">
	<div class="row"><div style="text-align:center; line-height:50px">
                <image src=""""),_display_(Seq(/*36.30*/routes/*36.36*/.Assets.at("/public/images", "logo.png"))),format.raw/*36.76*/("""" class="imglogo">
                </div>
	</div>

        <div class="row">
            <div class="span8 leftContent">
            	<h2>A new collaborative approach to glycomics</h2>
                <div class="row">
			 <div class="span1">
                   <img src="http://littlesparkvt.com/hubblewp/wp-content/uploads/2012/04/icon-custom4.png">
                </div>

                	<div class="span7">
			<p>The availability of a knowledgebase initially comprising curated structural glycans from GlycoSuiteDB and EUROCarbDB, including information on biological sources, disease states, attached protein, PubMed reference and methods used. It is envisaged that this resource will be extended with new collections of data on these structures that will form a crucial resource for glycobiologists.</p>

                    </div>                                        
                </div>
                <hr>
                <div class="row">
                	<div class="span4">
                    	<p class="cntPara easyUse">
                        	<strong class="lead">A Curated Resource</strong>
                           	UniCarbKB builds on previous efforts by GlycoSuiteDB to curate information from the scientific literature on glycoprotein derived glycan structures. This knowledgebase will continue the principle and give access to both a curated and validated data repository.  
                    </div>
                    <div class="span4">
                    	<p class="cntPara itsFree">
                        	<strong class="lead">Open Access</strong>
                            UniCarbKB continues to build on the principles of EUROCarbDB to provide an open-access platform for glycoinformatics and provides the community with free access to a leading research platform.</p>      
                    </div>                                        
                </div>
                <hr>
                <div class="row">
                	<div class="span8">
                    	<h3 class="signupTeaser"><a href="http://www.ncbi.nlm.nih.gov/pubmed?term=unicarbkb">Read more about UniCarbKB</a></h3>
                    </div>                                        
                </div>
                <hr>
                <div class="row">
                	<div class="span8">
                    	<h3 class="quickTour">Start Browsing <small> follow a link below</small></h3>
			<div class="social_stuff" style="width:100%; text-align:center;">
                                        <div class="widget"  style="width: 65%; margin: 0px auto; text-align:left;">
                                                <div class="twitter">
                                                        <div class="more"><a href="references" title="" target="_blank" rel="nofollow" style="height: 50px;"><span class="count">3238</span><span class="desc">GlycoSuite Structures</span></a></div>
                                                </div>
                                                <div class="facebook">
                                                        <div class="stat"><a href="http://www.unicarb-db.org" title="" target="_blank" rel="nofollow"><span class="count">283</span><span class="desc">Publications</span></a></div>
                                                </div>
                                                <div class="rss">
                                                        <div class="ms"><a href="http://www.unicarb-db.org" title="" target="_blank" rel="nofollow" style="height: 50px;"><span class="count">269</span><span class="desc">UniCarb-DB MS/MS</span></a></div>
                                                </div>
						<div class="twitter">
                                                        <div class="more"><a href="http://unicarb-db.org/unicarbdb/show_mucin.action" title="" target="_blank" rel="nofollow" style="height: 50px;" ><span class="count">303</span><span class="desc">MS Confirmed Structures</span></a></div>
                                                </div>
                                        </div>
                 </div>


                        """),format.raw/*116.7*/("""
                    </div>                                        
                </div>
            </div>
            <div class="span4 sidebar">
                <h2><a href="references" class="btn btn-success">Coming Soon (Preview)</a></h2>
                """),format.raw/*129.28*/("""

<ul class="nav nav-pills nav-stacked" style="width: 100%;">
	<li><a href="http://glycosuitedb.expasy.org"><span style="color: black;">GlycoSuiteDB</span> - a database of curated glycan structural data (previously commerical)
	<li><a href="http://www.eurocarbdb.org"><span style="color: black;">EUROCarbDB</span> - an experimental and structural database</a></li>
	<li><a href="http://unicarb-db.org/unicarbdb/show_mucin.action"><span style="color: black;">UniCarb-DB</span> - an experimental LC-MS/MS database of glycan structures</a></li>
	<li><a href="http://web.expasy.org/glycomod/"><span style="color: black;">GlycoMod</span> - a tool for calculating composition of glycans from MS data</a></li>
        <li><a href="http://sugarbind.expasy.org/sugarbind/"><span style="color: black;">SugarBind</span> - a database of pathogen-glycan interactions</a></li>
	<li><a href="http://glycam.ccrc.uga.edu/ccrc/"><span style="color: black;">GLYCAM</span> - an environment for 3-D glycan structures</a></li>
	<li><a href="http://glycobase.nibrt.ie"><span style="color: black;">GlycoBase</span> - an experimental LC database of derivatized glycans</a></li>
	<li><a href="http://rings.t.soka.ac.jp/"><span style="color: black;">RINGS</span> - a web resource providing algorithmic and data mining tools</a></li>
	
      </ul>

                <h3>International Effort</h3>
               	<p>A collaboration of researchers from Macquarie University, Australia; University of Gothenburg, Sweden; Swiss Institute for Bioinformatics, Switzerland; Max Planck Institute of Colloids and Interfaces, Germany;  and the National Institute for Bioprocessing Research and Training (NIBRT), Ireland; UNSW, Australia; Soka University, Japan; CCRC, USA</p>
 
                <h4><a href="#">Want to contribute?</a></h4>
		<br><a href="https://twitter.com/unicarbkb" class="twitter-follow-button" data-show-count="false">Follow unicarbkb</a>
<script>!function(d,s,id)"""),format.raw("""{"""),format.raw/*148.27*/("""var js,fjs=d.getElementsByTagName(s)[0];if(!d.getElementById(id))"""),format.raw("""{"""),format.raw/*148.93*/("""js=d.createElement(s);js.id=id;js.src="//platform.twitter.com/widgets.js";fjs.parentNode.insertBefore(js,fjs);"""),format.raw("""}"""),format.raw("""}"""),format.raw/*148.205*/("""(document,"script","twitter-wjs");</script>
		<!-- Place this tag where you want the +1 button to render -->
		<br><g:plusone size="medium" annotation="none"></g:plusone>

<!-- Place this render call where appropriate -->
<script type="text/javascript">
  (function() """),format.raw("""{"""),format.raw/*154.16*/("""
    var po = document.createElement('script'); po.type = 'text/javascript'; po.async = true;
    po.src = 'https://apis.google.com/js/plusone.js';
    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(po, s);
  """),format.raw("""}"""),format.raw/*158.4*/(""")();
</script>
            </div>
    	</div>
        <div class="footer">
        	<div class="row">
            	<div class="span12">
                	<p class="pull-left">UniCarbKB</p>
                    <p class="pull-right">Supported by <a href="http://www.nectar.org.au">NeCTAR</a> &nbsp;|&nbsp; <a href="http://www.ands.org.au">ANDS</a> &nbsp;|&nbsp;<a href="http://www.stint.se"> STINT</a></p>
                </div>
            </div>
        </div>
    </div>

</html>	
"""))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Oct 12 14:39:33 EST 2012
                    SOURCE: /home/matthew/Documents/play-app/tmp/glycomics/app/views/index.scala.html
                    HASH: e82bd77d019995aa3b0f131ae286825e9dc6eb5c
                    MATRIX: 814->0|980->136|994->142|1075->201|1177->273|1191->279|1269->335|1372->408|1386->414|1469->475|1875->921|1913->1108|2131->1295|2146->1301|2208->1341|6415->6610|6706->7307|8701->9254|8815->9320|8995->9432|9312->9701|9600->9942
                    LINES: 30->1|34->5|34->5|34->5|35->6|35->6|35->6|36->7|36->7|36->7|49->20|50->26|60->36|60->36|60->36|118->116|124->129|143->148|143->148|143->148|149->154|153->158
                    -- GENERATED --
                */
            