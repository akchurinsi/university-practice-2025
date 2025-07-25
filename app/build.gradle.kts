/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Java application project to get you started.
 * For more details on building Java & JVM projects, please refer to https://docs.gradle.org/8.12.1/userguide/building_java_projects.html in the Gradle documentation.
 * This project uses @Incubating APIs which are subject to change.
 */

plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    application
    war
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    // Use JUnit Jupiter for testing.
    testImplementation(libs.junit.jupiter)

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    // This dependency is used by the application.
     // This dependency is used by the application.
    implementation(libs.guava)
    implementation(libs.spring.context)
    implementation(libs.spring.orm)
    implementation(libs.hikari)
    implementation(libs.jakarta.persistence.api)
    implementation(libs.hibernate.hikaricp)
    implementation(libs.hibernate.core)
    implementation(libs.slf4j.api)
    implementation(libs.logback.core)
    implementation(libs.logback.classic)
    implementation(libs.spring.data.jpa)
    implementation(libs.spring.webmvc)
    providedCompile(libs.jakarta.servlet)
    implementation(libs.jackson.core)
    runtimeOnly(libs.h2)
    implementation(libs.thymeleaf)
    implementation(libs.thymeleaf.spring)
}

testing {
    suites {
        // Configure the built-in test suite
        val test by getting(JvmTestSuite::class) {
            // Use JUnit Jupiter test framework
            useJUnitJupiter("5.11.1")
        }
    }
}

// Apply a specific Java toolchain to ease working on different environments.
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

application {
    // Define the main class for the application.
    mainClass = "ru.bsuedu.practice.App"
}

tasks.war {
    archiveFileName.set("stationaryshop.war")
}
