package op;

// 비교연산자 : 결과는 true or false
// 대소비교 : <, >, <=, >=
// 등가비교 : ==(equal), !=(not equal)

// /t (tap) 탭을 눌러달라는 뜻
// %b (boolean 값 출력)
// 두 변수의 타입이 다른 경우 타입을 맞춘 후 비교

// 문자열은 " " : "a", "abc" 
public class CompareEx3 {
    public static void main(String[] args) {
        // 변수선언 : 기본타입
        // 문자열은 기본타입으로  선언하지 않는다. 객체타입으로 선언
        // 대문자로 시작하면 객체타입
        String str1 = "abc"; // str1(str2)을 저장하는 공간과 str3을 저장하는 공간이 다름
        String str2 = "abc";
        String str3 = new String("abc"); // 객체타입

        // str1(str2)는 스트링pool에 저장
        // (new)str3은 heap에 저장

        // str1(str2)을 저장하는 공간과 str3을 저장하는 공간이 다름
        // 같은 공간에서 저장된 문자열 비교시 == 을 사용하면 ture < 값만 비교
        // 다른 공간에서 저장된 문자열 비교시 == 을 사용하면 false < 주소를 비교
        
        System.out.printf("str1 == str2 = %b\n",(str1 == str2)); // true
        System.out.printf("str1 == str3 = %b\n",(str1 == str3)); // false
        // 문자열 비교 == 대신에, equals(), equalsIgnoreCase() 사용
        // abc == ABC : false지만 equalsIgnoreCase() 사용 하면 true
        // 애초에 자바는 대소문자를 구별
        System.out.printf("str1.equals(str3) = %b\n",(str1.equals(str3))); // true
        System.out.printf("str1.equals(ABC) = %b\n",(str1.equals("ABC"))); // false
        System.out.printf("str1.equalsIgnoreCase(str3) = %b\n",(str1.equalsIgnoreCase(str3))); // true
        System.out.printf("str1.equalsIgnoreCase(str3) = %b\n",(str1.equalsIgnoreCase("ABC"))); //true

        

    }
}
