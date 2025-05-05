plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "com.juantorres.ejerciciodoce"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.juantorres.ejerciciodoce"
        minSdk = 21
        targetSdk = 33

        // Opcional: puedes definir versionCode y versionName
        versionCode = 1
        versionName = "1.0"
    }

    buildFeatures {
        viewBinding = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.10.1")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.2")
    implementation("androidx.activity:activity-ktx:1.7.2")
    implementation("com.google.android.material:material:1.9.0")
}
