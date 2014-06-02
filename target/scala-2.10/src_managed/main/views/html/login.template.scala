
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
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Application.Login],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(form: Form[Application.Login]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.33*/("""

"""),_display_(Seq[Any](/*3.2*/main/*3.6*/{_display_(Seq[Any](format.raw/*3.7*/("""

<ul class="breadcrumb">
  <li><i class="icon-home" ></i><a href="/"> UniCarbKB</a> <span class="divider">></span></li>
  <li class="active"><i class="icon-bookmark" ></i> Log In<span class="divider"></span></li>
</ul>

"""),_display_(Seq[Any](/*10.2*/helper/*10.8*/.form(routes.Application.authenticate)/*10.46*/ {_display_(Seq[Any](format.raw/*10.48*/("""
<section id="layouts" class="browse">
"""),_display_(Seq[Any](/*12.2*/if(form.hasGlobalErrors)/*12.26*/ {_display_(Seq[Any](format.raw/*12.28*/("""
                <p class="error">
                    """),_display_(Seq[Any](/*14.22*/form/*14.26*/.globalError.message)),format.raw/*14.46*/("""
                </p>
            """)))})),format.raw/*16.14*/("""

            """),_display_(Seq[Any](/*18.14*/if(flash.contains("success"))/*18.43*/ {_display_(Seq[Any](format.raw/*18.45*/("""
                <p class="success">
                    """),_display_(Seq[Any](/*20.22*/flash/*20.27*/.get("success"))),format.raw/*20.42*/("""
                </p>
            """)))})),format.raw/*22.14*/("""
  <div class="page-header row-fluid">
    <h1>Enter your email and password to log in</h1>
    <h4 class="subheader">Log in to access extra UnicarbKB features.</h4>

  </div>

  <div class='row-fluid'>
	<div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="vg7ZWYEjJd7R3fPCfs6RRWUCJxW1iPBJFeldLbpa8VI=" /></div>

      <div class='control-group'>
        <label class='control-label' for='user_email'>Email:</label>
        <div class='controls'>
	         <input type="email" name="email" placeholder="Email" value=""""),_display_(Seq[Any](/*35.72*/form("email")/*35.85*/.value)),format.raw/*35.91*/("""">
        </div>
      </div>
      <div class='control-group'>
        <label class='password optional control-label' for='user_password'>Password:</label>
        <div class='controls'>
	<input type="password" name="password" placeholder="Password">
        </div>
      </div>
      <div class='control-group'>
        """),format.raw/*47.18*/("""
        <div class='controls'>
	  <button type="submit">Login</button>
	  <input class="btn btn-primary" name="commit" type="submit" value="Log in">
          <a href='/user/password/new' class='btn'>Forgot your password?</a>
        </div>
      </div>


  </div><!-- /col -->
</div><!-- /row -->
<div class="footer row-fluid">
  <div class="span12">
    <p class="pull-left">UniCarbKB</p>
    <p class="pull-right">Supported by 
      <a href="http://www.nectar.org.au">NeCTAR</a> &nbsp;|&nbsp; 
      <a href="http://www.ands.org.au">ANDS</a> &nbsp;|&nbsp;
      <a href="http://www.stint.se"> STINT</a> &nbsp;|&nbsp;
      <a href="http://expasy.org/"> SIB ExPASy</a>
    </p>
  </div>
</div>
</section>
""")))})),format.raw/*70.2*/("""

""")))})),format.raw/*72.2*/("""
"""))}
    }
    
    def render(form:Form[Application.Login]): play.api.templates.HtmlFormat.Appendable = apply(form)
    
    def f:((Form[Application.Login]) => play.api.templates.HtmlFormat.Appendable) = (form) => apply(form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 02 10:52:56 EST 2014
                    SOURCE: /Users/matthew/git/glycomics_working/app/views/login.scala.html
                    HASH: 8c16bf891d48d17a45b105998d689dd20fd3b3ac
                    MATRIX: 791->1|916->32|953->35|964->39|1001->40|1258->262|1272->268|1319->306|1359->308|1434->348|1467->372|1507->374|1599->430|1612->434|1654->454|1721->489|1772->504|1810->533|1850->535|1944->593|1958->598|1995->613|2062->648|2716->1266|2738->1279|2766->1285|3117->1704|3858->2414|3892->2417
                    LINES: 26->1|29->1|31->3|31->3|31->3|38->10|38->10|38->10|38->10|40->12|40->12|40->12|42->14|42->14|42->14|44->16|46->18|46->18|46->18|48->20|48->20|48->20|50->22|63->35|63->35|63->35|73->47|96->70|98->72
                    -- GENERATED --
                */
            