package exception;

public class ArrayEx {
    public static void main(String[] args) {
        int arr[] = new int[2];

        // try {
        // System.out.println(arr[3]); // ArrayIndexOutOfBoundsException 발생

        // } catch (ArrayIndexOutOfBoundsException e) {
        // System.out.println("배열의 범위를 벗어났습니다.");
        // }
        // ===================================================================
        // 추가 예시
        // 오류가 섞였을 때

        // try {
        // System.out.println(arr[0]); // ArrayIndexOutOfBoundsException 발생

        // int num = 100 / 0; // ArithmeticException 발생
        // } catch (ArrayIndexOutOfBoundsException e) {
        // System.out.println("배열의 범위를 벗어났습니다.");
        // } catch (ArithmeticException e) {
        // System.out.println("0으로 나눌 수 없습니다.");
        // }
        // ===================================================================

        // 추가예시 2
        // Exception 클래스로 모든 예외 처리하기

        try {
            System.out.println(arr[0]); // ArrayIndexOutOfBoundsException 발생
            int num = 100 / 0; // ArithmeticException 발생

        } catch (Exception e) {
            System.out.println("오류가 발생했습니다.");
        }

        // ===================================================================
        // 추가예시 3
        // | 연산자로 여러 예외 처리하기

        try {
            System.out.println(arr[0]); // ArrayIndexOutOfBoundsException 발생
            int num = 100 / 0; // ArithmeticException 발생

        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("오류가 발생했습니다.");
        }
    }

}
