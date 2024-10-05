plugins {
  id("com.android.library")
}

android {
  namespace = "com.silva.util"
  compileSdk = 34
  
  defaultConfig {
     minSdk = 26
  }

  buildTypes {
    release {
      isMinifyEnabled = false
      proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
    }
  }

  buildFeatures { viewBinding = true }
}

dependencies {
  implementation(libs.androidx.appcompat)
  implementation(libs.google.material)
}
