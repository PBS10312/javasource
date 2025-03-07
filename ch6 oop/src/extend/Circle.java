package extend;

// 클래스간의 관계

// 1) 상속관계 : is a

// 2) 포함관계 : has a
// ㄴ 한 클래스 안에 다른 클래스가 멤버 변수로 선언 되는걸 포함관계라 함

// 대문자로 시작하는것은 모두 다 객체임

// 관계 결정하기
// public class Circle extends Point{} < extends를 사용해서 만들면?
// extends : 원(Circle)은 점(Point)이다 : Circle is a Point
// 포함 : 원(Circle)은 점(Point)울 가지고 있다 : Circle has a Point

// 만약에 Car , SportsCar 2개의 클래스를 관계를 이용해 만들면?
// SportsCar 는 Car 이다 || SportsCar 는 Car 를 가지고 있다 < 둘중에 뭐가 맞는 방법일까 : 전자

public class Circle extends Shape {
    // int x;
    // int y;

    Point point;
    int r;

    public Circle() {
    }

    public Circle(Point point, int r) {
        this.point = point;
        this.r = r;
    }

    void draw() {
        System.out.printf("[center = (%d,%d), r = %d , color = %s]\n",
                point.x, point.y, r, color);
    }

}
