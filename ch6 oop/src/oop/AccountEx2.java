package oop;

import java.util.Scanner;

public class AccountEx2 {

    private static Account account;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // 인스턴스 생성
        // AccountEx2 obj = new AccountEx2();

        boolean run = true;
        while (run) {
            System.out.println("=====================================================");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("=====================================================");

            System.out.print("선택 >> ");
            int menu = Integer.parseInt(scanner.nextLine());
            switch (menu) {
                case 1:
                    account = createAccount();
                    break;
                case 2:
                    accountList(account);
                    break;
                case 3:
                    deposit(account);
                    break;
                case 4:
                    withdraw(account);
                    break;
                case 5:
                    run = false;
                    break;

                default:
                    System.out.println("번호 확인");
                    break;
            }
        }

    }

    private static Account createAccount() {
        // new = Account( 계좌 번혼 , 이름 , 금액)
        // 계좌번호
        System.out.print("계좌 번호 : ");
        String ano = scanner.nextLine();
        // 예금주
        System.out.print("예금주 : ");
        String owner = scanner.nextLine();
        // 잔액
        System.out.print("계좌 잔액 : ");
        int balance = Integer.parseInt(scanner.nextLine());

        return new Account(ano, owner, balance);
    }

    private static void accountList(Account account) {
        System.out.println("=======================");
        System.out.println("계좌 목록");
        System.out.println("=======================");

        System.out.printf("%s\t%s\t%d\n", account.getAno(), account.getOwner(), account.getBalance());
    }

    private static void deposit(Account account) {
        // 예금하다
        // 계좌번호 입력받기 => 사용자가 입력한 계좌번호와 account 의 계좌번호가 일치하는지 여부 확인
        System.out.print("계좌 번호 : ");
        String ano = scanner.nextLine();

        if (!ano.equals(account.getAno()))
            return;
        // 예금액 입력받기 => 잔액 = 잔액 + 예금액
        System.out.print("예금액 : ");
        int balance = Integer.parseInt(scanner.nextLine());

        // account.balance = account.getBalance() + balance
        account.deposit(balance);
    }

    private static void withdraw(Account account) {
        System.out.print("계좌 번호 : ");
        String ano = scanner.nextLine();

        if (!ano.equals(account.getAno()))
            return;

        System.out.print("출금액 : ");
        int balance = Integer.parseInt(scanner.nextLine());

        account.withdraw(balance);

    }

    // private static Account findAccount(){

    // }
}
