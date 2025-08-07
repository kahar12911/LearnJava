package org.functionalInterface.types;

public class ConsumerMain {
    public static void main(String[] args) {
        Consumer<Integer> consumer = (Integer s) ->{
            if(s > 10){
                System.out.println("number is greater than 10");
            }
            System.out.println("Consumer functional interface , input is "+s);
        };
        consumer.accept(11);
    }
}
