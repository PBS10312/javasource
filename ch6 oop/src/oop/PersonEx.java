package oop;

public class PersonEx {
    public static void main(String[] args) {
        Person p1 = new Person(); // << 얘는 모든 멤버변수의 setter 메소드 작성 (클래스밖)
        p1.setName("홍길동");
        p1.setPno("123");
        p1.setTel("010-1234-1234");
        System.out.println(p1);

        Person p = new Person(null, null, null);
        Person2 p2 = new Person2(); // << 얘는 해당하는 멤버변수 setter 메소드만 생성(클래스안에 멤버변수 위)
        p2 = new Person2(null);

        Person2 person2 = Person2.builder()
                .pno("4567")
                .name("고길동")
                .tel("010")
                .build();
    }
}
