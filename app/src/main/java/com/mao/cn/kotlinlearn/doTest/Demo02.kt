package com.mao.cn.kotlinlearn.doTest

/**
 * Created by zhangkun on 2017/5/23.
 */
object Demo02 {

    fun sumX(a: Int, b: Int) = a + b

    @JvmStatic fun main(args: Array<String>) {
        print("sum 2+3 =  ${sumX(2,3)}")
    }

}
