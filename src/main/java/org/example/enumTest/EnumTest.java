package org.example.enumTest;

enum Direction {EAST, SOUTH, WEST, NORTH}
public class EnumTest {
    static Direction dir = Direction.EAST;
    static void init(){
        dir = Direction.EAST;
    }

    public static void main(String[] args) {

        System.out.println(dir);
        if(dir == Direction.EAST){
            System.out.println("dir == Direction.EAST");
//        } else if (dir > Direction.EAST) {
//
        } else if(dir.compareTo(Direction.WEST) > 0){
            System.out.println("dir.compareTo(Direction.EAST) > 0");
        }
    }
}

