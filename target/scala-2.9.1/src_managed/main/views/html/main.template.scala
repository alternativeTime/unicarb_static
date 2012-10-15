
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
"""),format.raw/*12.100*/("""
	<script src=""""),_display_(Seq(/*13.16*/routes/*13.22*/.Assets.at("/public","javascripts/jquery.ae.image.resize.min.js"))),format.raw/*13.87*/(""""></script>
"""),format.raw/*15.4*/("""
	<script src=""""),_display_(Seq(/*16.16*/routes/*16.22*/.Assets.at("/public","javascripts/bootstrap.min.js"))),format.raw/*16.74*/(""""></script>
	<script src=""""),_display_(Seq(/*17.16*/routes/*17.22*/.Assets.at("/public","javascripts/jquery.tablesorter.min.js"))),format.raw/*17.83*/(""""></script>
	<script src=""""),_display_(Seq(/*18.16*/routes/*18.22*/.Assets.at("/public","javascripts/jquery.lightbox-0.5.min.js"))),format.raw/*18.84*/(""""></script>
	<script src=""""),_display_(Seq(/*19.16*/routes/*19.22*/.Assets.at("/public","javascripts/jquery.lightbox-0.5.pack.js"))),format.raw/*19.85*/(""""></script>
	<script src=""""),_display_(Seq(/*20.16*/routes/*20.22*/.Assets.at("/public","javascripts/showdown.js"))),format.raw/*20.69*/(""""></script>
	<script src=""""),_display_(Seq(/*21.16*/routes/*21.22*/.Assets.at("/public","javascripts/google-jsapi.js"))),format.raw/*21.73*/(""""></script>
"""),format.raw/*22.83*/("""
	<script src=""""),_display_(Seq(/*23.16*/routes/*23.22*/.Assets.at("/public","javascripts/jPages.js"))),format.raw/*23.67*/(""""></script>
	<script src=""""),_display_(Seq(/*24.16*/routes/*24.22*/.Assets.at("/public","javascripts/jquery.lazyload.js"))),format.raw/*24.76*/(""""></script>

	
	
	<script>
    		$(function() """),format.raw("""{"""),format.raw/*29.21*/("""
      		$( ".resizeme" ).aeImageResize("""),format.raw("""{"""),format.raw/*30.41*/(""" height: 400, width: 280 """),format.raw("""}"""),format.raw/*30.67*/(""");
		$( ".resizemeModal" ).aeImageResize("""),format.raw("""{"""),format.raw/*31.40*/(""" height: 200, width: 200 """),format.raw("""}"""),format.raw/*31.66*/(""");
    		"""),format.raw("""}"""),format.raw/*32.8*/(""");
  	</script>
	<script>
		$(document).ready(function()"""),format.raw("""{"""),format.raw/*35.32*/("""
   			$(".announceTaxStructures").click(function()"""),format.raw("""{"""),format.raw/*36.52*/(""" // Click to only happen on announce links
     			$("#Id").val($(this).data('id'));
     				$('#taxDescription').modal('show');
		"""),format.raw("""}"""),format.raw/*39.4*/(""");
		"""),format.raw("""}"""),format.raw/*40.4*/(""");
		function closeDialog () """),format.raw("""{"""),format.raw/*41.28*/("""
                        $('#taxDescription').modal('hide'); 
                                """),format.raw("""}"""),format.raw/*43.34*/(""";
                function okClicked () """),format.raw("""{"""),format.raw/*44.40*/("""
                         closeDialog ();
                                """),format.raw("""}"""),format.raw/*46.34*/(""";

	</script>

	<script>
			$(document).ready(function()"""),format.raw("""{"""),format.raw/*51.33*/("""
   $(".announce").click(function()"""),format.raw("""{"""),format.raw/*52.36*/(""" // Click to only happen on announce links
     $("#Id").val($(this).data('id'));
     $('#windowDescription').modal('show');

var result = $(this).data('id');
	var replace = result.replace("[","");
	var replace = replace.replace("]","");
	var replace = replace.replace(",","");
	var replace = replace.replace("null","");
	var replace = replace.replace(" >  > ","");

	$('p').html(replace).appendTo(document.myDiv);


   """),format.raw("""}"""),format.raw/*66.5*/(""");
"""),format.raw("""}"""),format.raw/*67.2*/(""");

                        function closeDialog () """),format.raw("""{"""),format.raw/*69.50*/("""
                                $('#windowDescription').modal('hide'); 
                                """),format.raw("""}"""),format.raw/*71.34*/(""";
                        function okClicked () """),format.raw("""{"""),format.raw/*72.48*/("""
                                closeDialog ();
                                """),format.raw("""}"""),format.raw/*74.34*/(""";
    	</script>


