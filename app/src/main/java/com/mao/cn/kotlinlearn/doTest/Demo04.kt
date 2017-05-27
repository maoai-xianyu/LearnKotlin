package com.mao.cn.kotlinlearn.doTest

import com.mao.cn.kotlinlearn.doTest.bean.Stu
import com.mao.cn.kotlinlearn.doTest.bean.maxID

/**
 * Created by zhangkun on 2017/5/26.
 */

fun main(args: Array<String>) {
    stuFun()
}


//----------------实体类  setter 和 getter
fun stuFun(){
    val stu = Stu("text")
    stu.name = "gjjjh"
    println(" stu "+stu.isValidName)
    println(" stu "+stu.name)


    val test : String = "try"
    println("   "+test[0].toUpperCase()+test.substring(1))
}

//----------------类外属性 一是直接写在类外并初始化的包级属性，二是使用 const val 定义的 编译期常量。
// 一、在类外定义的包级属性，会被编译为一个“文件类”的静态变量：

fun childFun(){
    val a = maxID
    println("  a  $a")
}