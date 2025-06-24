package org.exceptions;

/*
By extending RuntimeException, you're saying:
This exception doesn't need to be declared in method signatures (throws) or wrapped in try-catch.
 */
public class InvalidAgeExceptionRunTime extends RuntimeException{
    public InvalidAgeExceptionRunTime(String message){
        super(message);
    }
}
