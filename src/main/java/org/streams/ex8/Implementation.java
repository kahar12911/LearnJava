package org.streams.ex8;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Implementation {
    public List<Person> filterListByBirth(List<Person> persons){
        return persons.stream().sorted(Comparator.comparing(Person::getBirthDate)).collect(Collectors.toList());
    }

    public List<Person> limitSkipAndReturn(List<Person> people, int pageNumber, int pageSize){
        return people.stream().skip((long) (pageNumber - 1) * pageSize).limit(pageSize).collect(Collectors.toList());
    }
}
