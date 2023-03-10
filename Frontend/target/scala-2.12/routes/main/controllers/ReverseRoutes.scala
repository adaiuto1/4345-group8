// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/brian/Documents/SMU/sem6/4345/portal/4345-group8/Frontend/conf/routes
// @DATE:Wed Mar 08 15:47:37 CST 2023

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers {

  // @LINE:20
  class ReverseApplicationController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def ApplicationHandler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "sendOpenApplication")
    }
  
    // @LINE:20
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
  
    // @LINE:18
    def editProfileHandler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "submitProfileChanges")
    }
  
    // @LINE:26
    def passwordHandler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "submitNewPassword")
    }
  
    // @LINE:10
    def signup(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signup")
    }
  
    // @LINE:24
    def changePassword(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "changePassword")
    }
  
    // @LINE:8
    def loginHandler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:16
    def editProfile(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "editProfile")
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

  // @LINE:33
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:33
    def at(file:String): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:28
  class ReverseTAResponseController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:28
    def openResponseForm(c:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "TA_Application/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("c", c)))
    }
  
    // @LINE:30
    def TAResponseHandler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "sendTAResponse")
    }
  
  }


}
