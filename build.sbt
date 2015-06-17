lazy val root = project.in(file(".")).enablePlugins(JavaAppPackaging)

mappings in Universal <<= mappings in Universal map { entity =>
  val filt = entity filter {
    case (file, name) => !(name endsWith "org.scala-lang.scala-library-2.10.4.jar")
  }
  filt
}
