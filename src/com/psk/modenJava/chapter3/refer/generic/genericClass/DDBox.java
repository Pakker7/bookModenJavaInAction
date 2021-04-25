package com.psk.modenJava.chapter3.refer.generic.genericClass;

public class DDBox<U,D> {

    private U first;
    private D second;

    public void set(U o, D r) {
        this.first = o;
        this.second = r;
    }

    @Override
    public String toString() {
        return this.first + " \n" + this.second;
    }

}
