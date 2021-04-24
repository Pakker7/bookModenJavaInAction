package com.psk.modenJava.chapter3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LambdaUtilize {

    public static String processFile(BufferedReaderProcessor p) throws IOException {
        // try-with-resources 구문
        try(BufferedReader br = new BufferedReader(new FileReader("./data.txt"))) {
            //return br.readLine(); // 한줄만 출력했던 원래의 코드
            return p.process(br);
        }
    }

    public static void main(String[] args) throws IOException {
        // 함수형 인터페이스를 이용해서 람다를 전달하는 방법
        // 람다를 사용하여 한번에 여러줄을 읽어오는 코드
        String oneLine = processFile((BufferedReader br)-> br.readLine());
        String twoLine = processFile((BufferedReader br)-> br.readLine()+ br.readLine());
    }
}
