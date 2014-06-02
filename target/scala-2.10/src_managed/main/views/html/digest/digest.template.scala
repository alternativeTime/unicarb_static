
package views.html.digest

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
object digest extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Structure,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(strInfo : Structure):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.23*/("""
<div class="info">
	<h3>GlycoDigest</h3>
	<a href="/glycodigest/"""),_display_(Seq[Any](/*4.25*/strInfo/*4.32*/.id)),format.raw/*4.35*/(""""><span class='label label-success'>Simulate exoglycosidase digestion</span></a>
</div>

"""))}
    }
    
    def render(strInfo:Structure): play.api.templates.HtmlFormat.Appendable = apply(strInfo)
    
    def f:((Structure) => play.api.templates.HtmlFormat.Appendable) = (strInfo) => apply(strInfo)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 02 10:52:57 EST 2014
                    SOURCE: /Users/matthew/git/glycomics_working/app/views/digest/digest.scala.html
                    HASH: 7bc45ecf312bd01861c634cdeda191d99bf1dde2
                    MATRIX: 785->1|900->22|1001->88|1016->95|1040->98
                    LINES: 26->1|29->1|32->4|32->4|32->4
                    -- GENERATED --
                */
            