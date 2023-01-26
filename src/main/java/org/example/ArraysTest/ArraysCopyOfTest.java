package org.example.ArraysTest;

import java.util.Arrays;

public class ArraysCopyOfTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        // 처음부터 원하는곳까지 배열 복사
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(arr2));

        int[] arr4 = Arrays.copyOf(arr, 3);
        System.out.println(Arrays.toString(arr4));

        // 원하는부분부터 원하는부분까지 배열복사
        int[] arr3 = Arrays.copyOfRange(arr, 1,3);
        System.out.println(Arrays.toString(arr3));

        // 배열을 원하는 수로 채우기
        int[] arrFill = new int[9];
        Arrays.fill(arrFill, 5);
        System.out.println(Arrays.toString(arrFill));

        // 기존에 있던 배열들을 랜덤배열로 치환
        Arrays.setAll(arrFill, i -> (int)(Math.random()*5)+1);
        System.out.println(Arrays.toString(arrFill));

        // 정렬과 검색
        int[] arrSort = {3,2,0,1,4};
        int idx = Arrays.binarySearch(arrSort, 2);
        System.out.println(idx); // 실행하면 -5 가 나오는데 잘못돼서 그렇다 binarysearch 는 배열이 정렬돼있을경우에 사용해야함

        Arrays.sort(arrSort); // 정렬 매소드
        idx = Arrays.binarySearch(arrSort, 2);
        System.out.println(idx);

    }
}
