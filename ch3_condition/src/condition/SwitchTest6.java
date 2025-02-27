package condition;

import java.util.Scanner;

public class SwitchTest6 {
    public static void main(String[] args) {
        // 연산자, 피연산자 입력받은 후 계산해서 결과 출력
        // +,-,*,/,% < 연산자

        // 출력문 : 5 - 3 = 2
        Scanner scanner = new Scanner(System.in);
        System.out.println("연산자(+,-,*,/,%) 입력");
        String op = scanner.nextLine();

        System.out.println("첫 피연산자 입력");
        String input = scanner.nextLine();
        int num1 = Integer.parseInt(input);
        
        System.out.println("두번째 피연산자 입력");
        input = scanner.nextLine();
        int num2 = Integer.parseInt(input);
        
       int result = 0;

        switch (op) {
            case "+":
                result = num1 + num2; 
                break;
            case "-":
                result = num1 - num2; 
                break;
            case "*":
                result = num1 * num2; 
                break;
            case "/":
                result = num1 / num2; 
                break;
            case "%":
                result = num1 % num2; 
                break;
            default:
                System.out.println("입력값을 확인해 주세요");
                break;
                // ㄴ 브레이크를 빼고 System.exit(); 넣어도 좋다 < 프로그램 종료라는 뜻
        }
        // 오타로 잘못 표기 할수도 있기때문에
        // if (result != 0) < 이런식으로 if를 걸고 출력시켜도 좋다
        System.out.printf("%d %s %d = %d",num1,op,num2,result);
    }
}
