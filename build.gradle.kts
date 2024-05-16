// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.2.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.24" apply false
    //To configure the Hilt Gradle plugin with Gradle's new plugins DSL
    id("com.google.dagger.hilt.android") version "2.51" apply false
}
buildscript {
    repositories {
        // other repositories...
        mavenCentral()
    }
    dependencies {
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.51")
    }
}