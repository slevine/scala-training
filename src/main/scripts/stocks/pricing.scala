import net.blue64.scalatraining.stocks.model.Stock
import net.blue64.scalatraining.stocks.pricing.{Price, SimplePrice, SimplerPrice}

/**
 * Created by IntelliJ IDEA.
 * User: Steve Levine
 * Date: Nov 30, 2009
 * Copyright 2009 blue64.net. All rights reserved.
 */


println("---basic price---")

println(
  new Price().price(
    new Stock("aapl", 203, 4.73E9, 878876000),
    new Stock("ibm", 66, 1.23E10, 1384331000),
    new Stock("goog", 465, 4.19E9, 314754113)
  )
)

println("---better price---")

println(
  SimplerPrice.price(
    new Stock("aapl", 203, 4.73E9, 878876000),
    new Stock("ibm", 66, 1.23E10, 1384331000),
    new Stock("goog", 465, 4.19E9, 314754113)
  )
)


println("---Fancy Price---")

SimplePrice.price(
  new Stock("aapl", 203, 4.73E9, 878876000),
  new Stock("ibm", 66, 1.23E10, 1384331000),
  new Stock("goog", 465, 4.19E9, 314754113)
)
