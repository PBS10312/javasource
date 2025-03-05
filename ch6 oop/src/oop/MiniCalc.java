package oop;

// 메서드 종류

// 1. 인스턴스 메서드 :클래스 영역 / 인스턴스가 생성되었을 때 (new가 선언되면 실행)
// 2. 클래스 메서드 : 클래스 영역 / 클래스가 메모리에 올라갔을 때 (클래스 작성 완료되면)

// 같은 클래스 내에서 다른 메소드를 호출할수있다 static 붙으면 몬함
// new 안붙이고 이름만 호출가능

// static - non-static 차이는 생성되는 시기가 다르기 때문에 호출 시점을 따져야 함

// non-static : static , non-static 사용가능, 

public class MiniCalc {

    static int k;
    int a, b;

    // static이 붙으면 클래스 메서드
    static void print() {
        // plus , avg , execute , println 등 호출불가 => 호출 하려면 new MiniCalc() 해야함
        // this.a = 7; > 호출 하려면 new MiniCalc() 해야함
        k = 45;

    }

    int plus(int x, int y) { // ㅡㅡㅡ
        this.a = 7; // ㅣ
        k = 45; // ㅣ
        print(); // ㅣ
        return x + y; // ㅣ
    } // ㅣ 생성시기가 똑같아서 부를수 있음
      // ㅣ

    double avg(int x, int y) { // ㅣ
        double sum = plus(x, y); // ㅡㅡㅡ
        return sum / 2;
    }

    void execute() {
        double result = avg(7, 10);
        System.out.println("실행 결과 : " + result);
    }

    void println(String msg) {
        System.out.println(msg);
    }
}
