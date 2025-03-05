package oop;

public class AccountEx {
    public static void main(String[] args) {
        Account account = new Account("1002-249-115633", "홍길동", 234000);

        // 20만원 입금
        account.deposit(200000);
        System.out.println("현재 잔액 : " + account.balance);

        // 15만원 출금
        account.withdraw(150000);
        System.out.println("현재 잔액 : " + account.balance);

    }
}
