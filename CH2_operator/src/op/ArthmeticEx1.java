package op;

public class ArthmeticEx1 {
    public static void main(String[] args) {
        // 변수 선언 - int a, b
        int a = 10, b=4;

        // +,-,*,/(자바의 나누기는 몫만 보여준다) 사칙연산
        System.out.printf("%d + %d = %d\n", a, b, a+b);
        System.out.printf("%d + %d = %d\n", a, b, a-b);
        System.out.printf("%d + %d = %d\n", a, b, a*b);
        System.out.printf("%d + %d = %d\n", a, b, a/b);
        // 소수점 표현은 float double 
        // a(float)b == 10/4.000000
        // a(int) / b(float) a는 인트 b는 플룻으로 변경, 타입이 다른경우 큰 쪽으로 변환
        // 소수점을 보고 싶으면 둘 값중 하나를 플룻으로 변환하기
        System.out.printf("%d + %f = %f\n", a, (float)b, a/(float)b);
        // int 와 float은 값은 같지만 숫자를 표현하는 범위가 다르기 때문에 float이 더 큼
        
    }
}
        
        

