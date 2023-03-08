// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/brian/Documents/SMU/sem6/4345/portal/4345-group8/Frontend/conf/routes
// @DATE:Wed Mar 08 13:38:06 CST 2023

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers {

  // @LINE:16
  class ReverseApplicationController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def ApplicationHandler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "sendOpenApplication")
    }
  
    // @LINE:16
    def openApplicationForm(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "openApplication")
    }
  
  }

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def profileHandler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "registerProfile")
    }
  
    // @LINE:22
    def passwordHandler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "submitNewPassword")
    }
  
    // @LINE:10
    def signup(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signup")
    }
  
    // @LINE:20
    def changePassword(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "changePassword")
    }
  
    // @LINE:8
    def loginHandler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:12
    def signupHandler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "register")
    }
  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:29
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def at(file:String): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:24
  class ReverseTAResponseController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def openResponseForm(c:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "TA_Application/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("c", c)))
    }
  
    // @LINE:26
    def TAResponseHandler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "sendTAResponse")
    }
  
  }


}
