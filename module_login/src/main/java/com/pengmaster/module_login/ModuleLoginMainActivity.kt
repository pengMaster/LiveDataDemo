package com.pengmaster.module_login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.module_login_activity_main.*

class ModuleLoginMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.module_login_activity_main)



        tvName.setOnClickListener {
            Toast.makeText(applicationContext,"Toast",Toast.LENGTH_SHORT).show()
        }


    }
}
