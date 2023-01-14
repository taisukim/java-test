package org.example.codingTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Deliveries {
    public static void main(String[] args) {
        int cap = 4;
        int n = 10;
        int[] deliveries = {1,0,3,1,2,3,2,1,5,1};
        int[] pickups = {0,3,0,4,0,5,2,3,1,5};
        long answer = 0;
        List<Integer> dList = Arrays.stream(deliveries).boxed().collect(Collectors.toList());
        List<Integer> pList = Arrays.stream(pickups).boxed().collect(Collectors.toList());
        int homeStandard = n;
        while(homeStandard > 0){
            int dStandard = cap;
            int pStandard = cap;
            boolean homeStandardCheck = true; // 최대거리 구하기용
            boolean standardMinusCheck = true;
            for(int i = homeStandard-1; i>=0;i--){
                if(dList.get(i)>0 || pList.get(i)>0){
                    if(homeStandardCheck){
//                        homeStandard = i+1;
                        homeStandardCheck = false;
                        answer += (i+1)*2;
                    }
                    if(dStandard > 0){
                        if(dStandard > dList.get(i)){
                            dStandard -= dList.get(i);
                            dList.set(i,0);
                        }else if(dStandard < dList.get(i)){
                            dList.set(i,dList.get(i) - dStandard);
                            dStandard = 0;
                        }else{
                            dList.set(i,0);
                            dStandard = 0;
                        }
                    }
                    if(pStandard > 0){
                        if(pStandard > pList.get(i)){
                            pStandard -= pList.get(i);
                            pList.set(i,0);
                        }else if(pStandard < pList.get(i)){
                            pList.set(i,pList.get(i) - pStandard);
                            pStandard = 0;
                        }else{
                            pList.set(i,0);
                            pStandard = 0;
                        }
                    }
                    if(standardMinusCheck){
                        if(dList.get(i) == 0 && pList.get(i) == 0) {
                            homeStandard--;
                        }else{
                            standardMinusCheck = false;
                        }
                    }
                    if(dStandard == 0 && pStandard == 0){
                        break;
                    }


                }else{
                    homeStandard--;
                }
            }
        }

        System.out.println(answer);
    }
}
