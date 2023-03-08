
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
            <div>
            """),_display_(/*21.14*/if(status.equals("Student"))/*21.42*/ {_display_(Seq[Any](format.raw/*21.44*/("""
                """),format.raw/*22.17*/("""<a href=""""),_display_(/*22.27*/routes/*22.33*/.ApplicationController.openApplicationForm()),format.raw/*22.77*/("""">Create Open Application</a>
            """)))}),format.raw/*23.14*/("""
            """),format.raw/*24.13*/("""</div>
            <div>
                <a href=""""),_display_(/*26.27*/routes/*26.33*/.TAResponseController.openResponseForm("CS2341")),format.raw/*26.81*/("""">CS2341</a>
            </div>
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
                  DATE: 2023-03-07T16:00:51.170
                  SOURCE: C:/Users/brian/Documents/SMU/sem6/4345/portal/4345-group8/Frontend/app/views/index.scala.html
                  HASH: cd759fb6123f73405a2c3f7e6ef5c11e6c4e1dfa
                  MATRIX: 955->1|1063->42|1120->37|1150->71|1238->133|1264->139|1292->140|1676->497|1706->506|1776->549|1803->555|1857->582|1872->588|1925->620|2005->673|2042->701|2082->703|2127->720|2164->730|2179->736|2244->780|2318->823|2359->836|2437->887|2452->893|2521->941
                  LINES: 28->1|31->2|34->2|34->3|37->6|37->6|37->6|47->16|47->16|49->18|49->18|50->19|50->19|50->19|52->21|52->21|52->21|53->22|53->22|53->22|53->22|54->23|55->24|57->26|57->26|57->26
                  -- GENERATED --
              */
          