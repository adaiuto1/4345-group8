
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

        </div>
        <div class="row">
            <div class="card col s8 offset-s2">
                <form action=""""),_display_(/*24.32*/routes/*24.38*/.ApplicationController.ApplicationHandler()),format.raw/*24.81*/("""" method="GET">

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
                                    <div class="input-field">
                                        <input id="studentEmail" name="studentEmail"
                                        type="text" value=""""),_display_(/*39.61*/currUser/*39.69*/.email),format.raw/*39.75*/(""""
                                        readonly style="display: none">
                                    </div>
                                    <h5 style="color: #186aad;">
                                        <strong>"""),_display_(/*43.50*/currUser/*43.58*/.firstname),format.raw/*43.68*/(""" """),_display_(/*43.70*/currUser/*43.78*/.lastname),format.raw/*43.87*/("""</strong>
                                    </h5>
                                    <h6>"""),_display_(/*45.42*/currUser/*45.50*/.degree),format.raw/*45.57*/("""</h6>
                                    <h6 style="font-size: 1em">"""),_display_(/*46.65*/currUser/*46.73*/.startingSemester),format.raw/*46.90*/(""" """),format.raw/*46.91*/("""- """),_display_(/*46.94*/currUser/*46.102*/.gradSemester),format.raw/*46.115*/("""</h6>
                                </div>
                                <div class="col s6">
                                    <h6 style="font-size: 1em" readonly>"""),_display_(/*49.74*/currUser/*49.82*/.email),format.raw/*49.88*/("""</h6>
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
                                value=""""),_display_(/*64.41*/currUser/*64.49*/.courses),format.raw/*64.57*/("""">
                            </div>
                            <div class="col s2">
                                <div class="input-field">
                                    <select id="classSelector" name="classSelector" style="display: block">
                                        <option selected disabled style="color: #888888">Select...</option>
                                        """),_display_(/*70.42*/for(classOption <- classOptions) yield /*70.74*/ {_display_(Seq[Any](format.raw/*70.76*/("""
                                            """),format.raw/*71.45*/("""<option
                                            class="selectorOption"
                                            value=""""),_display_(/*73.53*/classOption),format.raw/*73.64*/(""""
                                            style="font-size: 20px;
                                                font-weight: bold;
                                                color: #186aad">
                                                """),_display_(/*77.50*/classOption),format.raw/*77.61*/("""
                                                """),_display_(/*78.50*/if(currUser.courses.contains(classOption))/*78.92*/ {_display_(Seq[Any](format.raw/*78.94*/("""
                                                    """),format.raw/*79.53*/("""(Remove)
                                                """)))}),format.raw/*80.50*/("""
                                            """),format.raw/*81.45*/("""</option>
                                        """)))}),format.raw/*82.42*/("""
                                    """),format.raw/*83.37*/("""</select>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col s4" id="first">
                                <h6 style="color: #186aad">First Preference</h6>
                                <div class="input-field">
                                    <input type="text" id="firstChoice" name="firstChoice" required style="display: none">
                                    <select id="firstChoiceSelector" style="display: block" required>
                                        <option selected disabled
                                        style="color: #888888">Select...</option>
                                        """),_display_(/*95.42*/for(classOption <- classOptions) yield /*95.74*/ {_display_(Seq[Any](format.raw/*95.76*/("""
                                            """),_display_(/*96.46*/if(!currUser.courses.contains(classOption))/*96.89*/ {_display_(Seq[Any](format.raw/*96.91*/("""
                                                """),format.raw/*97.49*/("""<option value=""""),_display_(/*97.65*/classOption),format.raw/*97.76*/("""">"""),_display_(/*97.79*/classOption),format.raw/*97.90*/("""</option>
                                            """)))}),format.raw/*98.46*/("""
                                        """)))}),format.raw/*99.42*/("""
                                    """),format.raw/*100.37*/("""</select>
                                </div>
                            </div>
                            <div class="col s4" id="second" style="display: none">
                                <h6 style="color: #186aad">Second Preference (Optional)</h6>
                                <div class="input-field">
                                    <input type="text" id="secondChoice" name="secondChoice" style="display: none">
                                    <select id="secondChoiceSelector" style="display: block">
                                        <option selected disabled
                                        style="color: #888888"
                                        value="null">Select...</option>
                                        """),_display_(/*111.42*/for(classOption <- classOptions) yield /*111.74*/ {_display_(Seq[Any](format.raw/*111.76*/("""
                                            """),_display_(/*112.46*/if(!currUser.courses.contains(classOption))/*112.89*/ {_display_(Seq[Any](format.raw/*112.91*/("""
                                                """),format.raw/*113.49*/("""<option value=""""),_display_(/*113.65*/classOption),format.raw/*113.76*/("""">"""),_display_(/*113.79*/classOption),format.raw/*113.90*/("""</option>
                                            """)))}),format.raw/*114.46*/("""

                                        """)))}),format.raw/*116.42*/("""
                                    """),format.raw/*117.37*/("""</select>
                                </div>
                            </div>
                            <div class="col s4" id="third" style="display: none">
                                <h6 style="color: #186aad">Third Preference (Optional)</h6>
                                <div class="input-field">
                                    <input type="text" id="thirdChoice" name="thirdChoice" style="display: none">
                                    <select id="thirdChoiceSelector" style="display: block">
                                        <option selected disabled
                                        style="color: #888888"
                                        value="null">Select...</option>
                                        """),_display_(/*128.42*/for(classOption <- classOptions) yield /*128.74*/ {_display_(Seq[Any](format.raw/*128.76*/("""
                                            """),_display_(/*129.46*/if(!currUser.courses.contains(classOption))/*129.89*/ {_display_(Seq[Any](format.raw/*129.91*/("""
                                                """),format.raw/*130.49*/("""<option value=""""),_display_(/*130.65*/classOption),format.raw/*130.76*/("""">"""),_display_(/*130.79*/classOption),format.raw/*130.90*/("""</option>
                                            """)))}),format.raw/*131.46*/("""
                                        """)))}),format.raw/*132.42*/("""
                                    """),format.raw/*133.37*/("""</select>
                                </div>
                            </div>
                        </div>
                        <div class="row" id="ignorance">
                            <h6 style="color: #186aad">Select classes you do NOT wish to TA for</h6>
                            <div class="input-field">
                                <input type="text" id="avoid" name="avoid" readonly>
                                <select id="avoidSelector" style="display: block">
                                    <option selected disabled
                                    style="color: #888888"
                                    value="null">Select...</option>
                                    """),_display_(/*145.38*/for(classOption <- classOptions) yield /*145.70*/ {_display_(Seq[Any](format.raw/*145.72*/("""
                                        """),_display_(/*146.42*/if(!currUser.courses.contains(classOption))/*146.85*/ {_display_(Seq[Any](format.raw/*146.87*/("""
                                            """),format.raw/*147.45*/("""<option value=""""),_display_(/*147.61*/classOption),format.raw/*147.72*/("""">"""),_display_(/*147.75*/classOption),format.raw/*147.86*/("""</option>
                                        """)))}),format.raw/*148.42*/("""
                                    """)))}),format.raw/*149.38*/("""
                                """),format.raw/*150.33*/("""</select>
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

  def render(currUser:Profile,message:String,classOptions:Seq[String]): play.twirl.api.HtmlFormat.Appendable = apply(currUser,message,classOptions)

  def f:((Profile,String,Seq[String]) => play.twirl.api.HtmlFormat.Appendable) = (currUser,message,classOptions) => apply(currUser,message,classOptions)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2023-04-16T14:38:16.410
                  SOURCE: C:/Users/brian/Documents/SMU/sem6/4345/portal/4345-group8/Frontend/app/views/applications/openApplicationForm.scala.html
                  HASH: 39fc7cba58805566804456f49a33a00bcbac0c5d
                  MATRIX: 995->1|1153->64|1181->66|2706->1566|2721->1572|2785->1615|3667->2470|3684->2478|3711->2484|3973->2719|3990->2727|4021->2737|4050->2739|4067->2747|4097->2756|4219->2851|4236->2859|4264->2866|4362->2937|4379->2945|4417->2962|4446->2963|4476->2966|4494->2974|4529->2987|4730->3161|4747->3169|4774->3175|5488->3862|5505->3870|5534->3878|5969->4286|6017->4318|6057->4320|6131->4366|6287->4495|6319->4506|6601->4761|6633->4772|6711->4823|6762->4865|6802->4867|6884->4921|6974->4980|7048->5026|7131->5078|7197->5116|8006->5898|8054->5930|8094->5932|8168->5979|8220->6022|8260->6024|8338->6074|8381->6090|8413->6101|8443->6104|8475->6115|8562->6171|8636->6214|8703->6252|9512->7033|9561->7065|9602->7067|9677->7114|9730->7157|9771->7159|9850->7209|9894->7225|9927->7236|9958->7239|9991->7250|10079->7306|10156->7351|10223->7389|11027->8165|11076->8197|11117->8199|11192->8246|11245->8289|11286->8291|11365->8341|11409->8357|11442->8368|11473->8371|11506->8382|11594->8438|11669->8481|11736->8519|12497->9252|12546->9284|12587->9286|12658->9329|12711->9372|12752->9374|12827->9420|12871->9436|12904->9447|12935->9450|12968->9461|13052->9513|13123->9552|13186->9586
                  LINES: 28->1|33->1|34->2|56->24|56->24|56->24|71->39|71->39|71->39|75->43|75->43|75->43|75->43|75->43|75->43|77->45|77->45|77->45|78->46|78->46|78->46|78->46|78->46|78->46|78->46|81->49|81->49|81->49|96->64|96->64|96->64|102->70|102->70|102->70|103->71|105->73|105->73|109->77|109->77|110->78|110->78|110->78|111->79|112->80|113->81|114->82|115->83|127->95|127->95|127->95|128->96|128->96|128->96|129->97|129->97|129->97|129->97|129->97|130->98|131->99|132->100|143->111|143->111|143->111|144->112|144->112|144->112|145->113|145->113|145->113|145->113|145->113|146->114|148->116|149->117|160->128|160->128|160->128|161->129|161->129|161->129|162->130|162->130|162->130|162->130|162->130|163->131|164->132|165->133|177->145|177->145|177->145|178->146|178->146|178->146|179->147|179->147|179->147|179->147|179->147|180->148|181->149|182->150
                  -- GENERATED --
              */
          