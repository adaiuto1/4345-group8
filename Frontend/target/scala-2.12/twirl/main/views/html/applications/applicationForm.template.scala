
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

object applicationForm extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Profile,String,Seq[String],play.twirl.api.HtmlFormat.Appendable] {

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

        <title>Application Form</title>
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
                <div class="card-panel">
                    <form action=""""),_display_(/*22.36*/routes/*22.42*/.ApplicationController.ApplicationHandler()),format.raw/*22.85*/("""" method="POST">
                        <div class="row s12" name="row-1">
                            <div class="input-field col ">
                                <input id="firstname" name="firstname" type="text" value=""""),_display_(/*25.92*/currUser/*25.100*/.firstname),format.raw/*25.110*/("""" readonly required>
                                <label for="firstname">First Name</label>
                            </div>
                            <div class="input-field col ">
                                <input id="lastname" name="lastname" type="text" value=""""),_display_(/*29.90*/currUser/*29.98*/.lastname),format.raw/*29.107*/("""" readonly required>
                                <label for="lastname">First Name</label>
                            </div>
                        </div>
                        <div class="row s12" name="row-2">
                            <div class="input-field col ">
                                <input id="email" name="email" type="text" value=""""),_display_(/*35.84*/currUser/*35.92*/.email),format.raw/*35.98*/("""" readonly required>
                                <label for="email">Email</label>
                            </div>
                            <div class="input-field col ">
                                <input id="phone" name="phone" type="text" value=""""),_display_(/*39.84*/currUser/*39.92*/.phone),format.raw/*39.98*/("""" readonly required>
                                <label for="phone">Phone</label>
                            </div>
                        </div>
                        <div class="row s12" name="row-2">
                            <div class="col s2">
                                <strong>Degree Plan: """),_display_(/*45.55*/currUser/*45.63*/.degree),format.raw/*45.70*/("""</strong>
                            </div>
                            <div class="input-field col s5">
                                <input id="startingSemester" name="startingSemester" type="text" value=""""),_display_(/*48.106*/currUser/*48.114*/.startingSemester),format.raw/*48.131*/("""" readonly required>
                                <label for="startingSemester">Starting Semester</label>
                            </div>
                            <div class="input-field col 5">
                                <input id="gradSemester" name="gradSemester" type="text" value=""""),_display_(/*52.98*/currUser/*52.106*/.gradSemester),format.raw/*52.119*/("""" readonly required>
                                <label for="gradSemester">Graduating Semester</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col">
                                <select id="classes" name="classes" style="display: block">
                                """),_display_(/*59.34*/for(classOption <- classOptions) yield /*59.66*/ {_display_(Seq[Any](format.raw/*59.68*/("""
                                    """),format.raw/*60.37*/("""<option value=""""),_display_(/*60.53*/classOption),format.raw/*60.64*/("""">"""),_display_(/*60.67*/classOption),format.raw/*60.78*/("""</option>
                                """)))}),format.raw/*61.34*/("""
                                """),format.raw/*62.33*/("""</select>
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
                  DATE: 2023-03-05T11:40:09.868
                  SOURCE: C:/Users/brian/Documents/SMU/sem6/4345/portal/4345-group8/Frontend/app/views/applications/openApplicationForm.scala.html
                  HASH: 3b82f213058c233874e63770520b4fd575152bfa
                  MATRIX: 991->1|1149->64|1177->66|2586->1450|2601->1456|2665->1499|2921->1728|2939->1736|2971->1746|3280->2028|3297->2036|3328->2045|3722->2412|3739->2420|3766->2426|4060->2693|4077->2701|4104->2707|4451->3027|4468->3035|4496->3042|4738->3256|4756->3264|4795->3281|5127->3586|5145->3594|5180->3607|5612->4012|5660->4044|5700->4046|5766->4084|5809->4100|5841->4111|5871->4114|5903->4125|5978->4169|6040->4203
                  LINES: 28->1|33->1|34->2|54->22|54->22|54->22|57->25|57->25|57->25|61->29|61->29|61->29|67->35|67->35|67->35|71->39|71->39|71->39|77->45|77->45|77->45|80->48|80->48|80->48|84->52|84->52|84->52|91->59|91->59|91->59|92->60|92->60|92->60|92->60|92->60|93->61|94->62
                  -- GENERATED --
              */
          