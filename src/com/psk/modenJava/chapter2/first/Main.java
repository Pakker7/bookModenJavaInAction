package com.psk.modenJava.chapter2.first;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p) {

        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory){
            if (p.test(apple)){          // 사과 검사 조건 캡슐화
                result.add(apple);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Apple> inventory = null;
        List<Apple> greenAndHeavyApples = filterApples(inventory, new AppleRedAndHeavyPredicate());

        //람다 사용해서 수정                                      new AppleRedAndHeavyPredicate()이걸 이렇게 간단하게..!!
        List<Apple> modify = filterApples(inventory, (Apple apple) -> Color.GREEN.equals(apple.getColor()));
    }

}
