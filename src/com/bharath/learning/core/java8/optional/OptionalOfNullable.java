package com.bharath.learning.core.java8.optional;

import java.util.Optional;

public class OptionalOfNullable {


    public static void main(String[] args) {

        String name = null;


        Optional<String> nameOp = Optional.ofNullable(null);

        System.out.println(nameOp);

        Optional<String> nameOptional = Optional.of("");

        System.out.println(nameOptional);

        Optional<String> nameOptional2 = Optional.ofNullable("bbb");

        String aaa = nameOptional2.orElse("AAAAA");

        System.out.println(aaa);

    }
}
