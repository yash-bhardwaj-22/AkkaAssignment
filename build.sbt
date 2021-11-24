name := "AkkaAssignment"

version := "0.1"

scalaVersion := "2.13.7"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.6.16",
  "com.typesafe.akka" %% "akka-stream" % "2.6.16",
  "com.typesafe.akka" %% "akka-http" % "10.2.6",
  "com.typesafe.akka" %% "akka-http-spray-json" % "10.2.6",
  "ch.megard" %% "akka-http-cors" % "1.1.2"
)
