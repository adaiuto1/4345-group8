
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
        <header class="topbar" style="align-content: center;
            text-align: center">
            <h1 class="focused" style="font-size: 37px;
                color: #57a957;
                text-align: center">
                <strong>Edit Profile</strong>
            </h1>
            <a href=""""),_display_(/*28.23*/routes/*28.29*/.HomeController.changePassword()),format.raw/*28.61*/("""">
                <button>Change Password</button>
            </a>
        </header>
        <div class="row">
            <div class="card col s10 offset-s1 ">
                <form action=""""),_display_(/*34.32*/routes/*34.38*/.HomeController.editProfileHandler()),format.raw/*34.74*/("""" method="GET">
                    <div class="card-panel">
                        <div class="row" name="row-1">
                            <div class="input-field col s3">
                                <input id="email" name="email" type="text" class="validate" value=""""),_display_(/*38.101*/curr/*38.105*/.get("email").textValue()),format.raw/*38.130*/("""" readonly>
                                <label for="email">Email</label>
                            </div>
                        </div>
                        <div class="row" name="row-2">
                            <div class="input-field col s1">
                                <select style="display: block" id="title" name="title"
                                value=""""),_display_(/*45.41*/curr/*45.45*/.get("title").textValue()),format.raw/*45.70*/("""">
                                    <option value="Mr.">Mr.</option>
                                    <option value="Ms.">Ms.</option>
                                    <option value="Mrs.">Mrs.</option>
                                    <option value="Dr.">Dr.</option>
                                </select>
                            </div>
                            <div class="input-field col s3">
                                <input id="firstname" name="firstname" type="text" value=""""),_display_(/*53.92*/curr/*53.96*/.get("firstname").textValue()),format.raw/*53.125*/("""" required>
                                <label for="firstname">First Name</label>
                            </div>
                            <div class="input-field col s3">
                                <input id="lastname" name="lastname" type="text" class="validate" value=""""),_display_(/*57.107*/curr/*57.111*/.get("lastname").textValue()),format.raw/*57.139*/("""" required>
                                <label for="lastname">Last Name</label>
                            </div>
                            <div class="input-field col s2">
                                <input id="phone" name="phone" type="text" class="validate" value=""""),_display_(/*61.101*/curr/*61.105*/.get("phone").textValue()),format.raw/*61.130*/("""" required>
                                <label for="phone">Phone Number</label>
                            </div>
                            <div class="input-field col s2">
                                <input id="fax" name="fax" value=""""),_display_(/*65.68*/curr/*65.72*/.get("fax").textValue()),format.raw/*65.95*/("""" type="text">
                                <label for="fax">Fax (Optional)</label>
                            </div>
                        </div>
                        <div class="row" name="row-3">
                            <div class="input-field col s4">
                                <input id="address" name="address" type="text" value=""""),_display_(/*71.88*/curr/*71.92*/.get("address").textValue()),format.raw/*71.119*/("""" required>
                                <label for="address">Street Address</label>
                            </div>
                            <div class="input-field col s2">
                                <input id="city" name="city" type="text" value=""""),_display_(/*75.82*/curr/*75.86*/.get("city").textValue()),format.raw/*75.110*/("""" required>
                                <label for="city">City</label>
                            </div>
                            <div class="input-field col s1">
                                <select style="display: block" id="state" name="state" value=""""),_display_(/*79.96*/curr/*79.100*/.get("state").textValue()),format.raw/*79.125*/("""" required>
                                    <option value="TX">TX</option>
                                    <option value="CA">CA</option>
                                </select>
                            </div>
                            <div class="input-field col s2">
                                <input id="zip" name="zip" type="text" value=""""),_display_(/*85.80*/curr/*85.84*/.get("zip").textValue()),format.raw/*85.107*/("""" required>
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
                                    <option value=""""),_display_(/*103.53*/curr/*103.57*/.get("status").textValue()),format.raw/*103.83*/("""">"""),_display_(/*103.86*/curr/*103.90*/.get("status").textValue()),format.raw/*103.116*/("""</option>
                                    <option value="Student">Student</option>
                                    <option value="Faculty">Faculty</option>
                                    <option value="Staff">Staff</option>
                                </select>
                            </div>
                            <div style="""),_display_(/*109.41*/if(curr.get("status").textValue() != "Student")/*109.88*/ {_display_(Seq[Any](format.raw/*109.90*/(""""display: none"""")))}),format.raw/*109.106*/(""">
                                <div class="input-field col s3" >
                                    <select
                                    id="degree" name="degree"
                                    style="display: block">
                                        <option value=""""),_display_(/*114.57*/curr/*114.61*/.get("degree").textValue()),format.raw/*114.87*/("""">"""),_display_(/*114.90*/curr/*114.94*/.get("degree").textValue()),format.raw/*114.120*/("""</option>
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
                                    value=""""),_display_(/*128.45*/curr/*128.49*/.get("startingSemester").textValue()),format.raw/*128.85*/("""">
                                    <label id="startLabel"
                                    for="startingSemester">Starting Semester</label>
                                </div>
                                <div class="input-field col s3">
                                    <input id="gradSemester"
                                    name="gradSemester"
                                    type="text"
                                    value=""""),_display_(/*136.45*/curr/*136.49*/.get("gradSemester").textValue()),format.raw/*136.81*/("""">
                                    <label id="gradLabel"
                                    for="gradSemester">Graduating Semester</label>
                                </div>
                            </div>
                            <div id="courseworkInterface"
                            >
                                <div class="row">
                                    <div class="col s5">
                                        <input type="text" id="courses" name="courses"
                                        value=""""),_display_(/*146.49*/curr/*146.53*/.get("courses").textValue()),format.raw/*146.80*/(""""
                                        readonly>
                                    </div>
                                    <div class="col s2">
                                        <div class="input-field">
                                            <select id="classSelector" name="classSelector" style="display: block">
                                                <option selected disabled style="color: #888888">Select...</option>
                                                """),_display_(/*153.50*/for(classOption <- classOptions) yield /*153.82*/ {_display_(Seq[Any](format.raw/*153.84*/("""
                                                    """),format.raw/*154.53*/("""<option
                                                    class="selectorOption"
                                                    value=""""),_display_(/*156.61*/classOption),format.raw/*156.72*/(""""
                                                    style="font-size: 20px;
                                                        font-weight: bold;
                                                        color: #186aad">
                                                    """),_display_(/*160.54*/classOption),format.raw/*160.65*/("""
                                                    """),format.raw/*161.53*/("""</option>
                                                """)))}),format.raw/*162.50*/("""
                                            """),format.raw/*163.45*/("""</select>
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
                  DATE: 2023-04-04T11:37:56.921
                  SOURCE: C:/Users/brian/Documents/SMU/sem6/4345/portal/4345-group8/Frontend/app/views/account/editProfileForm.scala.html
                  HASH: 940c46c9051aebfc3c15b7b287a1127ce8a9034f
                  MATRIX: 659->1|720->57|1095->106|1233->149|1261->151|2892->1757|2907->1763|2960->1795|3187->1995|3202->2001|3259->2037|3568->2318|3582->2322|3629->2347|4049->2740|4062->2744|4108->2769|4653->3287|4666->3291|4717->3320|5037->3612|5051->3616|5101->3644|5413->3928|5427->3932|5474->3957|5752->4208|5765->4212|5809->4235|6198->4597|6211->4601|6260->4628|6556->4897|6569->4901|6615->4925|6912->5195|6926->5199|6973->5224|7369->5593|7382->5597|7427->5620|8642->6807|8656->6811|8704->6837|8735->6840|8749->6844|8798->6870|9186->7230|9243->7277|9284->7279|9333->7295|9656->7590|9670->7594|9718->7620|9749->7623|9763->7627|9812->7653|10796->8609|10810->8613|10868->8649|11364->9117|11378->9121|11432->9153|12018->9711|12032->9715|12081->9742|12615->10248|12664->10280|12705->10282|12788->10336|12961->10481|12994->10492|13305->10775|13338->10786|13421->10840|13513->10900|13588->10946
                  LINES: 24->1|25->2|30->3|35->3|36->4|60->28|60->28|60->28|66->34|66->34|66->34|70->38|70->38|70->38|77->45|77->45|77->45|85->53|85->53|85->53|89->57|89->57|89->57|93->61|93->61|93->61|97->65|97->65|97->65|103->71|103->71|103->71|107->75|107->75|107->75|111->79|111->79|111->79|117->85|117->85|117->85|135->103|135->103|135->103|135->103|135->103|135->103|141->109|141->109|141->109|141->109|146->114|146->114|146->114|146->114|146->114|146->114|160->128|160->128|160->128|168->136|168->136|168->136|178->146|178->146|178->146|185->153|185->153|185->153|186->154|188->156|188->156|192->160|192->160|193->161|194->162|195->163
                  -- GENERATED --
              */
          