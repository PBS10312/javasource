package api.util;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {
    public static void main(String[] args) {

        // int 타입을 담고 싶을때
        List<Integer> list = new ArrayList<>();
        // arr[0] = 3;
        // 추가
        list.add(15);
        list.add(1);
        list.add(5);
        list.add(18);
        list.add(30);
        list.add(3, 75);

        System.out.println(list); // [15, 1, 5, 18, 30]

        // 조회하기
        // arr[3] 배열로할때
        System.out.println("특정 위치 요소 조회 " + list.get(3));
        System.out.println("특정 위치 요소 제거 " + list.remove(0));
        System.out.println("특정 요소 제거 " + list.remove(Integer.valueOf(30)));
        System.out.println(list);

    }
}
