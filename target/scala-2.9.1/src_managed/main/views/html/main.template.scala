
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
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(content: Html):play.api.templates.Html = {
        _display_ {

Seq(format.raw/*1.17*/("""

<!DOCTYPE html>
<html>
  <head>
    <title>UniCarbKB</title>
    <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq(/*7.66*/routes/*7.72*/.Assets.at("/public", "stylesheets/bootstrap.ori.min.css"))),format.raw/*7.130*/(""""> 
    <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq(/*8.66*/routes/*8.72*/.Assets.at("/public", "stylesheets/style.css"))),format.raw/*8.118*/(""""> 
    <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq(/*9.66*/routes/*9.72*/.Assets.at("/public", "stylesheets/customMarkdown.css"))),format.raw/*9.127*/("""">
    <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq(/*10.66*/routes/*10.72*/.Assets.at("/public", "stylesheets/jquery.lightbox-0.5.css"))),format.raw/*10.132*/("""">
    <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq(/*11.66*/routes/*11.72*/.Assets.at("/public", "stylesheets/stylesnewlayout.css"))),format.raw/*11.128*/("""">

    <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq(/*13.66*/routes/*13.72*/.Assets.at("/public", "stylesheets/select2.css"))),format.raw/*13.120*/("""">

    <link rel="icon" href=""""),_display_(Seq(/*15.29*/routes/*15.35*/.Assets.at("/public", "favicon.ico"))),format.raw/*15.71*/("""" type="image/x-icon">

    """),format.raw/*17.94*/("""
    <script src=""""),_display_(Seq(/*18.19*/routes/*18.25*/.Assets.at("/public","javascripts/jquery.js"))),format.raw/*18.70*/(""""></script>
    """),format.raw/*19.104*/("""
    <script src=""""),_display_(Seq(/*20.19*/routes/*20.25*/.Assets.at("/public","javascripts/jquery.ae.image.resize.min.js"))),format.raw/*20.90*/(""""></script>
    <script src=""""),_display_(Seq(/*21.19*/routes/*21.25*/.Assets.at("/public","javascripts/bootstrap.min.js"))),format.raw/*21.77*/(""""></script>
    <script src=""""),_display_(Seq(/*22.19*/routes/*22.25*/.Assets.at("/public","javascripts/jquery.tablesorter.min.js"))),format.raw/*22.86*/(""""></script>
    <script src=""""),_display_(Seq(/*23.19*/routes/*23.25*/.Assets.at("/public","javascripts/jquery.lightbox-0.5.min.js"))),format.raw/*23.87*/(""""></script>
    <script src=""""),_display_(Seq(/*24.19*/routes/*24.25*/.Assets.at("/public","javascripts/jquery.lightbox-0.5.pack.js"))),format.raw/*24.88*/(""""></script>
    <script src=""""),_display_(Seq(/*25.19*/routes/*25.25*/.Assets.at("/public","javascripts/showdown.js"))),format.raw/*25.72*/(""""></script>
    <script src=""""),_display_(Seq(/*26.19*/routes/*26.25*/.Assets.at("/public","javascripts/google-jsapi.js"))),format.raw/*26.76*/(""""></script>
    """),format.raw/*27.87*/("""
    <script src=""""),_display_(Seq(/*28.19*/routes/*28.25*/.Assets.at("/public","javascripts/jPages.js"))),format.raw/*28.70*/(""""></script>
    <script src=""""),_display_(Seq(/*29.19*/routes/*29.25*/.Assets.at("/public","javascripts/jquery.lazyload.js"))),format.raw/*29.79*/(""""></script>

    <script src=""""),_display_(Seq(/*31.19*/routes/*31.25*/.Assets.at("/public","javascripts/select2.js"))),format.raw/*31.71*/(""""></script>
    <script src=""""),_display_(Seq(/*32.19*/routes/*32.25*/.Assets.at("/public","javascripts/application.js"))),format.raw/*32.75*/(""""></script>


    <script>
      $(function() """),format.raw("""{"""),format.raw/*36.21*/("""
        $( ".resizeme" ).aeImageResize("""),format.raw("""{"""),format.raw/*37.41*/(""" height: 400, width: 280 """),format.raw("""}"""),format.raw/*37.67*/(""");
        $( ".resizemeModal" ).aeImageResize("""),format.raw("""{"""),format.raw/*38.46*/(""" height: 200, width: 200 """),format.raw("""}"""),format.raw/*38.72*/(""");
      """),format.raw("""}"""),format.raw/*39.8*/(""");
    </script>
    <script>
      $(document).ready(function()"""),format.raw("""{"""),format.raw/*42.36*/("""
        $(".announceTaxStructures").click(function()"""),format.raw("""{"""),format.raw/*43.54*/(""" // Click to only happen on announce links
          $("#Id").val($(this).data('id'));
          $('#taxDescription').modal('show');
        """),format.raw("""}"""),format.raw/*46.10*/(""");
      """),format.raw("""}"""),format.raw/*47.8*/(""");
      function closeDialog () """),format.raw("""{"""),format.raw/*48.32*/("""
        $('#taxDescription').modal('hide'); 
      """),format.raw("""}"""),format.raw/*50.8*/(""";
      function okClicked () """),format.raw("""{"""),format.raw/*51.30*/("""
        closeDialog ();
      """),format.raw("""}"""),format.raw/*53.8*/(""";

    </script>

    <script>
      $(document).ready(function()"""),format.raw("""{"""),format.raw/*58.36*/("""
        $(".announce").click(function()"""),format.raw("""{"""),format.raw/*59.41*/(""" // Click to only happen on announce links
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


        """),format.raw("""}"""),format.raw/*75.10*/(""");
      """),format.raw("""}"""),format.raw/*76.8*/(""");

      function closeDialog () """),format.raw("""{"""),format.raw/*78.32*/("""
        $('#windowDescription').modal('hide'); 
      """),format.raw("""}"""),format.raw/*80.8*/(""";
      function okClicked () """),format.raw("""{"""),format.raw/*81.30*/("""
        closeDialog ();
      """),format.raw("""}"""),format.raw/*83.8*/(""";
    </script>


    <script>
      $(document).ready(function()"""),format.raw("""{"""),format.raw/*88.36*/("""
        $(".announce2").click(function()"""),format.raw("""{"""),format.raw/*89.42*/(""" // Click to only happen on announce links
          $("#Id").val($(this).data('id'));
          $('#windowDescription').modal('show');

          var resultdiv = $(this).data('id');
          var replace = resultdiv.replace("[","");
          var replace = replace.replace("]","");

          $('p').html(replace).appendTo(document.myDiv);


        """),format.raw("""}"""),format.raw/*100.10*/(""");
      """),format.raw("""}"""),format.raw/*101.8*/(""");

      function closeDialog () """),format.raw("""{"""),format.raw/*103.32*/("""
        $('#windowDescription').modal('hide');
      """),format.raw("""}"""),format.raw/*105.8*/(""";
      function okClicked () """),format.raw("""{"""),format.raw/*106.30*/("""
        closeDialog ();
      """),format.raw("""}"""),format.raw/*108.8*/(""";
    </script>

    <script>

      /* Download lazy load plugin and make sure you add it in the head of your page. */

      /* when document is ready */
      $(function() """),format.raw("""{"""),format.raw/*116.21*/("""

        /* initiate lazyload defining a custom event to trigger image loading  */
        $("ul li img").lazyload("""),format.raw("""{"""),format.raw/*119.34*/("""
          event : "turnPage",
          effect : "fadeIn"
        """),format.raw("""}"""),format.raw/*122.10*/(""");

        /* initiate plugin */
        $("div.holder").jPages("""),format.raw("""{"""),format.raw/*125.33*/("""
          containerID : "itemContainer",
          animation   : "fadeInUp",
          callback    : function( pages, items )"""),format.raw("""{"""),format.raw/*128.50*/("""
            /* lazy load current images */
            items.showing.find("img").trigger("turnPage");
            /* lazy load next page images */
            items.oncoming.find("img").trigger("turnPage");
          """),format.raw("""}"""),format.raw/*133.12*/("""
        """),format.raw("""}"""),format.raw/*134.10*/(""");

      """),format.raw("""}"""),format.raw/*136.8*/(""");
    </script>

  </head>
  <body>

    """),format.raw/*148.16*/("""
    <header>
    <div class="topbar">
      <div class="topbar-inner">
        <div class="container-fluid">
          <a class="brand" href="/">UniCarbKB</a>
          <ul class="nav">
            <li class=""><a href="/">Home</a></li>
            """),format.raw/*158.21*/("""
	    <li><a href="/browse">Search</a></li>
	    <li><a href="/references">References</a></li>
	    <li><a href="/builder">Glycan Builder</a></li>
          </ul>
          """),format.raw/*163.79*/("""
          <div id="headersearch" class="pull-right">
	    <ul>
       	    <li><a href="#about">About</a></li>
            <li><a href="#contact">Contact</a></li>
	    </ul>
          """),format.raw/*184.25*/("""
              </li>
            </ul>
          </div>


        </div>
      </div>
    </div>
    </header> 
    <section id="main" class="container-fluid content">
    """),_display_(Seq(/*195.6*/content)),format.raw/*195.13*/("""
    </section>
  </body>
</html>
"""))}
    }
    
    def render(content:Html) = apply(content)
    
    def f:((Html) => play.api.templates.Html) = (content) => apply(content)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Dec 18 08:54:50 EST 2012
                    SOURCE: /home/matthew/Documents/play-app/office/glycomics/app/views/main.scala.html
                    HASH: 9ceb7430950eed2a783c06feebdcd4bd03340d95
                    MATRIX: 752->1|839->16|997->144|1011->150|1091->208|1190->277|1204->283|1272->329|1371->398|1385->404|1462->459|1561->527|1576->533|1659->593|1758->661|1773->667|1852->723|1952->792|1967->798|2038->846|2101->878|2116->884|2174->920|2230->1037|2280->1056|2295->1062|2362->1107|2407->1222|2457->1241|2472->1247|2559->1312|2620->1342|2635->1348|2709->1400|2770->1430|2785->1436|2868->1497|2929->1527|2944->1533|3028->1595|3089->1625|3104->1631|3189->1694|3250->1724|3265->1730|3334->1777|3395->1807|3410->1813|3483->1864|3527->1962|3577->1981|3592->1987|3659->2032|3720->2062|3735->2068|3811->2122|3873->2153|3888->2159|3956->2205|4017->2235|4032->2241|4104->2291|4198->2338|4286->2379|4359->2405|4454->2453|4527->2479|4583->2489|4695->2554|4796->2608|4985->2750|5041->2760|5122->2794|5221->2847|5299->2878|5377->2910|5490->2976|5578->3017|6223->3615|6279->3625|6361->3660|6463->3716|6541->3747|6619->3779|6732->3845|6821->3887|7221->4239|7278->4249|7361->4284|7463->4339|7542->4370|7621->4402|7845->4578|8010->4695|8126->4763|8240->4829|8415->4956|8682->5175|8740->5185|8798->5196|8869->5395|9148->5814|9350->6055|9564->7340|9768->7513|9798->7520
                    LINES: 27->1|30->1|36->7|36->7|36->7|37->8|37->8|37->8|38->9|38->9|38->9|39->10|39->10|39->10|40->11|40->11|40->11|42->13|42->13|42->13|44->15|44->15|44->15|46->17|47->18|47->18|47->18|48->19|49->20|49->20|49->20|50->21|50->21|50->21|51->22|51->22|51->22|52->23|52->23|52->23|53->24|53->24|53->24|54->25|54->25|54->25|55->26|55->26|55->26|56->27|57->28|57->28|57->28|58->29|58->29|58->29|60->31|60->31|60->31|61->32|61->32|61->32|65->36|66->37|66->37|67->38|67->38|68->39|71->42|72->43|75->46|76->47|77->48|79->50|80->51|82->53|87->58|88->59|104->75|105->76|107->78|109->80|110->81|112->83|117->88|118->89|129->100|130->101|132->103|134->105|135->106|137->108|145->116|148->119|151->122|154->125|157->128|162->133|163->134|165->136|171->148|179->158|184->163|190->184|201->195|201->195
                    -- GENERATED --
                */
            