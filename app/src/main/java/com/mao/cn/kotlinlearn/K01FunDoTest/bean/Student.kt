package com.mao.cn.kotlinlearn.K01FunDoTest.bean

import java.io.Serializable

/**
 * Created by zhangkun on 2017/5/26.
 */
class Student(val id: Long) : Serializable {

    var name: String = ""

    var desc: String = ""

    constructor(name: String) : this(name.hashCode().toLong()) {
        this.name = name
    }

    constructor(id: Long, name: String) : this(id) {
        this.name = name
    }

}