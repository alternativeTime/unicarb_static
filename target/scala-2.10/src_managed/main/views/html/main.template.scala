
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.17*/("""

<!DOCTYPE html>
<html>
  <head>
    <title>UniCarbKB</title>
    <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*7.66*/routes/*7.72*/.Assets.at("/public", "stylesheets/bootstrap.min.css"))),format.raw/*7.126*/(""""> 
    <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*8.66*/routes/*8.72*/.Assets.at("/public", "stylesheets/customMarkdown.css"))),format.raw/*8.127*/("""">
    <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*9.66*/routes/*9.72*/.Assets.at("/public", "stylesheets/select2.css"))),format.raw/*9.120*/("""">
    <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*10.66*/routes/*10.72*/.Assets.at("/public", "stylesheets/unicarbkb.css"))),format.raw/*10.122*/("""">
    <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*11.66*/routes/*11.72*/.Assets.at("/public", "stylesheets/bootstrap-lightbox.css"))),format.raw/*11.131*/("""">
    <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*12.66*/routes/*12.72*/.Assets.at("/public", "stylesheets/bootstrap-image-gallery.min.css"))),format.raw/*12.140*/("""">

    <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*14.66*/routes/*14.72*/.Assets.at("/public", "stylesheets/docs.min.css"))),format.raw/*14.121*/("""">

    <link rel="icon" href=""""),_display_(Seq[Any](/*16.29*/routes/*16.35*/.Assets.at("/public", "favicon.ico"))),format.raw/*16.71*/("""" type="image/x-icon">

    <script src=""""),_display_(Seq[Any](/*18.19*/routes/*18.25*/.Assets.at("/public","javascripts/jquery.js"))),format.raw/*18.70*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*19.19*/routes/*19.25*/.Assets.at("/public","javascripts/jquery.ae.image.resize.min.js"))),format.raw/*19.90*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*20.19*/routes/*20.25*/.Assets.at("/public","javascripts/bootstrap.min.js"))),format.raw/*20.77*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*21.19*/routes/*21.25*/.Assets.at("/public","javascripts/jquery.tablesorter.min.js"))),format.raw/*21.86*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*22.19*/routes/*22.25*/.Assets.at("/public","javascripts/bootstrap-lightbox.min.js"))),format.raw/*22.86*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*23.19*/routes/*23.25*/.Assets.at("/public","javascripts/showdown.js"))),format.raw/*23.72*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*24.19*/routes/*24.25*/.Assets.at("/public","javascripts/google-jsapi.js"))),format.raw/*24.76*/(""""></script>
    """),format.raw/*25.87*/("""
    <script src=""""),_display_(Seq[Any](/*26.19*/routes/*26.25*/.Assets.at("/public","javascripts/jPages.js"))),format.raw/*26.70*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*27.19*/routes/*27.25*/.Assets.at("/public","javascripts/jquery.lazyload.js"))),format.raw/*27.79*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*28.19*/routes/*28.25*/.Assets.at("/public","javascripts/load-image.js"))),format.raw/*28.74*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*29.19*/routes/*29.25*/.Assets.at("/public","javascripts/bootstrap-image-gallery.min.js"))),format.raw/*29.91*/(""""></script>

    <script src=""""),_display_(Seq[Any](/*31.19*/routes/*31.25*/.Assets.at("/public","javascripts/select2.js"))),format.raw/*31.71*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*32.19*/routes/*32.25*/.Assets.at("/public","javascripts/application.js"))),format.raw/*32.75*/(""""></script>

    <script src=""""),_display_(Seq[Any](/*34.19*/routes/*34.25*/.Assets.at("/public","javascripts/workflows.js"))),format.raw/*34.73*/(""""></script>
    <script src="http://d3js.org/d3.v3.min.js"></script>
    
    <script src=""""),_display_(Seq[Any](/*37.19*/routes/*37.25*/.Assets.at("/public","javascripts/test/jira.js"))),format.raw/*37.73*/(""""></script>
    
    """),format.raw/*40.4*/("""
	
   
   

    <script>
      $(function() """),format.raw/*46.20*/("""{"""),format.raw/*46.21*/("""
        $( ".resizeme" ).aeImageResize("""),format.raw/*47.40*/("""{"""),format.raw/*47.41*/(""" height: 400, width: 280 """),format.raw/*47.66*/("""}"""),format.raw/*47.67*/(""");
        $( ".resizemeModal" ).aeImageResize("""),format.raw/*48.45*/("""{"""),format.raw/*48.46*/(""" height: 200, width: 200 """),format.raw/*48.71*/("""}"""),format.raw/*48.72*/(""");
      """),format.raw/*49.7*/("""}"""),format.raw/*49.8*/(""");
    </script>
    <script>
      $(document).ready(function()"""),format.raw/*52.35*/("""{"""),format.raw/*52.36*/("""
        $(".announceTaxStructures").click(function()"""),format.raw/*53.53*/("""{"""),format.raw/*53.54*/(""" // Click to only happen on announce links
          $("#Id").val($(this).data('id'));
          $('#taxDescription').modal('show');
        """),format.raw/*56.9*/("""}"""),format.raw/*56.10*/(""");
      """),format.raw/*57.7*/("""}"""),format.raw/*57.8*/(""");
      function closeDialog () """),format.raw/*58.31*/("""{"""),format.raw/*58.32*/("""
        $('#taxDescription').modal('hide'); 
      """),format.raw/*60.7*/("""}"""),format.raw/*60.8*/(""";
      function okClicked () """),format.raw/*61.29*/("""{"""),format.raw/*61.30*/("""
        closeDialog ();
      """),format.raw/*63.7*/("""}"""),format.raw/*63.8*/(""";

    </script>

    <script>
      $(document).ready(function()"""),format.raw/*68.35*/("""{"""),format.raw/*68.36*/("""
        $(".announce").click(function()"""),format.raw/*69.40*/("""{"""),format.raw/*69.41*/(""" // Click to only happen on announce links
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


        """),format.raw/*85.9*/("""}"""),format.raw/*85.10*/(""");
      """),format.raw/*86.7*/("""}"""),format.raw/*86.8*/(""");

      function closeDialog () """),format.raw/*88.31*/("""{"""),format.raw/*88.32*/("""
        $('#windowDescription').modal('hide'); 
      """),format.raw/*90.7*/("""}"""),format.raw/*90.8*/(""";
      function okClicked () """),format.raw/*91.29*/("""{"""),format.raw/*91.30*/("""
        closeDialog ();
      """),format.raw/*93.7*/("""}"""),format.raw/*93.8*/(""";
    </script>


    <script>
      $(document).ready(function()"""),format.raw/*98.35*/("""{"""),format.raw/*98.36*/("""
        $(".announce2").click(function()"""),format.raw/*99.41*/("""{"""),format.raw/*99.42*/(""" // Click to only happen on announce links
          $("#Id").val($(this).data('id'));
          $('#windowDescription').modal('show');

          var resultdiv = $(this).data('id');
          var replace = resultdiv.replace("[","");
          var replace = replace.replace("]","");

          $('p').html(replace).appendTo(document.myDiv);


        """),format.raw/*110.9*/("""}"""),format.raw/*110.10*/(""");
      """),format.raw/*111.7*/("""}"""),format.raw/*111.8*/(""");

      function closeDialog () """),format.raw/*113.31*/("""{"""),format.raw/*113.32*/("""
        $('#windowDescription').modal('hide');
      """),format.raw/*115.7*/("""}"""),format.raw/*115.8*/(""";
      function okClicked () """),format.raw/*116.29*/("""{"""),format.raw/*116.30*/("""
        closeDialog ();
      """),format.raw/*118.7*/("""}"""),format.raw/*118.8*/(""";
    </script>

    <script>

      /* Download lazy load plugin and make sure you add it in the head of your page. */

      /* when document is ready */
      $(function() """),format.raw/*126.20*/("""{"""),format.raw/*126.21*/("""

        /* initiate lazyload defining a custom event to trigger image loading  */
        $("ul li img").lazyload("""),format.raw/*129.33*/("""{"""),format.raw/*129.34*/("""
          event : "turnPage",
          effect : "fadeIn"
        """),format.raw/*132.9*/("""}"""),format.raw/*132.10*/(""");

        /* initiate plugin */
        $("div.holder").jPages("""),format.raw/*135.32*/("""{"""),format.raw/*135.33*/("""
          containerID : "itemContainer",
          animation   : "fadeInUp",
          callback    : function( pages, items )"""),format.raw/*138.49*/("""{"""),format.raw/*138.50*/("""
            /* lazy load current images */
            items.showing.find("img").trigger("turnPage");
            /* lazy load next page images */
            items.oncoming.find("img").trigger("turnPage");
          """),format.raw/*143.11*/("""}"""),format.raw/*143.12*/("""
        """),format.raw/*144.9*/("""}"""),format.raw/*144.10*/(""");

      """),format.raw/*146.7*/("""}"""),format.raw/*146.8*/(""");
    </script>
	
	<script type="text/javascript">
		var _gaq = _gaq || [];
	    var pluginUrl =
	    '//www.google-analytics.com/plugins/ga/inpage_linkid.js';
	    _gaq.push(['_require', 'inpage_linkid', pluginUrl]);
	    _gaq.push(['_setAccount', 'UA-28274077-1']);
	    _gaq.push(['_trackPageview']);

	  (function() """),format.raw/*157.16*/("""{"""),format.raw/*157.17*/("""
	    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
	    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
	    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
	  """),format.raw/*161.4*/("""}"""),format.raw/*161.5*/(""")();

	</script>

	<script>
	    (function(i,s,o,g,r,a,m)"""),format.raw/*166.30*/("""{"""),format.raw/*166.31*/("""i['GoogleAnalyticsObject']=r;i[r]=i[r]||function()"""),format.raw/*166.81*/("""{"""),format.raw/*166.82*/("""
	    (i[r].q=i[r].q||[]).push(arguments)"""),format.raw/*167.41*/("""}"""),format.raw/*167.42*/(""",i[r].l=1*new Date();a=s.createElement(o),
	    m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
	    """),format.raw/*169.6*/("""}"""),format.raw/*169.7*/(""")(window,document,'script','//www.google-analytics.com/analytics.js','ga');

	    ga('create', 'UA-28274077-2', 'unicarbkb.org');
	    ga('send', 'pageview');
	</script>

  </head>
  <body>

    """),format.raw/*184.16*/("""
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
	    """),format.raw/*229.78*/("""
            </ul>

          """),format.raw/*247.25*/("""
              </li>
            </ul>
          </div>


        </div>
      </div>
    </div>
    </header> 
    <section id="main" class="container-fluid content">
    """),_display_(Seq[Any](/*258.6*/content)),format.raw/*258.13*/("""
    </section>
  </body>
</html>
"""))}
    }
    
    def render(content:Html): play.api.templates.HtmlFormat.Appendable = apply(content)
    
    def f:((Html) => play.api.templates.HtmlFormat.Appendable) = (content) => apply(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 02 10:52:56 EST 2014
                    SOURCE: /Users/matthew/git/glycomics_working/app/views/main.scala.html
                    HASH: 1db3910ec2d54f789642819986ace1bbdf8b010f
                    MATRIX: 771->1|880->16|1043->144|1057->150|1133->204|1237->273|1251->279|1328->334|1431->402|1445->408|1515->456|1619->524|1634->530|1707->580|1811->648|1826->654|1908->713|2012->781|2027->787|2118->855|2223->924|2238->930|2310->979|2378->1011|2393->1017|2451->1053|2529->1095|2544->1101|2611->1146|2677->1176|2692->1182|2779->1247|2845->1277|2860->1283|2934->1335|3000->1365|3015->1371|3098->1432|3164->1462|3179->1468|3262->1529|3328->1559|3343->1565|3412->1612|3478->1642|3493->1648|3566->1699|3610->1797|3665->1816|3680->1822|3747->1867|3813->1897|3828->1903|3904->1957|3970->1987|3985->1993|4056->2042|4122->2072|4137->2078|4225->2144|4292->2175|4307->2181|4375->2227|4441->2257|4456->2263|4528->2313|4595->2344|4610->2350|4680->2398|4808->2490|4823->2496|4893->2544|4941->2878|5013->2922|5042->2923|5110->2963|5139->2964|5192->2989|5221->2990|5296->3037|5325->3038|5378->3063|5407->3064|5443->3073|5471->3074|5563->3138|5592->3139|5673->3192|5702->3193|5870->3334|5899->3335|5935->3344|5963->3345|6024->3378|6053->3379|6132->3431|6160->3432|6218->3462|6247->3463|6305->3494|6333->3495|6426->3560|6455->3561|6523->3601|6552->3602|7176->4199|7205->4200|7241->4209|7269->4210|7331->4244|7360->4245|7442->4300|7470->4301|7528->4331|7557->4332|7615->4363|7643->4364|7736->4429|7765->4430|7834->4471|7863->4472|8242->4823|8272->4824|8309->4833|8338->4834|8401->4868|8431->4869|8513->4923|8542->4924|8601->4954|8631->4955|8690->4986|8719->4987|8923->5162|8953->5163|9098->5279|9128->5280|9223->5347|9253->5348|9347->5413|9377->5414|9532->5540|9562->5541|9809->5759|9839->5760|9876->5769|9906->5770|9944->5780|9973->5781|10323->6102|10353->6103|10689->6411|10718->6412|10804->6469|10834->6470|10913->6520|10943->6521|11013->6562|11043->6563|11204->6696|11233->6697|11457->7049|14021->9717|14080->10847|14289->11020|14319->11027
                    LINES: 26->1|29->1|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|42->14|42->14|42->14|44->16|44->16|44->16|46->18|46->18|46->18|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|50->22|50->22|50->22|51->23|51->23|51->23|52->24|52->24|52->24|53->25|54->26|54->26|54->26|55->27|55->27|55->27|56->28|56->28|56->28|57->29|57->29|57->29|59->31|59->31|59->31|60->32|60->32|60->32|62->34|62->34|62->34|65->37|65->37|65->37|67->40|73->46|73->46|74->47|74->47|74->47|74->47|75->48|75->48|75->48|75->48|76->49|76->49|79->52|79->52|80->53|80->53|83->56|83->56|84->57|84->57|85->58|85->58|87->60|87->60|88->61|88->61|90->63|90->63|95->68|95->68|96->69|96->69|112->85|112->85|113->86|113->86|115->88|115->88|117->90|117->90|118->91|118->91|120->93|120->93|125->98|125->98|126->99|126->99|137->110|137->110|138->111|138->111|140->113|140->113|142->115|142->115|143->116|143->116|145->118|145->118|153->126|153->126|156->129|156->129|159->132|159->132|162->135|162->135|165->138|165->138|170->143|170->143|171->144|171->144|173->146|173->146|184->157|184->157|188->161|188->161|193->166|193->166|193->166|193->166|194->167|194->167|196->169|196->169|205->184|249->229|252->247|263->258|263->258
                    -- GENERATED --
                */
            