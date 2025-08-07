package org.functionalInterface.WaysToImplement.usingAnonymousClass;

public class Main {

    public static void main(String[] args) {

        Bird eagle = new Bird(){
            public void Fly(String val){
                System.out.println(val+" Can Fly");
            }
        };
        eagle.Fly("Eagle");
    }
}
