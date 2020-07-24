plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("kotlin-kapt")
}
android {
    compileSdkVersion(29)


    defaultConfig {
        applicationId = "com.jmc.desafioscotiabank"
        minSdkVersion(21)
        targetSdkVersion(29)
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}

dependencies {
    implementation(fileTree("libs") { include(listOf("*.jar")) })

    implementation(Dependencies.kotlin_stdlib)
    implementation(Dependencies.core_ktx)
    implementation(Dependencies.appcompat)
    implementation(Dependencies.contraint)
    implementation(Dependencies.recycler)
    implementation(Dependencies.swipe)
    testImplementation(Dependencies.junit)
    androidTestImplementation(Dependencies.junit_ext)
    androidTestImplementation(Dependencies.espresso)
    implementation(Dependencies.material)
    implementation(Dependencies.coroutine)
    // glide
    implementation(Dependencies.glide)
    implementation(Dependencies.glidepalette)
    kapt(Dependencies.glide_compile)

    // Retrofit
    implementation( Dependencies.retrofit)
    implementation( Dependencies.interceptor)
    implementation( Dependencies.okhttp)
    implementation (Dependencies.gson)

    // Lifecycle (ViewModel + LiveData)
    implementation (Dependencies.lifecycle)
    kapt (Dependencies.lifecycle_compile)
    implementation (Dependencies.testt_core)
    /* Koin */


    implementation (Dependencies.cardview)

    implementation(Dependencies.koin)
    implementation(Dependencies.koinExt)
    implementation(Dependencies.koinScope)
    implementation(Dependencies.koinViewModel)
    testImplementation(Dependencies.koinTest)
}