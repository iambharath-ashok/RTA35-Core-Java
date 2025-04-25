package com.bharath.learning.core.java8.streams;

import java.util.List;
import java.util.stream.Stream;

public class FlatteningWithStreamFlatmap {

    public static void main(String[] args) {

        // 2D List of Integers
        List<List<Integer>> nestedList = List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(7, 8, 9)
        );
        
        //
        /*

        List<List<Integer> ==> List<Integer> in java 8
        
        */
        Stream<List<Integer>> listOfIntegerStream = nestedList.stream();
        Stream<Integer> integerStream = listOfIntegerStream.flatMap(in -> in.stream());
        List<Integer> list = integerStream.toList();
        
        //Above code can be simplified to in one line
        List<Integer> list1 = nestedList.stream().flatMap(in -> in.stream()).toList();


        //------------------------------------------------------------


        List<List<List<String>>> names = List.of(
                List.of(List.of("bharath", "kumar"), List.of("rahul", "deepa")),
                List.of(List.of("hema", "Aegon the conquerer"), List.of("arya", "sansa")),
                List.of(List.of("jaqen", "aegon the unworthy"))
        );


        Stream<String> stringStream = names.stream()
                .flatMap(in -> in.stream())
                .flatMap(in -> in.stream());

        List<String> namesList = stringStream.toList();

    }
}
