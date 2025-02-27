package condition;

import java.util.Scanner;

public class SwitchTest4 {
    public static void main(String[] args) {
        // 가위는 1 ,바위는 2, 보자기 3

        // 컴퓨터가 내는 가위,바위,보 결정 (무작위)
        int comeputer = (int)(Math.random() * 3) + 1;

        // 사용자가 내는 가위 바위 보 결정
         Scanner scanner = new Scanner(System.in);
        System.out.println("가위 바위 보 중 하나 입력");
        String input = scanner.nextLine();
        int user = Integer.parseInt(input);

        // 2(바위,컴퓨터) - 1(가위,유저) = 1 (컴퓨터)
        // 컴퓨터가 이겼습니다 , 유저가 이겼습니다, 비겼습니다

       switch (user) {
        case "가위":
            System.out.println();
            break;
        case "바위":
            System.out.println();
            break;

        default:
            break;
       }
    }
}
