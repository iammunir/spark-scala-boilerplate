name := "learn-spark-scala"

version := "0.1"

scalaVersion := "2.12.10"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "3.0.1",
  "org.apache.spark" %% "spark-sql" % "3.0.1",
  "org.apache.spark" %% "spark-mllib" % "3.0.1",
  "org.apache.spark" %% "spark-streaming" % "3.0.1",
  "org.postgresql" % "postgresql" % "9.3-1102-jdbc41"
)
