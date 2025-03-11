package inter;

public class RemoteControlEx {
    public static void main(String[] args) {
        RemoteControl rc;

        rc = new Television();
        rc.turnOn();
        rc.setVolume(8);
        rc.setMute(true);
        rc.turnOff();

        RemoteControl.changeBattery();

        rc = new Audio();
        rc.turnOn();
        rc.setVolume(8);
        rc.turnOff();

        // 익명 구현 클래스

        rc = new RemoteControl() {

            @Override
            public void turnOn() {

            }

            @Override
            public void turnOff() {

            }

            @Override
            public void setVolume(int volume) {

            }

        };
    }
}
