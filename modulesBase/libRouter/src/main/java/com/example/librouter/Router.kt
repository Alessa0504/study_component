package com.example.librouter

import android.app.Activity
import android.content.Intent

/**
 * @Description: Router
 * @author zouji
 * @date 2023/1/26
 */
object Router {
    // groupMap = hashMapOf<groupName, HashMap<path, clazz>>()
    val groupMap = hashMapOf<String, HashMap<String, Class<*>>>()
    val routeMap = hashMapOf<String, Class<*>>()

    /**
     * 注册class
     * @param path  /组名/router类  /main/MainActivity
     * @param clazz
     */
    fun register(path: String, clazz: Class<*>) {
        val list = path.split("/")
        if (list.size > 2) {
            val groupName = list[1]   //main
            val routeName = path
            var group: HashMap<String, Class<*>>? = null
            if (groupMap.containsKey(groupName)) {
                group = groupMap[groupName]
            }
            group?.let {
                it[routeName] = clazz
            } ?: run {
                group = hashMapOf()
                group!![routeName] = clazz
                groupMap[groupName] = group!!
            }

        }
    }

    /**
     * 获取class并跳转
     * @param path  /组名/router类  /main/MainActivity
     */
    fun startActivity(activity: Activity, path: String) {
        val list = path.split("/")
        if (list.size > 2) {
            val groupName = list[1]
            val routeName = path
            var group: HashMap<String, Class<*>>? = null
            if (groupMap.containsKey(groupName)) {
                group = groupMap[groupName]
            }
            group?.let {
                if (it.containsKey(routeName)) {
                    val clazz = group[routeName]
                    activity.startActivity(Intent(activity, clazz))
                }
            }
        }
    }
}