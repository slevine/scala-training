/**
 * Created by IntelliJ IDEA.
 * User: Steve Levine
 * Date: Dec 8, 2009
 * Copyright 2009 blue64.net. All rights reserved.
 *
 * Code sample used for blog posts:
 *  http://blue64.net/2009/12/scala-sugar-arrays-lists-maps/
 */


// Review val vs var
val name = "Steve"
// name = "Steven" is illegal

var cname = "Steve"
cname = "Steven"  // ok

// Arrays
val sayHello = new Array[String](2)
sayHello(0) = "Hello"

// Everything is a method call
sayHello update (1," World\n")

for (i <- 0 to 1)
   print(sayHello(i))
// equiv print (sayHello.apply(i))

// If you are in a more concise mood
val sayHi = Array("Hello", " World")

// or if you are feeling more verbose
//val sayHi = Array.apply("Hello", " World")

// Some nice Scala Sugar - Looks like a sentence right?
sayHi foreach print




