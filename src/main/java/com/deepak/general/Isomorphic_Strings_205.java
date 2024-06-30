package com.deepak.general;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic_Strings_205 {
    public static void main(String[] args) {
        String s = "pacer";
        String t = "title";
        System.out.println(" The strings are isomorphic :- " + isIsomorphic(s,t));
    }

    private static boolean isIsomorphic(String s, String t) {
        char[] charArray = s.toCharArray();
        Map<Character, Character> characterMap = new HashMap<Character, Character>();
        for (int i = 0; i < t.length(); i++) {
            if (characterMap.containsKey(s.charAt(i)) && t.charAt(i) == characterMap.get(s.charAt(i))) {
                continue;
            } else if(!characterMap.containsKey(s.charAt(i))){
                characterMap.put(s.charAt(i), t.charAt(i));
            } else {
                return false;
            }
        }
        return true;
    }
}
