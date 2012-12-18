
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

Seq(_display_(Seq(/*1.2*/main/*1.6*/ {_display_(Seq(format.raw/*1.8*/("""

<script type="text/javascript"> 
var vaadin = """),format.raw("""{"""),format.raw/*4.15*/("""
 vaadinConfigurations: """),format.raw("""{"""),format.raw/*5.25*/("""
'fb' :"""),format.raw("""{"""),format.raw/*6.8*/("""
appUri:'/GlycanBuilder', 
 pathInfo: '/GlycanBuilder', 
themeUri: '/GlycanBuilder/VAADIN/themes/ucdb_2011theme', 
versionInfo : """),format.raw("""{"""),format.raw/*10.16*/("""vaadinVersion:"6.0.0-INTERNAL-NONVERSIONED-DEBUG-BUILD",applicationVersion:"NONVERSIONED""""),format.raw("""}"""),format.raw/*10.106*/("""
 """),format.raw("""}"""),format.raw/*11.3*/("""
"""),format.raw("""}"""),format.raw("""}"""),format.raw/*12.3*/(""";
</script> 
  
<script language='javascript' src='GlycanBuilder/VAADIN/widgetsets/ac.uk.icl.dell.vaadin.glycanbuilder.widgetset.GlycanbuilderWidgetset/ac.uk.icl.dell.vaadin.glycanbuilder.widgetset.GlycanbuilderWidgetset.nocache.js'></script> 
<link rel="stylesheet" type="text/css" href="/GlycanBuilder/VAADIN/themes/ucdb_2011theme/styles.css"/>
          

<body onLoad="Write()">

  <ul class="breadcrumb">
    <li><i class="icon-home" ></i><a href="/"> UniCarbKB</a> <span class="divider">></span></li>
    <li class="active"><i class="icon-search" ></i> Reference Search<span class="divider"></span></li>
    <!--<li class="active" > You are here</li>-->
  </ul>

<section id="layouts" class="browse">
      <h1>Glycan Builder</h1>
      <h4 class="subheader">An intuitive interface for building and displaying glycan structures using a collection of notation formats.</h4>
      <div class="row-fluid">
	
	<div class="span6">
	<h3 class="builder">Find Structures</h3>	
	<p class="builder">Build your glycan or epitope and search the UniCarbKB structure database. This new design is built using new technologies and discussed by the developer David Damerell.</p>
	</div>
	
	<div class="span6">
	<h3 class="builder">Publication</h3>
	<p class="builder">The GlycanBuilder: a fast, intuitive and flexible software tool for building and displaying glycan structures, Alessio Ceroni, Anne Dell, and Stuart M Haslam, Source Code Biol Med. 2007; 2: 3. PubMed</p>
	</div>
	
	
      </div>
</section>



<div id="wrap">
<a class="btn" href=""><i class="icon-refresh"></i> Refresh</a> <a class="btn btn-warning" href="#"> Builder Applet</a>
<iframe id="__gwt_historyFrame" style="width:0;height:0;border:0;overflow:hidden" src="javascript:false"></iframe>

        <div id="fb" style="height:450px; width:80%;margin:0"></div>

	<script type="text/javascript"> 
	var callBack=[];
        callBack.run=function(response)"""),format.raw("""{"""),format.raw/*56.41*/("""
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
        """),format.raw("""}"""),format.raw/*68.10*/("""
       </script>
       
       
<script type="text/javascript"> 
function Write()
"""),format.raw("""{"""),format.raw/*74.2*/("""
var Scr = new ActiveXObject("Scripting.FileSystemObject");
var CTF = Scr.CreateTextFile("/tmp/tmp.out", true);
CTF.WriteLine('Roseindia');
CTF.Close();
"""),format.raw("""}"""),format.raw/*79.2*/("""
</script>

<script language="JavaScript">
 cookie_name = "Basic_Cookie";
 function write_cookie() """),format.raw("""{"""),format.raw/*84.27*/("""
 if(document.cookie) """),format.raw("""{"""),format.raw/*85.23*/("""
 index = document.cookie.indexOf(cookie_name);
 """),format.raw("""}"""),format.raw/*87.3*/(""" else """),format.raw("""{"""),format.raw/*87.10*/("""
 index = -1;
 """),format.raw("""}"""),format.raw/*89.3*/("""
 
 if (index == -1) """),format.raw("""{"""),format.raw/*91.20*/("""
 document.cookie=cookie_name+"=1; expires=Wednesday, 01-Aug-2040 08:00:00 GMT";
 """),format.raw("""}"""),format.raw/*93.3*/(""" else """),format.raw("""{"""),format.raw/*93.10*/("""
 countbegin = (document.cookie.indexOf("=", index) + 1);
 countend = document.cookie.indexOf(";", index);
 if (countend == -1) """),format.raw("""{"""),format.raw/*96.23*/("""
 countend = document.cookie.length;
 """),format.raw("""}"""),format.raw/*98.3*/("""
 count = eval(document.cookie.substring(countbegin, countend)) + 1;
 document.cookie=cookie_name+"="+count+"; expires=Wednesday, 01-Aug-2040 08:00:00 GMT";
 """),format.raw("""}"""),format.raw/*101.3*/("""
 """),format.raw("""}"""),format.raw/*102.3*/("""
 </script>
       
"""),format.raw/*112.21*/("""

	<form id="frm1" name="frm1" action="ms" method="POST" class="form-search">
	<input type="button" class="btn" name="Search" value="Search" onclick='window["glycanCanvas"].runCommand("export~glycoct_condensed",callBack);'/>
        </form>
</div>


</div>

""")))})),format.raw/*122.2*/("""


"""))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Dec 18 08:54:51 EST 2012
                    SOURCE: /home/matthew/Documents/play-app/office/glycomics/app/views/search.scala.html
                    HASH: f8cc1e63c6754ae38baae4038ad2b85ecd9eb796
                    MATRIX: 819->1|830->5|863->7|958->56|1029->81|1082->89|1259->219|1397->309|1446->312|1514->315|3475->2229|3869->2576|4000->2661|4200->2815|4347->2915|4417->2938|4513->2988|4567->2995|4629->3011|4698->3033|4827->3116|4881->3123|5057->3252|5142->3291|5348->3450|5398->3453|5447->3707|5738->3966
                    LINES: 30->1|30->1|30->1|33->4|34->5|35->6|39->10|39->10|40->11|41->12|85->56|97->68|103->74|108->79|113->84|114->85|116->87|116->87|118->89|120->91|122->93|122->93|125->96|127->98|130->101|131->102|134->112|144->122
                    -- GENERATED --
                */
            