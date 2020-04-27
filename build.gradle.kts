plugins {
    java
    application
}

configure<JavaPluginConvention> {
    targetCompatibility = JavaVersion.VERSION_14
    sourceCompatibility = JavaVersion.VERSION_14
}

application {
    mainClassName = "io.github.tduncan.Main"
}