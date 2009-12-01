import net.blue64.scalatraining.stocks.model.Stock
import net.blue64.scalatraining.stocks.pricing._
import net.blue64.scalatraining.stocks.quotes._

/**
 * Created by IntelliJ IDEA.
 * User: Steve Levine
 * Date: Nov 30, 2009
 * Copyright 2009 blue64.net. All rights reserved.
 */

PricingEngineActor.start()

PricingEngineActor ! new NYSEQuoteService(new Stock("aapl", 0, 4.73E9, 878876000))
PricingEngineActor ! new NasdaqQuoteService(new Stock("ibm", 0, 1.23E10, 1384331000))
PricingEngineActor ! new NYSEQuoteService(new Stock("goog", 0, 4.19E9, 314754113))
PricingEngineActor ! 100.00
PricingEngineActor ! "exit"