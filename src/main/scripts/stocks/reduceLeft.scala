import net.blue64.scalatraining.stocks.{SimplePrice, SimplerPrice, Price, Stock}

/**
 * Created by IntelliJ IDEA.
 * User: Steve Levine
 * Date: Nov 19, 2009
 * Time: 12:09:12 AM
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

println("---basic price---")

val p1 = new Price
println(
  p1.price(
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

SimplePrice.price(portfolio)