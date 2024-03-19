package com.deepak;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("KUND-12345");
        strings.add("KUND-12345-somethingelse");
        strings.add("12345");

        List<String> allStrings = new ArrayList<>();
        //allStrings.add("(?:KUND-)(.+)(?:.*)$");
        allStrings.add("(?:KUND-)");
        //allStrings.add("KUND-12345");
        /*for(String s: allStrings) {
            Pattern pattern = Pattern.compile(s);
        }*/

        String regex = "KUND-12345";
        //Pattern pattern = Pattern.compile(regex);
        Pattern.compile(regex);

        for (String string : strings) {
            for(String s: allStrings) {
                Pattern pattern = Pattern.compile(s);
                Matcher matcher = pattern.matcher(string);
                if (matcher.find()) {
                    System.out.println();
                    System.out.println("the string is " +string);
                }
            }

        }
    }
}
