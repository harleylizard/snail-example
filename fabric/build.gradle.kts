import soul.software.snail.dependency.snail

group = "com.harleylizard"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    snail {
        `kotlin-minecraft`.include
    }
}