package com.psk.modenJava.chapter3.refer.generic.genericClass;

public class Main {

    public static void main(String[] args) {

        // 원본 코드
        /*        DBox<String, Integer> box1 = new DBox<>()  ;
        box1.set("Apple", 25);
        DBox<String, Integer> box2 = new DBox<>()  ;
        box2.set("Orange", 33);

        DDBox<DBox<String,Integer>, DBox<String,Integer>> ddbox = new DDBox<>();
        ddbox.set(box1, box2);
        System.out.println(ddbox);*/

        // 문제 2번에 의한 수정코드
        DBox<String, Integer> box1 = new DBox<>()  ;
        box1.set("Apple", 25);
        DBox<String, Integer> box2 = new DBox<>()  ;
        box2.set("Orange", 33);

        DBox<DBox<String,Integer>, DBox<String,Integer>> ddbox = new DBox<>();
        ddbox.set(box1, box2);
        System.out.println(ddbox);

        //출력 결과는
        // Apple & 25
        // Orange & 35

    }
}