<script>
                        $(document).ready(function()"""),format.raw("""{"""),format.raw/*79.54*/("""
   $(".announce2").click(function()"""),format.raw("""{"""),format.raw/*80.37*/(""" // Click to only happen on announce links
     $("#Id").val($(this).data('id'));
     $('#windowDescription').modal('show');

	var resultdiv = $(this).data('id');
	 var replace = resultdiv.replace("[","");
        var replace = replace.replace("]","");

	$('p').html(replace).appendTo(document.myDiv);


   """),format.raw("""}"""),format.raw/*91.5*/(""");
"""),format.raw("""}"""),format.raw/*92.2*/(""");

                        function closeDialog () """),format.raw("""{"""),format.raw/*94.50*/("""
                                $('#windowDescription').modal('hide');
                                """),format.raw("""}"""),format.raw/*96.34*/(""";
                        function okClicked () """),format.raw("""{"""),format.raw/*97.48*/("""
                                closeDialog ();
                                """),format.raw("""}"""),format.raw/*99.34*/(""";
        </script>

<script>

/* Download lazy load plugin and make sure you add it in the head of your page. */

/* when document is ready */
$(function() """),format.raw("""{"""),format.raw/*107.15*/("""
    
    /* initiate lazyload defining a custom event to trigger image loading  */
    $("ul li img").lazyload("""),format.raw("""{"""),format.raw/*110.30*/("""
        event : "turnPage",
        effect : "fadeIn"
    """),format.raw("""}"""),format.raw/*113.6*/(""");

    /* initiate plugin */
    $("div.holder").jPages("""),format.raw("""{"""),format.raw/*116.29*/("""
        containerID : "itemContainer",
        animation   : "fadeInUp",
        callback    : function( pages, items )"""),format.raw("""{"""),format.raw/*119.48*/("""
            /* lazy load current images */
            items.showing.find("img").trigger("turnPage");
            /* lazy load next page images */
            items.oncoming.find("img").trigger("turnPage");
        """),format.raw("""}"""),format.raw/*124.10*/("""
    """),format.raw("""}"""),format.raw/*125.6*/(""");

"""),format.raw("""}"""),format.raw/*127.2*/(""");
</script>

    </head>
    <body>
        
        """),format.raw/*139.20*/("""
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
	  <ul>
            <li class="dropdown" id="menu1">
		<a class="dropdown-toggle" data-toggle="dropdown" href="#menu1">Browse <b class="caret"></b></a> 
		"""),format.raw/*153.58*/("""
	    </li>
          </ul>
          """),format.raw/*156.79*/("""
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
            """),_display_(Seq(/*184.14*/content)),format.raw/*184.21*/("""
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
                    DATE: Fri Oct 12 14:39:33 EST 2012
                    SOURCE: /home/matthew/Documents/play-app/tmp/glycomics/app/views/main.scala.html
                    HASH: 954e3581074cfd262bc93d4c8c7b3c2d304bd6fa
                    MATRIX: 752->1|839->16|1001->148|1015->154|1095->212|1192->279|1206->285|1274->331|1370->397|1384->403|1461->458|1557->523|1572->529|1655->589|1771->775|1818->791|1833->797|1920->862|1959->978|2006->994|2021->1000|2095->1052|2153->1079|2168->1085|2251->1146|2309->1173|2324->1179|2408->1241|2466->1268|2481->1274|2566->1337|2624->1364|2639->1370|2708->1417|2766->1444|2781->1450|2854->1501|2894->1595|2941->1611|2956->1617|3023->1662|3081->1689|3096->1695|3172->1749|3266->1796|3354->1837|3427->1863|3516->1905|3589->1931|3645->1941|3749->1998|3848->2050|4027->2183|4079->2189|4156->2219|4298->2314|4386->2355|4508->2430|4612->2487|4695->2523|5163->2945|5213->2949|5313->3002|5466->3108|5562->3157|5691->3239|5819->3320|5903->3357|6258->3666|6308->3670|6408->3723|6560->3828|6656->3877|6785->3959|6991->4117|7152->4230|7259->4290|7365->4348|7534->4469|7799->4686|7852->4692|7904->4697|7987->4959|8518->5516|8585->5622|9869->6874|9899->6881
                    LINES: 27->1|30->1|36->7|36->7|36->7|37->8|37->8|37->8|38->9|38->9|38->9|39->10|39->10|39->10|41->12|42->13|42->13|42->13|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|50->22|51->23|51->23|51->23|52->24|52->24|52->24|57->29|58->30|58->30|59->31|59->31|60->32|63->35|64->36|67->39|68->40|69->41|71->43|72->44|74->46|79->51|80->52|94->66|95->67|97->69|99->71|100->72|102->74|107->79|108->80|119->91|120->92|122->94|124->96|125->97|127->99|135->107|138->110|141->113|144->116|147->119|152->124|153->125|155->127|161->139|175->153|178->156|206->184|206->184
                    -- GENERATED --
                */
            