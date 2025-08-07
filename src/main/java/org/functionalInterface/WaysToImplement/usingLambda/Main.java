package org.functionalInterface.WaysToImplement.usingLambda;

public class Main {
    public static void main(String[] args) {
//        Bird eagle = new Bird(){
//            public void fly(String val){
//                System.out.println(val + " can Fly");
//            }
//        };
        // we can reduce redundant code;
        // remove object creation and functional definition :
        // Functional interface can only have one abstract method
        // so no need to define abstract method name again in main
        // {} is required if you have more than one line of block other no {} braces.

        Bird eagleObject = (String val) -> {
            System.out.println(val+" Flying");
        };
        Bird sparrowObject = (String val) -> System.out.println(val+ " can FLY ");
        eagleObject.fly("Eagle");
        sparrowObject.fly("Sparrow");
    }
}
