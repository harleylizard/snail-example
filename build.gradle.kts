import com.harleylizard.snail.fabric

plugins {
    kotlin("jvm") version "2.1.0"
    id("com.harleylizard.snail-simple") version "1.0-SNAPSHOT"
    id("fabric-loom") version "1.10-SNAPSHOT"
}

group = "com.harleylizard"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    minecraft("com.mojang:minecraft:1.21.4")
    mappings(loom.officialMojangMappings())

    fabric {
        implementation("fabric-loader")
        implementation("fabric-api")
        implementation("fabric-language-kotlin")
    }

    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}
