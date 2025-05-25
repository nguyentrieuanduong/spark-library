import Dependencies.*

ThisBuild / scalaVersion := "2.13.16"
ThisBuild / organization := "com.dnta"
ThisBuild / organizationName := "dnta"

initialize := {
  val _ = initialize.value // run the previous initialization
  val requiredJdk = List("1.8", "8", "11", "17")
  val currentJdk = sys.props("java.specification.version")
  assert(requiredJdk.contains(currentJdk), s"Unsupported JDK: java.specification.version $currentJdk != $requiredJdk")
}

lazy val root = (project in file("."))
  .aggregate(core)
  .dependsOn(core % "compile")
  .settings(
    name := "spark-library"
  )

lazy val core = (project in file("core"))
  .settings(
    name := "core",
    libraryDependencies ++= coreDeps
  )
