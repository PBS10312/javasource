package oop;

public class TimeEx {
    public static void main(String[] args) {
        Time time = new Time();

        // 시 설정
        time.setHour(11);
        // 분
        time.setMinute(13);
        // 초
        time.setSecond(13.2f);

        System.out.println("시 : " + time.getHour());
        System.out.println("분 : " + time.getMinute());
        System.out.println("초 : " + time.getSecond());

    }
}
