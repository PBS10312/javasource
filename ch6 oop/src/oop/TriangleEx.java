package oop;

public class TriangleEx {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();

        // 인스턴스 변수 초기화
        triangle.baseLine = 20;
        triangle.height = 35;

        System.out.println("면적은 : " + triangle.getArea());
        System.out.println("====================================");

        triangle = new Triangle(20, 10);
        System.out.println("면적은 : " + triangle.getArea());

    }
}
