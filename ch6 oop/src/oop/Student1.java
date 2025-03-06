package oop;

public class Student1 {
    public static void main(String[] args) {
        // Student 인스턴트를 생성, 사용
        // 인스턴스 생성 시 생성자 사용함

        Student student1 = new Student();
        Student student2 = new Student(1, 5);
        Student student3 = new Student("s991031", "홍길동", 3, 7, "010-1234-4321", "mobilbs1@gmail.com");
        Student student4 = new Student("s1031", "길동", 2, 5, "010-1234-9999", "goHome@gmail.com");

        // sout 은 개발자 확인용
        // System.out.println(student1);
        // System.out.println(student2);
        // System.out.println(student3);
        // System.out.println(student4);

        studentInfo(student3);
        // System.out.println("============================================================");
        // System.out.println("아이디 : " + student3.getStuId());
        // System.out.println("이름 : " + student3.getName());
        // System.out.println("학년 : " + student3.getGrade());
        // System.out.println("반 : " + student3.getClassNum());
        // System.out.println("전화번호 : " + student3.getPhone());
        // System.out.println("이메일 : " + student3.getEmail());
        // System.out.println("============================================================");

        System.out.println();

        studentInfo(student4);
        // System.out.println("============================================================");
        // System.out.println("아이디 : " + student4.getStuId());
        // System.out.println("이름 : " + student4.getName());
        // System.out.println("학년 : " + student4.getGrade());
        // System.out.println("반 : " + student4.getClassNum());
        // System.out.println("전화번호 : " + student4.getPhone());
        // System.out.println("이메일 : " + student4.getEmail());
        // System.out.println("============================================================");

        // 홍길동의 전화번호가 변경
        student3.changeTel("010-4605-8459");
        System.out.println(student3);

    }

    public static void studentInfo(Student student) {
        System.out.println("============================================================");
        System.out.println("아이디 : " + student.getStuId());
        System.out.println("이름 : " + student.getName());
        System.out.println("학년 : " + student.getGrade());
        System.out.println("반 : " + student.getClassNum());
        System.out.println("전화번호 : " + student.getPhone());
        System.out.println("이메일 : " + student.getEmail());
        System.out.println("============================================================");

    }
}
