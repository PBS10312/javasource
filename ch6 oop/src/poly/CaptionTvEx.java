package poly;

public class CaptionTvEx extends Tv2 {
    public static void main(String[] args) {
        // 자식 인스턴스 생성
        // 조상 타입의 참조변수로 자식 인스턴스 참조
        CaptionTv tv2 = new CaptionTv();

        tv2.channel = 10;
        tv2.channelUp();
        System.out.println("현재 채널 : " + tv2.channel);

        // 캐스팅을 통해 자손의 멤버에 접근한다.
        CaptionTv ctv = (CaptionTv) tv2;

        ctv.displayCaption("Hello Java");
        ctv.caption = true;
        ctv.displayCaption("Hello Java");
    }
}
