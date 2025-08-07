package org.functionalInterface.types;

public class FunctionMain {
    public static void main(String[] args) {
        Function<Integer,String> intToString = (Integer num) ->{
            String output = num.toString();
            return output;
        };
        System.out.println(intToString.apply(111));
    }
}
