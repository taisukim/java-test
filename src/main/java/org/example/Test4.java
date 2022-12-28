package org.example;

public class Test4 {
    public static void main(String[] args) {
        TestClass.test2();

    }
}
class TestClass{
    public int a = 0;
    public static int b = 1;

    public void test1(){
        System.out.println(a);
        System.out.println(b);
    }

    public static void test2(){
        TestClass test = new TestClass();
        System.out.println(test.a);
        test.test1();

    }
}
