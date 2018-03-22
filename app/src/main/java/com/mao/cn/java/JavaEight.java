package com.mao.cn.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * author:  zhangkun .
 * date:    on 2018/3/22.
 */

public class JavaEight {


    public static void main(String[] args) {
        ArrayFun();
        System.out.println("----------");
        defaultDable();
        System.out.println("----------");
        CarFun();
    }


    private static void ArrayFun() {

        Arrays.asList("a", "b", "c").forEach(System.out::println);

        Arrays.asList("a", "b", "c").sort(String::compareTo);
        Arrays.asList("a", "b", "c").sort(Comparator.naturalOrder());
    }

    private static void defaultDable() {
        Defaulable defaulable = DefaulableFactory.create(DefaultableImpl::new);
        System.out.println(defaulable.notRequired());

        defaulable = DefaulableFactory.create(OverridableImpl::new);
        System.out.println(defaulable.notRequired());
    }

    private static void CarFun() {
        Car car1 = Car.create(Car::new);
        car1.setName("丰田");
        Car car2 = Car.create(Car::new);
        car2.setName("本田");
        Car car3 = Car.create(Car::new);
        car3.setName("wey");
        Car car4 = Car.create(Car::new);
        car4.setName("大众");

        List<Car> carList = Arrays.asList(car1,car2,car3,car4);

        carList.forEach(Car::collide);

        carList.forEach(Car::repair);

        carList.forEach(car -> car.follow(car));

    }
}
