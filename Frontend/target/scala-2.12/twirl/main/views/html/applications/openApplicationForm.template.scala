
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

object openApplicationForm extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Profile,String,Seq[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currUser: Profile, message: String, classOptions: Seq[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.65*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <title>Open Application Form</title>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
        <script src="/assets/javascripts/openApplicationForm.js"></script>
            <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <link rel="shortcut icon" type="image/x-icon" href="docs/images/favicon.ico" />
        <link rel="stylesheet" href="https://unpkg.com/leaflet@1.5.1/dist/leaflet.css" integrity="sha512-xwE/Az9zrjBIphAcBb3F6JVqxf46+CDLwfLMHloNu6KEQCAWi6HcDUbeOfBIptF7tcCzusKFjFw2yuvEpDL9wQ==" crossorigin=""/>
        <script src="https://unpkg.com/leaflet@1.5.1/dist/leaflet.js" integrity="sha512-GffPMF3RvMeYyc1LWMHtK8EbPv0iNZ8/oTtHPx9/cc2ILxQ+u905qIwdpULaqDkyBKgOaB57QTMg7ztg8Jm2Og==" crossorigin=""></script>
    </head>
    <body>
        <div class="row">
            <div class="card col s8 offset-s2">
                <div class="row">
                    <div class="col s6">
                        <h1 style="font-size: 37px;
                            color: #186aad">
                            <strong>Open Application Form</strong>
                        </h1>
                        <p>Select what classes you wish to TA for, and our staff will respond shortly!</p>
                    </div>
                    <div class="col s5" style="padding: 1em">
                        <div class="row" name="infoRow1">
                            <div class="col s6">
                                <h5 style="color: #186aad;">
                                    <strong>"""),_display_(/*33.46*/currUser/*33.54*/.firstname),format.raw/*33.64*/(""" """),_display_(/*33.66*/currUser/*33.74*/.lastname),format.raw/*33.83*/("""</strong>
                                </h5>
                                <h6>"""),_display_(/*35.38*/currUser/*35.46*/.degree),format.raw/*35.53*/("""</h6>
                                <h6 style="font-size: 1em">"""),_display_(/*36.61*/currUser/*36.69*/.startingSemester),format.raw/*36.86*/(""" """),format.raw/*36.87*/("""- """),_display_(/*36.90*/currUser/*36.98*/.gradSemester),format.raw/*36.111*/("""</h6>
                            </div>
                            <div class="col s6">
                                <input id="studentEmail" value=""""),_display_(/*39.66*/currUser/*39.74*/.email),format.raw/*39.80*/("""" readonly>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="card-panel">
                    <form action=""""),_display_(/*45.36*/routes/*45.42*/.ApplicationController.ApplicationHandler()),format.raw/*45.85*/("""" method="GET">
                        <div class="row">
                            <div class="col s3">
                                <h6>Previous Coursework</h6>
                            </div>
                        </div>
                        <div class="row">

                            <div class="col s2">
                                <div class="input-field">
                                    <select id="classSelector" name="classSelector" style="display: block">
                                        <option selected disabled style="color: #888888">Select...</option>
                                        """),_display_(/*57.42*/for(classOption <- classOptions) yield /*57.74*/ {_display_(Seq[Any](format.raw/*57.76*/("""
                                            """),format.raw/*58.45*/("""<option value=""""),_display_(/*58.61*/classOption),format.raw/*58.72*/("""">"""),_display_(/*58.75*/classOption),format.raw/*58.86*/("""</option>
                                        """)))}),format.raw/*59.42*/("""
                                    """),format.raw/*60.37*/("""</select>
                                </div>
                            </div>
                            <div class="col s5">
                                <input type="text" id="classDisplay"
                                required readonly
                                value=""""),_display_(/*66.41*/currUser/*66.49*/.courses),format.raw/*66.57*/("""">
                            </div>
                        </div>


                    </form>
                </div>
            </div>
        </div>
    </body>
</html>"""))
      }
    }
  }

  def render(currUser:Profile,message:String,classOptions:Seq[String]): play.twirl.api.HtmlFormat.Appendable = apply(currUser,message,classOptions)

  def f:((Profile,String,Seq[String]) => play.twirl.api.HtmlFormat.Appendable) = (currUser,message,classOptions) => apply(currUser,message,classOptions)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2023-03-06T14:16:29.507
                  SOURCE: C:/Users/brian/Documents/SMU/sem6/4345/portal/4345-group8/Frontend/app/views/applications/openApplicationForm.scala.html
                  HASH: 48c3c706480311734f812d5ff0c3a68dabcdabf7
                  MATRIX: 995->1|1153->64|1181->66|3282->2142|3299->2150|3330->2160|3359->2162|3376->2170|3406->2179|3520->2266|3537->2274|3565->2281|3659->2348|3676->2356|3714->2373|3743->2374|3773->2377|3790->2385|3825->2398|4010->2556|4027->2564|4054->2570|4291->2780|4306->2786|4370->2829|5050->3482|5098->3514|5138->3516|5212->3562|5255->3578|5287->3589|5317->3592|5349->3603|5432->3655|5498->3693|5823->3991|5840->3999|5869->4007
                  LINES: 28->1|33->1|34->2|65->33|65->33|65->33|65->33|65->33|65->33|67->35|67->35|67->35|68->36|68->36|68->36|68->36|68->36|68->36|68->36|71->39|71->39|71->39|77->45|77->45|77->45|89->57|89->57|89->57|90->58|90->58|90->58|90->58|90->58|91->59|92->60|98->66|98->66|98->66
                  -- GENERATED --
              */
          