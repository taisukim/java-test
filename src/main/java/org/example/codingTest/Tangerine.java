package org.example.codingTest;

import java.util.*;

public class Tangerine {
    public static void main(String[] args){
        int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
        int k = 6;
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int t : tangerine){
            System.out.print(t + " : " );
            System.out.println(map.getOrDefault(t,0) + 1);
            map.put(t, map.getOrDefault(t,0) + 1);
        }
        System.out.println(map.keySet());

        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort(((o1, o2) -> {
            System.out.println("o1 : " + o1);
            System.out.println("o2 : " + o2);
            return map.get(o2) - map.get(o1);
        }));
        System.out.println("list = " + list.toString());




        System.out.println(answer);


    }
}
