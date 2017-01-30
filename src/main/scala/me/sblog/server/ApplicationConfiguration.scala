package me.sblog.server

import scala.util.Properties._

object ApplicationConfiguration {
  val hostName: String = envOrElse("SERVER_HOST", "localhost")
  val publicPort: Int = envOrElse("PUBLIC_PORT", "8080").toInt
  val adminPort: Int = envOrElse("ADMIN_PORT", "9090").toInt
  val repositoryLink: String = envOrElse("REPOSITORY_LINK", "https://github.com/jrabasco/SBlog")
  val mongoDBHost: String = envOrElse("MONGO_HOST", "localhost")
  val mongoDBPort: Int = envOrElse("MONGO_PORT", "27017").toInt
  val mongoDBName: String = envOrElse("MONGO_NAME", "sblog")
}
