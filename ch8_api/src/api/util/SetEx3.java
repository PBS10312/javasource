package api.util;

import api.object.Person;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEx3 {
    public static void main(String[] args) {
        // Person 객체 리스트로
        Set<Person> set = new HashSet<>();

        set.add(new Person("hong12", "홍길동"));
        set.add(new Person("lee12", "이길동"));
        set.add(new Person("pak12", "박길동"));
        set.add(new Person("hong12", "홍길동"));
        set.add(new Person("hwang12", "황길동"));

        for (Person person : set) {
            System.out.println(person); // person.toString() 과 같음
        }

        System.out.println((new Person("hong12", "홍길동").hashCode()));
        System.out.println((new Person("hong12", "홍길동").hashCode()));

        // 아이디 이름
        // -------------------------
        // hong12 홍길동

        System.out.println("아이디\t 이름");
        System.out.println("--------------------------");
        for (Person person : set) {
            System.out.printf("%s\t%s\n", person.getId(), person.getName());
        }

    }
}
