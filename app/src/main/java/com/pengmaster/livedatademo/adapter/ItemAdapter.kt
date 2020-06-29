package com.pengmaster.livedatademo.adapter

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.pengmaster.livedatademo.R
import kotlinx.android.synthetic.main.item_text.view.*

/**
 * <pre>
 *     author : Wp
 *     e-mail : 1101313414@qq.com
 *     time   : 2020-06-13 13:57
 *     desc   :
 *     version: 1.0
 * </pre>
 */
class ItemAdapter constructor( layout : Int =  R.layout.item_text) : BaseQuickAdapter<String, BaseViewHolder>(layout) {


    override fun convert(helper: BaseViewHolder?, item: String?) {

//        helper?.setText(R.id.tvText,item)

        helper?.itemView?.tvText?.text = item
    }
}