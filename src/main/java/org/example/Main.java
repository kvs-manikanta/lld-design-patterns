package org.example;

import java.util.function.BiPredicate;

public class Main {
    public static void main(String[] args) {

        BiPredicate bipred=new BiPredicate() {
            @Override
            public boolean test(Object o, Object o2) {
                return false;
            }
        };

        System.out.println("Hello world!");
    }
}