package org.example.HashSetTest;


import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;



public class UnionTest {

    public static void main(String[] args) {
//        int[] setList = {1,2,3,4,5,6};
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        setA.add(5);
        setA.add(5);
        setB.add(4);
        setB.add(5);
        setB.add(6);
        setB.add(7);
        setB.add(8);
        System.out.println("setA = " + setA);
        System.out.println("setB = " + setB);

        setA.addAll(setB);
        System.out.println("setA 합집합 setB = " + setA);

    }




}
