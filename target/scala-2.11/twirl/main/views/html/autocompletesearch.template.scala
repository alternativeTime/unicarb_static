
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
object autocompletesearch extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*1.2*/main/*1.6*/ {_display_(Seq[Any](format.raw/*1.8*/("""
"""),format.raw/*2.1*/("""<p>test again</p>
""")))}),format.raw/*3.2*/("""
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Nov 14 15:46:53 EST 2014
                  SOURCE: /Users/matthew/playframework/glycomics_again/glycomics/app/views/autocompletesearch.scala.html
                  HASH: fa483543d6478687f6e8c4a68bf3560baff457f6
                  MATRIX: 811->1|822->5|860->7|887->8|935->27
                  LINES: 29->1|29->1|29->1|30->2|31->3
                  -- GENERATED --
              */
          