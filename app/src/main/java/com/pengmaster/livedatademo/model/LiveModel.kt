package com.pengmaster.livedatademo.model

import android.util.MutableBoolean
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * <pre>
 *     author : Wp
 *     e-mail : 1101313414@qq.com
 *     time   : 2020-06-13 14:31
 *     desc   :
 *     version: 1.0
 * </pre>
 */
class LiveModel : ViewModel() {

    val isChangeLayout : MutableLiveData<Boolean> = MutableLiveData()

    val isChangeLayoutItem : MutableLiveData<Boolean> = MutableLiveData()


    fun setChange(){
        isChangeLayout.value = false
    }

    fun setChangeItem(){
        isChangeLayoutItem.value = false
    }

    fun showAdapter(){
        isChangeLayout.value = true
    }
}