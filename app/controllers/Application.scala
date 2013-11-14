package controllers

import play.api._
import play.api.mvc._
import play.api.libs.iteratee.Enumerator

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

//  def echo = Action {
//    SimpleResult(
//      header = ResponseHeader(200, Map(CONTENT_TYPE -> "text/plain")),
//      body   = Enumerator("Hello, world!".getBytes())
//    )
//    Ok("Hello, world!")
//    NotFound(<h1>Page not found</h1>)
//    BadRequest(views.html.)
//    InternalServerError("Oops")
//    Status(488)("Strange response type")
//    Redirect("/", MOVED_PERMANENTLY)
//  }

  def echo = TODO

  def hello(name: String) = Action {
    Ok("Hello, " + name)
  }

}