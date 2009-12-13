/**
 * Created by IntelliJ IDEA.
 * User: Steve Levine
 * Date: Dec 13, 2009
 * Copyright 2009 blue64.net. All rights reserved.
 */

// Notice var instead of val, b/c by default
// Sets are immutable thus after each operation
// a new Set is returned
var afcNorth = Set("NE ", "NYJ ", "MIA ")
afcNorth foreach print
Console println

afcNorth += "BUF "
afcNorth foreach print
Console println

// If you want to use the same Set each time, you can
// use Scala's mutable set where you are returned the
// same set after each operation
val nfcNorth = scala.collection.mutable.Set("NYG ", "WAS ", "DAL ")
nfcNorth foreach print
Console println

nfcNorth += "PHL "
nfcNorth foreach print
Console println

// immutable example afcNorth += "BUF" translates to afcNorth = afcNorth + "BUF"
// mutable example nfcNorth += "PHL" translates to nfcNorth.+=("PHL")

// Same paradigm for Maps mutable/immutalbe

// Immutable
var afcQb = Map("NE" -> "Brady", "NYJ" -> "Sanchez")
afcQb foreach print
Console println

afcQb += ("BUF" -> "Edwards")
afcQb foreach print
Console println

// Mutable
val nfcQb = scala.collection.mutable.Map("NJG" -> "Manning", "DAL" -> "Romo")
nfcQb foreach print
Console println

nfcQb += ("PHL" -> "McNabb")
nfcQb foreach print
Console println



