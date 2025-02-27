package condition;

import java.util.Scanner;

public class IfTest10 {
    public static void main(String[] args) {
        // 세 개의 숫자를 입력받아 입력받은 수 중 가장 큰 수와 가장 작은 수 출력

        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 수 입력");
        String input = scanner.nextLine();
        int num1 = Integer.parseInt(input);
        
        System.out.println("두번째 수 입력");
        input = scanner.nextLine();
        int num2 = Integer.parseInt(input);

        System.out.println("세번째 수 입력");
        input = scanner.nextLine();
        int num3 = Integer.parseInt(input);

        if (num1 <= num2) {
            if (num1 <= num3) {
                System.out.println("가장 큰수"+num1);
            }
        } else {
            System.out.println("가장 작은수"+num1);
        }

        if (num2 <= num1 ) {
            if (num2 <= num3) {
                System.out.println("가장 큰수"+num2);
            }
        } else {
            System.out.println("가장 작은수"+num2);
        }

        if (num3 <= num1) {
            if (num3 <= num2) {
                System.out.println("가장 큰수"+num3);
            }
        } else {
            System.out.println("가장 작은수"+num3);
        }
        scanner.close();

    }
}
