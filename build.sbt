name         := "slickless"
organization := "io.tabmo"
version      := "0.3.1"
scalaVersion := "2.12.1"

crossScalaVersions := Seq("2.11.8", "2.12.1")

licenses += ("Apache-2.0", url("http://apache.org/licenses/LICENSE-2.0"))

bintrayOrganization in ThisBuild := Some("tabmo")

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding", "UTF-8",
  "-unchecked",
  "-feature",
  "-language:implicitConversions",
  "-language:postfixOps",
  "-Ywarn-dead-code",
  "-Xlint",
  "-Xfatal-warnings"
)

libraryDependencies ++= Seq(
  "com.typesafe.slick" %% "slick"           % "3.2.0",
  "com.chuusai"        %% "shapeless"       % "2.3.2",
  "org.scalatest"      %% "scalatest"       % "3.0.1"   % "test",
  "com.h2database"      % "h2"              % "1.4.191" % "test",
  "ch.qos.logback"      % "logback-classic" % "1.1.7"   % "test"
)

pomExtra in Global := {
  <url>https://github.com/underscoreio/slickless</url>
  <scm>
    <connection>scm:git:github.com/studiodev/slickless</connection>
    <developerConnection>scm:git:git@github.com:studiodev/slickless</developerConnection>
    <url>github.com/studiodev/slickless</url>
  </scm>
  <developers>
    <developer>
      <id>d6y</id>
      <name>Richard Dallaway</name>
      <url>http://twitter.com/d6y</url>
    </developer>
    <developer>
      <id>davegurnell</id>
      <name>Dave Gurnell</name>
      <url>http://twitter.com/davegurnell</url>
    </developer>
    <developer>
      <id>milessabin</id>
      <name>Miles Sabin</name>
      <url>http://twitter.com/milessabin</url>
    </developer>
    <developer>
      <id>julienlafont</id>
      <name>Julien lafont</name>
      <url>http://twitter.com/julien_lafont</url>
    </developer>
  </developers>
}
