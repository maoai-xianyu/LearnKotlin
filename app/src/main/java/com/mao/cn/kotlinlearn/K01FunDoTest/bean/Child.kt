package com.mao.cn.kotlinlearn.K01FunDoTest.bean

/**
 * Created by zhangkun on 2017/5/27.
 */
class Child(val name: String)

val maxID = Int.MAX_VALUE


// 编译这个文件，实际上会形成两个类，一个是我们定义的 Person 类，另一个是“文件类” PersonKt
/*
public final class PersonKt {
    private static final int maxID = Integer.MAX_VALUE;
    public static final int getMaxID() {
        return maxID;
    }
}*/
