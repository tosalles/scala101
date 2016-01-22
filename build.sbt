lazy val commonSettings = Seq(
  scalaVersion := "2.11.5"
)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "scala101"
  )

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.6" % "test"