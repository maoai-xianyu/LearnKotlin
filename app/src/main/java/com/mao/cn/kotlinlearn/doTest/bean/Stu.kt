package com.mao.cn.kotlinlearn.doTest.bean

/**
 * Created by zhangkun on 2017/5/26.
 */
class Stu(name: String) {
    // 自定义添加setter 和 getter 方法。 那么在调用的时候，需要设置值
    var name = name
        set(value) {
            //field = if (value.isEmpty()) " " else value[0].toUpperCase() + value.substring(1)
            field = value.capitalize()
        }

    // field 是表示 幕后字段 的关键字，它在使用时相当于 this.name，但是只能用在 setter 方法内

    val isValidName
        get() = !name.isEmpty()
}
