package com.psk.modenJava.chapter3.refer.generic.genericMethod;

public class Main {

    public static void main(String[] args) {

        // 제네릭 메서드는 이렇게 호출해야 한다.
        Box<String> sbox = BoxFactory.makeBox("Sweet"); // 오토박싱해줌
        Box<Double> dbox = BoxFactory.makeBox(7.59);
    }
}
