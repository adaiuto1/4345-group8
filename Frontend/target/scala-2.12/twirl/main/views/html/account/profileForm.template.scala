
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

object profileForm extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,String,Seq[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(authorizeMessage: String, email: String, classOptions: Seq[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.70*/("""
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
                        <div id="courseworkInterface" style="display: none">
                            <div class="row">
                                <div class="col s5">
                                    <input type="text" id="courses" name="courses"
                                    readonly>
                                </div>
                                <div class="col s2">
                                    <div class="input-field">
                                        <select id="classSelector" name="classSelector" style="display: block">
                                            <option selected disabled style="color: #888888">Select...</option>
                                            """),_display_(/*143.46*/for(classOption <- classOptions) yield /*143.78*/ {_display_(Seq[Any](format.raw/*143.80*/("""
                                                """),format.raw/*144.49*/("""<option
                                                class="selectorOption"
                                                value=""""),_display_(/*146.57*/classOption),format.raw/*146.68*/(""""
                                                style="font-size: 20px;
                                                    font-weight: bold;
                                                    color: #186aad">
                                                """),_display_(/*150.50*/classOption),format.raw/*150.61*/("""
                                                """),format.raw/*151.49*/("""</option>
                                            """)))}),format.raw/*152.46*/("""
                                        """),format.raw/*153.41*/("""</select>
                                    </div>
                                </div>
                            </div>
                        </div>
                        """),_display_(/*158.26*/if(authorizeMessage != null)/*158.54*/ {_display_(Seq[Any](format.raw/*158.56*/("""
                            """),format.raw/*159.29*/("""<div class="alert alert-primary" role="alert">
                            """),_display_(/*160.30*/authorizeMessage),format.raw/*160.46*/("""
                            """),format.raw/*161.29*/("""</div>
                            <br>
                        """)))}),format.raw/*163.26*/("""
                        """),format.raw/*164.25*/("""<div class="row">
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

  def render(authorizeMessage:String,email:String,classOptions:Seq[String]): play.twirl.api.HtmlFormat.Appendable = apply(authorizeMessage,email,classOptions)

  def f:((String,String,Seq[String]) => play.twirl.api.HtmlFormat.Appendable) = (authorizeMessage,email,classOptions) => apply(authorizeMessage,email,classOptions)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2023-03-08T14:22:28.538
                  SOURCE: C:/Users/brian/Documents/SMU/sem6/4345/portal/4345-group8/Frontend/app/views/account/profileForm.scala.html
                  HASH: c3099f99858e6c023e96dcab4b8504511ecdfd06
                  MATRIX: 981->1|1144->69|1172->71|2850->1724|2865->1730|2918->1762|3227->2043|3254->2048|10373->9139|10422->9171|10463->9173|10542->9223|10707->9360|10740->9371|11035->9638|11068->9649|11147->9699|11235->9755|11306->9797|11522->9985|11560->10013|11601->10015|11660->10045|11765->10122|11803->10138|11862->10168|11961->10235|12016->10261
                  LINES: 28->1|33->1|34->2|60->28|60->28|60->28|64->32|64->32|175->143|175->143|175->143|176->144|178->146|178->146|182->150|182->150|183->151|184->152|185->153|190->158|190->158|190->158|191->159|192->160|192->160|193->161|195->163|196->164
                  -- GENERATED --
              */
          