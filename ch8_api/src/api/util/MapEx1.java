package api.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx1 {
    public static void main(String[] args) {
        // K : String (앞) V : String (뒤)
        Map<String, String> map = new HashMap<>();
        // 여기 k 여기 v
        // 추가
        map.put("di_0111", "홍길동");
        map.put("di_0112", "김길동");
        map.put("di_0113", "박길동");
        map.put("di_0114", "이길동");
        map.put("di_0111", "황길동");

        // key 값 가져오기
        Set<String> set = map.keySet();

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            String value = map.get(key);
            System.out.println(key + ": " + value);
        }
    }
}
