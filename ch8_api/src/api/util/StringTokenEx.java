package api.util;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenEx {
    public static void main(String[] args) {

        String str = "this is a test";
        StringTokenizer st = new StringTokenizer(str); // 구분자가 없다면 공백을 기준으로 분리

        // split() => String[] 로 돌아옴
        System.out.println("String split() " + Arrays.toString(str.split("")));
        // 공백을 넣으면 => 단어별로 구별해줌
        System.out.println("String split() " + Arrays.toString(str.split(" ")));

        // StringTokenizer : String으로 돌아옴

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        System.out.println();

        str = "this/is/a/test";
        st = new StringTokenizer(str, "/");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken() + "\t");
        }
        System.out.println();

        String expression = "x=100*(200+300)/2";
        st = new StringTokenizer(expression, "+-*/=()", true);
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken() + "\t");
        }
        System.out.println();

        String source = "1,김천재,100,100|2,박수재,95,80,90|3,이자바,80,90,90";
        StringTokenizer sr = new StringTokenizer(source);

        // 1
        // 김천재
        // 100
        // 100
        // ---------
        // 2

        // ----- 안넣은 코드
        // sr = new StringTokenizer(source, ",|");
        // while (sr.hasMoreTokens()) {
        // System.out.println(sr.nextToken() + "\t");
        // }
        // System.out.println();

        // --------------- 넣은 코드
        sr = new StringTokenizer(source, "|");
        while (sr.hasMoreTokens()) {

            String token = sr.nextToken(); //

            StringTokenizer sr2 = new StringTokenizer(token, ",");
            while (sr2.hasMoreTokens()) {
                System.out.println(sr2.nextToken());
            }

            System.out.println("----------------");
        }
        System.out.println();
    }
}
