
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
  def apply/*1.2*/(message: String, username: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.6*/import java.math.BigInteger;


Seq[Any](format.raw/*2.1*/("""    """),format.raw/*3.1*/("""<!DOCTYPE html>
    <html>
        <body>

            <header class="topbar">
                <h1 class="focused" style="font-size: 37px;
                    color: #57a957">
                    <strong>Login Message</strong>
                </h1>
                <p class="focused" style="font-size: 20px;
                    color: #3F51B5">"""),_display_(/*13.38*/message),format.raw/*13.45*/("""</p>
            </header>
            <p>"""),_display_(/*15.17*/message),format.raw/*15.24*/("""</p>
            <p>"""),_display_(/*16.17*/username),format.raw/*16.25*/("""</p>
            <a href=""""),_display_(/*17.23*/routes/*17.29*/.HomeController.changePassword()),format.raw/*17.61*/("""">CHANGE PASSWORD</a>
            <a href=""""),_display_(/*18.23*/routes/*18.29*/.ApplicationController.openApplication()),format.raw/*18.69*/("""">Open Application</a>
        </body>
    </html>
"""))
      }
    }
  }

  def render(message:String,username:String): play.twirl.api.HtmlFormat.Appendable = apply(message,username)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (message,username) => apply(message,username)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2023-03-01T21:14:26.535
                  SOURCE: C:/Users/brian/Documents/SMU/sem6/4345/portal/4345-group8/Frontend/app/views/index.scala.html
                  HASH: 491fdc2ebf5d88e7784b6932c159003cc46cf819
                  MATRIX: 955->1|1063->42|1120->37|1150->71|1522->416|1550->423|1620->466|1648->473|1696->494|1725->502|1779->529|1794->535|1847->567|1918->611|1933->617|1994->657
                  LINES: 28->1|31->2|34->2|34->3|44->13|44->13|46->15|46->15|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18
                  -- GENERATED --
              */
          