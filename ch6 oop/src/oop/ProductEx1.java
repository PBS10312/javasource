package oop;

import java.time.LocalDate;

public class ProductEx1 {
    public static void main(String[] args) {

        // 인스턴스 생성
        // 생성자를 호출
        Product product1 = new Product();
        // 초기화 작업
        product1.pCode = "SB10312 ";
        product1.pName = "신발";
        product1.price = 139000;
        product1.regiDate = LocalDate.now();

        System.out.println(product1);

    }
}
