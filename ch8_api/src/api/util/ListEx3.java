package api.util;

import api.object.Person;

import java.util.ArrayList;
import java.util.List;

public class ListEx3 {
    public static void main(String[] args) {
        // Person 객체 리스트로
        List<Person> list = new ArrayList<>();

        list.add(new Person("hong12", "홍길동"));
        list.add(new Person("lee12", "이길동"));
        list.add(new Person("pak12", "박길동"));
        list.add(new Person("kim12", "김길동"));
        list.add(new Person("hwang12", "황길동"));

        for (Person person : list) {
            System.out.println(person); // person.toString() 과 같음
        }

        // 아이디 이름
        // -------------------------
        // hong12 홍길동

        System.out.println("아이디\t 이름");
        System.out.println("--------------------------");
        for (Person person : list) {
            System.out.printf("%s\t%s\n", person.getId(), person.getName());
        }

    }
}
