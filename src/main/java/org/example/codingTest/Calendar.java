package org.example.codingTest;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Calendar {
    public static void main(String[] args) {
//        int a = 3;
//        int b = 31;
        String[] days = {"test","MON","TUE","WED","THU","FRI","SAT","SUN"};
        for (int a = 1; a<13;a++){
            for (int b = 1; b<30; b++){

                LocalDate date = LocalDate.of(2016, a, b);
                DayOfWeek day = date.getDayOfWeek();
                System.out.println(day);
                System.out.println(days[day.getValue()]);
                System.out.println(day.getValue());
            }
        }

    }
}
