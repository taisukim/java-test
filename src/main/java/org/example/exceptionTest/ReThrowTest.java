package org.example.exceptionTest;

public class ReThrowTest {
    public static void main(String[] args) {
        try{
            reThrowTest();
        }catch(Exception e){
            System.out.println(e.getMessage()+"main 메서드에서 예외처리함");
        }
    }
    private static void reThrowTest() throws Exception{
        try{
            throw new Exception();
        }catch(Exception e){
            System.out.println(e.getMessage()+"reThrowTest 에서 예외처리함");
            throw e;
        }
    }
}
