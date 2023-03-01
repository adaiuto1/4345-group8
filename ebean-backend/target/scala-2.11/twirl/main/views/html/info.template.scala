
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object info_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class info extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Seq[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(infoMessages:Seq[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.28*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <head>
        <title>Reset Password</title>
    </head>
    <body>
        <header class="topbar">

        </header>

    </body>
</html>"""))
      }
    }
  }

  def render(infoMessages:Seq[String]): play.twirl.api.HtmlFormat.Appendable = apply(infoMessages)

  def f:((Seq[String]) => play.twirl.api.HtmlFormat.Appendable) = (infoMessages) => apply(infoMessages)

  def ref: this.type = this

}


}

/**/
object info extends info_Scope0.info
              /*
                  -- GENERATED --
                  DATE: Wed Mar 01 15:18:43 CST 2023
                  SOURCE: C:/Users/brian/Documents/SMU/sem6/4345/portal/4345-group8/ebean-backend/app/views/info.scala.html
                  HASH: de9b69f933da30bffecd5875055e88fcf10ed711
                  MATRIX: 748->1|869->27|897->29
                  LINES: 27->1|32->1|33->2
                  -- GENERATED --
              */
          