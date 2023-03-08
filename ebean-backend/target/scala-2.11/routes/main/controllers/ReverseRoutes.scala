
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/brian/Documents/SMU/sem6/4345/portal/4345-group8/ebean-backend/conf/routes
// @DATE:Wed Mar 08 13:33:50 CST 2023

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:29
  class ReverseTAResponseController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def createNewTAResponse(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "sendTAResponse")
    }
  
  }

  // @LINE:17
  class ReversePasswordController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def resetPassword(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "resetPassword")
    }
  
  }

  // @LINE:20
  class ReverseProfileController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def getProfileByEmail(p:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "getProfileByEmail/" + implicitly[PathBindable[String]].unbind("p", dynamicString(p)))
    }
  
    // @LINE:20
    def registerNew(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "registerProfile")
    }
  
  }

  // @LINE:32
  class ReverseClassroomController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def getClassById(c:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "classes/id/" + implicitly[PathBindable[String]].unbind("c", dynamicString(c)))
    }
  
    // @LINE:33
    def getClassByEmail(e:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "classes/teacher/" + implicitly[PathBindable[String]].unbind("e", dynamicString(e)))
    }
  
    // @LINE:34
    def createNewClassroom(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "classes/newClassroom")
    }
  
  }

  // @LINE:9
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def getUserByUsername(u:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "getUserByUsername/" + implicitly[PathBindable[String]].unbind("u", dynamicString(u)))
    }
  
    // @LINE:9
    def authenticate(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:13
    def registerNew(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "signup")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
    // @LINE:15
    def info(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "info")
    }
  
  }

  // @LINE:23
  class ReverseOpenApplicationController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def sendOpenApplication(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "sendOpenApplication")
    }
  
  }


}
