package oop;

// 메소드 : 리턴타입(void) 메소드명(){}
// 리턴(반환) 타입 : 기본타입(정수형,불린형,문자형,실수), 객체(대문자로 시작), 배열, void(리턴타입 없음)

public class Method {

    int method1() {

        // return 뒤에 위에서 붙힌 타입과 같은 타입을 넣을것 ex : int는 0으로
        int sum = 15;

        // return 0;
        return sum;
    }

    String method2() {

        String str = "Hello";
        // return "";
        // return null;
        return str;
    }

    double method3() {
        return 35.5;
    }

    char method4() {
        return ' ';
    }

    void method5() {
        return;
    }

    // 매개변수가 있는 메서드
    // 매개변수 : 기본타입(정수형,불린형,문자형,실수), 객체(대문자로 시작), 배열
    // 개수 상관없음 1 ~ 쭉
    int add(int x, int y) { // < 지역변수
        return x + y;
    }

    float add2(int x, float y) {
        // float + int == float
        return x + y;
    }

    void print(String name, String id) {
        System.out.println(name + ": " + id);
    }

    int[] arr(int[] arr1) {
        return arr1;
    }

}
