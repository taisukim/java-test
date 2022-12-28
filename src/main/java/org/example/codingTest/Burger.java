package org.example.codingTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Burger {
    public static void main(String[] args) {
        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        int answer = 0;
        List<Integer> numList = Arrays.stream(ingredient).boxed().collect(Collectors.toList());
        boolean whileStandard = true;
        while(whileStandard){
            if(numList.size()<5){
                whileStandard = false;
            }
            for(int i=0;i<numList.size()-3;i++){
                if(numList.get(i) == 1 && numList.get(i+1) == 2 && numList.get(i+2) == 3 && numList.get(i+3) == 1){
                    numList.remove(i);
                    numList.remove(i);
                    numList.remove(i);
                    numList.remove(i);
                    answer ++;
                    break;
                }else if(i >= numList.size()-4){
                    whileStandard = false;
                }
            }
        }
        System.out.println(answer);
    }
}
