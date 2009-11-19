/**
 * Created by IntelliJ IDEA.
 * User: Steve Levine
 * Date: Nov 18, 2009
 * Time: 9:23:39 PM
 */
import scala.actors._
import scala.actors.Actor._

object PricingEngineActor extends Actor {
  def act() {
    loop {
      receive {
        case qs: QuoteService => qs.price()
        case "exit" => println("exiting..."); exit
        case y: Any => println("Service Not Found..." + y)
      }
    }
  }
}
