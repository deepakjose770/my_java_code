package amadeus.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIStudy {
    public static void main(String[] args) {
        Integer[] nums = {2,3,4,5,6,7,8,9};
        List<Integer> integerList = Arrays.asList(nums);

        //Write a Java Program that Takes a List of Integers as
        // Input and Returns the Squares of All the Odd Numbers
        // in the List, Using the Stream API
        List<Integer> integerListCollected = integerList.stream().
                filter(n -> n%2 !=0).
                map(n -> n*n).
                collect(Collectors.toList());

        System.out.println(integerListCollected);
    }
}
