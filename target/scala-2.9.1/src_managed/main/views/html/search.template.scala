
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
object search extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq(format.raw/*1.1*/("""<html class="hoverable webkit webkit-chrome-5 signedOut" lang="en"><!--<![endif]--><head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>UniCarb Search</title>
  
  <meta name="viewport" content="width=device-width,initial-scale=1">
  <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq(/*7.64*/routes/*7.70*/.Assets.at("/public", "stylesheets/reset.gz.css"))),format.raw/*7.119*/("""">
  <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq(/*8.64*/routes/*8.70*/.Assets.at("/public", "stylesheets/application.gz.css"))),format.raw/*8.125*/("""">
   <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq(/*9.65*/routes/*9.71*/.Assets.at("/public", "stylesheets/bootstrapnewlayout.css"))),format.raw/*9.130*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq(/*10.70*/routes/*10.76*/.Assets.at("/public", "stylesheets/stylesnewlayout.css"))),format.raw/*10.132*/("""">
         <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq(/*11.71*/routes/*11.77*/.Assets.at("/public", "stylesheets/bootstrap-responsive.css"))),format.raw/*11.138*/("""">

	<script type="text/javascript"> 
        var vaadin = """),format.raw("""{"""),format.raw/*14.23*/("""
                vaadinConfigurations: """),format.raw("""{"""),format.raw/*15.40*/("""
                        'fb' :"""),format.raw("""{"""),format.raw/*16.32*/("""
                                appUri:'/GlycanBuilder', 
                                pathInfo: '/GlycanBuilder', 
                                themeUri: '/GlycanBuilder/VAADIN/themes/ucdb_2011theme', 
                                versionInfo : """),format.raw("""{"""),format.raw/*20.48*/("""vaadinVersion:"6.0.0-INTERNAL-NONVERSIONED-DEBUG-BUILD",applicationVersion:"NONVERSIONED""""),format.raw("""}"""),format.raw/*20.138*/("""
                        """),format.raw("""}"""),format.raw/*21.26*/("""
                        
                """),format.raw("""}"""),format.raw("""}"""),format.raw/*23.19*/(""";
	</script> 
  
	<script language='javascript' src='GlycanBuilder/VAADIN/widgetsets/ac.uk.icl.dell.vaadin.glycanbuilder.widgetset.GlycanbuilderWidgetset/ac.uk.icl.dell.vaadin.glycanbuilder.widgetset.GlycanbuilderWidgetset.nocache.js'></script> 
<link rel="stylesheet" type="text/css" href="/GlycanBuilder/VAADIN/themes/ucdb_2011theme/styles.css"/>
          
</head>
<body onLoad="Write()">

<header>
        <div class="topbar">
      <div class="topbar-inner">
        <div class="container">
          <a class="brand" href="">UniCarbKB</a>
          <ul class="nav">
            <li class="active"><a href="#">Home</a></li>
            <li><a href="#about">About</a></li>
            <li><a href="#contact">Contact</a></li>
          </ul>
          """),format.raw/*42.79*/("""
          """),format.raw/*48.12*/("""

        </div>
      </div>
    </div>
</header>


<div id="splash">
"""),format.raw/*69.4*/("""
<div class="blue">
  <div class="inner">

    <h3 class="third">
      
      <strong>Glycan Builder</strong>
      An intuitive interface for building and displaying glycan structures using a collection of notation formats.
    </h3>

    <h3 class="third">
      
      <strong>Find Structures</strong>
      Build your glycan or epitope and search the UniCarbKB structure database. This new design is built using new technologies and discussed by the developer <a href="https://bitbucket.org/daviddamerell/glycanbuilderv/wiki/Home">David Damerell</a>
    </h3>

    <h3 class="third last">
      
      <strong>Publication</strong>
      The GlycanBuilder: a fast, intuitive and flexible software tool for building and displaying glycan structures, <i>Alessio Ceroni, Anne Dell, and Stuart M Haslam, Source Code Biol Med. 2007; 2: 3. <a href="http://www.ncbi.nlm.nih.gov/pmc/articles/PMC1994674/">PubMed</a></i>
    </h3>

    <br class="clear">  

  </div>

</div>

