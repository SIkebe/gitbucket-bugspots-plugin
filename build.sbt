val Organization = "me.huzi.gitbucket"
val ProjectName = "gitbucket-bugspots-plugin"
val ProjectVersion = "4.11.0"

lazy val root = (project in file(".")).enablePlugins(SbtTwirl)

organization := Organization
name := ProjectName
version := ProjectVersion
scalaVersion := "2.12.1"

libraryDependencies ++= Seq(
  "io.github.gitbucket" %% "gitbucket"          % "4.11.0" % "provided",
  "com.typesafe.play"   %% "twirl-compiler"     % "1.3.0"  % "provided",
  "javax.servlet"        % "javax.servlet-api"  % "3.1.0"  % "provided"
)

scalacOptions := Seq("-deprecation", "-feature", "-language:postfixOps", "-Ydelambdafy:method", "-target:jvm-1.8")
javacOptions in compile ++= Seq("-target", "8", "-source", "8")

useJCenter := true

