package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.example.librouter.Router

@Route(path = "/login/LoginActivity")
class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

    }

    fun onClickView(view: View) {
        // Router -通过router跳转至其他的业务组件
//        Router.startActivity(this, "/main/MainActivity")

        // ARouter
        ARouter.getInstance().build("/main/MainActivity").navigation()  // 跳转至MainActivity
    }
}