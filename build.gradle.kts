plugins {
    java
    application
}

application {
    mainClassName = "io.github.tduncan.Main"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.6.2")
}

tasks.test {
    useJUnitPlatform()
}