import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "computer-database"
    val appVersion      = "1.0"

    val appDependencies = Seq(
      // Add your project dependencies here,
	"com.github.play2war" %% "play2-war-core" % "0.3",
	 "org.hibernate" % "hibernate-entitymanager" % "3.6.9.Final"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = JAVA).settings(
      // Add your own project settings here 
	 resolvers += "Play2war plugins release" at "http://repository-play-war.forge.cloudbees.com/release/"     
    )

}


