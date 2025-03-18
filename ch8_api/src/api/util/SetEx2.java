package api.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEx2 {
    public static void main(String[] args) {

        List<Integer> lotto1 = new ArrayList<>();

        // 6개의 숫자 무작위
        for (int i = 0; i < 6; i++) {
            // 로또번호 1 ~ 45
            int num = (int) (Math.random() * 45) + 1;
            lotto1.add(num);
        }

        System.out.println(lotto1);
        // ===================================================================================
        // set 이용해서 중복 빼기
        Set<Integer> lotto2 = new HashSet<>();

        for (int i = 0; lotto2.size() < 6; i++) {

            int num = (int) (Math.random() * 45) + 1;
            lotto2.add(num);
        }

        System.out.println(lotto2);

        // Set에서 List로 변경
        List<Integer> list = new ArrayList<>(lotto2);
        list.sort(Comparator.reverseOrder()); // 내림차순
        list.sort(Comparator.naturalOrder()); // 오름차순

        System.out.println(list);

    }
}
