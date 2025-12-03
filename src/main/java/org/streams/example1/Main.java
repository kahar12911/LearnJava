package org.streams.example1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Implementation imp = new Implementation();

        Consumer c1 = new Consumer("Deepika",31,FoodType.VEG);
        Consumer c2 = new Consumer("Devesh",30,FoodType.NONVEG);
        Consumer c3 = new Consumer("lakshita" , 25 , FoodType.NONVEG);
        Consumer c4 = new Consumer("Mangi Lal",59,FoodType.VEG);

        //List<Consumer> consumers = new ArrayList<>(List.of(c1,c2,c3,c4));
        List<Consumer> consumers = Arrays.asList(c1, c2, c3, c4);

        System.out.println(imp.getNonVegeterianList(consumers));
        System.out.println(imp.sortConsumerByAge(consumers));
        System.out.println(imp.sortConsumerByAgeDesc(consumers));

    }
}
