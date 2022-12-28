package org.example;

import java.util.ArrayList;
import java.util.List;

public class PersonalTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i=0; i<1000000;i++){
            list.add(i);
        }
        System.out.println(list);
    }
}
