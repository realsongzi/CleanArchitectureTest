plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    // Dagger-Hilt
    id("com.google.devtools.ksp")
    id("com.google.dagger.hilt.android")
    // Room
    id("androidx.room")

}

android {
    namespace = "kr.co.lion.data"
    compileSdk = 35

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }
    room {
        schemaDirectory("$projectDir/schemas")
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
}

dependencies {

    implementation(libs.androidx.multidex)
    // ----- testImplementation -----
    testImplementation(libs.junit)
    testImplementation(libs.androidx.activity)
    testImplementation(libs.androidx.activity.ktx)
    testImplementation(libs.junit)
    testImplementation(libs.kotlinx.coroutines.test)
    testImplementation(libs.truth)
    testImplementation(libs.hilt.android.testing)
    testImplementation(libs.androidx.room.testing)
    testImplementation(libs.mockk)
    testImplementation(libs.junit.jupiter)
    testImplementation(libs.androidx.paging.common.ktx)
    testImplementation(libs.androidx.paging.testing)
    testImplementation(libs.mockwebserver)

    // ----- androidTestImplementation -----
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.hilt.android.testing)
    androidTestImplementation(libs.androidx.paging.testing)
    androidTestImplementation(libs.mockwebserver)

    // ----- implementation -----
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(project(":domain"))
    implementation(libs.hilt.android)
    implementation(libs.androidx.hilt.navigation.compose)
    implementation(libs.retrofit)
    implementation(libs.converter.gson)
    implementation(libs.logging.interceptor) // 로그 출력용
    implementation(libs.androidx.room.runtime)
    implementation(libs.androidx.room.ktx)
    implementation(libs.androidx.room.paging)
    ksp(libs.androidx.room.compiler)
    ksp(libs.hilt.android.compiler)
    implementation(libs.androidx.paging.runtime)
    implementation(libs.androidx.paging.compose)
    implementation(libs.androidx.ui.test.junit4.android)
    // DataStore
    implementation(libs.androidx.datastore.preferences)
    implementation(libs.androidx.datastore.preferences.core)
}