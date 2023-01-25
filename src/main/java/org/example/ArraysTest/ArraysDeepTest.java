package org.example.ArraysTest;

import java.util.Arrays;

public class ArraysDeepTest {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        int[][] arr2D = {{11,12,13}, {21,22,23}};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(arr2D));

        String[][] str2D = {{"aaa", "bbb"}, {"AAA", "BBB"}};
        String[][] str2D2 = {{"aaa", "bbb"}, {"AAA", "BBB"}};

        System.out.println(Arrays.equals(str2D, str2D2));           // false
        System.out.println(Arrays.deepEquals(str2D,str2D2));        // true   2차원배열 이상부터는 deepEquals를 사용해야함
    }
}
