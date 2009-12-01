package net.blue64.scalatraining.stocks.model;

/**
 * Created by IntelliJ IDEA.
 * User: Steve Levine
 * Date: Nov 18, 2009
 * Copyright 2009 blue64.net. All rights reserved.
 */

class Stock(val ticker: String, var price: Double, var earnings: Double, var shares: Int) {
  override def toString = ticker + " has eps of: " + eps + " with a price of " + price

  def eps = earnings / shares

  def >(that: Stock): Boolean = {eps > that.eps}
}



