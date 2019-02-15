import Dependencies._

// give the user a nice default project!
organization := "io.purplepenguin"
scalaVersion := "2.12.8"

lazy val commonDeps = Seq(
  scalaTest % Test,
  pureConfig,
  playJson
)

lazy val root = (project in file("."))
  .settings(name := "root")
  .aggregate(
    purplepenguin
  )

lazy val purplepenguin = (project in file("purple-penguin"))
  .settings(
    name := "purple-penguin",
    libraryDependencies ++= commonDeps
  )
