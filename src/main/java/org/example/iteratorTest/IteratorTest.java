package org.example.iteratorTest;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        Collection col = new HashSet();
        col.add(1);
        col.add(2);
        col.add(3);
        col.add(4);
        col.add(5);

        Iterator it = col.iterator();

        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }


    }
}
