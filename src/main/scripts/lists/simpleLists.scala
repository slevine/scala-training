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
 */


val l = List("a", "b", "c")

l.map(_.toUpperCase()).foreach(printf("%s", _))

for (s <- l) print (s.toUpperCase()) 

l.map(printf("%s", _))

l.foreach(printf("%s", _))

