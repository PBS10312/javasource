package oop;

public class Student1 {
    public static void main(String[] args) {
        // Student 인스턴트를 생성, 사용
        // 인스턴스 생성 시 생성자 사용함

        Student student1 = new Student();
        Student student2 = new Student(1, 5);
        Student student3 = new Student("s991031", "홍길동", 3, 7, "010-1234-4321", "mobilbs1@gmail.com");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        // 홍길동의 전화번호가 변경
        student3.changeTel("010-4605-8459");
        System.out.println(student3);
    }
}
