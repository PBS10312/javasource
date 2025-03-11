package shop;

public class MyShopEx {
    public static void main(String[] args) {
        IShop shop = new MyShop();
        // 상성 이름 정하기
        shop.setTitle("다파라");
        // 고객생성
        shop.genUser();
        // 제품생성
        shop.genProduct();
        // 상점 시작
        shop.start();

        shop.productList();

    }
}
