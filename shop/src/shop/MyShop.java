package shop;

import java.util.Scanner;

public class MyShop implements IShop {

    private String title;
    private User[] users = new User[5];
    // 제품 10개를 담을 수 있는 배열객체 생성
    private Product[] products = new Product[10];
    // cart (제품 저장 가능한 배열)
    private Product[] cart = new Product[10];

    Scanner sc = new Scanner(System.in);
    // start() 에서 선택된 User 보관 변수
    private String selUser;

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void genUser() {
        // 2명의 User 생성 수 배열객체에 담기
        this.users[0] = new User("김철수", PayType.CARD);
        this.users[1] = new User("이영희", PayType.CASH);
    }

    @Override
    public void genProduct() {
        // 5개 제품 생성 후 배열객체에 담기 (tv2개, cellPhone3개)
        products[0] = new Tv("삼성 Tv", 1200000, "4K");
        products[1] = new Tv("LG Tv", 1190000, "4K");
        products[2] = new CellPhone("갤럭시21", 1500000, "LG U+");
        products[3] = new CellPhone("아이폰12", 990000, "KT");
        products[4] = new CellPhone("Z플립", 1000000, "SKT");
    }

    @Override
    public void start() {

        System.out.println(this.title + " : 메인화면 - 계정선택");
        System.out.println("----------------------------------");
        int i = 0;
        for (User user : users) {
            if (user != null) {
                System.out.printf("[%d]. %s(%s)\n", i++, user.getName(), user.getPayType());
            }
        }
        System.out.println("[x]. 종료");
        System.out.println("----------------------------------");
        System.out.print("선택 : "); // 0 or 1 or x

        String input = sc.nextLine();
        switch (input) {
            case "x":
            case "X":
                System.exit(0);
                break;
            case "0":
            case "1":
                // 사용자가 선택한 user 정보 담기 (checkout()메서드 필요)
                selUser = input;
                productList();
                break;

            default:
                System.out.println("잘못된 입력입니다.");
                start();
                break;
        }

    }

    public void productList() {

        System.out.println(this.title + " : 상품목록 - 상품선택");
        System.out.println("----------------------------------");
        int i = 0;
        for (Product product : products) {
            if (product != null) {
                System.out.printf("[%d]", i++);
                product.printDetail();
            }
        }
        System.out.println("[h]메인화면  ");
        System.out.println("[c]체크아웃  ");
        System.out.println("----------------------------------");
        System.out.print("선택 : ");
        // x or X 입력 시 프로그램 종료 (System.exit(0))
        // 0, 1 입력 시 productList() 호출
        // 0~4 입력 시 cart 배열에 제품 담기
        // h or H 입력 시 start() 호출
        String input = sc.nextLine();
        switch (input) {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
                // cart 배열에 선택한 제품 담기
                for (int j = 0; j < cart.length; j++) {
                    if (cart[j] == null) {
                        // 사용자가 선택한 제품 담기
                        cart[j] = products[Integer.parseInt(input)];
                        break;
                    }
                }
                productList();
                break;
            case "h":
            case "H":
                start();
                break;
            case "c":
            case "C":
                checkout();
                break;

            default:
                break;
        }

    }

    public void checkout() {
        System.out.println(this.title + " : " + users[Integer.parseInt(selUser)].getName() + " - 체크아웃");
        System.out.println("----------------------------------");
        int total = 0;
        int i = 0;
        for (Product product : cart) {
            if (product != null) {
                System.out.printf("[%d] %s (%d)\n", i++, product.getPname(), product.getPrice());
                total += (int) (product.getPrice());
            }
        }
        System.out.println("[결제방법] : " + users[Integer.parseInt(selUser)].getPayType());
        System.out.println("[합계] : " + total);
        System.out.println("----------------------------------");
        System.out.println("[p] 이전");
        System.out.println("[q] 종료");
        System.out.print("선택 : ");
        // p 는 productList() 호출, q는 프로그램 종료
        String input = sc.nextLine();
        switch (input) {
            case "p":
            case "P":
                productList();
                break;
            case "q":
            case "Q":
                System.exit(0);
                break;

            default:
                break;
        }
    }

}
