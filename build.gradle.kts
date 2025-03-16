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
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

snail {
    multiple("1.21.1") {
        val common = project(":common") {
            sponge()
        }

        project(":fabric") {
            from(common)
            fabric {
                name = "Example"
                id = "example"
                version = "1.0-SNAPSHOT"
                description = "Example mod"
                entryPoints {
                    main = listOf("com.harleylizard.example.Example")
                }
            }
        }
    }
}