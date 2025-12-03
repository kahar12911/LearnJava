package org.streams.example1;

enum FoodType{
    VEG,NONVEG
}

public class Consumer {
    private final String name;
    private final int age;
    private final FoodType foodtype;

    Consumer(String name, int age,FoodType type){
        this.name = name;
        this.age =age;
        this.foodtype = type;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return this.age;
    }

    public FoodType getFoodtype(){
        return this.foodtype;
    }

    @Override
    public String toString() {
        return "Consumer{name='" + name + "', age=" + age + ", foodType=" + foodtype + "}";
    }
}
