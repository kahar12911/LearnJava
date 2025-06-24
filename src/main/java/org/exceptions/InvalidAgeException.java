package org.exceptions;

/**
 * Step 1: Create a class extending Exception (for checked) or RuntimeException (for unchecked)
 * Step 2: Use it in a method
 * Step 3: Call it from main with try-catch
 *
 */
public class InvalidAgeException extends Exception{
    // custom checked exception by extending Exception.
    // requires callers to either handle (try-catch) or declare it (throws).
    public InvalidAgeException(String message){
        super(message); // passes message to Exception superclass
    }
}
