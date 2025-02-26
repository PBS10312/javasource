package op;

// 비교연산자 : 결과는 true or false
// 대소비교 : <, >, <=, >=
// 등가비교 : ==(equal), !=(not equal)

// /t (tap) 탭을 눌러달라는 뜻
// %b (boolean 값 출력)
// 두 변수의 타입이 다른 경우 타입을 맞춘 후 비교
public class CompareEx1 {
    public static void main(String[] args) {
        System.out.printf("10 == 10.0f \t %b\n", (10==10.0f));
        System.out.printf("'0' == 0 \t %b\n", ('0'== 0)); // '문자 0'은 48 
        System.out.printf("'A' == 65 \t %b\n", ('A'== 65)); // 문자 A는 65
        System.out.printf("'A' > B \t %b\n", ('A' > 'B')); // 65 > 66
        System.out.printf("'A' +1 != 'B' \t %b\n", ('A'+1 != 'B')); // 65+1 != 66

    }
}
