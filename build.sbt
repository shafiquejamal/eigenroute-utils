import sbt.IvyConsole.Dependencies._
import ReleaseTransformations._
import sbt.StdoutOutput

releaseCrossBuild := false
releaseProcess := Seq[ReleaseStep](
  checkSnapshotDependencies,
  inquireVersions,
  runClean,
  runTest,
  setReleaseVersion,
  commitReleaseVersion,
  tagRelease,
  releaseStepCommand("publishSigned"),
  setNextVersion,
  commitNextVersion,
  releaseStepCommand("sonatypeReleaseAll"),
  pushChanges
)

name := """util"""

version := "0.0.4"
organization := "com.eigenroute"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "joda-time" % "joda-time" % "2.9.7",
  "com.google.inject" % "guice" % "4.1.0"
)

outputStrategy := Some(StdoutOutput)


useGpg := true
pomIncludeRepository := { _ => false }

licenses := Seq("BSD-style" -> url("http://www.opensource.org/licenses/bsd-license.php"))

homepage := Some(url("https://github.com/shafiquejamal/richstat"))

scmInfo := Some(
  ScmInfo(
    url("https://github.com/shafiquejamal/eigenroute-utils"),
    "scm:git@github.com:shafiquejamal/eigenroute-utils.git"
  )
)

developers := List(
  Developer(
    id    = "shafiquejamal",
    name  = "Shafique Jamal",
    email = "admin@eigenroute.com",
    url   = url("http://eigenroute.com")
  )
)

publishMavenStyle := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

publishArtifact in Test := false
