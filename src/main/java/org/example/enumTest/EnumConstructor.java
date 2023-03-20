package org.example.enumTest;

import lombok.val;

enum EnumTest2{
    EAST(1, ">")
    , SOUTH(2, "V")
    , WEST(3, "<")
    , NORTH(4, "^");


    private static final EnumTest2[] DIR_ARR = EnumTest2.values();
    private final int value;
    private final String symbol;
    EnumTest2(int value, String symbol) {
        this.value = value;
        this.symbol = symbol;
    }
    public EnumTest2 rotate(int num){
        num = num % DIR_ARR.length;

        return DIR_ARR[(value - 1 + num) % DIR_ARR.length];
    }

    public EnumTest2 of(int num){
        if(num < 1 || num > DIR_ARR.length){
            throw new IllegalArgumentException("Invalid value : " + num);
        }
        return DIR_ARR[num - 1];
    }

    public int getValue() {
        return value;
    }

    public String getSymbol() {
        return symbol;
    }
}

public class EnumConstructor {
    public static void main(String[] args) {
        System.out.println(EnumTest2.EAST);
        System.out.println(EnumTest2.EAST.getSymbol());
        System.out.println(EnumTest2.EAST.getValue());

        EnumTest2 e = EnumTest2.WEST;
        //아랫줄 에러나는 이유는 아마 EnumTest2.of(1) 을 저장하려면 생성자를 사용해야하는데 안사용하니까? 뭐냐
//        EnumTest2 e = EnumTest2.of(1);
        System.out.println(e.of(1));

        System.out.println(e.rotate(1));


    }
}

