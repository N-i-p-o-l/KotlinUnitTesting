group 'me.rozkmin.testing'
version '1.0-SNAPSHOT'

buildscript {
    ext.kotlin_version = '1.2.61'

    repositories {
        mavenCentral()
    }
    dependencies {
        classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version"
    }
}