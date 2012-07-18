
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
        <title>Reference</title>
	 <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq(/*7.64*/routes/*7.70*/.Assets.at("/public", "stylesheets/bootstrap.ori.min.css"))),format.raw/*7.128*/(""""> 
	 <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq(/*8.64*/routes/*8.70*/.Assets.at("/public", "stylesheets/style.css"))),format.raw/*8.116*/(""""> 
	<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq(/*9.63*/routes/*9.69*/.Assets.at("/public", "stylesheets/customMarkdown.css"))),format.raw/*9.124*/("""">
	<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq(/*10.63*/routes/*10.69*/.Assets.at("/public", "stylesheets/jquery.lightbox-0.5.css"))),format.raw/*10.129*/("""">
	<script src="http://static.scripting.com/github/bootstrap2/js/jquery.js"></script>
	<script src="http://static.scripting.com/github/bootstrap2/js/bootstrap-modal.js"></script>
	<script src=""""),_display_(Seq(/*13.16*/routes/*13.22*/.Assets.at("/public","javascripts/jquery.ae.image.resize.min.js"))),format.raw/*13.87*/(""""></script>
	<script src="http://designshack.net/tutorialexamples/masonry/demos/jquery.wookmark.js"></script>
	<script src=""""),_display_(Seq(/*15.16*/routes/*15.22*/.Assets.at("/public","javascripts/bootstrap.min.js"))),format.raw/*15.74*/(""""></script>
	<script src=""""),_display_(Seq(/*16.16*/routes/*16.22*/.Assets.at("/public","javascripts/jquery.tablesorter.min.js"))),format.raw/*16.83*/(""""></script>
	<script src=""""),_display_(Seq(/*17.16*/routes/*17.22*/.Assets.at("/public","javascripts/jquery.lightbox-0.5.min.js"))),format.raw/*17.84*/(""""></script>
	<script src=""""),_display_(Seq(/*18.16*/routes/*18.22*/.Assets.at("/public","javascripts/jquery.lightbox-0.5.pack.js"))),format.raw/*18.85*/(""""></script>
	<script src=""""),_display_(Seq(/*19.16*/routes/*19.22*/.Assets.at("/public","javascripts/showdown.js"))),format.raw/*19.69*/(""""></script>
	<script src=""""),_display_(Seq(/*20.16*/routes/*20.22*/.Assets.at("/public","javascripts/google-jsapi.js"))),format.raw/*20.73*/(""""></script>
"""),format.raw/*21.83*/("""
	<script src=""""),_display_(Seq(/*22.16*/routes/*22.22*/.Assets.at("/public","javascripts/jPages.js"))),format.raw/*22.67*/(""""></script>
	<script src=""""),_display_(Seq(/*23.16*/routes/*23.22*/.Assets.at("/public","javascripts/jquery.lazyload.js"))),format.raw/*23.76*/(""""></script>

	
	
	<script>
    		$(function() """),format.raw("""{"""),format.raw/*28.21*/("""
      		$( ".resizeme" ).aeImageResize("""),format.raw("""{"""),format.raw/*29.41*/(""" height: 400, width: 280 """),format.raw("""}"""),format.raw/*29.67*/(""");
		$( ".resizemeModal" ).aeImageResize("""),format.raw("""{"""),format.raw/*30.40*/(""" height: 200, width: 200 """),format.raw("""}"""),format.raw/*30.66*/(""");
    		"""),format.raw("""}"""),format.raw/*31.8*/(""");
  	</script>
	<script>
		$(document).ready(function()"""),format.raw("""{"""),format.raw/*34.32*/("""
   			$(".announceTaxStructures").click(function()"""),format.raw("""{"""),format.raw/*35.52*/(""" // Click to only happen on announce links
     			$("#Id").val($(this).data('id'));
     				$('#taxDescription').modal('show');
		"""),format.raw("""}"""),format.raw/*38.4*/(""");
		"""),format.raw("""}"""),format.raw/*39.4*/(""");
		function closeDialog () """),format.raw("""{"""),format.raw/*40.28*/("""
                        $('#taxDescription').modal('hide'); 
                                """),format.raw("""}"""),format.raw/*42.34*/(""";
                function okClicked () """),format.raw("""{"""),format.raw/*43.40*/("""
                         closeDialog ();
                                """),format.raw("""}"""),format.raw/*45.34*/(""";

	</script>

	<script>
			$(document).ready(function()"""),format.raw("""{"""),format.raw/*50.33*/("""
   $(".announce").click(function()"""),format.raw("""{"""),format.raw/*51.36*/(""" // Click to only happen on announce links
     $("#Id").val($(this).data('id'));
     $('#windowDescription').modal('show');

var result = $(this).data('id');
	var replace = result.replace("[","");
	var replace = replace.replace("]","");
	var replace = replace.replace(",","");
	var replace = replace.replace("null","");
	var replace = replace.replace(" >  > ","");

	$('p').html(replace).appendTo(document.myDiv);


   """),format.raw("""}"""),format.raw/*65.5*/(""");
"""),format.raw("""}"""),format.raw/*66.2*/(""");

                        function closeDialog () """),format.raw("""{"""),format.raw/*68.50*/("""
                                $('#windowDescription').modal('hide'); 
                                """),format.raw("""}"""),format.raw/*70.34*/(""";
                        function okClicked () """),format.raw("""{"""),format.raw/*71.48*/("""
                                closeDialog ();
                                """),format.raw("""}"""),format.raw/*73.34*/(""";
    	</script>

<script>

/* Download lazy load plugin and make sure you add it in the head of your page. */

/* when document is ready */
$(function() """),format.raw("""{"""),format.raw/*81.15*/("""
    
    /* initiate lazyload defining a custom event to trigger image loading  */
    $("ul li img").lazyload("""),format.raw("""{"""),format.raw/*84.30*/("""
        event : "turnPage",
        effect : "fadeIn"
    """),format.raw("""}"""),format.raw/*87.6*/(""");

    /* initiate plugin */
    $("div.holder").jPages("""),format.raw("""{"""),format.raw/*90.29*/("""
        containerID : "itemContainer",
        animation   : "fadeInUp",
        callback    : function( pages, items )"""),format.raw("""{"""),format.raw/*93.48*/("""
            /* lazy load current images */
            items.showing.find("img").trigger("turnPage");
            /* lazy load next page images */
            items.oncoming.find("img").trigger("turnPage");
        """),format.raw("""}"""),format.raw/*98.10*/("""
    """),format.raw("""}"""),format.raw/*99.6*/(""");

"""),format.raw("""}"""),format.raw/*101.2*/(""");
</script>

    </head>
    <body>
        
        """),format.raw/*113.20*/("""
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
          """),format.raw/*124.79*/("""
	  <div class="pull-right">
            <form action="">
            <input type="text" placeholder="To search proteins, tax, source">
            </form>
         	<ul>
           	<li class="dropdown" id="menu1">
             	<a class="dropdown-toggle" data-toggle="dropdown" href="#menu1">
               	Login <b class="caret"></b></a>
             	<div class="dropdown-menu">
               	<form style="margin: 0px" accept-charset="UTF-8" action="/sessions" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="4L/A2ZMYkhTD3IiNDMTuB/fhPRvyCNGEsaZocUUpw40=" /></div>
                 <fieldset class='textbox' style="padding:10px">
                   <input style="margin-top: 8px" type="text" placeholder="Username" />
                   <input style="margin-top: 8px" type="password" placeholder="Passsword" />
                   <input class="btn-primary" name="commit" type="submit" value="Log In" />
                 </fieldset>
              	</form>
             	</div>
           	</li>
        	</ul>
          </div>


        </div>
      </div>
    </div>
       </header> 
        <section id="main">
            """),_display_(Seq(/*152.14*/content)),format.raw/*152.21*/("""
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
                    DATE: Thu Jul 12 13:36:38 EST 2012
                    SOURCE: /home/matthew/Documents/play-app/tmp/computer-database/app/views/main.scala.html
                    HASH: c846cd9599de0f991c094eef441c08735120e497
                    MATRIX: 752->1|839->16|1001->148|1015->154|1095->212|1192->279|1206->285|1274->331|1370->397|1384->403|1461->458|1557->523|1572->529|1655->589|1881->784|1896->790|1983->855|2139->980|2154->986|2228->1038|2286->1065|2301->1071|2384->1132|2442->1159|2457->1165|2541->1227|2599->1254|2614->1260|2699->1323|2757->1350|2772->1356|2841->1403|2899->1430|2914->1436|2987->1487|3027->1581|3074->1597|3089->1603|3156->1648|3214->1675|3229->1681|3305->1735|3399->1782|3487->1823|3560->1849|3649->1891|3722->1917|3778->1927|3882->1984|3981->2036|4160->2169|4212->2175|4289->2205|4431->2300|4519->2341|4641->2416|4745->2473|4828->2509|5296->2931|5346->2935|5446->2988|5599->3094|5695->3143|5824->3225|6026->3380|6186->3493|6292->3553|6397->3611|6565->3732|6829->3949|6881->3955|6933->3960|7016->4222|7402->4647|8686->5899|8716->5906
                    LINES: 27->1|30->1|36->7|36->7|36->7|37->8|37->8|37->8|38->9|38->9|38->9|39->10|39->10|39->10|42->13|42->13|42->13|44->15|44->15|44->15|45->16|45->16|45->16|46->17|46->17|46->17|47->18|47->18|47->18|48->19|48->19|48->19|49->20|49->20|49->20|50->21|51->22|51->22|51->22|52->23|52->23|52->23|57->28|58->29|58->29|59->30|59->30|60->31|63->34|64->35|67->38|68->39|69->40|71->42|72->43|74->45|79->50|80->51|94->65|95->66|97->68|99->70|100->71|102->73|110->81|113->84|116->87|119->90|122->93|127->98|128->99|130->101|136->113|147->124|175->152|175->152
                    -- GENERATED --
                */
            