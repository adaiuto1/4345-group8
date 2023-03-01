
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
/*2.2*/import java.math.BigInteger;


Seq[Any](format.raw/*3.1*/("""<!DOCTYPE html>
<html>
    <body>

        <header class="topbar">
            <h1 class="focused" style="font-size: 37px;
                color: #57a957">
                <strong>Login Message</strong>
            </h1>
            <p class="focused" style="font-size: 20px;
                color: #3F51B5">"""),_display_(/*13.34*/message),format.raw/*13.41*/("""</p>
        </header>
        <p>"""),_display_(/*15.13*/message),format.raw/*15.20*/("""</p>
        <p>"""),_display_(/*16.13*/username),format.raw/*16.21*/("""</p>
        <a href=""""),_display_(/*17.19*/routes/*17.25*/.HomeController.changePassword()),format.raw/*17.57*/("""">CHANGE PASSWORD</a>
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
                  DATE: 2023-03-01T17:27:31.163
                  SOURCE: C:/Users/brian/Documents/SMU/sem6/4345/portal/4345-group8/Frontend/app/views/index.scala.html
                  HASH: bf4bb514ef79187724ad930543c9e8a062ba2629
                  MATRIX: 955->1|1063->38|1120->67|1456->376|1484->383|1546->418|1574->425|1618->442|1647->450|1697->473|1712->479|1765->511
                  LINES: 28->1|31->2|34->3|44->13|44->13|46->15|46->15|47->16|47->16|48->17|48->17|48->17
                  -- GENERATED --
              */
          