name := "hello"
version := "1.0"
scalaVersion := "2.12.12"

lazy val common = project.in(file("common"))
  .settings(
 	// libraryDependencies += "org.json4s" %% "json4s-native" % "3.2.11"
	// libraryDependencies += "org.slf4j" % "slf4j-api" % "2.0.0-alpha1"
	// libraryDependencies += "com.typesafe" % "config" % "1.4.1"

	// libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.2" % "test"
	// libraryDependencies += "org.mockito" %% "mockito-scala" % "1.16.5" % "test"
	libraryDependencies ++= Seq("org.json4s" %% "json4s-native" % "3.2.11","org.slf4j" % "slf4j-api" % "2.0.0-alpha1","com.typesafe" % "config" % "1.4.1","org.scalatest" %% "scalatest" % "3.2.2" % "test","org.mockito" %% "mockito-scala-scalatest" % "1.16.15" % Test)
	//"org.scalatest" %% "scalatest" % "2.2.2" % Test,"org.mockito" %% "mockito-scala" % "1.16.5" % Test
)

lazy val persistance = project.in(file("persistance"))
.settings(
 	//libraryDependencies += "org.json4s" %% "json4s-native" % "3.2.11"
	// libraryDependencies += "org.slf4j" % "slf4j-api" % "2.0.0-alpha1"
	// libraryDependencies += "com.typesafe" % "config" % "1.4.1"

	libraryDependencies ++= Seq("com.typesafe.slick" %% "slick" % "3.3.3","org.postgresql" % "postgresql" % "42.2.18","com.h2database" % "h2" % "1.4.200" % Test)
)

//lazy val root = project.in(file(".")).dependsOn(common, persistance)
lazy val root = project.in(file("root")).dependsOn(common, persistance)

lazy val app = project.in(file(".")).dependsOn(root)
//search in project with name and depend it on common and persistance.



/*
// https://mvnrepository.com/artifact/org.scalatest/scalatest
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.2" % Test


// https://mvnrepository.com/artifact/org.mockito/mockito-scala
libraryDependencies += "org.mockito" %% "mockito-scala" % "1.16.5" % Test
*/