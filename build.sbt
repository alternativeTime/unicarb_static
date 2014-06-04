name := "UniCarbKB"

version := "1.0"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
    javaCore,
    javaJpa,
    anorm,
    javaEbean,
    jdbc, filters, cache, "com.jolbox" % "bonecp" % "0.8.0-rc1", javaWs
)

