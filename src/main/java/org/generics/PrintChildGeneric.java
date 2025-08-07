package org.generics;

public class PrintChildGeneric<T> extends PrintGeneric<T>{
    // if child class is also generic class , no need to define type of parent generic class
    // We can define at object creation time
    T val;
    public void setVal(T val){
        this.val = val;
    }

    public T getVal(){
        return this.val;
    }
}
