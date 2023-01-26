package com.example.study_component

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.librouter.Router

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        Router.startActivity(this, "/login/LoginActivity")
    }
}