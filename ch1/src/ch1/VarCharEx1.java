package ch1;

public class VarCharEx1 {
    public static void main(String[] args) {
        // 문자 : 글자 한대 => 'a', '미'
        // 문자열 : 글자 한개 ~ 여러개 => "미", "a", "abc", "대한민국"," " (공백도 문자)
        
        // 기라는 문자를 ch1에 대입
        char ch1 = '기';

        // ch1의 값을 unicode 변수에 대입
        // int = char (코드로 바뀌지만 약속된 코드숫자로만 바뀐다=> 유니코드)
        int unicode = ch1;
        System.out.println("ch1 = "+ch1);
        System.out.println("unicode = "+unicode); //'기' 문자의 unicode 값 44592 < 약속된숫자




        char ch2 = 'a';

        unicode = ch2;
        
        System.out.println("ch2 = "+ch2);
        System.out.println("unicode = "+unicode); // 97

        char ch3 = 'A';

        unicode = ch3;
        
        System.out.println("ch3 = "+ch3);
        System.out.printf("ch3 = %c\n",ch3);
        System.out.println("unicode = "+unicode); // 65
        // 위에 a A 는 그냥 외워


        

    }
    
}
