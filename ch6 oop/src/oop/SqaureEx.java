package oop;

import java.util.Arrays;

public class SqaureEx {
    public static void main(String[] args) {

        Sqaure sqaure = new Sqaure(3);
        System.out.println("면적은 : " + sqaure.getArea());

        Sqaure sqaure2 = new Sqaure(4);
        System.out.println("면적은 : " + sqaure2.getArea());

        // 타입 배열명 = new 타입[갯수];
        // 타입 배열명 = {}; < 값을 알때
        // 객체 배열
        // 객체(클래스)명 배열명 = new 객체(클래스)명[갯수];
        Sqaure sqaure3[] = new Sqaure[5];
        System.out.println(Arrays.toString(sqaure3)); // [null, null, null, null, null]
        sqaure3[0] = new Sqaure(15);
        // System.out.println("첫번째 면적" + sqaure3[0].getArea());

        sqaure3[1] = new Sqaure(5);
        // System.out.println("두번째 면적" + sqaure3[1].getArea());

        sqaure3[2] = new Sqaure(9);
        // System.out.println("세번째 면적" + sqaure3[2].getArea());

        sqaure3[3] = new Sqaure(2);
        // System.out.println("네번째 면적" + sqaure3[3].getArea());

        sqaure3[4] = new Sqaure(4);
        // System.out.println("다섯 번째 면적" + sqaure3[4].getArea());

        for (int i = 0; i < sqaure3.length; i++) {
            System.out.printf("%d 번째 면적 : %d\n", (i + 1), sqaure3[i].getArea());
        }

        // 배열 기본타입으로 생성
        // 정수형-0, 실수형-0.0 , 불린형-false
        int arr[] = new int[5];
        System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0, 0]
        arr[0] = 15;
        arr[1] = 99;
        arr[2] = 12;
        arr[3] = 5;
        arr[4] = 1;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
