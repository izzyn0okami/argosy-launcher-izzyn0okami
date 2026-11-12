pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url = uri("${rootDir}/libs/maven") }
    }
}

rootProject.name = "argosy-launcher"
include(":app")
include(":sigil")
project(":sigil").projectDir = file("sigil/bindings/android")
project(":sigil").buildFileName = "../../../gradle/sigil.build.gradle.kts"
include(":libretrodroid")
