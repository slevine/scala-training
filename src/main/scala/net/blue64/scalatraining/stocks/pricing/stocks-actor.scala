package net.blue64.scalatraining.stocks.pricing

import scala.actors._
import scala.actors.Actor._
import net.blue64.scalatraining.stocks.quotes.QuoteService

/**
 * Created by IntelliJ IDEA.
 * User: Steve Levine
 * Date: Nov 18, 2009
 * Copyright 2009 blue64.net. All rights reserved.
 */

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
