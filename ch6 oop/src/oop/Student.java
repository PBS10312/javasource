package oop;

public class Student {
    // 멤버 변수, 멤버 메소드, 생성자,

    // 속성 : 학번(s10312),이름(박병선),학년(2),반(7),전화번호(010-3456-1234),이메일(mobilk@naver.com)
    private String stuId;
    private String name;
    private int grade;
    private int classNum;
    private String phone;
    private String email;

    // 생성자 : 개발자가 명시하지 않으면 컴파일러가 자동으로 default 생성자 만들어 줌
    // 클래스명 (){}
    // 기본 생성자
    // 괄호안에 갯수가 달라야 연속으로 사용가능?
    public Student() { // < 얘가 defalut 생성자
    }

    // 생성자 목적
    // 1) 멤버 변수의 초기화
    public Student(String stuId, String name, int grade, int classNum, String phone, String email) {
        this.stuId = stuId;
        this.name = name;
        this.grade = grade;
        this.classNum = classNum;
        this.phone = phone;
        this.email = email;
    }

    // int grade, int classNum - 지역변수 (전달인자)
    public Student(int grade, int classNum) {
        this.grade = grade;
        this.classNum = classNum;
    }

    public String getStuId() {
        return stuId;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getClassNum() {
        return classNum;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    // 기능 : 전화번호를 변경한다, 이메일을 변경한다,학년을 변경, 반을 변경
    // 메소드 : 리턴타입(void) 메소드명(){}
    // 리턴(반환) 타입 : 기본타입(정수형,불린형,문자형,실수), 객체(대문자로 시작), 배열, void(리턴타입 없음)
    void changeTel(String phone) {
        // this : 멤버변수 앞 , 멤버 메소드 앞 에서만
        this.phone = phone;
    }

    void changeEmail(String email) {
        this.email = email;
    }

    void changeGrade(int grade) {
        this.grade = grade;
    }

    void changeClassNum(int claasNum) {
        this.classNum = claasNum;
    }

    @Override
    public String toString() {
        return "Student [stuId=" + stuId + ", name=" + name + ", grade=" + grade + ", classNum=" + classNum + ", phone="
                + phone + ", email=" + email + "]";
    }

}
