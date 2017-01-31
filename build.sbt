javacOptions ++= Seq("-source", "1.8", "-target", "1.8", "-Xlint")

lazy val commonSettings = Seq(
  scalaVersion := "2.12.1"
)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "scala101"
  )

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"

libraryDependencies += "junit" % "junit" % "4.12" % "test"
