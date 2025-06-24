package org.exceptions;

public class DivideByZero {
    public static void main(String[] args) {
        try{
            System.out.println("Inside try, Before Divide");
            int i = 10/0;
            System.out.println("Inside try, After Divide");
        }
        catch (ArithmeticException ex){
            System.out.println("Caught exception");
            System.out.println("Exception: " +ex);
        }
        finally {
            System.out.println("Always runs");
        }
    }
}
