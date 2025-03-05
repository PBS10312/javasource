package oop;

public class Triangle {
    // 삼각형 속성 : 밑변(baseLine),높이(height)

    int baseLine; // << 있어야 아래에 있는 this를 쓸수있음
    int height;

    public Triangle() {
    }

    // 생성자의 목적
    // 1.인스턴스 변수 초기화
    public Triangle(int baseLine, int height) {
        this.baseLine = baseLine;
        this.height = height;
    }

    // 기능 : 면적을 구한다. - getArea
    double getArea() {
        return baseLine * height / 2.0;
    }

}
