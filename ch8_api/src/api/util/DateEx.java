package api.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d); // Thu Mar 13 13:03:02 KST 2025

        // 보기 좋은 형태로 바꿀때

        // yyyy 년도 4자리 , yy 년도 2자리
        // MM 월 2자리
        // dd 일수 2자리
        // hh 시 , mm 분 , ss 초
        // a : AM/PM
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(d)); // 2025-03-13

        sdf = new SimpleDateFormat("yyyy-MM-dd , hh:mm:ss");
        System.out.println(sdf.format(d)); // 2025-03-13 , 01:10:22

        sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
        System.out.println(sdf.format(d)); // 2025-03-13 오후 01:11:19

        sdf = new SimpleDateFormat("yyyy-MM-dd E hh:mm:ss");
        System.out.println(sdf.format(d)); // 2025-03-13 목 01:11:19
    }
}
