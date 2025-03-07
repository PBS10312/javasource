package extend;

public class ChekingAccount extends Account {
    // 은행계좌 + 체크카드 의 기능
    private String cardNo;

    // public ChekingAccount() {
    // // super 는 부모의 default 생성자 호출
    // // 부모의 인스턴스도 같이 생성됨
    // super();
    // }

    // public ChekingAccount(String cardNo) {
    // this.cardNo = cardNo;
    // }

    public ChekingAccount(String ano, String owner, long balance, String cardNo) {
        super(ano, owner, balance);
        this.cardNo = cardNo;
    }

    // 비용(체크카드 사용액) 지불
    // 사용한 카드번호와 체크카드 번호 일치 여부 확인
    // 잔액이 사용액 보다는 커야함
    long pay(String cardNo, int amount) throws Exception {
        if (!this.cardNo.equals(cardNo) || getBalance() < amount) {
            throw new Exception("cardNo나 잔액을 확인해 주세요");
        }
        // 비용 지불 : 잔액 = 잔액 - 사용액
        withdraw(amount);
        // 잔액 리턴
        return getBalance();
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardNo() {
        return cardNo;
    }
}
