package com.psk.modenJava.chapter2.first;


public class AppleRedAndHeavyPredicate implements ApplePredicate{

    @Override
    public boolean test(Apple apple) {
        return Color.GREEN.equals(apple.getColor()) && apple.getWeight() > 150;
    }

}
