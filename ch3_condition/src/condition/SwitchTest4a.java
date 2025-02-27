package condition;

import java.util.Scanner;

public class SwitchTest4a {
    public static void main(String[] args) {
        // 가위는 1 ,바위는 2, 보자기 3

        // 컴퓨터가 내는 가위,바위,보 결정 (무작위)
        int computer = (int)(Math.random() * 3) + 1;

        // 사용자가 내는 가위 바위 보 결정
        Scanner scanner = new Scanner(System.in);
        System.out.println("가위 바위 보 중 하나 입력");
        String input = scanner.nextLine();
        int user = Integer.parseInt(input);

        // 1 - 2 = -1 컴 , 1 - 3 = -2 나
        // 2 - 2 = 0 무 2 - 3 = -1 컴
        // 3 - 1 = 2 컴 3 - 2 = 1 나
        // 컴퓨터가 이겼습니다 , 유저가 이겼습니다, 비겼습니다

       switch (user - computer) {
        case 2:
        case -1:
            System.out.println("컴퓨터가 이겼습니다");
            break;
        case 1:
        case -2:
            System.out.println("user가 이겼습니다");
            break;
        case 0:
            System.out.println("비겼습니다");
        
       }scanner.close();
    } 
}
