package com.psk.modenJava.chapter2.second;

import com.psk.modenJava.chapter2.first.Apple;
import com.psk.modenJava.chapter2.first.Color;

import java.util.ArrayList;
import java.util.List;

public class Main {

    // 리스트 형식으로 추상화

    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> result = new ArrayList<>();
        for(T e : list) {
            if(p.test(e)) {
                result.add(e);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Apple> inventory = null;
        List<Integer> numbers   = null;
        List<Apple> redApples = filter(inventory, (Apple apple) -> Color.GREEN.equals(apple.getColor()));
        List<Integer> evenNumbers = filter(numbers, (Integer i ) -> i%2==0);

        //와 이게 이렇게 된다고???????????????????

    }

}
