package api.util;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("사과");
        queue.offer("바나나");
        queue.offer("딸기");
        queue.offer("포도");
        queue.offer("귤");

        while (!queue.isEmpty()) {
            // 처음 입력한 값부터 나오는지 확인
            System.out.println(queue.poll());
        }
    }
}
