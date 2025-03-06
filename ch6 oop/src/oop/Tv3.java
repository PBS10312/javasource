package oop;

// private : 외부 클래스에서 접근 불가 : 멤버 변수에 붙임
// public : private의 반대 (접근제한없음) : 생성자 , 메서드 만들때 

public class Tv3 {
    // tv의 특성 : 크기(int), 색상(String선언), 채널(int), 볼륨(int)
    private int size;
    private String color;
    private int channel;
    private int volume;
    private boolean power;

    // 초기화를 위해서 생성자를 만듬
    public Tv3() {

    }

    public Tv3(int size, String color) {
        this.size = size;
        this.color = color;
    }

    // setter : 인스턴스 변수 값 변경
    // getter : 인스턴스 변수 사용

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    // 동작 : 채널변경, 볼륨조절, 전원 on/off,
    void channelUp() {
        channel++;
    }

    void channelDown() {
        channel--;
    }

    @Override
    public String toString() {
        return "Tv [size=" + size + ", color=" + color + ", channel=" + channel + ", volume=" + volume + ", power="
                + power + "]";
    }
}
