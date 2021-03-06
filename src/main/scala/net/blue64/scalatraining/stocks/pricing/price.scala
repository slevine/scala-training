package net.blue64.scalatraining.stocks.pricing

import net.blue64.scalatraining.stocks.model.Stock

/**
 * Created by IntelliJ IDEA.
 * User: Steve Levine
 * Date: Nov 18, 2009
 * Copyright 2009 blue64.net. All rights reserved.
 */

class Price {
  // function(strings: any number of Stocks)
  // : returns ArrayList<Stock> = { method def
  def price(stocks: Stock*) : Seq[String] = {

    // map mtd takes a function literal
    // closure: s:Stock  => s.toString
    stocks.map((s:Stock) => s.toString())
    // just like groovy, no return statement necessary
  }
}


object SimplerPrice {
  // Scala can infer the return type, so no ret type needed
  // we can use the "placeholder" _ in place of s:Stock s.toString()
  // anonymous variable "_"
  def price(stocks: Stock*) = stocks.map(_.toString())
}


object SimplePrice {
    // each '_' is independent
    //
    // first one s:Stock => s.toString()
    // thus, '_' = s:Stock => s
    //
    // second one: foreach(s:Stock printf"%s", s)
    // '_' ~ 'it' in Groovy
  def price(stocks: Stock*) = {
    stocks.map(_.toString()).foreach(printf("%s \n", _))
  }
}