/**
 * Created by IntelliJ IDEA.
 * User: Steve Levine
 * Date: Nov 21, 2009
 * Copyright 2009 blue64.net. All rights reserved.
 */

/**
 * Code sample used for blog post
 *  http://blue64.net/2009/11/scala-sugar-lists
 *  http://blue64.net/2009/11/scala-sugar-iteration
 *  http://blue64.net/2009/12/scala-sugar-arrays-lists-maps/
 */


val l = List("a", "b", "c")

// We can go imperative if we like. but...
for (s <- l) print (s.toUpperCase()) 

// functional is much nicer
l.map(_.toUpperCase()).foreach(printf("%s", _))

l.map(printf("%s", _))

l.foreach(printf("%s", _))

l.foreach(print)

l foreach print

// Few sample list operations
println(l.head)
println(l.tail)
println(l.drop(2))


