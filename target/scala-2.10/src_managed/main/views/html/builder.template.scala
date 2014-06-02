
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
object builder extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

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
      <h1>Glycan Builder</h1>
      <h4 class="subheader">An intuitive interface for building and displaying glycan structures</h4>
</div>

        <script type="text/javascript" src="/GlycanBuilder/VAADIN/vaadinBootstrap.js"></script>

        <iframe id="__gwt_historyFrame" style="width:0;height:0;border:0;overflow:hidden" src="javascript:false"></iframe>



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
    vaadin.initApplication("fb", """),format.raw/*89.34*/("""{"""),format.raw/*89.35*/("""
        "browserDetailsUrl": "GlycanBuilder/",
        "serviceUrl": "GlycanBuilder/",
        "widgetset": "ac.uk.icl.dell.vaadin.glycanbuilder.widgetset.GlycanbuilderWidgetset",
        "theme": "ucdb_2011theme",
        "versionInfo": """),format.raw/*94.24*/("""{"""),format.raw/*94.25*/(""""vaadinVersion": "7.0.0""""),format.raw/*94.49*/("""}"""),format.raw/*94.50*/(""",
        "vaadinDir": "/GlycanBuilder/VAADIN/",
        "heartbeatInterval": 300,
        "debug": false,
        "standalone": false,
        "authErrMsg": """),format.raw/*99.23*/("""{"""),format.raw/*99.24*/("""
            "message": "Take note of any unsaved data, "+
                       "and <u>click here<\/u> to continue.",
            "caption": "Authentication problem"
        """),format.raw/*103.9*/("""}"""),format.raw/*103.10*/(""",
        "comErrMsg": """),format.raw/*104.22*/("""{"""),format.raw/*104.23*/("""
            "message": "Take note of any unsaved data, "+
                       "and <u>click here<\/u> to continue.",
            "caption": "Communication problem"
        """),format.raw/*108.9*/("""}"""),format.raw/*108.10*/(""",
        "sessExpMsg": """),format.raw/*109.23*/("""{"""),format.raw/*109.24*/("""
            "message": "Take note of any unsaved data, "+
                       "and <u>click here<\/u> to continue.",
            "caption": "Session Expired"
        """),format.raw/*113.9*/("""}"""),format.raw/*113.10*/("""
    """),format.raw/*114.5*/("""}"""),format.raw/*114.6*/(""");//]]>
  </script>
        """),format.raw/*119.21*/("""

	<script type="text/javascript">
        var callBack=[];
        callBack.run=function(response)"""),format.raw/*123.40*/("""{"""),format.raw/*123.41*/("""
          document.write(response);
         var r = response;
          //document.write(r);
          //document.form.frm1.Search = 'test this';
          //document.form.frm1.submit();
        //document.forms["frm2"].submit();
        var url = "../saySearch/s?";
        var x = url + encodeURI(r);
        //var s = [ url, "" , r].join("");
        //document.write(x);
window.location = x ;
        """),format.raw/*135.9*/("""}"""),format.raw/*135.10*/("""
       </script>

        <form id="frm1" name="frm1" action="ms" method="POST" class="form-search">
        <input type="button" name="Search" value="Search" onclick='exportCanvas("glycoct_condensed","callBack");'/>
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
                    SOURCE: /Users/matthew/git/glycomics_working/app/views/builder.scala.html
                    HASH: 81bfd930e0708eb9d39511ec5a6a00e4a3f00f9e
                    MATRIX: 857->0|1224->332|1238->338|1314->392|1418->461|1432->467|1511->524|1578->556|1592->562|1649->598|1727->640|1742->646|1809->691|1875->721|1890->727|1977->792|2043->822|2058->828|2132->880|2198->910|2213->916|2296->977|2362->1007|2377->1013|2460->1074|2526->1104|2541->1110|2610->1157|2676->1187|2691->1193|2764->1244|2808->1342|2863->1361|2878->1367|2945->1412|3011->1442|3026->1448|3102->1502|3168->1532|3183->1538|3254->1587|3320->1617|3335->1623|3423->1689|3490->1720|3505->1726|3573->1772|3639->1802|3654->1808|3726->1858|3793->1889|3808->1895|3878->1943|4719->2888|6041->4182|6070->4183|6337->4422|6366->4423|6418->4447|6447->4448|6633->4606|6662->4607|6867->4784|6897->4785|6949->4808|6979->4809|7183->4985|7213->4986|7266->5010|7296->5011|7494->5181|7524->5182|7557->5187|7586->5188|7643->5355|7771->5454|7801->5455|8236->5862|8266->5863
                    LINES: 29->1|33->5|33->5|33->5|34->6|34->6|34->6|36->8|36->8|36->8|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|46->18|46->18|46->18|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|51->23|51->23|51->23|52->24|52->24|52->24|54->26|54->26|54->26|76->49|116->89|116->89|121->94|121->94|121->94|121->94|126->99|126->99|130->103|130->103|131->104|131->104|135->108|135->108|136->109|136->109|140->113|140->113|141->114|141->114|143->119|147->123|147->123|159->135|159->135
                    -- GENERATED --
                */
            