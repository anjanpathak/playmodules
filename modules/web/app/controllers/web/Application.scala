package controllers.web

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.web.index("Your new application is ready."))
  }

}