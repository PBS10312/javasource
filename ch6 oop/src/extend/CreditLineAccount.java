package extend;

public class CreditLineAccount extends Account {

    private int creditLine; // 마이너스 한도

    // CreditLineAccount(){
    // super();
    // }
    // 위 개념은 안써도 자동으로 사용할수 있도록 숨겨짐 = default 값인것
    // ㄴ 부모쪽에서 생성자 디폴트 값을 가져옴 없으면 오류

    public CreditLineAccount(String ano, String owner, long balance, int creditLine) {
        super(ano, owner, balance);
        // TODO Auto-generated constructor stub
        this.creditLine = creditLine;
    }

    // 오버 라이딩
    // 잔액 + 마이너스한도 - 사용액

    @Override
    void withdraw(long num) throws Exception {
        if (super.getBalance() + this.creditLine < num) {
            throw new Exception("한도 범위를 초과합니다.");
        }
        // 잔액 = 잔액 - 사용액
        super.setBalance(super.getBalance() - num);
    }
}
