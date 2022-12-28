package org.example.extendsTest.ex7_31;

public class ExTest1 {
    public static void main(String[] args) {
        Unit[] units = {new Tank(0,0,true), new DropShip(0,0,false), new Tank(0,0,true)};

        for(Unit u : units){
            u.move(1,10);
        }

        for(Unit u : units){
            u.setXY(5,5);
        }

        for(Unit u : units){
            u.move(20,20);
        }
    }
}

abstract class Unit{
    private int x,y;
    private boolean position; //true : ground, false : air

    public Unit(int x, int y, boolean position) {
        this.x = x;
        this.y = y;
        this.position = position;
    }

    public abstract void move(int x, int y);

    protected void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    protected String getPosition(){
        return position ? "지상" : "공중";
    }

}

class Tank extends Unit{

    public Tank(int x, int y, boolean position) {
        super(x, y, position);
    }

    @Override
    public void move(int x, int y) {
        super.setXY(x, y);
        System.out.println(getPosition() + ", " + "x : " + x + ", y :" + y + " 좌표로 이동하였습니다");
    }
}

class DropShip extends Unit{

    public DropShip(int x, int y, boolean position) {
        super(x, y, position);
    }

    @Override
    public void move(int x, int y) {
        super.setXY(x, y);
        System.out.println(getPosition() + ", " + "x : " + x + ", y :" + y + " 좌표로 이동하였습니다");
    }
}