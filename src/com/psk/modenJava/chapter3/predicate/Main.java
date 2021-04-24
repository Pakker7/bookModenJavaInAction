package com.psk.modenJava.chapter3.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


//Predicate 예제
public class Main {

    public <T> List<T> filter(List<T> list, Predicate<T> p){
        List<T> result = new ArrayList<>();
        for(T t : list){
            if(p.test(t)){
                result.add(t);
            }
        }
        return result;
    }
    public static void main(String[] args) {

        //predicate 예제
        List<String> listOfStrings = new ArrayList<>();
        Main main = new Main();
        Predicate<String> nonEmptyStringPredicate = (String s) -> !s.isEmpty();
        List<String> nonEmpty = main.filter(listOfStrings, nonEmptyStringPredicate);

    }
}
