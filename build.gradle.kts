// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript{
    repositories{
        google()
        mavenCentral()
    }
    dependencies{
        classpath("com.android.tools.build:gradle:8.0.2")
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.7.6")
    }
}


plugins {
    id("com.android.application") version "8.1.3" apply false
}