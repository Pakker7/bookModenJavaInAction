package com.psk.modenJava.chapter2.first;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Apple {
    private String name;
    private Color color;
    private Integer weight;

    @Builder
    public Apple(String name, Color color, int weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }
}
