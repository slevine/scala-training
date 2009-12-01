package net.blue64.scalatraining.stocks.quotes

import net.blue64.scalatraining.stocks.model.Stock

/**
 * Created by IntelliJ IDEA.
 * User: Steve Levine
 * Date: Nov 30, 2009
 * Copyright 2009 blue64.net. All rights reserved.
 */

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