
package views.html.account

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
/*1.2*/import com.fasterxml.jackson.databind.JsonNode

object profileView extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[JsonNode,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(currProfile: JsonNode, currUser: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.43*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <title>TA Portal Login</title>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

            <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <link rel="shortcut icon" type="image/x-icon" href="docs/images/favicon.ico" />
    </head>
    <body>
        <div class="row">
            <div class="card col s8 offset-s2">
                <header>
                    <div class="row">
                        <div class="col s5 offset-s1">
                            <h1 style="font-size: 37px;
                                color: #186aad">
                                <strong>"""),_display_(/*25.42*/(currProfile.get("firstname").textValue() + " " + currProfile.get("lastname").textValue())),format.raw/*25.132*/("""</strong>
                            </h1>
                            <p>"""),_display_(/*27.33*/currProfile/*27.44*/.get("email").textValue()),format.raw/*27.69*/("""</p>
                        </div>
                        <div class="col s5"></div>
                        <div class="col s2">
                            <a href=""""),_display_(/*31.39*/routes/*31.45*/.HomeController.editProfile()),format.raw/*31.74*/("""">
                            """),_display_(/*32.30*/if(currProfile.get("email").textValue() == currUser)/*32.82*/ {_display_(Seq[Any](format.raw/*32.84*/("""
                                """),format.raw/*33.33*/("""<button class="btn">Edit Profile</button>
                            """)))}),format.raw/*34.30*/("""
                            """),format.raw/*35.29*/("""</a>
                        </div>
                    </div>
                </header>
            </div>
        </div>
    </body>
</html>"""))
      }
    }
  }

  def render(currProfile:JsonNode,currUser:String): play.twirl.api.HtmlFormat.Appendable = apply(currProfile,currUser)

  def f:((JsonNode,String) => play.twirl.api.HtmlFormat.Appendable) = (currProfile,currUser) => apply(currProfile,currUser)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2023-04-17T11:51:33.168
                  SOURCE: C:/Users/brian/Documents/SMU/sem6/4345/portal/4345-group8/Frontend/app/views/account/profileView.scala.html
                  HASH: 83319369728394bf95526875e7faf411e9b87fb5
                  MATRIX: 659->1|1025->50|1161->91|1189->93|2372->1249|2484->1339|2589->1417|2609->1428|2655->1453|2856->1627|2871->1633|2921->1662|2981->1695|3042->1747|3082->1749|3144->1783|3247->1855|3305->1885
                  LINES: 24->1|29->2|34->2|35->3|57->25|57->25|59->27|59->27|59->27|63->31|63->31|63->31|64->32|64->32|64->32|65->33|66->34|67->35
                  -- GENERATED --
              */
          