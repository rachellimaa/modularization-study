plugins {
    id("com.android.library")
}

android {
    compileSdk = AppConfig.compileSdk
    namespace = "com.example.common"
}

dependencies {

    implementation(Deps.appcompat)
    implementation(Deps.coreKtx)
    implementation(Deps.constraintLayout)
    implementation(Deps.material)
    //test libs
    testImplementation(Deps.junit)

    androidTestImplementation(Deps.espressoCore)
    androidTestImplementation(Deps.extJUnit)
}