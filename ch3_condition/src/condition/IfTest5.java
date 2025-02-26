package condition;

import java.util.Scanner;

public class IfTest5 {
    public static void main(String[] args) {
    //  주사위 1~6
    
    // 0.08456436162898484
    // 0.499389859291265
    // Math.random() 실행할때 랜덤의 수, 0.0 <= Math.random() < 1.0  약속된 범위
    System.out.println(Math.random());

    // (Math.random() * 6) < 이렇게 짜면 0~5, ((Math.random() * 6) : 0~5) + 1
    int num = (int)(Math.random() * 6) + 1;

    // num이 1이면 주사위 1번이 나왔습니다

    if (num == 1) {
        System.out.println("주사위 1번이 나왔습니다");
    }else if (num == 2) {
        System.out.println("주사위 2번이 나왔습니다");
    }else if (num == 3) {
        System.out.println("주사위 3번이 나왔습니다");
    }else if (num == 4) {
        System.out.println("주사위 4번이 나왔습니다");
    }else if (num == 5) {
        System.out.println("주사위 5번이 나왔습니다");
    }else{
        
    }
    

    }
    
}
