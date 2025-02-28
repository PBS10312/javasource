package loop;

// *

// **
// ***
// ****
// *****

public class ForEx8 {
    public static void main(String[] args) {

        // for (int i = 1; i <= 1; i++) {
        // System.out.print("*");
        // }
        // System.out.println();

        // for (int i = 1; i <= 2; i++) {
        // System.out.print("*");
        // }
        // System.out.println();

        // for (int i = 1; i <= 3; i++) {
        // System.out.print("*");
        // }
        // System.out.println();

        // for (int i = 1; i <= 4; i++) {
        // System.out.print("*");
        // }
        // System.out.println();

        // for (int i = 1; i <= 5; i++) {
        // System.out.print("*");
        // }
        // System.out.println();

        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= i; j++) { // 규칙적이지 않을땐 안쪽에 조건문을 바꿔준다
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
