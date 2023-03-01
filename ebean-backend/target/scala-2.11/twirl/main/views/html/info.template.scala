
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
    <body>
        <header class="topbar">
            <h1 class="focused" style="font-size:37px; color:#57a957">
                <strong>user info ADaiuto</strong>
            </h1>
        </header>
        """),_display_(/*10.10*/for(infoMessage <- infoMessages) yield /*10.42*/{_display_(Seq[Any](format.raw/*10.43*/("""
            """),format.raw/*11.13*/("""<li>"""),_display_(/*11.18*/infoMessage),format.raw/*11.29*/("""</li>
        """)))}),format.raw/*12.10*/("""
    """),format.raw/*13.5*/("""</body>
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
                  DATE: Wed Mar 01 16:35:18 CST 2023
                  SOURCE: /Users/paig/Desktop/SMU/Spring 2023/CS 4345/4345-group8/ebean-backend/app/views/info.scala.html
                  HASH: 93684106278208f716d80aea9e5545695b253a17
                  MATRIX: 748->1|869->27|896->28|1156->261|1204->293|1243->294|1284->307|1316->312|1348->323|1394->338|1426->343
                  LINES: 27->1|32->1|33->2|41->10|41->10|41->10|42->11|42->11|42->11|43->12|44->13
                  -- GENERATED --
              */
          