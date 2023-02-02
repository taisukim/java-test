package org.example.generics;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodTest {
    public static void main(String[] args) {
        Box2<Fruit2> box1 = new Box2<>();
        Box2<Apple2> box3 = new Box2<>();
        Box2<Grape2> box4 = new Box2<>();

        box1.add(new Apple2());
        box1.add(new Grape2());
        // 이런식으로 box 안에 Fruit 의 자손들이 여러개 들어있는경우 메소드 2번을 사용하면 될것같다
        System.out.println(methodTest2(box1));

        box3.add(new Apple2());
        box3.add(new Apple2());

        box4.add(new Grape2());
        box4.add(new Grape2());
        // 이런식으로 box 안에 한가지 클래스의 객체들만 존재할경우 메소드 1번을 사용하면 유용할것같다
        System.out.println(methodTest(box3));
        System.out.println(methodTest(box4));

        //아래 메소드에서 오류가 안나는 이유는 컴파일할때 제네릭을 Object 로 바궈버려서 안나는것같다.
        // 정확하게는 모르겠다
        System.out.println(methodTest2(box3));
        System.out.println(methodTest(box1));



    }

    private static <T extends Fruit2> String methodTest(Box2<T> box){
        return "여기는 매개변수 list 를 호출할때마다 다른 객체들로 호출하고싶은경우 사용하면 좋음";
    }

    private static String methodTest2(Box2<? extends Fruit2> box){
        return "여기는 매개변수 list 안의 객체타입이 Fruit2 의 자손들로 구성되어있을경우 사용하면 좋음";
    }

}

@Getter
@Setter
class Box2<T extends Fruit2> {
    List<T> box = new ArrayList<>();
    public void add(T item){
        this.box.add(item);
    }

}

class Fruit2{
    @Override
    public String toString(){
        return "Fruit2";
    }
}

class Apple2 extends Fruit2{
    @Override
    public String toString(){
        return "Apple2";
    }
}

class Grape2 extends Fruit2{
    @Override
    public String toString(){
        return "Grape2";
    }
}


