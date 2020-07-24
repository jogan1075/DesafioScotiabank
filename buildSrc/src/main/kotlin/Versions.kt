object Versions {
    const val kotlin = "1.3.72"
    const val koin = "2.0.1"
    const val core_ktx = "1.3.1"
    const val appcompat="1.1.0"
    const val glide="4.10.0"
    const val okhttp="4.7.2"
    const val retrofit="2.9.0"
    const val lifecycle="2.2.0"
    const val core_test="2.1.0"
    const val glidepalette="2.1.2"
    const val junit="4.13"
    const val junit_ext="1.1.1"
    const val espresso="3.2.0"
    const val coroutines="1.3.5"
    const val constraint="1.1.3"
}

object Dependencies {

    const val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
    const val core_ktx = "androidx.core:core-ktx:${Versions.core_ktx}"

    const val koin = "org.koin:koin-android:${Versions.koin}"
    const val koinScope = "org.koin:koin-androidx-scope:${Versions.koin}"
    const val koinViewModel = "org.koin:koin-androidx-viewmodel:${Versions.koin}"
    const val koinExt = "org.koin:koin-androidx-ext:${Versions.koin}"
    const val koinTest = "org.koin:koin-test:${Versions.koin}"

    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val contraint = "androidx.constraintlayout:constraintlayout:${Versions.constraint}"
    const val recycler = "androidx.recyclerview:recyclerview:${Versions.appcompat}"
    const val swipe = "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.appcompat}"
    const val junit = "junit:junit:${Versions.junit}"
    const val junit_ext = "androidx.test.ext:junit:${Versions.junit_ext}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    const val material = "com.google.android.material:material:${Versions.appcompat}"
    const val coroutine = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"

    // glide
    const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    const val glidepalette = "com.github.florent37:glidepalette:${Versions.glidepalette}"
    const val glide_compile = "com.github.bumptech.glide:compiler:${Versions.glide}"

    // Retrofit
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val interceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp}"
    const val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
    const val gson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"

    // Lifecycle (ViewModel + LiveData)
    const val lifecycle = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
    const val lifecycle_compile = "androidx.lifecycle:lifecycle-compiler:${Versions.lifecycle}"
    const val testt_core = "android.arch.core:core-testing:${Versions.core_test}"

}