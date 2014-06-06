name := "UniCarbKB"

version := "1.0"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
    javaCore,
    javaJpa,
    anorm,
    javaEbean,
    jdbc, filters, cache, "com.jolbox" % "bonecp" % "0.8.0-rc1", javaWs,
    "junit" % "junit" % "4.11",
    "org.scala-sbt" % "test-interface" % "1.0",
    "org.webjars" % "webjars-play_2.10" % "2.3.0-RC1",
    //"org.webjars" % "jquery" % "1.7.2",
    "org.webjars" % "bootstrap" % "3.0.2"
)


includeFilter in (Assets, LessKeys.less) := "*.less"

excludeFilter in (Assets, LessKeys.less) := "_*.less"