package api.wrapper;

public class WrapperEx1 {
    public static void main(String[] args) {
        Integer i = 10;

        System.out.println("String 숫자 => int " + Integer.parseInt("10"));
        System.out.println("int 숫자 => String " + i.toString());
        System.out.println("(5,8) " + Integer.max(5, 8)); // 비교 (큰수)
        System.out.println("(5,8) " + Integer.min(5, 8)); // 비교 (작은수)

        // 알아서 형 변환
        // int == Integer
        // Integer == int

    }
}
