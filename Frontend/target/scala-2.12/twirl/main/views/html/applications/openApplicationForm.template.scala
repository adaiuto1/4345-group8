
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
            <div class="card col s8 offset-s2">
                <form action=""""),_display_(/*26.32*/routes/*26.38*/.ApplicationController.ApplicationHandler()),format.raw/*26.81*/("""" method="GET">

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
                                        type="text" value=""""),_display_(/*41.61*/currUser/*41.69*/.email),format.raw/*41.75*/(""""
                                        readonly style="display: none">
                                    </div>
                                    <h5 style="color: #186aad;">
                                        <strong>"""),_display_(/*45.50*/currUser/*45.58*/.firstname),format.raw/*45.68*/(""" """),_display_(/*45.70*/currUser/*45.78*/.lastname),format.raw/*45.87*/("""</strong>
                                    </h5>
                                    <h6>"""),_display_(/*47.42*/currUser/*47.50*/.degree),format.raw/*47.57*/("""</h6>
                                    <h6 style="font-size: 1em">"""),_display_(/*48.65*/currUser/*48.73*/.startingSemester),format.raw/*48.90*/(""" """),format.raw/*48.91*/("""- """),_display_(/*48.94*/currUser/*48.102*/.gradSemester),format.raw/*48.115*/("""</h6>
                                </div>
                                <div class="col s6">
                                    <h6 style="font-size: 1em" readonly>"""),_display_(/*51.74*/currUser/*51.82*/.email),format.raw/*51.88*/("""</h6>
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
                                value=""""),_display_(/*66.41*/currUser/*66.49*/.courses),format.raw/*66.57*/("""">
                            </div>
                            <div class="col s2">
                                <div class="input-field">
                                    <select id="classSelector" name="classSelector" style="display: block">
                                        <option selected disabled style="color: #888888">Select...</option>
                                        """),_display_(/*72.42*/for(classOption <- classOptions) yield /*72.74*/ {_display_(Seq[Any](format.raw/*72.76*/("""
                                            """),format.raw/*73.45*/("""<option
                                            class="selectorOption"
                                            value=""""),_display_(/*75.53*/classOption),format.raw/*75.64*/(""""
                                            style="font-size: 20px;
                                                font-weight: bold;
                                                color: #186aad">
                                                """),_display_(/*79.50*/classOption),format.raw/*79.61*/("""
                                                """),_display_(/*80.50*/if(currUser.courses.contains(classOption))/*80.92*/ {_display_(Seq[Any](format.raw/*80.94*/("""
                                                    """),format.raw/*81.53*/("""(Remove)
                                                """)))}),format.raw/*82.50*/("""
                                            """),format.raw/*83.45*/("""</option>
                                        """)))}),format.raw/*84.42*/("""
                                    """),format.raw/*85.37*/("""</select>
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
                                        """),_display_(/*97.42*/for(classOption <- classOptions) yield /*97.74*/ {_display_(Seq[Any](format.raw/*97.76*/("""
                                            """),_display_(/*98.46*/if(!currUser.courses.contains(classOption))/*98.89*/ {_display_(Seq[Any](format.raw/*98.91*/("""
                                                """),format.raw/*99.49*/("""<option value=""""),_display_(/*99.65*/classOption),format.raw/*99.76*/("""">"""),_display_(/*99.79*/classOption),format.raw/*99.90*/("""</option>
                                            """)))}),format.raw/*100.46*/("""
                                        """)))}),format.raw/*101.42*/("""
                                    """),format.raw/*102.37*/("""</select>
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
                                        """),_display_(/*113.42*/for(classOption <- classOptions) yield /*113.74*/ {_display_(Seq[Any](format.raw/*113.76*/("""
                                            """),_display_(/*114.46*/if(!currUser.courses.contains(classOption))/*114.89*/ {_display_(Seq[Any](format.raw/*114.91*/("""
                                                """),format.raw/*115.49*/("""<option value=""""),_display_(/*115.65*/classOption),format.raw/*115.76*/("""">"""),_display_(/*115.79*/classOption),format.raw/*115.90*/("""</option>
                                            """)))}),format.raw/*116.46*/("""

                                        """)))}),format.raw/*118.42*/("""
                                    """),format.raw/*119.37*/("""</select>
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
                                        """),_display_(/*130.42*/for(classOption <- classOptions) yield /*130.74*/ {_display_(Seq[Any](format.raw/*130.76*/("""
                                            """),_display_(/*131.46*/if(!currUser.courses.contains(classOption))/*131.89*/ {_display_(Seq[Any](format.raw/*131.91*/("""
                                                """),format.raw/*132.49*/("""<option value=""""),_display_(/*132.65*/classOption),format.raw/*132.76*/("""">"""),_display_(/*132.79*/classOption),format.raw/*132.90*/("""</option>
                                            """)))}),format.raw/*133.46*/("""
                                        """)))}),format.raw/*134.42*/("""
                                    """),format.raw/*135.37*/("""</select>
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
                                    """),_display_(/*147.38*/for(classOption <- classOptions) yield /*147.70*/ {_display_(Seq[Any](format.raw/*147.72*/("""
                                        """),_display_(/*148.42*/if(!currUser.courses.contains(classOption))/*148.85*/ {_display_(Seq[Any](format.raw/*148.87*/("""
                                            """),format.raw/*149.45*/("""<option value=""""),_display_(/*149.61*/classOption),format.raw/*149.72*/("""">"""),_display_(/*149.75*/classOption),format.raw/*149.86*/("""</option>
                                        """)))}),format.raw/*150.42*/("""
                                    """)))}),format.raw/*151.38*/("""
                                """),format.raw/*152.33*/("""</select>
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
                  DATE: 2023-03-07T12:11:49.921
                  SOURCE: C:/Users/brian/Documents/SMU/sem6/4345/portal/4345-group8/Frontend/app/views/applications/openApplicationForm.scala.html
                  HASH: 9a5d55321818d2fa61270c529fe666902f2e01de
                  MATRIX: 995->1|1153->64|1181->66|2590->1450|2638->1482|2678->1484|2720->1498|2751->1502|2783->1513|2830->1529|2867->1539|3009->1654|3024->1660|3088->1703|3970->2558|3987->2566|4014->2572|4276->2807|4293->2815|4324->2825|4353->2827|4370->2835|4400->2844|4522->2939|4539->2947|4567->2954|4665->3025|4682->3033|4720->3050|4749->3051|4779->3054|4797->3062|4832->3075|5033->3249|5050->3257|5077->3263|5791->3950|5808->3958|5837->3966|6272->4374|6320->4406|6360->4408|6434->4454|6590->4583|6622->4594|6904->4849|6936->4860|7014->4911|7065->4953|7105->4955|7187->5009|7277->5068|7351->5114|7434->5166|7500->5204|8309->5986|8357->6018|8397->6020|8471->6067|8523->6110|8563->6112|8641->6162|8684->6178|8716->6189|8746->6192|8778->6203|8866->6259|8941->6302|9008->6340|9817->7121|9866->7153|9907->7155|9982->7202|10035->7245|10076->7247|10155->7297|10199->7313|10232->7324|10263->7327|10296->7338|10384->7394|10461->7439|10528->7477|11332->8253|11381->8285|11422->8287|11497->8334|11550->8377|11591->8379|11670->8429|11714->8445|11747->8456|11778->8459|11811->8470|11899->8526|11974->8569|12041->8607|12802->9340|12851->9372|12892->9374|12963->9417|13016->9460|13057->9462|13132->9508|13176->9524|13209->9535|13240->9538|13273->9549|13357->9601|13428->9640|13491->9674
                  LINES: 28->1|33->1|34->2|52->20|52->20|52->20|53->21|53->21|53->21|54->22|55->23|58->26|58->26|58->26|73->41|73->41|73->41|77->45|77->45|77->45|77->45|77->45|77->45|79->47|79->47|79->47|80->48|80->48|80->48|80->48|80->48|80->48|80->48|83->51|83->51|83->51|98->66|98->66|98->66|104->72|104->72|104->72|105->73|107->75|107->75|111->79|111->79|112->80|112->80|112->80|113->81|114->82|115->83|116->84|117->85|129->97|129->97|129->97|130->98|130->98|130->98|131->99|131->99|131->99|131->99|131->99|132->100|133->101|134->102|145->113|145->113|145->113|146->114|146->114|146->114|147->115|147->115|147->115|147->115|147->115|148->116|150->118|151->119|162->130|162->130|162->130|163->131|163->131|163->131|164->132|164->132|164->132|164->132|164->132|165->133|166->134|167->135|179->147|179->147|179->147|180->148|180->148|180->148|181->149|181->149|181->149|181->149|181->149|182->150|183->151|184->152
                  -- GENERATED --
              */
          