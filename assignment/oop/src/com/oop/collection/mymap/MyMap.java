package com.oop.collection.mymap;

public interface MyMap {
    Object get(Object key);
    int size();
    void put(Object key, Object value);
    void remove(Object key);
    boolean contains(Object key);
}
