package org.example.extendsTest.ex11_4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueTest {

    static Queue q = new LinkedList();
    static final int MAX_SIZE = 5;
    
    public static void main(String[] args) {
        while(true){
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine().trim();
            
            if ("".equals(input)) continue;
            
            if (input.equalsIgnoreCase("q")){
                System.exit(0);
            } else if (input.equalsIgnoreCase("help")) {
                System.out.println(" help : show help");
                System.out.println("q : exit program");
                System.out.println(" history : show your recent commend");
            } else if (input.equalsIgnoreCase("history")) {
                save(input);
                LinkedList list = (LinkedList) q;
                for(int i=0; i<q.size();i++){
                    System.out.println((i+1) + ". " + list.get(i));
                }
            } else {
                save(input);
            }


        }
    }

    public static void save(String input){
        if(!"".equals(input)){
            q.offer(input);
        }
        if(q.size() > MAX_SIZE){
            q.remove();
        }
    }
}
