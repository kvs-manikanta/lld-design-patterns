package org.example.lld_1.lambdas;


@FunctionalInterface
public interface TestInterface<T> {
    void fun1(T t);

    default void fun2() {
        System.out.println("Default Method");
    }

//    void fun2();
}