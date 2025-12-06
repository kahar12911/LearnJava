package org.multithreading.cas;

public class SharedResourceSimple {
    int count = 0;

    public void increment(){
        count++;
    }

    public int getCount(){
        return count;
    }
}
