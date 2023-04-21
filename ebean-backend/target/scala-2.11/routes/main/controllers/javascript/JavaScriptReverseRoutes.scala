
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/brian/Documents/SMU/sem6/4345/portal/4345-group8/ebean-backend/conf/routes
// @DATE:Fri Apr 21 11:21:00 CDT 2023

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:29
  class ReverseTAResponseController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def createNewTAResponse: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TAResponseController.createNewTAResponse",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "sendTAResponse"})
        }
      """
    )
  
  }

  // @LINE:17
  class ReversePasswordController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def resetPassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PasswordController.resetPassword",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "resetPassword"})
        }
      """
    )
  
  }

  // @LINE:39
  class ReverseListingController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:41
    def createNewListing: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ListingController.createNewListing",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "listings"})
        }
      """
    )
  
    // @LINE:42
    def deleteListing: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ListingController.deleteListing",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "listings/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id0))})
        }
      """
    )
  
    // @LINE:39
    def getAllListings: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ListingController.getAllListings",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "listings"})
        }
      """
    )
  
    // @LINE:40
    def filterQualified: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ListingController.filterQualified",
      """
        function(e0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "listings/qualified/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("e", encodeURIComponent(e0))})
        }
      """
    )
  
  }

  // @LINE:20
  class ReverseProfileController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def getProfileByEmail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProfileController.getProfileByEmail",
      """
        function(p0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getProfileByEmail/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("p", encodeURIComponent(p0))})
        }
      """
    )
  
    // @LINE:21
    def editProfile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProfileController.editProfile",
      """
        function(e0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "editProfile/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("e", encodeURIComponent(e0))})
        }
      """
    )
  
    // @LINE:20
    def registerNew: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProfileController.registerNew",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "registerProfile"})
        }
      """
    )
  
  }

  // @LINE:32
  class ReverseClassroomController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def getAllClassrooms: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClassroomController.getAllClassrooms",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "classes"})
        }
      """
    )
  
    // @LINE:35
    def createNewClassroom: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClassroomController.createNewClassroom",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "classes/newClassroom"})
        }
      """
    )
  
    // @LINE:33
    def getClassById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClassroomController.getClassById",
      """
        function(c0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "classes/id/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("c", encodeURIComponent(c0))})
        }
      """
    )
  
    // @LINE:36
    def addTAToClassroom: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClassroomController.addTAToClassroom",
      """
        function(id0,ta1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "classes/id/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id0)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("ta", encodeURIComponent(ta1))})
        }
      """
    )
  
    // @LINE:34
    def getClassByEmail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClassroomController.getClassByEmail",
      """
        function(e0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "classes/teacher/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("e", encodeURIComponent(e0))})
        }
      """
    )
  
  }

  // @LINE:9
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def getUserByUsername: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.getUserByUsername",
      """
        function(u0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getUserByUsername/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("u", encodeURIComponent(u0))})
        }
      """
    )
  
    // @LINE:9
    def authenticate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.authenticate",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:13
    def registerNew: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.registerNew",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:15
    def info: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.info",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "info"})
        }
      """
    )
  
  }

  // @LINE:23
  class ReverseOpenApplicationController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def sendOpenApplication: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OpenApplicationController.sendOpenApplication",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "sendOpenApplication"})
        }
      """
    )
  
  }


}
