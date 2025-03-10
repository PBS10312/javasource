package abstractclass;

public abstract class Player {
    // 변수 선언
    // ==============================
    boolean pause;
    int currentPos;
    // ==============================

    // 생성자
    // ==============================
    Player() {
        pause = false;
        currentPos = 0;
    }
    // ==============================

    // 추상 메서드
    // 일반 클래스에서 오버라이딩은 선택이지만 추상 클래스에서는 반드시 오버라이딩 해야함
    abstract void play();

    void pause() {

    }
}

class CDPlayer extends Player {

    @Override
    void play() {
        System.out.println("CD 플레이어");
    }

}

class AudioPlayer extends Player {

    @Override
    void play() {
        System.out.println("Audio 플레이어");
    }

}
