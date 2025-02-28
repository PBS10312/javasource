package loop;

public class ForEx12 {
    public static void main(String[] args) {
        // 4x + 5y = 60
        // x,y는 10이하의 자연수
        // 예시 출력 (5,3)

        // int x = 4 * x;
        // int y = 5 * y;

        // for (int x = 1; x <= 10; x++) {
        // for (int y = 1; y <= 10; y++) {
        // System.out.printf("%d + %d = %d\n ",x,y,x+y);
        // }
        // }

        for (int x = 1; x < 11; x++) {
            for (int y = 1; y < 11; y++) {
                if (4 * x + 5 * y == 60) {
                    System.out.printf("(%d, %d)\n", x, y);
                }
            }
        }
    }
}