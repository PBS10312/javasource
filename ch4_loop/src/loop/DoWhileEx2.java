package loop;

import java.util.Scanner;

// for, while 과의 차이는 무조건 한번은 실행(조건검사는 나중)
public class DoWhileEx2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("메세지를 입력해 주세요");
        String input;

        // 문자를 입력받은 후 출력
        // q 라는 문자를 입력하면 프로그램 종료하기

        do {

            System.out.println("종료를 원하면 q,Q 입력"); // 이 부분이 q를 넣으면 종료
            System.out.print(">> ");
            input = scanner.nextLine();
            System.out.println(input);

        } while (!input.equalsIgnoreCase("q")); // == , != < 문자열 일땐 얘네 대신에 equals,
                                                // 대소문자 신경쓰고 싶지 않을떈 equalsihnore
                                                // q와 같지 않아야 하기때문에 앞에 ! 를 써줘서 부정으로 만든다
        System.out.println("프로그램 종료합니다.");

    }
}
