package org.example.codingTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Pokemon {
    public static void main(String[] args) {
        int[] nums = new int[]{3,1,2,3};
//        List<Integer> nums = Arrays.asList(3,1,2,3);
        List<Integer> numList = Arrays.stream(nums).distinct().boxed().collect(Collectors.toList());
//        List<Integer> numList = nums.stream().distinct().collect(Collectors.toList());
        int[] numList2 = IntStream.of(nums).distinct().toArray();
        System.out.println(numList.size());
    }
}
