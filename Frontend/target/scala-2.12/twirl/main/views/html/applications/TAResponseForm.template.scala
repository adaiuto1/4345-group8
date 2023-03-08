
package views.html.applications

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
/*2.2*/import com.fasterxml.jackson.databind.node.ObjectNode

object TAResponseForm extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[JsonNode,ObjectNode,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(targetClass: JsonNode, user: ObjectNode):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.43*/("""
"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>TA Application Form</title>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
            <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <link rel="shortcut icon" type="image/x-icon" href="docs/images/favicon.ico" />
        <link rel="stylesheet" href="https://unpkg.com/leaflet@1.5.1/dist/leaflet.css" integrity="sha512-xwE/Az9zrjBIphAcBb3F6JVqxf46+CDLwfLMHloNu6KEQCAWi6HcDUbeOfBIptF7tcCzusKFjFw2yuvEpDL9wQ==" crossorigin=""/>
        <script src="https://unpkg.com/leaflet@1.5.1/dist/leaflet.js" integrity="sha512-GffPMF3RvMeYyc1LWMHtK8EbPv0iNZ8/oTtHPx9/cc2ILxQ+u905qIwdpULaqDkyBKgOaB57QTMg7ztg8Jm2Og==" crossorigin=""></script>

    </head>
    <body>
        <div class="row">
            <div class="card col s8 offset-s2">
                <h1 style="font-size: 37px;
                    color: #186aad">
                    <strong>TA Application</strong>
                </h1>
                <h1 style="font-size: 24px;
                    color: #186aad">
                    <strong>"""),_display_(/*28.30*/targetClass/*28.41*/.get("classID").textValue()),format.raw/*28.68*/(""": """),_display_(/*28.71*/targetClass/*28.82*/.get("classTitle").textValue()),format.raw/*28.112*/("""</strong>
                </h1>
                <h2 style="font-size: 18px;
                    color: #186aad">
                    Instructor: """),_display_(/*32.34*/targetClass/*32.45*/.get("teacherEmail").textValue()),format.raw/*32.77*/("""
                """),format.raw/*33.17*/("""</h2>
                <form action=""""),_display_(/*34.32*/routes/*34.38*/.TAResponseController.TAResponseHandler()),format.raw/*34.79*/("""" method="GET">

                    <div class="card-panel">
                        <div>
                            <h2 style="font-size: 1.5em;
                                color: #186aad;
                                margin-top: 0.5em">Application Form</h2>
                            <p>Please submit your application to this open TA position using the form below. Note that some fields are mandatory</p>
                        </div>
                        <div>
                            <div class="row">
                                <div class="input-field col s2">
                                    <input type="text" id="applicantEmail" name="applicantEmail" value=""""),_display_(/*46.106*/user/*46.110*/.get("email").asText()),format.raw/*46.132*/("""" readonly>
                                    <input type="text" id="teacherEmail" name="teacherEmail" value=""""),_display_(/*47.102*/targetClass/*47.113*/.get("teacherEmail").textValue()),format.raw/*47.145*/("""" readonly style="display: none">
                                </div>

                                <div class="input-field col s2">
                                    <input id="applicantFirstName" value=""""),_display_(/*51.76*/user/*51.80*/.get("firstname").asText()),format.raw/*51.106*/("""" readonly>
                                </div>
                                <div class="input-field col s2">
                                    <input id="applicantLastName" value=""""),_display_(/*54.75*/user/*54.79*/.get("lastname").asText()),format.raw/*54.104*/("""" readonly>
                                </div>
                            </div>
                            <div class="row">
                                <input id="classID" name="classID" type="text" value=""""),_display_(/*58.88*/targetClass/*58.99*/.get("classID").textValue()),format.raw/*58.126*/("""" readonly style="display: none">
                                <input id="coursework" name="coursework" type="text" value=""""),_display_(/*59.94*/user/*59.98*/.get("courses").asText()),format.raw/*59.122*/("""" readonly style="display: none">
                                <input id="message" name="message" type="text">
                                <label for="message">Tell the instructor about yourself and your goals!</label>
                            </div>
                            <div class="row">
                                <button id="api-search-button" class="btn col s4 offset-s4" type="submit">Submit</button>
                            </div>
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

  def render(targetClass:JsonNode,user:ObjectNode): play.twirl.api.HtmlFormat.Appendable = apply(targetClass,user)

  def f:((JsonNode,ObjectNode) => play.twirl.api.HtmlFormat.Appendable) = (targetClass,user) => apply(targetClass,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2023-03-08T14:00:45.283
                  SOURCE: C:/Users/brian/Documents/SMU/sem6/4345/portal/4345-group8/Frontend/app/views/applications/TAResponseForm.scala.html
                  HASH: 9c9eeb3fdde418d855cae2c28d6f57b1b7882b71
                  MATRIX: 664->1|718->50|1098->106|1234->147|1262->149|2866->1728|2886->1739|2934->1766|2964->1769|2984->1780|3036->1810|3213->1960|3233->1971|3286->2003|3332->2021|3397->2059|3412->2065|3474->2106|4210->2814|4224->2818|4268->2840|4410->2954|4431->2965|4485->2997|4730->3215|4743->3219|4791->3245|5011->3438|5024->3442|5071->3467|5321->3690|5341->3701|5390->3728|5545->3856|5558->3860|5604->3884
                  LINES: 24->1|25->2|30->3|35->3|36->4|60->28|60->28|60->28|60->28|60->28|60->28|64->32|64->32|64->32|65->33|66->34|66->34|66->34|78->46|78->46|78->46|79->47|79->47|79->47|83->51|83->51|83->51|86->54|86->54|86->54|90->58|90->58|90->58|91->59|91->59|91->59
                  -- GENERATED --
              */
          