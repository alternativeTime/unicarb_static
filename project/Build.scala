import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

    val appName         = "UniCarbKB"
    val appVersion      = "1.0"

    val appDependencies = Seq(
      // Add your project dependencies here,
      //	"com.github.play2war" %% "play2-war-core" % "0.3",
	// "org.hibernate" % "hibernate-entitymanager" % "3.6.9.Final",
	 javaCore, javaJdbc, javaEbean, anorm, jdbc, javaJpa, filters,
	 "com.jolbox" % "bonecp" % "0.8.0-rc1"
    )

    val main = play.Project(appName, appVersion, appDependencies).settings(
      // Add your own project settings here 
	 //resolvers += "Play2war plugins release" at "http://repository-play-war.forge.cloudbees.com/release/"     
    )

}


