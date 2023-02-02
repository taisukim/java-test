package org.example.generics;


import java.util.ArrayList;

public class GenericsTest {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        FruitBox<Fruit> fruitBox = new FruitBox<>();

        box.add("test1");
        box.add("test2");

//        fruitBox.add("test5");
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        fruitBox.add(new Fruit());

        System.out.println("box = " + box);
        System.out.println("fruitBox = " + fruitBox);

        fruitBox.setItem(0, (Fruit)fruitBox.getItem(0));
        System.out.println("fruitBox = " + fruitBox);

        fruitBox.setItem(2, (Apple)fruitBox.getItem(2));
        System.out.println("fruitBox = " + fruitBox);

    }
}

class Box<T>{
    ArrayList<T> list = new ArrayList<>();
    void add(T item){
        this.list.add(item);
    }
    T getItem(int i){
        return this.list.get(i);
    }
    void setItem(int i, T item){
        list.set(i, item);
    }


    int size(){
        return this.list.size();
    }
    @Override
    public String toString(){
        return this.list.toString();
    }
}
class FruitBox<T extends Fruit> extends Box<T>{

}

class Fruit {
    @Override
    public String toString(){
        return "Fruit";
    }
}

class Apple extends Fruit{
        @Override
        public String toString(){
            return "Apple";
        }
    }

class Grape extends Fruit{
    @Override
    public String toString(){
        return "Grape";
    }
}
