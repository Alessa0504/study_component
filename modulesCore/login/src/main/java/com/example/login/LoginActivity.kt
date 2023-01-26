package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.librouter.Router

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

    }

    fun onClickView(view: View) {
        // 通过router跳转至其他的业务组件
        Router.startActivity(this, "/main/MainActivity")
    }
}