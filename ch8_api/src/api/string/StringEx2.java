package api.string;

import java.util.Arrays;

public class StringEx2 {
    public static void main(String[] args) {
        String str = "안녕하세여";

        // 문자열 길이 알고싶다
        System.out.println("문자열 길이 : " + str.length());
        System.out.println("지정된 위치에 있는 문자 반환 " + str.charAt(4));

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }

        // char 배열로 변환 ['안','녕']
        // char[] c = new char[5];
        char[] c = new char[str.length()];
        // c[0] = str.charAt(0);
        // c[1] = str.charAt(1);
        // c[2] = str.charAt(2);
        // c[3] = str.charAt(3);
        // c[4] = str.charAt(4);
        for (int i = 0; i < c.length; i++) {
            c[i] = str.charAt(i);
        }

        System.out.println("c " + Arrays.toString(c));

        // String => char 배열로
        char[] result = str.toCharArray();

        // 존재하면 인덱스 반환 / 존재하지않으면 -1
        System.out.println("주어진 문자가 문자열에 존재 여부 " + str.indexOf("안")); // 0
        System.out.println("주어진 문자가 문자열에 존재 여부 " + str.indexOf("반")); // -1

        System.out.println("주어진 문자가 문자열에 존재 여부 " + str.contains("안"));

        String subject = "자바의 정석";
        // 자바라는 문자가 포함되어 있으면 자바와 관련 있는 책 입니다.
        // 자바라는 문자가 없으면 자바와 관련 없는 책 입니다.
        System.out.println(subject.indexOf("자바"));
        if (subject.indexOf("자바") >= 0) {
            System.out.println("자바와 관련 있는 책 입니다");
        } else {
            System.out.println("자바와 관련 없는 책 입니다");

        }

        if (subject.contains("자바")) { // 참 거짓으로 나타낼꺼면 contains
            System.out.println("자바와 관련 있는 책 입니다");
        } else {
            System.out.println("자바와 관련 없는 책 입니다");

        }

        // 찾기 시작하는 위치 지정 가능
        System.out.println("찾는 시작위치 지정 " + str.indexOf("하", 4));
        System.out.println("문자열의 오른쪽 끝부터 찾기 " + str.lastIndexOf("하"));

        String str2 = "java.lang.String";
        System.out.println(str2.indexOf(".")); // 왼쪽부터
        System.out.println(str2.indexOf(".", 5)); // 왼쪽 5번째 부터
        System.out.println(str2.lastIndexOf(".")); // 뒤쪽에서 앞쪽으로 위치를 셈
    }

}
