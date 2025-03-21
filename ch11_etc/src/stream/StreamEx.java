package stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamEx {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("홍길동", "집가고", "싶어요");

        for (String string : list) {

        }

        // Iterator
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
        }
        // Stream
        Stream<String> stream = list.stream();

        // Consumer<String> action; 과 같음
        // forEach(Consumer<? super String> action) : void <<< 이렇게 생김
        stream.forEach(s -> System.out.println(s));
        // stream.forEach(s -> System.out.println(s));// stream has already been
        // operated upon or closed
        // 두번 쓰면 에러남 ㅇㅇ

        List<Student> students = Arrays.asList(
                new Student("홍길동", 90),
                new Student("신철용", 75));

        Stream<Student> stream2 = students.stream();
        stream2.forEach(student -> {
            String name = student.getName();
            int math = student.getMath();
            System.out.println(name + " : " + math);
        });

        students.stream()
                .forEach(stu -> System.out.println(stu));

    }
}
