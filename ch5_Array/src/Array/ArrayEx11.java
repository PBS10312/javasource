package Array;

import java.util.Arrays;

public class ArrayEx11 {
    public static void main(String[] args) {

        int[] score = { 74, 46, 95, 14, 56, 62, 32, };

        // 정렬 (오름차순, 내림차순) : 메소드 이용
        for (int i = 0; i < score.length - 1; i++) {
            for (int j = 0; j < score.length - 1 - i; j++) {
                if (score[j] > score[j + 1]) {
                    int temp = score[j];
                    score[j] = score[j + 1];
                    score[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(score));
    }
}
