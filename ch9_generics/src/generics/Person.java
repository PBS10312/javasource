package generics;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + "]";
    }

}

class Worker extends Person {

    public Worker(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}

class Student extends Person {

    public Student(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}

class HighStudent extends Student {

    public HighStudent(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}

class Course<T> {
    private String name;
    private List<T> students;

    public Course(String name, int capacity) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void add(T t) {
        this.students.add(t);
    }

    public String getName() {
        return name;
    }

    public List<T> getStudents() {
        return students;
    }

}

class CourseEx {
    public static void main(String[] args) {
        Course<Person> personCourse = new Course<>("일반인과정", 20);
        personCourse.add(new Person("홍길동"));
        personCourse.add(new Worker("김철수"));
        personCourse.add(new Student("김영희"));
        personCourse.add(new HighStudent("기영"));
        registerCourse(personCourse);

        Course<Worker> WorkerCourse = new Course<>("직장인과정", 20);
        WorkerCourse.add(new Worker("기영"));
        registerCourseWorker(WorkerCourse);
        registerCourse(WorkerCourse);

        Course<Student> studentCourse = new Course<>("학생 과정", 20);
        studentCourse.add(new Student("박길동"));
        registerCourse(WorkerCourse);
        registerCourseStudents(null);

        Course<HighStudent> highCorse = new Course<>("고등학생 과정", 20);
        highCorse.add(new HighStudent("고길동"));
        registerCourse(WorkerCourse);
        registerCourseStudents(null);

    }

    static void registerCourse(Course<?> course) {
        // 모든 과정 등록
        System.out.println(course.getName() + " 수강생 " + course.getStudents());

    }

    static void registerCourseStudents(Course<? extends Student> course) {
        // Students 와 HighStudents 만 등록
        System.out.println(course.getName() + " 수강생 " + course.getStudents());

    }

    static void registerCourseWorker(Course<? super Worker> course) {
        // Worker Person 만 등록
        System.out.println(course.getName() + " 수강생 " + course.getStudents());

    }
}
