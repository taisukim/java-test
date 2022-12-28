package org.example.extendsTest.ex7_31;

public class InterfaceTest1 {
    public static void main(String[] args) {
        InterfaceTest2 interfaceTest2 = new InterfaceTest3();
//        interfaceTest2.main2();
        System.out.println(interfaceTest2.tetest());
        System.out.println(interfaceTest2.x);
    }
}

abstract class InterfaceTest2 implements InterFace1, InterFace2{

//    static void main2(){
//        System.out.println("인터페이스 상속한 추상클래스");
//    }
//    @Override
//    public int tetest(){
//        return 5;
//    }


}
class InterfaceTest3 extends InterfaceTest2{

}

interface InterFace1{
    int y = 1;
    default int tetest() {return 3;}
    static void main2() {
        System.out.println("인터페이스의 메서드");
    };
}

interface InterFace2{
    int x = 2;

}
