package inter;

public interface RemoteControl {
    // 인터페이스는 상수와 추상 메서드만 가질 수 있다
    // defalut , static 메서드는 가능하다
    // 상수에는 public final static이 자동으로 붙는다 (생략가능)
    // 추상 메서드에는 public abstract가 자동으로 붙는다 (생략가능)

    // 상수
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    // 추상 메서드
    void turnOn();

    void turnOff();

    void setVolume(int volume);

    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음 처리합니다.");
        } else {
            System.out.println("무음 해제합니다.");
        }
    }

    static void changeBattery() {
        System.out.println("건전지를 교환합니다.");
    }

}
