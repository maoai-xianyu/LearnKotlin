package com.mao.cn.kotlinlearn.doTest

import com.mao.cn.kotlinlearn.doTest.bean.Stu

/**
 * Created by zhangkun on 2017/5/26.
 */

fun main(args: Array<String>) {
    stuFun()
}


//----------------实体类
fun stuFun(){
    val stu = Stu("text")

    println(" stu "+stu.isValidName)
    println(" stu "+stu.name)
}