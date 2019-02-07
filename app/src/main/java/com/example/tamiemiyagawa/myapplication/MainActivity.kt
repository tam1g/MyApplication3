package com.example.tamiemiyagawa.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.analytics.FirebaseAnalytics

class MainActivity : AppCompatActivity() {
    // [START declare_analytics]
    private lateinit var firebaseAnalytics: FirebaseAnalytics
    // [END declare_analytics]

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // [START shared_app_measurement]
        // Obtain the FirebaseAnalytics instance.
        firebaseAnalytics = FirebaseAnalytics.getInstance(this)
        // [END shared_app_measurement]
    }
}
