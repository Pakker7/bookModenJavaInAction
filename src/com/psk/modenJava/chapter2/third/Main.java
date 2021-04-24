package com.psk.modenJava.chapter2.third;

import com.psk.modenJava.chapter2.first.Apple;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<>();

        inventory.sort(new Comparator<Apple>() {
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight().compareTo(o2.getWeight()); //compareTo 는 integer일때 활성화 됨
            }
        });

        inventory.sort((Apple o1, Apple o2) -> o1.getWeight().compareTo(o2.getWeight()));
    }
}
