package com.psk.modenJava.chapter3.refer.generic.genericClass;

public class DBox<L,R> {

    // 원본 코드
    /*private L left;
    private R right;

    public void set(L o, R r) {
        this.left = o;
        this.right = r;
    }

    @Override
    public String toString() {
        return this.left + " & " + this.right;
    }*/

    // 문제 2번에 의해 수정한 코드
    private L left;
    private R right;

    public void set(L o, R r) {
        this.left = o;
        this.right = r;
    }

    @Override
    public String toString() {
        return this.left + " & " + this.right;
    }

}
