package api.util;

import java.util.LinkedList;
import java.util.List;

public class ListEx4 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        list.add("사과");
        list.add("바나나");
        list.add("배");
        list.add("메론");
        list.add("포도");
        list.add("복숭아");
        list.add("자몽");
        list.add("귤");

        for (String string : list) {
            System.out.println(string);
        }
        System.out.println("---------------------");

        System.out.println(list.get(3));
        System.out.println(list.remove(1));
        System.out.println(list.indexOf("자몽"));
    }
}
