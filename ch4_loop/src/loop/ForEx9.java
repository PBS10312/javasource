package loop;

import java.util.Scanner;

// *

// **
// ***
// ****
// *****

public class ForEx9 {
    public static void main(String[] args) {

        // *을 출력할 라인의 수 입력받기
        Scanner scanner = new Scanner(System.in);
        System.out.println("수 를 입력하세요");
        String input = scanner.nextLine();
        int p = Integer.parseInt(input);

        for (int i = 1; i <= p; i++) { //
            for (int j = 1; j <= i; j++) { // 규칙적이지 않을땐 안쪽에 조건문을 바꿔준다
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();

    }
}
