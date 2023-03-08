
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(firstname: String, status: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.6*/import java.math.BigInteger;


Seq[Any](format.raw/*2.1*/("""    """),format.raw/*3.1*/("""<!DOCTYPE html>
    <html>
        <head>
            <title>"""),_display_(/*6.21*/status),format.raw/*6.27*/(""" """),format.raw/*6.28*/("""TA Portal</title>
        </head>
        <body>

            <header class="topbar">
                <h1 class="focused" style="font-size: 37px;
                    color: #57a957">
                    <strong>TA Portal</strong>
                </h1>
                <p class="focused" style="font-size: 20px;
                    color: #3F51B5">Welcome, """),_display_(/*16.47*/firstname),format.raw/*16.56*/("""</p>
            </header>
            <p>"""),_display_(/*18.17*/status),format.raw/*18.23*/("""</p>
            <a href=""""),_display_(/*19.23*/routes/*19.29*/.HomeController.changePassword()),format.raw/*19.61*/("""">CHANGE PASSWORD</a>
            <a href=""""),_display_(/*20.23*/routes/*20.29*/.HomeController.editProfile()),format.raw/*20.58*/("""">Edit Profule</a>
            <div>
            """),_display_(/*22.14*/if(status.equals("Student"))/*22.42*/ {_display_(Seq[Any](format.raw/*22.44*/("""
                """),format.raw/*23.17*/("""<a href=""""),_display_(/*23.27*/routes/*23.33*/.ApplicationController.openApplicationForm()),format.raw/*23.77*/("""">Create Open Application</a>
            """)))}),format.raw/*24.14*/("""
            """),format.raw/*25.13*/("""</div>
            <div>
            """),_display_(/*27.14*/if(status.equals("Student"))/*27.42*/ {_display_(Seq[Any](format.raw/*27.44*/("""
                """),format.raw/*28.17*/("""<a href=""""),_display_(/*28.27*/routes/*28.33*/.TAResponseController.openResponseForm("CS2341")),format.raw/*28.81*/("""">CS2341</a>
            """)))}),format.raw/*29.14*/("""
            """),format.raw/*30.13*/("""</div>

        </body>
    </html>
"""))
      }
    }
  }

  def render(firstname:String,status:String): play.twirl.api.HtmlFormat.Appendable = apply(firstname,status)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (firstname,status) => apply(firstname,status)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2023-03-08T15:28:28.059
                  SOURCE: C:/Users/brian/Documents/SMU/sem6/4345/portal/4345-group8/Frontend/app/views/index.scala.html
                  HASH: a94a5fdf9089cb7ab516c36a6c5b8a36a31a4bf7
                  MATRIX: 955->1|1063->42|1120->37|1150->71|1238->133|1264->139|1292->140|1676->497|1706->506|1776->549|1803->555|1857->582|1872->588|1925->620|1996->664|2011->670|2061->699|2138->749|2175->777|2215->779|2260->796|2297->806|2312->812|2377->856|2451->899|2492->912|2557->950|2594->978|2634->980|2679->997|2716->1007|2731->1013|2800->1061|2857->1087|2898->1100
                  LINES: 28->1|31->2|34->2|34->3|37->6|37->6|37->6|47->16|47->16|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|53->22|53->22|53->22|54->23|54->23|54->23|54->23|55->24|56->25|58->27|58->27|58->27|59->28|59->28|59->28|59->28|60->29|61->30
                  -- GENERATED --
              */
          