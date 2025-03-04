package oop;

// Tv 클래스를 이용해서 Tv(인스턴스)를 생성
// 객체 구성요소
// 1.속성(특성) => 멤버변수
// 2.기능(동작) => 멤버메소드

public class Tv {
    // tv의 특성 : 크기(int), 색상(String선언), 채널(int), 볼륨(int)
    int size;
    String color;
    int channel;
    int volume;
    boolean power;

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
