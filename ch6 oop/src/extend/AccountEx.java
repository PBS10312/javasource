package extend;

import java.util.Scanner;

public class AccountEx {
    public static void main(String[] args) {

        // CheckingAccount 의 생성자 호출
        // 부모의 인스턴스도 같이 생성됨
        ChekingAccount cAccount = new ChekingAccount("1002-13", "pbs", 1000, "5604");

        System.out.println("계좌번호 : " + cAccount.getAno()); // null
        System.out.println("계좌주 : " + cAccount.getOwner()); // null
        System.out.println("잔액 : " + cAccount.getBalance()); // 0
        System.out.println("체크카드번호 : " + cAccount.getCardNo()); // null

        try {
            System.out.println("현재 잔액 : " + cAccount.pay("5604", 100));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // CreditLineAccount
        CreditLineAccount creditLineAccount = new CreditLineAccount("1002-13", "pbs", 1000, 100000);

        try {
            // creditLineAccount.withdraw(120000);
            creditLineAccount.withdraw(20000);
            System.out.println("현재잔액 : " + creditLineAccount.getBalance());
        } catch (Exception e) {
            e.printStackTrace();

        }
        // BonusPointAccount
        BonusPointAccount bonusPointAccount = new BonusPointAccount("1002-13", "pbs", 1000, 0);
        bonusPointAccount.deposit(10000);
        System.out.println("보너스 포인트 : " + bonusPointAccount.getBonusPoint());

        CheckingTrafficAccount checkingTrafficAccount = new CheckingTrafficAccount("1002-13", "pbs", 10000, "5604",
                false);

        CheckingTrafficAccount checkingTrafficAccount2 = new CheckingTrafficAccount("1002-13", "pbs", 10000, "5604",
                true);

        try {
            System.out.println("교통카드 지불 후 현재 잔액 : " + checkingTrafficAccount2.payTrafficCard("5604", 1000));
            System.out.println("현재 잔액 : " + checkingTrafficAccount.payTrafficCard("5604", 1000));
        } catch (Exception e) {
            e.printStackTrace();

        }

        System.out.println();

    }
}
