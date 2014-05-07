package shared

import sbt._

object SharedBuild extends Build {
  lazy val root = Project(id = "shared-code", base = file("."))

  lazy val sub = project
}
