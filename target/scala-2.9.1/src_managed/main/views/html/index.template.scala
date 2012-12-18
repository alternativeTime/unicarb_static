
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
<html class="home">
  <head>
    <title>UnICarbKB</title>
    <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq(/*5.66*/routes/*5.72*/.Assets.at("/public", "stylesheets/bootstrapnewlayout.css"))),format.raw/*5.131*/("""">
    <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq(/*6.66*/routes/*6.72*/.Assets.at("/public", "stylesheets/stylesnewlayout.css"))),format.raw/*6.128*/("""">
    <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq(/*7.66*/routes/*7.72*/.Assets.at("/public", "stylesheets/bootstrap-responsive.css"))),format.raw/*7.133*/("""">
    <link rel="icon" href=""""),_display_(Seq(/*8.29*/routes/*8.35*/.Assets.at("/public", "favicon.ico"))),format.raw/*8.71*/("""" type="image/x-icon">
    <link rel="icon" href=""""),_display_(Seq(/*9.29*/routes/*9.35*/.Assets.at("/public", "favicon.ico"))),format.raw/*9.71*/("""" type="image/x-icon">
  </head>

  <header>
  <div class="topbar">
    <div class="topbar-inner">
      <div class="container-fluid">
        <a class="brand" href="/">UniCarbKB</a>
        <ul class="nav">
          <li class="active"><a href="#">Home</a></li>
          """),format.raw/*21.18*/("""
	  <li><a href="/browse">Search</a></li>
	  <li><a href="/references">References</a></li>
	  <li><a href="/builder">Glycan Builder</a></li>
	</ul>
	<div id="headersearch" class="pull-right">
	<ul>
          <li><a href="#about">About</a></li>
          <li><a href="#contact">Contact</a></li>
        </ul>
	</div>
      </div>
    </div>
  </div>
  </header>

  <div class="container-fluid content">
    <div class="row-fluid">
      <div class="span12">
        <!--<image src=""""),_display_(Seq(/*40.26*/routes/*40.32*/.Assets.at("/public/images", "UniCarbKB_Logo.png"))),format.raw/*40.82*/("""" class="imglogo">-->
        <h3 class="subheader"><a href="/browse"><span class="start">Start here with UniCarbKB<small> A new collaborative approach to glycomics</small></span></a></h3>
        
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
              <a href="/builder" title="" target="_blank" rel="nofollow"><span class="count">3238</span><span class="desc">GlycoSuite Structures</span></a>
            </div>
            <div class="span3 publications">
              <a href="/references" title="" target="_blank" rel="nofollow"><span class="count">864</span><span class="desc">Publications</span></a>
            </div>
            <div class="span3 unicarbdb">
              <a href="http://www.unicarb-db.org" title="" target="_blank" rel="nofollow"><span class="count">520</span><span class="desc">UniCarb-DB MS/MS</span></a>
            </div>
            <div class="span3 structures">
              <a href="http://unicarb-db.org/unicarbdb/show_mucin.action" title="" target="_blank" rel="nofollow"><span class="count">303</span><span class="desc">MS Confirmed Structures</span></a>
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
              <h3 class="pull-center lead"><a href="http://www.ncbi.nlm.nih.gov/pubmed?term=unicarbkb">Read more about UniCarbKB...</a></h3>
            </div>                                        
          </div>
          <div class="row-fluid">
            <div class="span12">

              """),format.raw/*116.18*/("""
            </div>                                        
          </div>
        </div>
        <div class="span4 sidebar" style="margin-top: 0px">
          """),format.raw/*128.22*/("""

              <div class="info">
                <h3>International Effort</h3>
                <p>A collaboration of researchers from Macquarie University, Australia; University of Gothenburg, Sweden; Swiss Institute for Bioinformatics, Switzerland; Max Planck Institute of Colloids and Interfaces, Germany;  and the National Institute for Bioprocessing Research and Training (NIBRT), Ireland; UNSW, Australia; Soka University, Japan; CCRC, USA</p>
              </div>

              <ul class="nav nav-pills nav-stacked clearfix">
                <li><a href="http://glycosuitedb.expasy.org"><strong>GlycoSuiteDB</strong> - a database of curated glycan structural data (previously commerical)
                <li><a href="http://www.ebi.ac.uk/eurocarb"><strong>EUROCarbDB</strong> - an experimental and structural database</a></li>
                <li><a href="http://unicarb-db.org/unicarbdb/show_mucin.action"><strong>UniCarb-DB</strong> - an experimental LC-MS/MS database of glycan structures</a></li>
                <li><a href="http://web.expasy.org/glycomod/"><strong>GlycoMod</strong> - a tool for calculating composition of glycans from MS data</a></li>
                <li><a href="http://sugarbind.expasy.org/sugarbind/"><strong>SugarBind</strong> - a database of pathogen-glycan interactions</a></li>
                <li><a href="http://glycam.ccrc.uga.edu/ccrc/"><strong>GLYCAM</strong> - an environment for 3-D glycan structures</a></li>
                <li><a href="http://glycobase.nibrt.ie"><strong>GlycoBase</strong> - an experimental LC database of derivatized glycans</a></li>
                <li><a href="http://rings.t.soka.ac.jp/"><strong>RINGS</strong> - a web resource providing algorithmic and data mining tools</a></li>
              </ul>

              <div class="info clearfix">
                <h4>Social Connections</h4>
                <br><a href="https://twitter.com/unicarbkb" class="twitter-follow-button" data-show-count="false">Follow unicarbkb</a>
              <script>!function(d,s,id)"""),format.raw("""{"""),format.raw/*149.41*/("""var js,fjs=d.getElementsByTagName(s)[0];if(!d.getElementById(id))"""),format.raw("""{"""),format.raw/*149.107*/("""js=d.createElement(s);js.id=id;js.src="//platform.twitter.com/widgets.js";fjs.parentNode.insertBefore(js,fjs);"""),format.raw("""}"""),format.raw("""}"""),format.raw/*149.219*/("""(document,"script","twitter-wjs");</script>
              <!-- Place this tag where you want the +1 button to render -->
              <br><g:plusone size="medium" annotation="none"></g:plusone>

              <!-- Place this render call where appropriate -->
              <script type="text/javascript">
                (function() """),format.raw("""{"""),format.raw/*155.30*/("""
                 var po = document.createElement('script'); po.type = 'text/javascript'; po.async = true;
                 po.src = 'https://apis.google.com/js/plusone.js';
                 var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(po, s);
                 """),format.raw("""}"""),format.raw/*159.19*/(""")();
               </script>
               <div class="timeline-arrow"></div>
             </div>
            </div>
           </div>
           <div class="footer row-fluid">
            <div class="span12">
              <p class="pull-left">UniCarbKB</p>
              <p class="pull-right">Supported by 
                <a href="http://www.nectar.org.au">NeCTAR</a> &nbsp;|&nbsp; 
                <a href="http://www.ands.org.au">ANDS</a> &nbsp;|&nbsp;
                <a href="http://www.stint.se"> STINT</a>
              </p>
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
                    DATE: Tue Dec 18 08:54:51 EST 2012
                    SOURCE: /home/matthew/Documents/play-app/office/glycomics/app/views/index.scala.html
                    HASH: 97b270e91d753b15c98ed5a385434f672d6f9eae
                    MATRIX: 814->0|983->139|997->145|1078->204|1176->272|1190->278|1268->334|1366->402|1380->408|1463->469|1524->500|1538->506|1595->542|1676->593|1690->599|1747->635|2048->1051|2561->1533|2576->1539|2648->1589|5853->5614|6044->6169|8126->8203|8241->8269|8421->8381|8804->8716|9147->9011
                    LINES: 30->1|34->5|34->5|34->5|35->6|35->6|35->6|36->7|36->7|36->7|37->8|37->8|37->8|38->9|38->9|38->9|48->21|67->40|67->40|67->40|121->116|126->128|147->149|147->149|147->149|153->155|157->159
                    -- GENERATED --
                */
            