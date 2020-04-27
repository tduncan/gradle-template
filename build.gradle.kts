plugins {
    java
    application
}

application {
    mainClassName = "io.github.tduncan.Main"
}

configure<JavaPluginConvention> {
    targetCompatibility = JavaVersion.VERSION_14
    sourceCompatibility = JavaVersion.VERSION_14
}