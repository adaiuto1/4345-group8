
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/paig/Desktop/SMU/Spring 2023/CS 4345/4345-group8/ebean-backend/conf/routes
// @DATE:Wed Mar 01 16:35:17 CST 2023


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
