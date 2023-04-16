
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

object profileView extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[JsonNode,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(currProfile: JsonNode):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.25*/("""
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
                    </div>
                </header>
            </div>
        </div>
    </body>
</html>"""))
      }
    }
  }

  def render(currProfile:JsonNode): play.twirl.api.HtmlFormat.Appendable = apply(currProfile)

  def f:((JsonNode) => play.twirl.api.HtmlFormat.Appendable) = (currProfile) => apply(currProfile)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2023-04-05T18:03:03.569
                  SOURCE: C:/Users/brian/Documents/SMU/sem6/4345/portal/4345-group8/Frontend/app/views/account/profileView.scala.html
                  HASH: 613a7e16a4ba33d528ee81691ab4b2df709e1024
                  MATRIX: 659->1|1018->50|1136->73|1164->75|2347->1231|2459->1321|2564->1399|2584->1410|2630->1435
                  LINES: 24->1|29->2|34->2|35->3|57->25|57->25|59->27|59->27|59->27
                  -- GENERATED --
              */
          