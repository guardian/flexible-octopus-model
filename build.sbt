import ReleaseTransformations.*
import sbtversionpolicy.withsbtrelease.ReleaseVersion

name             := "flexible-octopus-model"
scalaVersion     := "2.13.13"
organization     := "com.gu"
crossScalaVersions := Seq("2.12.19", scalaVersion.value)
scalacOptions := Seq("-release:8") // https://github.com/guardian/flexible-octopus-converter currently uses Java 8 for CI

licenses := Seq(License.Apache2)

releaseVersion := ReleaseVersion.fromAggregatedAssessedCompatibilityWithLatestRelease().value
releaseCrossBuild := true
releaseProcess := Seq[ReleaseStep](
  checkSnapshotDependencies,
  inquireVersions,
  runClean,
  runTest,
  setReleaseVersion,
  commitReleaseVersion,
  tagRelease,
  setNextVersion,
  commitNextVersion
)

libraryDependencies ++= Seq(
  "org.apache.thrift" % "libthrift" % "0.13.0",
  "com.twitter" %% "scrooge-core" % "20.5.0"
)
