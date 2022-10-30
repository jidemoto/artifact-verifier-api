# Artifact Verifier Interfaces

A project containing externalized interfaces for Artifact Verifier Notifiers.

This repo is part of a project for Georgia Tech's Cybersecurity Practicum and ongoing support
isn't guaranteed.  See the [Artifact Verifier Repo](https://github.com/jidemoto/artifact-verifier) for more information.

## Making A Notifier

1. Add `to.idemo:artifact-verifier-api:0.0.1` as compileOnly (provided) dependency
2. Create an implementation of Notifier in the package `to.idemo.james.artifactverifier`
3. Annotate it to appropriately be added to the Spring dependency graph
4. Include the built jar on the artifact verifier's class path (`/opt/app/plugins`)
5. Create a container using the new image