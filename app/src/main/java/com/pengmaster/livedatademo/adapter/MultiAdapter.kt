package com.pengmaster.livedatademo.adapter

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.chad.library.adapter.base.entity.MultiItemEntity
import com.pengmaster.livedatademo.R

/**
 * <pre>
 *     author : Wp
 *     e-mail : 1101313414@qq.com
 *     time   : 2020-06-13 14:16
 *     desc   :
 *     version: 1.0
 * </pre>
 */
class MultiAdapter : BaseMultiItemQuickAdapter<MultiItemEntity, BaseViewHolder>(mutableListOf()) {

    init {
        addItemType(0, R.layout.item_one)
        addItemType(1, R.layout.item_two)
        addItemType(2, R.layout.item_three)
        println("init")
    }

    override fun convert(helper: BaseViewHolder?, item: MultiItemEntity?) {

        println("convert")
        helper?.addOnClickListener(R.id.llLayoutTwo)
        when(item?.itemType){


        }

    }

}