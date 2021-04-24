package com.psk.modenJava.chapter2.quiz2;

import com.psk.modenJava.chapter2.Apple;

public class AppleGetWeight implements AppleToStringPredicate {

    @Override
    public String toString(Apple apple) {
        return "(" + apple.getName() + ")의 무게는 " + apple.getWeight() + "이다.";
    }
}
