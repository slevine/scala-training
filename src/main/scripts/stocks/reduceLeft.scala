import net.blue64.scalatraining.stocks.model.Stock

/**
 * Created by IntelliJ IDEA.
 * User: Steve Levine
 * Date: Nov 19, 2009
 * Copyright 2009 blue64.net. All rights reserved.
 */


val portfolio = List(
  new Stock("aapl", 203, 4.73E9, 878876000),
  new Stock("ibm", 66, 1.23E10, 1384331000),
  new Stock("goog", 465, 4.19E9, 314754113)
)

println("---reduce left---")

println(
  portfolio.reduceLeft(
    (s1, s2) => if (s1 > s2) s1 else s2
  )
)

