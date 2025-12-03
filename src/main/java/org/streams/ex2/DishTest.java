package org.streams.ex2;

import java.util.List;
import java.util.stream.Collectors;

public class DishTest {
    public List<Dish> addYummyToName(List<Dish> dishes){
        return dishes.stream().map(c -> new Dish("Yummy : "+c.dishName)).collect(Collectors.toList());
    }

    public Long count(List<Dish> dishes, String s){
        return dishes.stream().filter(d -> d.getDishName().contains(s)).count();
    }
}
