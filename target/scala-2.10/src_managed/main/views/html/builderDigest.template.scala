
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
object builderDigest extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" style="width:100%;height:100%;border:0;margin:0;">
<head> 
<title>UniCarbKB - GlycanBuilder</title> 
     <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*5.67*/routes/*5.73*/.Assets.at("/public", "stylesheets/bootstrap.min.css"))),format.raw/*5.127*/(""""> 
    <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*6.66*/routes/*6.72*/.Assets.at("/public", "stylesheets/unicarbkbbuilder.css"))),format.raw/*6.129*/("""">

    <link rel="icon" href=""""),_display_(Seq[Any](/*8.29*/routes/*8.35*/.Assets.at("/public", "favicon.ico"))),format.raw/*8.71*/("""" type="image/x-icon">

    <script src=""""),_display_(Seq[Any](/*10.19*/routes/*10.25*/.Assets.at("/public","javascripts/jquery.js"))),format.raw/*10.70*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*11.19*/routes/*11.25*/.Assets.at("/public","javascripts/jquery.ae.image.resize.min.js"))),format.raw/*11.90*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*12.19*/routes/*12.25*/.Assets.at("/public","javascripts/bootstrap.min.js"))),format.raw/*12.77*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*13.19*/routes/*13.25*/.Assets.at("/public","javascripts/jquery.tablesorter.min.js"))),format.raw/*13.86*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*14.19*/routes/*14.25*/.Assets.at("/public","javascripts/bootstrap-lightbox.min.js"))),format.raw/*14.86*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*15.19*/routes/*15.25*/.Assets.at("/public","javascripts/showdown.js"))),format.raw/*15.72*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*16.19*/routes/*16.25*/.Assets.at("/public","javascripts/google-jsapi.js"))),format.raw/*16.76*/(""""></script>
    """),format.raw/*17.87*/("""
    <script src=""""),_display_(Seq[Any](/*18.19*/routes/*18.25*/.Assets.at("/public","javascripts/jPages.js"))),format.raw/*18.70*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*19.19*/routes/*19.25*/.Assets.at("/public","javascripts/jquery.lazyload.js"))),format.raw/*19.79*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*20.19*/routes/*20.25*/.Assets.at("/public","javascripts/load-image.js"))),format.raw/*20.74*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*21.19*/routes/*21.25*/.Assets.at("/public","javascripts/bootstrap-image-gallery.min.js"))),format.raw/*21.91*/(""""></script>

    <script src=""""),_display_(Seq[Any](/*23.19*/routes/*23.25*/.Assets.at("/public","javascripts/select2.js"))),format.raw/*23.71*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*24.19*/routes/*24.25*/.Assets.at("/public","javascripts/application.js"))),format.raw/*24.75*/(""""></script>

    <script src=""""),_display_(Seq[Any](/*26.19*/routes/*26.25*/.Assets.at("/public","javascripts/workflows.js"))),format.raw/*26.73*/(""""></script>
    <script src="http://d3js.org/d3.v3.min.js"></script>

</head>
<section id="main" class="container-fluid content">
<body>
<header>
    <div class="navbar">
      <div class="navbar-inner">
        <div class="container-fluid">
          <a class="brand" href="/">UniCarbKB</a>
          <ul class="nav">
            <li class=""><a href="/">Home</a></li>
            <li><a href="/query">Query</a></li>
            <li><a href="/references?s=authors">References</a></li>
            <li><a href="/proteins">Glycoproteins</a></li>
            <li><a href="/builder">Glycan Builder</a></li>
          </ul>
          <div id="headersearch" class="pull-right">
            <ul class='nav'>
            <li><a href="/about">About</a></li>
            <li><a href="/about"> Contact</a></li>
            """),format.raw/*49.78*/("""
            </ul>
            </li>
            </ul>
          </div>


        </div>
      </div>
    </div>
</header>
<ul class="breadcrumb">
  <li><i class="icon-home" ></i><a href="/"> UniCarbKB</a> <span class="divider">></span></li>
  <li class="active"><i class="icon-wrench" ></i> Glycan Builder <span class="divider"></span></li>
</ul>



<div class="page-header row-fluid">
      <h1>Glycan Builder and GlycoDigest</h1>
      <h4 class="subheader">Welcome to the preview launch of UniCarbKBs integrated GlycoDigest tool. To successfully run GlycoDigest build N-link structures with embedded linkage information</h4>
</div>

        <script type="text/javascript" src="/GlycanBuilder/VAADIN/vaadinBootstrap.js"></script>

        <iframe id="__gwt_historyFrame" style="width:0;height:0;border:0;overflow:hidden" src="javascript:false"></iframe>

<div class="row-fluid">
"""),format.raw/*77.375*/("""
</div>

<div style="height:450px;" id="fb" class="v-app">
   <!-- Optional placeholder for the loading indicator -->
    <div class=" v-app-loading"></div>

    <!-- Alternative fallback text -->
    <noscript>You have to enable javascript in your browser to
              use an application built with Vaadin.</noscript>
  </div>      
<script type="text/javascript">//<![CDATA[
    if (!window.vaadin)
        alert("Failed to load the bootstrap JavaScript: VAADIN/vaadinBootstrap.js");

    /* The UI Configuration */
    vaadin.initApplication("fb", """),format.raw/*93.34*/("""{"""),format.raw/*93.35*/("""
        "browserDetailsUrl": "GlycanBuilder/",
        "serviceUrl": "GlycanBuilder/",
        "widgetset": "ac.uk.icl.dell.vaadin.glycanbuilder.widgetset.GlycanbuilderWidgetset",
        "theme": "ucdb_2011theme",
        "versionInfo": """),format.raw/*98.24*/("""{"""),format.raw/*98.25*/(""""vaadinVersion": "7.0.0""""),format.raw/*98.49*/("""}"""),format.raw/*98.50*/(""",
        "vaadinDir": "/GlycanBuilder/VAADIN/",
        "heartbeatInterval": 300,
        "debug": false,
        "standalone": false,
        "authErrMsg": """),format.raw/*103.23*/("""{"""),format.raw/*103.24*/("""
            "message": "Take note of any unsaved data, "+
                       "and <u>click here<\/u> to continue.",
            "caption": "Authentication problem"
        """),format.raw/*107.9*/("""}"""),format.raw/*107.10*/(""",
        "comErrMsg": """),format.raw/*108.22*/("""{"""),format.raw/*108.23*/("""
            "message": "Take note of any unsaved data, "+
                       "and <u>click here<\/u> to continue.",
            "caption": "Communication problem"
        """),format.raw/*112.9*/("""}"""),format.raw/*112.10*/(""",
        "sessExpMsg": """),format.raw/*113.23*/("""{"""),format.raw/*113.24*/("""
            "message": "Take note of any unsaved data, "+
                       "and <u>click here<\/u> to continue.",
            "caption": "Session Expired"
        """),format.raw/*117.9*/("""}"""),format.raw/*117.10*/("""
    """),format.raw/*118.5*/("""}"""),format.raw/*118.6*/(""");//]]>
  </script>
        """),format.raw/*123.21*/("""

	<script type="text/javascript">
        var callBack=[];
        callBack.run=function(response)"""),format.raw/*127.40*/("""{"""),format.raw/*127.41*/("""
          document.write(response);
         var r = response;
          //document.write(r);
          //document.form.frm1.Search = 'test this';
          //document.form.frm1.submit();
        //document.forms["frm2"].submit();
        var url = "/builderDigestSearch/s?";
        var x = url + encodeURI(r);
        //var s = [ url, "" , r].join("");
        //document.write(x);
window.location = x ;
        """),format.raw/*139.9*/("""}"""),format.raw/*139.10*/("""
       </script>

        <form id="frm1" name="frm1" action="ms" method="POST" class="form-search">
        <input type="button" name="Digest" value="Digest" onclick='exportCanvas("glycoct_condensed","callBack");'/>
        </form>


<div class="row-fluid">
        <div class="span6">
        <h3 class="">Find Structures</h3>
        <p class="builder">Build your glycan or epitope and search the UniCarbKB structure database. This new design is built using new technologies and discussed by the developer David Damerell.</p>
        </div>

        <div class="span6">
        <h3 class="">Publication</h3>
        <p class="builder">The GlycanBuilder: a fast, intuitive and flexible software tool for building and displaying glycan structures, Alessio Ceroni, Anne Dell, and Stuart M Haslam, Source Code Biol Med. 2007. <a href="http://www.ncbi.nlm.nih.gov/pubmed/17683623">PubMed</a></p>
        <p class="builder">The GlycanBuilder and GlycoWorkbench glycoinformatics tools: updates and new developments, Damerell D, Ceroni A, Maass K <i>et al</i>, Biol Chem. 2012. <a href="http://www.ncbi.nlm.nih.gov/pubmed/23109548">PubMed</a></p>
        </div>
</div>


        </body>
</section>
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
                    SOURCE: /Users/matthew/git/glycomics_working/app/views/builderDigest.scala.html
                    HASH: be43b84540d3d1ca2722c8b3e2f2645302acac1f
                    MATRIX: 863->0|1230->332|1244->338|1320->392|1424->461|1438->467|1517->524|1584->556|1598->562|1655->598|1733->640|1748->646|1815->691|1881->721|1896->727|1983->792|2049->822|2064->828|2138->880|2204->910|2219->916|2302->977|2368->1007|2383->1013|2466->1074|2532->1104|2547->1110|2616->1157|2682->1187|2697->1193|2770->1244|2814->1342|2869->1361|2884->1367|2951->1412|3017->1442|3032->1448|3108->1502|3174->1532|3189->1538|3260->1587|3326->1617|3341->1623|3429->1689|3496->1720|3511->1726|3579->1772|3645->1802|3660->1808|3732->1858|3799->1889|3814->1895|3884->1943|4725->2888|5636->4144|6219->4699|6248->4700|6515->4939|6544->4940|6596->4964|6625->4965|6812->5123|6842->5124|7047->5301|7077->5302|7129->5325|7159->5326|7363->5502|7393->5503|7446->5527|7476->5528|7674->5698|7704->5699|7737->5704|7766->5705|7823->5872|7951->5971|7981->5972|8424->6387|8454->6388
                    LINES: 29->1|33->5|33->5|33->5|34->6|34->6|34->6|36->8|36->8|36->8|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|46->18|46->18|46->18|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|51->23|51->23|51->23|52->24|52->24|52->24|54->26|54->26|54->26|76->49|104->77|120->93|120->93|125->98|125->98|125->98|125->98|130->103|130->103|134->107|134->107|135->108|135->108|139->112|139->112|140->113|140->113|144->117|144->117|145->118|145->118|147->123|151->127|151->127|163->139|163->139
                    -- GENERATED --
                */
            