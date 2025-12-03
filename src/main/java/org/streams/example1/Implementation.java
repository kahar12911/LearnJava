package org.streams.example1;

import java.util.Comparator;
import java.util.List;

public class Implementation {

    List<Consumer> getNonVegeterianList(List<Consumer> consumers){
        List<Consumer> nonveg = consumers.stream().filter(
                c -> c.getFoodtype() == FoodType.NONVEG
        ).toList();
        return nonveg;
    }

    List<Consumer> sortConsumerByAge(List<Consumer> consumer){
        List<Consumer> consumers = consumer.stream().sorted(Comparator.comparing(Consumer::getAge)).toList();
        return consumers;
    }

    List<Consumer> sortConsumerByAgeDesc(List<Consumer> consumer){
        List<Consumer> consumers = consumer.stream().sorted(Comparator.comparing(Consumer::getAge).reversed()).toList();
        return consumers;
    }

}
