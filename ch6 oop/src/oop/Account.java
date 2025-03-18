package oop;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Account {
    // 속성 : 계좌번호(ano), 이름(owner) ,잔액(balance)
    // 1002-249-115633

    // ㅅ생성자 (default,멤버변수 3개 초기화)
    // toString

    private String ano;
    private String owner;
    private long balance;

    // public Account() {
    // }

    // public Account(String ano, String owner, long balance) {
    // this.ano = ano;
    // this.owner = owner;
    // this.balance = balance;
    // }

    // public String getAno() {
    // return ano;
    // }

    // public String getOwner() {
    // return owner;
    // }

    // public long getBalance() {
    // return balance;
    // }

    // // 기능 : 예금하다 +(잔액 = 잔액 +예금액) , 출금하다 - (잔액 = 잔액 -출금액)
    // // deposit , withdraw

    void deposit(long num) {
        this.balance += num;
    }

    void withdraw(long num) {
        // 인출액이 잔액보다 적을때
        if (num > balance)
            return;
        this.balance -= num;
    }

    // @Override
    // public String toString() {
    // return "Account [ano=" + ano + ", owner=" + owner + ", balance=" + balance +
    // "]";
    // }

}
