package org.example.extendsTest.ex7_43;

public class OuterClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        System.out.println(inner.innerInstanceValue);
        System.out.println(Outer.StaticInner.staticInnerStaticValue);
//        객체를 만들지않고 스테틱클래스안에있는 인스턴스벨류를 사용했을경우 에러남
//        스테틱클래스이기때문에 객체를 새로 생성할수 없으니 사실상 사용이 불가능하다.
//        System.out.println(Outer.StaticInner.staticInnerInstanceValue);
        outer.methodInner();

    }
}


class Outer {

    private String outerInstanceValue = "outerInstanceValue";
    private static String outerStaticValue = "outerStaticValue";
    class Inner{
        String innerInstanceValue = "innerInstanceValue";
        //private static String innerStaticValue = "innerStaticValue";

    }

    static class StaticInner {
        //스테틱 클래스안에 인스턴스 변수이기때문에 사실상 사용이 불가능하다 생성만 가능하다 사용할수 없다면 생성할 이유가 없긴한것같다.
        public String staticInnerInstanceValue = "staticInnerInstanceValue";
        public static String staticInnerStaticValue = "staticInnerStaticValue";


    }

    public void methodInner() {
        String methodInnerInstanceValue = "methodInnerInstanceValue";
        final String methodInnerStaticValue = "methodInnerStaticValue";
//        methodInnerInstanceValue = "change";
        class MethodInner {
            private String methodInnerClassInstanceValue = "methodInnerClassInstanceValue";

//            메소드 안의 클래스는 스테틱을 적용시킬수 없다
//            private static String methodInnerStaticValue = "methodInnerStaticValue";
            private String callMethodInstanceValueInMethodInnerClass = methodInnerInstanceValue;
            private String callMethodInstanceValueInMethodInnerClass2 = methodInnerStaticValue;

        }
    }
}



