package oop;

public class GoodsStock {
    // 속성 : code , stockNum (재고수량)
    // 기능 : 재고를 + -
    String code;
    int stockNum;

    // 생성자

    // ()가 비면 defalut 생성자 - 선택사항
    // public GoodsStock() {
    // }

    public GoodsStock(String code, int stockNum) {
        this.code = code;
        this.stockNum = stockNum;
    }

    // 값을 받아야하면 () 안에 변수 넣기
    // 재고 + -
    void subtrackStock(int num) {
        this.stockNum -= num;
    }

    void addStock(int num) {
        this.stockNum += num;
    }

    @Override
    public String toString() {
        return "GoodsStock [code=" + code + ", stockNum=" + stockNum + "]";
    }

}
