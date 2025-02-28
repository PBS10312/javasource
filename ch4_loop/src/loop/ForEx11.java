package loop;

public class ForEx11 {
    public static void main(String[] args) {

        // 연속 구구단 출력

        // 아래로 출력

        // for (int i = 2; i < 10; i++) {
        // for (int j = 1; j < 10; j++) {
        // System.out.printf("%d x %d = %d\n ", i, j, i * j);
        // }
        // }

        // 옆으로 출력

        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d x %d = %d\t", i, j, i * j);
            }
            System.out.println();
        }

    }
}
