# kof-image

[![Kotlin Alpha](https://kotl.in/badges/experimental.svg)](https://kotlinlang.org/docs/components-stability.html)
[![Kotlin Open Foundation incubator project](https://kotlinopenfoundation.github.io/badges/incubator.svg)](https://kotlinopenfoundation.github.io/#kotlin-open-foundation-on-github)
[![GitHub license](https://img.shields.io/github/license/KotlinOpenFoundation/kof-image)](LICENSE)
[![Download](https://img.shields.io/maven-metadata/v?metadataUrl=https%3A%2F%2Fmaven.pkg.github.com%2FKotlinopenFoundation%2Fkof-image%2Fmaven-metadata.xml)](https://maven.pkg.github.com/KotlinopenFoundation/kof-image/)
[![Kotlin](https://img.shields.io/badge/kotlin-1.9.23-blue.svg?logo=kotlin)](http://kotlinlang.org)
[![GitHub Actions build](https://img.shields.io/github/actions/workflow/status/KotlinopenFoundation/kof-image/build)](https://github.com/KotlinOpenFoundation/kof-image/actions)
[![KDoc link](https://img.shields.io/badge/API_reference-KDoc-blue)](https://kotlinopenfoundation.github.io/kof-image/)

A multiplatform Kotlin library providing tools for basic image manipulation and processing.

## Overview

`kof-image` supports 1-bit, 8-bit, 24-bit, and 32-bit per pixel images in various formats.
It provides a simple API for loading and saving images, as well as basic image manipulation operations,
and is highly extensible.

BMP format is supported natively, and other formats can be supported when the appropriate dependencies are provided.
Among the supported libraries are `libpng` and `imagemagick`.

## Using in your projects

> Note that the library is experimental, and the API is subject to change.

### Gradle

Make sure that you have our repository in the list of repositories:

```gradle
repositories {
    maven {
        url = uri("https://maven.pkg.github.com/KotlinOpenFoundation/kof-image")
    }
}
```

Add the library to dependencies:

```gradle
dependencies {
    implementation("io.github.kotlinopenfoundation:kof-image:0.1.0")
}
```

In multiplatform projects, add a dependency to the `commonMain` source set dependencies:
    
```gradle
kotlin {
    sourceSets {
        commonMain {
            dependencies {
                implementation("io.github.kotlinopenfoundation:kof-image:0.1.0")
            }
        }
    }
}
```

### Maven

Make sure that you have our repository in the list of repositories:

```xml
<repositories>
    <repository>
        <id>kof-image</id>
        <url>https://maven.pkg.github.com/KotlinOpenFoundation/kof-image</url>
    </repository>
</repositories>
```

Add the library to dependencies:

```xml
<dependencies>
    <dependency>
        <groupId>io.github.kotlinopenfoundation</groupId>
        <artifactId>kof-image</artifactId>
        <version>0.1.0</version>
    </dependency>
</dependencies>
```

### Android

`kof-image` is not tested on Android on a regular basis,
but the library is compatible with Android 5.0+ (API level 21+).

### Contributing

Read the [Contributing Guidelines](CONTRIBUTING.md).

### License

`kof-image` is licensed under the [Apache 2.0 license](LICENSE).
