
name             := "flexible-octopus-model"
scalaVersion     := "2.13.2"
version          := "0.3.0"
organization     := "com.gu"
crossScalaVersions := Seq("2.11.12", "2.13.1")

resolvers += Resolver.jcenterRepo

publishMavenStyle := true
bintrayOrganization := Some("guardian")
bintrayVcsUrl := Some("git:git@github.com:guardian/flexible-octopus-model.git")
bintrayRepository := "editorial-tools"

licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0.html"))
publishArtifact := true

libraryDependencies ++= Seq(
  "org.apache.thrift" % "libthrift" % "0.13.0",
  "com.twitter" %% "scrooge-core" % "20.5.0"
)