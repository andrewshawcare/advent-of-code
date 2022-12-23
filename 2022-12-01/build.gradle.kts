plugins {
    java
    id("org.springframework.boot") version "3.0.0"
    id("com.google.cloud.tools.jib") version "3.3.1"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web:3.0.0")
}

jib {
    to {
        image = "andrewshawcare/advent-of-code.2022-12-01"
    }
}