package com.research.mytest;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CharacterFreqTest {
    public static void main(String[] args) {
        String s = "AABBCCDDEEE";
        Map<Character, Long> map = s.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("The map is "+ map);
    }
}
