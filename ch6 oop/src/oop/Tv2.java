package oop;

// private : 외부 클래스에서 접근 불가

public class Tv2 {
    // tv의 특성 : 크기(int), 색상(String선언), 채널(int), 볼륨(int)
    private int size;
    private String color;
    private int channel;
    private int volume;
    private boolean power;

    // 초기화를 위해서 생성자를 만듬
    public Tv2() {

    }

    public Tv2(int size, String color) {
        this.size = size;
        this.color = color;
    }

    void changeChannel(int channel) {
        this.channel = channel;
    }

    // 동작 : 채널변경, 볼륨조절, 전원 on/off,
    void channelUp() {
        channel++;
    }

    void channelDown() {
        channel--;
    }

    void power() {
        power = !power;
    }

    @Override
    public String toString() {
        return "Tv [size=" + size + ", color=" + color + ", channel=" + channel + ", volume=" + volume + ", power="
                + power + "]";
    }
}
