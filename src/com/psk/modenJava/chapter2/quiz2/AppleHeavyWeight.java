package com.psk.modenJava.chapter2.quiz2;

import com.psk.modenJava.chapter2.first.Apple;

public class AppleHeavyWeight implements AppleToStringPredicate{
    @Override
    public String toString(Apple apple) {
        return (apple.getWeight() > 100) ? "무겁다." : "가볍다";
    }
}
