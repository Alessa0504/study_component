package com.example.study_component

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alibaba.android.arouter.launcher.ARouter
import com.example.librouter.Router

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        // 自定义Router
//        Router.startActivity(this, "/login/LoginActivity")

        // ARouter
        ARouter.getInstance().build("/login/LoginActivity").navigation()  // 跳转至LoginActivity
    }
}