package loop;

public class ForEx3 {
    public static void main(String[] args) {

        // 1~10까지의 합을 구하라 -> 합계를 담을 변수(아무거나)
        
         int sum = 0;
         for (int i = 1; i < 11; i++) {
             sum += i; // sum = sum + i; 와 같음
         }
         System.out.println("1~10 까지의 합 "+sum);

        // 1~100 까지 수 중에서 3의 배수 출력
       
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0) {
                System.out.print(i +"\t");
            }
        }
        
    }
}
