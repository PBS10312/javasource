package api.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringEx4 {
    public static void main(String[] args) {
        StringEx4 obj = new StringEx4();
        String[] names = { "Queen", "Tod", "kim", "Lee", "Choi" };

        // String result = obj.findKim(names);
        // System.out.println(result);

        // List<String> list = Arrays.asList(names);
        // System.out.println("조회 " + list.get(2));

    }

    public String findKim(String[] seoul) {
        // // 반환 : "kim 은 3번 째에 있다"
        // int i = 0;
        // for (; i < seoul.length; i++) {
        // if (seoul[i].equals("Kim")) {
        // break;
        // }
        // }

        // return " Kim 은 " + (i + 1) + " 번째에 있다";

        int i = Arrays.asList(seoul).indexOf("kim");

        return " Kim 은 " + (i + 1) + " 번째에 있다";
    }
}
