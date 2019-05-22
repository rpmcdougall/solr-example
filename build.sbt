name := "solr-example"

version := "0.1"

scalaVersion := "2.12.8"


libraryDependencies += "com.github.takezoe" %% "solr-scala-client" % "0.0.20"
libraryDependencies += "com.typesafe.akka" %% "akka-slf4j" % "2.5.12"

// https://mvnrepository.com/artifact/org.apache.solr/solr-solrj
libraryDependencies += "org.apache.solr" % "solr-solrj" % "8.1.0"