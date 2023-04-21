
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
                """),_display_(/*34.18*/if(curr.get("status").textValue() == "Student")/*34.65*/ {_display_(Seq[Any](format.raw/*34.67*/("""
                    """),format.raw/*35.21*/("""<div class="row">
                        <a href=""""),_display_(/*36.35*/routes/*36.41*/.ApplicationController.openApplicationForm()),format.raw/*36.85*/("""" class="btn b-primary" style="width: 100%;
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
                """)))}),format.raw/*56.18*/("""
                """),_display_(/*57.18*/if(curr.get("status").textValue() == "Faculty")/*57.65*/ {_display_(Seq[Any](format.raw/*57.67*/("""
                    """),format.raw/*58.21*/("""<div class="row">
                        <a href=""""),_display_(/*59.35*/routes/*59.41*/.ListingController.loadListingForm()),format.raw/*59.77*/("""" class="btn b-primary" style="width: 100%;
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
                                        <h1 style="font-size: 2em">Create TA Listing</h1>
                                        <p class="flow-text" style="font-size: 1em;
                                            line-height: 1.2em">
                                            Create a TA job listing for students
                                        </p>
                                    </div>
                                </div>
                            </div>
                        </a>
                    </div>
                """)))}),format.raw/*80.18*/("""
            """),format.raw/*81.13*/("""<div class="row">
                """),_display_(/*82.18*/if(curr.get("status").textValue() == "Student")/*82.65*/ {_display_(Seq[Any](format.raw/*82.67*/("""
                    """),format.raw/*83.21*/("""<a href=""""),_display_(/*83.31*/routes/*83.37*/.HomeController.openPositionViewer()),format.raw/*83.73*/("""" class="btn" style="width: 100%;
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
                """)))}),format.raw/*102.18*/("""
                """),_display_(/*103.18*/if(curr.get("status").textValue() == "Faculty")/*103.65*/ {_display_(Seq[Any](format.raw/*103.67*/("""
                    """),format.raw/*104.21*/("""<div class="row">
                        <a href=""""),_display_(/*105.35*/routes/*105.41*/.ApplicationController.openApplicationForm()),format.raw/*105.85*/("""" class="btn b-primary" style="width: 100%;
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
                                        <h1 style="font-size: 2em">Review TA Applicants</h1>
                                        <p class="flow-text" style="font-size: 1em;
                                            line-height: 1.2em">
                                            View and approve students who applied to your TA listings
                                        </p>
                                    </div>
                                </div>
                            </div>
                        </a>
                    </div>
                """)))}),format.raw/*126.18*/("""
            """),format.raw/*127.13*/("""</div>
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
                    <a href=""""),_display_(/*151.31*/routes/*151.37*/.HomeController.openProfileView(curr.get("email").textValue())),format.raw/*151.99*/("""" class="btn" style="width: 100%;
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
                  DATE: 2023-04-17T12:24:05.163
                  SOURCE: C:/Users/brian/Documents/SMU/sem6/4345/portal/4345-group8/Frontend/app/views/index.scala.html
                  HASH: 65057091830f257e4e52d42016627eb3905c8c41
                  MATRIX: 651->1|1011->50|1139->83|1167->85|1246->138|1258->142|1304->168|1332->169|2588->1399|2601->1403|2648->1429|2677->1430|2919->1645|3017->1721|3256->1933|3312->1980|3352->1982|3402->2004|3482->2057|3497->2063|3562->2107|4848->3362|4894->3381|4950->3428|4990->3430|5040->3452|5120->3505|5135->3511|5192->3547|6411->4735|6453->4749|6516->4785|6572->4832|6612->4834|6662->4856|6699->4866|6714->4872|6771->4908|7849->5954|7896->5973|7953->6020|7994->6022|8045->6044|8126->6097|8142->6103|8208->6147|9452->7359|9495->7373|10695->8545|10711->8551|10795->8613
                  LINES: 24->1|29->2|34->2|35->3|38->6|38->6|38->6|38->6|54->22|54->22|54->22|54->22|59->27|59->27|66->34|66->34|66->34|67->35|68->36|68->36|68->36|88->56|89->57|89->57|89->57|90->58|91->59|91->59|91->59|112->80|113->81|114->82|114->82|114->82|115->83|115->83|115->83|115->83|134->102|135->103|135->103|135->103|136->104|137->105|137->105|137->105|158->126|159->127|183->151|183->151|183->151
                  -- GENERATED --
              */
          