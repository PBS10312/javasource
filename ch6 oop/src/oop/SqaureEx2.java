package oop;

import java.util.Arrays;

public class SqaureEx2 {
    public static void main(String[] args) {

        // 타입 배열명 = new 타입[갯수];
        // 타입 배열명 = {}; < 값을 알때
        // 객체 배열
        // 객체(클래스)명 배열명 = new 객체(클래스)명[갯수];
        Sqaure sqaureArr[] = new Sqaure[5];
        System.out.println(Arrays.toString(sqaureArr)); // [null, null, null, null, null]

        // sqaureArr[0] = new Sqaure(); // sideLength = 0 < 인 상태
        // sqaureArr[1] = new Sqaure();
        // sqaureArr[2] = new Sqaure();
        // sqaureArr[3] = new Sqaure();
        // sqaureArr[4] = new Sqaure();

        for (int i = 0; i < sqaureArr.length; i++) {
            sqaureArr[i] = new Sqaure();
        }

        // sideLength 값을 부여
        sqaureArr[0].sideLength = 35;
        sqaureArr[1].sideLength = 5;
        sqaureArr[2].sideLength = 14;
        sqaureArr[3].sideLength = 41;
        sqaureArr[4].sideLength = 78;

        for (int i = 0; i < sqaureArr.length; i++) {
            System.out.printf("%d 번째 면적 : %d\n", (i + 1), sqaureArr[i].getArea());
        }
    }
}
