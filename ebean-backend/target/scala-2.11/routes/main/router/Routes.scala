
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/brian/Documents/SMU/sem6/4345/portal/4345-group8/ebean-backend/conf/routes
// @DATE:Sun Mar 05 16:00:34 CST 2023

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:9
  UserController_1: controllers.UserController,
  // @LINE:17
  PasswordController_4: controllers.PasswordController,
  // @LINE:20
  ProfileController_3: controllers.ProfileController,
  // @LINE:23
  OpenApplicationController_2: controllers.OpenApplicationController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:9
    UserController_1: controllers.UserController,
    // @LINE:17
    PasswordController_4: controllers.PasswordController,
    // @LINE:20
    ProfileController_3: controllers.ProfileController,
    // @LINE:23
    OpenApplicationController_2: controllers.OpenApplicationController
  ) = this(errorHandler, HomeController_0, UserController_1, PasswordController_4, ProfileController_3, OpenApplicationController_2, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, UserController_1, PasswordController_4, ProfileController_3, OpenApplicationController_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.UserController.authenticate()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.UserController.registerNew()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """info""", """controllers.HomeController.info()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """resetPassword""", """controllers.PasswordController.resetPassword()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """registerProfile""", """controllers.ProfileController.registerNew()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sendOpenApplication""", """controllers.OpenApplicationController.sendOpenApplication()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getUserByUsername/""" + "$" + """u<[^/]+>""", """controllers.UserController.getUserByUsername(u:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getProfileByEmail/""" + "$" + """p<[^/]+>""", """controllers.ProfileController.getProfileByEmail(p:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_UserController_authenticate1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_UserController_authenticate1_invoker = createInvoker(
    UserController_1.authenticate(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "authenticate",
      Nil,
      "POST",
      """Login""",
      this.prefix + """login"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_UserController_registerNew2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_UserController_registerNew2_invoker = createInvoker(
    UserController_1.registerNew(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "registerNew",
      Nil,
      "POST",
      """ Add User  {"name":name, "password":password}""",
      this.prefix + """signup"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_info3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("info")))
  )
  private[this] lazy val controllers_HomeController_info3_invoker = createInvoker(
    HomeController_0.info(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "info",
      Nil,
      "GET",
      """""",
      this.prefix + """info"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_PasswordController_resetPassword4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("resetPassword")))
  )
  private[this] lazy val controllers_PasswordController_resetPassword4_invoker = createInvoker(
    PasswordController_4.resetPassword(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PasswordController",
      "resetPassword",
      Nil,
      "POST",
      """""",
      this.prefix + """resetPassword"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_ProfileController_registerNew5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("registerProfile")))
  )
  private[this] lazy val controllers_ProfileController_registerNew5_invoker = createInvoker(
    ProfileController_3.registerNew(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProfileController",
      "registerNew",
      Nil,
      "POST",
      """Add Profile""",
      this.prefix + """registerProfile"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_OpenApplicationController_sendOpenApplication6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sendOpenApplication")))
  )
  private[this] lazy val controllers_OpenApplicationController_sendOpenApplication6_invoker = createInvoker(
    OpenApplicationController_2.sendOpenApplication(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OpenApplicationController",
      "sendOpenApplication",
      Nil,
      "POST",
      """send application""",
      this.prefix + """sendOpenApplication"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_UserController_getUserByUsername7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getUserByUsername/"), DynamicPart("u", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_getUserByUsername7_invoker = createInvoker(
    UserController_1.getUserByUsername(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "getUserByUsername",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """getUserByUsername/""" + "$" + """u<[^/]+>"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_ProfileController_getProfileByEmail8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getProfileByEmail/"), DynamicPart("p", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProfileController_getProfileByEmail8_invoker = createInvoker(
    ProfileController_3.getProfileByEmail(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProfileController",
      "getProfileByEmail",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """getProfileByEmail/""" + "$" + """p<[^/]+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:9
    case controllers_UserController_authenticate1_route(params) =>
      call { 
        controllers_UserController_authenticate1_invoker.call(UserController_1.authenticate())
      }
  
    // @LINE:13
    case controllers_UserController_registerNew2_route(params) =>
      call { 
        controllers_UserController_registerNew2_invoker.call(UserController_1.registerNew())
      }
  
    // @LINE:15
    case controllers_HomeController_info3_route(params) =>
      call { 
        controllers_HomeController_info3_invoker.call(HomeController_0.info())
      }
  
    // @LINE:17
    case controllers_PasswordController_resetPassword4_route(params) =>
      call { 
        controllers_PasswordController_resetPassword4_invoker.call(PasswordController_4.resetPassword())
      }
  
    // @LINE:20
    case controllers_ProfileController_registerNew5_route(params) =>
      call { 
        controllers_ProfileController_registerNew5_invoker.call(ProfileController_3.registerNew())
      }
  
    // @LINE:23
    case controllers_OpenApplicationController_sendOpenApplication6_route(params) =>
      call { 
        controllers_OpenApplicationController_sendOpenApplication6_invoker.call(OpenApplicationController_2.sendOpenApplication())
      }
  
    // @LINE:25
    case controllers_UserController_getUserByUsername7_route(params) =>
      call(params.fromPath[String]("u", None)) { (u) =>
        controllers_UserController_getUserByUsername7_invoker.call(UserController_1.getUserByUsername(u))
      }
  
    // @LINE:27
    case controllers_ProfileController_getProfileByEmail8_route(params) =>
      call(params.fromPath[String]("p", None)) { (p) =>
        controllers_ProfileController_getProfileByEmail8_invoker.call(ProfileController_3.getProfileByEmail(p))
      }
  }
}
