package com.mao.cn.kotlinlearn.K01FunDoTest

/**
 * Created by zhangkun on 2017/5/23.
 */
class Demo03 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(" 3 +5  = ${sumTotal(3, 5)}")
        }

        fun sumTotal(a: Int, b: Int) = a + b
    }

}
