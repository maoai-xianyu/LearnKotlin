package com.mao.cn.edwardLearn

/**
 * author:  zhangkun .
 * date:    on 2018/6/8.
 *
 * 办事对象
 */

class Kp29CompanionObject {

    companion object {
        private val privateVar = 10

        fun accessPrivateVar() = "Accessing privateVar : $privateVar"
    }

    /*private val privateVar = 10

    fun asscessPrivateVar() = "Accessing privateVar : $privateVar"*/

}


fun main(args: Array<String>) {
    // 不能直接调动，不是静态的
    //println(Kp29CompanionObject().accessPrivateVar())

    /**
     * companion object
     */
    println(Kp29CompanionObject.Companion.accessPrivateVar())
    println(Kp29CompanionObject.accessPrivateVar())
}