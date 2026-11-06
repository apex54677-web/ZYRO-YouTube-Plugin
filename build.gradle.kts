plugins {
    java
    alias(libs.plugins.lavalink)
}

group = "com.zyro.youtube"
version = "0.1.0"

lavalinkPlugin {
    name = "zyro-youtube-plugin"
    apiVersion = libs.versions.lavalink.api
    serverVersion = libs.versions.lavalink.server
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

tasks {
    compileJava {
        options.encoding = "UTF-8"
    }
}

dependencies {
    // add your dependencies here
}
