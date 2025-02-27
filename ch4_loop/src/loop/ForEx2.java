package loop;

public class ForEx2 {
    public static void main(String[] args) {
        // System.out.println("안녕하세요");
        // System.out.println("안녕하세요");
        // System.out.println("안녕하세요");
        // System.out.println("안녕하세요");
        // System.out.println("안녕하세요");
        // System.out.println("안녕하세요");
        // System.out.println("안녕하세요");
        // System.out.println("안녕하세요");
        // System.out.println("안녕하세요");
        // System.out.println("안녕하세요");
        // System.out.println("안녕하세요");
        
        // 반복문 중단 : 강제 중단(break)을 시키거나 조건이 false 일때
        // 실행순서
        // 1) 초기화 int i = 0; 초기화(한번만 실행)
        // 2) 조건검사 i < 5;
        // 3) 루프 안으로 진입 - 안녕하세요 출력
        // 4) 증감연산자를 실행 i++ (i=1)
        // 5) 조건검사 
        // 6) 루프 안으로 진입 - 안녕하세요 출력
        // 7) 증감연산자를 실행 i++ (i=2)
        // 8) 5) ~ 7) 반복
        // ..... 증감연산자 실행 i++ (i=5)
        //       조건검사 5 < 5 루프 중단
        
        for (int i = 1; i < 11; i++) {
            System.out.print(i+"   ");
        }
        System.out.println();

        // 10에서 1로 반대로 셀때
        for (int i = 10; i > 0; i--) {
            System.out.print(i+"   ");
        }

        System.out.println();

        // 짝수만 출력 1~10
        for (int i = 1; i < 11; i++) {
            // i가 짝수이면 출력해줘 < if를 쓴다
            if (i % 2 == 0) {
                System.out.print(i+"   ");
            }
            
        }

        System.out.println();

        // if 없이 짝수 만들기 , i+=2 : i=i+2
        for (int i = 2; i < 11; i+=2) {
            System.out.println(i+"   ");
        }
    }
}
