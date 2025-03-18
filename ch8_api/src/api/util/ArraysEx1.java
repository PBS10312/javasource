package api.util;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysEx1 {
    public static void main(String[] args) {

        Integer[] arr = { 33, 24, 15, 66, 7 };
        System.out.println(arr);
        System.out.println("배열 값 출력 " + Arrays.toString(arr));

        // Arrays.toString(args);
        // Arrays.asList("");

        // 오름차순 정렬
        // Arrays.sort(arr);
        // System.out.println("배열 값 출력 " + Arrays.toString(arr));
        // =================================================================

        // 내림차순 정렬
        Arrays.sort(arr, Comparator.reverseOrder());
        System.out.println("배열 값 출력 " + Arrays.toString(arr));
    }
}
