import jdk.nashorn.internal.objects.NativeRegExp.test

plugins {
    kotlin("jvm") version "1.5.10"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))

    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.7.1")
}

tasks.withType<Test>{
    useJUnitPlatform()
}