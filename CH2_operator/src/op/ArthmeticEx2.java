package op;

public class ArthmeticEx2 {
    public static void main(String[] args) {
        // 변수 선언
        byte a = 10, b=4;
        // 사칙연산 byte,short는 연산시 결과가 int로 변환
        // byte c = a + b;
        
        // 해결책 1) 인트로 변환
        // int c = a + b;
        
        // 해결책 2) 단 바이트로 변환 할땐 결과 값이 -128 ~ 127 사이일때만
        byte c = (byte)(a + b);

    }
}
        
        

