package com.pengmaster.livedatademo.adapter;

import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * <pre>
 *     author : Wp
 *     e-mail : 1101313414@qq.com
 *     time   : 2020-06-13 14:01
 *     desc   : ItemAdapter2
 *     version: 1.0
 * </pre>
 */
public class ItemAdapter2 extends BaseQuickAdapter<String, BaseViewHolder> {

    public ItemAdapter2(int layoutResId, @Nullable List<String> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {

    }
}
