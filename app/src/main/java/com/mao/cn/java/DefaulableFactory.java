package com.mao.cn.java;

import java.util.function.Supplier;

interface DefaulableFactory {
    // Interfaces now allow static methods
    static Defaulable create(Supplier<Defaulable> supplier) {
        return supplier.get();
    }
}