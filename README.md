Example repository for https://stackoverflow.com/questions/30878290/ignore-dependency-jars-on-dist-task

Removes scala-library from the output libraries.

Without mappings:

    > sbt stage
    > ls target/universal/stage/lib/
    org.scala-lang.scala-library-2.10.4.jar  root.root-0.1-SNAPSHOT.jar

With mappings:

    > sbt stage
    > ls target/universal/stage/lib/
