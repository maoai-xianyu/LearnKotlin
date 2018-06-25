package com.mao.cn.java;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.Base64;


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
        System.out.println("----------");
        repeatAn();
        System.out.println("----------");
        typeInference();
        System.out.println("----------");
        OptionalFun();
        System.out.println("----------");
        SteamsFun();
        System.out.println("----------");
        Base64sFun();

    }


    //  Lambda 表达式
    private static void ArrayFun() {

        Arrays.asList("a", "b", "c").forEach(System.out::println);
        Arrays.asList("a", "b", "c").sort(String::compareTo);
        Arrays.asList("a", "b", "c").sort(Comparator.naturalOrder());
    }

    // 接口的默认方法和静态方法
    private static void defaultDable() {
        Defaulable defaulable = DefaulableFactory.create(DefaultableImpl::new);
        System.out.println(defaulable.notRequired());

        defaulable = DefaulableFactory.create(OverridableImpl::new);
        System.out.println(defaulable.notRequired());
    }

    // 方法引用
    private static void CarFun() {
        Car car1 = Car.create(Car::new);
        car1.setName("丰田");
        Car car2 = Car.create(Car::new);
        car2.setName("本田");
        Car car3 = Car.create(Car::new);
        car3.setName("wey");
        Car car4 = Car.create(Car::new);
        car4.setName("大众");

        List<Car> carList = Arrays.asList(car1, car2, car3, car4);

        carList.forEach(Car::collide);

        carList.forEach(Car::repair);

        carList.forEach(car -> car.follow(car));

    }


    //重复注解
    private static void repeatAn() {
        for (RepeatingAnnotations.Filter filter : RepeatingAnnotations.Filterable.class.getAnnotationsByType(RepeatingAnnotations.Filter.class)) {
            System.out.println(filter.value());
        }
    }

    // 更好的类型推断
    private static void typeInference() {
        final Value<String> value = new Value<>();
        System.out.println(value.getOrDefault("22", Value.defaultValue()));
    }


    // Optional
    private static void OptionalFun() {
        Optional<String> fullName = Optional.ofNullable(null);
        System.out.println("Full Name is set? " + fullName.isPresent());
        System.out.println("Full Name: " + fullName.orElseGet(() -> "[none]"));
        System.out.println(fullName.map(s -> "Hey " + s + "!").orElse("Hey Stranger!"));

        Optional<String> firstName = Optional.of("tom");
        System.out.println("first Name is set? " + firstName.isPresent());
        System.out.println("first Name: " + firstName.orElseGet(() -> "[none]"));
        System.out.println(firstName.map(s -> "Hey " + s + "!").orElse("Hey Stranger!"));
    }


    // steams
    private static void SteamsFun() {
        Collection<Streams.Task> tasks = Arrays.asList(
                new Streams.Task(Streams.Status.OPEN, 5),
                new Streams.Task(Streams.Status.OPEN, 13),
                new Streams.Task(Streams.Status.CLOSED, 8));

        int sum = tasks.stream().filter(task -> task.getStatus() == Streams.Status.OPEN).mapToInt(Streams.Task::getPoints).sum();
        System.out.println("  sum " + sum);

        double totalPoints = tasks.stream()
                .parallel().map(Streams.Task::getPoints)
                .reduce(0, Integer::sum);

        System.out.println("  sum " + totalPoints);


        Map<Streams.Status, List<Streams.Task>> map = tasks
                .stream()
                .collect(Collectors.groupingBy(Streams.Task::getStatus));
        System.out.println(map);

        Collection<String> result = tasks
                .stream()                                        // Stream< String >
                .mapToInt(Streams.Task::getPoints)                     // IntStream
                .asLongStream()                                  // LongStream
                .mapToDouble(points -> points / totalPoints)   // DoubleStream
                .boxed()                                         // Stream< Double >
                .mapToLong(weigth -> (long) (weigth * 100)) // LongStream
                .mapToObj(percentage -> percentage + "%")      // Stream< String>
                .collect(Collectors.toList());                 // List< String >

        System.out.println(result);
    }

    private static void Base64sFun() {
        final String text = "Base64 finally in Java 8!";

        final String encoded = Base64.getEncoder()
                .encodeToString(text.getBytes(StandardCharsets.UTF_8));
        System.out.println(encoded);

        final String decoded = new String(Base64.getDecoder().decode(encoded),
                StandardCharsets.UTF_8);
        System.out.println(decoded);
    }


}
