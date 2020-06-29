package com.pengmaster.livedatademo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pengmaster.livedatademo.model.LiveModel
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btnBack.setOnClickListener {
            mModel.showAdapter()
            finish()
        }
    }

    companion object{

        lateinit var mModel : LiveModel

        @JvmStatic
        fun intentToAct(model : LiveModel){
            mModel = model
            val intent = Intent()
            intent.setClass(App.get().applicationContext,Main2Activity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            App.get().applicationContext.startActivity(intent)
        }
    }

}
