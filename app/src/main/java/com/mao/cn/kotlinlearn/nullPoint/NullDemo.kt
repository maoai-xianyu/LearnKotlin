package com.mao.cn.kotlinlearn.nullPoint

/**
 * Created by zhangkun on 2017/6/5.
 *
 * 可空类型与非空类型
 * 所有数据类型默认都是非空（non-null）的，如果想把 null 赋给它们的对象，需要在类型后加上 ? ，声明为可空类型
 */
fun main(arg:Array<String>){

    var mm : String? = null

    printLengthOfString(mm)

    mm = "test"

    printLengthOfString(mm)


}

// 安全调用符 ?.
/**
 * 如果一个可空变量已经被判断为非空，再次调用它的方法和变量时，会自动将变量转换为非空类型，实现安全调用
 */
fun printLengthOfString(s:String?) = println(s?.length)