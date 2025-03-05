package oop;

public class Sqaure {
    // 정사각형
    // 속성 : 하나의 변 (sideLength)
    // 기능 : 면적을 구한다.

    // 생성자
    int sideLength;

    public Sqaure() {
    }

    public Sqaure(int sideLength) {
        this.sideLength = sideLength;
    }

    int getArea() {
        return sideLength * sideLength;
    }

    @Override
    public String toString() {
        return "Sqaure [sideLength=" + sideLength + "]";
    }

}
