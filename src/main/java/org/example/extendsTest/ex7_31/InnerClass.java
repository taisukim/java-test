package org.example.extendsTest.ex7_31;

class AAA{
    int a;

    class BBB{
        public void method(){

            a = 3;
            System.out.println(a);
        }
    }

    public BBB getBBB(){
        return new BBB();
    }

}
class CCC{

        }

public class InnerClass {
    public static void main(String[] args) {
//        BBB b = new BBB();
//        b.method();
        AAA a = new AAA();
        a.getBBB().method();
    }
}
