package org.generics;

public class UpperBoundGeneric<T extends Number> {
    // it will be always extends where we use class or object
    // < T extends Number>
    // Number will be the super set , T object type can be Integer, Double (All child class type , etc,
    // T can be a type of String here. We can create upper bound here

    // if we try to create type String while creating object It will give error
}
