package org.example.codingTest;

import java.util.*;
import java.util.stream.Collectors;

public class PocketBilliard {

    public static void main(String[] args) {
        int[][] balls = {{7, 7}, {2, 7}, {7, 3}};
        List<Integer> answer = new ArrayList<>(balls.length);
        int m = 10;
        int n = 10;
        int startX = 3;
        int startY = 7;


        for (int[] ball : balls) {
            int ballX = ball[0];
            int ballY = ball[1];

            // 2147483647
            List<Integer> goList = new ArrayList<>();
            if(startY == ballY && startX > ballX) {
                goList.add(2147483647);
            }else{
                goList.add(goEast(m, n, startX, startY, ballX, ballY));
            }

            if(startY == ballY && startX < ballX) {
                goList.add(2147483647);
            }else {
                goList.add(goWast(m, n, startX, startY, ballX, ballY));
            }

            if(startX == ballX && startY > ballY) {
                goList.add(2147483647);
            }else {
                goList.add(goSouth(m, n, startX, startY, ballX, ballY));
            }

            if(startX == ballX && startY < ballY) {
                goList.add(2147483647);
            }else {
                goList.add(goNorth(m, n, startX, startY, ballX, ballY));
            }
            answer.add(Collections.min(goList));


        }
        System.out.println(answer);
    }

    private static Integer goNorth(int m, int n, int startX, int startY, int ballX, int ballY) {
        int x = (startX - ballX) * (startX - ballX);
        int y = ((n - startY) + (n - ballY)) * ((n - startY) + (n - ballY));
        return x + y;
    }

    private static Integer goSouth(int m, int n, int startX, int startY, int ballX, int ballY) {
        int x = (startX - ballX) * (startX - ballX);
        int y = (startY + ballY) * (startY + ballY);
        return x + y;
    }

    private static Integer goWast(int m, int n, int startX, int startY, int ballX, int ballY) {
        int x = ((m - startX) + (m - ballX)) * ((m - startX) + (m - ballX));
        int y = (startY - ballY) * (startY - ballY);
        return x + y;
    }

    private static int goEast(int m, int n, int startX, int startY, int ballX, int ballY) {
        int x = (startX + ballX) * (startX + ballX);
        int y = (startY - ballY) * (startY - ballY);
        return x + y;
    }

    private static int pointCheck(int m, int n, int startX, int startY, int ballX, int ballY) {
        int standard = 0;
        int result = 0;

        // 동쪽 최소값 구해서 넣기
        if(startY == ballY && startX > ballX){
            standard = 10000;
        }else{
            standard = startX + ballX;
        }
        //서쪽 최소값 구해서 넣기
        if(startY == ballY && startX < ballX) {

        }else{
            if(standard > (m - startX) + (m - ballX)){
                result = 1;
            }
        }
        // 남쪽
        if(startX == ballX && startY > ballY) {

        }else {
            if(standard > startY + ballY){
                result = 2;
            }
        }
        // 김정은
        if(startX == ballX && startY < ballY) {

        }else {
            if(standard > ((n - startY) + (n - ballY))){
                result = 3;
            }
        }
        return result;
    }

}
