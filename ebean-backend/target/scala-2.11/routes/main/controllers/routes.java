
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/brian/Documents/SMU/sem6/4345/portal/4345-group8/ebean-backend/conf/routes
// @DATE:Wed Mar 01 16:11:54 CST 2023

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseProfileController ProfileController = new controllers.ReverseProfileController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReversePasswordController PasswordController = new controllers.ReversePasswordController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseUserController UserController = new controllers.ReverseUserController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseProfileController ProfileController = new controllers.javascript.ReverseProfileController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReversePasswordController PasswordController = new controllers.javascript.ReversePasswordController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseUserController UserController = new controllers.javascript.ReverseUserController(RoutesPrefix.byNamePrefix());
  }

}
