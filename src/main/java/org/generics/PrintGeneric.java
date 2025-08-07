package org.generics;

public class PrintGeneric<T> {
    T val;
    // T can be any type - primitive , non - primitive etc
    public void setVal(T val){
        this.val = val;
    }

    T getVal(){
        return this.val;
    }
}
