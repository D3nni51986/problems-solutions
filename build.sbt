name := "problems-solutions"
version := "1.0"

scalaVersion := "2.12.8"

resolvers += Resolver.jcenterRepo

libraryDependencies ++= {
  val akkaV = "2.5.0"
  val akkaHttpV = "10.0.5"
  Seq(
    "org.scalacheck" %% "scalacheck" % "1.14.0" % "test",
    "com.typesafe.akka" %% "akka-actor" % "2.5.9",
    "com.typesafe.akka" %% "akka-testkit" % "2.5.9" % Test,
    "com.typesafe.akka" %% "akka-stream" % "2.5.9",
    "com.typesafe.akka" %% "akka-stream-testkit" % "2.5.9" % Test,
    "com.typesafe.akka" %% "akka-http" % "10.0.11",
    "com.typesafe.akka" %% "akka-http-testkit" % "10.0.11" % Test,
    "org.scala-lang.modules" %% "scala-async" % "0.9.7",
    "org.micchon" %% "play-json-xml" % "0.3.0",
    "org.scalactic" %% "scalactic" % "3.0.5",
    "org.scalatest" %% "scalatest" % "3.0.5" % "test",
    "org.apache.httpcomponents" % "httpclient" % "4.5.6",
    "org.typelevel" %% "cats-core" % "1.3.1",
    "io.monix" %% "shade" % "1.10.0",
    "net.sourceforge.htmlcleaner" % "htmlcleaner" % "2.19",
    "com.google.guava" % "guava" % "19.0",
    "io.circe" %% "circe-core" % "0.10.0",
    "io.circe" %% "circe-generic" % "0.10.0",
    "io.circe" %% "circe-parser" % "0.10.0",
    "com.lihaoyi" %% "utest" % "0.6.6" % "test"
  )
}

