package com.psk.modenJava.chapter3.refer.generic.genericMethod;

public class BoxSwapDemo {

    public static void main(String[] args) {
        Box<Integer> box1 = new Box<>();
        box1.set(99);
        Box<Integer> box2 = new Box<>();
        box2.set(55);
        System.out.println(box1.get() + " & " + box2.get());
        swapBox(box1, box2); //정의해야 할 메서드
        System.out.println(box1.get() + " & " + box2.get());
    }

    //- 다음 코드가 실행되도록 swapBox 메소드를 정의하되, Box<T> 인스턴스를 인자로 전달 받을 수 있도록 정의하자.
    //단 이때 Box<T> 인스턴스의 T는 Number 또는 이를 상속하는 하위 클래스만 올 수 있도록 제한된 매개변수 선언을 하자.
    //실행결과는 다음과 같아야 한다. swapBox 메소드의 호출 결과로 두 상자 안에 저장 된 내용물이 서로 달라야 한다.

    public static <T extends Number> void swapBox(Box<T> o1, Box<T> o2) {
        T tmp = o1.get();
        o1.set(o2.get());
        o2.set(tmp);
    }
}

