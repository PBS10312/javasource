package Array;

import java.util.Arrays;

public class ArrayEx12 {
    public static void main(String[] args) {

        // 배열 생성 시 변수의 타입에 따라 기본값이 설정됨
        // int : 0으로 셋팅, boolean : fasle, double(float) : 0.0
        // String : null

        String[] names = { "Kim, Park, Yi" };

        String[] name = new String[2];
        System.out.println(Arrays.toString(name)); // 초기화를 안해서 [null, null]

        int[] arr1 = new int[2];
        System.out.println(Arrays.toString(arr1));// [0, 0]

        boolean[] arr2 = new boolean[2];
        System.out.println(Arrays.toString(arr2));// [false, false]
    }
}
