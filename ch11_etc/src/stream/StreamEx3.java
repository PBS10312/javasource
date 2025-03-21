package stream;

import java.util.Arrays;
import java.util.List;

public class StreamEx3 {
    public static void main(String[] args) {
        // Member => 남자 멤버의 나이 평균
        List<Member> members = Arrays.asList(
                new Member("홍길동", Member.MALE, 27),
                new Member("또치", Member.FEMALE, 20),
                new Member("고길동", Member.MALE, 45),
                new Member("도우너", Member.MALE, 120));

        int age = 0, count = 0;
        for (Member member : members) {
            if (member.getGender() == Member.MALE) {
                age += member.getAge();
                count++;
            }
        }

        System.out.println("남자 멤버 나이 평균 : " + (age / count));

        // 스트림으로 처리
        // filter(Predicate<Member> predicate)
        double ageAvg = members.stream()
                .filter((member) -> member.getGender() == Member.MALE)
                .mapToInt(Member::getAge)
                .average()
                .getAsDouble();
        System.out.println("남자 멤버 나이 평균 : " + ageAvg);

    }
}
