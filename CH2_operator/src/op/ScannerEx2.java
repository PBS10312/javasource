package op;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        // 키보드로 입력받기
        // System.in : 키보드, System.out : 화면 <= 고정 명령어
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 입력 >> ");
        // 입력값은 숫자
        int input = scanner.nextInt();
        System.out.println(input);

        scanner.close();
    }
}
