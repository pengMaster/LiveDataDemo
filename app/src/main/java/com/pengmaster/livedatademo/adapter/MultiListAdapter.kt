package com.pengmaster.livedatademo.adapter

import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.chad.library.adapter.base.entity.MultiItemEntity
import com.pengmaster.livedatademo.R

/**
 * <pre>
 *     author : Wp
 *     e-mail : 1101313414@qq.com
 *     time   : 2020-06-28 19:50
 *     desc   :
 *     version: 1.0
 * </pre>
 */
class MultiListAdapter : BaseMultiItemQuickAdapter<MultiItemEntity, BaseViewHolder>(mutableListOf()) {

    init {
        addItemType(0, R.layout.item_one)
        addItemType(1, R.layout.item_two)
        addItemType(2, R.layout.item_recycle)
    }


    override fun convert(helper: BaseViewHolder?, item: MultiItemEntity?) {


        val adapter1 = ItemAdapter()
        helper?.itemView?.findViewById<RecyclerView>(R.id.recyclerView).run {

            this?.layoutManager = LinearLayoutManager(this?.context)
            this?.adapter = adapter1
            adapter1.setNewData(mutableListOf("5","6","7"))
        }

//        helper?.addOnClickListener(R.id.tvFooter)

        helper?.itemView?.findViewById<TextView>(R.id.tvFooter)?.run {
            this.setOnClickListener {
                if(this.text == "展示更多"){
                    adapter1.setNewData(mutableListOf("5","6","7","8","9"))
                    this.text = "向上收起"
                }else{
                    adapter1.setNewData(mutableListOf("5","6","7"))
                    this.text = "展示更多"
                }

            }

        }
    }

    class ItemAdapter constructor( layout : Int =  R.layout.item_text) : BaseQuickAdapter<String, BaseViewHolder>(layout) {


        override fun convert(helper: BaseViewHolder?, item: String?) {

            helper?.setText(R.id.tvText,item)

        }
    }
}
