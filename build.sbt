import play.Project._

name := "UniCarbKB"

version := "1.0"

libraryDependencies ++= Seq(javaJdbc, javaEbean, javaCore, anorm, jdbc, javaJpa, filters, cache, "com.jolbox" % "bonecp" % "0.8.0-rc1")

playJavaSettings

