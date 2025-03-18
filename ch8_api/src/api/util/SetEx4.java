package api.util;

import java.util.Set;
import java.util.TreeSet;

public class SetEx4 {
    public static void main(String[] args) {
        Set<Integer> lotto2 = new TreeSet<>();

        for (int i = 0; lotto2.size() < 6; i++) {

            int num = (int) (Math.random() * 45) + 1;
            lotto2.add(num);
        }

        System.out.println(lotto2); // [9, 13, 15, 16, 24, 33]

    }
}
