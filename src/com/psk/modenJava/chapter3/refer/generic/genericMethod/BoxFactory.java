package com.psk.modenJava.chapter3.refer.generic.genericMethod;

public class BoxFactory {
    public static<T> Box<T> makeBox(T o){
        Box<T> box = new Box<>();
        box.set(o);
        return box;
    }
}
