package oop;

public class GoodsStockEx {
    public static void main(String[] args) {
        // new GoodsStock() : defalut 생성자를 호출하면서 인스턴스 생성
        // GoodsStock goodsStock = new GoodsStock();

        // goodsStock.code = "p1013";
        // goodsStock.stockNum = 50;

        // 매게 생성자가 있을때
        GoodsStock goodsStock = new GoodsStock("p1013", 50);

        System.out.println(goodsStock);

        // 판매 -5
        goodsStock.subtrackStock(5);
        // 현재 재고수량 확인
        System.out.println(goodsStock);

        // 제품 입고 10
        goodsStock.addStock(10);
        System.out.println(goodsStock);

    }
}
