package op;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        // 키보드로 입력받기
        // System.in : 키보드, System.out : 화면 <= 고정 명령어
        Scanner scanner = new Scanner(System.in);

        System.out.println("두자리 정수 입력");
        // ㄴ 사용자가 입력한 값을 input 변수에 담기
        String input = scanner.nextLine();
        // ㄴ nextLine() : 무조건 문자열로 받아옴 , 숫자를 하나로 받을 때

        int num = Integer.parseInt(input);
        // ㄴ "45" ==> 45 문자열을 정수로 바꿈

        System.out.println("입력값 : " + num);

        scanner.close();
    }
}
