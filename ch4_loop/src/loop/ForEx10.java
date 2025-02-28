package loop;

import java.util.Scanner;

// *

// **
// ***
// ****
// *****

public class ForEx10 {
    public static void main(String[] args) {

        // for (int i = 5; i > 5; i--) {
        // if (j > 1) {
        // System.out.println("");
        // } else {
        // System.out.println("*");
        // }
        // }
        // for (int i = 5; i > 5; i--) {
        // if (j > 2) {
        // System.out.println("");
        // } else {
        // System.out.println("*");
        // }
        // }
        // for (int i = 5; i > 5; i--) {
        // if (j > 3) {
        // System.out.println("");
        // } else {
        // System.out.println("*");
        // }
        // }
        // for (int i = 5; i > 5; i--) {
        // if (j > 4) {
        // System.out.println("");
        // } else {
        // System.out.println("*");
        // }
        // }
        // for (int i = 5; i > 5; i--) {
        // if (j > 5) {
        // System.out.println("");
        // } else {
        // System.out.println("*");
        // }
        // }

        for (int i = 1; i < 6; i++) {
            for (int j = 5; j > 0; j--) {
                // if (j > i) {
                // System.out.print(" ");
                // } else {
                // System.out.print("*");
                // }
                System.out.print(j > i ? " " : "*");
            }
            System.out.println();
        }

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("수 를 입력하세요");
        // String input = scanner.nextLine();
        // int p = Integer.parseInt(input);

        // for (int i = 1; i <= p; i++) { //
        // for (int j = 1; j <= i; j--) { // 규칙적이지 않을땐 안쪽에 조건문을 바꿔준다
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // scanner.close();

    }
}
