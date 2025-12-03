package org.streams.ex2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Dish> dishes = Arrays.asList(
                new Dish("Tortilla"),
                new Dish("Gazpacho"),
                new Dish("Jamon"),
                new Dish("Churros")
        );
        DishTest test  = new DishTest();
        System.out.println(test.addYummyToName(dishes));
        System.out.println(test.count(dishes,"a"));
    }
}
