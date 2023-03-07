
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
        <div type="text" id="allClasses" style="display: none">
        """),_display_(/*20.10*/for(classOption <- classOptions) yield /*20.42*/ {_display_(Seq[Any](format.raw/*20.44*/("""
            """),format.raw/*21.13*/("""<p>"""),_display_(/*21.17*/classOption),format.raw/*21.28*/(""",</p>
        """)))}),format.raw/*22.10*/("""
        """),format.raw/*23.9*/("""</div>
        <div class="row">
            <form action=""""),_display_(/*25.28*/routes/*25.34*/.ApplicationController.ApplicationHandler()),format.raw/*25.77*/("""" method="GET">

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
                                        <strong>"""),_display_(/*40.50*/currUser/*40.58*/.firstname),format.raw/*40.68*/(""" """),_display_(/*40.70*/currUser/*40.78*/.lastname),format.raw/*40.87*/("""</strong>
                                    </h5>
                                    <h6>"""),_display_(/*42.42*/currUser/*42.50*/.degree),format.raw/*42.57*/("""</h6>
                                    <h6 style="font-size: 1em">"""),_display_(/*43.65*/currUser/*43.73*/.startingSemester),format.raw/*43.90*/(""" """),format.raw/*43.91*/("""- """),_display_(/*43.94*/currUser/*43.102*/.gradSemester),format.raw/*43.115*/("""</h6>
                                </div>
                                <div class="col s6">
                                    <input id="studentEmail" value=""""),_display_(/*46.70*/currUser/*46.78*/.email),format.raw/*46.84*/("""" readonly>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="card-panel">
                        <div class="row">
                            <div class="col s3">
                                <h6 style="color: #186aad">Completed Courses</h6>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col s5">
                                <input type="text" id="classDisplay"
                                required readonly
                                value=""""),_display_(/*61.41*/currUser/*61.49*/.courses),format.raw/*61.57*/("""">
                            </div>
                            <div class="col s2">
                                <div class="input-field">
                                    <select id="classSelector" name="classSelector" style="display: block">
                                        <option selected disabled style="color: #888888">Select...</option>
                                        """),_display_(/*67.42*/for(classOption <- classOptions) yield /*67.74*/ {_display_(Seq[Any](format.raw/*67.76*/("""
                                            """),format.raw/*68.45*/("""<option
                                            class="selectorOption"
                                            value=""""),_display_(/*70.53*/classOption),format.raw/*70.64*/(""""
                                            style="font-size: 20px;
                                                font-weight: bold;
                                                color: #186aad">
                                                """),_display_(/*74.50*/classOption),format.raw/*74.61*/("""
                                                """),_display_(/*75.50*/if(currUser.courses.contains(classOption))/*75.92*/ {_display_(Seq[Any](format.raw/*75.94*/("""
                                                    """),format.raw/*76.53*/("""(Remove)
                                                """)))}),format.raw/*77.50*/("""
                                            """),format.raw/*78.45*/("""</option>
                                        """)))}),format.raw/*79.42*/("""
                                    """),format.raw/*80.37*/("""</select>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col s4" id="first">
                                <h6 style="color: #186aad">First Preference</h6>
                                <div class="input-field">
                                    <select id="firstChoice" style="display: block" required>
                                        <option selected disabled
                                        style="color: #888888">Select...</option>
                                        """),_display_(/*91.42*/for(classOption <- classOptions) yield /*91.74*/ {_display_(Seq[Any](format.raw/*91.76*/("""
                                            """),_display_(/*92.46*/if(!currUser.courses.contains(classOption))/*92.89*/ {_display_(Seq[Any](format.raw/*92.91*/("""
                                                """),format.raw/*93.49*/("""<option value=""""),_display_(/*93.65*/classOption),format.raw/*93.76*/("""">"""),_display_(/*93.79*/classOption),format.raw/*93.90*/("""</option>
                                            """)))}),format.raw/*94.46*/("""
                                        """)))}),format.raw/*95.42*/("""
                                    """),format.raw/*96.37*/("""</select>
                                </div>
                            </div>
                            <div class="col s4" id="second" style="display: none">
                                <h6 style="color: #186aad">Second Preference (Optional)</h6>
                                <div class="input-field">
                                    <select id="secondChoice" style="display: block">
                                        <option selected disabled
                                        style="color: #888888"
                                        value="null">Select...</option>
                                        """),_display_(/*106.42*/for(classOption <- classOptions) yield /*106.74*/ {_display_(Seq[Any](format.raw/*106.76*/("""
                                            """),_display_(/*107.46*/if(!currUser.courses.contains(classOption))/*107.89*/ {_display_(Seq[Any](format.raw/*107.91*/("""
                                                """),format.raw/*108.49*/("""<option value=""""),_display_(/*108.65*/classOption),format.raw/*108.76*/("""">"""),_display_(/*108.79*/classOption),format.raw/*108.90*/("""</option>
                                            """)))}),format.raw/*109.46*/("""

                                        """)))}),format.raw/*111.42*/("""
                                    """),format.raw/*112.37*/("""</select>
                                </div>
                            </div>
                            <div class="col s4" id="third" style="display: none">
                                <h6 style="color: #186aad">Third Preference (Optional)</h6>
                                <div class="input-field">
                                    <select id="thirdChoice" style="display: block">
                                        <option selected disabled
                                        style="color: #888888"
                                        value="null">Select...</option>
                                        """),_display_(/*122.42*/for(classOption <- classOptions) yield /*122.74*/ {_display_(Seq[Any](format.raw/*122.76*/("""
                                            """),_display_(/*123.46*/if(!currUser.courses.contains(classOption))/*123.89*/ {_display_(Seq[Any](format.raw/*123.91*/("""
                                                """),format.raw/*124.49*/("""<option value=""""),_display_(/*124.65*/classOption),format.raw/*124.76*/("""">"""),_display_(/*124.79*/classOption),format.raw/*124.90*/("""</option>
                                            """)))}),format.raw/*125.46*/("""
                                        """)))}),format.raw/*126.42*/("""
                                    """),format.raw/*127.37*/("""</select>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <button id="api-search-button" class="btn col s4 offset-s4" type="submit">Submit</button>
                        </div>

                    </div>

                </div>
            </form>
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
                  DATE: 2023-03-06T19:48:28.787
                  SOURCE: C:/Users/brian/Documents/SMU/sem6/4345/portal/4345-group8/Frontend/app/views/applications/openApplicationForm.scala.html
                  HASH: 283e4525fed1b715b04f48859d3dae0b563d3f81
                  MATRIX: 995->1|1153->64|1181->66|2590->1450|2638->1482|2678->1484|2720->1498|2751->1502|2783->1513|2830->1529|2867->1539|2956->1601|2971->1607|3035->1650|3876->2464|3893->2472|3924->2482|3953->2484|3970->2492|4000->2501|4122->2596|4139->2604|4167->2611|4265->2682|4282->2690|4320->2707|4349->2708|4379->2711|4397->2719|4432->2732|4629->2902|4646->2910|4673->2916|5393->3609|5410->3617|5439->3625|5874->4033|5922->4065|5962->4067|6036->4113|6192->4242|6224->4253|6506->4508|6538->4519|6616->4570|6667->4612|6707->4614|6789->4668|6879->4727|6953->4773|7036->4825|7102->4863|7779->5513|7827->5545|7867->5547|7941->5594|7993->5637|8033->5639|8111->5689|8154->5705|8186->5716|8216->5719|8248->5730|8335->5786|8409->5829|8475->5867|9159->6523|9208->6555|9249->6557|9324->6604|9377->6647|9418->6649|9497->6699|9541->6715|9574->6726|9605->6729|9638->6740|9726->6796|9803->6841|9870->6879|10551->7532|10600->7564|10641->7566|10716->7613|10769->7656|10810->7658|10889->7708|10933->7724|10966->7735|10997->7738|11030->7749|11118->7805|11193->7848|11260->7886
                  LINES: 28->1|33->1|34->2|52->20|52->20|52->20|53->21|53->21|53->21|54->22|55->23|57->25|57->25|57->25|72->40|72->40|72->40|72->40|72->40|72->40|74->42|74->42|74->42|75->43|75->43|75->43|75->43|75->43|75->43|75->43|78->46|78->46|78->46|93->61|93->61|93->61|99->67|99->67|99->67|100->68|102->70|102->70|106->74|106->74|107->75|107->75|107->75|108->76|109->77|110->78|111->79|112->80|123->91|123->91|123->91|124->92|124->92|124->92|125->93|125->93|125->93|125->93|125->93|126->94|127->95|128->96|138->106|138->106|138->106|139->107|139->107|139->107|140->108|140->108|140->108|140->108|140->108|141->109|143->111|144->112|154->122|154->122|154->122|155->123|155->123|155->123|156->124|156->124|156->124|156->124|156->124|157->125|158->126|159->127
                  -- GENERATED --
              */
          