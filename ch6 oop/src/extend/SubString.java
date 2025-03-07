package extend;

// 오버라이딩
// 조건
// ㄴ 이름이 같아야함
// ㄴ 매개변수가 같아야함
// ㄴ 반환 타입이 같아야함

// 재정의 : 부모가 정의해 주는 내용을 자식에 맞춰서 변경하는 개념

// 오버로딩(over loading) || 오버라이딩(over riding)
// 오버라이딩은 상속에서만 나오고 상속받은 메서드의 내용을 변경하는 것
// 오버로딩은 클래스 하나에서만 나오고 동일한 메서드를 여러개 정의하는 것

public class SubString extends ListString {
    String name = "성춘향";

    @Override
    public void list() {
        // TODO Auto-generated method stub
        super.list();
        System.out.println(name + " 하위 클래스 이름");
    }

    public void print() {
        list(); // super 없이 부르면 본인(자식)이 우선 순위
        super.list(); // < 공통될 때 부모의 메서드를 호출하고싶다면 super
        exec(); // < 자식이 생성하지 않았다면 부모의것으로 호출,super 붙여도 o

    }

}
