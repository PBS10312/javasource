package api.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEx2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        // 요소 추가
        list.add("사과");
        list.add("바나나");
        list.add("배");
        list.add("메론");
        list.add("포도");
        list.add("복숭아");
        list.add("자몽");
        list.add("귤");

        // 제거
        System.out.println("index를 이용한 제거 " + list.remove(1)); // index로 반환값
        System.out.println("직접 제거 " + list.remove("배")); // object로 반환값

        // for 문 이용하기
        // 배열은 length로 확인
        // 리스트는 size로 확인
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%s\t", list.get(i));
        }
        System.out.println();

        // for each 이용
        for (String string : list) {
            System.out.printf("%s\t", string);
        }
        System.out.println();

        System.out.println("리스트에 특정 단어 포함 여부 " + list.contains("복숭아"));
        System.out.println("리스트에 특정 단어 포함 위치 " + list.indexOf("귤"));

        // int[] arr = {}
        // 배열을 리스트로 변환 (조회용)
        // Arrays : 배열에 필요한 유용한 메소드를 제공해줌
        String strArr[] = { "사과", "배", "포도", "복숭아", " 귤", "수박", "한라봉" };
        List<String> list2 = Arrays.asList(strArr);
        // 배열과 리스트는 배열구조가 같으니
        System.out.println("조회 " + list2.get(3));

        // UnsupportedOperationException
        // System.out.println("삭제 " + list2.remove(3));
        // list2.add("딸기");

        // 배열을 리스트로 변환하는데 조회 및 변경 까지 하고싶을때
        List<String> list3 = new ArrayList<>(Arrays.asList(strArr));
        list3.add("딸기");
        list3.remove(3);

        // 리스트에서 배열로 변환
        Object[] arrs = list3.toArray();
        System.out.println(Arrays.toString(arrs));

    }
}
