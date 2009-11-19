/**
 * Created by IntelliJ IDEA.
 * User: Steve Levine
 * Date: Nov 18, 2009
 * Time: 9:29:33 PM
 */


PricingEngineActor.start()

PricingEngineActor ! new NYSEQuoteService(new Stock("aapl", 0, 4.73E9, 878876000))
PricingEngineActor ! new NasdaqQuoteService(new Stock("ibm", 0, 1.23E10, 1384331000))
PricingEngineActor ! new NYSEQuoteService(new Stock("goog", 0, 4.19E9, 314754113))
PricingEngineActor ! 100.00
PricingEngineActor ! "exit"
