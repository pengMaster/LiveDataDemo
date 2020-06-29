package com.pengmaster.livedatademo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import com.chad.library.adapter.base.entity.MultiItemEntity
import com.pengmaster.livedatademo.adapter.MultiListAdapter
import kotlinx.android.synthetic.main.activity_main3.*

/**
 *  列表套列表
 */
class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val adapter = MultiListAdapter()
        rv.layoutManager = LinearLayoutManager(applicationContext)
        rv.adapter  = adapter
        val lists = mutableListOf<MultiItemEntity>(
            DataItemData(0),
            DataItemData(1),
            DataItemData(2),
            DataItemData(2),
            DataItemData(2),
            DataItemData(2)
        )

        adapter.setNewData(lists)


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
