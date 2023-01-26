package com.example.study_component

import android.app.Application
import com.example.component.MainActivity
import com.example.librouter.Router
import com.example.login.LoginActivity

/**
 * @Description: 自定义Application
 * @author zouji
 * @date 2023/1/26
 */
class App : Application() {
    override fun onCreate() {
        super.onCreate()
        // 注册各业务组件
        Router.register("/main/MainActivity", MainActivity::class.java)
        Router.register("/login/LoginActivity", LoginActivity::class.java)
    }
}