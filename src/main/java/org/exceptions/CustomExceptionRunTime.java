package org.exceptions;


public class CustomExceptionRunTime {
    /*By extending RuntimeException, you're saying:
    This exception doesn't need to be declared in method signatures (throws)
    or wrapped in try-catch.
    */

    public void vote(int age){
        if(age < 18){
            throw new InvalidAgeExceptionRunTime("RunTime : Age should be greater than 18");
        }
    }

    public static void main(String[] args) {
        CustomExceptionRunTime runTime = new CustomExceptionRunTime();
        //runTime.vote(2);

        //  gracefully handle
        try{
            runTime.vote(3);
        }catch (InvalidAgeExceptionRunTime ex){
            System.out.println("Runtime : " + ex);
        }
    }
}
