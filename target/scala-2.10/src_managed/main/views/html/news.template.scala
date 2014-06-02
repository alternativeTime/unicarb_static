
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
object news extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

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
        <h3>GlycoSuiteDB redirected to UniCarbKB <em>(24th September 2013)</em></h3>
        <p>Welcome to UniCarbKB. 
        The UniCarbKB team in collaboration with the Swiss Institute of Bioinformatics are pleased 
        to announce the release of UniCarbKB.</p>
        <p>Thanks to this collaboration all UniProtKB and GlycoMod links associated with 
        GlycoSuiteDB have been refreshed and will automatically redirect users to relevant UniCarbKB pages.</p> 
        <p>Previously, GlycoSuiteDB was hosted and maintained by the Swiss Institute of Bioinformatics but has now been discontinued and all services and data have been integrated into UniCarbKB. 
        </p>

        
        
        <h4>GlycoSuiteDB Final Release 8.0</h4>
        <p>GlycoSuiteDB is a curated and annotated glycan database. Release 8.0 contains 9436 entries, sourced from 864 references. 
        This data and new content have been integrated into UniCarbKB with a new user interface and functionality. 
        GlycoSuiteDB, a product of Tyrian Diagnostics Ltd formerly Proteome Systems Ltd, will be safely archived by the Swiss Institute of Bioinformatics.  
        Thanks to on-going collaborations the glycan database will continue to be publicly accessible.</p>
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
          <script>!function(d,s,id)"""),format.raw/*74.36*/("""{"""),format.raw/*74.37*/("""var js,fjs=d.getElementsByTagName(s)[0];if(!d.getElementById(id))"""),format.raw/*74.102*/("""{"""),format.raw/*74.103*/("""js=d.createElement(s);js.id=id;js.src="//platform.twitter.com/widgets.js";fjs.parentNode.insertBefore(js,fjs);"""),format.raw/*74.213*/("""}"""),format.raw/*74.214*/("""}"""),format.raw/*74.215*/("""(document,"script","twitter-wjs");</script>
          <!-- Place this tag where you want the +1 button to render -->
          <br><g:plusone size="medium" annotation="none"></g:plusone>

          <!-- Place this render call where appropriate -->
          <script type="text/javascript">
            (function() """),format.raw/*80.25*/("""{"""),format.raw/*80.26*/("""
              var po = document.createElement('script'); po.type = 'text/javascript'; po.async = true;
              po.src = 'https://apis.google.com/js/plusone.js';
              var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(po, s);
              """),format.raw/*84.15*/("""}"""),format.raw/*84.16*/(""")();
          </script>
          """),format.raw/*86.51*/("""
        </div>
      </div>
    </div>
    
    <div class="row-fluid logos">
      <div class='span3 nectar'><a href="http://www.nectar.org.au"><img src='/assets/img/NeCTAR_Logo.png' alt='' /></a></div>
      <div class='span3'><a href="http://www.ands.org.au"><img src='/assets/img/ANDS_Logo.png' alt='' /></a></div>
      <div class='span3 stint'><a href="http://www.stint.se"><img src='/assets/img/STINT_Logo.png' alt='' /></a></div>
      <div class='span3'><a href="http://expasy.org/"><img src='/assets/img/SIB_Logo.png' alt='' /></a></div>
    </div>

    """),_display_(Seq[Any](/*98.6*/views/*98.11*/.html.footerunicarb.footerunicarb())),format.raw/*98.46*/("""
  
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
                    DATE: Mon Jun 02 10:52:56 EST 2014
                    SOURCE: /Users/matthew/git/glycomics_working/app/views/news.scala.html
                    HASH: 945ebf57576717cab8c7f6b8994f627b100a22ff
                    MATRIX: 854->0|1029->140|1043->146|1119->200|1222->268|1236->274|1308->324|1374->355|1388->361|1445->397|1531->448|1545->454|1602->490|4803->3663|4832->3664|4926->3729|4956->3730|5095->3840|5125->3841|5155->3842|5497->4156|5526->4157|5836->4439|5865->4440|5928->4515|6529->5081|6543->5086|6600->5121
                    LINES: 29->1|33->5|33->5|33->5|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|102->74|102->74|102->74|102->74|102->74|102->74|102->74|108->80|108->80|112->84|112->84|114->86|126->98|126->98|126->98
                    -- GENERATED --
                */
            