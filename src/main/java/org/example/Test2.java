package org.example;

public class Test2 {
    public static void main(String[] args){

        Data data = new Data();
        data.setData(5);

        System.out.println(data.getData());

        change(data.getData());
        System.out.println("call change" + data.getData());
        methodChange(data);
        System.out.println("call methodChange" + data.getData());
    }
    public static void change(int a){
        a = 1000;
        System.out.println("change method print" + a);
    }
    public static void methodChange(Data d){
        d.setData(1000);
        System.out.println("methodChange method print" + d.getData());
    }

}
class Data{
    private int data = 1;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
