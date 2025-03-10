package inter;

public interface PlayingCard {

    // 멤버변수 가질 수 없음
    // boolean pause;

    // 일반메서드 가질 수 없음
    // void pause(){}

    // 상수는 가질 수 있음 (상수 대문자로 선언)
    public static final int SPADE = 4;
    // public static final 생략 가능
    int CLOVER = 1;

    // public abstract 생략 가능
    // 추상메서드만 가질 수 있음
    void pause();

    // static , default 가 붙는다면 일반 메서드처럼 사용 가능
    static void display() {

    }

    default void print() {

    }
}
