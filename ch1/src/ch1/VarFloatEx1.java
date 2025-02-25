package ch1;

public class VarFloatEx1 {
    public static void main(String[] args) {
        // 실수형 : float, double
        // 소수점 형태의 숫자를 사용하면 무조건 double로 인식함
        // 아래식은 float(4byte) = double(8byte) 형태
        // 위에 식은 성립이 안되므로 float f,F를 붙임
        float score1 = 90.14f;
// double 타입도 d,D를 붙임
        double score2 = 98.5d;
        System.out.println("score1 = "+score1);
        System.out.println("score2 = "+score2);
        // 소수점 2째자리까지 표현
        System.out.printf("score2 = %.2f\n",score2);
    }
}
