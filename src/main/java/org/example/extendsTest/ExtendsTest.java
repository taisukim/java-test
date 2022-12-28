package org.example.extendsTest;

public class ExtendsTest {
    public static void main(String[] args) {
        Parent parent = new Child();
        System.out.println(parent.testNum);

        parent.resetTestNum();

        System.out.println(parent.testNum);

        Child newParent = (Child)parent;
        System.out.println(newParent.getChildNum());
    }
}

class Parent{
    private int parentNum = 1;
    public String testNum;

    public int getParentNum() {
        return parentNum;
    }

    public void setParentNum(int parentNum) {
        this.parentNum = parentNum;
    }

    public void resetParentNum(){
        parentNum = 5;
    }

    public void resetTestNum(){
        testNum = "this is parent";
    }
}

class Child extends Parent{
    private int childNum = 5;

    public int getChildNum() {
        return childNum;
    }

    public void setChildNum(int childNum) {
        this.childNum = childNum;
    }
//    @Override
//    public void resetTestNum(){
//        super.testNum = "this is child";
//    }
}
