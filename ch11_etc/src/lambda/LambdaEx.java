package lambda;

public class LambdaEx {
    public static void main(String[] args) {
        // Lambda2 를 사용
        // 구현클래스 만들기 : class LambdaImp implemets Lambda2

        // 익명구현객체 만들기
        // Lambda2 obj = new Lambda2() {
        // @Override
        // public void method() {

        // }
        // };

        // 람다식으로 사용
        Lambda2 obj = () -> System.out.println("함수적 인터페이스 사용");
        obj.method();

        obj = () -> {
            int i = 100;
            System.out.println(i = i);
        };
        obj.method();

        Lambda3 lambda3 = (a, b) -> a > b ? a : b;
        System.out.println("max " + lambda3.max(5, 3));

    }
}
