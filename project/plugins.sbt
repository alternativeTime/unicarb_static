// Comment to get more information during initialization
logLevel := Level.Warn

// The Typesafe repository
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

// Use the Play sbt plugin for Play projects
//addSbtPlugin("play" % "sbt-plugin" % Option(System.getProperty("play.version")).getOrElse("2.1.0"))
//addSbtPlugin("play" % "sbt-plugin" % "2.2.0")
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.2.0")


//resolvers += "Play2war plugins release" at "http://repository-play-war.forge.cloudbees.com/release/"

//addSbtPlugin("com.github.play2war" % "play2-war-plugin" % "0.3")
