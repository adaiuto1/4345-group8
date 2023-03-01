
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

object profileForm extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(authorizeMessage: String, email: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <title>Create Profile</title>
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
                <strong>Create Profile</strong>
            </h1>
        </header>
        <div class="row">
            <div class="card col s10 offset-s1 ">
                <form action=""""),_display_(/*28.32*/routes/*28.38*/.HomeController.profileHandler()),format.raw/*28.70*/("""" method="GET">
                    <div class="card-panel">
                        <div class="row" name="row-1">
                            <div class="input-field col s3">
                                <input id="email" name="email" type="text" class="validate" value=""""),_display_(/*32.101*/email),format.raw/*32.106*/("""" readonly>
                                <label for="email">Email</label>
                            </div>
                        </div>
                        <div class="row" name="row-2">
                            <div class="input-field col s1">
                                <select style="display: block" id="title" name="title">
                                    <option value="Mr.">Mr.</option>
                                    <option value="Ms.">Ms.</option>
                                    <option value="Mrs.">Mrs.</option>
                                </select>
                            </div>
                            <div class="input-field col s3">
                                <input id="firstname" name="firstname" type="text" required>
                                <label for="firstname">First Name</label>
                            </div>
                            <div class="input-field col s3">
                                <input id="lastname" name="lastname" type="password" class="validate" required>
                                <label for="lastname">Last Name</label>
                            </div>
                            <div class="input-field col s2">
                                <input id="phone" name="phone" type="text" class="validate" required>
                                <label for="phone">Phone Number</label>
                            </div>
                            <div class="input-field col s2">
                                <input id="fax" name="fax" type="text">
                                <label for="fax">Fax (Optional)</label>
                            </div>
                        </div>
                        <div class="row" name="row-3">
                            <div class="input-field col s4">
                                <input id="address" name="address" type="text" required>
                                <label for="address">Street Address</label>
                            </div>
                            <div class="input-field col s2">
                                <input id="city" name="city" type="text" required>
                                <label for="city">City</label>
                            </div>
                            <div class="input-field col s1">
                                <select style="display: block" id="state" name="state" required>
                                    <option value="TX">TX</option>
                                    <option value="CA">CA</option>
                                </select>
                            </div>
                            <div class="input-field col s2">
                                <input id="zip" name="zip" type="text" required>
                                <label for="zip">Zip/Postal Code</label>
                            </div>
                            <div class="input-field col s2">
                                <select style="display: block" id="country" name="country" type="text" required>
                                    <option value="United States">United States</option>
                                    <option value="Canada">Canada</option>
                                    <option value="Mexico">Mexico</option>
                                </select>
                            </div>
                        </div>
                        <div class="row" name="row-4">
                            <div class="input-field col s2">
                                <input id="affiliation" name="affiliation" type="text">
                                <label for="affiliation">Affiliation</label>
                            </div>
                            <div class="input-field col s2">
                                <select style="display: block" id="status" name="status" required>
                                    <option selected disabled style="color: #888888">Select Status...</option>
                                    <option value="Student">Student</option>
                                    <option value="Faculty">Faculty</option>
                                    <option value="Staff">Staff</option>
                                </select>
                            </div>
                        </div>
                        """),_display_(/*102.26*/if(authorizeMessage != null)/*102.54*/ {_display_(Seq[Any](format.raw/*102.56*/("""
                            """),format.raw/*103.29*/("""<div class="alert alert-primary" role="alert">
                            """),_display_(/*104.30*/authorizeMessage),format.raw/*104.46*/("""
                            """),format.raw/*105.29*/("""</div>
                            <br>
                        """)))}),format.raw/*107.26*/("""

                        """),format.raw/*109.25*/("""<div class="row">
                            <button id="api-search-button" class="btn col s4 offset-s4" type="submit">Submit</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>"""))
      }
    }
  }

  def render(authorizeMessage:String,email:String): play.twirl.api.HtmlFormat.Appendable = apply(authorizeMessage,email)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (authorizeMessage,email) => apply(authorizeMessage,email)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2023-03-01T16:37:16.160
                  SOURCE: /Users/paig/Desktop/SMU/Spring 2023/CS 4345/4345-group8/Frontend/app/views/account/profileForm.scala.html
                  HASH: 8d2d494ad0f91fb105268f6abac83ad588c1db26
                  MATRIX: 969->1|1104->43|2689->1603|2704->1609|2757->1641|3062->1918|3089->1923|7479->6285|7517->6313|7558->6315|7616->6344|7720->6420|7758->6436|7816->6465|7913->6530|7968->6556
                  LINES: 28->1|33->2|59->28|59->28|59->28|63->32|63->32|133->102|133->102|133->102|134->103|135->104|135->104|136->105|138->107|140->109
                  -- GENERATED --
              */
          