Scala Training
==============
This project is a good starting place for anyone trying to learn to program in Scala.

There is a series of posts found on [blue64.net][] explaining most of the code in this project. 

[blue64.net]: http://blue64.net/tag/scala/ 


Requirements
------------
The only requirement for this project is a configured recent version of [Maven][].

[Maven]: http://maven.apache.org/download.html


Running
-------
Most of the examples in this project consist in the form of Scala scripts.  

To run a Scala script:
    mvn scala:script -DscriptFile= <path to script file>

To run the Stocks Actor examples:
    mvn scala:script -DscriptFile=src/main/scripts/stocks/actor.scala


