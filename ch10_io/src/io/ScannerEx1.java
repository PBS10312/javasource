package io;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        // 키보드 입력 방법
        // InputStream
        // Scanner
        // nextint 는 앞에 숫자만 가져감
        // nextline 은 줄단위로 보기때문에 건너 뜀
        // next는 엔터를 안 읽음

        Scanner sc = new Scanner(System.in);

        System.out.println("숫자 입력");
        int num1 = sc.nextInt(); // 5 하고 엔터침
        System.out.println("연산자 입력 (+-*/)");
        // String op = sc.nextLine();
        String op = sc.next();
        System.out.println("숫자 입력");
        int num2 = sc.nextInt();

    }
}
