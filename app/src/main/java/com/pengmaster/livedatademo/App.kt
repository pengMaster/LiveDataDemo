package com.pengmaster.livedatademo

import android.app.Application

/**
 * <pre>
 *     author : Wp
 *     e-mail : 1101313414@qq.com
 *     time   : 2020-06-13 19:48
 *     desc   :
 *     version: 1.0 
 * </pre>
 */
class App : Application() {

    override fun onCreate() {
        super.onCreate()
        app = this
    }


    companion object{

        private lateinit var app : App

        @JvmStatic
        fun get() : App{
            return app
        }
    }
}