
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
object search extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*1.2*/main/*1.6*/ {_display_(Seq[Any](format.raw/*1.8*/("""

"""),format.raw/*3.1*/("""<script type="text/javascript"> 
var vaadin = """),format.raw/*4.14*/("""{"""),format.raw/*4.15*/("""
 """),format.raw/*5.2*/("""vaadinConfigurations: """),format.raw/*5.24*/("""{"""),format.raw/*5.25*/("""
"""),format.raw/*6.1*/("""'fb' :"""),format.raw/*6.7*/("""{"""),format.raw/*6.8*/("""
"""),format.raw/*7.1*/("""appUri:'/GlycanBuilder', 
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
          """),format.raw/*59.11*/("""//document.write(response);
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
       """),format.raw/*71.8*/("""</script>
       
       
<script type="text/javascript"> 
function Write()
"""),format.raw/*76.1*/("""{"""),format.raw/*76.2*/("""
"""),format.raw/*77.1*/("""var Scr = new ActiveXObject("Scripting.FileSystemObject");
var CTF = Scr.CreateTextFile("/tmp/tmp.out", true);
CTF.WriteLine('Roseindia');
CTF.Close();
"""),format.raw/*81.1*/("""}"""),format.raw/*81.2*/("""
"""),format.raw/*82.1*/("""</script>

<script language="JavaScript">
 cookie_name = "Basic_Cookie";
 function write_cookie() """),format.raw/*86.26*/("""{"""),format.raw/*86.27*/("""
 """),format.raw/*87.2*/("""if(document.cookie) """),format.raw/*87.22*/("""{"""),format.raw/*87.23*/("""
 """),format.raw/*88.2*/("""index = document.cookie.indexOf(cookie_name);
 """),format.raw/*89.2*/("""}"""),format.raw/*89.3*/(""" """),format.raw/*89.4*/("""else """),format.raw/*89.9*/("""{"""),format.raw/*89.10*/("""
 """),format.raw/*90.2*/("""index = -1;
 """),format.raw/*91.2*/("""}"""),format.raw/*91.3*/("""
 
 """),format.raw/*93.2*/("""if (index == -1) """),format.raw/*93.19*/("""{"""),format.raw/*93.20*/("""
 """),format.raw/*94.2*/("""document.cookie=cookie_name+"=1; expires=Wednesday, 01-Aug-2040 08:00:00 GMT";
 """),format.raw/*95.2*/("""}"""),format.raw/*95.3*/(""" """),format.raw/*95.4*/("""else """),format.raw/*95.9*/("""{"""),format.raw/*95.10*/("""
 """),format.raw/*96.2*/("""countbegin = (document.cookie.indexOf("=", index) + 1);
 countend = document.cookie.indexOf(";", index);
 if (countend == -1) """),format.raw/*98.22*/("""{"""),format.raw/*98.23*/("""
 """),format.raw/*99.2*/("""countend = document.cookie.length;
 """),format.raw/*100.2*/("""}"""),format.raw/*100.3*/("""
 """),format.raw/*101.2*/("""count = eval(document.cookie.substring(countbegin, countend)) + 1;
 document.cookie=cookie_name+"="+count+"; expires=Wednesday, 01-Aug-2040 08:00:00 GMT";
 """),format.raw/*103.2*/("""}"""),format.raw/*103.3*/("""
 """),format.raw/*104.2*/("""}"""),format.raw/*104.3*/("""
 """),format.raw/*105.2*/("""</script>
       
"""),format.raw/*114.21*/("""

	"""),format.raw/*116.2*/("""<form id="frm1" name="frm1" action="ms" method="POST" class="form-search">
	<input type="button" class="btn" name="Search" value="Search" onclick='window["glycanCanvas"].runCommand("export~glycoct_condensed",callBack);'/>
        </form>
</div>


</div>

""")))}),format.raw/*124.2*/("""


"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Nov 14 11:35:23 EST 2014
                  SOURCE: /Users/matthew/git/glycomics_working/app/views/search.scala.html
                  HASH: 83bee720c0fb9951ebcbf614d0fb3c2f13f9eff0
                  MATRIX: 799->1|810->5|848->7|876->9|949->55|977->56|1005->58|1054->80|1082->81|1109->82|1141->88|1168->89|1195->90|1351->218|1380->219|1498->308|1528->309|1557->311|1585->312|1613->313|1641->314|1669->315|3647->2265|3676->2266|3715->2277|4077->2612|4106->2613|4141->2621|4244->2697|4272->2698|4300->2699|4479->2851|4507->2852|4535->2853|4661->2951|4690->2952|4719->2954|4767->2974|4796->2975|4825->2977|4899->3024|4927->3025|4955->3026|4987->3031|5016->3032|5045->3034|5085->3047|5113->3048|5144->3052|5189->3069|5218->3070|5247->3072|5354->3152|5382->3153|5410->3154|5442->3159|5471->3160|5500->3162|5654->3288|5683->3289|5712->3291|5776->3327|5805->3328|5835->3330|6019->3486|6048->3487|6078->3489|6107->3490|6137->3492|6184->3744|6215->3747|6502->4003
                  LINES: 29->1|29->1|29->1|31->3|32->4|32->4|33->5|33->5|33->5|34->6|34->6|34->6|35->7|38->10|38->10|38->10|38->10|39->11|39->11|40->12|40->12|40->12|86->58|86->58|87->59|98->70|98->70|99->71|104->76|104->76|105->77|109->81|109->81|110->82|114->86|114->86|115->87|115->87|115->87|116->88|117->89|117->89|117->89|117->89|117->89|118->90|119->91|119->91|121->93|121->93|121->93|122->94|123->95|123->95|123->95|123->95|123->95|124->96|126->98|126->98|127->99|128->100|128->100|129->101|131->103|131->103|132->104|132->104|133->105|135->114|137->116|145->124
                  -- GENERATED --
              */
          