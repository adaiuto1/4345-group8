// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/brian/Documents/SMU/sem6/4345/portal/4345-group8/Frontend/conf/routes
// @DATE:Sun Apr 16 13:14:27 CDT 2023

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_3: controllers.HomeController,
  // @LINE:20
  ApplicationController_0: controllers.ApplicationController,
  // @LINE:28
  TAResponseController_1: controllers.TAResponseController,
  // @LINE:34
  Assets_2: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_3: controllers.HomeController,
    // @LINE:20
    ApplicationController_0: controllers.ApplicationController,
    // @LINE:28
    TAResponseController_1: controllers.TAResponseController,
    // @LINE:34
    Assets_2: controllers.Assets
  ) = this(errorHandler, HomeController_3, ApplicationController_0, TAResponseController_1, Assets_2, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_3, ApplicationController_0, TAResponseController_1, Assets_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.HomeController.loginHandler()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.HomeController.signup()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.HomeController.signupHandler()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """registerProfile""", """controllers.HomeController.profileHandler()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """editProfile""", """controllers.HomeController.editProfile()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """submitProfileChanges""", """controllers.HomeController.editProfileHandler()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """openApplication""", """controllers.ApplicationController.openApplicationForm()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sendOpenApplication""", """controllers.ApplicationController.ApplicationHandler()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """changePassword""", """controllers.HomeController.changePassword()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """submitNewPassword""", """controllers.HomeController.passwordHandler()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """TA_Application/""" + "$" + """c<[^/]+>""", """controllers.TAResponseController.openResponseForm(c:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sendTAResponse""", """controllers.TAResponseController.TAResponseHandler()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """openPositionViewer""", """controllers.HomeController.openPositionViewer()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile/""" + "$" + """profile<.+>""", """controllers.HomeController.openProfileView(profile:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_3.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_loginHandler1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_HomeController_loginHandler1_invoker = createInvoker(
    HomeController_3.loginHandler(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "loginHandler",
      Nil,
      "GET",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_signup2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_HomeController_signup2_invoker = createInvoker(
    HomeController_3.signup(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "signup",
      Nil,
      "GET",
      this.prefix + """signup""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_signupHandler3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_HomeController_signupHandler3_invoker = createInvoker(
    HomeController_3.signupHandler(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "signupHandler",
      Nil,
      "GET",
      this.prefix + """register""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_profileHandler4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("registerProfile")))
  )
  private[this] lazy val controllers_HomeController_profileHandler4_invoker = createInvoker(
    HomeController_3.profileHandler(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "profileHandler",
      Nil,
      "GET",
      this.prefix + """registerProfile""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_editProfile5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("editProfile")))
  )
  private[this] lazy val controllers_HomeController_editProfile5_invoker = createInvoker(
    HomeController_3.editProfile(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "editProfile",
      Nil,
      "GET",
      this.prefix + """editProfile""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_HomeController_editProfileHandler6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("submitProfileChanges")))
  )
  private[this] lazy val controllers_HomeController_editProfileHandler6_invoker = createInvoker(
    HomeController_3.editProfileHandler(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "editProfileHandler",
      Nil,
      "GET",
      this.prefix + """submitProfileChanges""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_ApplicationController_openApplicationForm7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("openApplication")))
  )
  private[this] lazy val controllers_ApplicationController_openApplicationForm7_invoker = createInvoker(
    ApplicationController_0.openApplicationForm(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "openApplicationForm",
      Nil,
      "GET",
      this.prefix + """openApplication""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_ApplicationController_ApplicationHandler8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sendOpenApplication")))
  )
  private[this] lazy val controllers_ApplicationController_ApplicationHandler8_invoker = createInvoker(
    ApplicationController_0.ApplicationHandler(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "ApplicationHandler",
      Nil,
      "GET",
      this.prefix + """sendOpenApplication""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_HomeController_changePassword9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("changePassword")))
  )
  private[this] lazy val controllers_HomeController_changePassword9_invoker = createInvoker(
    HomeController_3.changePassword(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "changePassword",
      Nil,
      "GET",
      this.prefix + """changePassword""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_HomeController_passwordHandler10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("submitNewPassword")))
  )
  private[this] lazy val controllers_HomeController_passwordHandler10_invoker = createInvoker(
    HomeController_3.passwordHandler(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "passwordHandler",
      Nil,
      "GET",
      this.prefix + """submitNewPassword""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_TAResponseController_openResponseForm11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("TA_Application/"), DynamicPart("c", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TAResponseController_openResponseForm11_invoker = createInvoker(
    TAResponseController_1.openResponseForm(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TAResponseController",
      "openResponseForm",
      Seq(classOf[String]),
      "GET",
      this.prefix + """TA_Application/""" + "$" + """c<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_TAResponseController_TAResponseHandler12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sendTAResponse")))
  )
  private[this] lazy val controllers_TAResponseController_TAResponseHandler12_invoker = createInvoker(
    TAResponseController_1.TAResponseHandler(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TAResponseController",
      "TAResponseHandler",
      Nil,
      "GET",
      this.prefix + """sendTAResponse""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_HomeController_openPositionViewer13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("openPositionViewer")))
  )
  private[this] lazy val controllers_HomeController_openPositionViewer13_invoker = createInvoker(
    HomeController_3.openPositionViewer(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "openPositionViewer",
      Nil,
      "GET",
      this.prefix + """openPositionViewer""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_Assets_at14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at14_invoker = createInvoker(
    Assets_2.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:36
  private[this] lazy val controllers_HomeController_openProfileView15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile/"), DynamicPart("profile", """.+""",false)))
  )
  private[this] lazy val controllers_HomeController_openProfileView15_invoker = createInvoker(
    HomeController_3.openProfileView(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "openProfileView",
      Seq(classOf[String]),
      "GET",
      this.prefix + """profile/""" + "$" + """profile<.+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_3.index())
      }
  
    // @LINE:8
    case controllers_HomeController_loginHandler1_route(params@_) =>
      call { 
        controllers_HomeController_loginHandler1_invoker.call(HomeController_3.loginHandler())
      }
  
    // @LINE:10
    case controllers_HomeController_signup2_route(params@_) =>
      call { 
        controllers_HomeController_signup2_invoker.call(HomeController_3.signup())
      }
  
    // @LINE:12
    case controllers_HomeController_signupHandler3_route(params@_) =>
      call { 
        controllers_HomeController_signupHandler3_invoker.call(HomeController_3.signupHandler())
      }
  
    // @LINE:14
    case controllers_HomeController_profileHandler4_route(params@_) =>
      call { 
        controllers_HomeController_profileHandler4_invoker.call(HomeController_3.profileHandler())
      }
  
    // @LINE:16
    case controllers_HomeController_editProfile5_route(params@_) =>
      call { 
        controllers_HomeController_editProfile5_invoker.call(HomeController_3.editProfile())
      }
  
    // @LINE:18
    case controllers_HomeController_editProfileHandler6_route(params@_) =>
      call { 
        controllers_HomeController_editProfileHandler6_invoker.call(HomeController_3.editProfileHandler())
      }
  
    // @LINE:20
    case controllers_ApplicationController_openApplicationForm7_route(params@_) =>
      call { 
        controllers_ApplicationController_openApplicationForm7_invoker.call(ApplicationController_0.openApplicationForm())
      }
  
    // @LINE:22
    case controllers_ApplicationController_ApplicationHandler8_route(params@_) =>
      call { 
        controllers_ApplicationController_ApplicationHandler8_invoker.call(ApplicationController_0.ApplicationHandler())
      }
  
    // @LINE:24
    case controllers_HomeController_changePassword9_route(params@_) =>
      call { 
        controllers_HomeController_changePassword9_invoker.call(HomeController_3.changePassword())
      }
  
    // @LINE:26
    case controllers_HomeController_passwordHandler10_route(params@_) =>
      call { 
        controllers_HomeController_passwordHandler10_invoker.call(HomeController_3.passwordHandler())
      }
  
    // @LINE:28
    case controllers_TAResponseController_openResponseForm11_route(params@_) =>
      call(params.fromPath[String]("c", None)) { (c) =>
        controllers_TAResponseController_openResponseForm11_invoker.call(TAResponseController_1.openResponseForm(c))
      }
  
    // @LINE:30
    case controllers_TAResponseController_TAResponseHandler12_route(params@_) =>
      call { 
        controllers_TAResponseController_TAResponseHandler12_invoker.call(TAResponseController_1.TAResponseHandler())
      }
  
    // @LINE:32
    case controllers_HomeController_openPositionViewer13_route(params@_) =>
      call { 
        controllers_HomeController_openPositionViewer13_invoker.call(HomeController_3.openPositionViewer())
      }
  
    // @LINE:34
    case controllers_Assets_at14_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at14_invoker.call(Assets_2.at(path, file))
      }
  
    // @LINE:36
    case controllers_HomeController_openProfileView15_route(params@_) =>
      call(params.fromPath[String]("profile", None)) { (profile) =>
        controllers_HomeController_openProfileView15_invoker.call(HomeController_3.openProfileView(profile))
      }
  }
}
