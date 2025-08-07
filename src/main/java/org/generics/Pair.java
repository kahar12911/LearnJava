package org.generics;

public class Pair<K,V> {
    // More than one generic type
    private K key;
    private V value;

    public void put(K key, V value){
        this.key = key;
        this.value = value;
    }
}
