package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.example.libbase.model.User
import com.example.librouter.Router

@Route(path = "/login/LoginActivity")
class LoginActivity : AppCompatActivity() {
    private val TAG = LoginActivity::class.java.simpleName

    // 接收从StartActivity传递过来的数据
    @Autowired(name = "key2")   //变量名str改为key2
    @JvmField
    var str: String? = null

    @Autowired
    @JvmField
    var data: User? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        ARouter.getInstance().inject(this)  // 注入
        Log.i(TAG, "onCreate: key2=${str}")
        Log.i(TAG, "onCreate : data=${data?.userName}")
    }

    fun onClickView(view: View) {
        // Router -通过router跳转至其他的业务组件
//        Router.startActivity(this, "/main/MainActivity")

        // ARouter
        ARouter.getInstance().build("/main/MainActivity").navigation()  // 跳转至MainActivity
    }
}