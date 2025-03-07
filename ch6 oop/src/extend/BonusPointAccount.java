package extend;

public class BonusPointAccount extends Account {

    // 예금액 1%의 보너스포인트 지급
    private int bonusPoint;

    public BonusPointAccount(String ano, String owner, long balance, int bonusPoint) {
        super(ano, owner, balance);
        this.bonusPoint = bonusPoint;

    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    @Override
    void deposit(long num) {
        // 예금하다
        // ㄴ 예금하다 메소드를 수정
        super.deposit(num);
        // 보너스포인트 추가
        // 보너스포인트 = 보너스포인트 + (예금액 * 1%)
        bonusPoint += num * 0.01;

    }
}
