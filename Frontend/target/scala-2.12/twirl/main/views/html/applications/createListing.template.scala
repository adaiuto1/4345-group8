
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
/*1.2*/import java.util.List

object createListing extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,List[Classroom],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(currUser: String, classList: List[Classroom]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.48*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Create TA Listing</title>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
            <!-- Compiled and minified JavaScript -->
        <script src=" https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <link rel="shortcut icon" type="image/x-icon" href="docs/images/favicon.ico" />
        <script src="/assets/javascripts/listingForm.js"></script>
        <link rel="stylesheet" href="https://unpkg.com/leaflet@1.5.1/dist/leaflet.css" integrity="sha512-xwE/Az9zrjBIphAcBb3F6JVqxf46+CDLwfLMHloNu6KEQCAWi6HcDUbeOfBIptF7tcCzusKFjFw2yuvEpDL9wQ==" crossorigin=""/>
        <script src="https://unpkg.com/leaflet@1.5.1/dist/leaflet.js" integrity="sha512-GffPMF3RvMeYyc1LWMHtK8EbPv0iNZ8/oTtHPx9/cc2ILxQ+u905qIwdpULaqDkyBKgOaB57QTMg7ztg8Jm2Og==" crossorigin=""></script>
    </head>
    <body>
        <div class="row">

            <div class="card col s8 offset-s2">
                <div class="row">
                    <header style="align-content: center;
                        text-align: center">
                        <strong><h1 style="font-size: 37px;
                            color: #186aad">Create TA Listing</h1></strong>
                    </header>
                </div>
                <form action=""""),_display_(/*28.32*/routes/*28.38*/.ListingController.createListing()),format.raw/*28.72*/("""" method="GET">
                    <input type="text" id="teacherEmail" name="teacherEmail" readonly
                    disabled style="display: none" value=""""),_display_(/*30.60*/currUser),format.raw/*30.68*/("""">
                    <input id="classroom" name="classroom"
                    readonly>
                    <div class="input-field col s2">
                        <input type="text" id="classID" name="classID" readonly
                        disabled style="display: none">
                        <h5>Select your class</h5>
                        <select style="display: block" id="targetSelector">
                        """),_display_(/*38.26*/for(c <- classList) yield /*38.45*/ {_display_(Seq[Any](format.raw/*38.47*/("""
                            """),_display_(/*39.30*/if(c.teacherEmail.toLowerCase() == currUser.toLowerCase())/*39.88*/ {_display_(Seq[Any](format.raw/*39.90*/("""
                                """),format.raw/*40.33*/("""<option value=""""),_display_(/*40.49*/c/*40.50*/.classID),format.raw/*40.58*/("""">"""),_display_(/*40.61*/c/*40.62*/.classID),format.raw/*40.70*/("""</option>
                            """)))}),format.raw/*41.30*/("""
                        """)))}),format.raw/*42.26*/("""
                        """),format.raw/*43.25*/("""</select>
                    </div>
                    <div class="row col s5">
                        <div class="row">
                            <h6>Select Course Prerequisites</h6>
                        </div>
                        <div class="col s7">
                            <input type="text" id="prereqs" name="prereqs"
                            readonly>
                        </div>
                        <div class="col s5">
                            <div class="input-field">
                                <select id="classSelector" name="classSelector" style="display: block">
                                    <option selected disabled style="color: #888888">Select...</option>
                                    """),_display_(/*57.38*/for(c <- classList) yield /*57.57*/ {_display_(Seq[Any](format.raw/*57.59*/("""
                                        """),format.raw/*58.41*/("""<option
                                        class="selectorOption"
                                        value=""""),_display_(/*60.49*/c/*60.50*/.classID),format.raw/*60.58*/(""""
                                        style="font-size: 20px;
                                            font-weight: bold;
                                            color: #186aad">
                                        """),_display_(/*64.42*/c/*64.43*/.classID),format.raw/*64.51*/("""
                                        """),format.raw/*65.41*/("""</option>
                                    """)))}),format.raw/*66.38*/("""
                                """),format.raw/*67.33*/("""</select>
                            </div>
                        </div>
                    </div>
                    <div class="col s5">
                        <input type="text" id="message" name="message">
                        <label for="message">Message</label>
                    </div>
                    <button id="api-search-button" class="btn col s4 offset-s4" type="submit">Submit</button>
                </form>

            </div>
        </div>


    </body>
</html>"""))
      }
    }
  }

  def render(currUser:String,classList:List[Classroom]): play.twirl.api.HtmlFormat.Appendable = apply(currUser,classList)

  def f:((String,List[Classroom]) => play.twirl.api.HtmlFormat.Appendable) = (currUser,classList) => apply(currUser,classList)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2023-04-17T15:37:22.553
                  SOURCE: C:/Users/brian/Documents/SMU/sem6/4345/portal/4345-group8/Frontend/app/views/applications/createListing.scala.html
                  HASH: 942954c2a4771c0044e7864602e76808c2e90645
                  MATRIX: 664->1|1014->25|1155->71|1183->73|2851->1716|2866->1722|2921->1756|3111->1919|3140->1927|3608->2368|3643->2387|3683->2389|3741->2420|3808->2478|3848->2480|3910->2514|3953->2530|3963->2531|3992->2539|4022->2542|4032->2543|4061->2551|4132->2591|4190->2618|4244->2644|5038->3411|5073->3430|5113->3432|5183->3474|5331->3595|5341->3596|5370->3604|5632->3839|5642->3840|5671->3848|5741->3890|5820->3938|5882->3972
                  LINES: 24->1|29->2|34->2|35->3|60->28|60->28|60->28|62->30|62->30|70->38|70->38|70->38|71->39|71->39|71->39|72->40|72->40|72->40|72->40|72->40|72->40|72->40|73->41|74->42|75->43|89->57|89->57|89->57|90->58|92->60|92->60|92->60|96->64|96->64|96->64|97->65|98->66|99->67
                  -- GENERATED --
              */
          