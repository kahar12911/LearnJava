package org.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;

public class StreamDemo {
    public static void main(String[] args) {


        String str = "Hello , how are you . you are mine . I am yours . You are too good ";
        String[] words = str.split("\\s+");
        List<String> wordList = Arrays.asList(str.split("\\s+"));

        // 1. count the frequency of each element in a list using streams
        Map<String,Long> stream = wordList.stream().collect(Collectors.groupingBy(
                (String word) -> word , counting()
        ));
        System.out.println(stream);
        stream.forEach( (key,val) -> System.out.println(key +" "+val));

        // 2. remove duplicates from a list using streams
        Stream<String> wordStream = wordList.stream().distinct();
        List<String> list = wordStream.collect(Collectors.toList());
        //wordStream.forEach( (w) -> System.out.println(w) );
        System.out.println(list);


        // 3. sort a list of objects using streams
        List<Integer> intlist = Arrays.asList(3,5,6,4,2,1,4,6,7,8,5,4,2);
        List<Integer> sortedInt = intlist.stream().sorted().toList();
        System.out.println(sortedInt);

        // 4. sort a list of objects using streams?
        // Example: Sort employees by salary
        Employee e1 = new Employee("Deepika" , 2200.0);
        Employee e2 = new Employee("Ashok" , 2222.2);
        Employee e3 = new Employee("kahar" ,33333.3);
        //Employee employee = new Employee();
        List<Employee> employees = Arrays.asList(e1,e2,e3);

        List<Employee> sorted = employees.stream().sorted(
                Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
        System.out.println(sorted);
        sorted.forEach((e) -> System.out.println(e.getSalary() +" "+e.getName()));


        // 5. find the first non-repeated character in a string using streams
        String reap = "DeepikaKahar";
        //char[] charRep = reap.toCharArray();
        Character result = reap.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(
                c -> c, Collectors.counting()
                ))
                .entrySet().stream()
                .filter( entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        // 6. convert a list of strings to a single comma-separated string
        // Collectors.joining(" ")



        //7. group a list of objects by a property using Collectors.groupingBy()?
        //🔹 Example: Group Employees by Department

        // 8. find max/min from a collection using streams?

        // 9 . reverse a list using Stream API?

        // 10. limit and skip

        // 11. pagination using streams

        // 12 partioningBy // split into two group

        int page = 2;
        int pageSize = 3;
        List<Integer> pagedData = intlist.stream()
                .skip((page-1) * pageSize) // Skip n-1 pages entries
                .limit(pageSize)              // Number of elements in a page
                .collect(Collectors.toList());


    }





}
