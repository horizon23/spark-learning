name := "spark-learning"

version := "1.0"

val versions = Map(
"scala" -> "2.11.11",
"spark" -> "2.2.1"
)

scalaVersion := versions("scala")

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-sql" % versions("spark"),
  "org.apache.spark" %% "spark-hive" % versions("spark"),
  "org.scala-lang" % "scala-compiler" % versions("scala"),
  "org.scala-lang" % "scala-library" % versions("scala"),
  "org.scala-lang" % "scala-reflect" % versions("scala")
)

resolvers ++= Seq(
  "cloudera-repo-releases" at "https://repository.cloudera.com/artifactory/repo"
)

unmanagedSourceDirectories in Test += baseDirectory.value / "src" / "test-integration" / "scala"
unmanagedResourceDirectories in Test += baseDirectory.value / "src" / "test-integration" / "resources"

javaOptions in Test ++= Seq("-Xmx3g", "-XX:MaxPermSize=2g", "-XX:+CMSClassUnloadingEnabled")
javacOptions ++= Seq("-Xlint:deprecation")
