package org.streams.ex8;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> p = Arrays.asList(
                new Person(1,"Mito", LocalDate.of(1991,1,21)),
                new Person(2,"Code", LocalDate.of(1990,2,21)),
                new Person(3,"Jaime" , LocalDate.of(1980,6,23)),
                new Person(4,"Deepika",LocalDate.of(1994,6,2)),
                new Person(5,"Lakshita",LocalDate.of(2000,9,18)),
                new Person(6,"Kanhu",LocalDate.of(2024,1,9))
        );
        Implementation imp = new Implementation();
        System.out.println(imp.filterListByBirth(p));
        System.out.println(imp.limitSkipAndReturn(p,3,2));
    }
}
