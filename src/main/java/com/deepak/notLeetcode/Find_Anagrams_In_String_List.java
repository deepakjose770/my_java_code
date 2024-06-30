package com.deepak.notLeetcode;

import java.util.*;
import java.util.stream.Collectors;

public class Find_Anagrams_In_String_List {
    public static void main(String[] args) {
        String arr[] = {"abcd", "java", "dcba", "ajav", "xyz", "epam", "pame", "aepm"};
        anagramFrequecy(arr);
    }

    public static void anagramFrequecy (String[] arr) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : arr) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedString  = new String(charArray);
            if(!map.containsKey(sortedString)) {
                map.put(sortedString, new ArrayList<>());
            }
            map.get(sortedString).add(str);
        }
        for(List<String> list: map.values()) {
            System.out.println(list.toString());
        }
    }

}
