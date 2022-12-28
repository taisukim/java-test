package org.example.extendsTest.ex7_51;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * 익명 클래스 구현 후
 */
public class AnonymousClass {
    public static void main(String[] args) {
        Button b = new Button("Start");
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("ActionEvent occurred!!!!");
            }
        });
    }
}


/**
 * 익명클래스 구현 전
 */
//public class AnonymousClass {
//    public static void main(String[] args) {
//        Button b = new Button();
//        b.addActionListener(new EventHandler());
//
//    }
//}
//
//class EventHandler implements ActionListener{
//    public void actionPerformed(ActionEvent e){
//        System.out.println("ActionEvent occurred!!!!");
//    }
//}