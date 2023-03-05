
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


Seq[Any](format.raw/*1.43*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <title>Create Profile</title>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
        <script src="/assets/javascripts/ProfileForm.js"></script>
            <!-- Compiled and minified JavaScript -->
        <script src=" https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
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
                                    <option value="Dr.">Dr.</option>
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
                            <div class="input-field col s3">
                                <select id="degree" name="degree">
                                    <option selected disabled style="color: #888888">Select Degree...</option>
                                    <option value="Ph.D.">Ph.D.</option>
                                    <option value="D.E.-SE">D.E.-SE</option>
                                    <option value="MS-CS">MS-CS</option>
                                    <option value="MS-SE">MS-SE</option>
                                    <option value="MS-Cybersecurity">MS-Cybersecurity</option>
                                    <option value="BS-CS">BS-CS</option>
                                    <option value="BA-CS">BA-CS</option>
                                </select>
                            </div>
                            <div class="input-field col s2">
                                <input id="startingSemester"
                                name="startingSemester"
                                type="text"
                                style="display: none">
                                <label id="startLabel"
                                for="startingSemester"
                                style="display: none">Starting Semester</label>
                            </div>
                            <div class="input-field col s3">
                                <input id="gradSemester"
                                name="gradSemester"
                                type="text"
                                style="display: none">
                                <label id="gradLabel"
                                for="gradSemester"
                                style="display: none">Graduating Semester</label>
                            </div>
                        </div>
                        """),_display_(/*133.26*/if(authorizeMessage != null)/*133.54*/ {_display_(Seq[Any](format.raw/*133.56*/("""
                            """),format.raw/*134.29*/("""<div class="alert alert-primary" role="alert">
                            """),_display_(/*135.30*/authorizeMessage),format.raw/*135.46*/("""
                            """),format.raw/*136.29*/("""</div>
                            <br>
                        """)))}),format.raw/*138.26*/("""
                        """),format.raw/*139.25*/("""<div class="row">
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
                  DATE: 2023-03-05T16:53:32.214
                  SOURCE: C:/Users/brian/Documents/SMU/sem6/4345/portal/4345-group8/Frontend/app/views/account/profileForm.scala.html
                  HASH: 34df00230aa270aa541d416b0773b9c9d0c70873
                  MATRIX: 969->1|1105->42|1133->44|2811->1697|2826->1703|2879->1735|3188->2016|3215->2021|9621->8399|9659->8427|9700->8429|9759->8459|9864->8536|9902->8552|9961->8582|10060->8649|10115->8675
                  LINES: 28->1|33->1|34->2|60->28|60->28|60->28|64->32|64->32|165->133|165->133|165->133|166->134|167->135|167->135|168->136|170->138|171->139
                  -- GENERATED --
              */
          