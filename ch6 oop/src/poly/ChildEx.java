package poly;

public class ChildEx {
    public static void main(String[] args) {
        Child child1 = new Child();
        Child parent = new Child(); // < 단 오버라이딩이 되어 있어야함
        // 둘의 접근 범위가 다름

        // child1.method1();
        // child1.method2();
        // child1.method3();

        // parent 접근 범위
        // parent.field1;
        parent.method1(); // parent method1()
        parent.method2(); // Child method2()

        // The method method3() is undefined for the type Parent
        // parent.method3(); ㄴ 접근 범위 오류

        // mehod3 사용
        // 부모 = 자식 (o)
        Child child2 = parent;
        child2.method3();

        // 자식 = 부모 x
        Parent parent2 = new Parent(); // 부모는 자식으로 형변환 할수 없음
        child2 = (Child) parent2;
        child2.method3();

    }
}
