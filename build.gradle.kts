plugins {
    id ("org.springframework.boot") version "2.6.0"
    java
}

group "org.example"
version "1.0-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_11
}

repositories {
    mavenCentral()
}

springBoot {
    mainClass.set("com.example.seungdols.Application")
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web:2.6.0")

    implementation("org.mybatis.spring.boot:mybatis-spring-boot-starter:2.2.2")
    implementation("com.h2database:h2:2.1.214")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.mybatis.spring.boot:mybatis-spring-boot-starter-test:2.2.2")
}

tasks.test {
    useJUnitPlatform()
}
