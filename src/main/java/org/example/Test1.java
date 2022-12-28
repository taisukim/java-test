package org.example;

public class Test1 {
    public static void main(String[] args){
        MethodTest m = new MethodTest();
        m.setChannel(10);
        m.setBool(true);
        m.setChannelName("test");

        System.out.println(m.getChannel());
        System.out.println(m.isBool());
        System.out.println(m.getChannelName());

        m.bool();
        m.bool();
        m.channelDown();
        m.channelDown();
        m.channelUp();

        System.out.println(m.getChannel());
        System.out.println(m.isBool());
        System.out.println(m.getChannelName());



    }
}

class MethodTest{
    private int channel;
    private boolean bool;
    private String channelName;

    void channelUp(){
        this.channel++;
    }
    void bool(){
        this.bool = !bool;
    }
    void channelDown(){
        this.channel--;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public boolean isBool() {
        return bool;
    }

    public void setBool(boolean bool) {
        this.bool = bool;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }
}