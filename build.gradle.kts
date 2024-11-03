plugins {
    kotlin("jvm") version "2.0.20"
}

group = "dev.hyunec"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    val coroutineVersion: String by project
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor:${coroutineVersion}")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:${coroutineVersion}")

    val kotestVersion: String by project
    testImplementation("io.kotest:kotest-runner-junit5:$kotestVersion")
    testImplementation("io.kotest:kotest-assertions-core:$kotestVersion")
    testImplementation("io.kotest:kotest-property:$kotestVersion")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}
