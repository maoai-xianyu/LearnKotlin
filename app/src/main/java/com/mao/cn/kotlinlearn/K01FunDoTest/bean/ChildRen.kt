package com.mao.cn.kotlinlearn.K01FunDoTest.bean

/**
 * Created by zhangkun on 2017/5/27.
 */
class ChildRen(val name: String)

const val minID = Int.MIN_VALUE

//编译期常量使用 const val 定义在类外，它与包级属性有一定的相似之处。
/**
 *
 * 只能定义在类外或对象（Object）内；\
 * 只能使用 String 或原生类型（Int、Double 等）初始化；
 * 不能自定义 getter（直接调用，不需要 getter）
 */
