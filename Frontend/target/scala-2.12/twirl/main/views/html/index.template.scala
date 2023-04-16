
package views.html

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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[JsonNode,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(curr: JsonNode, message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.35*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
    <head>
        <title>"""),_display_(/*6.17*/curr/*6.21*/.get("status").textValue()),format.raw/*6.47*/(""" """),format.raw/*6.48*/("""TA Portal</title>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="../../public/stylesheets/index.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
            <!-- Compiled and minified JavaScript -->
        <script src=" https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <link rel="shortcut icon" type="image/x-icon" href="docs/images/favicon.ico" />
        <script src="https://unpkg.com/leaflet@1.5.1/dist/leaflet.js" integrity="sha512-GffPMF3RvMeYyc1LWMHtK8EbPv0iNZ8/oTtHPx9/cc2ILxQ+u905qIwdpULaqDkyBKgOaB57QTMg7ztg8Jm2Og==" crossorigin=""></script>
    </head>
    <body style="background-color: #555555">
        <header>
            <div class="row">
                <div class="card col s6 offset-s3" style="text-align: center">
                    <div class="row">
                        <h1 style="font-size: 37px;
                            color: #57a957">
                            <strong>"""),_display_(/*22.38*/curr/*22.42*/.get("status").textValue()),format.raw/*22.68*/(""" """),format.raw/*22.69*/("""TA Portal</strong>
                        </h1>
                    </div>
                    <div class="row">
                        <p style="font-size: 20px;
                            color: #3F51B5">"""),_display_(/*27.46*/(curr.get("firstname").textValue() + " " + curr.get("lastname").textValue())),format.raw/*27.122*/("""</p>
                    </div>
                </div>
            </div>
        </header>
        <div class="row ">
            <div class="card col s6 offset-s3" style="padding: 3em">
                <div class="row">
                    <a href=""""),_display_(/*35.31*/routes/*35.37*/.ApplicationController.openApplicationForm()),format.raw/*35.81*/("""" class="btn b-primary" style="width: 100%;
                        height: max-content;
                        padding: 0.5em;">
                        <div>
                            <div class="col s4">
                                <img src="https://static.thenounproject.com/png/2505633-200.png"
                                style="height: 8em;
                                    margin-top: 1em">
                            </div>
                            <div class="col s8">
                                <div class="row" style="text-align: left">
                                    <h1 style="font-size: 2em">Create Open TA Application</h1>
                                    <p class="flow-text" style="font-size: 1em;
                                        line-height: 1.2em">
                                        Publish your skills and select courses you wish to TA for. Your candidacy will be reviewed by professors and you will hear back shortly!</p>
                                </div>
                            </div>
                        </div>
                    </a>
                </div>
                <div class="row">
                    <a href=""""),_display_(/*56.31*/routes/*56.37*/.HomeController.openPositionViewer()),format.raw/*56.73*/("""" class="btn" style="width: 100%;
                        height: max-content;
                        padding: 0.5em">
                        <div>
                            <div class="col s4">
                                <img src="https://static.thenounproject.com/png/3785157-200.png"
                                style="height: 5em;
                                    margin-top: 3em">
                            </div>
                            <div class="col s8">
                                <div class="row" style="text-align: left">
                                    <h1 style="font-size: 2em">Browse Available Positions</h1>
                                    <p class="flow-text" style="font-size: 1em;
                                        line-height: 1.2em">
                                        View classrooms with open TA positions</p>
                                </div>
                            </div>
                        </div>
                    </a>
                </div>
                <div class="row">
                    <div class="col s6">
                        <a href="" class="btn" style="width: 100%;
                            height: 18%;
                            padding: 0.5em">
                            <div>
                                <div class="col s2">
                                    <img src="https://static.thenounproject.com/png/5633225-200.png"
                                    style="height: 5em;
                                        margin-top: 1.5em">
                                </div>
                                <div class="col s8 offset-s1">
                                    <div class="row" style="text-align: left">
                                        <h1 style="font-size: 2em">Inbox</h1>
                                        <p class="flow-text" style="font-size: 1em;
                                            line-height: 1.2em">
                                        </p>
                                    </div>
                                </div>
                            </div>
                        </a>
                    </div>
                    <div class="col s6">
                        <a href=""""),_display_(/*99.35*/routes/*99.41*/.HomeController.openProfileView(curr.get("email").textValue())),format.raw/*99.103*/("""" class="btn" style="width: 100%;
                            height: 18%;
                            padding: 0.5em">
                            <div>
                                <div class="col s2">
                                    <img src="https://static.thenounproject.com/png/4584119-200.png"
                                    style="height: 5em;
                                        margin-top: 1.5em">
                                </div>
                                <div class="col s8 offset-s1">
                                    <div class="row" style="text-align: left">
                                        <h1 style="font-size: 2em">My Profile</h1>
                                    </div>
                                </div>
                            </div>
                        </a>
                    </div>
                </div>
            </div>
        </div>

    </body>
</html>
"""))
      }
    }
  }

  def render(curr:JsonNode,message:String): play.twirl.api.HtmlFormat.Appendable = apply(curr,message)

  def f:((JsonNode,String) => play.twirl.api.HtmlFormat.Appendable) = (curr,message) => apply(curr,message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2023-04-16T14:06:37.065
                  SOURCE: C:/Users/brian/Documents/SMU/sem6/4345/portal/4345-group8/Frontend/app/views/index.scala.html
                  HASH: 252667dae1f842ec94c0cd405661cd3299147c52
                  MATRIX: 651->1|1011->50|1139->83|1167->85|1246->138|1258->142|1304->168|1332->169|2588->1399|2601->1403|2648->1429|2677->1430|2919->1645|3017->1721|3304->1981|3319->1987|3384->2031|4638->3258|4653->3264|4710->3300|7046->5609|7061->5615|7145->5677
                  LINES: 24->1|29->2|34->2|35->3|38->6|38->6|38->6|38->6|54->22|54->22|54->22|54->22|59->27|59->27|67->35|67->35|67->35|88->56|88->56|88->56|131->99|131->99|131->99
                  -- GENERATED --
              */
          