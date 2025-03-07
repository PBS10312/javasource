package extend;

public class SubStringEx {
    public static void main(String[] args) {
        SubString obj = new SubString(); // 1) 상위 인스턴스 생성 (부모) , 2) 자식 인스턴스 생성
        // 자식으로 인스턴스시 인스턴스한것 우선 = 본인께 우선

        System.out.println("이름 " + obj.name);
        obj.list(); // 홍길동상위 클래스 이름
                    // 위에 값 말고 성춘향 하위 클래스 이름을 출력하고 싶다면??
                    // ㄴ 하위 클래스에서 오버라이드를 한 뒤 super를 막고 출력한다
                    // ㄴ 다시 부모의 이름을 출력하고 싶다면 super을 열것
    }
}
