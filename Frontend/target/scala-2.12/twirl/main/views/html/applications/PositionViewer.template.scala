
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
/*1.2*/import controllers.Classroom
/*2.2*/import java.util.List

object PositionViewer extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Classroom],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(classroomList: List[Classroom]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.34*/("""
"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Open Application Form</title>
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

            <div class="col s8 offset-s2">
                <div class="card col s8 offset-s2">
                    <header>
                        <strong><h1 style="font-size: 37px;
                            color: #186aad;
                            align-content: center;
                            text-align: center">Open TA Positions</h1></strong>
                    </header>

                    <div class="col s10 offset-s1">
                        <ul>
                        """),_display_(/*35.26*/for(c <- classroomList) yield /*35.49*/ {_display_(Seq[Any](format.raw/*35.51*/("""
                            """),format.raw/*36.29*/("""<li>
                                <div class="row" style="background-color: #444444;
                                    color: #FFFFFF;
                                    padding: 2em">
                                    <div class="col s7">
                                        <h5>"""),_display_(/*41.46*/(c.classID + ": " + c.classTitle)),format.raw/*41.79*/(""" """),format.raw/*41.80*/("""</h5>
                                    </div>
                                    <div class="col s3">
                                        <p>"""),_display_(/*44.45*/("Positions Available: " + c.numOpenings)),format.raw/*44.86*/("""</p>
                                    </div>
                                    <div class="col s2">
                                        <a href=""""),_display_(/*47.51*/routes/*47.57*/.TAResponseController.openResponseForm(c.classID)),format.raw/*47.106*/("""">
                                            <button class="btn">
                                                <h6>Apply</h6>
                                            </button>
                                        </a>
                                    </div>
                                </div>
                            </li>
                        """)))}),format.raw/*55.26*/("""
                        """),format.raw/*56.25*/("""</ul>
                    </div>
                </div>

            </div>
        </div>

    </body>
</html>"""))
      }
    }
  }

  def render(classroomList:List[Classroom]): play.twirl.api.HtmlFormat.Appendable = apply(classroomList)

  def f:((List[Classroom]) => play.twirl.api.HtmlFormat.Appendable) = (classroomList) => apply(classroomList)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2023-04-16T14:44:19.702
                  SOURCE: C:/Users/brian/Documents/SMU/sem6/4345/portal/4345-group8/Frontend/app/views/applications/PositionViewer.scala.html
                  HASH: b0ed20efae5db884348468bdb031465d129f2270
                  MATRIX: 664->1|700->32|1044->56|1171->88|1199->90|3028->1894|3067->1917|3107->1919|3165->1949|3490->2247|3544->2280|3573->2281|3753->2434|3815->2475|4000->2633|4015->2639|4086->2688|4496->3067|4550->3093
                  LINES: 24->1|25->2|30->3|35->3|36->4|67->35|67->35|67->35|68->36|73->41|73->41|73->41|76->44|76->44|79->47|79->47|79->47|87->55|88->56
                  -- GENERATED --
              */
          