plugins {
    id("com.android.library")
}

android {
    compileSdk = AppConfig.compileSdk
    namespace = "com.example.common"
}

dependencies {

    implementation(AppDependencies.appLibraries)
    //test libs
    testImplementation(AppDependencies.testLibraries)
    androidTestImplementation(AppDependencies.androidTestLibraries)
}