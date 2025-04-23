package com.bharath.learning.core.java8.lambda;

@FunctionalInterface
public interface Transform {
    String toUpperCase(String str);
}


class TransformImpl {
    public static void main(String[] args) {

        Transform transform = (str) -> str.toUpperCase();//Template

        String result = transform.toUpperCase("hello world");
        System.out.println(result); // Output: HELLO WORLD

        String bharath = transform.toUpperCase("bharath");
        System.out.println(bharath); // Output: BHARATH




    }
}
