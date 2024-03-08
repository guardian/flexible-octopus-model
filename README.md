# Flexible Octopus Model

[![flexible-octopus-model Scala version support](https://index.scala-lang.org/guardian/flexible-octopus-model/flexible-octopus-model/latest-by-scala-version.svg?platform=jvm)](https://index.scala-lang.org/guardian/flexible-octopus-model/flexible-octopus-model)

This is the Thrift definition of the Flexible Octopus model.

### Testing Locally

If you need to try out your changes with consumer applications (e.g. `flexible-octopus-converter`) then...

- Run `+publishLocal` in sbt (note the `+` makes it cross-compile, e.g. `flexible-octopus-converter` consumes the 2.13 version)
- Update the version in the consumer application(s) (e.g. https://github.com/guardian/flexible-octopus-converter/blob/2a479b8a782d306b1cebbc1abaec49c2c95844ba/build.sbt#L34) using the `-SNAPSHOT` version.

# Publishing a new release

This repo uses [`gha-scala-library-release-workflow`](https://github.com/guardian/gha-scala-library-release-workflow)
to automate publishing releases (both full & preview releases) - see
[**Making a Release**](https://github.com/guardian/gha-scala-library-release-workflow/blob/main/docs/making-a-release.md).