<div id="wrap">
<a class="btn" href=""><i class="icon-refresh"></i> Refresh</a> <a class="btn btn-warning" href="#"> Builder Applet</a>
<iframe id="__gwt_historyFrame" style="width:0;height:0;border:0;overflow:hidden" src="javascript:false"></iframe>

        <div id="fb" style="height:450px; width:80%;margin:0"></div>

	<script type="text/javascript"> 
	var callBack=[];
        callBack.run=function(response)"""),format.raw("""{"""),format.raw/*105.41*/("""
          //document.write(response);
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
        """),format.raw("""}"""),format.raw/*117.10*/("""
       </script>
       
       
       <script type="text/javascript"> 
function Write()
"""),format.raw("""{"""),format.raw/*123.2*/("""
var Scr = new ActiveXObject("Scripting.FileSystemObject");
var CTF = Scr.CreateTextFile("/tmp/tmp.out", true);
CTF.WriteLine('Roseindia');
CTF.Close();
"""),format.raw("""}"""),format.raw/*128.2*/("""
</script>

<script language="JavaScript">
 cookie_name = "Basic_Cookie";
 function write_cookie() """),format.raw("""{"""),format.raw/*133.27*/("""
 if(document.cookie) """),format.raw("""{"""),format.raw/*134.23*/("""
 index = document.cookie.indexOf(cookie_name);
 """),format.raw("""}"""),format.raw/*136.3*/(""" else """),format.raw("""{"""),format.raw/*136.10*/("""
 index = -1;
 """),format.raw("""}"""),format.raw/*138.3*/("""
 
 if (index == -1) """),format.raw("""{"""),format.raw/*140.20*/("""
 document.cookie=cookie_name+"=1; expires=Wednesday, 01-Aug-2040 08:00:00 GMT";
 """),format.raw("""}"""),format.raw/*142.3*/(""" else """),format.raw("""{"""),format.raw/*142.10*/("""
 countbegin = (document.cookie.indexOf("=", index) + 1);
 countend = document.cookie.indexOf(";", index);
 if (countend == -1) """),format.raw("""{"""),format.raw/*145.23*/("""
 countend = document.cookie.length;
 """),format.raw("""}"""),format.raw/*147.3*/("""
 count = eval(document.cookie.substring(countbegin, countend)) + 1;
 document.cookie=cookie_name+"="+count+"; expires=Wednesday, 01-Aug-2040 08:00:00 GMT";
 """),format.raw("""}"""),format.raw/*150.3*/("""
 """),format.raw("""}"""),format.raw/*151.3*/("""
 </script>
       

	<select id="format.field">
           <option>glycoct</option>
           <option>glycoct_condensed</option>
           <option>glyde</option>
           <option>linucs</option>
           <option>gws</option>
         </select>

	<form id="frm1" name="frm1" action="ms" method="POST">
	<input type="button" name="Search" value="Search" onclick='window["glycanCanvas"].runCommand("export~glycoct_condensed",callBack);'/>
        </form>
</div>


</div>

"""),format.raw/*199.4*/("""

</body></html>
"""))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Oct 12 14:39:33 EST 2012
                    SOURCE: /home/matthew/Documents/play-app/tmp/glycomics/app/views/search.scala.html
                    HASH: 237817c26cb9d1f16b3c08487321702a686e1e48
                    MATRIX: 815->0|1193->348|1207->354|1278->403|1374->469|1388->475|1465->530|1562->597|1576->603|1657->662|1760->734|1775->740|1854->796|1958->869|1973->875|2057->936|2164->996|2251->1036|2330->1068|2634->1325|2772->1415|2845->1441|2955->1485|3738->2308|3777->2502|3875->2879|5308->4264|5703->4611|5842->4703|6043->4857|6191->4957|6262->4980|6359->5030|6414->5037|6477->5053|6547->5075|6677->5158|6732->5165|6909->5294|6995->5333|7201->5492|7251->5495|7755->6748
                    LINES: 30->1|36->7|36->7|36->7|37->8|37->8|37->8|38->9|38->9|38->9|39->10|39->10|39->10|40->11|40->11|40->11|43->14|44->15|45->16|49->20|49->20|50->21|52->23|71->42|72->48|81->69|117->105|129->117|135->123|140->128|145->133|146->134|148->136|148->136|150->138|152->140|154->142|154->142|157->145|159->147|162->150|163->151|183->199
                    -- GENERATED --
                */
            