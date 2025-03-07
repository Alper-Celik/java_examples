package dev.alper_celik.java_examples;

import dev.alper_celik.java_examples.second_term.*;

public class App {

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(100, 50);
        System.out.println(rect.getInfo());

        var time = new Time(22, 25, 10);
        time.incrementBySeconds(60 * 60);
        System.out.println(time.getTime());
    }
}
