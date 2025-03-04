package Array;

public class ArrayEx8 {
    public static void main(String[] args) {
        int[] score = { 74, 46, 95, 14, 56, 62, 32, };

        // 배열에 저장된 값 중에서 최대값과 최소값 구하기

        // int max = 74;
        // int min = 74;

        int max = score[0], min = score[0];

        for (int i = 1; i < score.length; i++) {
            if (max < score[i]) {
                max = score[i];
            } else if (min > score[i]) {
                min = score[i];
            }
        }

        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);
    }
}
