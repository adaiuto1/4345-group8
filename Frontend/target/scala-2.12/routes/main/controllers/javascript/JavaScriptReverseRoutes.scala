// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/brian/Documents/SMU/sem6/4345/portal/4345-group8/Frontend/conf/routes
// @DATE:Sun Apr 16 13:14:27 CDT 2023

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers.javascript {

  // @LINE:20
  class ReverseApplicationController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def ApplicationHandler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApplicationController.ApplicationHandler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sendOpenApplication"})
        }
      """
    )
  
    // @LINE:20
    def openApplicationForm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApplicationController.openApplicationForm",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "openApplication"})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def profileHandler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.profileHandler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "registerProfile"})
        }
      """
    )
  
    // @LINE:18
    def editProfileHandler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.editProfileHandler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "submitProfileChanges"})
        }
      """
    )
  
    // @LINE:26
    def passwordHandler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.passwordHandler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "submitNewPassword"})
        }
      """
    )
  
    // @LINE:32
    def openPositionViewer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.openPositionViewer",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "openPositionViewer"})
        }
      """
    )
  
    // @LINE:36
    def openProfileView: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.openProfileView",
      """
        function(profile0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("profile", profile0)})
        }
      """
    )
  
    // @LINE:10
    def signup: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.signup",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
    // @LINE:24
    def changePassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.changePassword",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "changePassword"})
        }
      """
    )
  
    // @LINE:8
    def loginHandler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.loginHandler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:16
    def editProfile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.editProfile",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "editProfile"})
        }
      """
    )
  
    // @LINE:12
    def signupHandler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.signupHandler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
        }
      """
    )
  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:34
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:28
  class ReverseTAResponseController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:28
    def openResponseForm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TAResponseController.openResponseForm",
      """
        function(c0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "TA_Application/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("c", c0))})
        }
      """
    )
  
    // @LINE:30
    def TAResponseHandler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TAResponseController.TAResponseHandler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sendTAResponse"})
        }
      """
    )
  
  }


}
