import sbt._
import sbt.Keys._



object Build extends Build {
  val appName = "first-project"
  val appVersion = "1.0"

  val dependencies = Seq(
    "org.seleniumhq.selenium" % "selenium-java" % "2.39.0",
    "org.scalatest" % "scalatest_2.10" % "2.0.RC1",
    "com.google.code.findbugs" % "jsr305" % "1.3.+",
    "org.scalatest" % "scalatest_2.10" % "2.0" % "test"
  )

  val localRepoUrl = Some(Resolver.file("Local repository",  new File(Path.userHome.absolutePath + "/.ivy2/local/")))

  val main = play.Project(
    appName, appVersion,
    dependencies,
    settings = Defaults.defaultSettings
  )
  .settings(
    scalaVersion := "2.11.0",
    resolvers += Classpaths.typesafeReleases,
    resolvers += localRepoUrl.get,
    sbt.Keys.fork in Test := false
  )
}