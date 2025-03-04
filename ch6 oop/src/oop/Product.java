package oop;

import java.time.LocalDate;

public class Product {
    // 속성
    // 제품번호(BS10312) , 제품명(옷) ,가격(99000),제조년일(2025-2-09)
    String pCode;
    String pName;
    int price;
    LocalDate regiDate;

    // 생성자 : 개발자가 명시하지 않으면 컴파일러가 자동으로 default 생성자 만들어 줌
    // Product(){} < 자동 만듬

    // 기능 - 가격변경

    void changePrice() {

    }

    @Override
    public String toString() {
        return "Product [pCode=" + pCode + ", pName=" + pName + ", price=" + price + ", regiDate=" + regiDate + "]";
    }

}
