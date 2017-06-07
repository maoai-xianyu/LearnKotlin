package com.mao.cn.kotlinlearn.generics

/**
 * Created by zhangkun on 2017/6/7.
 *
 * 只能保证读取数据时类型安全的对象叫做生产者，用 out T 标记；把那些只能保证写入数据安全时类型安全的对象叫做消费者，用 in T 标记。
 *
 * Kotlin 集合框架：Iterable、Iterator 和 Collection
 *
 *
 */
interface Source<out T> {

    fun netxtT(): T
}