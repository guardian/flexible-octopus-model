import ReleaseTransformations._

name             := "flexible-octopus-model"
scalaVersion     := "2.13.2"
organization     := "com.gu"
crossScalaVersions := Seq("2.11.12", "2.12.11", scalaVersion.value)
releaseCrossBuild := true

resolvers += Resolver.jcenterRepo

licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0.html"))
publishArtifact := true

scmInfo := Some(ScmInfo(url("https://github.com/guardian/flexible-octopus-model"), "scm:git@github.com:guardian/flexible-octopus-model"))
homepage := scmInfo.value.map(_.browseUrl)
developers := List(Developer(id = "guardian", name = "Guardian", email = null, url = url("https://github.com/guardian")))

releasePublishArtifactsAction := PgpKeys.publishSigned.value
publishTo := sonatypePublishTo.value

releaseProcess := Seq[ReleaseStep](
  checkSnapshotDependencies,
  inquireVersions,
  runClean,
  runTest,
  setReleaseVersion,
  publishArtifacts,
  releaseStepCommand("sonatypeReleaseAll"),
  commitReleaseVersion,
  tagRelease,
  setNextVersion,
  commitNextVersion,
  pushChanges
)

libraryDependencies ++= Seq(
  "org.apache.thrift" % "libthrift" % "0.13.0",
  "com.twitter" %% "scrooge-core" % "20.5.0"
)
