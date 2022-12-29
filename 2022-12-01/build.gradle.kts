plugins {
    java
    id("org.springframework.boot") version "3.0.1"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web:3.0.1")
    implementation("org.springframework.boot:spring-boot-starter-actuator:3.0.1")
}