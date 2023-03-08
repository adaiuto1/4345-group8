
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
/*1.2*/import com.fasterxml.jackson.databind.node.ObjectNode
/*2.2*/import com.fasterxml.jackson.databind.JsonNode

object editProfileForm extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[JsonNode,Seq[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(curr: JsonNode, classOptions: Seq[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.45*/("""
"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <title>Edit Profile</title>
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
                <strong>Edit Profile</strong>
            </h1>
        </header>
        <div class="row">
            <div class="card col s10 offset-s1 ">
                <form action=""""),_display_(/*30.32*/routes/*30.38*/.HomeController.editProfileHandler()),format.raw/*30.74*/("""" method="GET">
                    <div class="card-panel">
                        <div class="row" name="row-1">
                            <div class="input-field col s3">
                                <input id="email" name="email" type="text" class="validate" value=""""),_display_(/*34.101*/curr/*34.105*/.get("email").textValue()),format.raw/*34.130*/("""" readonly>
                                <label for="email">Email</label>
                            </div>
                        </div>
                        <div class="row" name="row-2">
                            <div class="input-field col s1">
                                <select style="display: block" id="title" name="title"
                                value=""""),_display_(/*41.41*/curr/*41.45*/.get("title").textValue()),format.raw/*41.70*/("""">
                                    <option value="Mr.">Mr.</option>
                                    <option value="Ms.">Ms.</option>
                                    <option value="Mrs.">Mrs.</option>
                                    <option value="Dr.">Dr.</option>
                                </select>
                            </div>
                            <div class="input-field col s3">
                                <input id="firstname" name="firstname" type="text" value=""""),_display_(/*49.92*/curr/*49.96*/.get("firstname").textValue()),format.raw/*49.125*/("""" required>
                                <label for="firstname">First Name</label>
                            </div>
                            <div class="input-field col s3">
                                <input id="lastname" name="lastname" type="text" class="validate" value=""""),_display_(/*53.107*/curr/*53.111*/.get("lastname").textValue()),format.raw/*53.139*/("""" required>
                                <label for="lastname">Last Name</label>
                            </div>
                            <div class="input-field col s2">
                                <input id="phone" name="phone" type="text" class="validate" value=""""),_display_(/*57.101*/curr/*57.105*/.get("phone").textValue()),format.raw/*57.130*/("""" required>
                                <label for="phone">Phone Number</label>
                            </div>
                            <div class="input-field col s2">
                                <input id="fax" name="fax" value=""""),_display_(/*61.68*/curr/*61.72*/.get("fax").textValue()),format.raw/*61.95*/("""" type="text">
                                <label for="fax">Fax (Optional)</label>
                            </div>
                        </div>
                        <div class="row" name="row-3">
                            <div class="input-field col s4">
                                <input id="address" name="address" type="text" value=""""),_display_(/*67.88*/curr/*67.92*/.get("address").textValue()),format.raw/*67.119*/("""" required>
                                <label for="address">Street Address</label>
                            </div>
                            <div class="input-field col s2">
                                <input id="city" name="city" type="text" value=""""),_display_(/*71.82*/curr/*71.86*/.get("city").textValue()),format.raw/*71.110*/("""" required>
                                <label for="city">City</label>
                            </div>
                            <div class="input-field col s1">
                                <select style="display: block" id="state" name="state" value=""""),_display_(/*75.96*/curr/*75.100*/.get("state").textValue()),format.raw/*75.125*/("""" required>
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
                                    <option value=""""),_display_(/*99.53*/curr/*99.57*/.get("status").textValue()),format.raw/*99.83*/("""">"""),_display_(/*99.86*/curr/*99.90*/.get("status").textValue()),format.raw/*99.116*/("""</option>
                                    <option value="Student">Student</option>
                                    <option value="Faculty">Faculty</option>
                                    <option value="Staff">Staff</option>
                                </select>
                            </div>
                            <div style="""),_display_(/*105.41*/if(curr.get("status").textValue() != "Student")/*105.88*/ {_display_(Seq[Any](format.raw/*105.90*/(""""display: none"""")))}),format.raw/*105.106*/(""">
                                <div class="input-field col s3" >
                                    <select
                                    id="degree" name="degree"
                                    style="display: block">
                                        <option value=""""),_display_(/*110.57*/curr/*110.61*/.get("degree").textValue()),format.raw/*110.87*/("""">"""),_display_(/*110.90*/curr/*110.94*/.get("degree").textValue()),format.raw/*110.120*/("""</option>
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
                                    value=""""),_display_(/*124.45*/curr/*124.49*/.get("startingSemester").textValue()),format.raw/*124.85*/("""">
                                    <label id="startLabel"
                                    for="startingSemester">Starting Semester</label>
                                </div>
                                <div class="input-field col s3">
                                    <input id="gradSemester"
                                    name="gradSemester"
                                    type="text"
                                    value=""""),_display_(/*132.45*/curr/*132.49*/.get("gradSemester").textValue()),format.raw/*132.81*/("""">
                                    <label id="gradLabel"
                                    for="gradSemester">Graduating Semester</label>
                                </div>
                            </div>
                            <div id="courseworkInterface"
                            >
                                <div class="row">
                                    <div class="col s5">
                                        <input type="text" id="courses" name="courses"
                                        value=""""),_display_(/*142.49*/curr/*142.53*/.get("courses").textValue()),format.raw/*142.80*/(""""
                                        readonly>
                                    </div>
                                    <div class="col s2">
                                        <div class="input-field">
                                            <select id="classSelector" name="classSelector" style="display: block">
                                                <option selected disabled style="color: #888888">Select...</option>
                                                """),_display_(/*149.50*/for(classOption <- classOptions) yield /*149.82*/ {_display_(Seq[Any](format.raw/*149.84*/("""
                                                    """),format.raw/*150.53*/("""<option
                                                    class="selectorOption"
                                                    value=""""),_display_(/*152.61*/classOption),format.raw/*152.72*/(""""
                                                    style="font-size: 20px;
                                                        font-weight: bold;
                                                        color: #186aad">
                                                    """),_display_(/*156.54*/classOption),format.raw/*156.65*/("""
                                                    """),format.raw/*157.53*/("""</option>
                                                """)))}),format.raw/*158.50*/("""
                                            """),format.raw/*159.45*/("""</select>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="row">
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

  def render(curr:JsonNode,classOptions:Seq[String]): play.twirl.api.HtmlFormat.Appendable = apply(curr,classOptions)

  def f:((JsonNode,Seq[String]) => play.twirl.api.HtmlFormat.Appendable) = (curr,classOptions) => apply(curr,classOptions)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2023-03-08T15:48:37.891
                  SOURCE: C:/Users/brian/Documents/SMU/sem6/4345/portal/4345-group8/Frontend/app/views/account/editProfileForm.scala.html
                  HASH: 28c4211d9a6bc2f02534e31274e7f08c009422d8
                  MATRIX: 659->1|720->57|1095->106|1233->149|1261->151|2935->1800|2950->1806|3007->1842|3316->2123|3330->2127|3377->2152|3797->2545|3810->2549|3856->2574|4401->3092|4414->3096|4465->3125|4785->3417|4799->3421|4849->3449|5161->3733|5175->3737|5222->3762|5500->4013|5513->4017|5557->4040|5946->4402|5959->4406|6008->4433|6304->4702|6317->4706|6363->4730|6660->5000|6674->5004|6721->5029|8294->6575|8307->6579|8354->6605|8384->6608|8397->6612|8445->6638|8833->6998|8890->7045|8931->7047|8980->7063|9303->7358|9317->7362|9365->7388|9396->7391|9410->7395|9459->7421|10443->8377|10457->8381|10515->8417|11011->8885|11025->8889|11079->8921|11665->9479|11679->9483|11728->9510|12262->10016|12311->10048|12352->10050|12435->10104|12608->10249|12641->10260|12952->10543|12985->10554|13068->10608|13160->10668|13235->10714
                  LINES: 24->1|25->2|30->3|35->3|36->4|62->30|62->30|62->30|66->34|66->34|66->34|73->41|73->41|73->41|81->49|81->49|81->49|85->53|85->53|85->53|89->57|89->57|89->57|93->61|93->61|93->61|99->67|99->67|99->67|103->71|103->71|103->71|107->75|107->75|107->75|131->99|131->99|131->99|131->99|131->99|131->99|137->105|137->105|137->105|137->105|142->110|142->110|142->110|142->110|142->110|142->110|156->124|156->124|156->124|164->132|164->132|164->132|174->142|174->142|174->142|181->149|181->149|181->149|182->150|184->152|184->152|188->156|188->156|189->157|190->158|191->159
                  -- GENERATED --
              */
          