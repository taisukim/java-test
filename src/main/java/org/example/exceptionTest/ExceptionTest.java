package org.example.exceptionTest;

public class ExceptionTest {
    public static void main(String[] args) {
        try{

            Exception e = new Exception("exception test");
            throw e;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try{
            throw new RuntimeException("runtime Exception");
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}
