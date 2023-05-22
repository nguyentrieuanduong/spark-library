import Dependencies._

ThisBuild / scalaVersion := "2.13.10"
ThisBuild / organization := "com.dnta"
ThisBuild / organizationName := "dnta"

initialize := {
  val _ = initialize.value // run the previous initialization
  val requiredJdk = "1.8"
  val currentJdk = sys.props("java.specification.version")
  assert(currentJdk == requiredJdk, s"Unsupported JDK: java.specification.version $currentJdk != $requiredJdk")
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
