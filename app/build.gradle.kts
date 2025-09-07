plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    id("kotlin-kapt")
    id("org.jetbrains.kotlin.plugin.serialization") version "1.9.10" // Kotlin serialization plugin
}

android {
    namespace = "com.example.wildshapesmountsandfamiliars"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.wildshapesmountsandfamiliars"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {
    // Core Android dependencies
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)

    // Compose
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)

    // DataStore
    implementation("androidx.datastore:datastore-preferences:1.1.7")

    // Navigation
    implementation("androidx.navigation:navigation-compose:2.9.0")

    // Room components
    implementation("androidx.room:room-runtime:2.7.2")
    implementation(libs.firebase.crashlytics.buildtools)
    kapt("androidx.room:room-compiler:2.7.2")
    implementation("androidx.room:room-ktx:2.7.2")

    // Coroutines (recommended with Room)
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")

    // Lifecycle ViewModel with Compose
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.9.1")

    // Kotlin Serialization JSON
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.3")
    implementation("androidx.datastore:datastore-preferences:1.0.0")
    implementation("androidx.core:core-splashscreen:1.0.1")


    // Testing
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    implementation ("com.google.code.gson:gson:2.10.1")

}

tasks.withType<Test>().configureEach {
    enabled = false
}
