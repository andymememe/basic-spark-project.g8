name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.11" % "3.0.1" % "test" withSources() withJavadoc(),
  "org.scalacheck" % "scalacheck_2.11" % "1.13.5" % "test" withSources() withJavadoc(),
  "org.apache.spark" % "spark-core_2.11" % "2.1.0" withSources() withJavadoc()
)

initialCommands := "import $organization$.$name;format="lower,word"$._"
