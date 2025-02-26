package op;

// 논리연산자 : 비교연산자 여러개 연결 할때 =>결과 값은 true, false
// ex) x가 4보다 작거나 10보다 크다
// &&(end), ||(or) , !(not)

// x는 10보다 크고,20보다 작다
// x > 10 && x < 20

// y는 2의 배수 또는 3의 배수이다
// y % 2 ==0 || y % 3 ==0

// y는 2의 배수 또는 3의 배수이지만, 6의 배수는 아니다
// (y % 2 ==0 || y % 3 ==0) && y % 6 != 0
// 기호별 우선순위는 && 가 먼저 

public class LogicalEx1 {
    public static void main(String[] args) {
        int x = 0;
        char ch = ' ';
        x = 15;
        System.out.printf("x=%2d, 10 < x && x < 20 = %b\n", x, 10 < x && x < 20);
        
        x= 6; 
        System.out.printf("x=%2d, x %% 2==0 || x%%3==0 && x%%6!=0 = %b\n", x, (x % 2==0 || x%3==0) && x%6!=0);
        
        ch = '1';
        // '0'~'9' 사이 숫자인지 확인 
        System.out.printf("ch=%c, '0' <= ch && ch <= '9' = %b\n", ch, '0' <= ch && ch <= '9');

        ch = 'a';
        // 소문자인지 확인 'a' <= ch && ch <= 'z'
        System.out.printf("ch=%c, 'a' <= ch && ch <= 'z' = %b\n", ch, 'a' <= ch && ch <= 'z');
        
        ch = 'A';
        // 대문자인지 확인 'A' <= ch && ch <= 'Z'
        System.out.printf("ch=%c, 'A' <= ch && ch <= 'Z' = %b\n", ch, 'A' <= ch && ch <= 'Z');
        
        ch = 'q';
        // 소문자 Q 이거나 대문자 Q 인지 확인
        System.out.printf("ch=%c, ch=='q' || ch== 'Q' = %b\n", ch, ch=='q' || ch== 'Q');

        System.out.printf("ch=%c, !(ch=='q' || ch== 'Q') = %b\n", ch, !(ch=='q' || ch== 'Q'));
        

    }
}
