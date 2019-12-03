name := "js-resources"

enablePlugins(ScalaJSBundlerPlugin)

scalaVersion := "2.11.12"

scalaJSUseMainModuleInitializer := true

npmDependencies in Compile += "uuid" -> "3.1.0"

libraryDependencies += "org.scalatest" %%% "scalatest" % "3.1.0" % Test

ivyLoggingLevel in ThisBuild := UpdateLogging.Quiet
