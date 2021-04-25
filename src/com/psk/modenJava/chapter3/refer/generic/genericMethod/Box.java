package com.psk.modenJava.chapter3.refer.generic.genericMethod;

public class Box<T> {
    private T o;

    public void set(T o) {
        this.o = o;
    }

    public T get() {
        return o;
    }
}
