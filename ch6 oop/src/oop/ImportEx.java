package oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import extend.Parent;
import java.util.Scanner;

// Math 안 요소들이 static 이기 떄문에
import static java.lang.Math.*;

public class ImportEx {
    public static void main(String[] args) {
        // import 문은
        // 다른 패키지의 클래스 사용할 떄

        Scanner scanner = new Scanner(System.in);
        Parent parent = new Parent();

        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("오늘 날짜는 : " + sdf.format(date));

        // import 를 사용하지 않는 패키지 (자동으로 import 처리 해줌)
        // java.lang.* <= (lang 패키지에 속한 모든 클래스)

        // Math는 static 메소드로 선언됨
        // System.out.println(Math.min(15, 25));
        System.out.println(min(15, 25));
        // System.out.println(Math.random());
        System.out.println(random());

        // import static java.lang.Math.*;를 선언하면 위에 예제들처럼 Math 생략 가능

        String str;
    }
}
