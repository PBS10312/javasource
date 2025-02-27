package condition;

// swich : 조건문 if~else if else 대체
// 스위치는 조건을 넣을수 없다

public class SwitchTest2 {
    public static void main(String[] args) {
        char grade = 'B';

        switch (grade) {
            case 'A': 
            case 'a':
                System.out.println("우수회원");
                break;
            case 'B': 
             case 'b':
                System.out.println("일반회원");
                break;
            default:
                break;
        }
    }
}

