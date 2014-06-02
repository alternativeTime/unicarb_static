
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
object search extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main/*1.6*/ {_display_(Seq[Any](format.raw/*1.8*/("""

<script type="text/javascript"> 
var vaadin = """),format.raw/*4.14*/("""{"""),format.raw/*4.15*/("""
 vaadinConfigurations: """),format.raw/*5.24*/("""{"""),format.raw/*5.25*/("""
'fb' :"""),format.raw/*6.7*/("""{"""),format.raw/*6.8*/("""
appUri:'/GlycanBuilder', 
 pathInfo: '/GlycanBuilder', 
themeUri: '/GlycanBuilder/VAADIN/themes/ucdb_2011theme', 
versionInfo : """),format.raw/*10.15*/("""{"""),format.raw/*10.16*/("""vaadinVersion:"6.0.0-INTERNAL-NONVERSIONED-DEBUG-BUILD",applicationVersion:"NONVERSIONED""""),format.raw/*10.105*/("""}"""),format.raw/*10.106*/("""
 """),format.raw/*11.2*/("""}"""),format.raw/*11.3*/("""
"""),format.raw/*12.1*/("""}"""),format.raw/*12.2*/("""}"""),format.raw/*12.3*/(""";
</script> 
  
<script language='javascript' src='GlycanBuilder/VAADIN/widgetsets/ac.uk.icl.dell.vaadin.glycanbuilder.widgetset.GlycanbuilderWidgetset/ac.uk.icl.dell.vaadin.glycanbuilder.widgetset.GlycanbuilderWidgetset.nocache.js'></script> 
<link rel="stylesheet" type="text/css" href="/GlycanBuilder/VAADIN/themes/ucdb_2011theme/styles.css"/>
          

<body onLoad="Write()">

  <ul class="breadcrumb">
    <li><i class="icon-home" ></i><a href="/"> UniCarbKB</a> <span class="divider">></span></li>
    <li class="active"><i class="icon-book" ></i> References<span class="divider"></span></li>
    <!--<li class="active" > You are here</li>-->
  </ul>

<section id="layouts" class="browse">
  <div class="page-header row-fluid">
    <h1>Glycan Builder</h1>
    <h4 class="subheader span8">An intuitive interface for building and displaying glycan structures using a collection of notation formats.</h4>
  </div>
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
        callBack.run=function(response)"""),format.raw/*58.40*/("""{"""),format.raw/*58.41*/("""
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
        """),format.raw/*70.9*/("""}"""),format.raw/*70.10*/("""
       </script>
       
       
<script type="text/javascript"> 
function Write()
"""),format.raw/*76.1*/("""{"""),format.raw/*76.2*/("""
var Scr = new ActiveXObject("Scripting.FileSystemObject");
var CTF = Scr.CreateTextFile("/tmp/tmp.out", true);
CTF.WriteLine('Roseindia');
CTF.Close();
"""),format.raw/*81.1*/("""}"""),format.raw/*81.2*/("""
</script>

<script language="JavaScript">
 cookie_name = "Basic_Cookie";
 function write_cookie() """),format.raw/*86.26*/("""{"""),format.raw/*86.27*/("""
 if(document.cookie) """),format.raw/*87.22*/("""{"""),format.raw/*87.23*/("""
 index = document.cookie.indexOf(cookie_name);
 """),format.raw/*89.2*/("""}"""),format.raw/*89.3*/(""" else """),format.raw/*89.9*/("""{"""),format.raw/*89.10*/("""
 index = -1;
 """),format.raw/*91.2*/("""}"""),format.raw/*91.3*/("""
 
 if (index == -1) """),format.raw/*93.19*/("""{"""),format.raw/*93.20*/("""
 document.cookie=cookie_name+"=1; expires=Wednesday, 01-Aug-2040 08:00:00 GMT";
 """),format.raw/*95.2*/("""}"""),format.raw/*95.3*/(""" else """),format.raw/*95.9*/("""{"""),format.raw/*95.10*/("""
 countbegin = (document.cookie.indexOf("=", index) + 1);
 countend = document.cookie.indexOf(";", index);
 if (countend == -1) """),format.raw/*98.22*/("""{"""),format.raw/*98.23*/("""
 countend = document.cookie.length;
 """),format.raw/*100.2*/("""}"""),format.raw/*100.3*/("""
 count = eval(document.cookie.substring(countbegin, countend)) + 1;
 document.cookie=cookie_name+"="+count+"; expires=Wednesday, 01-Aug-2040 08:00:00 GMT";
 """),format.raw/*103.2*/("""}"""),format.raw/*103.3*/("""
 """),format.raw/*104.2*/("""}"""),format.raw/*104.3*/("""
 </script>
       
"""),format.raw/*114.21*/("""

	<form id="frm1" name="frm1" action="ms" method="POST" class="form-search">
	<input type="button" class="btn" name="Search" value="Search" onclick='window["glycanCanvas"].runCommand("export~glycoct_condensed",callBack);'/>
        </form>
</div>


</div>

""")))})),format.raw/*124.2*/("""


"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 02 10:52:57 EST 2014
                    SOURCE: /Users/matthew/git/glycomics_working/app/views/search.scala.html
                    HASH: 92877e4fd035a13a68c3cfd50e09483e3ddd4901
                    MATRIX: 865->1|876->5|914->7|989->55|1017->56|1068->80|1096->81|1129->88|1156->89|1313->218|1342->219|1460->308|1490->309|1519->311|1547->312|1575->313|1603->314|1631->315|3609->2265|3638->2266|4011->2612|4040->2613|4151->2697|4179->2698|4359->2851|4387->2852|4514->2951|4543->2952|4593->2974|4622->2975|4698->3024|4726->3025|4759->3031|4788->3032|4830->3047|4858->3048|4907->3069|4936->3070|5045->3152|5073->3153|5106->3159|5135->3160|5291->3288|5320->3289|5386->3327|5415->3328|5601->3486|5630->3487|5660->3489|5689->3490|5738->3744|6029->4003
                    LINES: 29->1|29->1|29->1|32->4|32->4|33->5|33->5|34->6|34->6|38->10|38->10|38->10|38->10|39->11|39->11|40->12|40->12|40->12|86->58|86->58|98->70|98->70|104->76|104->76|109->81|109->81|114->86|114->86|115->87|115->87|117->89|117->89|117->89|117->89|119->91|119->91|121->93|121->93|123->95|123->95|123->95|123->95|126->98|126->98|128->100|128->100|131->103|131->103|132->104|132->104|135->114|145->124
                    -- GENERATED --
                */
            