package com.mao.cn.kotlinlearn.tools

import android.content.Context
import android.widget.Toast

/**
 * Created by zhangkun on 2017/5/11.
 */
fun Context.toast(msg: String?, length: Int = Toast.LENGTH_LONG) {
    Toast.makeText(this, msg, length).show()
}


fun to(): String = "mmms"

