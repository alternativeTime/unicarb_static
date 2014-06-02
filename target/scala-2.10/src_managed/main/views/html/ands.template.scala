
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
object ands extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html class="about">
  <head>
    <title>UnICarbKB</title>
    <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*5.66*/routes/*5.72*/.Assets.at("/public", "stylesheets/bootstrap.min.css"))),format.raw/*5.126*/("""">
    <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*6.66*/routes/*6.72*/.Assets.at("/public", "stylesheets/unicarbkb.css"))),format.raw/*6.122*/("""">
    <link rel="icon" href=""""),_display_(Seq[Any](/*7.29*/routes/*7.35*/.Assets.at("/public", "favicon.ico"))),format.raw/*7.71*/("""" type="image/x-icon">
    <link rel="icon" href=""""),_display_(Seq[Any](/*8.29*/routes/*8.35*/.Assets.at("/public", "favicon.ico"))),format.raw/*8.71*/("""" type="image/x-icon">
  </head>

  <header>
    <div class="navbar">
      <div class="navbar-inner">
        <div class="container-fluid">
          <a class="brand" href="/">UniCarbKB</a>
          <ul class="nav">
            <li><a href="/">Home</a></li>
            <li><a href="/query">Search</a></li>
            <li><a href="/references">References</a></li>
            <li><a href="/builder">Glycan Builder</a></li>
          </ul>
          <div id="headersearch" class="pull-right">
            <ul class='nav'>
              <li class='active'><a href="/about">About</a></li>
              <li class='active'><a href="/about">Contact</a></li>
            </ul>
          </div>
        </div>
      </div>
    </div>
  </header>

  <div class="container-fluid content">
    <div class="row-fluid info">
      <div class="span8 leftContent">
        <h3>About UniCarbKB</h3>
        <p>
          The rapidly expanding glycomics field (structure and function of sugars) is being increasingly recognized as an important component of life science research, for application in diagnosis of disease, preventive medicines (vaccines) and therapeutic drugs. In contrast to the genomics and proteomics fields, and despite several international initiatives, glycomics still lacks maintained, accessible, curated, integrated and comprehensive data collections that summarize the structure, characteristics, biological origin and potential function of carbohydrates.
        </p>
        <p>
          UniCarbKB is an initiative that aims to promote the creation of an online information storage and search platform for glycomics and glycobiology research. The knowledgebase will offer a freely accessible and information rich resource supported by querying interfaces, annotation technologies and the adoption of common standards to integrate structural, experimental and functional data. Through cross-referencing existing databases and information resources, the UniCarbKB framework endeavours to support the growth of glycobioinformatics and the dissemination of knowledge through the provision of an open and unified portal to encourage the sharing of data.
        </p>
        <p>
          The initiative aims to make the technology available to all glycomics researchers and other ‘omics’ disciplines to explore and integrate cross-disciplinary boundaries to gain new insights. Australia has a unique opportunity to become a global focal point for building and enabling a capability area in glycomics that integrates and leverages the technology and data produced by previous international and Australian infrastructure initiatives.
        </p>
	<h3>Acknowledgements</h3>
	<p>
	  The UniCarbKB team acknowledge the work and efforts of EUROCarbDB and GlycoSuiteDB including associated projects MonosaccharideDB, GlycoWorkBench, GlycanBuilder and GlycoBase. These actvities have enabled us to develop and provide the community with a growing resource for glycomics and glycoproteomic research. Furthermore, we welcome new collaborations with members from the JCCGDB, Rings and BCSDB databases.
	</p>
	<p>
	<h3>License</h3>
	<a rel="license" href="http://creativecommons.org/licenses/by-nc-nd/3.0/deed.en_US"><img alt="Creative Commons License" style="border-width:0" src="http://i.creativecommons.org/l/by-nc-nd/3.0/88x31.png" /></a><br /><span xmlns:dct="http://purl.org/dc/terms/" href="http://purl.org/dc/dcmitype/Dataset" property="dct:title" rel="dct:type">UniCarbKB</span> is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by-nc-nd/3.0/deed.en_US">Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License</a>.
	</p>
      </div>

      <div class='span4 sidebar'>
        <ul class='nav nav-pills nav-stacked clearfix'>
          <h3>Contacts</h3>
          <li>
            <a href='mailto:nicki.packer&#64;mq.edu.au'>
              Prof. Nicki Packer; Director, Biomolecular Frontiers Research Centre, Macquarie University, Sydney 
            </a>
	    <a href='mailto:matthew.campbell&#64;mq.edu.au'>
	      Matthew Campbell,  Biomolecular Frontiers Research Centre, Macquarie University, Sydney
	    </a>
            <a href='mailto:frederique.lisacek&#64;isb-sib.ch'>
	      Frederique Lisacek, Swiss Institute for Bioinformatics
	    </a>
          </li>
        </ul>
	<div class="info clearfix">
          <h3>Social Connections</h3>
          <img src='/assets/images/qr/homeqr.png' alt='' /><br/>
	  	  <a href="../images/Macquarie_BiFoldBrochure_v1_HR.pdf">Check out our latest brochure</a><br/><br/>
          <a href="https://twitter.com/unicarbkb" class="twitter-follow-button" data-show-count="false">Follow unicarbkb</a>
          <script>!function(d,s,id)"""),format.raw/*76.36*/("""{"""),format.raw/*76.37*/("""var js,fjs=d.getElementsByTagName(s)[0];if(!d.getElementById(id))"""),format.raw/*76.102*/("""{"""),format.raw/*76.103*/("""js=d.createElement(s);js.id=id;js.src="//platform.twitter.com/widgets.js";fjs.parentNode.insertBefore(js,fjs);"""),format.raw/*76.213*/("""}"""),format.raw/*76.214*/("""}"""),format.raw/*76.215*/("""(document,"script","twitter-wjs");</script>
          <!-- Place this tag where you want the +1 button to render -->
          <br><g:plusone size="medium" annotation="none"></g:plusone>

          <!-- Place this render call where appropriate -->
          <script type="text/javascript">
            (function() """),format.raw/*82.25*/("""{"""),format.raw/*82.26*/("""
              var po = document.createElement('script'); po.type = 'text/javascript'; po.async = true;
              po.src = 'https://apis.google.com/js/plusone.js';
              var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(po, s);
              """),format.raw/*86.15*/("""}"""),format.raw/*86.16*/(""")();
          </script>
          """),format.raw/*88.51*/("""
        </div>
      </div>
    </div>
    
    <div class="row-fluid logos">
      <div class='span3 nectar'><a href="http://www.nectar.org.au"><img src='/assets/img/NeCTAR_Logo.png' alt='' /></a></div>
      <div class='span3'><a href="http://www.ands.org.au"><img src='/assets/img/ANDS_Logo.png' alt='' /></a></div>
      <div class='span3 stint'><a href="http://www.stint.se"><img src='/assets/img/STINT_Logo.png' alt='' /></a></div>
      <div class='span3'><a href="http://expasy.org/"><img src='/assets/img/SIB_Logo.png' alt='' /></a></div>
    </div>

    """),_display_(Seq[Any](/*100.6*/views/*100.11*/.html.footerunicarb.footerunicarb())),format.raw/*100.46*/("""
  
  </div>

</html>	
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 02 10:52:55 EST 2014
                    SOURCE: /Users/matthew/git/glycomics_working/app/views/ands.scala.html
                    HASH: b3d77152e9d5759760bf6da8e9f4811b3593fd58
                    MATRIX: 854->0|1029->140|1043->146|1119->200|1222->268|1236->274|1308->324|1374->355|1388->361|1445->397|1531->448|1545->454|1602->490|6363->5223|6392->5224|6486->5289|6516->5290|6655->5400|6685->5401|6715->5402|7057->5716|7086->5717|7396->5999|7425->6000|7488->6075|8090->6641|8105->6646|8163->6681
                    LINES: 29->1|33->5|33->5|33->5|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|104->76|104->76|104->76|104->76|104->76|104->76|104->76|110->82|110->82|114->86|114->86|116->88|128->100|128->100|128->100
                    -- GENERATED --
                */
            