
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/brian/Documents/SMU/sem6/4345/portal/4345-group8/ebean-backend/conf/routes
// @DATE:Fri Apr 21 11:21:00 CDT 2023

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
  HomeController_1: controllers.HomeController,
  // @LINE:9
  UserController_2: controllers.UserController,
  // @LINE:17
  PasswordController_5: controllers.PasswordController,
  // @LINE:20
  ProfileController_4: controllers.ProfileController,
  // @LINE:23
  OpenApplicationController_3: controllers.OpenApplicationController,
  // @LINE:29
  TAResponseController_6: controllers.TAResponseController,
  // @LINE:32
  ClassroomController_7: controllers.ClassroomController,
  // @LINE:39
  ListingController_0: controllers.ListingController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:9
    UserController_2: controllers.UserController,
    // @LINE:17
    PasswordController_5: controllers.PasswordController,
    // @LINE:20
    ProfileController_4: controllers.ProfileController,
    // @LINE:23
    OpenApplicationController_3: controllers.OpenApplicationController,
    // @LINE:29
    TAResponseController_6: controllers.TAResponseController,
    // @LINE:32
    ClassroomController_7: controllers.ClassroomController,
    // @LINE:39
    ListingController_0: controllers.ListingController
  ) = this(errorHandler, HomeController_1, UserController_2, PasswordController_5, ProfileController_4, OpenApplicationController_3, TAResponseController_6, ClassroomController_7, ListingController_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, UserController_2, PasswordController_5, ProfileController_4, OpenApplicationController_3, TAResponseController_6, ClassroomController_7, ListingController_0, prefix)
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
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """editProfile/""" + "$" + """e<[^/]+>""", """controllers.ProfileController.editProfile(e:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sendOpenApplication""", """controllers.OpenApplicationController.sendOpenApplication()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getUserByUsername/""" + "$" + """u<[^/]+>""", """controllers.UserController.getUserByUsername(u:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getProfileByEmail/""" + "$" + """p<[^/]+>""", """controllers.ProfileController.getProfileByEmail(p:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sendTAResponse""", """controllers.TAResponseController.createNewTAResponse()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """classes""", """controllers.ClassroomController.getAllClassrooms()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """classes/id/""" + "$" + """c<[^/]+>""", """controllers.ClassroomController.getClassById(c:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """classes/teacher/""" + "$" + """e<[^/]+>""", """controllers.ClassroomController.getClassByEmail(e:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """classes/newClassroom""", """controllers.ClassroomController.createNewClassroom()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """classes/id/""" + "$" + """id<[^/]+>/""" + "$" + """ta<[^/]+>""", """controllers.ClassroomController.addTAToClassroom(id:String, ta:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """listings""", """controllers.ListingController.getAllListings()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """listings/qualified/""" + "$" + """e<[^/]+>""", """controllers.ListingController.filterQualified(e:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """listings""", """controllers.ListingController.createNewListing()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """listings/""" + "$" + """id<[^/]+>""", """controllers.ListingController.deleteListing(id:String)"""),
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
    HomeController_1.index,
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
    UserController_2.authenticate(),
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
    UserController_2.registerNew(),
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
    HomeController_1.info(),
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
    PasswordController_5.resetPassword(),
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
    ProfileController_4.registerNew(),
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

  // @LINE:21
  private[this] lazy val controllers_ProfileController_editProfile6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("editProfile/"), DynamicPart("e", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProfileController_editProfile6_invoker = createInvoker(
    ProfileController_4.editProfile(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProfileController",
      "editProfile",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """editProfile/""" + "$" + """e<[^/]+>"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_OpenApplicationController_sendOpenApplication7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sendOpenApplication")))
  )
  private[this] lazy val controllers_OpenApplicationController_sendOpenApplication7_invoker = createInvoker(
    OpenApplicationController_3.sendOpenApplication(),
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
  private[this] lazy val controllers_UserController_getUserByUsername8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getUserByUsername/"), DynamicPart("u", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_getUserByUsername8_invoker = createInvoker(
    UserController_2.getUserByUsername(fakeValue[String]),
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
  private[this] lazy val controllers_ProfileController_getProfileByEmail9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getProfileByEmail/"), DynamicPart("p", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProfileController_getProfileByEmail9_invoker = createInvoker(
    ProfileController_4.getProfileByEmail(fakeValue[String]),
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

  // @LINE:29
  private[this] lazy val controllers_TAResponseController_createNewTAResponse10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sendTAResponse")))
  )
  private[this] lazy val controllers_TAResponseController_createNewTAResponse10_invoker = createInvoker(
    TAResponseController_6.createNewTAResponse(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TAResponseController",
      "createNewTAResponse",
      Nil,
      "POST",
      """""",
      this.prefix + """sendTAResponse"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_ClassroomController_getAllClassrooms11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("classes")))
  )
  private[this] lazy val controllers_ClassroomController_getAllClassrooms11_invoker = createInvoker(
    ClassroomController_7.getAllClassrooms(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClassroomController",
      "getAllClassrooms",
      Nil,
      "GET",
      """get classroom information""",
      this.prefix + """classes"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_ClassroomController_getClassById12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("classes/id/"), DynamicPart("c", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ClassroomController_getClassById12_invoker = createInvoker(
    ClassroomController_7.getClassById(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClassroomController",
      "getClassById",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """classes/id/""" + "$" + """c<[^/]+>"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_ClassroomController_getClassByEmail13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("classes/teacher/"), DynamicPart("e", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ClassroomController_getClassByEmail13_invoker = createInvoker(
    ClassroomController_7.getClassByEmail(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClassroomController",
      "getClassByEmail",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """classes/teacher/""" + "$" + """e<[^/]+>"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_ClassroomController_createNewClassroom14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("classes/newClassroom")))
  )
  private[this] lazy val controllers_ClassroomController_createNewClassroom14_invoker = createInvoker(
    ClassroomController_7.createNewClassroom(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClassroomController",
      "createNewClassroom",
      Nil,
      "POST",
      """""",
      this.prefix + """classes/newClassroom"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_ClassroomController_addTAToClassroom15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("classes/id/"), DynamicPart("id", """[^/]+""",true), StaticPart("/"), DynamicPart("ta", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ClassroomController_addTAToClassroom15_invoker = createInvoker(
    ClassroomController_7.addTAToClassroom(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClassroomController",
      "addTAToClassroom",
      Seq(classOf[String], classOf[String]),
      "POST",
      """""",
      this.prefix + """classes/id/""" + "$" + """id<[^/]+>/""" + "$" + """ta<[^/]+>"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_ListingController_getAllListings16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listings")))
  )
  private[this] lazy val controllers_ListingController_getAllListings16_invoker = createInvoker(
    ListingController_0.getAllListings(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ListingController",
      "getAllListings",
      Nil,
      "GET",
      """listings""",
      this.prefix + """listings"""
    )
  )

  // @LINE:40
  private[this] lazy val controllers_ListingController_filterQualified17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listings/qualified/"), DynamicPart("e", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ListingController_filterQualified17_invoker = createInvoker(
    ListingController_0.filterQualified(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ListingController",
      "filterQualified",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """listings/qualified/""" + "$" + """e<[^/]+>"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_ListingController_createNewListing18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listings")))
  )
  private[this] lazy val controllers_ListingController_createNewListing18_invoker = createInvoker(
    ListingController_0.createNewListing(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ListingController",
      "createNewListing",
      Nil,
      "POST",
      """""",
      this.prefix + """listings"""
    )
  )

  // @LINE:42
  private[this] lazy val controllers_ListingController_deleteListing19_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listings/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ListingController_deleteListing19_invoker = createInvoker(
    ListingController_0.deleteListing(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ListingController",
      "deleteListing",
      Seq(classOf[String]),
      "DELETE",
      """""",
      this.prefix + """listings/""" + "$" + """id<[^/]+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index)
      }
  
    // @LINE:9
    case controllers_UserController_authenticate1_route(params) =>
      call { 
        controllers_UserController_authenticate1_invoker.call(UserController_2.authenticate())
      }
  
    // @LINE:13
    case controllers_UserController_registerNew2_route(params) =>
      call { 
        controllers_UserController_registerNew2_invoker.call(UserController_2.registerNew())
      }
  
    // @LINE:15
    case controllers_HomeController_info3_route(params) =>
      call { 
        controllers_HomeController_info3_invoker.call(HomeController_1.info())
      }
  
    // @LINE:17
    case controllers_PasswordController_resetPassword4_route(params) =>
      call { 
        controllers_PasswordController_resetPassword4_invoker.call(PasswordController_5.resetPassword())
      }
  
    // @LINE:20
    case controllers_ProfileController_registerNew5_route(params) =>
      call { 
        controllers_ProfileController_registerNew5_invoker.call(ProfileController_4.registerNew())
      }
  
    // @LINE:21
    case controllers_ProfileController_editProfile6_route(params) =>
      call(params.fromPath[String]("e", None)) { (e) =>
        controllers_ProfileController_editProfile6_invoker.call(ProfileController_4.editProfile(e))
      }
  
    // @LINE:23
    case controllers_OpenApplicationController_sendOpenApplication7_route(params) =>
      call { 
        controllers_OpenApplicationController_sendOpenApplication7_invoker.call(OpenApplicationController_3.sendOpenApplication())
      }
  
    // @LINE:25
    case controllers_UserController_getUserByUsername8_route(params) =>
      call(params.fromPath[String]("u", None)) { (u) =>
        controllers_UserController_getUserByUsername8_invoker.call(UserController_2.getUserByUsername(u))
      }
  
    // @LINE:27
    case controllers_ProfileController_getProfileByEmail9_route(params) =>
      call(params.fromPath[String]("p", None)) { (p) =>
        controllers_ProfileController_getProfileByEmail9_invoker.call(ProfileController_4.getProfileByEmail(p))
      }
  
    // @LINE:29
    case controllers_TAResponseController_createNewTAResponse10_route(params) =>
      call { 
        controllers_TAResponseController_createNewTAResponse10_invoker.call(TAResponseController_6.createNewTAResponse())
      }
  
    // @LINE:32
    case controllers_ClassroomController_getAllClassrooms11_route(params) =>
      call { 
        controllers_ClassroomController_getAllClassrooms11_invoker.call(ClassroomController_7.getAllClassrooms())
      }
  
    // @LINE:33
    case controllers_ClassroomController_getClassById12_route(params) =>
      call(params.fromPath[String]("c", None)) { (c) =>
        controllers_ClassroomController_getClassById12_invoker.call(ClassroomController_7.getClassById(c))
      }
  
    // @LINE:34
    case controllers_ClassroomController_getClassByEmail13_route(params) =>
      call(params.fromPath[String]("e", None)) { (e) =>
        controllers_ClassroomController_getClassByEmail13_invoker.call(ClassroomController_7.getClassByEmail(e))
      }
  
    // @LINE:35
    case controllers_ClassroomController_createNewClassroom14_route(params) =>
      call { 
        controllers_ClassroomController_createNewClassroom14_invoker.call(ClassroomController_7.createNewClassroom())
      }
  
    // @LINE:36
    case controllers_ClassroomController_addTAToClassroom15_route(params) =>
      call(params.fromPath[String]("id", None), params.fromPath[String]("ta", None)) { (id, ta) =>
        controllers_ClassroomController_addTAToClassroom15_invoker.call(ClassroomController_7.addTAToClassroom(id, ta))
      }
  
    // @LINE:39
    case controllers_ListingController_getAllListings16_route(params) =>
      call { 
        controllers_ListingController_getAllListings16_invoker.call(ListingController_0.getAllListings())
      }
  
    // @LINE:40
    case controllers_ListingController_filterQualified17_route(params) =>
      call(params.fromPath[String]("e", None)) { (e) =>
        controllers_ListingController_filterQualified17_invoker.call(ListingController_0.filterQualified(e))
      }
  
    // @LINE:41
    case controllers_ListingController_createNewListing18_route(params) =>
      call { 
        controllers_ListingController_createNewListing18_invoker.call(ListingController_0.createNewListing())
      }
  
    // @LINE:42
    case controllers_ListingController_deleteListing19_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_ListingController_deleteListing19_invoker.call(ListingController_0.deleteListing(id))
      }
  }
}
