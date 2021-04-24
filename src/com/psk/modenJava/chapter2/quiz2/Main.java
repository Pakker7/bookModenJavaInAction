package com.psk.modenJava.chapter2.quiz2;

import com.psk.modenJava.chapter2.first.Apple;
import com.psk.modenJava.chapter2.first.Color;

import java.util.ArrayList;
import java.util.List;

public class Main {
//    사과 리스트를 인수로 받아 다양한 방법으로 문자열을 생성(커스터마이즈된 다양한 toString메서드와 같이) 할 수 있도록
//    파라미터화 된 prettyPrintApple 메서드를 구현하시오.
//    예를 들어 prettyPrintApple 메서드가 각각의 사과 무게를 출력하도록 지시할 수 있다.
//    혹은 각각의 사과가 무거운지, 가벼운지 출력하도록 지시할 수 있다

    public static void prettyPrintApple(List<Apple> inventory, AppleToStringPredicate p) {
        for(Apple apple : inventory) {
            String output = p.toString(apple);
            System.out.println(output);
        }
    }

    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();
        for(int i=0; i<5; i++) {
            Apple apple = Apple.builder()
                    .name("사과" + i)
                    .color(Color.BLUE)
                    .weight(98 + i)
                    .build();
            apples.add(apple);
        }

        // 1차 작성
        //prettyPrintApple(apples, new AppleHeavyWeight());
        //prettyPrintApple(apples, new AppleGetWeight());

        //2차 간단하게 수정
        prettyPrintApple(apples, new AppleToStringPredicate() {
            @Override
            public String toString(Apple apple) {
                return (apple.getWeight() > 100) ? "무겁다." : "가볍다";
            }
        });

        prettyPrintApple(apples, new AppleToStringPredicate() {
            @Override
            public String toString(Apple apple) {
                return "(" + apple.getName() + ")의 무게는 " + apple.getWeight() + "이다.";
            }
        });

    }
}
