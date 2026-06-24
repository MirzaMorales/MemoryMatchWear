plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "mx.utng.mnml.memorymatchwear"
    compileSdk {
        version = release(36) {
            minorApiLevel = 1
        }
    }

    defaultConfig {
        applicationId = "mx.utng.mnml.memorymatchwear"
        minSdk = 30
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    useLibrary("wear-sdk")
    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(platform(libs.compose.bom))
    implementation(libs.activity.compose)
    implementation(libs.compose.foundation)
    implementation(libs.compose.material3)
    implementation(libs.compose.ui.tooling)
    implementation(libs.core.splashscreen)
    implementation(libs.play.services.wearable)
    implementation(libs.ui)
    implementation(libs.ui.graphics)
    implementation(libs.ui.tooling.preview)
    implementation(libs.wear.tooling.preview)

    // Extra dependencies for MemoryMatch
    implementation("androidx.wear.compose:compose-material:1.3.1")
    implementation("androidx.wear.compose:compose-foundation:1.3.1")
    implementation("androidx.compose.animation:animation:1.7.6")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.8.7")
    implementation("androidx.datastore:datastore-preferences:1.1.1")

    // Testing
    testImplementation("junit:junit:4.13.2")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.8.1")

    androidTestImplementation(platform(libs.compose.bom))
    androidTestImplementation(libs.ui.test.junit4)
    debugImplementation(libs.ui.test.manifest)
    debugImplementation(libs.ui.tooling)
}