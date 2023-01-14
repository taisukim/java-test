package org.example.hashcodeAndEquals;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GetInstance{
    public static void main(String[] args) {
        int[] powerOperator = {1,2,3,5,8,4,19,11};
        List<Integer> list = Arrays.stream(powerOperator).boxed().collect(Collectors.toList());

        System.out.println(list.indexOf(7));
//        list.containsAll(2)
        long ll = 0;
        ll = list.get(1);

    }

}