package org.example.codingTest;

import java.util.ArrayList;
import java.util.List;

public class ZumTestPrinter {

    public static void main(String[] args) {
        int[][] data = {{1, 2, 10}, {2, 5, 8}, {3, 6, 9}, {4, 20, 6}, {5, 25, 5}};
        List<Integer> answer = new ArrayList<Integer>(data.length);
        List<int[]> workList = new ArrayList<int[]>(data.length);
        long workTime = 0;
        long printTime = 0;
        for(int i=0;i < data.length;){

            if(runOrWait(workTime)){
                // 프린트가 작업중이니 새로운 요청은 리스트안에 집어넣어야함

                //요청시간이 프린트시간과 일치하면 대기리스트에 집어넣고
                //만약 대기리스트가 2개이상이면 정렬한다
                if(data[i][1] == printTime){
                    workList.add(data[i]);
                    if(workList.size() > 1){
                        workList.sort((a,b) -> Integer.compare(a[2], b[2]));
                    }
                }

                // 작업중이니까 워크타임을 - 1 해준다
                workTime --;
            }else {
                if(!workList.isEmpty()){
                    if(data[i][1] == printTime){
                        workList.add(data[i]);
                        if(workList.size() > 1){
                            workList.sort((a,b) -> Integer.compare(a[2], b[2]));
                        }
                    }
                    workTime = workList.get(0)[2] - 1;
                    answer.add(workList.get(0)[0]);
                    workList.remove(0);
                }else if(data[i][1] == printTime){
                    // 작업시간을 넣는데 이 포문이 한번 도는걸 1초로 하니 아래다가 따로
                    // 작업시간을 -1 해주는걸 넣지않고 여기서 빼는게 나을것같음
                    answer.add(data[i][0]);
                    workTime = data[i][2] - 1;
                }
            }

            if(data[i][1] == printTime && data.length > i+1){
                i++;
            }
            if(answer.size() == data.length){
                break;
            }
            printTime ++;
        }
        System.out.println(answer);
//        return answer;
    }

    private static boolean runOrWait(long workTime){
        if(workTime > 0){
            return true;
        }else{
            return false;
        }
    }
}
