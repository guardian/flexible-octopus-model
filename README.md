# Flexible Octopus Model
 
This is the Thrift definition of the Flexible Octopus model.

### Testing Locally

If you need to try out your changes with consumer applications (e.g. `flexible-octopus-converter`) then...

- Run `+publishLocal` in sbt (note the `+` makes it cross-compile, e.g. `flexible-octopus-converter` consumes the 2.13 version)
- Update the version in the consumer application(s) (e.g. https://github.com/guardian/flexible-octopus-converter/blob/2a479b8a782d306b1cebbc1abaec49c2c95844ba/build.sbt#L34) using the `-SNAPSHOT` version.

### Publishing a new version

1. Follow the instructions for [publishing a new version to Maven Central via Sonatype](https://docs.google.com/document/d/1rNXjoZDqZMsQblOVXPAIIOMWuwUKe3KzTCttuqS7AcY/edit#).
   This will include (if not already completed for another project):
    - Creating and publishing a PGP key
    - Setting up an account on Sonatype and having it added to the `com.gu` group
    - Storing your Sonatype credentials in your global sbt configuration
2. Ensure you're on the branch which holds the changes you're ready to release and that these changes have been approved & tested with the application(s) which use this library (using the `-SNAPSHOT` version).
3. Ensure the project still builds with `sbt compile`
4. Run `sbt release`. You will be prompted for a 'release version' – which you should set following semantic versioning as either a patch,
   minor or major version bump. You will also be prompted for a 'next version' – which should be a patch version ahead of your release version
   and end `-SNAPSHOT`. `version.sbt` will be updated to reflect this 'next version'.
