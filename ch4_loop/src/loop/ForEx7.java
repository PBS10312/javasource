package loop;

// 중첩 for 은 행과 열이 있다

// * * * * *
// * * * * *
// * * * * *
// * * * * *
// * * * * *

public class ForEx7 {
    public static void main(String[] args) {

        // 별 * 10개 출력

        // for (int i = 0; i < 10; i++) {
        // System.out.print("*");
        // }
        // System.out.println();

        // for (int i = 0; i < 10; i++) {
        // System.out.print("*");
        // }
        // System.out.println();

        // for (int i = 0; i < 10; i++) {
        // System.out.print("*");
        // }
        // System.out.println();

        // for (int i = 0; i < 10; i++) {
        // System.out.print("*");
        // }
        // System.out.println();

        // for (int i = 0; i < 10; i++) {
        // System.out.print("*");
        // }
        // System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(j + "\t"); // 열 을 안쪽에 넣고 행을 바깥쪽 for에 넣는다
            }
            System.out.println();
        }
    }
}
