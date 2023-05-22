import sbt._

object Dependencies {
  // Versions
  lazy val sparkVersion = "3.4.0"
  lazy val scalatestVersion = "3.2.16"
  lazy val mockitoScalaScalatestVersion = "1.17.14"

  // Libraries
  val spark = "org.apache.spark" %% "spark-sql" % sparkVersion
  val sparkSqlKafka010 = "org.apache.spark" %% "spark-sql-kafka-0-10" % sparkVersion
  val scalatestWordspec = "org.scalatest" %% "scalatest-wordspec" % scalatestVersion
  val scalatestShouldmatchers = "org.scalatest" %% "scalatest-shouldmatchers" % scalatestVersion
  val mockitoScalaScalatest = "org.mockito" %% "mockito-scala-scalatest" % mockitoScalaScalatestVersion

  // Projects
  val coreDeps: Seq[ModuleID] =
    Seq(
      spark % Provided,
      sparkSqlKafka010 % Provided,
      scalatestWordspec % Test,
      scalatestShouldmatchers % Test,
      mockitoScalaScalatest % Test)
}
