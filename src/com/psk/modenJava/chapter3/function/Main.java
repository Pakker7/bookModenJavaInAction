package com.psk.modenJava.chapter3.function;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

// function 예제
/*Function 인터페이스는 제네릭 형식 T를 인수로 받아서 제네릭 형식 R객체를 반환하는 추상 메서드 apply를 정의한다.
입력을 출력으로 매핑하는 람다를 정의할 때 function 인터페이스를 활용할 수 있다.
예를 들면 사과 무게 정보를 추출하거나 문자열을 길이와 매핑.*/
public class Main {

    public static <T,R> List<R> map(List<T> list, Function<T,R> f){
        List<R> result = new ArrayList<>();
        for(T t:list){
            result.add(f.apply(t));
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> l = map(Arrays.asList("lambdas", "in", "action"),
                (String s) -> s.length());
    }
}
