package com.pengmaster.livedatademo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.lifecycle.*
import androidx.recyclerview.widget.LinearLayoutManager
import com.chad.library.adapter.base.entity.MultiItemEntity
import com.pengmaster.livedatademo.adapter.ItemAdapter
import com.pengmaster.livedatademo.adapter.ItemAdapter2
import com.pengmaster.livedatademo.adapter.MultiAdapter
import com.pengmaster.livedatademo.model.LiveModel
import com.pengmaster.module_login.ModuleLoginMainActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    val model : LiveModel by lazy {
         ViewModelProvider(this).get(LiveModel::class.java)
    }
    private val adapter2 : MultiAdapter = MultiAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView.layoutManager = LinearLayoutManager(this)
        listView.adapter = adapter2


        adapter2.setOnItemChildClickListener { adapter, view, position ->

            view.findViewById<TextView>(R.id.tvText).text = "我改变了"
            val findViewById = view.findViewById<LinearLayout>(R.id.llChange)
            if(findViewById.visibility == View.VISIBLE){
                view.findViewById<LinearLayout>(R.id.llChange).visibility = View.GONE
            }else{
                view.findViewById<LinearLayout>(R.id.llChange).visibility = View.VISIBLE
            }



            println("setOnItemChildClickListener 1")
        }


        btnGo.setOnClickListener {
            model.setChange()
        }
        btnTo.setOnClickListener {
//            Main2Activity.intentToAct(model)
            model.setChangeItem()
        }


        registerObserver()

        model.showAdapter()

    }

    fun registerObserver(){
        model.isChangeLayout.observe(this, Observer {
            if(it){
                val lists = mutableListOf<MultiItemEntity>(DataItemData(0),DataItemData(1),DataItemData(2))
                adapter2.setNewData(lists)
            }else{
                val lists = mutableListOf<MultiItemEntity>(DataItemData(0),DataItemData(2),DataItemData(2),DataItemData(2))
                adapter2.setNewData(lists)
            }

        })

        model.isChangeLayoutItem.observe(this, Observer {
            adapter2.setData(1,DataItemData(0))
        })

    }

    class DataItem constructor(type : Int): MultiItemEntity {

        var type1 : Int = 0
        init {
            type1 = type
        }

        override fun getItemType(): Int {
            return type1
        }

    }

    data class DataItemData(
        //
        var type : Int
    ): MultiItemEntity {
        override fun getItemType(): Int {
            return  type
        }
    }
}
