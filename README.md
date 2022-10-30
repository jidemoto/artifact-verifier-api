# Artifact Verifier Interfaces

A project containing externalized interfaces for Artifact Verifier Notifiers.

This repo is part of a project for Georgia Tech's Cybersecurity Practicum and ongoing support
isn't guaranteed.  See the [Artifact Verifier Repo](https://github.com/jidemoto/artifact-verifier) for more information.

## Installation

This package isn't published to maven central yet, so you'll have to install this locally 
before you can use the interfaces.  The following command will build the output artifacts 
and install them to your local repo at `~/.m2/repository`.

```shell
./gradlew publishToMavenLocal
```

## Making A Notifier

1. Install this dependency (see above)
2. Add `to.idemo:artifact-verifier-api:0.0.1` as an implementation dependency
3. Create an implementation of Notifier in the package `to.idemo.james.artifactverifier`
4. Annotate it to appropriately be added to the Spring dependency graph
5. Include the built jar on the artifact verifier's class path (`/opt/app/plugins`)
6. Create a container using the new image