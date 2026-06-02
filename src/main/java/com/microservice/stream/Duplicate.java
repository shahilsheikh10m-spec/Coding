package com.microservice.stream;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Duplicate {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,2,3,4};
        Set<Integer> duplicate= Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry->entry.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
        System.out.println("print duplicate elements"+duplicate);
    }
}

