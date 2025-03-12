package exception;

import java.util.Scanner;

public class NumberFormatEx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("입력 >> ");

        // try {
        // int num = Integer.parseInt(sc.nextLine());
        // System.out.println(num);
        // } catch (Exception e) {
        // e.printStackTrace(); // 개발자용
        // // System.out.println("입력값을 확인해 주세요"); // 사용자용
        // }
        // sc.close();

        // ===========================================================================
        // 추가예시
        // fianlly 사용하기
        try {
            int num = Integer.parseInt(sc.nextLine());
            System.out.println(num);
        } catch (Exception e) {
            // e.printStackTrace(); // 개발자용
            System.out.println("입력값을 확인해 주세요"); // 사용자용
        } finally {
            System.out.println("무조건 실행");
        }

        sc.close();

        // ===========================================================================
        // 추가예시 2
        // try-catch-finally (catch 생략가능)

        try {
            int num[] = new int[1];
            System.out.println(num[3]);
        } finally {
            System.out.println("여기도 무조건 실행");
        }

    }
}
