/**
 * Created by IntelliJ IDEA.
 * User: Steve Levine
 * Date: Nov 18, 2009
 * Time: 9:27:12 PM
 */

class Stock(val ticker: String, var price: Double, var earnings: Double, var shares: Int) {
  override def toString = ticker + " has eps of: " + eps + " with a price of " + price

  def eps = earnings / shares

  def >(that: Stock): Boolean = {eps > that.eps}
}

abstract class QuoteService {
  def price(): Unit
}

class NasdaqQuoteService(stock: Stock) extends QuoteService {
  stock.price = 100.00;
  def price() = println(stock)
}

class NYSEQuoteService(stock: Stock) extends QuoteService {
  stock.price = 66.00;
  def price() = println(stock)
}

