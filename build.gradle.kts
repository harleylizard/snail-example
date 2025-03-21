import soul.software.snail.dependency.snail
import soul.software.snail.dependency.soulSoftware

plugins {
    id("soul.software.snail") version "3.1-SNAPSHOT"
}

group = "com.harleylizard"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    soulSoftware()
}

dependencies {
    snail {
        `kotlin-minecraft`.include
    }

    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

snail {
    fabric("1.21.1") {
        name = "Example"
        id = "example"
        version = "1.0-SNAPSHOT"
        description = "Example mod"
        entryPoints {
            main = listOf("com.harleylizard.example.Example")
        }
    }
}