package com.mao.cn.kotlinlearn.doTest

import com.mao.cn.kotlinlearn.doTest.bean.DogC
import com.mao.cn.kotlinlearn.doTest.bean.DogG
import com.mao.cn.kotlinlearn.doTest.bean.DogP

/**
 * Created by zhangkun on 2017/6/2.
 */
fun main(args: Array<String>) {
    dogG()
    dogP()
    dogC()

}

//---------------
fun dogG() {
    val d = DogG("DogG")
    println("  d  $d")
    println("  d  "+d.age)
    println("  d  "+d.name)
    println("  d  "+d.say())
    println("  d  "+d.speak())

    println("-----------------")
}


fun dogP() {
    val p = DogP("dogP")
    println("  p  $p")
    println("  p  "+p.age)
    println("  p  "+p.name)
    println("  p  "+p.say())
    println("  p  "+p.speak())

    println("-----------------")

}


fun dogC() {
    val c = DogC("dogC")
    println("  c  $c")
    println("  c  "+c.age)
    println("  c  "+c.name)
    println("  c  "+c.say())
    println("  c  "+c.speak())
}