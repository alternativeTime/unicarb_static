
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

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
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.17*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
  <head>
    <title>UniCarbKB</title>
    <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*7.66*/routes/*7.72*/.Assets.at("/public", "stylesheets/bootstrap.min.css")),format.raw/*7.126*/(""""> 
    <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*8.66*/routes/*8.72*/.Assets.at("/public", "stylesheets/customMarkdown.css")),format.raw/*8.127*/("""">
    <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*9.66*/routes/*9.72*/.Assets.at("/public", "stylesheets/select2.css")),format.raw/*9.120*/("""">
    <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*10.66*/routes/*10.72*/.Assets.at("/public", "stylesheets/unicarbkb.css")),format.raw/*10.122*/("""">
    <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*11.66*/routes/*11.72*/.Assets.at("/public", "stylesheets/bootstrap-lightbox.css")),format.raw/*11.131*/("""">
    <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*12.66*/routes/*12.72*/.Assets.at("/public", "stylesheets/bootstrap-image-gallery.min.css")),format.raw/*12.140*/("""">

    """),format.raw/*14.96*/("""

    """),format.raw/*16.5*/("""<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*16.66*/routes/*16.72*/.Assets.at("/public", "stylesheets/docs.min.css")),format.raw/*16.121*/("""">

    <link rel="icon" href=""""),_display_(/*18.29*/routes/*18.35*/.Assets.at("/public", "favicon.ico")),format.raw/*18.71*/("""" type="image/x-icon">

    <script src=""""),_display_(/*20.19*/routes/*20.25*/.Assets.at("/public","javascripts/jquery.js")),format.raw/*20.70*/(""""></script>
    <script src=""""),_display_(/*21.19*/routes/*21.25*/.Assets.at("/public","javascripts/jquery.ae.image.resize.min.js")),format.raw/*21.90*/(""""></script>
    <script src=""""),_display_(/*22.19*/routes/*22.25*/.Assets.at("/public","javascripts/bootstrap.min.js")),format.raw/*22.77*/(""""></script>
    <script src=""""),_display_(/*23.19*/routes/*23.25*/.Assets.at("/public","javascripts/jquery.tablesorter.min.js")),format.raw/*23.86*/(""""></script>
    <script src=""""),_display_(/*24.19*/routes/*24.25*/.Assets.at("/public","javascripts/bootstrap-lightbox.min.js")),format.raw/*24.86*/(""""></script>
    <script src=""""),_display_(/*25.19*/routes/*25.25*/.Assets.at("/public","javascripts/showdown.js")),format.raw/*25.72*/(""""></script>
    <script src=""""),_display_(/*26.19*/routes/*26.25*/.Assets.at("/public","javascripts/google-jsapi.js")),format.raw/*26.76*/(""""></script>
    """),format.raw/*27.87*/("""
    """),format.raw/*28.5*/("""<script src=""""),_display_(/*28.19*/routes/*28.25*/.Assets.at("/public","javascripts/jPages.js")),format.raw/*28.70*/(""""></script>
    <script src=""""),_display_(/*29.19*/routes/*29.25*/.Assets.at("/public","javascripts/jquery.lazyload.js")),format.raw/*29.79*/(""""></script>
    <script src=""""),_display_(/*30.19*/routes/*30.25*/.Assets.at("/public","javascripts/load-image.js")),format.raw/*30.74*/(""""></script>
    <script src=""""),_display_(/*31.19*/routes/*31.25*/.Assets.at("/public","javascripts/bootstrap-image-gallery.min.js")),format.raw/*31.91*/(""""></script>

    <script src=""""),_display_(/*33.19*/routes/*33.25*/.Assets.at("/public","javascripts/select2.js")),format.raw/*33.71*/(""""></script>
    <script src=""""),_display_(/*34.19*/routes/*34.25*/.Assets.at("/public","javascripts/application.js")),format.raw/*34.75*/(""""></script>

    <script src=""""),_display_(/*36.19*/routes/*36.25*/.Assets.at("/public","javascripts/workflows.js")),format.raw/*36.73*/(""""></script>
    <script src="http://d3js.org/d3.v3.min.js"></script>
    
    <script src=""""),_display_(/*39.19*/routes/*39.25*/.Assets.at("/public","javascripts/test/jira.js")),format.raw/*39.73*/(""""></script>
    
    """),format.raw/*42.4*/("""
	
   
   

    """),format.raw/*47.5*/("""<script>
      $(function() """),format.raw/*48.20*/("""{"""),format.raw/*48.21*/("""
        """),format.raw/*49.9*/("""$( ".resizeme" ).aeImageResize("""),format.raw/*49.40*/("""{"""),format.raw/*49.41*/(""" """),format.raw/*49.42*/("""height: 400, width: 280 """),format.raw/*49.66*/("""}"""),format.raw/*49.67*/(""");
        $( ".resizemeModal" ).aeImageResize("""),format.raw/*50.45*/("""{"""),format.raw/*50.46*/(""" """),format.raw/*50.47*/("""height: 200, width: 200 """),format.raw/*50.71*/("""}"""),format.raw/*50.72*/(""");
      """),format.raw/*51.7*/("""}"""),format.raw/*51.8*/(""");
    </script>
    <script>
      $(document).ready(function()"""),format.raw/*54.35*/("""{"""),format.raw/*54.36*/("""
        """),format.raw/*55.9*/("""$(".announceTaxStructures").click(function()"""),format.raw/*55.53*/("""{"""),format.raw/*55.54*/(""" """),format.raw/*55.55*/("""// Click to only happen on announce links
          $("#Id").val($(this).data('id'));
          $('#taxDescription').modal('show');
        """),format.raw/*58.9*/("""}"""),format.raw/*58.10*/(""");
      """),format.raw/*59.7*/("""}"""),format.raw/*59.8*/(""");
      function closeDialog () """),format.raw/*60.31*/("""{"""),format.raw/*60.32*/("""
        """),format.raw/*61.9*/("""$('#taxDescription').modal('hide'); 
      """),format.raw/*62.7*/("""}"""),format.raw/*62.8*/(""";
      function okClicked () """),format.raw/*63.29*/("""{"""),format.raw/*63.30*/("""
        """),format.raw/*64.9*/("""closeDialog ();
      """),format.raw/*65.7*/("""}"""),format.raw/*65.8*/(""";

    </script>

    <script>
      $(document).ready(function()"""),format.raw/*70.35*/("""{"""),format.raw/*70.36*/("""
        """),format.raw/*71.9*/("""$(".announce").click(function()"""),format.raw/*71.40*/("""{"""),format.raw/*71.41*/(""" """),format.raw/*71.42*/("""// Click to only happen on announce links
          $("#Id").val($(this).data('id'));
          $('#windowDescription').modal('show');

          var result = $(this).data('id');
          var replace = result.replace("[","");
          var replace = replace.replace("]","");
          var replace = replace.replace(",","");
          var replace = replace.replace("null","");
	  var replace = replace.replace("> null ", "");
	  var replace = replace.replace(" null", "" );
          var replace = replace.replace(" >  > ","");

          $('p').html(replace).appendTo(document.myDiv);


        """),format.raw/*87.9*/("""}"""),format.raw/*87.10*/(""");
      """),format.raw/*88.7*/("""}"""),format.raw/*88.8*/(""");

      function closeDialog () """),format.raw/*90.31*/("""{"""),format.raw/*90.32*/("""
        """),format.raw/*91.9*/("""$('#windowDescription').modal('hide'); 
      """),format.raw/*92.7*/("""}"""),format.raw/*92.8*/(""";
      function okClicked () """),format.raw/*93.29*/("""{"""),format.raw/*93.30*/("""
        """),format.raw/*94.9*/("""closeDialog ();
      """),format.raw/*95.7*/("""}"""),format.raw/*95.8*/(""";
    </script>


    <script>
      $(document).ready(function()"""),format.raw/*100.35*/("""{"""),format.raw/*100.36*/("""
        """),format.raw/*101.9*/("""$(".announce2").click(function()"""),format.raw/*101.41*/("""{"""),format.raw/*101.42*/(""" """),format.raw/*101.43*/("""// Click to only happen on announce links
          $("#Id").val($(this).data('id'));
          $('#windowDescription').modal('show');

          var resultdiv = $(this).data('id');
          var replace = resultdiv.replace("[","");
          var replace = replace.replace("]","");

          $('p').html(replace).appendTo(document.myDiv);


        """),format.raw/*112.9*/("""}"""),format.raw/*112.10*/(""");
      """),format.raw/*113.7*/("""}"""),format.raw/*113.8*/(""");

      function closeDialog () """),format.raw/*115.31*/("""{"""),format.raw/*115.32*/("""
        """),format.raw/*116.9*/("""$('#windowDescription').modal('hide');
      """),format.raw/*117.7*/("""}"""),format.raw/*117.8*/(""";
      function okClicked () """),format.raw/*118.29*/("""{"""),format.raw/*118.30*/("""
        """),format.raw/*119.9*/("""closeDialog ();
      """),format.raw/*120.7*/("""}"""),format.raw/*120.8*/(""";
    </script>

    <script>

      /* Download lazy load plugin and make sure you add it in the head of your page. */

      /* when document is ready */
      $(function() """),format.raw/*128.20*/("""{"""),format.raw/*128.21*/("""

        """),format.raw/*130.9*/("""/* initiate lazyload defining a custom event to trigger image loading  */
        $("ul li img").lazyload("""),format.raw/*131.33*/("""{"""),format.raw/*131.34*/("""
          """),format.raw/*132.11*/("""event : "turnPage",
          effect : "fadeIn"
        """),format.raw/*134.9*/("""}"""),format.raw/*134.10*/(""");

        /* initiate plugin */
        $("div.holder").jPages("""),format.raw/*137.32*/("""{"""),format.raw/*137.33*/("""
          """),format.raw/*138.11*/("""containerID : "itemContainer",
          animation   : "fadeInUp",
          callback    : function( pages, items )"""),format.raw/*140.49*/("""{"""),format.raw/*140.50*/("""
            """),format.raw/*141.13*/("""/* lazy load current images */
            items.showing.find("img").trigger("turnPage");
            /* lazy load next page images */
            items.oncoming.find("img").trigger("turnPage");
          """),format.raw/*145.11*/("""}"""),format.raw/*145.12*/("""
        """),format.raw/*146.9*/("""}"""),format.raw/*146.10*/(""");

      """),format.raw/*148.7*/("""}"""),format.raw/*148.8*/(""");
    </script>
	
	<script type="text/javascript">
		var _gaq = _gaq || [];
	    var pluginUrl =
	    '//www.google-analytics.com/plugins/ga/inpage_linkid.js';
	    _gaq.push(['_require', 'inpage_linkid', pluginUrl]);
	    _gaq.push(['_setAccount', 'UA-28274077-1']);
	    _gaq.push(['_trackPageview']);

	  (function() """),format.raw/*159.16*/("""{"""),format.raw/*159.17*/("""
	    """),format.raw/*160.6*/("""var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
	    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
	    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
	  """),format.raw/*163.4*/("""}"""),format.raw/*163.5*/(""")();

	</script>

	<script>
	    (function(i,s,o,g,r,a,m)"""),format.raw/*168.30*/("""{"""),format.raw/*168.31*/("""i['GoogleAnalyticsObject']=r;i[r]=i[r]||function()"""),format.raw/*168.81*/("""{"""),format.raw/*168.82*/("""
	    """),format.raw/*169.6*/("""(i[r].q=i[r].q||[]).push(arguments)"""),format.raw/*169.41*/("""}"""),format.raw/*169.42*/(""",i[r].l=1*new Date();a=s.createElement(o),
	    m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
	    """),format.raw/*171.6*/("""}"""),format.raw/*171.7*/(""")(window,document,'script','//www.google-analytics.com/analytics.js','ga');

	    ga('create', 'UA-28274077-2', 'unicarbkb.org');
	    ga('send', 'pageview');
	</script>

  </head>
  <body>

    """),format.raw/*186.16*/("""
    """),format.raw/*187.5*/("""<header>
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
	    <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">GlycoDigest <b class="caret"></b></a>
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
            <li><a href="/about"> Contact</a></li>
	    """),format.raw/*231.78*/("""
            """),format.raw/*232.13*/("""</ul>

          """),format.raw/*249.25*/("""
              """),format.raw/*250.15*/("""</li>
            </ul>
          </div>


        </div>
      </div>
    </div>
    </header> 
    <section id="main" class="container-fluid content">
    """),_display_(/*260.6*/content),format.raw/*260.13*/("""
    """),format.raw/*261.5*/("""</section>
  </body>
</html>
"""))}
  }

  def render(content:Html): play.twirl.api.HtmlFormat.Appendable = apply(content)

  def f:((Html) => play.twirl.api.HtmlFormat.Appendable) = (content) => apply(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Nov 14 15:46:54 EST 2014
                  SOURCE: /Users/matthew/playframework/glycomics_again/glycomics/app/views/main.scala.html
                  HASH: c299cba82af660a20e097403d6987d3b310807a4
                  MATRIX: 720->1|823->16|851->18|1003->144|1017->150|1092->204|1187->273|1201->279|1277->334|1371->402|1385->408|1454->456|1549->524|1564->530|1636->580|1731->648|1746->654|1827->713|1922->781|1937->787|2027->855|2063->954|2096->960|2184->1021|2199->1027|2270->1076|2329->1108|2344->1114|2401->1150|2470->1192|2485->1198|2551->1243|2608->1273|2623->1279|2709->1344|2766->1374|2781->1380|2854->1432|2911->1462|2926->1468|3008->1529|3065->1559|3080->1565|3162->1626|3219->1656|3234->1662|3302->1709|3359->1739|3374->1745|3446->1796|3490->1894|3522->1899|3563->1913|3578->1919|3644->1964|3701->1994|3716->2000|3791->2054|3848->2084|3863->2090|3933->2139|3990->2169|4005->2175|4092->2241|4150->2272|4165->2278|4232->2324|4289->2354|4304->2360|4375->2410|4433->2441|4448->2447|4517->2495|4636->2587|4651->2593|4720->2641|4768->2975|4811->2991|4867->3019|4896->3020|4932->3029|4991->3060|5020->3061|5049->3062|5101->3086|5130->3087|5205->3134|5234->3135|5263->3136|5315->3160|5344->3161|5380->3170|5408->3171|5500->3235|5529->3236|5565->3245|5637->3289|5666->3290|5695->3291|5862->3431|5891->3432|5927->3441|5955->3442|6016->3475|6045->3476|6081->3485|6151->3528|6179->3529|6237->3559|6266->3560|6302->3569|6351->3591|6379->3592|6472->3657|6501->3658|6537->3667|6596->3698|6625->3699|6654->3700|7277->4296|7306->4297|7342->4306|7370->4307|7432->4341|7461->4342|7497->4351|7570->4397|7598->4398|7656->4428|7685->4429|7721->4438|7770->4460|7798->4461|7892->4526|7922->4527|7959->4536|8020->4568|8050->4569|8080->4570|8458->4920|8488->4921|8525->4930|8554->4931|8617->4965|8647->4966|8684->4975|8757->5020|8786->5021|8845->5051|8875->5052|8912->5061|8962->5083|8991->5084|9195->5259|9225->5260|9263->5270|9398->5376|9428->5377|9468->5388|9552->5444|9582->5445|9676->5510|9706->5511|9746->5522|9890->5637|9920->5638|9962->5651|10196->5856|10226->5857|10263->5866|10293->5867|10331->5877|10360->5878|10710->6199|10740->6200|10774->6206|11104->6508|11133->6509|11219->6566|11249->6567|11328->6617|11358->6618|11392->6624|11456->6659|11486->6660|11647->6793|11676->6794|11900->7146|11933->7151|14492->9814|14534->9827|14580->10944|14624->10959|14809->11117|14838->11124|14871->11129
                  LINES: 26->1|29->1|31->3|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|42->14|44->16|44->16|44->16|44->16|46->18|46->18|46->18|48->20|48->20|48->20|49->21|49->21|49->21|50->22|50->22|50->22|51->23|51->23|51->23|52->24|52->24|52->24|53->25|53->25|53->25|54->26|54->26|54->26|55->27|56->28|56->28|56->28|56->28|57->29|57->29|57->29|58->30|58->30|58->30|59->31|59->31|59->31|61->33|61->33|61->33|62->34|62->34|62->34|64->36|64->36|64->36|67->39|67->39|67->39|69->42|74->47|75->48|75->48|76->49|76->49|76->49|76->49|76->49|76->49|77->50|77->50|77->50|77->50|77->50|78->51|78->51|81->54|81->54|82->55|82->55|82->55|82->55|85->58|85->58|86->59|86->59|87->60|87->60|88->61|89->62|89->62|90->63|90->63|91->64|92->65|92->65|97->70|97->70|98->71|98->71|98->71|98->71|114->87|114->87|115->88|115->88|117->90|117->90|118->91|119->92|119->92|120->93|120->93|121->94|122->95|122->95|127->100|127->100|128->101|128->101|128->101|128->101|139->112|139->112|140->113|140->113|142->115|142->115|143->116|144->117|144->117|145->118|145->118|146->119|147->120|147->120|155->128|155->128|157->130|158->131|158->131|159->132|161->134|161->134|164->137|164->137|165->138|167->140|167->140|168->141|172->145|172->145|173->146|173->146|175->148|175->148|186->159|186->159|187->160|190->163|190->163|195->168|195->168|195->168|195->168|196->169|196->169|196->169|198->171|198->171|207->186|208->187|251->231|252->232|254->249|255->250|265->260|265->260|266->261
                  -- GENERATED --
              */
          