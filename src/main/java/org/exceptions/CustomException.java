package org.exceptions;

/**
 * Creating your own exceptions makes your code more meaningful, especially for domain logic (e.g., LowBalanceException, InvalidUserException).
 */

public class CustomException {
    public void vote(int age) throws InvalidAgeException {
        /**If age < 18, you throw the custom exception.
         throws InvalidAgeException in method signature is required since it’s a checked exception.
         **/
        if ( age < 18) {
            throw new InvalidAgeException("Age should be greater than 18 ");
        }
        System.out.println("You can Vote");
    }
    public static void main(String[] args) {
        try{
            CustomException customException = new CustomException();
            customException.vote(20);
            customException.vote(4);
        }catch (InvalidAgeException ex){
            System.out.println("Exception : "+ex);
        }

    }
}
