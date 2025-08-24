import scala.collection.Seq

name := "jdk11"
version := "1.0"
scalaVersion := "2.12.18"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "3.5.6",
  "org.apache.spark" %% "spark-sql"  % "3.5.6"
)
Compile / mainClass := Some("test")
