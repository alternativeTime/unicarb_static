
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
object saySearch extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Translation],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(result: List[Translation]):play.api.templates.Html = {
        _display_ {import helper._


Seq(format.raw/*1.29*/("""
"""),format.raw/*3.1*/("""
<html class="hoverable webkit webkit-chrome-5 signedOut" lang="en"><!--<![endif]--><head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>UniCarb Search</title>
  
  <meta name="viewport" content="width=device-width,initial-scale=1">
  <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq(/*10.64*/routes/*10.70*/.Assets.at("/public", "stylesheets/reset.gz.css"))),format.raw/*10.119*/("""">
  <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq(/*11.64*/routes/*11.70*/.Assets.at("/public", "stylesheets/application.gz.css"))),format.raw/*11.125*/("""">
   <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq(/*12.65*/routes/*12.71*/.Assets.at("/public", "stylesheets/bootstrapnewlayout.css"))),format.raw/*12.130*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq(/*13.70*/routes/*13.76*/.Assets.at("/public", "stylesheets/stylesnewlayout.css"))),format.raw/*13.132*/("""">
         <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq(/*14.71*/routes/*14.77*/.Assets.at("/public", "stylesheets/bootstrap-responsive.css"))),format.raw/*14.138*/("""">

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
          """),format.raw/*26.79*/("""
          """),format.raw/*32.12*/("""

        </div>
      </div>
    </div>
</header>


<div id="splash">

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
<div id="static" class="contact" style="display: block; opacity: 1; visibility: visible; "><h1>Glycan Search</h1>

<h2>Exact result returned for your queried structure</h2>


"""),_display_(Seq(/*75.2*/for(result <- result) yield /*75.23*/{_display_(Seq(format.raw/*75.24*/("""
<img src="http://unicarb-db.biomedicine.gu.se/unicarbdb/get_sugar_image.action?download=true&scale=2.0&outputType=png&inputType=gws&tolerateUnknown=1&sequences="""),_display_(Seq(/*76.162*/{result.gws})),format.raw/*76.174*/("""" />
""")))})),format.raw/*77.2*/("""
</div>
</div>

</div>



</body></html>
"""))}
    }
    
    def render(result:List[Translation]) = apply(result)
    
    def f:((List[Translation]) => play.api.templates.Html) = (result) => apply(result)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Oct 12 14:39:33 EST 2012
                    SOURCE: /home/matthew/Documents/play-app/tmp/glycomics/app/views/saySearch.scala.html
                    HASH: c48cdfc1933b85bd3a5dcd4fce192cf9f47f1071
                    MATRIX: 770->1|885->28|912->46|1292->395|1307->401|1379->450|1476->516|1491->522|1569->577|1667->644|1682->650|1764->709|1867->781|1882->787|1961->843|2065->916|2080->922|2164->983|2559->1418|2598->1612|3862->2846|3899->2867|3933->2868|4127->3030|4162->3042|4199->3048
                    LINES: 27->1|31->1|32->3|39->10|39->10|39->10|40->11|40->11|40->11|41->12|41->12|41->12|42->13|42->13|42->13|43->14|43->14|43->14|55->26|56->32|99->75|99->75|99->75|100->76|100->76|101->77
                    -- GENERATED --
                */
            