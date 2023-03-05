
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/brian/Documents/SMU/sem6/4345/portal/4345-group8/ebean-backend/conf/routes
// @DATE:Sun Mar 05 16:00:34 CST 2023

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

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
