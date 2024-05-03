plugins {
    alias(libs.plugins.kotlinMultiplatform)
}

group = "io.github.kotlinopenfoundation"
version = "0.1.0"

kotlin {
    linuxX64()
    linuxArm64()
    mingwX64()

    applyDefaultHierarchyTemplate()

    sourceSets {
        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
    }
}
