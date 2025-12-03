/*
Input : List of Integer
Square of all the value
check the conditions ( greater than 10 )

Calculate avg

 */

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Virtusa {
    public static void main(String[] args) {
//        List<Integer> arr = Arrays.asList(11,45,23,9,2,41,55,89,54,33,6,1);
//
//        double avg = arr.stream().mapToInt(n -> n * n ).filter(n -> n > 10).average().getAsDouble();
//        System.out.println(avg);

//        final List<Integer> list = new ArrayList<>(1);
//        list.add(2);
//        list.add(5);
//        System.out.println(list);
        //list = new ArrayList<>();

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Deepika");
        //map.put(2,"Java");
        String s1 = "Deepika";

        System.out.println(map.entrySet().stream().filter(entry -> entry.getValue().equals(s1)).map(Map.Entry::getKey).collect(Collectors.toList()));


        /*
        two tables : one table has primary key , other has forein key.
        I'll pass 1 primary key value. fetch parent table data as well as child table data
       User (userId) , order (orderId, userId : User )
       select *
       from user u
       join
       order o
       on user.userId = o.userId;
         */
        /*
        @GetMapping("/user/{userId}")
        public getUserById(@PathVariable Userdto userId){
            userService.getUserById(userId);
        }
         */

    }


}
