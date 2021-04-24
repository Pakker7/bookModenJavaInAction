package com.psk.modenJava.chapter3;

import com.psk.modenJava.chapter2.first.Apple;

import java.util.Comparator;

public class ComparatorTest {

    public static void main(String[] args) {
        //기존 코드
        Comparator<Apple> byWeight1 = new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        };

        //람다를 이용한 코드
        Comparator<Apple> byWeight2 = (Apple o1, Apple o2) -> o1.getWeight().compareTo(o2.getWeight());

    }
}
