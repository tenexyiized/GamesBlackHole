plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

android {
    compileSdkVersion (32)

    defaultConfig {
        applicationId = "com.example.gamesblackhole"
        minSdkVersion (23)
        targetSdkVersion (32)
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles (getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

kapt {
    correctErrorTypes = true
}

dependencies {

    implementation ("androidx.core:core-ktx:1.8.0")
    implementation ("androidx.appcompat:appcompat:1.5.0")
    implementation ("com.google.android.material:material:1.6.1")
    implementation ("androidx.constraintlayout:constraintlayout:2.1.4")

    implementation ("com.google.dagger:hilt-android:2.43.2")
    kapt ("com.google.dagger:hilt-compiler:2.43.2")

    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")

    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4")
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")

    implementation ("androidx.activity:activity-ktx:1.5.1")
    implementation ("androidx.fragment:fragment-ktx:1.5.2")

    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.6.0-alpha01")
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.0-alpha01")

    implementation ("androidx.room:room-runtime:2.4.3")
    kapt ("androidx.room:room-compiler:2.4.3")
    implementation ("androidx.room:room-ktx:2.4.3")


    testImplementation ("junit:junit:4.+")
    testImplementation ("com.google.truth:truth:1.1.3")
    testImplementation ("androidx.arch.core:core-testing:2.1.0")
    testImplementation ("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.6.4")



    androidTestImplementation ("androidx.test.ext:junit:1.1.3")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.4.0")
    androidTestImplementation ("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.6.4") // added run blockinng test
    androidTestImplementation ("com.google.truth:truth:1.1.3")
    androidTestImplementation ("androidx.arch.core:core-testing:2.1.0")
    androidTestImplementation ("com.google.dagger:hilt-android-testing:2.43.2")
    kaptAndroidTest ("com.google.dagger:hilt-android-compiler:2.43.2")

    implementation ("com.squareup.moshi:moshi:1.12.0")
    implementation ("com.squareup.moshi:moshi-adapters:1.12.0")
    implementation ("com.squareup.moshi:moshi-kotlin:1.12.0")
    implementation ("com.squareup.retrofit2:converter-moshi:2.9.0")

}