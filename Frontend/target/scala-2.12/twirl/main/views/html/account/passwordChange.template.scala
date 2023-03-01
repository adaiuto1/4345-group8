
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

object passwordChange extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(authorizeMessage: String, question1: String, question2: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.66*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <title>Change Password</title>
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
                <strong>Change Password</strong>
            </h1>
        </header>
        <form action=""""),_display_(/*26.24*/routes/*26.30*/.HomeController.passwordHandler()),format.raw/*26.63*/("""" method="GET">
            <input id="email" name="email" type="text" class="validate">
            <label for="email">email</label>
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
            <input id="newPassword" name="newPassword" type="text" class="validate" >
            <label for="newPassword">New Password</label>
            <input id="confirmNewPassword" name="confirmNewPassword" type="text" class="validate" >
            <label for="confirmNewPassword">Confirm New Password</label>
            <div class="row">
                <button id="api-search-button" class="btn col s4 offset-s4" type="submit">Submit</button>
            </div>
        </form>
    </body>
</html>"""))
      }
    }
  }

  def render(authorizeMessage:String,question1:String,question2:String): play.twirl.api.HtmlFormat.Appendable = apply(authorizeMessage,question1,question2)

  def f:((String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (authorizeMessage,question1,question2) => apply(authorizeMessage,question1,question2)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2023-03-01T17:11:57.898
                  SOURCE: C:/Users/brian/Documents/SMU/sem6/4345/portal/4345-group8/Frontend/app/views/account/passwordChange.scala.html
                  HASH: a23d6bd50cb9ebe57ff8ea08681db64a69e23b9a
                  MATRIX: 979->1|1138->65|1166->67|2693->1569|2708->1575|2762->1608
                  LINES: 28->1|33->1|34->2|58->26|58->26|58->26
                  -- GENERATED --
              */
          