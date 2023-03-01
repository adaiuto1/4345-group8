
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

object register extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(authorizeMessage: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <title>Play Setup Demo</title>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

            <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <link rel="shortcut icon" type="image/x-icon" href="docs/images/favicon.ico" />
        <link rel="stylesheet" href="https://unpkg.com/leaflet@1.5.1/dist/leaflet.css" integrity="sha512-xwE/Az9zrjBIphAcBb3F6JVqxf46+CDLwfLMHloNu6KEQCAWi6HcDUbeOfBIptF7tcCzusKFjFw2yuvEpDL9wQ==" crossorigin=""/>
        <script src="https://unpkg.com/leaflet@1.5.1/dist/leaflet.js" integrity="sha512-GffPMF3RvMeYyc1LWMHtK8EbPv0iNZ8/oTtHPx9/cc2ILxQ+u905qIwdpULaqDkyBKgOaB57QTMg7ztg8Jm2Og==" crossorigin=""></script>
    </head>
    <body>

        <header class="topbar">
            <h1 class="focused" style="font-size: 37px;
                color: #57a957;
                text-align: center">
                <strong>Create Account</strong>
            </h1>
        </header>

        <div class="row">
            <div class="card col s6 offset-s3 ">
                <div class="card-panel">
                    <form action=""""),_display_(/*31.36*/routes/*31.42*/.HomeController.signupHandler()),format.raw/*31.73*/("""" method="GET">
                        <div class="row s12 offset-s2" name="row-1">
                            <div class="input-field col ">
                                <input id="username" name="username" type="text">
                                <label for="username">Username</label>
                            </div>
                            <div class="input-field col s3">
                                <input id="password" name="password" type="password" class="validate">
                                <label for="password">Password</label>
                            </div>
                        </div>
                        <div class="row" name="row-4">
                            <div class="input-field col s4">
                                <input id="email" name="email" type="email" class="validate">
                                <label for="email">Email</label>
                            </div>
                            <div class="input-field col s5">
                                <select style="display: block" id="question1" name="question1" required>
                                    <option selected disabled style="color: #888888">Security Question 1</option>
                                    <option value="street">What street did you grow up on?</option>
                                    <option value="color">What is your favorite color?</option>
                                    <option value="mascot">What was your school mascot?</option>
                                </select>
                            </div>
                            <div class="input-field col s2">
                                <input id="answer1" name="answer1" type="text" class="validate" required>
                                <label for="answer1">Answer 1</label>

                            </div>
                            <div class="input-field col s5 offset-s4">
                                <select style="display: block" id="question2" name="question2" required>
                                    <option selected disabled style="color: #888888">Security Question 2</option>
                                    <option value="maiden">What is your mother's maiden name?</option>
                                    <option value="friend">Who was your best friend in school?</option>
                                    <option value="date">Where was your first date?</option>
                                </select>
                            </div>
                            <div class="input-field col s2">
                                <input id="answer2" name="answer2" type="text" class="validate" required>
                                <label for="answer2">Answer 2</label>
                            </div>
                        </div>
                        """),_display_(/*73.26*/if(authorizeMessage != null)/*73.54*/ {_display_(Seq[Any](format.raw/*73.56*/("""
                            """),format.raw/*74.29*/("""<div class="alert alert-primary" role="alert">
                            """),_display_(/*75.30*/authorizeMessage),format.raw/*75.46*/("""
                            """),format.raw/*76.29*/("""</div>
                            <br>
                        """)))}),format.raw/*78.26*/("""

                        """),format.raw/*80.25*/("""<div class="row">
                            <button id="api-search-button" class="btn col s4 offset-s4" type="submit">Submit</button>
                        </div>

                    </form>

                </div>
            </div>
        </div>
    </body>
</html>
"""))
      }
    }
  }

  def render(authorizeMessage:String): play.twirl.api.HtmlFormat.Appendable = apply(authorizeMessage)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (authorizeMessage) => apply(authorizeMessage)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2023-03-01T16:37:16.141
                  SOURCE: /Users/paig/Desktop/SMU/Spring 2023/CS 4345/4345-group8/Frontend/app/views/account/register.scala.html
                  HASH: 2c0d732dfcf4d0b862e67be0d115f7a5d94c4b4b
                  MATRIX: 959->1|1079->28|2701->1625|2716->1631|2768->1662|5656->4523|5693->4551|5733->4553|5790->4582|5893->4658|5930->4674|5987->4703|6083->4768|6137->4794
                  LINES: 28->1|33->2|62->31|62->31|62->31|104->73|104->73|104->73|105->74|106->75|106->75|107->76|109->78|111->80
                  -- GENERATED --
              */
          