package api.string;

import java.util.Arrays;

public class StringEx3 {
    public static void main(String[] args) {

        String str = "Hello";
        // 문자열 연결 : +
        str += " World";

        System.out.println(str);

        // concat() : 문자열을 뒤에 붙인다.
        String str2 = "안녕하세용";
        str2 = str2.concat(" 반갑읍니다");
        System.out.println(str2);

        // endsWith() , startWith()
        System.out.println("지정된 문자열로 종료 여부 " + str2.endsWith("용"));
        System.out.println("지정된 문자열로 시작 여부 " + str2.startsWith("안"));

        String file = "test . txt";
        // 이미지 파일 : png , gif , jpg
        if (file.endsWith("png") || file.endsWith("jpg") ||
                file.endsWith("gif")) {
            System.out.println("이미지 파일입니다.");
        } else {
            System.out.println("이미지 파일이 아입니다.");

        }

        // replace() , replaceAll() , replaceFirst()
        // replace() : 결과는 새로운 문자열로 반환
        System.out.println("replace(old,new) " + str.replace("Hello", "안녕할까요"));
        System.out.println(str); // Hello World

        // 원본을 못바꾸니 원본 자체를 바꿀려면
        str = str.replace("Hello", "안녕안할래요");
        System.out.println(str); // 안녕안할래요 World

        // 정규식 사용가능 - replaceAll
        System.out.println(str.replaceAll("[a-z]", "1"));
        // ㄴ str 안에 소문자를 찾아서 1로 바꿔죠

        // replaceFirst 바꿔주긴하는데 처음에 걸리는 녀석만 바꿈
        str2 = "Hellollo";
        System.out.println(str2.replaceFirst("ll", "LL"));

        // substring() <- 인덱스로 자를때
        str2 = "java.lnag.Object";
        System.out.println("특정 위치의 문자열 얻기 " + str2.substring(10)); // Object
        // 끝 위치는 포함하지 않음
        System.out.println("특정 위치의 문자열 얻기 " + str2.substring(5, 9));

        // split <- 지정해서 자를때
        str2 = "dog,cat,duck";
        System.out.println("지정한 분리자로 나누어 배열로 반환 " + Arrays.toString(str2.split(",")));
        String[] arr = str2.split(",", 2); // 지정된 숫자만큰 분리
        for (String string : arr) {
            System.out.println(string);
        }

        // 대문자 / 소문자 변경
        str2 = "HEllo";
        System.out.println(str2.toLowerCase());
        System.out.println(str2.toUpperCase());

        // trim() 양쪽 끝에 있는 공백 제거
        // 공백도 문자에 포함 , 만약에 공백없이 같냐고 물어보면 false
        // " Hello" .equals("Hello") => false
        String str3 = "        Hello World      ";
        System.out.println(str3);
        System.out.println(str3.trim());

        // valueOf() : 문자열로 변환
        int i = 5;
        String str4 = String.valueOf(i); // "5"
        str4 = i + ""; // "5"
        // valueOf 쓸래 위에 대로 적을래 는 마음대로
    }
}
