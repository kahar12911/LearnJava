package org.streams.ex2;

public class Dish {
    String dishName;

    public Dish(String dishName){
        this.dishName = dishName;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName){
        this.dishName = dishName;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "dishName='" + dishName + '\'' +
                '}';
    }
}
