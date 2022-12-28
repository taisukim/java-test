package org.example;

public class Test3 {
    public static void main(String[] args) {
        Data2 d = new Data2();

        System.out.println(d.getData());
        d.setData(10);
        System.out.println(d.getData());

        Data2 d2 = copy(d);
        System.out.println("d : " + d.getData());
        System.out.println("d2 : " + d2.getData());
        System.out.println(d.toString());
        System.out.println(d2.toString());

    }
    static Data2 copy(Data2 d){
        Data2 data2 = new Data2();
        data2.setData(d.getData());

        return data2;
    }
}

class Data2{
    private int data = 1;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
