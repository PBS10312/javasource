package exception;

public class CheckedEx1 {
    public static void main(String[] args) {
        try {
            Class.forName(""); // ClassNotFound Exception 발생
        } catch (ClassNotFoundException e) {
            e.printStackTrace(); // < 오류가 발생하면 어느 코드가 문제인지 확인하기 위해 사용 (개발자용)
        }
    }
}
